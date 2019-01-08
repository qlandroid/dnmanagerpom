package com.dnmanager.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dnmanager.HaltException;
import com.dnmanager.base.Result;
import com.dnmanager.dao.*;
import com.dnmanager.pojo.*;
import com.dnmanager.service.IDevService;
import com.dnmanager.service.IZgOrderService;
import com.dnmanager.utils.*;
import com.dnmanager.zg.ZGConfig;
import com.dnmanager.zg.bean.*;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.mysql.jdbc.StringUtils;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.misc.BASE64Encoder;

import javax.security.auth.Subject;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.*;

@Service
public class ZgOrderServiceImpl implements IZgOrderService {


    @Autowired
    DeviceMapper deviceMapper;
    @Autowired
    YtOrderMapper ytOrderMapper;
    @Autowired
    VipMapper vipMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    OperatorMapper operatorMapper;
    @Autowired
    CategoryMapper categoryMapper;
    @Autowired
    YtLedgerMapper ytLedgerMapper;
    @Autowired
    YtLedNumMapper ytLedNumMapper;
    @Autowired
    UserDeviceMapper userDeviceMapper;


    @Override
    public Object createOrderByEle(Map<String, Object> bodys) {

        Integer devId = (Integer) bodys.get("devId");
        Integer userId = (Integer) bodys.get("userId");
        Integer buyEleNum = (Integer) bodys.get("buyEleNum");
        Device devByDevId = deviceMapper.selectByPrimaryKey(devId);
        if (devByDevId == null) {
            throw new HaltException("当前用户无该设备");
        }


        YtLedNumExample a = new YtLedNumExample();
        a.createCriteria().andUseIdEqualTo(-1);
        List<YtLedNum> ytLedNums = ytLedNumMapper.selectByExampleWithBLOBs(a);
        if (ytLedNums.size() == 0) {
            throw new HaltException("请联系管理员,填写银通账号");
        }

        Operator operator = operatorMapper.selectByPrimaryKey(devByDevId.getOperatorId());
        Category category = categoryMapper.selectByPrimaryKey(operator.getCategoryId());
        if (StringUtils.isNullOrEmpty(category.getYtAccount()) ) {
            throw new HaltException("请联系管理员，"+category.getCategory() +"填写银通账号");
        }
        String devCode = devByDevId.getCode();


        //订单号
        String orderNo = "ELE" + DateUtils.formatDateTime2(new Date());
        String orderDesc = "电表编号: " + devCode + ",购买电力:" + buyEleNum;
        int eleUnit = 50;//电表单价

        int payEleTotal = buyEleNum * eleUnit;

        YtOrderWithBLOBs createEleOrder = new YtOrderWithBLOBs();

        createEleOrder.setDevId(devId);
        createEleOrder.setProName("电力缴费");
        createEleOrder.setOrderDes(orderDesc);
        createEleOrder.setOrderMoney(payEleTotal);
        createEleOrder.setBuyEleCount(buyEleNum);
        createEleOrder.setPayUserId(userId);
        createEleOrder.setPayType(Byte.parseByte("0"));


        ZGRequestHeader header = new ZGRequestHeader();
        header.setServiceName(ZGRequestHeader.FUND_QUICK_ORDER);
        QuickPaymentOrderInfo orderInfo = new QuickPaymentOrderInfo(orderNo, "电力缴费", orderDesc, String.valueOf(payEleTotal));


        Map<String, Object> body = replaceBody(orderInfo, ZGConfig.NotifyUrl_ele);

        ZGRequest request = new ZGRequest(header, body);


        //明文
        String msg = null;
        msg = getZgMsg(request);

        //加密后的密文
        String rsamsg = RSAUtils.encryptBase64(msg, ZGConfig.keyStorePath, ZGConfig.keyPassword);

        //md5加签
        String sign = rsamsg + ZGConfig.key;
        String md5msg = Md5Encrypt.md5(sign);

        Map<String, String> map = new HashMap<String, String>();
        map.put("partner_id", ZGConfig.partner_id);
        map.put("service_name", ZGRequestHeader.FUND_QUICK_ORDER);
        map.put("rsamsg", rsamsg);
        map.put("md5msg", md5msg);
        map.put("version", "3.0");

        String responseStr = HttpUtils.sendParamsPost(ZGConfig.QUICK_PAYMENT_TEST, map);
        QuickPaymentResult resBody = getBody(responseStr);
        if (resBody == null) {
            throw new HaltException("获得订单信息失败");
        }

        if (!resBody.isOk()) {
            throw new HaltException(resBody.getReturnDesc());
        }
        createEleOrder.setDesInfo(resBody.getTransDecs());//银通返回的描述信息
        createEleOrder.setYtOrderNum(resBody.getOrderNo());//银通返回的订单号

        ytOrderMapper.insertSelective(createEleOrder);
        Map<String, String> data = new HashMap<>();
        data.put("orderNo", resBody.getOrderNo());

        return data;
    }

