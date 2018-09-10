package com.dnmanager.select;

import com.dnmanager.pojo.Vip;

public class VipSelect extends Vip{

    private Integer pageSize;
    private Integer pageNum;
    private Integer devId;

    public Integer getDevId() {
        return devId;
    }

    public void setDevId(Integer devId) {
        this.devId = devId;
    }

    public Integer getPageSize() {
        if (pageSize == null) {
            return 20;
        }
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        if (pageNum == null) {
            return  1;
        }
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}
