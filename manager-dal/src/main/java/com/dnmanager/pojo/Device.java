package com.dnmanager.pojo;

import java.math.BigDecimal;

public class Device {
    private Integer id;

    private String typeId;

    private String code;

    private Integer buyElectric;

    private Integer electric;

    private Short status;

    private Integer categoryId;

    private Integer operatorId;

    private Integer detailedId;

    private String deviceAdmin;

    private String deviceAddress;

    private Integer usersId;

    private Integer time;

    private Integer money;

    private Integer balance;

    private Short dStatus;

    private Integer voltage;

    private Integer electricCurrent;

    private Integer power;

    private Integer reactivePower;

    private Integer apparentPower;

    private Integer powerFactor;

    private Integer frequency;

    private Integer leakageCurrent;

    private Integer temperature;

    private Integer humidity;

    private Integer detectionsign;

    private Integer version;

    private Integer updatetime;

    private String nickname;

    private Short elecStatus;

    private Integer replaceStatus;

    private String replaceReason;

    private BigDecimal latitude;

    private BigDecimal longitude;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getBuyElectric() {
        return buyElectric;
    }

    public void setBuyElectric(Integer buyElectric) {
        this.buyElectric = buyElectric;
    }

    public Integer getElectric() {
        return electric;
    }

    public void setElectric(Integer electric) {
        this.electric = electric;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getDetailedId() {
        return detailedId;
    }

    public void setDetailedId(Integer detailedId) {
        this.detailedId = detailedId;
    }

    public String getDeviceAdmin() {
        return deviceAdmin;
    }

    public void setDeviceAdmin(String deviceAdmin) {
        this.deviceAdmin = deviceAdmin == null ? null : deviceAdmin.trim();
    }

    public String getDeviceAddress() {
        return deviceAddress;
    }

    public void setDeviceAddress(String deviceAddress) {
        this.deviceAddress = deviceAddress == null ? null : deviceAddress.trim();
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Short getdStatus() {
        return dStatus;
    }

    public void setdStatus(Short dStatus) {
        this.dStatus = dStatus;
    }

    public Integer getVoltage() {
        return voltage;
    }

    public void setVoltage(Integer voltage) {
        this.voltage = voltage;
    }

    public Integer getElectricCurrent() {
        return electricCurrent;
    }

    public void setElectricCurrent(Integer electricCurrent) {
        this.electricCurrent = electricCurrent;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getReactivePower() {
        return reactivePower;
    }

    public void setReactivePower(Integer reactivePower) {
        this.reactivePower = reactivePower;
    }

    public Integer getApparentPower() {
        return apparentPower;
    }

    public void setApparentPower(Integer apparentPower) {
        this.apparentPower = apparentPower;
    }

    public Integer getPowerFactor() {
        return powerFactor;
    }

    public void setPowerFactor(Integer powerFactor) {
        this.powerFactor = powerFactor;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Integer getLeakageCurrent() {
        return leakageCurrent;
    }

    public void setLeakageCurrent(Integer leakageCurrent) {
        this.leakageCurrent = leakageCurrent;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getDetectionsign() {
        return detectionsign;
    }

    public void setDetectionsign(Integer detectionsign) {
        this.detectionsign = detectionsign;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Integer updatetime) {
        this.updatetime = updatetime;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Short getElecStatus() {
        return elecStatus;
    }

    public void setElecStatus(Short elecStatus) {
        this.elecStatus = elecStatus;
    }

    public Integer getReplaceStatus() {
        return replaceStatus;
    }

    public void setReplaceStatus(Integer replaceStatus) {
        this.replaceStatus = replaceStatus;
    }

    public String getReplaceReason() {
        return replaceReason;
    }

    public void setReplaceReason(String replaceReason) {
        this.replaceReason = replaceReason == null ? null : replaceReason.trim();
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
}