    private Map<String, Object> replaceBody(QuickPaymentOrderInfo orderInfo, String notifyUrl_ele) {
        Map<String, Object> body = new HashMap<>();
        body.put("transType", "70");
        body.put("userIp", ZGConfig.userIp);
        body.put("orderInfo", orderInfo);
        body.put("notifyUrl", notifyUrl_ele);
        return body;
    }

    private String getZgMsg(ZGRequest request) {
        String msg;
        try {
            msg = "partner_id=" + ZGConfig.partner_id + "&service_name=" + ZGRequestHeader.FUND_QUICK_ORDER
                    + "&data=" + URLEncoder.encode(JSON.toJSONString(request), "UTF-8");
        } catch (UnsupportedEncodingException e) {

            e.printStackTrace();
            throw new HaltException("生成订单失败");
        }
        return msg;
    }

    @Override
    public Object createOrderByVip(Map<String, Object> bodys) {
        Integer userId = (Integer) bodys.get("userId");
        Integer devId = (Integer) bodys.get("devId");
        Integer buyMonth = (Integer) bodys.get("buyMonth");//购买多少月

        Device device = deviceMapper.selectByPrimaryKey(devId);
        if (device == null) {
            throw new HaltException("设备不存在");
        }
        if (userMapper.selectByPrimaryKey(userId) == null) {
            throw new HaltException("用户不存在");
        }

        YtLedNumExample a = new YtLedNumExample();
        a.createCriteria().andUseIdEqualTo(-1);
        List<YtLedNum> ytLedNums = ytLedNumMapper.selectByExampleWithBLOBs(a);
        if (ytLedNums.size() == 0) {
            throw new HaltException("请联系管理员,填写银通账号");
        }

        Operator operator2 = operatorMapper.selectByPrimaryKey(device.getOperatorId());
        Category category2 = categoryMapper.selectByPrimaryKey(operator2.getCategoryId());
        if (StringUtils.isNullOrEmpty(category2.getYtAccount()) ) {
            throw new HaltException("请联系管理员，"+category2.getCategory() +"填写银通账号");
        }

        VipExample vipExample = new VipExample();
        VipExample.Criteria criteria = vipExample.createCriteria();
        criteria.andUserIdEqualTo(userId)
                .andDeviceIdEqualTo(devId);
        List<Vip> vips = vipMapper.selectByExample(vipExample);
        if (vips.size() >= 0) {
            Vip vip = vips.get(vips.size() - 1);
            Date endTime = vip.getEndTime();
            Date date = new Date();
            if (endTime.getTime() > date.getTime()) {
                throw new HaltException("当前已经是会员无需办理会员");
            }
        }
        //可以办理会员
        String orderNo = "VIP" + DateUtils.formatDateTime2(new Date());
        YtOrderWithBLOBs ytOrderWithBLOBs = new YtOrderWithBLOBs();
        ytOrderWithBLOBs.setBuyEleCount(buyMonth);
        ytOrderWithBLOBs.setPayType(Byte.parseByte("1"));
        ytOrderWithBLOBs.setDevId(devId);
        ytOrderWithBLOBs.setPayUserId(userId);
        ytOrderWithBLOBs.setOrderNum(orderNo);

        ytOrderWithBLOBs.setProName("电表会员办理");
        String orderDes = "电表编号:" + device.getCode() + ",办理会员时长:" + buyMonth;
        ytOrderWithBLOBs.setOrderDes(orderDes);


        Operator operator = operatorMapper.selectByPrimaryKey(device.getOperatorId());
        Category category = categoryMapper.selectByPrimaryKey(operator.getCategoryId());
        Integer vipPrice = category.getVipPrice();

        int orderMoney = buyMonth * vipPrice;
        ytOrderWithBLOBs.setOrderMoney(orderMoney);


        ZGRequestHeader header = new ZGRequestHeader();
        header.setServiceName(ZGRequestHeader.FUND_QUICK_ORDER);
        QuickPaymentOrderInfo orderInfo = new QuickPaymentOrderInfo(orderNo,
                ytOrderWithBLOBs.getProName(), orderDes, String.valueOf(orderMoney));


        Map<String, Object> body = replaceBody(orderInfo, ZGConfig.NotifyUrl_vip);

        ZGRequest request = new ZGRequest(header, body);

        //明文
        String msg = null;
        msg = getZgMsg(request);

        //加密后的密文
        String rsamsg = RSAUtils.encryptBase64(msg, ZGConfig.keyStorePath, ZGConfig.keyPassword);

        //md5加签
        String sign = rsamsg + ZGConfig.key;
        String md5msg = Md5Encrypt.md5(sign);

        Map<String, String> map = new HashMap<String, String>();
        map.put("partner_id", ZGConfig.partner_id);
        map.put("service_name", ZGRequestHeader.FUND_QUICK_ORDER);
        map.put("rsamsg", rsamsg);
        map.put("md5msg", md5msg);
        map.put("version", "3.0");

        String responseStr = HttpUtils.sendParamsPost(ZGConfig.QUICK_PAYMENT_TEST, map);
        QuickPaymentResult resBody = getBody(responseStr);
        if (resBody == null) {
            throw new HaltException("获得订单信息失败");
        }

        if (!resBody.isOk()) {
            throw new HaltException(resBody.getReturnDesc());
        }
        ytOrderWithBLOBs.setDesInfo(resBody.getTransDecs());//银通返回的描述信息
        ytOrderWithBLOBs.setYtOrderNum(resBody.getOrderNo());//银通返回的订单号

        ytOrderMapper.insertSelective(ytOrderWithBLOBs);
        Map<String, String> data = new HashMap<>();
        data.put("orderNo", resBody.getOrderNo());

        return data;
    }

