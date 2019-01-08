package com.dnmanager.zg.bean;


/**
 * 分账信息
 */
public class DivideInfo {
    public static final String DIVIDE_MODE_1 = "1";
    public static final String DIVIDE_MODE_2 = "2";
    //分账收款方银通账号
    private String divideAccount;
    //分账方式
    private String divideMode;//1-按比例，2-按金额
    //分账方式值 按比例 %  按金额单位：分
    private String divideModeValue;
    //备注
    private String comment;

    public String getDivideMode() {
        return divideMode;
    }

    public void setDivideMode(String divideMode) {
        this.divideMode = divideMode;
    }

    public String getDivideModeValue() {
        return divideModeValue;
    }

    public void setDivideModeValue(String divideModeValue) {
        this.divideModeValue = divideModeValue;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDivideAccount() {
        return divideAccount;
    }

    public void setDivideAccount(String divideAccount) {
        this.divideAccount = divideAccount;
    }
}
