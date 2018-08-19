package com.dnmanager.pojo;

public class Transaction {
    private Integer id;

    private Integer devicesId;

    private Integer buyElectric;

    private Integer money;

    private Integer createTime;

    private Integer userId;

    private String outTradeNo;

    private Short status;

    private String code;

    private Integer elecPrice;

    private Integer elecCharge;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDevicesId() {
        return devicesId;
    }

    public void setDevicesId(Integer devicesId) {
        this.devicesId = devicesId;
    }

    public Integer getBuyElectric() {
        return buyElectric;
    }

    public void setBuyElectric(Integer buyElectric) {
        this.buyElectric = buyElectric;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getElecPrice() {
        return elecPrice;
    }

    public void setElecPrice(Integer elecPrice) {
        this.elecPrice = elecPrice;
    }

    public Integer getElecCharge() {
        return elecCharge;
    }

    public void setElecCharge(Integer elecCharge) {
        this.elecCharge = elecCharge;
    }
}