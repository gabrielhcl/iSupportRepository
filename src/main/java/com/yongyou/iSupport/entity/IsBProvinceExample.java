package com.yongyou.iSupport.entity;

import java.util.ArrayList;
import java.util.List;

public class IsBProvinceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IsBProvinceExample() {
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

        public Criteria andPkProvinceIsNull() {
            addCriterion("pk_province is null");
            return (Criteria) this;
        }

        public Criteria andPkProvinceIsNotNull() {
            addCriterion("pk_province is not null");
            return (Criteria) this;
        }

        public Criteria andPkProvinceEqualTo(Integer value) {
            addCriterion("pk_province =", value, "pkProvince");
            return (Criteria) this;
        }

        public Criteria andPkProvinceNotEqualTo(Integer value) {
            addCriterion("pk_province <>", value, "pkProvince");
            return (Criteria) this;
        }

        public Criteria andPkProvinceGreaterThan(Integer value) {
            addCriterion("pk_province >", value, "pkProvince");
            return (Criteria) this;
        }

        public Criteria andPkProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_province >=", value, "pkProvince");
            return (Criteria) this;
        }

        public Criteria andPkProvinceLessThan(Integer value) {
            addCriterion("pk_province <", value, "pkProvince");
            return (Criteria) this;
        }

        public Criteria andPkProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("pk_province <=", value, "pkProvince");
            return (Criteria) this;
        }

        public Criteria andPkProvinceIn(List<Integer> values) {
            addCriterion("pk_province in", values, "pkProvince");
            return (Criteria) this;
        }

        public Criteria andPkProvinceNotIn(List<Integer> values) {
            addCriterion("pk_province not in", values, "pkProvince");
            return (Criteria) this;
        }

        public Criteria andPkProvinceBetween(Integer value1, Integer value2) {
            addCriterion("pk_province between", value1, value2, "pkProvince");
            return (Criteria) this;
        }

        public Criteria andPkProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_province not between", value1, value2, "pkProvince");
            return (Criteria) this;
        }

        public Criteria andProcodeIsNull() {
            addCriterion("procode is null");
            return (Criteria) this;
        }

        public Criteria andProcodeIsNotNull() {
            addCriterion("procode is not null");
            return (Criteria) this;
        }

        public Criteria andProcodeEqualTo(String value) {
            addCriterion("procode =", value, "procode");
            return (Criteria) this;
        }

        public Criteria andProcodeNotEqualTo(String value) {
            addCriterion("procode <>", value, "procode");
            return (Criteria) this;
        }

        public Criteria andProcodeGreaterThan(String value) {
            addCriterion("procode >", value, "procode");
            return (Criteria) this;
        }

        public Criteria andProcodeGreaterThanOrEqualTo(String value) {
            addCriterion("procode >=", value, "procode");
            return (Criteria) this;
        }

        public Criteria andProcodeLessThan(String value) {
            addCriterion("procode <", value, "procode");
            return (Criteria) this;
        }

        public Criteria andProcodeLessThanOrEqualTo(String value) {
            addCriterion("procode <=", value, "procode");
            return (Criteria) this;
        }

        public Criteria andProcodeLike(String value) {
            addCriterion("procode like", value, "procode");
            return (Criteria) this;
        }

        public Criteria andProcodeNotLike(String value) {
            addCriterion("procode not like", value, "procode");
            return (Criteria) this;
        }

        public Criteria andProcodeIn(List<String> values) {
            addCriterion("procode in", values, "procode");
            return (Criteria) this;
        }

        public Criteria andProcodeNotIn(List<String> values) {
            addCriterion("procode not in", values, "procode");
            return (Criteria) this;
        }

        public Criteria andProcodeBetween(String value1, String value2) {
            addCriterion("procode between", value1, value2, "procode");
            return (Criteria) this;
        }

        public Criteria andProcodeNotBetween(String value1, String value2) {
            addCriterion("procode not between", value1, value2, "procode");
            return (Criteria) this;
        }

        public Criteria andPronameIsNull() {
            addCriterion("proname is null");
            return (Criteria) this;
        }

        public Criteria andPronameIsNotNull() {
            addCriterion("proname is not null");
            return (Criteria) this;
        }

        public Criteria andPronameEqualTo(String value) {
            addCriterion("proname =", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotEqualTo(String value) {
            addCriterion("proname <>", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThan(String value) {
            addCriterion("proname >", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThanOrEqualTo(String value) {
            addCriterion("proname >=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThan(String value) {
            addCriterion("proname <", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThanOrEqualTo(String value) {
            addCriterion("proname <=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLike(String value) {
            addCriterion("proname like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotLike(String value) {
            addCriterion("proname not like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameIn(List<String> values) {
            addCriterion("proname in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotIn(List<String> values) {
            addCriterion("proname not in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameBetween(String value1, String value2) {
            addCriterion("proname between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotBetween(String value1, String value2) {
            addCriterion("proname not between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNull() {
            addCriterion("areaname is null");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNotNull() {
            addCriterion("areaname is not null");
            return (Criteria) this;
        }

        public Criteria andAreanameEqualTo(String value) {
            addCriterion("areaname =", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotEqualTo(String value) {
            addCriterion("areaname <>", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThan(String value) {
            addCriterion("areaname >", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThanOrEqualTo(String value) {
            addCriterion("areaname >=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThan(String value) {
            addCriterion("areaname <", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThanOrEqualTo(String value) {
            addCriterion("areaname <=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLike(String value) {
            addCriterion("areaname like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotLike(String value) {
            addCriterion("areaname not like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameIn(List<String> values) {
            addCriterion("areaname in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotIn(List<String> values) {
            addCriterion("areaname not in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameBetween(String value1, String value2) {
            addCriterion("areaname between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotBetween(String value1, String value2) {
            addCriterion("areaname not between", value1, value2, "areaname");
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