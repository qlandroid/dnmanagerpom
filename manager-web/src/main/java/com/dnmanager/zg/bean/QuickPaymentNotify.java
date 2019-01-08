package com.dnmanager.zg.bean;


/**
 * 用于快捷支付时 订单回调
 */
public class QuickPaymentNotify {
    //银通系统支付订单号
    private String transNo;
    //商户订单号
    private String outTradeNo;
    //交易金额 （单位：分)
    private String transAmount;
    //成功金额 (单位：分)
    private String payAmount;
    //交易时间 格式: yyyMMddHHmmss
    private String transTime;
    //支付时间 格式: yyyMMddHHmmss
    private String payTime;
    //交易描述
    private String transDesc;
    //交易状态(订单交易状态码 10 --支付成功)
    private String transStatus;
    //交易类型 (0-收银台收银   1-接口收银)
    private String transType;
    //支付币种  CNY
    private String transCurrency;

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(String transAmount) {
        this.transAmount = transAmount;
    }

    public String getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(String payAmount) {
        this.payAmount = payAmount;
    }

    public String getTransTime() {
        return transTime;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getTransDesc() {
        return transDesc;
    }

    public void setTransDesc(String transDesc) {
        this.transDesc = transDesc;
    }

    public String getTransStatus() {
        return transStatus;
    }

    public void setTransStatus(String transStatus) {
        this.transStatus = transStatus;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getTransCurrency() {
        return transCurrency;
    }

    public void setTransCurrency(String transCurrency) {
        this.transCurrency = transCurrency;
    }
}
