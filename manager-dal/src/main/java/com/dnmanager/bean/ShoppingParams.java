package com.dnmanager.bean;

import com.dnmanager.pojo.Commodity;
import com.dnmanager.pojo.CommodityExample;

public class ShoppingParams extends Commodity {
    private Integer goodsId;
    private Integer maxPrice;
    private Integer minPrice;

    private Integer pageSize;
    private Integer pageNum;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
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
        if (pageNum ==null) {
            return 1;
        }
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Integer maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Integer getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }

    public void setQuery(CommodityExample ce) {
        CommodityExample.Criteria criteria = ce.createCriteria();
        if (getId() != null) {

            criteria.andIdEqualTo(getId());
        }
        if (getTableName() != null) {

            criteria.andTableNameLike(getTableName());
        }
        String elecType = getElecType();
        if (elecType != null) {

            criteria.andElecTypeEqualTo(elecType);
        }
        Integer voltage = getVoltage();
        if (voltage != null) {
            criteria.andVoltageEqualTo(voltage);
        }
        String currentSpec = getCurrentSpec();
        if (currentSpec!=null) {

            criteria.andCurrentSpecEqualTo(currentSpec);
        }
        if (maxPrice!=null) {

            criteria.andGuidePriceLessThanOrEqualTo(maxPrice);
        }
        if (minPrice!=null) {

            criteria.andGuidePriceGreaterThan(minPrice);
        }

    }

}