    @Override
    public void orderEleNotify(QuickPaymentNotify notify) {
        YtOrderExample query = new YtOrderExample();
        query.createCriteria()
                .andOrderNumEqualTo(notify.getOutTradeNo());
        List<YtOrder> ytOrders = ytOrderMapper.selectByExample(query);
        YtOrder ytOrder = ytOrders.get(0);

        int i1 = Integer.parseInt(notify.getPayAmount());

        YtOrderWithBLOBs s = new YtOrderWithBLOBs();
        s.setId(ytOrder.getId());
        s.setYtOrderNum(notify.getTransNo());
        s.setPayState(Byte.parseByte("1"));//支付状态
        //中钢返回支付状态
        s.setYtState(Byte.parseByte(notify.getTransStatus()));
        s.setRealityMoney(i1);//实际支付金额

        String desInfo = s.getDesInfo();

        String s1 = desInfo == null ? "" : desInfo;

        s.setDesInfo(s1 + "-" + notify.getPayTime());

        ytOrderMapper.updateByPrimaryKeySelective(s);

        //  2019/1/4 给设备进行充值相应的电能
        Device device = deviceMapper.selectByPrimaryKey(ytOrder.getDevId());
        int total = ytOrder.getBuyEleCount() + device.getBuyElectric();
        device.setBuyElectric(total);
        deviceMapper.updateByPrimaryKeySelective(device);

        //如果没有绑定该设备则将用户与该设备绑定
        UserDeviceExample e = new UserDeviceExample();
        e.createCriteria().andUsersIdEqualTo(ytOrder.getPayUserId())
                .andDeviceIdEqualTo(ytOrder.getDevId());
        List<UserDevice> userDevices = userDeviceMapper.selectByExample(e);
        if (userDevices.size() == 0) {
            UserDevice userDevice = new UserDevice();
            userDevice.setUsersId(ytOrder.getPayUserId());
            userDevice.setDeviceId(ytOrder.getDevId());
            Calendar instance = Calendar.getInstance();
            instance.add(Calendar.YEAR, 1);

            userDevice.setEndTime(instance.getTime());
            userDeviceMapper.insertSelective(userDevice);
        }

        // 2019/1/4 进行分账操作

        divid(notify, device);

    }

