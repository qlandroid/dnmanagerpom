package com.dnmanager.pojo;

public class Category {
    private Integer id;

    private String category;

    private Integer vipPrice;

    private Integer vipCharge;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Integer getVipPrice() {
        return vipPrice;
    }

    public void setVipPrice(Integer vipPrice) {
        this.vipPrice = vipPrice;
    }

    public Integer getVipCharge() {
        return vipCharge;
    }

    public void setVipCharge(Integer vipCharge) {
        this.vipCharge = vipCharge;
    }
}