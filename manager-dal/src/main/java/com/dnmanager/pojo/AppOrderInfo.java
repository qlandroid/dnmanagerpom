package com.dnmanager.pojo;

public class AppOrderInfo {
    private Integer id;

    private String deviceName;

    private String deviceType;

    private Integer voltage;

    private String currentSpec;

    private Integer deviceNum;

    private String category;

    private Integer price;

    private Integer charge;

    private Integer vipPrice;

    private Integer vipCharge;

    private String devInsInfo;

    private String openBank;

    private String bankName;

    private String contacts;

    private String accNum;

    private String contactsNum;

    private String postalAddress;

    private String receAddress;

    private String consignee;

    private String phone;

    /**************************************/
    private Integer buyCount;
    private Integer goodsId;

    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public Integer getVoltage() {
        return voltage;
    }

    public void setVoltage(Integer voltage) {
        this.voltage = voltage;
    }

    public String getCurrentSpec() {
        return currentSpec;
    }

    public void setCurrentSpec(String currentSpec) {
        this.currentSpec = currentSpec == null ? null : currentSpec.trim();
    }

    public Integer getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(Integer deviceNum) {
        this.deviceNum = deviceNum;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCharge() {
        return charge;
    }

    public void setCharge(Integer charge) {
        this.charge = charge;
    }

    public Integer getVipPrice() {
        return vipPrice;
    }

    public void setVipPrice(Integer vipPrice) {
        this.vipPrice = vipPrice;
    }

    public Integer getVipCharge() {
        return vipCharge;
    }

    public void setVipCharge(Integer vipCharge) {
        this.vipCharge = vipCharge;
    }

    public String getDevInsInfo() {
        return devInsInfo;
    }

    public void setDevInsInfo(String devInsInfo) {
        this.devInsInfo = devInsInfo == null ? null : devInsInfo.trim();
    }

    public String getOpenBank() {
        return openBank;
    }

    public void setOpenBank(String openBank) {
        this.openBank = openBank == null ? null : openBank.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum == null ? null : accNum.trim();
    }

    public String getContactsNum() {
        return contactsNum;
    }

    public void setContactsNum(String contactsNum) {
        this.contactsNum = contactsNum == null ? null : contactsNum.trim();
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress == null ? null : postalAddress.trim();
    }

    public String getReceAddress() {
        return receAddress;
    }

    public void setReceAddress(String receAddress) {
        this.receAddress = receAddress == null ? null : receAddress.trim();
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}