    private void divid(QuickPaymentNotify notify, Device device) {
        Map<String, Object> divideMap = new HashMap<>();
        String outOrderNo = "Di" + DateUtils.formatDateTime2(new Date());
        divideMap.put("outOrderNo", outOrderNo);
        divideMap.put("payOrderNo", notify.getTransNo());
        divideMap.put("subject", "会员充值，进行分账");


        YtLedger ytLedger = new YtLedger();
        ytLedger.setLedOrderNum(outOrderNo);
        ytLedger.setPayOrderNum(notify.getTransNo());
        ytLedger.setTheme((String) divideMap.get("subject"));
        ytLedgerMapper.insertSelective(ytLedger);


        List<Object> accounts = new ArrayList<>();


        //需要分给服务商
        Map<String, String> accountService = new HashMap<>();
        Operator operator = operatorMapper.selectByPrimaryKey(device.getOperatorId());
        Category category = categoryMapper.selectByPrimaryKey(operator.getCategoryId());
        accountService.put("divideAccount", category.getYtAccount());
        accountService.put("divideMode", String.valueOf(2));
        accountService.put("divideModeValue", String.valueOf(category.getVipCharge()));
        accountService.put("comment", "会员充值后给与的分成");
        accounts.add(accountService);

        YtLedNum ytAccount = new YtLedNum();
        ytAccount.setRecYtNum(category.getYtAccount());
        ytAccount.setLedType(Byte.parseByte(accountService.get("divideMode")));
        ytAccount.setRecMoney(Integer.valueOf(accountService.get("divideModeValue")));
        ytAccount.setUseId(category.getId());
        ytAccount.setYtLedgerId(ytLedger.getId());
        ytLedNumMapper.insertSelective(ytAccount);


        //需要固定分给分公司
        // TODO: 2019/1/4 填写固定的子公司的账号
        try {
            YtLedNumExample e = new YtLedNumExample();
            e.createCriteria().andUseIdEqualTo(-1);
            List<YtLedNum> ytLedNums = ytLedNumMapper.selectByExampleWithBLOBs(e);
            YtLedNum childAccount = ytLedNums.get(0);

            Map<String, String> childService = new HashMap<>();

            String ytChildAccount = childAccount.getRecYtNum();
            childService.put("divideAccount", ytChildAccount);
            childService.put("divideMode", String.valueOf(2));
            int value = Integer.valueOf(notify.getPayAmount()) - category.getVipCharge();
            childService.put("divideModeValue", String.valueOf(value));
            childService.put("comment", "会员充值后给与子公司的分成");
            accounts.add(childService);

            YtLedNum ytChildService = new YtLedNum();
            ytChildService.setRecYtNum(ytChildAccount);
            ytChildService.setLedType(Byte.parseByte(childService.get("divideMode")));
            ytChildService.setRecMoney(Integer.valueOf(childService.get("divideModeValue")));
            ytChildService.setUseId(-1);
            ytChildService.setYtLedgerId(ytLedger.getId());
            ytLedNumMapper.insertSelective(ytChildService);
        } catch (Exception e) {

        }


        divideMap.put("accounts", accounts);

        Map<String, Object> body = new HashMap<>();
        body.put("transType", "70");
        body.put("userIp", ZGConfig.userIp);
        body.put("orderInfo", divideMap);
        body.put("notifyUrl", ZGConfig.NotifyUrl_vip);


        ZGRequestHeader header = new ZGRequestHeader();
        header.setServiceName(ZGRequestHeader.ACCOUNT_DIVIDE_PAY);
        ZGRequest request = new ZGRequest(header, body);

        //明文
        String msg = null;
        msg = getZgMsg(request);

        //加密后的密文
        String rsamsg = RSAUtils.encryptBase64(msg, ZGConfig.keyStorePath, ZGConfig.keyPassword);

        //md5加签
        String sign = rsamsg + ZGConfig.key;
        String md5msg = Md5Encrypt.md5(sign);

        Map<String, String> map = new HashMap<String, String>();
        map.put("partner_id", ZGConfig.partner_id);
        map.put("service_name", ZGRequestHeader.FUND_QUICK_ORDER);
        map.put("rsamsg", rsamsg);
        map.put("md5msg", md5msg);
        map.put("version", "3.0");

        String responseStr = HttpUtils.sendParamsPost(ZGConfig.QUICK_PAYMENT_TEST, map);
        QuickPaymentResult resBody = getBody(responseStr);
        if (resBody == null) {
            throw new HaltException("获得订单信息失败");
        }

        ytLedger.setLedgerResDes(resBody.getReturnMsg());
        ytLedger.setLedgerState(resBody.getPayResult());
        String totalAmount = resBody.getTotalAmount();
        ytLedger.setSucMoney(totalAmount == null ? 0 : Integer.parseInt(totalAmount));
        ytLedger.setYtRecNum(Integer.parseInt(resBody.getReturnCode()));
        ytLedgerMapper.updateByPrimaryKeySelective(ytLedger);
    }

