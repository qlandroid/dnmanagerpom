package com.dnmanager.pojo;

import java.util.ArrayList;
import java.util.List;

public class CommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityExample() {
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

        public Criteria andTableNameIsNull() {
            addCriterion("table_name is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("table_name is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("table_name =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("table_name <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("table_name >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("table_name >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("table_name <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("table_name <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("table_name like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("table_name not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("table_name in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("table_name not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("table_name between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("table_name not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNull() {
            addCriterion("commodity_name is null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNotNull() {
            addCriterion("commodity_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameEqualTo(String value) {
            addCriterion("commodity_name =", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotEqualTo(String value) {
            addCriterion("commodity_name <>", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThan(String value) {
            addCriterion("commodity_name >", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_name >=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThan(String value) {
            addCriterion("commodity_name <", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThanOrEqualTo(String value) {
            addCriterion("commodity_name <=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLike(String value) {
            addCriterion("commodity_name like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotLike(String value) {
            addCriterion("commodity_name not like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIn(List<String> values) {
            addCriterion("commodity_name in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotIn(List<String> values) {
            addCriterion("commodity_name not in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameBetween(String value1, String value2) {
            addCriterion("commodity_name between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotBetween(String value1, String value2) {
            addCriterion("commodity_name not between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andElecTypeIsNull() {
            addCriterion("elec_type is null");
            return (Criteria) this;
        }

        public Criteria andElecTypeIsNotNull() {
            addCriterion("elec_type is not null");
            return (Criteria) this;
        }

        public Criteria andElecTypeEqualTo(String value) {
            addCriterion("elec_type =", value, "elecType");
            return (Criteria) this;
        }

        public Criteria andElecTypeNotEqualTo(String value) {
            addCriterion("elec_type <>", value, "elecType");
            return (Criteria) this;
        }

        public Criteria andElecTypeGreaterThan(String value) {
            addCriterion("elec_type >", value, "elecType");
            return (Criteria) this;
        }

        public Criteria andElecTypeGreaterThanOrEqualTo(String value) {
            addCriterion("elec_type >=", value, "elecType");
            return (Criteria) this;
        }

        public Criteria andElecTypeLessThan(String value) {
            addCriterion("elec_type <", value, "elecType");
            return (Criteria) this;
        }

        public Criteria andElecTypeLessThanOrEqualTo(String value) {
            addCriterion("elec_type <=", value, "elecType");
            return (Criteria) this;
        }

        public Criteria andElecTypeLike(String value) {
            addCriterion("elec_type like", value, "elecType");
            return (Criteria) this;
        }

        public Criteria andElecTypeNotLike(String value) {
            addCriterion("elec_type not like", value, "elecType");
            return (Criteria) this;
        }

        public Criteria andElecTypeIn(List<String> values) {
            addCriterion("elec_type in", values, "elecType");
            return (Criteria) this;
        }

        public Criteria andElecTypeNotIn(List<String> values) {
            addCriterion("elec_type not in", values, "elecType");
            return (Criteria) this;
        }

        public Criteria andElecTypeBetween(String value1, String value2) {
            addCriterion("elec_type between", value1, value2, "elecType");
            return (Criteria) this;
        }

        public Criteria andElecTypeNotBetween(String value1, String value2) {
            addCriterion("elec_type not between", value1, value2, "elecType");
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

        public Criteria andPulseConsIsNull() {
            addCriterion("pulse_cons is null");
            return (Criteria) this;
        }

        public Criteria andPulseConsIsNotNull() {
            addCriterion("pulse_cons is not null");
            return (Criteria) this;
        }

        public Criteria andPulseConsEqualTo(String value) {
            addCriterion("pulse_cons =", value, "pulseCons");
            return (Criteria) this;
        }

        public Criteria andPulseConsNotEqualTo(String value) {
            addCriterion("pulse_cons <>", value, "pulseCons");
            return (Criteria) this;
        }

        public Criteria andPulseConsGreaterThan(String value) {
            addCriterion("pulse_cons >", value, "pulseCons");
            return (Criteria) this;
        }

        public Criteria andPulseConsGreaterThanOrEqualTo(String value) {
            addCriterion("pulse_cons >=", value, "pulseCons");
            return (Criteria) this;
        }

        public Criteria andPulseConsLessThan(String value) {
            addCriterion("pulse_cons <", value, "pulseCons");
            return (Criteria) this;
        }

        public Criteria andPulseConsLessThanOrEqualTo(String value) {
            addCriterion("pulse_cons <=", value, "pulseCons");
            return (Criteria) this;
        }

        public Criteria andPulseConsLike(String value) {
            addCriterion("pulse_cons like", value, "pulseCons");
            return (Criteria) this;
        }

        public Criteria andPulseConsNotLike(String value) {
            addCriterion("pulse_cons not like", value, "pulseCons");
            return (Criteria) this;
        }

        public Criteria andPulseConsIn(List<String> values) {
            addCriterion("pulse_cons in", values, "pulseCons");
            return (Criteria) this;
        }

        public Criteria andPulseConsNotIn(List<String> values) {
            addCriterion("pulse_cons not in", values, "pulseCons");
            return (Criteria) this;
        }

        public Criteria andPulseConsBetween(String value1, String value2) {
            addCriterion("pulse_cons between", value1, value2, "pulseCons");
            return (Criteria) this;
        }

        public Criteria andPulseConsNotBetween(String value1, String value2) {
            addCriterion("pulse_cons not between", value1, value2, "pulseCons");
            return (Criteria) this;
        }

        public Criteria andAccClassIsNull() {
            addCriterion("acc_class is null");
            return (Criteria) this;
        }

        public Criteria andAccClassIsNotNull() {
            addCriterion("acc_class is not null");
            return (Criteria) this;
        }

        public Criteria andAccClassEqualTo(String value) {
            addCriterion("acc_class =", value, "accClass");
            return (Criteria) this;
        }

        public Criteria andAccClassNotEqualTo(String value) {
            addCriterion("acc_class <>", value, "accClass");
            return (Criteria) this;
        }

        public Criteria andAccClassGreaterThan(String value) {
            addCriterion("acc_class >", value, "accClass");
            return (Criteria) this;
        }

        public Criteria andAccClassGreaterThanOrEqualTo(String value) {
            addCriterion("acc_class >=", value, "accClass");
            return (Criteria) this;
        }

        public Criteria andAccClassLessThan(String value) {
            addCriterion("acc_class <", value, "accClass");
            return (Criteria) this;
        }

        public Criteria andAccClassLessThanOrEqualTo(String value) {
            addCriterion("acc_class <=", value, "accClass");
            return (Criteria) this;
        }

        public Criteria andAccClassLike(String value) {
            addCriterion("acc_class like", value, "accClass");
            return (Criteria) this;
        }

        public Criteria andAccClassNotLike(String value) {
            addCriterion("acc_class not like", value, "accClass");
            return (Criteria) this;
        }

        public Criteria andAccClassIn(List<String> values) {
            addCriterion("acc_class in", values, "accClass");
            return (Criteria) this;
        }

        public Criteria andAccClassNotIn(List<String> values) {
            addCriterion("acc_class not in", values, "accClass");
            return (Criteria) this;
        }

        public Criteria andAccClassBetween(String value1, String value2) {
            addCriterion("acc_class between", value1, value2, "accClass");
            return (Criteria) this;
        }

        public Criteria andAccClassNotBetween(String value1, String value2) {
            addCriterion("acc_class not between", value1, value2, "accClass");
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

        public Criteria andGuidePriceIsNull() {
            addCriterion("guide_price is null");
            return (Criteria) this;
        }

        public Criteria andGuidePriceIsNotNull() {
            addCriterion("guide_price is not null");
            return (Criteria) this;
        }

        public Criteria andGuidePriceEqualTo(Integer value) {
            addCriterion("guide_price =", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceNotEqualTo(Integer value) {
            addCriterion("guide_price <>", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceGreaterThan(Integer value) {
            addCriterion("guide_price >", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("guide_price >=", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceLessThan(Integer value) {
            addCriterion("guide_price <", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceLessThanOrEqualTo(Integer value) {
            addCriterion("guide_price <=", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceIn(List<Integer> values) {
            addCriterion("guide_price in", values, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceNotIn(List<Integer> values) {
            addCriterion("guide_price not in", values, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceBetween(Integer value1, Integer value2) {
            addCriterion("guide_price between", value1, value2, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("guide_price not between", value1, value2, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andBannerImgIsNull() {
            addCriterion("banner_img is null");
            return (Criteria) this;
        }

        public Criteria andBannerImgIsNotNull() {
            addCriterion("banner_img is not null");
            return (Criteria) this;
        }

        public Criteria andBannerImgEqualTo(String value) {
            addCriterion("banner_img =", value, "bannerImg");
            return (Criteria) this;
        }

        public Criteria andBannerImgNotEqualTo(String value) {
            addCriterion("banner_img <>", value, "bannerImg");
            return (Criteria) this;
        }

        public Criteria andBannerImgGreaterThan(String value) {
            addCriterion("banner_img >", value, "bannerImg");
            return (Criteria) this;
        }

        public Criteria andBannerImgGreaterThanOrEqualTo(String value) {
            addCriterion("banner_img >=", value, "bannerImg");
            return (Criteria) this;
        }

        public Criteria andBannerImgLessThan(String value) {
            addCriterion("banner_img <", value, "bannerImg");
            return (Criteria) this;
        }

        public Criteria andBannerImgLessThanOrEqualTo(String value) {
            addCriterion("banner_img <=", value, "bannerImg");
            return (Criteria) this;
        }

        public Criteria andBannerImgLike(String value) {
            addCriterion("banner_img like", value, "bannerImg");
            return (Criteria) this;
        }

        public Criteria andBannerImgNotLike(String value) {
            addCriterion("banner_img not like", value, "bannerImg");
            return (Criteria) this;
        }

        public Criteria andBannerImgIn(List<String> values) {
            addCriterion("banner_img in", values, "bannerImg");
            return (Criteria) this;
        }

        public Criteria andBannerImgNotIn(List<String> values) {
            addCriterion("banner_img not in", values, "bannerImg");
            return (Criteria) this;
        }

        public Criteria andBannerImgBetween(String value1, String value2) {
            addCriterion("banner_img between", value1, value2, "bannerImg");
            return (Criteria) this;
        }

        public Criteria andBannerImgNotBetween(String value1, String value2) {
            addCriterion("banner_img not between", value1, value2, "bannerImg");
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