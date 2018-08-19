package com.dnmanager.pojo;

public class ThreePhase {
    private Integer id;

    private Integer deviceId;

    private String code;

    private Integer voltageB;

    private Integer electricCurrentB;

    private Integer powerB;

    private Integer reactivePowerB;

    private Integer powerFactorB;

    private Integer apparentPowerB;

    private Integer voltageC;

    private Integer electricCurrentC;

    private Integer powerC;

    private Integer reactivePowerC;

    private Integer powerFactorC;

    private Integer apparentPowerC;

    private Integer temperatureB;

    private Integer temperatureC;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getVoltageB() {
        return voltageB;
    }

    public void setVoltageB(Integer voltageB) {
        this.voltageB = voltageB;
    }

    public Integer getElectricCurrentB() {
        return electricCurrentB;
    }

    public void setElectricCurrentB(Integer electricCurrentB) {
        this.electricCurrentB = electricCurrentB;
    }

    public Integer getPowerB() {
        return powerB;
    }

    public void setPowerB(Integer powerB) {
        this.powerB = powerB;
    }

    public Integer getReactivePowerB() {
        return reactivePowerB;
    }

    public void setReactivePowerB(Integer reactivePowerB) {
        this.reactivePowerB = reactivePowerB;
    }

    public Integer getPowerFactorB() {
        return powerFactorB;
    }

    public void setPowerFactorB(Integer powerFactorB) {
        this.powerFactorB = powerFactorB;
    }

    public Integer getApparentPowerB() {
        return apparentPowerB;
    }

    public void setApparentPowerB(Integer apparentPowerB) {
        this.apparentPowerB = apparentPowerB;
    }

    public Integer getVoltageC() {
        return voltageC;
    }

    public void setVoltageC(Integer voltageC) {
        this.voltageC = voltageC;
    }

    public Integer getElectricCurrentC() {
        return electricCurrentC;
    }

    public void setElectricCurrentC(Integer electricCurrentC) {
        this.electricCurrentC = electricCurrentC;
    }

    public Integer getPowerC() {
        return powerC;
    }

    public void setPowerC(Integer powerC) {
        this.powerC = powerC;
    }

    public Integer getReactivePowerC() {
        return reactivePowerC;
    }

    public void setReactivePowerC(Integer reactivePowerC) {
        this.reactivePowerC = reactivePowerC;
    }

    public Integer getPowerFactorC() {
        return powerFactorC;
    }

    public void setPowerFactorC(Integer powerFactorC) {
        this.powerFactorC = powerFactorC;
    }

    public Integer getApparentPowerC() {
        return apparentPowerC;
    }

    public void setApparentPowerC(Integer apparentPowerC) {
        this.apparentPowerC = apparentPowerC;
    }

    public Integer getTemperatureB() {
        return temperatureB;
    }

    public void setTemperatureB(Integer temperatureB) {
        this.temperatureB = temperatureB;
    }

    public Integer getTemperatureC() {
        return temperatureC;
    }

    public void setTemperatureC(Integer temperatureC) {
        this.temperatureC = temperatureC;
    }
}