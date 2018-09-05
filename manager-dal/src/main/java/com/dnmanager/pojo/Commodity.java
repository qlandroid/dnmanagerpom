package com.dnmanager.pojo;


public class Commodity{
    private Integer id;

    private String tableName;

    private String commodityName;

    private String elecType;

    private Integer voltage;

    private String currentSpec;

    private String pulseCons;

    private String accClass;

    private Integer frequency;

    private Integer guidePrice;

    private String bannerImg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public String getElecType() {
        return elecType;
    }

    public void setElecType(String elecType) {
        this.elecType = elecType == null ? null : elecType.trim();
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

    public String getPulseCons() {
        return pulseCons;
    }

    public void setPulseCons(String pulseCons) {
        this.pulseCons = pulseCons == null ? null : pulseCons.trim();
    }

    public String getAccClass() {
        return accClass;
    }

    public void setAccClass(String accClass) {
        this.accClass = accClass == null ? null : accClass.trim();
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Integer getGuidePrice() {
        return guidePrice;
    }

    public void setGuidePrice(Integer guidePrice) {
        this.guidePrice = guidePrice;
    }

    public String getBannerImg() {
        return bannerImg;
    }

    public void setBannerImg(String bannerImg) {
        this.bannerImg = bannerImg == null ? null : bannerImg.trim();
    }
}