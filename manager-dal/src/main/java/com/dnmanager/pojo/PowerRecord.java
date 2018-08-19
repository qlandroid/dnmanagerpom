package com.dnmanager.pojo;

public class PowerRecord {
    private Integer id;

    private String code;

    private Integer ptime;

    private Integer electric;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getPtime() {
        return ptime;
    }

    public void setPtime(Integer ptime) {
        this.ptime = ptime;
    }

    public Integer getElectric() {
        return electric;
    }

    public void setElectric(Integer electric) {
        this.electric = electric;
    }
}