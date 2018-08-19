package com.dnmanager.pojo;

import java.util.ArrayList;
import java.util.List;

public class ThreePhaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThreePhaseExample() {
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

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(Integer value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(Integer value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(Integer value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(Integer value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(Integer value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<Integer> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<Integer> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(Integer value1, Integer value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andVoltageBIsNull() {
            addCriterion("voltage_b is null");
            return (Criteria) this;
        }

        public Criteria andVoltageBIsNotNull() {
            addCriterion("voltage_b is not null");
            return (Criteria) this;
        }

        public Criteria andVoltageBEqualTo(Integer value) {
            addCriterion("voltage_b =", value, "voltageB");
            return (Criteria) this;
        }

        public Criteria andVoltageBNotEqualTo(Integer value) {
            addCriterion("voltage_b <>", value, "voltageB");
            return (Criteria) this;
        }

        public Criteria andVoltageBGreaterThan(Integer value) {
            addCriterion("voltage_b >", value, "voltageB");
            return (Criteria) this;
        }

        public Criteria andVoltageBGreaterThanOrEqualTo(Integer value) {
            addCriterion("voltage_b >=", value, "voltageB");
            return (Criteria) this;
        }

        public Criteria andVoltageBLessThan(Integer value) {
            addCriterion("voltage_b <", value, "voltageB");
            return (Criteria) this;
        }

        public Criteria andVoltageBLessThanOrEqualTo(Integer value) {
            addCriterion("voltage_b <=", value, "voltageB");
            return (Criteria) this;
        }

        public Criteria andVoltageBIn(List<Integer> values) {
            addCriterion("voltage_b in", values, "voltageB");
            return (Criteria) this;
        }

        public Criteria andVoltageBNotIn(List<Integer> values) {
            addCriterion("voltage_b not in", values, "voltageB");
            return (Criteria) this;
        }

        public Criteria andVoltageBBetween(Integer value1, Integer value2) {
            addCriterion("voltage_b between", value1, value2, "voltageB");
            return (Criteria) this;
        }

        public Criteria andVoltageBNotBetween(Integer value1, Integer value2) {
            addCriterion("voltage_b not between", value1, value2, "voltageB");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentBIsNull() {
            addCriterion("electric_current_b is null");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentBIsNotNull() {
            addCriterion("electric_current_b is not null");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentBEqualTo(Integer value) {
            addCriterion("electric_current_b =", value, "electricCurrentB");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentBNotEqualTo(Integer value) {
            addCriterion("electric_current_b <>", value, "electricCurrentB");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentBGreaterThan(Integer value) {
            addCriterion("electric_current_b >", value, "electricCurrentB");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentBGreaterThanOrEqualTo(Integer value) {
            addCriterion("electric_current_b >=", value, "electricCurrentB");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentBLessThan(Integer value) {
            addCriterion("electric_current_b <", value, "electricCurrentB");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentBLessThanOrEqualTo(Integer value) {
            addCriterion("electric_current_b <=", value, "electricCurrentB");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentBIn(List<Integer> values) {
            addCriterion("electric_current_b in", values, "electricCurrentB");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentBNotIn(List<Integer> values) {
            addCriterion("electric_current_b not in", values, "electricCurrentB");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentBBetween(Integer value1, Integer value2) {
            addCriterion("electric_current_b between", value1, value2, "electricCurrentB");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentBNotBetween(Integer value1, Integer value2) {
            addCriterion("electric_current_b not between", value1, value2, "electricCurrentB");
            return (Criteria) this;
        }

        public Criteria andPowerBIsNull() {
            addCriterion("power_b is null");
            return (Criteria) this;
        }

        public Criteria andPowerBIsNotNull() {
            addCriterion("power_b is not null");
            return (Criteria) this;
        }

        public Criteria andPowerBEqualTo(Integer value) {
            addCriterion("power_b =", value, "powerB");
            return (Criteria) this;
        }

        public Criteria andPowerBNotEqualTo(Integer value) {
            addCriterion("power_b <>", value, "powerB");
            return (Criteria) this;
        }

        public Criteria andPowerBGreaterThan(Integer value) {
            addCriterion("power_b >", value, "powerB");
            return (Criteria) this;
        }

        public Criteria andPowerBGreaterThanOrEqualTo(Integer value) {
            addCriterion("power_b >=", value, "powerB");
            return (Criteria) this;
        }

        public Criteria andPowerBLessThan(Integer value) {
            addCriterion("power_b <", value, "powerB");
            return (Criteria) this;
        }

        public Criteria andPowerBLessThanOrEqualTo(Integer value) {
            addCriterion("power_b <=", value, "powerB");
            return (Criteria) this;
        }

        public Criteria andPowerBIn(List<Integer> values) {
            addCriterion("power_b in", values, "powerB");
            return (Criteria) this;
        }

        public Criteria andPowerBNotIn(List<Integer> values) {
            addCriterion("power_b not in", values, "powerB");
            return (Criteria) this;
        }

        public Criteria andPowerBBetween(Integer value1, Integer value2) {
            addCriterion("power_b between", value1, value2, "powerB");
            return (Criteria) this;
        }

        public Criteria andPowerBNotBetween(Integer value1, Integer value2) {
            addCriterion("power_b not between", value1, value2, "powerB");
            return (Criteria) this;
        }

        public Criteria andReactivePowerBIsNull() {
            addCriterion("reactive_power_b is null");
            return (Criteria) this;
        }

        public Criteria andReactivePowerBIsNotNull() {
            addCriterion("reactive_power_b is not null");
            return (Criteria) this;
        }

        public Criteria andReactivePowerBEqualTo(Integer value) {
            addCriterion("reactive_power_b =", value, "reactivePowerB");
            return (Criteria) this;
        }

        public Criteria andReactivePowerBNotEqualTo(Integer value) {
            addCriterion("reactive_power_b <>", value, "reactivePowerB");
            return (Criteria) this;
        }

        public Criteria andReactivePowerBGreaterThan(Integer value) {
            addCriterion("reactive_power_b >", value, "reactivePowerB");
            return (Criteria) this;
        }

        public Criteria andReactivePowerBGreaterThanOrEqualTo(Integer value) {
            addCriterion("reactive_power_b >=", value, "reactivePowerB");
            return (Criteria) this;
        }

        public Criteria andReactivePowerBLessThan(Integer value) {
            addCriterion("reactive_power_b <", value, "reactivePowerB");
            return (Criteria) this;
        }

        public Criteria andReactivePowerBLessThanOrEqualTo(Integer value) {
            addCriterion("reactive_power_b <=", value, "reactivePowerB");
            return (Criteria) this;
        }

        public Criteria andReactivePowerBIn(List<Integer> values) {
            addCriterion("reactive_power_b in", values, "reactivePowerB");
            return (Criteria) this;
        }

        public Criteria andReactivePowerBNotIn(List<Integer> values) {
            addCriterion("reactive_power_b not in", values, "reactivePowerB");
            return (Criteria) this;
        }

        public Criteria andReactivePowerBBetween(Integer value1, Integer value2) {
            addCriterion("reactive_power_b between", value1, value2, "reactivePowerB");
            return (Criteria) this;
        }

        public Criteria andReactivePowerBNotBetween(Integer value1, Integer value2) {
            addCriterion("reactive_power_b not between", value1, value2, "reactivePowerB");
            return (Criteria) this;
        }

        public Criteria andPowerFactorBIsNull() {
            addCriterion("power_factor_b is null");
            return (Criteria) this;
        }

        public Criteria andPowerFactorBIsNotNull() {
            addCriterion("power_factor_b is not null");
            return (Criteria) this;
        }

        public Criteria andPowerFactorBEqualTo(Integer value) {
            addCriterion("power_factor_b =", value, "powerFactorB");
            return (Criteria) this;
        }

        public Criteria andPowerFactorBNotEqualTo(Integer value) {
            addCriterion("power_factor_b <>", value, "powerFactorB");
            return (Criteria) this;
        }

        public Criteria andPowerFactorBGreaterThan(Integer value) {
            addCriterion("power_factor_b >", value, "powerFactorB");
            return (Criteria) this;
        }

        public Criteria andPowerFactorBGreaterThanOrEqualTo(Integer value) {
            addCriterion("power_factor_b >=", value, "powerFactorB");
            return (Criteria) this;
        }

        public Criteria andPowerFactorBLessThan(Integer value) {
            addCriterion("power_factor_b <", value, "powerFactorB");
            return (Criteria) this;
        }

        public Criteria andPowerFactorBLessThanOrEqualTo(Integer value) {
            addCriterion("power_factor_b <=", value, "powerFactorB");
            return (Criteria) this;
        }

        public Criteria andPowerFactorBIn(List<Integer> values) {
            addCriterion("power_factor_b in", values, "powerFactorB");
            return (Criteria) this;
        }

        public Criteria andPowerFactorBNotIn(List<Integer> values) {
            addCriterion("power_factor_b not in", values, "powerFactorB");
            return (Criteria) this;
        }

        public Criteria andPowerFactorBBetween(Integer value1, Integer value2) {
            addCriterion("power_factor_b between", value1, value2, "powerFactorB");
            return (Criteria) this;
        }

        public Criteria andPowerFactorBNotBetween(Integer value1, Integer value2) {
            addCriterion("power_factor_b not between", value1, value2, "powerFactorB");
            return (Criteria) this;
        }

        public Criteria andApparentPowerBIsNull() {
            addCriterion("apparent_power_b is null");
            return (Criteria) this;
        }

        public Criteria andApparentPowerBIsNotNull() {
            addCriterion("apparent_power_b is not null");
            return (Criteria) this;
        }

        public Criteria andApparentPowerBEqualTo(Integer value) {
            addCriterion("apparent_power_b =", value, "apparentPowerB");
            return (Criteria) this;
        }

        public Criteria andApparentPowerBNotEqualTo(Integer value) {
            addCriterion("apparent_power_b <>", value, "apparentPowerB");
            return (Criteria) this;
        }

        public Criteria andApparentPowerBGreaterThan(Integer value) {
            addCriterion("apparent_power_b >", value, "apparentPowerB");
            return (Criteria) this;
        }

        public Criteria andApparentPowerBGreaterThanOrEqualTo(Integer value) {
            addCriterion("apparent_power_b >=", value, "apparentPowerB");
            return (Criteria) this;
        }

        public Criteria andApparentPowerBLessThan(Integer value) {
            addCriterion("apparent_power_b <", value, "apparentPowerB");
            return (Criteria) this;
        }

        public Criteria andApparentPowerBLessThanOrEqualTo(Integer value) {
            addCriterion("apparent_power_b <=", value, "apparentPowerB");
            return (Criteria) this;
        }

        public Criteria andApparentPowerBIn(List<Integer> values) {
            addCriterion("apparent_power_b in", values, "apparentPowerB");
            return (Criteria) this;
        }

        public Criteria andApparentPowerBNotIn(List<Integer> values) {
            addCriterion("apparent_power_b not in", values, "apparentPowerB");
            return (Criteria) this;
        }

        public Criteria andApparentPowerBBetween(Integer value1, Integer value2) {
            addCriterion("apparent_power_b between", value1, value2, "apparentPowerB");
            return (Criteria) this;
        }

        public Criteria andApparentPowerBNotBetween(Integer value1, Integer value2) {
            addCriterion("apparent_power_b not between", value1, value2, "apparentPowerB");
            return (Criteria) this;
        }

        public Criteria andVoltageCIsNull() {
            addCriterion("voltage_c is null");
            return (Criteria) this;
        }

        public Criteria andVoltageCIsNotNull() {
            addCriterion("voltage_c is not null");
            return (Criteria) this;
        }

        public Criteria andVoltageCEqualTo(Integer value) {
            addCriterion("voltage_c =", value, "voltageC");
            return (Criteria) this;
        }

        public Criteria andVoltageCNotEqualTo(Integer value) {
            addCriterion("voltage_c <>", value, "voltageC");
            return (Criteria) this;
        }

        public Criteria andVoltageCGreaterThan(Integer value) {
            addCriterion("voltage_c >", value, "voltageC");
            return (Criteria) this;
        }

        public Criteria andVoltageCGreaterThanOrEqualTo(Integer value) {
            addCriterion("voltage_c >=", value, "voltageC");
            return (Criteria) this;
        }

        public Criteria andVoltageCLessThan(Integer value) {
            addCriterion("voltage_c <", value, "voltageC");
            return (Criteria) this;
        }

        public Criteria andVoltageCLessThanOrEqualTo(Integer value) {
            addCriterion("voltage_c <=", value, "voltageC");
            return (Criteria) this;
        }

        public Criteria andVoltageCIn(List<Integer> values) {
            addCriterion("voltage_c in", values, "voltageC");
            return (Criteria) this;
        }

        public Criteria andVoltageCNotIn(List<Integer> values) {
            addCriterion("voltage_c not in", values, "voltageC");
            return (Criteria) this;
        }

        public Criteria andVoltageCBetween(Integer value1, Integer value2) {
            addCriterion("voltage_c between", value1, value2, "voltageC");
            return (Criteria) this;
        }

        public Criteria andVoltageCNotBetween(Integer value1, Integer value2) {
            addCriterion("voltage_c not between", value1, value2, "voltageC");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentCIsNull() {
            addCriterion("electric_current_c is null");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentCIsNotNull() {
            addCriterion("electric_current_c is not null");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentCEqualTo(Integer value) {
            addCriterion("electric_current_c =", value, "electricCurrentC");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentCNotEqualTo(Integer value) {
            addCriterion("electric_current_c <>", value, "electricCurrentC");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentCGreaterThan(Integer value) {
            addCriterion("electric_current_c >", value, "electricCurrentC");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentCGreaterThanOrEqualTo(Integer value) {
            addCriterion("electric_current_c >=", value, "electricCurrentC");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentCLessThan(Integer value) {
            addCriterion("electric_current_c <", value, "electricCurrentC");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentCLessThanOrEqualTo(Integer value) {
            addCriterion("electric_current_c <=", value, "electricCurrentC");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentCIn(List<Integer> values) {
            addCriterion("electric_current_c in", values, "electricCurrentC");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentCNotIn(List<Integer> values) {
            addCriterion("electric_current_c not in", values, "electricCurrentC");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentCBetween(Integer value1, Integer value2) {
            addCriterion("electric_current_c between", value1, value2, "electricCurrentC");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentCNotBetween(Integer value1, Integer value2) {
            addCriterion("electric_current_c not between", value1, value2, "electricCurrentC");
            return (Criteria) this;
        }

        public Criteria andPowerCIsNull() {
            addCriterion("power_c is null");
            return (Criteria) this;
        }

        public Criteria andPowerCIsNotNull() {
            addCriterion("power_c is not null");
            return (Criteria) this;
        }

        public Criteria andPowerCEqualTo(Integer value) {
            addCriterion("power_c =", value, "powerC");
            return (Criteria) this;
        }

        public Criteria andPowerCNotEqualTo(Integer value) {
            addCriterion("power_c <>", value, "powerC");
            return (Criteria) this;
        }

        public Criteria andPowerCGreaterThan(Integer value) {
            addCriterion("power_c >", value, "powerC");
            return (Criteria) this;
        }

        public Criteria andPowerCGreaterThanOrEqualTo(Integer value) {
            addCriterion("power_c >=", value, "powerC");
            return (Criteria) this;
        }

        public Criteria andPowerCLessThan(Integer value) {
            addCriterion("power_c <", value, "powerC");
            return (Criteria) this;
        }

        public Criteria andPowerCLessThanOrEqualTo(Integer value) {
            addCriterion("power_c <=", value, "powerC");
            return (Criteria) this;
        }

        public Criteria andPowerCIn(List<Integer> values) {
            addCriterion("power_c in", values, "powerC");
            return (Criteria) this;
        }

        public Criteria andPowerCNotIn(List<Integer> values) {
            addCriterion("power_c not in", values, "powerC");
            return (Criteria) this;
        }

        public Criteria andPowerCBetween(Integer value1, Integer value2) {
            addCriterion("power_c between", value1, value2, "powerC");
            return (Criteria) this;
        }

        public Criteria andPowerCNotBetween(Integer value1, Integer value2) {
            addCriterion("power_c not between", value1, value2, "powerC");
            return (Criteria) this;
        }

        public Criteria andReactivePowerCIsNull() {
            addCriterion("reactive_power_c is null");
            return (Criteria) this;
        }

        public Criteria andReactivePowerCIsNotNull() {
            addCriterion("reactive_power_c is not null");
            return (Criteria) this;
        }

        public Criteria andReactivePowerCEqualTo(Integer value) {
            addCriterion("reactive_power_c =", value, "reactivePowerC");
            return (Criteria) this;
        }

        public Criteria andReactivePowerCNotEqualTo(Integer value) {
            addCriterion("reactive_power_c <>", value, "reactivePowerC");
            return (Criteria) this;
        }

        public Criteria andReactivePowerCGreaterThan(Integer value) {
            addCriterion("reactive_power_c >", value, "reactivePowerC");
            return (Criteria) this;
        }

        public Criteria andReactivePowerCGreaterThanOrEqualTo(Integer value) {
            addCriterion("reactive_power_c >=", value, "reactivePowerC");
            return (Criteria) this;
        }

        public Criteria andReactivePowerCLessThan(Integer value) {
            addCriterion("reactive_power_c <", value, "reactivePowerC");
            return (Criteria) this;
        }

        public Criteria andReactivePowerCLessThanOrEqualTo(Integer value) {
            addCriterion("reactive_power_c <=", value, "reactivePowerC");
            return (Criteria) this;
        }

        public Criteria andReactivePowerCIn(List<Integer> values) {
            addCriterion("reactive_power_c in", values, "reactivePowerC");
            return (Criteria) this;
        }

        public Criteria andReactivePowerCNotIn(List<Integer> values) {
            addCriterion("reactive_power_c not in", values, "reactivePowerC");
            return (Criteria) this;
        }

        public Criteria andReactivePowerCBetween(Integer value1, Integer value2) {
            addCriterion("reactive_power_c between", value1, value2, "reactivePowerC");
            return (Criteria) this;
        }

        public Criteria andReactivePowerCNotBetween(Integer value1, Integer value2) {
            addCriterion("reactive_power_c not between", value1, value2, "reactivePowerC");
            return (Criteria) this;
        }

        public Criteria andPowerFactorCIsNull() {
            addCriterion("power_factor_c is null");
            return (Criteria) this;
        }

        public Criteria andPowerFactorCIsNotNull() {
            addCriterion("power_factor_c is not null");
            return (Criteria) this;
        }

        public Criteria andPowerFactorCEqualTo(Integer value) {
            addCriterion("power_factor_c =", value, "powerFactorC");
            return (Criteria) this;
        }

        public Criteria andPowerFactorCNotEqualTo(Integer value) {
            addCriterion("power_factor_c <>", value, "powerFactorC");
            return (Criteria) this;
        }

        public Criteria andPowerFactorCGreaterThan(Integer value) {
            addCriterion("power_factor_c >", value, "powerFactorC");
            return (Criteria) this;
        }

        public Criteria andPowerFactorCGreaterThanOrEqualTo(Integer value) {
            addCriterion("power_factor_c >=", value, "powerFactorC");
            return (Criteria) this;
        }

        public Criteria andPowerFactorCLessThan(Integer value) {
            addCriterion("power_factor_c <", value, "powerFactorC");
            return (Criteria) this;
        }

        public Criteria andPowerFactorCLessThanOrEqualTo(Integer value) {
            addCriterion("power_factor_c <=", value, "powerFactorC");
            return (Criteria) this;
        }

        public Criteria andPowerFactorCIn(List<Integer> values) {
            addCriterion("power_factor_c in", values, "powerFactorC");
            return (Criteria) this;
        }

        public Criteria andPowerFactorCNotIn(List<Integer> values) {
            addCriterion("power_factor_c not in", values, "powerFactorC");
            return (Criteria) this;
        }

        public Criteria andPowerFactorCBetween(Integer value1, Integer value2) {
            addCriterion("power_factor_c between", value1, value2, "powerFactorC");
            return (Criteria) this;
        }

        public Criteria andPowerFactorCNotBetween(Integer value1, Integer value2) {
            addCriterion("power_factor_c not between", value1, value2, "powerFactorC");
            return (Criteria) this;
        }

        public Criteria andApparentPowerCIsNull() {
            addCriterion("apparent_power_c is null");
            return (Criteria) this;
        }

        public Criteria andApparentPowerCIsNotNull() {
            addCriterion("apparent_power_c is not null");
            return (Criteria) this;
        }

        public Criteria andApparentPowerCEqualTo(Integer value) {
            addCriterion("apparent_power_c =", value, "apparentPowerC");
            return (Criteria) this;
        }

        public Criteria andApparentPowerCNotEqualTo(Integer value) {
            addCriterion("apparent_power_c <>", value, "apparentPowerC");
            return (Criteria) this;
        }

        public Criteria andApparentPowerCGreaterThan(Integer value) {
            addCriterion("apparent_power_c >", value, "apparentPowerC");
            return (Criteria) this;
        }

        public Criteria andApparentPowerCGreaterThanOrEqualTo(Integer value) {
            addCriterion("apparent_power_c >=", value, "apparentPowerC");
            return (Criteria) this;
        }

        public Criteria andApparentPowerCLessThan(Integer value) {
            addCriterion("apparent_power_c <", value, "apparentPowerC");
            return (Criteria) this;
        }

        public Criteria andApparentPowerCLessThanOrEqualTo(Integer value) {
            addCriterion("apparent_power_c <=", value, "apparentPowerC");
            return (Criteria) this;
        }

        public Criteria andApparentPowerCIn(List<Integer> values) {
            addCriterion("apparent_power_c in", values, "apparentPowerC");
            return (Criteria) this;
        }

        public Criteria andApparentPowerCNotIn(List<Integer> values) {
            addCriterion("apparent_power_c not in", values, "apparentPowerC");
            return (Criteria) this;
        }

        public Criteria andApparentPowerCBetween(Integer value1, Integer value2) {
            addCriterion("apparent_power_c between", value1, value2, "apparentPowerC");
            return (Criteria) this;
        }

        public Criteria andApparentPowerCNotBetween(Integer value1, Integer value2) {
            addCriterion("apparent_power_c not between", value1, value2, "apparentPowerC");
            return (Criteria) this;
        }

        public Criteria andTemperatureBIsNull() {
            addCriterion("temperature_b is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureBIsNotNull() {
            addCriterion("temperature_b is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureBEqualTo(Integer value) {
            addCriterion("temperature_b =", value, "temperatureB");
            return (Criteria) this;
        }

        public Criteria andTemperatureBNotEqualTo(Integer value) {
            addCriterion("temperature_b <>", value, "temperatureB");
            return (Criteria) this;
        }

        public Criteria andTemperatureBGreaterThan(Integer value) {
            addCriterion("temperature_b >", value, "temperatureB");
            return (Criteria) this;
        }

        public Criteria andTemperatureBGreaterThanOrEqualTo(Integer value) {
            addCriterion("temperature_b >=", value, "temperatureB");
            return (Criteria) this;
        }

        public Criteria andTemperatureBLessThan(Integer value) {
            addCriterion("temperature_b <", value, "temperatureB");
            return (Criteria) this;
        }

        public Criteria andTemperatureBLessThanOrEqualTo(Integer value) {
            addCriterion("temperature_b <=", value, "temperatureB");
            return (Criteria) this;
        }

        public Criteria andTemperatureBIn(List<Integer> values) {
            addCriterion("temperature_b in", values, "temperatureB");
            return (Criteria) this;
        }

        public Criteria andTemperatureBNotIn(List<Integer> values) {
            addCriterion("temperature_b not in", values, "temperatureB");
            return (Criteria) this;
        }

        public Criteria andTemperatureBBetween(Integer value1, Integer value2) {
            addCriterion("temperature_b between", value1, value2, "temperatureB");
            return (Criteria) this;
        }

        public Criteria andTemperatureBNotBetween(Integer value1, Integer value2) {
            addCriterion("temperature_b not between", value1, value2, "temperatureB");
            return (Criteria) this;
        }

        public Criteria andTemperatureCIsNull() {
            addCriterion("temperature_c is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureCIsNotNull() {
            addCriterion("temperature_c is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureCEqualTo(Integer value) {
            addCriterion("temperature_c =", value, "temperatureC");
            return (Criteria) this;
        }

        public Criteria andTemperatureCNotEqualTo(Integer value) {
            addCriterion("temperature_c <>", value, "temperatureC");
            return (Criteria) this;
        }

        public Criteria andTemperatureCGreaterThan(Integer value) {
            addCriterion("temperature_c >", value, "temperatureC");
            return (Criteria) this;
        }

        public Criteria andTemperatureCGreaterThanOrEqualTo(Integer value) {
            addCriterion("temperature_c >=", value, "temperatureC");
            return (Criteria) this;
        }

        public Criteria andTemperatureCLessThan(Integer value) {
            addCriterion("temperature_c <", value, "temperatureC");
            return (Criteria) this;
        }

        public Criteria andTemperatureCLessThanOrEqualTo(Integer value) {
            addCriterion("temperature_c <=", value, "temperatureC");
            return (Criteria) this;
        }

        public Criteria andTemperatureCIn(List<Integer> values) {
            addCriterion("temperature_c in", values, "temperatureC");
            return (Criteria) this;
        }

        public Criteria andTemperatureCNotIn(List<Integer> values) {
            addCriterion("temperature_c not in", values, "temperatureC");
            return (Criteria) this;
        }

        public Criteria andTemperatureCBetween(Integer value1, Integer value2) {
            addCriterion("temperature_c between", value1, value2, "temperatureC");
            return (Criteria) this;
        }

        public Criteria andTemperatureCNotBetween(Integer value1, Integer value2) {
            addCriterion("temperature_c not between", value1, value2, "temperatureC");
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