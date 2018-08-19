package com.dnmanager.pojo;

import java.util.ArrayList;
import java.util.List;

public class TransactionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransactionExample() {
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

        public Criteria andDevicesIdIsNull() {
            addCriterion("devices_id is null");
            return (Criteria) this;
        }

        public Criteria andDevicesIdIsNotNull() {
            addCriterion("devices_id is not null");
            return (Criteria) this;
        }

        public Criteria andDevicesIdEqualTo(Integer value) {
            addCriterion("devices_id =", value, "devicesId");
            return (Criteria) this;
        }

        public Criteria andDevicesIdNotEqualTo(Integer value) {
            addCriterion("devices_id <>", value, "devicesId");
            return (Criteria) this;
        }

        public Criteria andDevicesIdGreaterThan(Integer value) {
            addCriterion("devices_id >", value, "devicesId");
            return (Criteria) this;
        }

        public Criteria andDevicesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("devices_id >=", value, "devicesId");
            return (Criteria) this;
        }

        public Criteria andDevicesIdLessThan(Integer value) {
            addCriterion("devices_id <", value, "devicesId");
            return (Criteria) this;
        }

        public Criteria andDevicesIdLessThanOrEqualTo(Integer value) {
            addCriterion("devices_id <=", value, "devicesId");
            return (Criteria) this;
        }

        public Criteria andDevicesIdIn(List<Integer> values) {
            addCriterion("devices_id in", values, "devicesId");
            return (Criteria) this;
        }

        public Criteria andDevicesIdNotIn(List<Integer> values) {
            addCriterion("devices_id not in", values, "devicesId");
            return (Criteria) this;
        }

        public Criteria andDevicesIdBetween(Integer value1, Integer value2) {
            addCriterion("devices_id between", value1, value2, "devicesId");
            return (Criteria) this;
        }

        public Criteria andDevicesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("devices_id not between", value1, value2, "devicesId");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Integer> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNull() {
            addCriterion("out_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNotNull() {
            addCriterion("out_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoEqualTo(String value) {
            addCriterion("out_trade_no =", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotEqualTo(String value) {
            addCriterion("out_trade_no <>", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThan(String value) {
            addCriterion("out_trade_no >", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("out_trade_no >=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThan(String value) {
            addCriterion("out_trade_no <", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanOrEqualTo(String value) {
            addCriterion("out_trade_no <=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLike(String value) {
            addCriterion("out_trade_no like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotLike(String value) {
            addCriterion("out_trade_no not like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIn(List<String> values) {
            addCriterion("out_trade_no in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotIn(List<String> values) {
            addCriterion("out_trade_no not in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoBetween(String value1, String value2) {
            addCriterion("out_trade_no between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotBetween(String value1, String value2) {
            addCriterion("out_trade_no not between", value1, value2, "outTradeNo");
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

        public Criteria andElecPriceIsNull() {
            addCriterion("elec_price is null");
            return (Criteria) this;
        }

        public Criteria andElecPriceIsNotNull() {
            addCriterion("elec_price is not null");
            return (Criteria) this;
        }

        public Criteria andElecPriceEqualTo(Integer value) {
            addCriterion("elec_price =", value, "elecPrice");
            return (Criteria) this;
        }

        public Criteria andElecPriceNotEqualTo(Integer value) {
            addCriterion("elec_price <>", value, "elecPrice");
            return (Criteria) this;
        }

        public Criteria andElecPriceGreaterThan(Integer value) {
            addCriterion("elec_price >", value, "elecPrice");
            return (Criteria) this;
        }

        public Criteria andElecPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("elec_price >=", value, "elecPrice");
            return (Criteria) this;
        }

        public Criteria andElecPriceLessThan(Integer value) {
            addCriterion("elec_price <", value, "elecPrice");
            return (Criteria) this;
        }

        public Criteria andElecPriceLessThanOrEqualTo(Integer value) {
            addCriterion("elec_price <=", value, "elecPrice");
            return (Criteria) this;
        }

        public Criteria andElecPriceIn(List<Integer> values) {
            addCriterion("elec_price in", values, "elecPrice");
            return (Criteria) this;
        }

        public Criteria andElecPriceNotIn(List<Integer> values) {
            addCriterion("elec_price not in", values, "elecPrice");
            return (Criteria) this;
        }

        public Criteria andElecPriceBetween(Integer value1, Integer value2) {
            addCriterion("elec_price between", value1, value2, "elecPrice");
            return (Criteria) this;
        }

        public Criteria andElecPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("elec_price not between", value1, value2, "elecPrice");
            return (Criteria) this;
        }

        public Criteria andElecChargeIsNull() {
            addCriterion("elec_charge is null");
            return (Criteria) this;
        }

        public Criteria andElecChargeIsNotNull() {
            addCriterion("elec_charge is not null");
            return (Criteria) this;
        }

        public Criteria andElecChargeEqualTo(Integer value) {
            addCriterion("elec_charge =", value, "elecCharge");
            return (Criteria) this;
        }

        public Criteria andElecChargeNotEqualTo(Integer value) {
            addCriterion("elec_charge <>", value, "elecCharge");
            return (Criteria) this;
        }

        public Criteria andElecChargeGreaterThan(Integer value) {
            addCriterion("elec_charge >", value, "elecCharge");
            return (Criteria) this;
        }

        public Criteria andElecChargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("elec_charge >=", value, "elecCharge");
            return (Criteria) this;
        }

        public Criteria andElecChargeLessThan(Integer value) {
            addCriterion("elec_charge <", value, "elecCharge");
            return (Criteria) this;
        }

        public Criteria andElecChargeLessThanOrEqualTo(Integer value) {
            addCriterion("elec_charge <=", value, "elecCharge");
            return (Criteria) this;
        }

        public Criteria andElecChargeIn(List<Integer> values) {
            addCriterion("elec_charge in", values, "elecCharge");
            return (Criteria) this;
        }

        public Criteria andElecChargeNotIn(List<Integer> values) {
            addCriterion("elec_charge not in", values, "elecCharge");
            return (Criteria) this;
        }

        public Criteria andElecChargeBetween(Integer value1, Integer value2) {
            addCriterion("elec_charge between", value1, value2, "elecCharge");
            return (Criteria) this;
        }

        public Criteria andElecChargeNotBetween(Integer value1, Integer value2) {
            addCriterion("elec_charge not between", value1, value2, "elecCharge");
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