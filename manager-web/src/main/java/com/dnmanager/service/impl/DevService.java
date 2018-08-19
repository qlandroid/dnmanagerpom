package com.dnmanager.service.impl;

import com.dnmanager.HaltException;
import com.dnmanager.bean.DevDetails;
import com.dnmanager.bean.PowerRecordExt;
import com.dnmanager.bean.TotalE;
import com.dnmanager.bean.WarnMain;
import com.dnmanager.dao.*;
import com.dnmanager.pojo.Device;
import com.dnmanager.pojo.UserDevice;
import com.dnmanager.pojo.UserDeviceExample;
import com.dnmanager.pojo.Warn;
import com.dnmanager.select.WarnSelect;
import com.dnmanager.service.IDevService;
import com.dnmanager.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Service("devService")
public class DevService implements IDevService {

    @Autowired
    DeviceMapper deviceMapper;
    @Autowired
    UserDeviceMapper userDeviceMapper;
    @Autowired
    DeviceExtMapper deviceExtMapper;

    @Autowired
    PowerRecordMapper powerRecordMapper;
    @Autowired
    PowerRecordExtMapper powerRecordExtMapper;
    @Autowired
    WarnExtMapper warnExtMapper;


    @Override
    public List<Device> getDevListByUserId(Integer userId) {
        List<Device> devices = deviceExtMapper.selectDevListByUserId(userId, null);
        return devices;
    }

    @Override
    public Device getDevByDevId(Integer userId, Integer devId) {
        checkUserHasDev(devId, userId);
        Device device = deviceMapper.selectByPrimaryKey(devId);
        return device;
    }

    @Override
    public DevDetails getDevDetails(Integer userId, Integer devId) {
        checkUserHasDev(devId, userId);

        DevDetails devDetails = new DevDetails();

        Device device = deviceMapper.selectByPrimaryKey(devId);
        devDetails.setDevO(device);

        //获得总量
        Calendar s = Calendar.getInstance();
        PowerRecordExt e = new PowerRecordExt();
        e.setId(devId);
        Long powerRecordSum = powerRecordExtMapper.getPowerRecordSum(e);
        TotalE totalE = new TotalE();
        totalE.setTotalE(powerRecordSum);
        devDetails.setTotalE(totalE);

        //获得当前月的总量
        int month = s.get(Calendar.MONTH);
        int year = s.get(Calendar.YEAR);
        DateUtils.DateTime startAndEndTimeByMonth = DateUtils.getStartAndEndTimeByMonth(year, month);
        e.setStartD(startAndEndTimeByMonth.startT);
        e.setEndD(startAndEndTimeByMonth.endT);
        Long recordByMonth = powerRecordExtMapper.getPowerRecordSum(e);
        TotalE monthE = new TotalE();
        monthE.setMonth(month + 1);
        monthE.setTotalE(recordByMonth);
        monthE.setYear(year);
        devDetails.setMonthE(monthE);

        //获得年度总量
        DateUtils.DateTime startAndEndTimeByYear = DateUtils.getStartAndEndTimeByYear(year);
        e.setStartD(startAndEndTimeByYear.startT);
        e.setEndD(startAndEndTimeByYear.endT);
        Long recordByYear = powerRecordExtMapper.getPowerRecordSum(e);
        TotalE yearE = new TotalE();
        yearE.setTotalE(recordByYear);
        yearE.setYear(year);
        devDetails.setYearE(yearE);

        devDetails.setBindDate(device.getTime());

        //获得权限
        UserDeviceExample u = new UserDeviceExample();
        UserDeviceExample.Criteria criteria = u.createCriteria();
        criteria.andUsersIdEqualTo(userId);
        criteria.andDeviceIdEqualTo(devId);
        List<UserDevice> userDevices = userDeviceMapper.selectByExample(u);
        UserDevice userDevice = userDevices.get(0);
        Integer status = userDevice.getStatus();
        if (status == null) {
            status = 0;
        }
        devDetails.setPower(status + "");
        //获得单价
        // TODO: 2018/8/18 电量表未获得
//        devDetails.setUnit();

        //获得剩余金额
        Integer buyElectric = device.getBuyElectric();
        Integer electric = device.getElectric();
        if (buyElectric == null) {
            buyElectric = 0;
        }
        if (electric == null) {
            electric = 0;
        }
        devDetails.setBuyElectric(buyElectric - electric);


        return devDetails;
    }

    @Override
    public void setDevNickName(Integer userId, Integer devId, String devName) {
        checkUserHasDev(devId, userId);

        Device devUpdate = new Device();
        devUpdate.setId(devId);
        devUpdate.setNickname(devName);
        int i = deviceMapper.updateByPrimaryKey(devUpdate);
    }

    @Override
    public void setDevRunStatus(Integer userId, Integer devId, Integer runStatus) {
        checkUserHasDev(devId, userId);
        if (runStatus != null && runStatus != 0 && runStatus != 1) {
            throw new HaltException("设置运行状态错误");
        }
        Device d = new Device();
        d.setId(devId);

        d.setdStatus(runStatus.shortValue());
        deviceMapper.updateByPrimaryKey(d);
    }

    @Override
    public WarnMain warnByMain(Integer userId) {
        WarnMain main = new WarnMain();
        List<Device> devices = deviceExtMapper.selectDevListByUserId(userId, null);
        if (devices == null || devices.size() == 0) {
            main.setIsHasDev(WarnMain.DEV_NO_HAS);
            return main;
        }
        main.setIsHasDev(WarnMain.DEV_HAS);

        WarnSelect warnSelect = new WarnSelect();
        Calendar c = Calendar.getInstance();
        long timeInMillis = c.getTimeInMillis() / 1000;
        warnSelect.setEndDate(timeInMillis);
        c.add(Calendar.DAY_OF_YEAR, -15);
        warnSelect.setStartDate(c.getTimeInMillis() / 1000);
        warnSelect.setUserId(userId);
        List<Warn> warns = warnExtMapper.selectWarnAllByUserId(warnSelect);
        if (warns.size() == 0) {
            return main;
        }

        for (Warn warn : warns) {
            Device device = deviceMapper.selectByPrimaryKey(warn.getDeviceId());
            warn.setDevice(device);
        }


        main.setWarnList(warns);


        return main;

    }


    public void checkUserHasDev(Integer devId, Integer userId) {
        Device device = deviceMapper.selectByPrimaryKey(devId);
        if (device == null) {
            throw new HaltException("未找到指定设备");
        }

        List<Device> devices = deviceExtMapper.selectDevListByUserId(userId, devId);
        if (devices == null || devices.size() == 0) {
            throw new HaltException("设备不属于当前用户，请重新操作");
        }
    }

}
