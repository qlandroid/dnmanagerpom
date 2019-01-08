package com.dnmanager.zg.bean;

/**
 * 快捷收单订单信息
 */
public class QuickPaymentOrderInfo {

    //商户唯一订单号
    private String merchantOrderNo;
    //商户商品名称
    private String productName;
    //商品描述
    private String productDesc;
    //订单金额(分)
    private String orderAmount;

    /**
     *
     * @param merchantOrderNo  商户唯一订单号
     * @param productName 商户商品名称
     * @param productDesc 商品描述
     * @param orderAmount 订单金额(分)
     */
    public QuickPaymentOrderInfo(String merchantOrderNo, String productName, String productDesc, String orderAmount) {
        this.merchantOrderNo = merchantOrderNo;
        this.productName = productName;
        this.productDesc = productDesc;
        this.orderAmount = orderAmount;
    }

    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }
}