    @Override
    public void orderVipNotify(QuickPaymentNotify notify) {
        YtOrderExample query = new YtOrderExample();
        query.createCriteria()
                .andOrderNumEqualTo(notify.getOutTradeNo());
        List<YtOrder> ytOrders = ytOrderMapper.selectByExample(query);
        YtOrder ytOrder = ytOrders.get(0);

        int i1 = Integer.parseInt(notify.getPayAmount());

        YtOrderWithBLOBs s = new YtOrderWithBLOBs();
        s.setId(ytOrder.getId());
        s.setYtOrderNum(notify.getTransNo());
        s.setPayState(Byte.parseByte("1"));//支付状态
        //中钢返回支付状态
        s.setYtState(Byte.parseByte(notify.getTransStatus()));
        s.setRealityMoney(i1);//实际支付金额

        String desInfo = s.getDesInfo();

        String s1 = desInfo == null ? "" : desInfo;

        s.setDesInfo(s1 + "-" + notify.getPayTime());

        ytOrderMapper.updateByPrimaryKeySelective(s);

        // TODO: 2019/1/4 会员充值创建会员表
        Integer buyVipMonth = ytOrder.getBuyEleCount();
        Vip vip = new Vip();
        vip.setCreateTime(new Date());
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.add(Calendar.MONTH, buyVipMonth);
        long timeInMillis = instance.getTimeInMillis();
        vip.setEndTime(new Date(timeInMillis));
        vip.setBuyMonths(buyVipMonth);
        vip.setOutTradeNo(ytOrder.getOrderNum());
        vip.setStatus(Short.valueOf("1"));
        vip.setMoney(Integer.getInteger(notify.getPayAmount()));
        vip.setUserId(ytOrder.getPayUserId());

        Device device = deviceMapper.selectByPrimaryKey(ytOrder.getDevId());
        vip.setCode(device.getCode());
        vip.setDeviceId(device.getId());
        vip.setStartTime(new Date());

        vipMapper.insertSelective(vip);

        // TODO: 2019/1/4 进行分账操作


        Map<String, Object> divideMap = new HashMap<>();
        String outOrderNo = "Di" + DateUtils.formatDateTime2(new Date());
        divideMap.put("outOrderNo", outOrderNo);
        divideMap.put("payOrderNo", notify.getTransNo());
        divideMap.put("subject", "会员充值，进行分账");


        YtLedger ytLedger = new YtLedger();
        ytLedger.setLedOrderNum(outOrderNo);
        ytLedger.setPayOrderNum(notify.getTransNo());
        ytLedger.setTheme((String) divideMap.get("subject"));
        ytLedgerMapper.insertSelective(ytLedger);


        List<Object> accounts = new ArrayList<>();

        try {
            //需要分给服务商
            Map<String, String> accountService = new HashMap<>();
            Operator operator = operatorMapper.selectByPrimaryKey(device.getOperatorId());
            Category category = categoryMapper.selectByPrimaryKey(operator.getCategoryId());
            accountService.put("divideAccount", category.getYtAccount());
            accountService.put("divideMode", String.valueOf(2));
            accountService.put("divideModeValue", String.valueOf(category.getVipCharge()));
            accountService.put("comment", "会员充值后给与的分成");
            accounts.add(accountService);

            YtLedNum ytAccount = new YtLedNum();
            ytAccount.setRecYtNum(category.getYtAccount());
            ytAccount.setLedType(Byte.parseByte(accountService.get("divideMode")));
            ytAccount.setRecMoney(Integer.valueOf(accountService.get("divideModeValue")));
            ytAccount.setUseId(category.getId());
            ytAccount.setYtLedgerId(ytLedger.getId());
            ytLedNumMapper.insertSelective(ytAccount);


            try {
                //需要固定分给分公司
                YtLedNumExample e = new YtLedNumExample();
                e.createCriteria().andUseIdEqualTo(-1);
                List<YtLedNum> ytLedNums = ytLedNumMapper.selectByExampleWithBLOBs(e);
                YtLedNum childAccount = ytLedNums.get(0);
                String ytChildAccount = childAccount.getRecYtNum();

                Map<String, String> childService = new HashMap<>();
                // TODO: 2019/1/4 填写固定的子公司的账号
                childService.put("divideAccount", ytChildAccount);
                childService.put("divideMode", String.valueOf(2));
                int value = Integer.valueOf(notify.getPayAmount()) - category.getVipCharge();
                childService.put("divideModeValue", String.valueOf(value));
                childService.put("comment", "会员充值后给与子公司的分成");
                accounts.add(childService);

                YtLedNum ytChildService = new YtLedNum();
                ytChildService.setRecYtNum(ytChildAccount);
                ytChildService.setLedType(Byte.parseByte(childService.get("divideMode")));
                ytChildService.setRecMoney(Integer.valueOf(childService.get("divideModeValue")));
                ytChildService.setUseId(-1);
                ytChildService.setYtLedgerId(ytLedger.getId());
                ytLedNumMapper.insertSelective(ytChildService);
            } catch (Exception e) {

            }
        } catch (Exception e) {
            return;
        }


        divideMap.put("accounts", accounts);


        Map<String, Object> body = new HashMap<>();
        body.put("transType", "70");
        body.put("userIp", ZGConfig.userIp);
        body.put("orderInfo", divideMap);
        body.put("notifyUrl", ZGConfig.NotifyUrl_vip);


        ZGRequestHeader header = new ZGRequestHeader();
        header.setServiceName(ZGRequestHeader.ACCOUNT_DIVIDE_PAY);
        ZGRequest request = new ZGRequest(header, body);

        //明文
        String msg = null;
        msg = getZgMsg(request);

        //加密后的密文
        String rsamsg = RSAUtils.encryptBase64(msg, ZGConfig.keyStorePath, ZGConfig.keyPassword);

        //md5加签
        String sign = rsamsg + ZGConfig.key;
        String md5msg = Md5Encrypt.md5(sign);

        Map<String, String> map = new HashMap<String, String>();
        map.put("partner_id", ZGConfig.partner_id);
        map.put("service_name", ZGRequestHeader.FUND_QUICK_ORDER);
        map.put("rsamsg", rsamsg);
        map.put("md5msg", md5msg);
        map.put("version", "3.0");

        String responseStr = HttpUtils.sendParamsPost(ZGConfig.QUICK_PAYMENT_TEST, map);
        QuickPaymentResult resBody = getBody(responseStr);
        if (resBody == null) {
            throw new HaltException("获得订单信息失败");
        }

        ytLedger.setLedgerResDes(resBody.getReturnMsg());
        ytLedger.setLedgerState(resBody.getPayResult());
        String totalAmount = resBody.getTotalAmount();
        ytLedger.setSucMoney(totalAmount == null ? 0 : Integer.parseInt(totalAmount));
        ytLedger.setYtRecNum(Integer.parseInt(resBody.getReturnCode()));
        ytLedgerMapper.updateByPrimaryKeySelective(ytLedger);

    }

