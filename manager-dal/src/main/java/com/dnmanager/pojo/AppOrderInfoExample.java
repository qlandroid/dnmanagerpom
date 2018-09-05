package com.dnmanager.pojo;

import java.util.ArrayList;
import java.util.List;

public class AppOrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppOrderInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNull() {
            addCriterion("device_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNotNull() {
            addCriterion("device_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameEqualTo(String value) {
            addCriterion("device_name =", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotEqualTo(String value) {
            addCriterion("device_name <>", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThan(String value) {
            addCriterion("device_name >", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_name >=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThan(String value) {
            addCriterion("device_name <", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("device_name <=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLike(String value) {
            addCriterion("device_name like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotLike(String value) {
            addCriterion("device_name not like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIn(List<String> values) {
            addCriterion("device_name in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotIn(List<String> values) {
            addCriterion("device_name not in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameBetween(String value1, String value2) {
            addCriterion("device_name between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotBetween(String value1, String value2) {
            addCriterion("device_name not between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNull() {
            addCriterion("device_type is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNotNull() {
            addCriterion("device_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeEqualTo(String value) {
            addCriterion("device_type =", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotEqualTo(String value) {
            addCriterion("device_type <>", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThan(String value) {
            addCriterion("device_type >", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("device_type >=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThan(String value) {
            addCriterion("device_type <", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThanOrEqualTo(String value) {
            addCriterion("device_type <=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLike(String value) {
            addCriterion("device_type like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotLike(String value) {
            addCriterion("device_type not like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIn(List<String> values) {
            addCriterion("device_type in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotIn(List<String> values) {
            addCriterion("device_type not in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeBetween(String value1, String value2) {
            addCriterion("device_type between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotBetween(String value1, String value2) {
            addCriterion("device_type not between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andVoltageIsNull() {
            addCriterion("voltage is null");
            return (Criteria) this;
        }

        public Criteria andVoltageIsNotNull() {
            addCriterion("voltage is not null");
            return (Criteria) this;
        }

        public Criteria andVoltageEqualTo(Integer value) {
            addCriterion("voltage =", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotEqualTo(Integer value) {
            addCriterion("voltage <>", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageGreaterThan(Integer value) {
            addCriterion("voltage >", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageGreaterThanOrEqualTo(Integer value) {
            addCriterion("voltage >=", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageLessThan(Integer value) {
            addCriterion("voltage <", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageLessThanOrEqualTo(Integer value) {
            addCriterion("voltage <=", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageIn(List<Integer> values) {
            addCriterion("voltage in", values, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotIn(List<Integer> values) {
            addCriterion("voltage not in", values, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageBetween(Integer value1, Integer value2) {
            addCriterion("voltage between", value1, value2, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotBetween(Integer value1, Integer value2) {
            addCriterion("voltage not between", value1, value2, "voltage");
            return (Criteria) this;
        }

        public Criteria andCurrentSpecIsNull() {
            addCriterion("current_spec is null");
            return (Criteria) this;
        }

        public Criteria andCurrentSpecIsNotNull() {
            addCriterion("current_spec is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentSpecEqualTo(String value) {
            addCriterion("current_spec =", value, "currentSpec");
            return (Criteria) this;
        }

        public Criteria andCurrentSpecNotEqualTo(String value) {
            addCriterion("current_spec <>", value, "currentSpec");
            return (Criteria) this;
        }

        public Criteria andCurrentSpecGreaterThan(String value) {
            addCriterion("current_spec >", value, "currentSpec");
            return (Criteria) this;
        }

        public Criteria andCurrentSpecGreaterThanOrEqualTo(String value) {
            addCriterion("current_spec >=", value, "currentSpec");
            return (Criteria) this;
        }

        public Criteria andCurrentSpecLessThan(String value) {
            addCriterion("current_spec <", value, "currentSpec");
            return (Criteria) this;
        }

        public Criteria andCurrentSpecLessThanOrEqualTo(String value) {
            addCriterion("current_spec <=", value, "currentSpec");
            return (Criteria) this;
        }

        public Criteria andCurrentSpecLike(String value) {
            addCriterion("current_spec like", value, "currentSpec");
            return (Criteria) this;
        }

        public Criteria andCurrentSpecNotLike(String value) {
            addCriterion("current_spec not like", value, "currentSpec");
            return (Criteria) this;
        }

        public Criteria andCurrentSpecIn(List<String> values) {
            addCriterion("current_spec in", values, "currentSpec");
            return (Criteria) this;
        }

        public Criteria andCurrentSpecNotIn(List<String> values) {
            addCriterion("current_spec not in", values, "currentSpec");
            return (Criteria) this;
        }

        public Criteria andCurrentSpecBetween(String value1, String value2) {
            addCriterion("current_spec between", value1, value2, "currentSpec");
            return (Criteria) this;
        }

        public Criteria andCurrentSpecNotBetween(String value1, String value2) {
            addCriterion("current_spec not between", value1, value2, "currentSpec");
            return (Criteria) this;
        }

        public Criteria andDeviceNumIsNull() {
            addCriterion("device_num is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNumIsNotNull() {
            addCriterion("device_num is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNumEqualTo(Integer value) {
            addCriterion("device_num =", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumNotEqualTo(Integer value) {
            addCriterion("device_num <>", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumGreaterThan(Integer value) {
            addCriterion("device_num >", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_num >=", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumLessThan(Integer value) {
            addCriterion("device_num <", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumLessThanOrEqualTo(Integer value) {
            addCriterion("device_num <=", value, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumIn(List<Integer> values) {
            addCriterion("device_num in", values, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumNotIn(List<Integer> values) {
            addCriterion("device_num not in", values, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumBetween(Integer value1, Integer value2) {
            addCriterion("device_num between", value1, value2, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andDeviceNumNotBetween(Integer value1, Integer value2) {
            addCriterion("device_num not between", value1, value2, "deviceNum");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andChargeIsNull() {
            addCriterion("charge is null");
            return (Criteria) this;
        }

        public Criteria andChargeIsNotNull() {
            addCriterion("charge is not null");
            return (Criteria) this;
        }

        public Criteria andChargeEqualTo(Integer value) {
            addCriterion("charge =", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotEqualTo(Integer value) {
            addCriterion("charge <>", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeGreaterThan(Integer value) {
            addCriterion("charge >", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge >=", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLessThan(Integer value) {
            addCriterion("charge <", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLessThanOrEqualTo(Integer value) {
            addCriterion("charge <=", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeIn(List<Integer> values) {
            addCriterion("charge in", values, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotIn(List<Integer> values) {
            addCriterion("charge not in", values, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeBetween(Integer value1, Integer value2) {
            addCriterion("charge between", value1, value2, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotBetween(Integer value1, Integer value2) {
            addCriterion("charge not between", value1, value2, "charge");
            return (Criteria) this;
        }

        public Criteria andVipPriceIsNull() {
            addCriterion("vip_price is null");
            return (Criteria) this;
        }

        public Criteria andVipPriceIsNotNull() {
            addCriterion("vip_price is not null");
            return (Criteria) this;
        }

        public Criteria andVipPriceEqualTo(Integer value) {
            addCriterion("vip_price =", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceNotEqualTo(Integer value) {
            addCriterion("vip_price <>", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceGreaterThan(Integer value) {
            addCriterion("vip_price >", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_price >=", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceLessThan(Integer value) {
            addCriterion("vip_price <", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceLessThanOrEqualTo(Integer value) {
            addCriterion("vip_price <=", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceIn(List<Integer> values) {
            addCriterion("vip_price in", values, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceNotIn(List<Integer> values) {
            addCriterion("vip_price not in", values, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceBetween(Integer value1, Integer value2) {
            addCriterion("vip_price between", value1, value2, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_price not between", value1, value2, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipChargeIsNull() {
            addCriterion("vip_charge is null");
            return (Criteria) this;
        }

        public Criteria andVipChargeIsNotNull() {
            addCriterion("vip_charge is not null");
            return (Criteria) this;
        }

        public Criteria andVipChargeEqualTo(Integer value) {
            addCriterion("vip_charge =", value, "vipCharge");
            return (Criteria) this;
        }

        public Criteria andVipChargeNotEqualTo(Integer value) {
            addCriterion("vip_charge <>", value, "vipCharge");
            return (Criteria) this;
        }

        public Criteria andVipChargeGreaterThan(Integer value) {
            addCriterion("vip_charge >", value, "vipCharge");
            return (Criteria) this;
        }

        public Criteria andVipChargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_charge >=", value, "vipCharge");
            return (Criteria) this;
        }

        public Criteria andVipChargeLessThan(Integer value) {
            addCriterion("vip_charge <", value, "vipCharge");
            return (Criteria) this;
        }

        public Criteria andVipChargeLessThanOrEqualTo(Integer value) {
            addCriterion("vip_charge <=", value, "vipCharge");
            return (Criteria) this;
        }

        public Criteria andVipChargeIn(List<Integer> values) {
            addCriterion("vip_charge in", values, "vipCharge");
            return (Criteria) this;
        }

        public Criteria andVipChargeNotIn(List<Integer> values) {
            addCriterion("vip_charge not in", values, "vipCharge");
            return (Criteria) this;
        }

        public Criteria andVipChargeBetween(Integer value1, Integer value2) {
            addCriterion("vip_charge between", value1, value2, "vipCharge");
            return (Criteria) this;
        }

        public Criteria andVipChargeNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_charge not between", value1, value2, "vipCharge");
            return (Criteria) this;
        }

        public Criteria andDevInsInfoIsNull() {
            addCriterion("dev_ins_info is null");
            return (Criteria) this;
        }

        public Criteria andDevInsInfoIsNotNull() {
            addCriterion("dev_ins_info is not null");
            return (Criteria) this;
        }

        public Criteria andDevInsInfoEqualTo(String value) {
            addCriterion("dev_ins_info =", value, "devInsInfo");
            return (Criteria) this;
        }

        public Criteria andDevInsInfoNotEqualTo(String value) {
            addCriterion("dev_ins_info <>", value, "devInsInfo");
            return (Criteria) this;
        }

        public Criteria andDevInsInfoGreaterThan(String value) {
            addCriterion("dev_ins_info >", value, "devInsInfo");
            return (Criteria) this;
        }

        public Criteria andDevInsInfoGreaterThanOrEqualTo(String value) {
            addCriterion("dev_ins_info >=", value, "devInsInfo");
            return (Criteria) this;
        }

        public Criteria andDevInsInfoLessThan(String value) {
            addCriterion("dev_ins_info <", value, "devInsInfo");
            return (Criteria) this;
        }

        public Criteria andDevInsInfoLessThanOrEqualTo(String value) {
            addCriterion("dev_ins_info <=", value, "devInsInfo");
            return (Criteria) this;
        }

        public Criteria andDevInsInfoLike(String value) {
            addCriterion("dev_ins_info like", value, "devInsInfo");
            return (Criteria) this;
        }

        public Criteria andDevInsInfoNotLike(String value) {
            addCriterion("dev_ins_info not like", value, "devInsInfo");
            return (Criteria) this;
        }

        public Criteria andDevInsInfoIn(List<String> values) {
            addCriterion("dev_ins_info in", values, "devInsInfo");
            return (Criteria) this;
        }

        public Criteria andDevInsInfoNotIn(List<String> values) {
            addCriterion("dev_ins_info not in", values, "devInsInfo");
            return (Criteria) this;
        }

        public Criteria andDevInsInfoBetween(String value1, String value2) {
            addCriterion("dev_ins_info between", value1, value2, "devInsInfo");
            return (Criteria) this;
        }

        public Criteria andDevInsInfoNotBetween(String value1, String value2) {
            addCriterion("dev_ins_info not between", value1, value2, "devInsInfo");
            return (Criteria) this;
        }

        public Criteria andOpenBankIsNull() {
            addCriterion("open_bank is null");
            return (Criteria) this;
        }

        public Criteria andOpenBankIsNotNull() {
            addCriterion("open_bank is not null");
            return (Criteria) this;
        }

        public Criteria andOpenBankEqualTo(String value) {
            addCriterion("open_bank =", value, "openBank");
            return (Criteria) this;
        }

        public Criteria andOpenBankNotEqualTo(String value) {
            addCriterion("open_bank <>", value, "openBank");
            return (Criteria) this;
        }

        public Criteria andOpenBankGreaterThan(String value) {
            addCriterion("open_bank >", value, "openBank");
            return (Criteria) this;
        }

        public Criteria andOpenBankGreaterThanOrEqualTo(String value) {
            addCriterion("open_bank >=", value, "openBank");
            return (Criteria) this;
        }

        public Criteria andOpenBankLessThan(String value) {
            addCriterion("open_bank <", value, "openBank");
            return (Criteria) this;
        }

        public Criteria andOpenBankLessThanOrEqualTo(String value) {
            addCriterion("open_bank <=", value, "openBank");
            return (Criteria) this;
        }

        public Criteria andOpenBankLike(String value) {
            addCriterion("open_bank like", value, "openBank");
            return (Criteria) this;
        }

        public Criteria andOpenBankNotLike(String value) {
            addCriterion("open_bank not like", value, "openBank");
            return (Criteria) this;
        }

        public Criteria andOpenBankIn(List<String> values) {
            addCriterion("open_bank in", values, "openBank");
            return (Criteria) this;
        }

        public Criteria andOpenBankNotIn(List<String> values) {
            addCriterion("open_bank not in", values, "openBank");
            return (Criteria) this;
        }

        public Criteria andOpenBankBetween(String value1, String value2) {
            addCriterion("open_bank between", value1, value2, "openBank");
            return (Criteria) this;
        }

        public Criteria andOpenBankNotBetween(String value1, String value2) {
            addCriterion("open_bank not between", value1, value2, "openBank");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andContactsIsNull() {
            addCriterion("contacts is null");
            return (Criteria) this;
        }

        public Criteria andContactsIsNotNull() {
            addCriterion("contacts is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEqualTo(String value) {
            addCriterion("contacts =", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("contacts <>", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThan(String value) {
            addCriterion("contacts >", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("contacts >=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThan(String value) {
            addCriterion("contacts <", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("contacts <=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLike(String value) {
            addCriterion("contacts like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotLike(String value) {
            addCriterion("contacts not like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsIn(List<String> values) {
            addCriterion("contacts in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("contacts not in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("contacts between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("contacts not between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andAccNumIsNull() {
            addCriterion("acc_num is null");
            return (Criteria) this;
        }

        public Criteria andAccNumIsNotNull() {
            addCriterion("acc_num is not null");
            return (Criteria) this;
        }

        public Criteria andAccNumEqualTo(String value) {
            addCriterion("acc_num =", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumNotEqualTo(String value) {
            addCriterion("acc_num <>", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumGreaterThan(String value) {
            addCriterion("acc_num >", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumGreaterThanOrEqualTo(String value) {
            addCriterion("acc_num >=", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumLessThan(String value) {
            addCriterion("acc_num <", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumLessThanOrEqualTo(String value) {
            addCriterion("acc_num <=", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumLike(String value) {
            addCriterion("acc_num like", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumNotLike(String value) {
            addCriterion("acc_num not like", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumIn(List<String> values) {
            addCriterion("acc_num in", values, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumNotIn(List<String> values) {
            addCriterion("acc_num not in", values, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumBetween(String value1, String value2) {
            addCriterion("acc_num between", value1, value2, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumNotBetween(String value1, String value2) {
            addCriterion("acc_num not between", value1, value2, "accNum");
            return (Criteria) this;
        }

        public Criteria andContactsNumIsNull() {
            addCriterion("contacts_num is null");
            return (Criteria) this;
        }

        public Criteria andContactsNumIsNotNull() {
            addCriterion("contacts_num is not null");
            return (Criteria) this;
        }

        public Criteria andContactsNumEqualTo(String value) {
            addCriterion("contacts_num =", value, "contactsNum");
            return (Criteria) this;
        }

        public Criteria andContactsNumNotEqualTo(String value) {
            addCriterion("contacts_num <>", value, "contactsNum");
            return (Criteria) this;
        }

        public Criteria andContactsNumGreaterThan(String value) {
            addCriterion("contacts_num >", value, "contactsNum");
            return (Criteria) this;
        }

        public Criteria andContactsNumGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_num >=", value, "contactsNum");
            return (Criteria) this;
        }

        public Criteria andContactsNumLessThan(String value) {
            addCriterion("contacts_num <", value, "contactsNum");
            return (Criteria) this;
        }

        public Criteria andContactsNumLessThanOrEqualTo(String value) {
            addCriterion("contacts_num <=", value, "contactsNum");
            return (Criteria) this;
        }

        public Criteria andContactsNumLike(String value) {
            addCriterion("contacts_num like", value, "contactsNum");
            return (Criteria) this;
        }

        public Criteria andContactsNumNotLike(String value) {
            addCriterion("contacts_num not like", value, "contactsNum");
            return (Criteria) this;
        }

        public Criteria andContactsNumIn(List<String> values) {
            addCriterion("contacts_num in", values, "contactsNum");
            return (Criteria) this;
        }

        public Criteria andContactsNumNotIn(List<String> values) {
            addCriterion("contacts_num not in", values, "contactsNum");
            return (Criteria) this;
        }

        public Criteria andContactsNumBetween(String value1, String value2) {
            addCriterion("contacts_num between", value1, value2, "contactsNum");
            return (Criteria) this;
        }

        public Criteria andContactsNumNotBetween(String value1, String value2) {
            addCriterion("contacts_num not between", value1, value2, "contactsNum");
            return (Criteria) this;
        }

        public Criteria andPostalAddressIsNull() {
            addCriterion("postal_address is null");
            return (Criteria) this;
        }

        public Criteria andPostalAddressIsNotNull() {
            addCriterion("postal_address is not null");
            return (Criteria) this;
        }

        public Criteria andPostalAddressEqualTo(String value) {
            addCriterion("postal_address =", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressNotEqualTo(String value) {
            addCriterion("postal_address <>", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressGreaterThan(String value) {
            addCriterion("postal_address >", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressGreaterThanOrEqualTo(String value) {
            addCriterion("postal_address >=", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressLessThan(String value) {
            addCriterion("postal_address <", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressLessThanOrEqualTo(String value) {
            addCriterion("postal_address <=", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressLike(String value) {
            addCriterion("postal_address like", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressNotLike(String value) {
            addCriterion("postal_address not like", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressIn(List<String> values) {
            addCriterion("postal_address in", values, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressNotIn(List<String> values) {
            addCriterion("postal_address not in", values, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressBetween(String value1, String value2) {
            addCriterion("postal_address between", value1, value2, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressNotBetween(String value1, String value2) {
            addCriterion("postal_address not between", value1, value2, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andReceAddressIsNull() {
            addCriterion("rece_address is null");
            return (Criteria) this;
        }

        public Criteria andReceAddressIsNotNull() {
            addCriterion("rece_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceAddressEqualTo(String value) {
            addCriterion("rece_address =", value, "receAddress");
            return (Criteria) this;
        }

        public Criteria andReceAddressNotEqualTo(String value) {
            addCriterion("rece_address <>", value, "receAddress");
            return (Criteria) this;
        }

        public Criteria andReceAddressGreaterThan(String value) {
            addCriterion("rece_address >", value, "receAddress");
            return (Criteria) this;
        }

        public Criteria andReceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("rece_address >=", value, "receAddress");
            return (Criteria) this;
        }

        public Criteria andReceAddressLessThan(String value) {
            addCriterion("rece_address <", value, "receAddress");
            return (Criteria) this;
        }

        public Criteria andReceAddressLessThanOrEqualTo(String value) {
            addCriterion("rece_address <=", value, "receAddress");
            return (Criteria) this;
        }

        public Criteria andReceAddressLike(String value) {
            addCriterion("rece_address like", value, "receAddress");
            return (Criteria) this;
        }

        public Criteria andReceAddressNotLike(String value) {
            addCriterion("rece_address not like", value, "receAddress");
            return (Criteria) this;
        }

        public Criteria andReceAddressIn(List<String> values) {
            addCriterion("rece_address in", values, "receAddress");
            return (Criteria) this;
        }

        public Criteria andReceAddressNotIn(List<String> values) {
            addCriterion("rece_address not in", values, "receAddress");
            return (Criteria) this;
        }

        public Criteria andReceAddressBetween(String value1, String value2) {
            addCriterion("rece_address between", value1, value2, "receAddress");
            return (Criteria) this;
        }

        public Criteria andReceAddressNotBetween(String value1, String value2) {
            addCriterion("rece_address not between", value1, value2, "receAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("consignee like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("consignee not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}