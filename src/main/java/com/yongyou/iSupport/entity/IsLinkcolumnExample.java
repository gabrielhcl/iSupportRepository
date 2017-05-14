package com.yongyou.iSupport.entity;

import java.util.ArrayList;
import java.util.List;

public class IsLinkcolumnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IsLinkcolumnExample() {
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

        public Criteria andPkColumnIsNull() {
            addCriterion("pk_column is null");
            return (Criteria) this;
        }

        public Criteria andPkColumnIsNotNull() {
            addCriterion("pk_column is not null");
            return (Criteria) this;
        }

        public Criteria andPkColumnEqualTo(Integer value) {
            addCriterion("pk_column =", value, "pkColumn");
            return (Criteria) this;
        }

        public Criteria andPkColumnNotEqualTo(Integer value) {
            addCriterion("pk_column <>", value, "pkColumn");
            return (Criteria) this;
        }

        public Criteria andPkColumnGreaterThan(Integer value) {
            addCriterion("pk_column >", value, "pkColumn");
            return (Criteria) this;
        }

        public Criteria andPkColumnGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_column >=", value, "pkColumn");
            return (Criteria) this;
        }

        public Criteria andPkColumnLessThan(Integer value) {
            addCriterion("pk_column <", value, "pkColumn");
            return (Criteria) this;
        }

        public Criteria andPkColumnLessThanOrEqualTo(Integer value) {
            addCriterion("pk_column <=", value, "pkColumn");
            return (Criteria) this;
        }

        public Criteria andPkColumnIn(List<Integer> values) {
            addCriterion("pk_column in", values, "pkColumn");
            return (Criteria) this;
        }

        public Criteria andPkColumnNotIn(List<Integer> values) {
            addCriterion("pk_column not in", values, "pkColumn");
            return (Criteria) this;
        }

        public Criteria andPkColumnBetween(Integer value1, Integer value2) {
            addCriterion("pk_column between", value1, value2, "pkColumn");
            return (Criteria) this;
        }

        public Criteria andPkColumnNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_column not between", value1, value2, "pkColumn");
            return (Criteria) this;
        }

        public Criteria andColumncodeIsNull() {
            addCriterion("columncode is null");
            return (Criteria) this;
        }

        public Criteria andColumncodeIsNotNull() {
            addCriterion("columncode is not null");
            return (Criteria) this;
        }

        public Criteria andColumncodeEqualTo(String value) {
            addCriterion("columncode =", value, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeNotEqualTo(String value) {
            addCriterion("columncode <>", value, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeGreaterThan(String value) {
            addCriterion("columncode >", value, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeGreaterThanOrEqualTo(String value) {
            addCriterion("columncode >=", value, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeLessThan(String value) {
            addCriterion("columncode <", value, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeLessThanOrEqualTo(String value) {
            addCriterion("columncode <=", value, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeLike(String value) {
            addCriterion("columncode like", value, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeNotLike(String value) {
            addCriterion("columncode not like", value, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeIn(List<String> values) {
            addCriterion("columncode in", values, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeNotIn(List<String> values) {
            addCriterion("columncode not in", values, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeBetween(String value1, String value2) {
            addCriterion("columncode between", value1, value2, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumncodeNotBetween(String value1, String value2) {
            addCriterion("columncode not between", value1, value2, "columncode");
            return (Criteria) this;
        }

        public Criteria andColumnnameIsNull() {
            addCriterion("columnname is null");
            return (Criteria) this;
        }

        public Criteria andColumnnameIsNotNull() {
            addCriterion("columnname is not null");
            return (Criteria) this;
        }

        public Criteria andColumnnameEqualTo(String value) {
            addCriterion("columnname =", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameNotEqualTo(String value) {
            addCriterion("columnname <>", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameGreaterThan(String value) {
            addCriterion("columnname >", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameGreaterThanOrEqualTo(String value) {
            addCriterion("columnname >=", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameLessThan(String value) {
            addCriterion("columnname <", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameLessThanOrEqualTo(String value) {
            addCriterion("columnname <=", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameLike(String value) {
            addCriterion("columnname like", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameNotLike(String value) {
            addCriterion("columnname not like", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameIn(List<String> values) {
            addCriterion("columnname in", values, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameNotIn(List<String> values) {
            addCriterion("columnname not in", values, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameBetween(String value1, String value2) {
            addCriterion("columnname between", value1, value2, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameNotBetween(String value1, String value2) {
            addCriterion("columnname not between", value1, value2, "columnname");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(String value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(String value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(String value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(String value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(String value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(String value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLike(String value) {
            addCriterion("sort like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotLike(String value) {
            addCriterion("sort not like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<String> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<String> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(String value1, String value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(String value1, String value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andIseffectiveIsNull() {
            addCriterion("iseffective is null");
            return (Criteria) this;
        }

        public Criteria andIseffectiveIsNotNull() {
            addCriterion("iseffective is not null");
            return (Criteria) this;
        }

        public Criteria andIseffectiveEqualTo(String value) {
            addCriterion("iseffective =", value, "iseffective");
            return (Criteria) this;
        }

        public Criteria andIseffectiveNotEqualTo(String value) {
            addCriterion("iseffective <>", value, "iseffective");
            return (Criteria) this;
        }

        public Criteria andIseffectiveGreaterThan(String value) {
            addCriterion("iseffective >", value, "iseffective");
            return (Criteria) this;
        }

        public Criteria andIseffectiveGreaterThanOrEqualTo(String value) {
            addCriterion("iseffective >=", value, "iseffective");
            return (Criteria) this;
        }

        public Criteria andIseffectiveLessThan(String value) {
            addCriterion("iseffective <", value, "iseffective");
            return (Criteria) this;
        }

        public Criteria andIseffectiveLessThanOrEqualTo(String value) {
            addCriterion("iseffective <=", value, "iseffective");
            return (Criteria) this;
        }

        public Criteria andIseffectiveLike(String value) {
            addCriterion("iseffective like", value, "iseffective");
            return (Criteria) this;
        }

        public Criteria andIseffectiveNotLike(String value) {
            addCriterion("iseffective not like", value, "iseffective");
            return (Criteria) this;
        }

        public Criteria andIseffectiveIn(List<String> values) {
            addCriterion("iseffective in", values, "iseffective");
            return (Criteria) this;
        }

        public Criteria andIseffectiveNotIn(List<String> values) {
            addCriterion("iseffective not in", values, "iseffective");
            return (Criteria) this;
        }

        public Criteria andIseffectiveBetween(String value1, String value2) {
            addCriterion("iseffective between", value1, value2, "iseffective");
            return (Criteria) this;
        }

        public Criteria andIseffectiveNotBetween(String value1, String value2) {
            addCriterion("iseffective not between", value1, value2, "iseffective");
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