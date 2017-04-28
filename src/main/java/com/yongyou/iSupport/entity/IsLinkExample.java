package com.yongyou.iSupport.entity;

import java.util.ArrayList;
import java.util.List;

public class IsLinkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IsLinkExample() {
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

        public Criteria andPkLinkIsNull() {
            addCriterion("pk_link is null");
            return (Criteria) this;
        }

        public Criteria andPkLinkIsNotNull() {
            addCriterion("pk_link is not null");
            return (Criteria) this;
        }

        public Criteria andPkLinkEqualTo(Integer value) {
            addCriterion("pk_link =", value, "pkLink");
            return (Criteria) this;
        }

        public Criteria andPkLinkNotEqualTo(Integer value) {
            addCriterion("pk_link <>", value, "pkLink");
            return (Criteria) this;
        }

        public Criteria andPkLinkGreaterThan(Integer value) {
            addCriterion("pk_link >", value, "pkLink");
            return (Criteria) this;
        }

        public Criteria andPkLinkGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_link >=", value, "pkLink");
            return (Criteria) this;
        }

        public Criteria andPkLinkLessThan(Integer value) {
            addCriterion("pk_link <", value, "pkLink");
            return (Criteria) this;
        }

        public Criteria andPkLinkLessThanOrEqualTo(Integer value) {
            addCriterion("pk_link <=", value, "pkLink");
            return (Criteria) this;
        }

        public Criteria andPkLinkIn(List<Integer> values) {
            addCriterion("pk_link in", values, "pkLink");
            return (Criteria) this;
        }

        public Criteria andPkLinkNotIn(List<Integer> values) {
            addCriterion("pk_link not in", values, "pkLink");
            return (Criteria) this;
        }

        public Criteria andPkLinkBetween(Integer value1, Integer value2) {
            addCriterion("pk_link between", value1, value2, "pkLink");
            return (Criteria) this;
        }

        public Criteria andPkLinkNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_link not between", value1, value2, "pkLink");
            return (Criteria) this;
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

        public Criteria andLinkcodeIsNull() {
            addCriterion("linkcode is null");
            return (Criteria) this;
        }

        public Criteria andLinkcodeIsNotNull() {
            addCriterion("linkcode is not null");
            return (Criteria) this;
        }

        public Criteria andLinkcodeEqualTo(String value) {
            addCriterion("linkcode =", value, "linkcode");
            return (Criteria) this;
        }

        public Criteria andLinkcodeNotEqualTo(String value) {
            addCriterion("linkcode <>", value, "linkcode");
            return (Criteria) this;
        }

        public Criteria andLinkcodeGreaterThan(String value) {
            addCriterion("linkcode >", value, "linkcode");
            return (Criteria) this;
        }

        public Criteria andLinkcodeGreaterThanOrEqualTo(String value) {
            addCriterion("linkcode >=", value, "linkcode");
            return (Criteria) this;
        }

        public Criteria andLinkcodeLessThan(String value) {
            addCriterion("linkcode <", value, "linkcode");
            return (Criteria) this;
        }

        public Criteria andLinkcodeLessThanOrEqualTo(String value) {
            addCriterion("linkcode <=", value, "linkcode");
            return (Criteria) this;
        }

        public Criteria andLinkcodeLike(String value) {
            addCriterion("linkcode like", value, "linkcode");
            return (Criteria) this;
        }

        public Criteria andLinkcodeNotLike(String value) {
            addCriterion("linkcode not like", value, "linkcode");
            return (Criteria) this;
        }

        public Criteria andLinkcodeIn(List<String> values) {
            addCriterion("linkcode in", values, "linkcode");
            return (Criteria) this;
        }

        public Criteria andLinkcodeNotIn(List<String> values) {
            addCriterion("linkcode not in", values, "linkcode");
            return (Criteria) this;
        }

        public Criteria andLinkcodeBetween(String value1, String value2) {
            addCriterion("linkcode between", value1, value2, "linkcode");
            return (Criteria) this;
        }

        public Criteria andLinkcodeNotBetween(String value1, String value2) {
            addCriterion("linkcode not between", value1, value2, "linkcode");
            return (Criteria) this;
        }

        public Criteria andLinknameIsNull() {
            addCriterion("linkname is null");
            return (Criteria) this;
        }

        public Criteria andLinknameIsNotNull() {
            addCriterion("linkname is not null");
            return (Criteria) this;
        }

        public Criteria andLinknameEqualTo(String value) {
            addCriterion("linkname =", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotEqualTo(String value) {
            addCriterion("linkname <>", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameGreaterThan(String value) {
            addCriterion("linkname >", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameGreaterThanOrEqualTo(String value) {
            addCriterion("linkname >=", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameLessThan(String value) {
            addCriterion("linkname <", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameLessThanOrEqualTo(String value) {
            addCriterion("linkname <=", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameLike(String value) {
            addCriterion("linkname like", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotLike(String value) {
            addCriterion("linkname not like", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameIn(List<String> values) {
            addCriterion("linkname in", values, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotIn(List<String> values) {
            addCriterion("linkname not in", values, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameBetween(String value1, String value2) {
            addCriterion("linkname between", value1, value2, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotBetween(String value1, String value2) {
            addCriterion("linkname not between", value1, value2, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinkurlIsNull() {
            addCriterion("linkurl is null");
            return (Criteria) this;
        }

        public Criteria andLinkurlIsNotNull() {
            addCriterion("linkurl is not null");
            return (Criteria) this;
        }

        public Criteria andLinkurlEqualTo(String value) {
            addCriterion("linkurl =", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlNotEqualTo(String value) {
            addCriterion("linkurl <>", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlGreaterThan(String value) {
            addCriterion("linkurl >", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlGreaterThanOrEqualTo(String value) {
            addCriterion("linkurl >=", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlLessThan(String value) {
            addCriterion("linkurl <", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlLessThanOrEqualTo(String value) {
            addCriterion("linkurl <=", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlLike(String value) {
            addCriterion("linkurl like", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlNotLike(String value) {
            addCriterion("linkurl not like", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlIn(List<String> values) {
            addCriterion("linkurl in", values, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlNotIn(List<String> values) {
            addCriterion("linkurl not in", values, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlBetween(String value1, String value2) {
            addCriterion("linkurl between", value1, value2, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlNotBetween(String value1, String value2) {
            addCriterion("linkurl not between", value1, value2, "linkurl");
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