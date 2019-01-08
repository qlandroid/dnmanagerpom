package com.dnmanager.pojo;

import java.util.ArrayList;
import java.util.List;

public class CategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoryExample() {
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

        public Criteria andYtAccountIsNull() {
            addCriterion("yt_account is null");
            return (Criteria) this;
        }

        public Criteria andYtAccountIsNotNull() {
            addCriterion("yt_account is not null");
            return (Criteria) this;
        }

        public Criteria andYtAccountEqualTo(String value) {
            addCriterion("yt_account =", value, "ytAccount");
            return (Criteria) this;
        }

        public Criteria andYtAccountNotEqualTo(String value) {
            addCriterion("yt_account <>", value, "ytAccount");
            return (Criteria) this;
        }

        public Criteria andYtAccountGreaterThan(String value) {
            addCriterion("yt_account >", value, "ytAccount");
            return (Criteria) this;
        }

        public Criteria andYtAccountGreaterThanOrEqualTo(String value) {
            addCriterion("yt_account >=", value, "ytAccount");
            return (Criteria) this;
        }

        public Criteria andYtAccountLessThan(String value) {
            addCriterion("yt_account <", value, "ytAccount");
            return (Criteria) this;
        }

        public Criteria andYtAccountLessThanOrEqualTo(String value) {
            addCriterion("yt_account <=", value, "ytAccount");
            return (Criteria) this;
        }

        public Criteria andYtAccountLike(String value) {
            addCriterion("yt_account like", value, "ytAccount");
            return (Criteria) this;
        }

        public Criteria andYtAccountNotLike(String value) {
            addCriterion("yt_account not like", value, "ytAccount");
            return (Criteria) this;
        }

        public Criteria andYtAccountIn(List<String> values) {
            addCriterion("yt_account in", values, "ytAccount");
            return (Criteria) this;
        }

        public Criteria andYtAccountNotIn(List<String> values) {
            addCriterion("yt_account not in", values, "ytAccount");
            return (Criteria) this;
        }

        public Criteria andYtAccountBetween(String value1, String value2) {
            addCriterion("yt_account between", value1, value2, "ytAccount");
            return (Criteria) this;
        }

        public Criteria andYtAccountNotBetween(String value1, String value2) {
            addCriterion("yt_account not between", value1, value2, "ytAccount");
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