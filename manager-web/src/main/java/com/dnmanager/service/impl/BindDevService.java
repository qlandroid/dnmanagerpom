package com.dnmanager.service.impl;

import com.dnmanager.HaltException;
import com.dnmanager.base.ErrorCode;
import com.dnmanager.dao.DeviceMapper;
import com.dnmanager.dao.TransactionMapper;
import com.dnmanager.dao.UserDeviceMapper;
import com.dnmanager.dao.VipMapper;
import com.dnmanager.pojo.*;
import com.dnmanager.service.IBindService;
import org.apache.poi.hssf.record.PageBreakRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class BindDevService implements IBindService {

    @Autowired
    UserDeviceMapper userDeviceMapper;

    @Autowired
    DeviceMapper deviceMapper;
    @Autowired
    TransactionMapper transactionMapper;
    @Autowired
    VipMapper vipMapper;

    @Transactional
    @Override
    public void bindDev(Integer userId, String devCode, Integer buyPrice) {
        if (buyPrice <= 0) {
            throw new HaltException("请输入正确金额");
        }
        DeviceExample e = new DeviceExample();
        DeviceExample.Criteria criteria = e.createCriteria();
        criteria.andCodeEqualTo(devCode);
        List<Device> devices = deviceMapper.selectByExample(e);
        if (devices.size() == 0) {
            throw new HaltException(ErrorCode.ERROR_NOT_FIND, "未找到指定设备");
        }
        UserDeviceExample u = new UserDeviceExample();
        u.createCriteria().andUsersIdEqualTo(userId)
                .andDeviceIdEqualTo(devices.get(0).getId());
        List<UserDevice> userDevices = userDeviceMapper.selectByExample(u);

        if (userDevices.size() != 0) {
            throw new HaltException("设备已经绑定，无需再次绑定");
        }
        UserDevice ud = new UserDevice();
        ud.setDeviceId(devices.get(0).getId());
        ud.setUsersId(userId);
        ud.setStatus(0);
        userDeviceMapper.insertSelective(ud);

        Device device = devices.get(0);
        int i = device.getBuyElectric() + buyPrice;
        device.setBuyElectric(i);
        deviceMapper.updateByPrimaryKey(device);


        Transaction s = new Transaction();
        s.setBuyElectric(buyPrice);
        s.setCreateTime((int) (System.currentTimeMillis() / 1000));
        s.setElecPrice(buyPrice);
        s.setDevicesId(device.getId());
        s.setCode(devCode);
        s.setUserId(userId);
        s.setMoney(buyPrice);
        s.setStatus((short) 1);

        transactionMapper.insertSelective(s);

    }

    @Override
    public void buyEle(Integer userId, Integer devId, Integer buyPrice) {
        Device device = deviceMapper.selectByPrimaryKey(devId);
        if (device == null) {
            throw new HaltException(ErrorCode.ERROR_NOT_FIND, "未找到指定设备");
        }

        if (buyPrice <= 0) {
            throw new HaltException("请输入正确金额");
        }

        int i = device.getBuyElectric() + buyPrice;
        device.setBuyElectric(i);
        deviceMapper.updateByPrimaryKey(device);


        Transaction s = new Transaction();
        s.setBuyElectric(buyPrice);
        s.setCreateTime((int) (System.currentTimeMillis() / 1000));
        s.setElecPrice(buyPrice);
        s.setDevicesId(device.getId());
        s.setCode(device.getCode());
        s.setUserId(userId);
        s.setMoney(buyPrice);
        s.setStatus((short) 1);

        transactionMapper.insertSelective(s);
    }

    @Override
    public void buyDevVIP(Integer userId, Integer devId, Integer buyCount) {

        Device device = deviceMapper.selectByPrimaryKey(devId);
        if (device == null) {
            throw new HaltException(ErrorCode.ERROR_NOT_FIND, "未找到指定设备");
        }


        VipExample v = new VipExample();
        v.createCriteria().andDeviceIdEqualTo(devId)
                .andUserIdEqualTo(userId)
                .andStatusEqualTo((short) 1);
        v.setOrderByClause("end_time  desc");

        List<Vip> vips = vipMapper.selectByExample(v);
        Calendar calendar = Calendar.getInstance();

        boolean isAdd = false;
        if (vips.size() != 0) {
            Vip vip = vips.get(0);
            Date endTime = vip.getEndTime();
            calendar.setTime(endTime);
            int iyear = calendar.get(Calendar.YEAR);
            int iday = calendar.get(Calendar.DAY_OF_YEAR);
            calendar.setTimeInMillis(System.currentTimeMillis());
            int byear = calendar.get(Calendar.YEAR);
            int bday = calendar.get(Calendar.DAY_OF_YEAR);
            if (iyear > byear) {
                //1
            } else if (iyear == byear && bday < iday) {
                //1
            } else {
                //2
                isAdd = true;
            }
        }
        if (isAdd) {
            calendar.setTime(vips.get(0).getEndTime());
        } else {
            calendar.setTimeInMillis(System.currentTimeMillis());
        }
        Date nowDate = calendar.getTime();

        calendar.add(Calendar.MONTH, buyCount);
        Date endDate = calendar.getTime();

        Vip vm = new Vip();
        vm.setBuyMonths(buyCount);
        vm.setVipPrice(20);
        vm.setStartTime(nowDate);
        vm.setCode(device.getCode());
        vm.setCreateTime(new Date());
        vm.setDeviceId(devId);
        vm.setOutTradeNo("abcde123" + System.currentTimeMillis());
        vm.setUserId(userId);
        vm.setVipCharge(1);
        vm.setStatus((short) 1);

        vm.setEndTime(endDate);
        vipMapper.insertSelective(vm);


    }
}
