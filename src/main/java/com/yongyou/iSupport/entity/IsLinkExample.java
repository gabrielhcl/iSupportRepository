package com.yongyou.iSupport.entity;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andCreatebyIsNull() {
            addCriterion("createby is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNotNull() {
            addCriterion("createby is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyEqualTo(String value) {
            addCriterion("createby =", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotEqualTo(String value) {
            addCriterion("createby <>", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThan(String value) {
            addCriterion("createby >", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("createby >=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThan(String value) {
            addCriterion("createby <", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThanOrEqualTo(String value) {
            addCriterion("createby <=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLike(String value) {
            addCriterion("createby like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotLike(String value) {
            addCriterion("createby not like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyIn(List<String> values) {
            addCriterion("createby in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotIn(List<String> values) {
            addCriterion("createby not in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyBetween(String value1, String value2) {
            addCriterion("createby between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotBetween(String value1, String value2) {
            addCriterion("createby not between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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