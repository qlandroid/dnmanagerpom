package com.dnmanager.controller;

import com.alibaba.fastjson.JSONObject;
import com.dnmanager.base.Result;
import com.dnmanager.pojo.YtOrder;
import com.dnmanager.pojo.YtOrderWithBLOBs;
import com.dnmanager.service.IZgOrderService;
import com.dnmanager.utils.HttpUtils;
import com.dnmanager.utils.Md5Encrypt;
import com.dnmanager.utils.RSAUtils;
import com.dnmanager.zg.ZGConfig;
import com.dnmanager.zg.bean.QuickPaymentDivideNotify;
import com.dnmanager.zg.bean.QuickPaymentNotify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


@Controller
@RequestMapping("/zg")
public class ZhongGangController {

    @Autowired
    IZgOrderService zgOrderService;


    //创建支付电费订单
    @RequestMapping("createOrderByElePay")
    @ResponseBody
    public Object createOrderEle(@RequestBody Map<String, Object> bodys) {
        Object o = zgOrderService.createOrderByEle(bodys);
        return Result.ok(o);
    }

    //创建支付会员订单
    @RequestMapping("createOrderByVipPay")
    @ResponseBody
    public Object createOrderVip(@RequestBody Map<String, Object> bodys) {
        Object o = zgOrderService.createOrderByVip(bodys);
        return Result.ok(o);
    }

    /**
     * 用于快捷支付 分账回调
     *
     * @param req
     * @return
     */
    @RequestMapping("divideNotify")
    @ResponseBody
    public Object divideNotify(HttpServletRequest req) {
        String body = getBody(req);
        if (body == null) {
            return "false";
        }
        JSONObject jsonObject = JSONObject.parseObject(body);
        QuickPaymentDivideNotify notify = jsonObject.getObject("body", QuickPaymentDivideNotify.class);
        if (notify == null) {
            return "false";
        }


        return "true";
    }

    /**
     * 用于快捷支付电量支付 异步通知
     *
     * @param req
     * @return
     */
    @RequestMapping("orderEleNotify")
    @ResponseBody
    public Object orderEleNotify(HttpServletRequest req) {
        String body = getBody(req);
        if (body == null) {
            return "false";
        }
        JSONObject jsonObject = JSONObject.parseObject(body);
        QuickPaymentNotify notify = jsonObject.getObject("body", QuickPaymentNotify.class);
        if (notify == null) {
            return "false";
        }
        zgOrderService.orderEleNotify(notify);

        return "true";
    }

    /**
     * 用于快捷支付电量支付 异步通知
     *
     * @param req
     * @return
     */
    @RequestMapping("orderVipNotify")
    @ResponseBody
    public Object orderVipNotify(HttpServletRequest req) {
        String body = getBody(req);
        if (body == null) {
            return "false";
        }
        JSONObject jsonObject = JSONObject.parseObject(body);
        QuickPaymentNotify notify = jsonObject.getObject("body", QuickPaymentNotify.class);
        if (notify == null) {
            return "false";
        }
        zgOrderService.orderVipNotify(notify);

        return "true";
    }


    @RequestMapping("getOrderStatus")
    @ResponseBody
    public Object getOrderStatus(@RequestBody Map<String, String> body) {
        String orderNo = body.get("orderNo");
        YtOrderWithBLOBs ytOrder = new YtOrderWithBLOBs();
        ytOrder.setOrderNum(orderNo);
        Object obj = zgOrderService.selectOrderNoByNo(ytOrder);
        return Result.ok(obj);

    }

    @RequestMapping("sendMsg")
    @ResponseBody
    public Object sendMsg(@RequestBody Map<String, String> body) {

        zgOrderService.sendMsg(body);

        return Result.ok();

    }

    @RequestMapping("webElePay")
    @ResponseBody
    public Object webPay(@RequestBody Map<String, String> body) {

        zgOrderService.webPay(body);

        return Result.ok();

    }

    private String getBody(HttpServletRequest req) {
        // 预处理报文
        Map<String, String> paramMap = HttpUtils.preDealRequestParameters(req);

        String md5msg = paramMap.get("md5msg");

        String rsamsg = paramMap.get("rsamsg");

        String partner_id = paramMap.get("partner_id");

        //md5加签
        String sign = rsamsg + ZGConfig.key;
        String md5 = Md5Encrypt.md5(sign);

        // 验签成功
        if (md5.equals(md5msg)) {

            //解密
            String msg = RSAUtils.decryptBase64(rsamsg, ZGConfig.keyStorePath, ZGConfig.keyPassword);
            return msg;

        }
        return null;
    }


}
