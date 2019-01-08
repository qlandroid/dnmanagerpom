package com.dnmanager.zg.bean;


/**
 * 快捷支付 返回只
 */
public class QuickPaymentResult {

    public static final String SUCCESS_CODE = "0000";

    //银通生成的交易订单号
    private String orderNo;
    //订单交易总金额(单位:分)
    private String transAmount;
    //商户订单号
    private String merchantOrderNo;

    //状态编码
    private String transStatus;
    //状态码描述
    private String transDecs;

    //返回编码;
    private String returnCode;

    //返回信息描述
    private String returnDesc;

    //结果描述
    private String returnMsg;
    //分账结果 s成功  p-处理中 f-失败
    private String payResult;
    //成功金额(分)
    private String totalAmount;

    //
    private String signSeqNo;

    public String getSignSeqNo() {
        return signSeqNo;
    }

    public void setSignSeqNo(String signSeqNo) {
        this.signSeqNo = signSeqNo;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public String getPayResult() {
        return payResult;
    }

    public void setPayResult(String payResult) {
        this.payResult = payResult;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isOk() {
        return SUCCESS_CODE.equals(returnCode);
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(String transAmount) {
        this.transAmount = transAmount;
    }

    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }

    public String getTransStatus() {
        return transStatus;
    }

    public void setTransStatus(String transStatus) {
        this.transStatus = transStatus;
    }

    public String getTransDecs() {
        return transDecs;
    }

    public void setTransDecs(String transDecs) {
        this.transDecs = transDecs;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnDesc() {
        return returnDesc;
    }

    public void setReturnDesc(String returnDesc) {
        this.returnDesc = returnDesc;
    }
}