    @Override
    public Object selectOrderNoByNo(YtOrder orderNo) {

        YtOrderExample e = new YtOrderExample();
        e.createCriteria().andYtOrderNumEqualTo(orderNo.getOrderNum());
        List<YtOrder> ytOrders = ytOrderMapper.selectByExample(e);
        if (ytOrders.size() == 0) {
            throw new HaltException("未查询到该订单");
        }

        YtOrder ytOrder = ytOrders.get(0);
        Byte payState = ytOrder.getPayState();
        Map<String, Object> map = new HashMap<>();

        map.put("status", String.valueOf(payState));
        map.put("orderNo", ytOrder.getOrderNum());
        map.put("ytOrderNo", ytOrder.getYtOrderNum());
        return map;

    }

    @Override
    public void sendMsg(Map<String, String> params) {
        String orderNo = params.get("orderNo");
        YtOrderExample e = new YtOrderExample();
        e.createCriteria().andOrderNumEqualTo(orderNo);
        List<YtOrder> ytOrders = ytOrderMapper.selectByExample(e);
        if (ytOrders.size() == 0) {
            throw new HaltException("未查询到该订单");
        }
        YtOrder ytOrder = ytOrders.get(0);
        String ytOrderNum = ytOrder.getYtOrderNum();
        if (StringUtils.isNullOrEmpty(ytOrderNum)) {
            throw new HaltException("当前订单未成功创建中钢订单");
        }

        String cardNo = params.get("cardNo");
        String cardType = params.get("cardType");
        String certId = params.get("certId");
        String userName = params.get("userName");
        String mobile = params.get("mobile");
        String validity = params.get("validity");

        ZGRequestHeader header = new ZGRequestHeader();
        header.setServiceName(ZGRequestHeader.FUND_QUICK_MSG);

        Map<String, String> customerInfo = new HashMap<>();
        customerInfo.put("cardNo", cardNo);
        customerInfo.put("cardType", cardType);
        customerInfo.put("certId", certId);
        customerInfo.put("userName", userName);
        customerInfo.put("mobile", mobile);
        customerInfo.put("validity", validity);
        customerInfo.put("cvn", "cvn");


        Map<String, Object> body = new HashMap<>();
        body.put("orderNo", ytOrder.getYtOrderNum());//银通订单号
        body.put("customerInfo", customerInfo);
        body.put("payChannelCode", "06");//（ 06:借记卡-无积分,07:贷记卡-无积分,08:借记卡-有积分,09:贷记卡-有积分）

        ZGRequest request = new ZGRequest(header, body);

        //明文
        String msg = null;
        msg = getZgMsg(request);

        //加密后的密文
        String rsamsg = RSAUtils.encryptBase64(msg, ZGConfig.keyStorePath, ZGConfig.keyPassword);

        //md5加签
        String sign = rsamsg + ZGConfig.key;
        String md5msg = Md5Encrypt.md5(sign);

        Map<String, String> map = new HashMap<String, String>();
        map.put("partner_id", ZGConfig.partner_id);
        map.put("service_name", ZGRequestHeader.FUND_QUICK_ORDER);
        map.put("rsamsg", rsamsg);
        map.put("md5msg", md5msg);
        map.put("version", "3.0");

        String responseStr = HttpUtils.sendParamsPost(ZGConfig.QUICK_PAYMENT_TEST, map);
        QuickPaymentResult resBody = getBody(responseStr);
        if (!resBody.isOk()) {
            throw new HaltException(resBody.getReturnDesc());
        }

        String signSeqNo = resBody.getSignSeqNo();
        ytOrder.setYtSignSeqNo(signSeqNo);
        ytOrderMapper.updateByPrimaryKey(ytOrder);

    }

