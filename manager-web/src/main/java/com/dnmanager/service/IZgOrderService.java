package com.dnmanager.service;

import com.dnmanager.pojo.YtLedger;
import com.dnmanager.pojo.YtOrder;
import com.dnmanager.zg.bean.QuickPaymentNotify;

import java.util.Map;

public interface IZgOrderService {
    Object createOrderByEle(Map<String, Object> bodys);

    Object createOrderByVip(Map<String, Object> bodys);

    void orderEleNotify(QuickPaymentNotify notify);

    void orderVipNotify(QuickPaymentNotify notify);

    Object selectOrderNoByNo(YtOrder orderNo);

    void sendMsg(Map<String, String> body);

    void webPay(Map<String, String> body);
}
