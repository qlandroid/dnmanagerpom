package com.dnmanager.pojo;

public class Warn {
    private Integer id;

    private String warn;//报警原因

    private Device device;

    private Integer wtime;//报警时间

    private Integer deviceId;//设备

    private String code;//设备编号

    private Short handleStatus;//处理状态

    private Integer alarmType;//报警类型0掉线 1过压报警 2欠压 4过载 8空载 16温度 32湿度

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWarn() {
        return warn;
    }

    public void setWarn(String warn) {
        this.warn = warn == null ? null : warn.trim();
    }

    public Integer getWtime() {
        return wtime;
    }

    public void setWtime(Integer wtime) {
        this.wtime = wtime;
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

    public Short getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(Short handleStatus) {
        this.handleStatus = handleStatus;
    }

    public Integer getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(Integer alarmType) {
        this.alarmType = alarmType;
    }
}