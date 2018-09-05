package com.dnmanager.controller;

import com.alibaba.fastjson.JSON;
import com.dnmanager.base.Result;
import com.dnmanager.pay.wxpay.WxpayCommonUtil;
import com.dnmanager.pay.wxpay.WxpayConfig;
import com.dnmanager.pay.wxpay.WxpayHttpUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.*;

public class WxPayController {

    //https://pay.weixin.qq.com/wiki/doc/api/app/app.php?chapter=9_1
    Logger logger = LoggerFactory.getLogger(WxPayController.class);



    /**
     * 微信回调地址
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/weixin/asynchronousNotify", method = RequestMethod.POST)
    public String wexinNotify(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");//允许跨域访问的域，可以是通配符”*”；
        try {
            InputStream inStream = request.getInputStream();
            ByteArrayOutputStream outSteam = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = inStream.read(buffer)) != -1) {
                outSteam.write(buffer, 0, len);
            }
            outSteam.close();
            inStream.close();
            String resultStr = new String(outSteam.toByteArray(), "utf-8");
            SortedMap<String, String> resultMap = WxpayCommonUtil.xmlConvertToMap(resultStr);//将xml转成排序之后的map
            logger.info("微信支付回调地址请求参数=requst:{}", JSON.toJSON(resultMap));
            String result_code = resultMap.get("result_code");//业务结果
            String is_subscribe = resultMap.get("is_subscribe");//是否关注了微信公众号
            String out_trade_no = resultMap.get("out_trade_no");//订单号
            String transaction_id = resultMap.get("transaction_id");//微信支付订单号  类似于支付宝的交易号
            String sign = resultMap.get("sign");//签名
            String total_fee = resultMap.get("total_fee");//订单总金额  单位为 分
            String openid = resultMap.get("openid");//用户在商户appid下的唯一标识
            String time_end = resultMap.get("time_end");
            String bank_type = resultMap.get("bank_type");

            if (result_code.equals("SUCCESS")) {
                logger.info("支付成功= 订单号:{},交易号:{}", out_trade_no, transaction_id);
                BigDecimal bigDecimal_total_fee = new BigDecimal(total_fee);
                BigDecimal bigDecimal = bigDecimal_total_fee.divide(new BigDecimal(100));
                //TODO
            }
            //通知微信.异步确认成功.必写.不然会一直通知后台.八次之后就认为交易失败了.
//            return WeixinUtil.resultSuccess();
        } catch (Exception ex) {
            logger.warn("微信支付回调地址处理异常:{}", ex);
           // mailTools.SendMail("环境异常,微信支付回调地址处理异常", "异常", ex);
            ex.printStackTrace();
        }
        return "success";
    }

    public Result pay(String outTradeNo, Integer totalFee) {
        SortedMap<String, String> m = new TreeMap<>();
        m.put("appid", WxpayConfig.APP_ID);
        m.put("mch_id", WxpayConfig.MCH_ID);
        m.put("nonce_str", WxpayCommonUtil.getNonce_str());
        m.put("body", "充值会员");
        m.put("sign", WxpayCommonUtil.createSign("UTF-8", m, WxpayConfig.API_KEY));
        m.put("out_trade_no", outTradeNo);//订单号唯一
        m.put("total_fee", totalFee + "");//单位为分
        m.put("spbill_create_ip", WxpayConfig.CREATE_IP);
        m.put("notify_url", WxpayConfig.NOTIFY_URL);
        m.put("trade_type", "APP");


        String requestXml = WxpayCommonUtil.getRequestXml(m);
        logger.debug("订单生成-->" + requestXml);

        String s = WxpayHttpUtil.postData(WxpayConfig.UFDODER_URL, requestXml);
        logger.debug("wx返回结果-->" + s);
        SortedMap<String, String> map = WxpayCommonUtil.xmlConvertToMap(s);
        String return_code = map.get("return_code");
        if ("SUCCESS".equals(return_code)) {
            if ("SUCCESS".equals(map.get("result_code"))) {
                Map<String, String> mapKey = new HashMap<>();
                mapKey.put("key", requestXml);

                return Result.ok(mapKey);
            }
            String msg = "";
            String err_code = map.get("err_code");
            String err_code_des = map.get("err_code_des");
            if (err_code != null) {
                msg += err_code;
            }
            if (err_code_des != null) {
                msg += err_code_des;
            }
            return Result.error(msg);
        }
        String return_msg = map.get("return_msg");
        return Result.error(return_msg);
    }

}
