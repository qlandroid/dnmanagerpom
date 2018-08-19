package com.dnmanager.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceExample() {
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

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(String value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(String value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(String value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(String value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(String value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLike(String value) {
            addCriterion("type_id like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotLike(String value) {
            addCriterion("type_id not like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<String> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<String> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(String value1, String value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(String value1, String value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
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

        public Criteria andBuyElectricIsNull() {
            addCriterion("buy_electric is null");
            return (Criteria) this;
        }

        public Criteria andBuyElectricIsNotNull() {
            addCriterion("buy_electric is not null");
            return (Criteria) this;
        }

        public Criteria andBuyElectricEqualTo(Integer value) {
            addCriterion("buy_electric =", value, "buyElectric");
            return (Criteria) this;
        }

        public Criteria andBuyElectricNotEqualTo(Integer value) {
            addCriterion("buy_electric <>", value, "buyElectric");
            return (Criteria) this;
        }

        public Criteria andBuyElectricGreaterThan(Integer value) {
            addCriterion("buy_electric >", value, "buyElectric");
            return (Criteria) this;
        }

        public Criteria andBuyElectricGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_electric >=", value, "buyElectric");
            return (Criteria) this;
        }

        public Criteria andBuyElectricLessThan(Integer value) {
            addCriterion("buy_electric <", value, "buyElectric");
            return (Criteria) this;
        }

        public Criteria andBuyElectricLessThanOrEqualTo(Integer value) {
            addCriterion("buy_electric <=", value, "buyElectric");
            return (Criteria) this;
        }

        public Criteria andBuyElectricIn(List<Integer> values) {
            addCriterion("buy_electric in", values, "buyElectric");
            return (Criteria) this;
        }

        public Criteria andBuyElectricNotIn(List<Integer> values) {
            addCriterion("buy_electric not in", values, "buyElectric");
            return (Criteria) this;
        }

        public Criteria andBuyElectricBetween(Integer value1, Integer value2) {
            addCriterion("buy_electric between", value1, value2, "buyElectric");
            return (Criteria) this;
        }

        public Criteria andBuyElectricNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_electric not between", value1, value2, "buyElectric");
            return (Criteria) this;
        }

        public Criteria andElectricIsNull() {
            addCriterion("electric is null");
            return (Criteria) this;
        }

        public Criteria andElectricIsNotNull() {
            addCriterion("electric is not null");
            return (Criteria) this;
        }

        public Criteria andElectricEqualTo(Integer value) {
            addCriterion("electric =", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricNotEqualTo(Integer value) {
            addCriterion("electric <>", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricGreaterThan(Integer value) {
            addCriterion("electric >", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricGreaterThanOrEqualTo(Integer value) {
            addCriterion("electric >=", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricLessThan(Integer value) {
            addCriterion("electric <", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricLessThanOrEqualTo(Integer value) {
            addCriterion("electric <=", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricIn(List<Integer> values) {
            addCriterion("electric in", values, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricNotIn(List<Integer> values) {
            addCriterion("electric not in", values, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricBetween(Integer value1, Integer value2) {
            addCriterion("electric between", value1, value2, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricNotBetween(Integer value1, Integer value2) {
            addCriterion("electric not between", value1, value2, "electric");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("operator_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(Integer value) {
            addCriterion("operator_id =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(Integer value) {
            addCriterion("operator_id <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(Integer value) {
            addCriterion("operator_id >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("operator_id >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(Integer value) {
            addCriterion("operator_id <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("operator_id <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<Integer> values) {
            addCriterion("operator_id in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<Integer> values) {
            addCriterion("operator_id not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(Integer value1, Integer value2) {
            addCriterion("operator_id between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("operator_id not between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andDetailedIdIsNull() {
            addCriterion("detailed_id is null");
            return (Criteria) this;
        }

        public Criteria andDetailedIdIsNotNull() {
            addCriterion("detailed_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetailedIdEqualTo(Integer value) {
            addCriterion("detailed_id =", value, "detailedId");
            return (Criteria) this;
        }

        public Criteria andDetailedIdNotEqualTo(Integer value) {
            addCriterion("detailed_id <>", value, "detailedId");
            return (Criteria) this;
        }

        public Criteria andDetailedIdGreaterThan(Integer value) {
            addCriterion("detailed_id >", value, "detailedId");
            return (Criteria) this;
        }

        public Criteria andDetailedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("detailed_id >=", value, "detailedId");
            return (Criteria) this;
        }

        public Criteria andDetailedIdLessThan(Integer value) {
            addCriterion("detailed_id <", value, "detailedId");
            return (Criteria) this;
        }

        public Criteria andDetailedIdLessThanOrEqualTo(Integer value) {
            addCriterion("detailed_id <=", value, "detailedId");
            return (Criteria) this;
        }

        public Criteria andDetailedIdIn(List<Integer> values) {
            addCriterion("detailed_id in", values, "detailedId");
            return (Criteria) this;
        }

        public Criteria andDetailedIdNotIn(List<Integer> values) {
            addCriterion("detailed_id not in", values, "detailedId");
            return (Criteria) this;
        }

        public Criteria andDetailedIdBetween(Integer value1, Integer value2) {
            addCriterion("detailed_id between", value1, value2, "detailedId");
            return (Criteria) this;
        }

        public Criteria andDetailedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("detailed_id not between", value1, value2, "detailedId");
            return (Criteria) this;
        }

        public Criteria andDeviceAdminIsNull() {
            addCriterion("device_admin is null");
            return (Criteria) this;
        }

        public Criteria andDeviceAdminIsNotNull() {
            addCriterion("device_admin is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceAdminEqualTo(String value) {
            addCriterion("device_admin =", value, "deviceAdmin");
            return (Criteria) this;
        }

        public Criteria andDeviceAdminNotEqualTo(String value) {
            addCriterion("device_admin <>", value, "deviceAdmin");
            return (Criteria) this;
        }

        public Criteria andDeviceAdminGreaterThan(String value) {
            addCriterion("device_admin >", value, "deviceAdmin");
            return (Criteria) this;
        }

        public Criteria andDeviceAdminGreaterThanOrEqualTo(String value) {
            addCriterion("device_admin >=", value, "deviceAdmin");
            return (Criteria) this;
        }

        public Criteria andDeviceAdminLessThan(String value) {
            addCriterion("device_admin <", value, "deviceAdmin");
            return (Criteria) this;
        }

        public Criteria andDeviceAdminLessThanOrEqualTo(String value) {
            addCriterion("device_admin <=", value, "deviceAdmin");
            return (Criteria) this;
        }

        public Criteria andDeviceAdminLike(String value) {
            addCriterion("device_admin like", value, "deviceAdmin");
            return (Criteria) this;
        }

        public Criteria andDeviceAdminNotLike(String value) {
            addCriterion("device_admin not like", value, "deviceAdmin");
            return (Criteria) this;
        }

        public Criteria andDeviceAdminIn(List<String> values) {
            addCriterion("device_admin in", values, "deviceAdmin");
            return (Criteria) this;
        }

        public Criteria andDeviceAdminNotIn(List<String> values) {
            addCriterion("device_admin not in", values, "deviceAdmin");
            return (Criteria) this;
        }

        public Criteria andDeviceAdminBetween(String value1, String value2) {
            addCriterion("device_admin between", value1, value2, "deviceAdmin");
            return (Criteria) this;
        }

        public Criteria andDeviceAdminNotBetween(String value1, String value2) {
            addCriterion("device_admin not between", value1, value2, "deviceAdmin");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressIsNull() {
            addCriterion("device_address is null");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressIsNotNull() {
            addCriterion("device_address is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressEqualTo(String value) {
            addCriterion("device_address =", value, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressNotEqualTo(String value) {
            addCriterion("device_address <>", value, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressGreaterThan(String value) {
            addCriterion("device_address >", value, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("device_address >=", value, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressLessThan(String value) {
            addCriterion("device_address <", value, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressLessThanOrEqualTo(String value) {
            addCriterion("device_address <=", value, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressLike(String value) {
            addCriterion("device_address like", value, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressNotLike(String value) {
            addCriterion("device_address not like", value, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressIn(List<String> values) {
            addCriterion("device_address in", values, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressNotIn(List<String> values) {
            addCriterion("device_address not in", values, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressBetween(String value1, String value2) {
            addCriterion("device_address between", value1, value2, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressNotBetween(String value1, String value2) {
            addCriterion("device_address not between", value1, value2, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andUsersIdIsNull() {
            addCriterion("users_id is null");
            return (Criteria) this;
        }

        public Criteria andUsersIdIsNotNull() {
            addCriterion("users_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsersIdEqualTo(Integer value) {
            addCriterion("users_id =", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotEqualTo(Integer value) {
            addCriterion("users_id <>", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdGreaterThan(Integer value) {
            addCriterion("users_id >", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("users_id >=", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLessThan(Integer value) {
            addCriterion("users_id <", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLessThanOrEqualTo(Integer value) {
            addCriterion("users_id <=", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdIn(List<Integer> values) {
            addCriterion("users_id in", values, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotIn(List<Integer> values) {
            addCriterion("users_id not in", values, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdBetween(Integer value1, Integer value2) {
            addCriterion("users_id between", value1, value2, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("users_id not between", value1, value2, "usersId");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Integer value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Integer value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Integer value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Integer value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Integer value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Integer> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Integer> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Integer value1, Integer value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Integer value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Integer value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Integer value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Integer value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Integer> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Integer> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Integer value1, Integer value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Integer value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Integer value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Integer value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Integer value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Integer> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Integer> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Integer value1, Integer value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andDStatusIsNull() {
            addCriterion("d_status is null");
            return (Criteria) this;
        }

        public Criteria andDStatusIsNotNull() {
            addCriterion("d_status is not null");
            return (Criteria) this;
        }

        public Criteria andDStatusEqualTo(Short value) {
            addCriterion("d_status =", value, "dStatus");
            return (Criteria) this;
        }

        public Criteria andDStatusNotEqualTo(Short value) {
            addCriterion("d_status <>", value, "dStatus");
            return (Criteria) this;
        }

        public Criteria andDStatusGreaterThan(Short value) {
            addCriterion("d_status >", value, "dStatus");
            return (Criteria) this;
        }

        public Criteria andDStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("d_status >=", value, "dStatus");
            return (Criteria) this;
        }

        public Criteria andDStatusLessThan(Short value) {
            addCriterion("d_status <", value, "dStatus");
            return (Criteria) this;
        }

        public Criteria andDStatusLessThanOrEqualTo(Short value) {
            addCriterion("d_status <=", value, "dStatus");
            return (Criteria) this;
        }

        public Criteria andDStatusIn(List<Short> values) {
            addCriterion("d_status in", values, "dStatus");
            return (Criteria) this;
        }

        public Criteria andDStatusNotIn(List<Short> values) {
            addCriterion("d_status not in", values, "dStatus");
            return (Criteria) this;
        }

        public Criteria andDStatusBetween(Short value1, Short value2) {
            addCriterion("d_status between", value1, value2, "dStatus");
            return (Criteria) this;
        }

        public Criteria andDStatusNotBetween(Short value1, Short value2) {
            addCriterion("d_status not between", value1, value2, "dStatus");
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

        public Criteria andElectricCurrentIsNull() {
            addCriterion("electric_current is null");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentIsNotNull() {
            addCriterion("electric_current is not null");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentEqualTo(Integer value) {
            addCriterion("electric_current =", value, "electricCurrent");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentNotEqualTo(Integer value) {
            addCriterion("electric_current <>", value, "electricCurrent");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentGreaterThan(Integer value) {
            addCriterion("electric_current >", value, "electricCurrent");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentGreaterThanOrEqualTo(Integer value) {
            addCriterion("electric_current >=", value, "electricCurrent");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentLessThan(Integer value) {
            addCriterion("electric_current <", value, "electricCurrent");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentLessThanOrEqualTo(Integer value) {
            addCriterion("electric_current <=", value, "electricCurrent");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentIn(List<Integer> values) {
            addCriterion("electric_current in", values, "electricCurrent");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentNotIn(List<Integer> values) {
            addCriterion("electric_current not in", values, "electricCurrent");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentBetween(Integer value1, Integer value2) {
            addCriterion("electric_current between", value1, value2, "electricCurrent");
            return (Criteria) this;
        }

        public Criteria andElectricCurrentNotBetween(Integer value1, Integer value2) {
            addCriterion("electric_current not between", value1, value2, "electricCurrent");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("power is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("power is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(Integer value) {
            addCriterion("power =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(Integer value) {
            addCriterion("power <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(Integer value) {
            addCriterion("power >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("power >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(Integer value) {
            addCriterion("power <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(Integer value) {
            addCriterion("power <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<Integer> values) {
            addCriterion("power in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<Integer> values) {
            addCriterion("power not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(Integer value1, Integer value2) {
            addCriterion("power between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(Integer value1, Integer value2) {
            addCriterion("power not between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andReactivePowerIsNull() {
            addCriterion("reactive_power is null");
            return (Criteria) this;
        }

        public Criteria andReactivePowerIsNotNull() {
            addCriterion("reactive_power is not null");
            return (Criteria) this;
        }

        public Criteria andReactivePowerEqualTo(Integer value) {
            addCriterion("reactive_power =", value, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerNotEqualTo(Integer value) {
            addCriterion("reactive_power <>", value, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerGreaterThan(Integer value) {
            addCriterion("reactive_power >", value, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("reactive_power >=", value, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerLessThan(Integer value) {
            addCriterion("reactive_power <", value, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerLessThanOrEqualTo(Integer value) {
            addCriterion("reactive_power <=", value, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerIn(List<Integer> values) {
            addCriterion("reactive_power in", values, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerNotIn(List<Integer> values) {
            addCriterion("reactive_power not in", values, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerBetween(Integer value1, Integer value2) {
            addCriterion("reactive_power between", value1, value2, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerNotBetween(Integer value1, Integer value2) {
            addCriterion("reactive_power not between", value1, value2, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andApparentPowerIsNull() {
            addCriterion("apparent_power is null");
            return (Criteria) this;
        }

        public Criteria andApparentPowerIsNotNull() {
            addCriterion("apparent_power is not null");
            return (Criteria) this;
        }

        public Criteria andApparentPowerEqualTo(Integer value) {
            addCriterion("apparent_power =", value, "apparentPower");
            return (Criteria) this;
        }

        public Criteria andApparentPowerNotEqualTo(Integer value) {
            addCriterion("apparent_power <>", value, "apparentPower");
            return (Criteria) this;
        }

        public Criteria andApparentPowerGreaterThan(Integer value) {
            addCriterion("apparent_power >", value, "apparentPower");
            return (Criteria) this;
        }

        public Criteria andApparentPowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("apparent_power >=", value, "apparentPower");
            return (Criteria) this;
        }

        public Criteria andApparentPowerLessThan(Integer value) {
            addCriterion("apparent_power <", value, "apparentPower");
            return (Criteria) this;
        }

        public Criteria andApparentPowerLessThanOrEqualTo(Integer value) {
            addCriterion("apparent_power <=", value, "apparentPower");
            return (Criteria) this;
        }

        public Criteria andApparentPowerIn(List<Integer> values) {
            addCriterion("apparent_power in", values, "apparentPower");
            return (Criteria) this;
        }

        public Criteria andApparentPowerNotIn(List<Integer> values) {
            addCriterion("apparent_power not in", values, "apparentPower");
            return (Criteria) this;
        }

        public Criteria andApparentPowerBetween(Integer value1, Integer value2) {
            addCriterion("apparent_power between", value1, value2, "apparentPower");
            return (Criteria) this;
        }

        public Criteria andApparentPowerNotBetween(Integer value1, Integer value2) {
            addCriterion("apparent_power not between", value1, value2, "apparentPower");
            return (Criteria) this;
        }

        public Criteria andPowerFactorIsNull() {
            addCriterion("power_factor is null");
            return (Criteria) this;
        }

        public Criteria andPowerFactorIsNotNull() {
            addCriterion("power_factor is not null");
            return (Criteria) this;
        }

        public Criteria andPowerFactorEqualTo(Integer value) {
            addCriterion("power_factor =", value, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorNotEqualTo(Integer value) {
            addCriterion("power_factor <>", value, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorGreaterThan(Integer value) {
            addCriterion("power_factor >", value, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorGreaterThanOrEqualTo(Integer value) {
            addCriterion("power_factor >=", value, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorLessThan(Integer value) {
            addCriterion("power_factor <", value, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorLessThanOrEqualTo(Integer value) {
            addCriterion("power_factor <=", value, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorIn(List<Integer> values) {
            addCriterion("power_factor in", values, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorNotIn(List<Integer> values) {
            addCriterion("power_factor not in", values, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorBetween(Integer value1, Integer value2) {
            addCriterion("power_factor between", value1, value2, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorNotBetween(Integer value1, Integer value2) {
            addCriterion("power_factor not between", value1, value2, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNull() {
            addCriterion("frequency is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNotNull() {
            addCriterion("frequency is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyEqualTo(Integer value) {
            addCriterion("frequency =", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotEqualTo(Integer value) {
            addCriterion("frequency <>", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThan(Integer value) {
            addCriterion("frequency >", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("frequency >=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThan(Integer value) {
            addCriterion("frequency <", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThanOrEqualTo(Integer value) {
            addCriterion("frequency <=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyIn(List<Integer> values) {
            addCriterion("frequency in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotIn(List<Integer> values) {
            addCriterion("frequency not in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyBetween(Integer value1, Integer value2) {
            addCriterion("frequency between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotBetween(Integer value1, Integer value2) {
            addCriterion("frequency not between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andLeakageCurrentIsNull() {
            addCriterion("leakage_current is null");
            return (Criteria) this;
        }

        public Criteria andLeakageCurrentIsNotNull() {
            addCriterion("leakage_current is not null");
            return (Criteria) this;
        }

        public Criteria andLeakageCurrentEqualTo(Integer value) {
            addCriterion("leakage_current =", value, "leakageCurrent");
            return (Criteria) this;
        }

        public Criteria andLeakageCurrentNotEqualTo(Integer value) {
            addCriterion("leakage_current <>", value, "leakageCurrent");
            return (Criteria) this;
        }

        public Criteria andLeakageCurrentGreaterThan(Integer value) {
            addCriterion("leakage_current >", value, "leakageCurrent");
            return (Criteria) this;
        }

        public Criteria andLeakageCurrentGreaterThanOrEqualTo(Integer value) {
            addCriterion("leakage_current >=", value, "leakageCurrent");
            return (Criteria) this;
        }

        public Criteria andLeakageCurrentLessThan(Integer value) {
            addCriterion("leakage_current <", value, "leakageCurrent");
            return (Criteria) this;
        }

        public Criteria andLeakageCurrentLessThanOrEqualTo(Integer value) {
            addCriterion("leakage_current <=", value, "leakageCurrent");
            return (Criteria) this;
        }

        public Criteria andLeakageCurrentIn(List<Integer> values) {
            addCriterion("leakage_current in", values, "leakageCurrent");
            return (Criteria) this;
        }

        public Criteria andLeakageCurrentNotIn(List<Integer> values) {
            addCriterion("leakage_current not in", values, "leakageCurrent");
            return (Criteria) this;
        }

        public Criteria andLeakageCurrentBetween(Integer value1, Integer value2) {
            addCriterion("leakage_current between", value1, value2, "leakageCurrent");
            return (Criteria) this;
        }

        public Criteria andLeakageCurrentNotBetween(Integer value1, Integer value2) {
            addCriterion("leakage_current not between", value1, value2, "leakageCurrent");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(Integer value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(Integer value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(Integer value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(Integer value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(Integer value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<Integer> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<Integer> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(Integer value1, Integer value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(Integer value1, Integer value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andHumidityIsNull() {
            addCriterion("humidity is null");
            return (Criteria) this;
        }

        public Criteria andHumidityIsNotNull() {
            addCriterion("humidity is not null");
            return (Criteria) this;
        }

        public Criteria andHumidityEqualTo(Integer value) {
            addCriterion("humidity =", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotEqualTo(Integer value) {
            addCriterion("humidity <>", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityGreaterThan(Integer value) {
            addCriterion("humidity >", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityGreaterThanOrEqualTo(Integer value) {
            addCriterion("humidity >=", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityLessThan(Integer value) {
            addCriterion("humidity <", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityLessThanOrEqualTo(Integer value) {
            addCriterion("humidity <=", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityIn(List<Integer> values) {
            addCriterion("humidity in", values, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotIn(List<Integer> values) {
            addCriterion("humidity not in", values, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityBetween(Integer value1, Integer value2) {
            addCriterion("humidity between", value1, value2, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotBetween(Integer value1, Integer value2) {
            addCriterion("humidity not between", value1, value2, "humidity");
            return (Criteria) this;
        }

        public Criteria andDetectionsignIsNull() {
            addCriterion("detectionsign is null");
            return (Criteria) this;
        }

        public Criteria andDetectionsignIsNotNull() {
            addCriterion("detectionsign is not null");
            return (Criteria) this;
        }

        public Criteria andDetectionsignEqualTo(Integer value) {
            addCriterion("detectionsign =", value, "detectionsign");
            return (Criteria) this;
        }

        public Criteria andDetectionsignNotEqualTo(Integer value) {
            addCriterion("detectionsign <>", value, "detectionsign");
            return (Criteria) this;
        }

        public Criteria andDetectionsignGreaterThan(Integer value) {
            addCriterion("detectionsign >", value, "detectionsign");
            return (Criteria) this;
        }

        public Criteria andDetectionsignGreaterThanOrEqualTo(Integer value) {
            addCriterion("detectionsign >=", value, "detectionsign");
            return (Criteria) this;
        }

        public Criteria andDetectionsignLessThan(Integer value) {
            addCriterion("detectionsign <", value, "detectionsign");
            return (Criteria) this;
        }

        public Criteria andDetectionsignLessThanOrEqualTo(Integer value) {
            addCriterion("detectionsign <=", value, "detectionsign");
            return (Criteria) this;
        }

        public Criteria andDetectionsignIn(List<Integer> values) {
            addCriterion("detectionsign in", values, "detectionsign");
            return (Criteria) this;
        }

        public Criteria andDetectionsignNotIn(List<Integer> values) {
            addCriterion("detectionsign not in", values, "detectionsign");
            return (Criteria) this;
        }

        public Criteria andDetectionsignBetween(Integer value1, Integer value2) {
            addCriterion("detectionsign between", value1, value2, "detectionsign");
            return (Criteria) this;
        }

        public Criteria andDetectionsignNotBetween(Integer value1, Integer value2) {
            addCriterion("detectionsign not between", value1, value2, "detectionsign");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Integer value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Integer value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Integer value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Integer value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Integer> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Integer> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Integer value1, Integer value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andElecStatusIsNull() {
            addCriterion("elec_status is null");
            return (Criteria) this;
        }

        public Criteria andElecStatusIsNotNull() {
            addCriterion("elec_status is not null");
            return (Criteria) this;
        }

        public Criteria andElecStatusEqualTo(Short value) {
            addCriterion("elec_status =", value, "elecStatus");
            return (Criteria) this;
        }

        public Criteria andElecStatusNotEqualTo(Short value) {
            addCriterion("elec_status <>", value, "elecStatus");
            return (Criteria) this;
        }

        public Criteria andElecStatusGreaterThan(Short value) {
            addCriterion("elec_status >", value, "elecStatus");
            return (Criteria) this;
        }

        public Criteria andElecStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("elec_status >=", value, "elecStatus");
            return (Criteria) this;
        }

        public Criteria andElecStatusLessThan(Short value) {
            addCriterion("elec_status <", value, "elecStatus");
            return (Criteria) this;
        }

        public Criteria andElecStatusLessThanOrEqualTo(Short value) {
            addCriterion("elec_status <=", value, "elecStatus");
            return (Criteria) this;
        }

        public Criteria andElecStatusIn(List<Short> values) {
            addCriterion("elec_status in", values, "elecStatus");
            return (Criteria) this;
        }

        public Criteria andElecStatusNotIn(List<Short> values) {
            addCriterion("elec_status not in", values, "elecStatus");
            return (Criteria) this;
        }

        public Criteria andElecStatusBetween(Short value1, Short value2) {
            addCriterion("elec_status between", value1, value2, "elecStatus");
            return (Criteria) this;
        }

        public Criteria andElecStatusNotBetween(Short value1, Short value2) {
            addCriterion("elec_status not between", value1, value2, "elecStatus");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusIsNull() {
            addCriterion("replace_status is null");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusIsNotNull() {
            addCriterion("replace_status is not null");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusEqualTo(Integer value) {
            addCriterion("replace_status =", value, "replaceStatus");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusNotEqualTo(Integer value) {
            addCriterion("replace_status <>", value, "replaceStatus");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusGreaterThan(Integer value) {
            addCriterion("replace_status >", value, "replaceStatus");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("replace_status >=", value, "replaceStatus");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusLessThan(Integer value) {
            addCriterion("replace_status <", value, "replaceStatus");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusLessThanOrEqualTo(Integer value) {
            addCriterion("replace_status <=", value, "replaceStatus");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusIn(List<Integer> values) {
            addCriterion("replace_status in", values, "replaceStatus");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusNotIn(List<Integer> values) {
            addCriterion("replace_status not in", values, "replaceStatus");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusBetween(Integer value1, Integer value2) {
            addCriterion("replace_status between", value1, value2, "replaceStatus");
            return (Criteria) this;
        }

        public Criteria andReplaceStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("replace_status not between", value1, value2, "replaceStatus");
            return (Criteria) this;
        }

        public Criteria andReplaceReasonIsNull() {
            addCriterion("replace_reason is null");
            return (Criteria) this;
        }

        public Criteria andReplaceReasonIsNotNull() {
            addCriterion("replace_reason is not null");
            return (Criteria) this;
        }

        public Criteria andReplaceReasonEqualTo(String value) {
            addCriterion("replace_reason =", value, "replaceReason");
            return (Criteria) this;
        }

        public Criteria andReplaceReasonNotEqualTo(String value) {
            addCriterion("replace_reason <>", value, "replaceReason");
            return (Criteria) this;
        }

        public Criteria andReplaceReasonGreaterThan(String value) {
            addCriterion("replace_reason >", value, "replaceReason");
            return (Criteria) this;
        }

        public Criteria andReplaceReasonGreaterThanOrEqualTo(String value) {
            addCriterion("replace_reason >=", value, "replaceReason");
            return (Criteria) this;
        }

        public Criteria andReplaceReasonLessThan(String value) {
            addCriterion("replace_reason <", value, "replaceReason");
            return (Criteria) this;
        }

        public Criteria andReplaceReasonLessThanOrEqualTo(String value) {
            addCriterion("replace_reason <=", value, "replaceReason");
            return (Criteria) this;
        }

        public Criteria andReplaceReasonLike(String value) {
            addCriterion("replace_reason like", value, "replaceReason");
            return (Criteria) this;
        }

        public Criteria andReplaceReasonNotLike(String value) {
            addCriterion("replace_reason not like", value, "replaceReason");
            return (Criteria) this;
        }

        public Criteria andReplaceReasonIn(List<String> values) {
            addCriterion("replace_reason in", values, "replaceReason");
            return (Criteria) this;
        }

        public Criteria andReplaceReasonNotIn(List<String> values) {
            addCriterion("replace_reason not in", values, "replaceReason");
            return (Criteria) this;
        }

        public Criteria andReplaceReasonBetween(String value1, String value2) {
            addCriterion("replace_reason between", value1, value2, "replaceReason");
            return (Criteria) this;
        }

        public Criteria andReplaceReasonNotBetween(String value1, String value2) {
            addCriterion("replace_reason not between", value1, value2, "replaceReason");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(BigDecimal value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(BigDecimal value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(BigDecimal value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<BigDecimal> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(BigDecimal value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(BigDecimal value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(BigDecimal value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<BigDecimal> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
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