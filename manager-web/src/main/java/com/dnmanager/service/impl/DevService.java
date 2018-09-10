package com.dnmanager.service.impl;

import com.dnmanager.HaltException;
import com.dnmanager.base.ErrorCode;
import com.dnmanager.bean.*;
import com.dnmanager.dao.*;
import com.dnmanager.pojo.*;
import com.dnmanager.select.WarnSelect;
import com.dnmanager.service.IDevService;
import com.dnmanager.utils.DateUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mysql.jdbc.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("devService")
public class DevService implements IDevService {

    Logger logger = LoggerFactory.getLogger(DevService.class);

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
    @Autowired
    TransactionMapper transactionMapper;

    @Autowired
    UserDeviceExtMapper userDeviceExtMapper;
    @Autowired
    OperatorMapper operatorMapper;

    @Autowired
    VipMapper vipMapper;
    @Autowired
    VipUnitPriceMapper vipUnitPriceMapper;
    @Autowired
    EleUnitPriceMapper eleUnitPriceMapper;


    @Override
    public List<Device> getDevListByUserId(Integer userId, String devCode) {
        if (!StringUtils.isNullOrEmpty(devCode)) {
            devCode = "%" + devCode + "%";
        } else {
            devCode = null;
        }
        List<Device> devices = deviceExtMapper.selectDevListByUserId(userId, null, devCode);

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
        logger.debug("开始查询");
        //获得总量
        Calendar s = Calendar.getInstance();
        PowerRecordExt e = new PowerRecordExt();
        e.setId(devId);
        Long powerRecordSum = powerRecordExtMapper.getPowerRecordSum(e);
        TotalE totalE = new TotalE();

        totalE.setTotalE(powerRecordSum);
        devDetails.setTotalE(totalE);
        logger.debug("获得总量成功");
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
        logger.debug("获得当前月的总量");

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
        logger.debug("获得年度总量");

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
        PriceBean price = getPrice();
        devDetails.setUnit(price.getEleUnit());

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
        logger.debug("完成");

        return devDetails;
    }

    @Override
    public void setDevNickName(Integer userId, Integer devId, String devName) {
        checkUserHasDev(devId, userId);

        Device devUpdate = new Device();
        devUpdate.setId(devId);
        devUpdate.setNickname(devName);

        int i = deviceMapper.updateByPrimaryKeySelective(devUpdate);
    }

    @Override
    public void setDevRunStatus(Integer userId, Integer devId, Integer runStatus) {
        checkUserHasDev(devId, userId);
        if (runStatus != null && runStatus != 0 && runStatus != 1) {
            throw new HaltException("设置运行状态错误");
        }


        VipExample v = new VipExample();
        VipExample.Criteria criteria = v.createCriteria();
        criteria.andUserIdEqualTo(userId)
                .andDeviceIdEqualTo(devId)
                .andEndTimeGreaterThan(new Date(System.currentTimeMillis()));
        List<Vip> vips = vipMapper.selectByExample(v);
        if (vips.size() == 0) {
            throw new HaltException(ErrorCode.ERROR_NO_VIP, "未成为当前设备的会员");
        }


        Device d = new Device();
        d.setId(devId);

        d.setdStatus(runStatus.shortValue());
        deviceMapper.updateByPrimaryKeySelective(d);
    }

