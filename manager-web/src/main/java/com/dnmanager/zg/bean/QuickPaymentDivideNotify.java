package com.dnmanager.zg.bean;

import java.util.List;

/**
 * 用于快捷支付 时 分账回调
 */
public class QuickPaymentDivideNotify {

    private String payOrderNo;
    private String divideOrderNo;
    private String divideStatus;
    private String divideAmount;
    private List<DivideDetails> divideDeatilsList;


    public String getPayOrderNo() {
        return payOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
    }

    public String getDivideOrderNo() {
        return divideOrderNo;
    }

    public void setDivideOrderNo(String divideOrderNo) {
        this.divideOrderNo = divideOrderNo;
    }

    public String getDivideStatus() {
        return divideStatus;
    }

    public void setDivideStatus(String divideStatus) {
        this.divideStatus = divideStatus;
    }

    public String getDivideAmount() {
        return divideAmount;
    }

    public void setDivideAmount(String divideAmount) {
        this.divideAmount = divideAmount;
    }

    public List<DivideDetails> getDivideDeatilsList() {
        return divideDeatilsList;
    }

    public void setDivideDeatilsList(List<DivideDetails> divideDeatilsList) {
        this.divideDeatilsList = divideDeatilsList;
    }

    public static class DivideDetails {
        private String divideAccountNo;
        private String divideAmount;

        public String getDivideAccountNo() {
            return divideAccountNo;
        }

        public void setDivideAccountNo(String divideAccountNo) {
            this.divideAccountNo = divideAccountNo;
        }

        public String getDivideAmount() {
            return divideAmount;
        }

        public void setDivideAmount(String divideAmount) {
            this.divideAmount = divideAmount;
        }
    }
}
