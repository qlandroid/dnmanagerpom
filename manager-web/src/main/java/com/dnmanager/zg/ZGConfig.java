package com.dnmanager.zg;

public class ZGConfig {

    public static final String QUICK_PAYMENT = "https://pay.g-pay.cn/gpay/quickPayment.html";
    public static final String QUICK_PAYMENT_TEST = "https://183.194.57.67:8889/gpay/quickPayment.html";

    // *
//    public static final String keyStorePath = "zg2017test.pfx";
    public static final String keyStorePath = "test.pfx";
    // *
    public static final String keyPassword = "12345678";

    //申请方商户id *
    public static final String partner_id = "b100000000000001";

    // *
    public static String key = "ZD7D0ZM7SC8CVV6Q";

    //平台在银通签约号 *
    public static String senderId = "b100000000000001";

    //用户ip *
    public static String userIp = "132.232.23.91";

    //快捷收单回调
    public static String quickPaymentNotifyUrl;
    public static String NotifyUrl_ele = "http://132.232.23.91:8091/zg/orderEleNotify";
    public static String NotifyUrl_vip = "http://132.232.23.91:8091/zg/orderEleNotify";
}
