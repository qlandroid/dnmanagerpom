package com.dnmanager.bean;

import com.dnmanager.pojo.Device;

public class DevDetails {

    private Device devO;
    private String power;//等级
    private TotalE totalE;//总  统计
    private TotalE monthE;//月份统计
    private TotalE yearE;//年份统计
    private Double unit;//电表单价
    private Integer bindDate;//绑定日期
    private int buyElectric;//剩余电量

    public Device getDevO() {
        return devO;
    }

    public void setDevO(Device devO) {
        this.devO = devO;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public TotalE getTotalE() {
        return totalE;
    }

    public void setTotalE(TotalE totalE) {
        this.totalE = totalE;
    }

    public TotalE getMonthE() {
        return monthE;
    }

    public void setMonthE(TotalE monthE) {
        this.monthE = monthE;
    }

    public TotalE getYearE() {
        return yearE;
    }

    public void setYearE(TotalE yearE) {
        this.yearE = yearE;
    }

    public Double getUnit() {
        if (unit == null) {
            return 0.0d;
        }
        return unit;
    }

    public void setUnit(Double unit) {
        this.unit = unit;
    }

    public Integer getBindDate() {
        return bindDate;
    }

    public void setBindDate(Integer bindDate) {
        this.bindDate = bindDate;
    }

    public Integer getBuyElectric() {
        return buyElectric;
    }

    public void setBuyElectric(Integer buyElectric) {
        this.buyElectric = buyElectric;
    }
}