    @Override
    public WarnMain warnByMain(Integer userId) {
        WarnMain main = new WarnMain();
        List<Device> devices = deviceExtMapper.selectDevListByUserId(userId, null, null);
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

    @Override
    public Page warnListByUserId(Integer userId, Integer index, Integer pageSize) {
        if (index <= 0) {
            index = 1;
        }
        if (pageSize <= 0) {
            pageSize = 20;
        }

        Page page = PageHelper.startPage(index, pageSize, "wtime DESC");

        WarnSelect s = new WarnSelect();
        s.setUserId(userId);
        List<Warn> warns = warnExtMapper.selectWarnAllByUserId(s);

        for (Object o : page.getResult()) {
            if (o instanceof Warn) {
                Warn w = (Warn) o;
                Device device = deviceMapper.selectByPrimaryKey(w.getDeviceId());
                w.setDevice(device);
            }
        }
        return page;
    }

    @Override
    public Page getTransaction(Integer userId, Integer devId, Integer index, Integer pageSize) {
        TransactionExample t = new TransactionExample();
        TransactionExample.Criteria criteria = t.createCriteria();
        criteria.andUserIdEqualTo(userId);
        if (devId != null) {
            Device device = deviceMapper.selectByPrimaryKey(devId);
            if (device == null) {
                throw new HaltException("未找到该设备");
            }
            criteria.andCodeEqualTo(device.getCode());

        }
        Page page = PageHelper.startPage(index, pageSize, "create_time DESC");
        transactionMapper.selectByExample(t);
        return page;
    }

    @Override
    public List selectStopDevByUserId(Integer userId, String type) {

        List<Device> devices = deviceExtMapper.selectDevListByUserId(userId, null, null);

        List<Warn> list = new ArrayList<>();
        for (Device device : devices) {
            Integer buyElectric = device.getBuyElectric();
            Integer electric = device.getElectric();

            int i = buyElectric - electric;//剩余电量


            String warn;
            if (i <= 0 && "0".equals(type)) {
                warn = "购买电量已用完，请充值!";
            } else if (i > 0 && i < 100 && "1".equals(type)) {
                warn = "当前电量已不足100度，请及时充值!!!";
            } else {
                continue;
            }

            Warn w = new Warn();
            w.setDevice(device);
            w.setCode(device.getCode());
            w.setWarn(warn);
            list.add(w);
        }
        return list;
    }

    @Override
    public List selectUseEleOfYearByDevId(Integer userId, Integer devId) {

        checkUserHasDev(devId, userId);


        PowerRecordExt p = new PowerRecordExt();

        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        c.clear();
        List<Map<String, Object>> list = new ArrayList<>();
        for (int i1 = 0; i1 < 10; i1++) {
            c.set(year, 0, 1);
            long startT = c.getTimeInMillis();
            c.clear();
            c.set(year + 1, 0, 1);
            long endT = c.getTimeInMillis() - 1;
            p.setEndD(endT);

            p.setStartD(startT);
            Long powerRecordSum = powerRecordExtMapper.getPowerRecordSum(p);
            Map<String, Object> map = new HashMap<>();
            if (powerRecordSum == null) {
                powerRecordSum = 0l;
            }
            map.put("year", year);
            map.put("totalE", powerRecordSum);
            list.add(map);
            year = year - 1;
        }


        return list;
    }

    @Override
    public List selectUseEleOfMonthByDevId(Integer userId, Integer devId, Integer year, Integer month) {

        checkUserHasDev(devId, userId);


        PowerRecordExt p = new PowerRecordExt();

        Calendar c = Calendar.getInstance();
        c.clear();
        List<Map<String, Object>> list = new ArrayList<>();
        c.set(year, month - 1, 1);
        long startT = c.getTimeInMillis();
        c.set(year, month, 1);
        long stopP = c.getTimeInMillis() - 1;
        long endT = -1;

        int day = 1;
        while (endT < stopP) {

            c.set(year, month - 1, day + 1);
            long timeInMillis = c.getTimeInMillis();
            endT = timeInMillis - 1;

            p.setEndD(endT);

            p.setStartD(startT);
            Long powerRecordSum = powerRecordExtMapper.getPowerRecordSum(p);
            if (powerRecordSum == null) {
                powerRecordSum = 0l;
            }
            Map<String, Object> map = new HashMap<>();

            map.put("day", day);
            map.put("totalE", powerRecordSum);
            list.add(map);
            day++;
            startT = timeInMillis;
        }
        return list;
    }

    @Override
    public Device selectDevByCode(String devCode) {
        DeviceExample e = new DeviceExample();
        DeviceExample.Criteria criteria = e.createCriteria();
        criteria.andCodeEqualTo(devCode);
        List<Device> devices = deviceMapper.selectByExample(e);
        if (devices == null || devices.size() == 0) {
            throw new HaltException(ErrorCode.ERROR_NOT_FIND, "没有查询到啊!!!");
        }
        return devices.get(0);
    }

    @Override
    public Integer checkVip(Integer userId, Integer devId) {

        VipExample v = new VipExample();
        VipExample.Criteria criteria = v.createCriteria();
        criteria.andUserIdEqualTo(userId)
                .andDeviceIdEqualTo(devId)
                .andEndTimeGreaterThan(new Date(System.currentTimeMillis()));
        List<Vip> vips = vipMapper.selectByExample(v);
        if (vips.size() == 0) {
            throw new HaltException(ErrorCode.ERROR_NO_VIP, "未成为当前设备的会员");
        }
        return 1;
    }

    @Override
    public Integer getDevCountByUserId(Integer id) {
        UserDeviceExample e = new UserDeviceExample();
        UserDeviceExample.Criteria criteria = e.createCriteria();
        criteria.andUsersIdEqualTo(id);
        List<UserDevice> userDevices = userDeviceMapper.selectByExample(e);
        return userDevices.size();
    }

    @Override
    public PriceBean getPrice() {
        PriceBean bean = new PriceBean();

        EleUnitPriceExample o = new EleUnitPriceExample();
        o.setOrderByClause("id DESC");
        List<EleUnitPrice> eleUnitPrices = eleUnitPriceMapper.selectByExample(o);
        if (eleUnitPrices.size() > 0) {
            EleUnitPrice eleUnitPrice = eleUnitPrices.get(0);
            bean.setEleUnit(eleUnitPrice.getEleUnitPrice());
        } else {
            bean.setEleUnit(10);
        }


        VipUnitPriceExample v = new VipUnitPriceExample();
        v.setOrderByClause("id DESC");
        List<VipUnitPrice> vipUnitPrices = vipUnitPriceMapper.selectByExample(v);
        if (vipUnitPrices.size() > 0) {
            VipUnitPrice vipUnitPrice = vipUnitPrices.get(0);
            bean.setVipUnit(vipUnitPrice.getVipUnitPrice());
        } else {
            bean.setVipUnit(500);
        }

        return bean;
    }


    public void checkUserHasDev(Integer devId, Integer userId) {
        Device device = deviceMapper.selectByPrimaryKey(devId);
        if (device == null) {
            throw new HaltException(ErrorCode.ERROR_NOT_FIND, "未找到指定设备");
        }

        List<Device> devices = deviceExtMapper.selectDevListByUserId(userId, devId, null);
        if (devices == null || devices.size() == 0) {
            throw new HaltException(ErrorCode.ERROR_UN_BIND, "设备不属于当前用户，请重新操作");
        }
    }

}
