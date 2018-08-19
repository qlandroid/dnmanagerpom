package com.dnmanager.bean;

import com.dnmanager.pojo.PowerRecord;

public class PowerRecordExt extends PowerRecord {

    private Long startD;
    private Long endD;

    private Long total;


    public Long getStartD() {
        return startD;
    }

    public void setStartD(Long startD) {
        this.startD = startD;
    }

    public Long getEndD() {
        return endD;
    }

    public void setEndD(Long endD) {
        this.endD = endD;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
