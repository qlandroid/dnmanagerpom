package com.dnmanager.service.impl;

import com.dnmanager.HaltException;
import com.dnmanager.base.ErrorCode;
import com.dnmanager.bean.ShoppingParams;
import com.dnmanager.dao.AppOrderInfoMapper;
import com.dnmanager.dao.CommodityMapper;
import com.dnmanager.pojo.AppOrderInfo;
import com.dnmanager.pojo.Commodity;
import com.dnmanager.pojo.CommodityExample;
import com.dnmanager.service.IShoppingService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mysql.jdbc.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingService implements IShoppingService {


    @Autowired
    CommodityMapper commodityMapper;

    @Autowired
    AppOrderInfoMapper appOrderInfoMapper;


    @Override
    public Page selectGoodsList(ShoppingParams params) {
        CommodityExample cq = new CommodityExample();
        params.setQuery(cq);
        Page page = PageHelper.startPage(params.getPageNum(), params.getPageSize());
        List<Commodity> commodities = commodityMapper.selectByExample(cq);
        return page;
    }

    @Override
    public Commodity selectGoodsDetailsByGoodsId(ShoppingParams params) {
        params.setId(params.getGoodsId());
        Commodity commodity = commodityMapper.selectByPrimaryKey(params.getId());
        return commodity;
    }

    @Override
    public void payment(AppOrderInfo info) {
        Integer goodsId = info.getGoodsId();
        if (goodsId == null) {
            throw new HaltException(ErrorCode.ERROR_NOT_FIND, "没有找到商品");
        }
        if (info.getDeviceNum() == null || info.getDeviceNum() < 1) {
            throw new HaltException("设备数量不正确");
        }
        if (StringUtils.isNullOrEmpty(info.getOpenBank())) {
            throw new HaltException("请输入开户行");
        }
        if (StringUtils.isNullOrEmpty(info.getBankName())) {
            throw new HaltException("请输入账号");
        }
        if (StringUtils.isNullOrEmpty(info.getAccNum())) {
            throw new HaltException("请输入联系人");
        }
        if (StringUtils.isNullOrEmpty(info.getContactsNum())) {
            throw new HaltException("请输入联系电话");
        }
        if (StringUtils.isNullOrEmpty(info.getPostalAddress())) {
            throw new HaltException("请输入通讯地址");
        }
        if (StringUtils.isNullOrEmpty(info.getReceAddress())) {
            throw new HaltException("请输入收货地址");
        }
        if (StringUtils.isNullOrEmpty(info.getConsignee())) {
            throw new HaltException("请输入收货人");
        }
        if (StringUtils.isNullOrEmpty(info.getPhone())) {
            throw new HaltException("请输入收货电话");
        }
        Commodity commodity = commodityMapper.selectByPrimaryKey(goodsId);
        info.setDeviceName(commodity.getCommodityName());
        info.setDeviceType(commodity.getElecType());
        info.setVoltage(commodity.getVoltage());
        info.setCurrentSpec(commodity.getCurrentSpec());
        appOrderInfoMapper.insertSelective(info);
    }
}
