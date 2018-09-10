package com.dnmanager.service.impl;

import com.dnmanager.HaltException;
import com.dnmanager.base.ErrorCode;
import com.dnmanager.dao.DeviceMapper;
import com.dnmanager.dao.VipMapper;
import com.dnmanager.pojo.Device;
import com.dnmanager.pojo.VipExample;
import com.dnmanager.select.VipSelect;
import com.dnmanager.service.IPayService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayService implements IPayService {
    @Autowired
    VipMapper vipMapper;
    @Autowired
    DeviceMapper deviceMapper;

    @Override
    public Object selectVipRecord(VipSelect vipSelect) {

        Page page = PageHelper.startPage(vipSelect.getPageNum(), vipSelect.getPageSize(), "create_time DESC");

        VipExample ve = new VipExample();
        VipExample.Criteria criteria = ve.createCriteria().andUserIdEqualTo(vipSelect.getUserId())
                .andStatusEqualTo((short)1);
        if (vipSelect.getDeviceId() != null) {
            Device device = deviceMapper.selectByPrimaryKey(vipSelect.getDevId());
            if (device == null) {
                throw new HaltException(ErrorCode.ERROR_NOT_FIND, "没有找到指定设备");
            }
            criteria.andCodeEqualTo(device.getCode());
        }

        vipMapper.selectByExample(ve);
        return page;
    }
}