    @Override
    public void webPay(Map<String, String> params) {
        String orderNo = params.get("orderNo");
        YtOrderExample e = new YtOrderExample();
        e.createCriteria().andOrderNumEqualTo(orderNo);
        List<YtOrder> ytOrders = ytOrderMapper.selectByExample(e);
        if (ytOrders.size() == 0) {
            throw new HaltException("未查询到该订单");
        }
        YtOrder ytOrder = ytOrders.get(0);
        String ytOrderNum = ytOrder.getYtOrderNum();
        if (StringUtils.isNullOrEmpty(ytOrderNum)) {
            throw new HaltException("当前订单未成功创建中钢订单");
        }

        String cardNo = params.get("cardNo");
        String certId = params.get("certId");
        String userName = params.get("userName");
        String mobile = params.get("mobile");
        String validity = params.get("validity");
        String msgCode = params.get("msgCode");
        String cardPwd = params.get("cardPwd");

        ZGRequestHeader header = new ZGRequestHeader();
        header.setServiceName(ZGRequestHeader.FUND_QUICK_MSG);

        Map<String, String> customerInfo = new HashMap<>();
        customerInfo.put("cardNo", cardNo);
        customerInfo.put("userName", userName);
        customerInfo.put("certId", certId);
        customerInfo.put("certType", "01");
        customerInfo.put("mobile", mobile);
        customerInfo.put("cardPwd", cardPwd);
        customerInfo.put("validity", validity);
        customerInfo.put("cvn", "cvn");
        customerInfo.put("signSeqNo", "cvn");


        Map<String, Object> body = new HashMap<>();
        body.put("msgCode", msgCode);
        body.put("orderNo", ytOrder.getYtOrderNum());//银通订单号
        body.put("customerInfo", customerInfo);
        body.put("notifyUrl", ZGConfig.NotifyUrl_ele);
        body.put("payChannelCode", "06");//（ 06:借记卡-无积分,07:贷记卡-无积分,08:借记卡-有积分,09:贷记卡-有积分）

        ZGRequest request = new ZGRequest(header, body);

        //明文
        String msg = null;
        msg = getZgMsg(request);

        //加密后的密文
        String rsamsg = RSAUtils.encryptBase64(msg, ZGConfig.keyStorePath, ZGConfig.keyPassword);

        //md5加签
        String sign = rsamsg + ZGConfig.key;
        String md5msg = Md5Encrypt.md5(sign);

        Map<String, String> map = new HashMap<String, String>();
        map.put("partner_id", ZGConfig.partner_id);
        map.put("service_name", ZGRequestHeader.FUND_QUICK_ORDER);
        map.put("rsamsg", rsamsg);
        map.put("md5msg", md5msg);
        map.put("version", "3.0");

        String responseStr = HttpUtils.sendParamsPost(ZGConfig.QUICK_PAYMENT_TEST, map);
        QuickPaymentResult resBody = getBody(responseStr);
        if (!resBody.isOk()) {
            throw new HaltException(resBody.getReturnDesc());
        }

        if (!"70".equals(resBody.getTransStatus())) {
            //支付异常
            throw new HaltException(resBody.getTransDecs());
        }
        YtOrderWithBLOBs ytOrderWithBLOBs = new YtOrderWithBLOBs();
        ytOrderWithBLOBs.setId(ytOrder.getId());

        ytOrderWithBLOBs.setYtState(Byte.parseByte(resBody.getTransStatus()));
        ytOrderWithBLOBs.setYtStateDes(resBody.getTransDecs());
        ytOrderWithBLOBs.setRealityMoney(Integer.parseInt(resBody.getTransAmount()));
        ytOrderMapper.updateByPrimaryKeyWithBLOBs(ytOrderWithBLOBs);

        // TODO: 2019/1/4 支付成功后 需要进行分账操作
        QuickPaymentNotify notify = new QuickPaymentNotify();
        notify.setOutTradeNo(ytOrder.getOrderNum());
        notify.setTransNo(ytOrder.getYtOrderNum());
        notify.setTransAmount(resBody.getTransAmount());
        notify.setTransStatus(resBody.getTransStatus());

        Device device = deviceMapper.selectByPrimaryKey(ytOrder.getDevId());
        divid(notify, device);

    }


    private QuickPaymentResult getBody(String responseStr) {
        String decode = URLDecoder.decode(responseStr);
        // 预处理报文
        JSONObject jsonObject = JSONObject.parseObject(decode);

        String code = jsonObject.getString("code");
        if (!"0000".equals(code)) {
            throw new HaltException(jsonObject.getString("msg"));
        }
        String md5msg = (String) jsonObject.get("md5msg");

        String rsamsg = (String) jsonObject.get("rsamsg");

        String partner_id = (String) jsonObject.get("partner_id");

        //md5加签
        String sign = rsamsg + ZGConfig.key;
        String md5 = Md5Encrypt.md5(sign);

        // 验签成功
        if (md5.equals(md5msg)) {

            //解密
            String msg = RSAUtils.decryptBase64(rsamsg, ZGConfig.keyStorePath, ZGConfig.keyPassword);
            JSONObject res = JSONObject.parseObject(msg);
            QuickPaymentResult body = res.getObject("body", QuickPaymentResult.class);
            return body;
        }
        return null;
    }

}
