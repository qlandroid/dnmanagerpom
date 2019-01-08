package com.dnmanager.pojo;

public class User {
    private Integer id;

    private String username;

    private String nickname;

    private String password;

    private Integer regTime;

    private String regIp;

    private Integer loginTime;

    private String loginIp;

    private Byte isLock;

    private Short status;

    private Integer freeTest;

    private String vAccount;

    private String vPassword;

    private String vPhone;

    private String ytNum;

    private Integer recMoney;

    private Integer ledType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getRegTime() {
        return regTime;
    }

    public void setRegTime(Integer regTime) {
        this.regTime = regTime;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp == null ? null : regIp.trim();
    }

    public Integer getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Integer loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public Byte getIsLock() {
        return isLock;
    }

    public void setIsLock(Byte isLock) {
        this.isLock = isLock;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Integer getFreeTest() {
        return freeTest;
    }

    public void setFreeTest(Integer freeTest) {
        this.freeTest = freeTest;
    }

    public String getvAccount() {
        return vAccount;
    }

    public void setvAccount(String vAccount) {
        this.vAccount = vAccount == null ? null : vAccount.trim();
    }

    public String getvPassword() {
        return vPassword;
    }

    public void setvPassword(String vPassword) {
        this.vPassword = vPassword == null ? null : vPassword.trim();
    }

    public String getvPhone() {
        return vPhone;
    }

    public void setvPhone(String vPhone) {
        this.vPhone = vPhone == null ? null : vPhone.trim();
    }

    public String getYtNum() {
        return ytNum;
    }

    public void setYtNum(String ytNum) {
        this.ytNum = ytNum == null ? null : ytNum.trim();
    }

    public Integer getRecMoney() {
        return recMoney;
    }

    public void setRecMoney(Integer recMoney) {
        this.recMoney = recMoney;
    }

    public Integer getLedType() {
        return ledType;
    }

    public void setLedType(Integer ledType) {
        this.ledType = ledType;
    }
}