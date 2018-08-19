package com.dnmanager.bean;

import com.dnmanager.pojo.Warn;

import java.util.ArrayList;
import java.util.List;

public class WarnMain {

    public static final int DEV_HAS = 1;
    public static final int DEV_NO_HAS = 0;

    private List<Warn> warnList;//异常警告列表

    private int isHasDev;//是否拥有设备 0-无 1-有


    public int getIsHasDev() {
        return isHasDev;
    }

    public void setIsHasDev(int isHasDev) {
        this.isHasDev = isHasDev;
    }


    public List<Warn> getWarnList() {
        if (warnList == null) {
            warnList = new ArrayList<>();
        }
        return warnList;
    }

    public void setWarnList(List<Warn> warnList) {
        this.warnList = warnList;
    }


}
