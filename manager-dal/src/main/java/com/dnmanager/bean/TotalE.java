package com.dnmanager.bean;

public class TotalE {

    private Long totalE;//总电量

    private Integer month;//月份
    private Integer year;//年份


    public Long getTotalE() {
        if (totalE == null) {
            return 0L;
        }
        return totalE;
    }

    public void setTotalE(Long totalE) {
        this.totalE = totalE;
    }


    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
