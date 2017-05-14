package com.yongyou.iSupport.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IsMainplanHExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IsMainplanHExample() {
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

        public Criteria andPkMainplanHIsNull() {
            addCriterion("pk_mainplan_h is null");
            return (Criteria) this;
        }

        public Criteria andPkMainplanHIsNotNull() {
            addCriterion("pk_mainplan_h is not null");
            return (Criteria) this;
        }

        public Criteria andPkMainplanHEqualTo(Integer value) {
            addCriterion("pk_mainplan_h =", value, "pkMainplanH");
            return (Criteria) this;
        }

        public Criteria andPkMainplanHNotEqualTo(Integer value) {
            addCriterion("pk_mainplan_h <>", value, "pkMainplanH");
            return (Criteria) this;
        }

        public Criteria andPkMainplanHGreaterThan(Integer value) {
            addCriterion("pk_mainplan_h >", value, "pkMainplanH");
            return (Criteria) this;
        }

        public Criteria andPkMainplanHGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_mainplan_h >=", value, "pkMainplanH");
            return (Criteria) this;
        }

        public Criteria andPkMainplanHLessThan(Integer value) {
            addCriterion("pk_mainplan_h <", value, "pkMainplanH");
            return (Criteria) this;
        }

        public Criteria andPkMainplanHLessThanOrEqualTo(Integer value) {
            addCriterion("pk_mainplan_h <=", value, "pkMainplanH");
            return (Criteria) this;
        }

        public Criteria andPkMainplanHIn(List<Integer> values) {
            addCriterion("pk_mainplan_h in", values, "pkMainplanH");
            return (Criteria) this;
        }

        public Criteria andPkMainplanHNotIn(List<Integer> values) {
            addCriterion("pk_mainplan_h not in", values, "pkMainplanH");
            return (Criteria) this;
        }

        public Criteria andPkMainplanHBetween(Integer value1, Integer value2) {
            addCriterion("pk_mainplan_h between", value1, value2, "pkMainplanH");
            return (Criteria) this;
        }

        public Criteria andPkMainplanHNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_mainplan_h not between", value1, value2, "pkMainplanH");
            return (Criteria) this;
        }

        public Criteria andMainplancodeIsNull() {
            addCriterion("mainplancode is null");
            return (Criteria) this;
        }

        public Criteria andMainplancodeIsNotNull() {
            addCriterion("mainplancode is not null");
            return (Criteria) this;
        }

        public Criteria andMainplancodeEqualTo(String value) {
            addCriterion("mainplancode =", value, "mainplancode");
            return (Criteria) this;
        }

        public Criteria andMainplancodeNotEqualTo(String value) {
            addCriterion("mainplancode <>", value, "mainplancode");
            return (Criteria) this;
        }

        public Criteria andMainplancodeGreaterThan(String value) {
            addCriterion("mainplancode >", value, "mainplancode");
            return (Criteria) this;
        }

        public Criteria andMainplancodeGreaterThanOrEqualTo(String value) {
            addCriterion("mainplancode >=", value, "mainplancode");
            return (Criteria) this;
        }

        public Criteria andMainplancodeLessThan(String value) {
            addCriterion("mainplancode <", value, "mainplancode");
            return (Criteria) this;
        }

        public Criteria andMainplancodeLessThanOrEqualTo(String value) {
            addCriterion("mainplancode <=", value, "mainplancode");
            return (Criteria) this;
        }

        public Criteria andMainplancodeLike(String value) {
            addCriterion("mainplancode like", value, "mainplancode");
            return (Criteria) this;
        }

        public Criteria andMainplancodeNotLike(String value) {
            addCriterion("mainplancode not like", value, "mainplancode");
            return (Criteria) this;
        }

        public Criteria andMainplancodeIn(List<String> values) {
            addCriterion("mainplancode in", values, "mainplancode");
            return (Criteria) this;
        }

        public Criteria andMainplancodeNotIn(List<String> values) {
            addCriterion("mainplancode not in", values, "mainplancode");
            return (Criteria) this;
        }

        public Criteria andMainplancodeBetween(String value1, String value2) {
            addCriterion("mainplancode between", value1, value2, "mainplancode");
            return (Criteria) this;
        }

        public Criteria andMainplancodeNotBetween(String value1, String value2) {
            addCriterion("mainplancode not between", value1, value2, "mainplancode");
            return (Criteria) this;
        }

        public Criteria andMainplannameIsNull() {
            addCriterion("mainplanname is null");
            return (Criteria) this;
        }

        public Criteria andMainplannameIsNotNull() {
            addCriterion("mainplanname is not null");
            return (Criteria) this;
        }

        public Criteria andMainplannameEqualTo(String value) {
            addCriterion("mainplanname =", value, "mainplanname");
            return (Criteria) this;
        }

        public Criteria andMainplannameNotEqualTo(String value) {
            addCriterion("mainplanname <>", value, "mainplanname");
            return (Criteria) this;
        }

        public Criteria andMainplannameGreaterThan(String value) {
            addCriterion("mainplanname >", value, "mainplanname");
            return (Criteria) this;
        }

        public Criteria andMainplannameGreaterThanOrEqualTo(String value) {
            addCriterion("mainplanname >=", value, "mainplanname");
            return (Criteria) this;
        }

        public Criteria andMainplannameLessThan(String value) {
            addCriterion("mainplanname <", value, "mainplanname");
            return (Criteria) this;
        }

        public Criteria andMainplannameLessThanOrEqualTo(String value) {
            addCriterion("mainplanname <=", value, "mainplanname");
            return (Criteria) this;
        }

        public Criteria andMainplannameLike(String value) {
            addCriterion("mainplanname like", value, "mainplanname");
            return (Criteria) this;
        }

        public Criteria andMainplannameNotLike(String value) {
            addCriterion("mainplanname not like", value, "mainplanname");
            return (Criteria) this;
        }

        public Criteria andMainplannameIn(List<String> values) {
            addCriterion("mainplanname in", values, "mainplanname");
            return (Criteria) this;
        }

        public Criteria andMainplannameNotIn(List<String> values) {
            addCriterion("mainplanname not in", values, "mainplanname");
            return (Criteria) this;
        }

        public Criteria andMainplannameBetween(String value1, String value2) {
            addCriterion("mainplanname between", value1, value2, "mainplanname");
            return (Criteria) this;
        }

        public Criteria andMainplannameNotBetween(String value1, String value2) {
            addCriterion("mainplanname not between", value1, value2, "mainplanname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("projectname is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("projectname is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("projectname =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("projectname <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("projectname >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("projectname >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("projectname <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("projectname <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("projectname like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("projectname not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("projectname in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("projectname not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("projectname between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("projectname not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andCompilerIsNull() {
            addCriterion("compiler is null");
            return (Criteria) this;
        }

        public Criteria andCompilerIsNotNull() {
            addCriterion("compiler is not null");
            return (Criteria) this;
        }

        public Criteria andCompilerEqualTo(String value) {
            addCriterion("compiler =", value, "compiler");
            return (Criteria) this;
        }

        public Criteria andCompilerNotEqualTo(String value) {
            addCriterion("compiler <>", value, "compiler");
            return (Criteria) this;
        }

        public Criteria andCompilerGreaterThan(String value) {
            addCriterion("compiler >", value, "compiler");
            return (Criteria) this;
        }

        public Criteria andCompilerGreaterThanOrEqualTo(String value) {
            addCriterion("compiler >=", value, "compiler");
            return (Criteria) this;
        }

        public Criteria andCompilerLessThan(String value) {
            addCriterion("compiler <", value, "compiler");
            return (Criteria) this;
        }

        public Criteria andCompilerLessThanOrEqualTo(String value) {
            addCriterion("compiler <=", value, "compiler");
            return (Criteria) this;
        }

        public Criteria andCompilerLike(String value) {
            addCriterion("compiler like", value, "compiler");
            return (Criteria) this;
        }

        public Criteria andCompilerNotLike(String value) {
            addCriterion("compiler not like", value, "compiler");
            return (Criteria) this;
        }

        public Criteria andCompilerIn(List<String> values) {
            addCriterion("compiler in", values, "compiler");
            return (Criteria) this;
        }

        public Criteria andCompilerNotIn(List<String> values) {
            addCriterion("compiler not in", values, "compiler");
            return (Criteria) this;
        }

        public Criteria andCompilerBetween(String value1, String value2) {
            addCriterion("compiler between", value1, value2, "compiler");
            return (Criteria) this;
        }

        public Criteria andCompilerNotBetween(String value1, String value2) {
            addCriterion("compiler not between", value1, value2, "compiler");
            return (Criteria) this;
        }

        public Criteria andCompiledateIsNull() {
            addCriterion("compiledate is null");
            return (Criteria) this;
        }

        public Criteria andCompiledateIsNotNull() {
            addCriterion("compiledate is not null");
            return (Criteria) this;
        }

        public Criteria andCompiledateEqualTo(Date value) {
            addCriterion("compiledate =", value, "compiledate");
            return (Criteria) this;
        }

        public Criteria andCompiledateNotEqualTo(Date value) {
            addCriterion("compiledate <>", value, "compiledate");
            return (Criteria) this;
        }

        public Criteria andCompiledateGreaterThan(Date value) {
            addCriterion("compiledate >", value, "compiledate");
            return (Criteria) this;
        }

        public Criteria andCompiledateGreaterThanOrEqualTo(Date value) {
            addCriterion("compiledate >=", value, "compiledate");
            return (Criteria) this;
        }

        public Criteria andCompiledateLessThan(Date value) {
            addCriterion("compiledate <", value, "compiledate");
            return (Criteria) this;
        }

        public Criteria andCompiledateLessThanOrEqualTo(Date value) {
            addCriterion("compiledate <=", value, "compiledate");
            return (Criteria) this;
        }

        public Criteria andCompiledateIn(List<Date> values) {
            addCriterion("compiledate in", values, "compiledate");
            return (Criteria) this;
        }

        public Criteria andCompiledateNotIn(List<Date> values) {
            addCriterion("compiledate not in", values, "compiledate");
            return (Criteria) this;
        }

        public Criteria andCompiledateBetween(Date value1, Date value2) {
            addCriterion("compiledate between", value1, value2, "compiledate");
            return (Criteria) this;
        }

        public Criteria andCompiledateNotBetween(Date value1, Date value2) {
            addCriterion("compiledate not between", value1, value2, "compiledate");
            return (Criteria) this;
        }

        public Criteria andPstartdateIsNull() {
            addCriterion("pstartdate is null");
            return (Criteria) this;
        }

        public Criteria andPstartdateIsNotNull() {
            addCriterion("pstartdate is not null");
            return (Criteria) this;
        }

        public Criteria andPstartdateEqualTo(Date value) {
            addCriterion("pstartdate =", value, "pstartdate");
            return (Criteria) this;
        }

        public Criteria andPstartdateNotEqualTo(Date value) {
            addCriterion("pstartdate <>", value, "pstartdate");
            return (Criteria) this;
        }

        public Criteria andPstartdateGreaterThan(Date value) {
            addCriterion("pstartdate >", value, "pstartdate");
            return (Criteria) this;
        }

        public Criteria andPstartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("pstartdate >=", value, "pstartdate");
            return (Criteria) this;
        }

        public Criteria andPstartdateLessThan(Date value) {
            addCriterion("pstartdate <", value, "pstartdate");
            return (Criteria) this;
        }

        public Criteria andPstartdateLessThanOrEqualTo(Date value) {
            addCriterion("pstartdate <=", value, "pstartdate");
            return (Criteria) this;
        }

        public Criteria andPstartdateIn(List<Date> values) {
            addCriterion("pstartdate in", values, "pstartdate");
            return (Criteria) this;
        }

        public Criteria andPstartdateNotIn(List<Date> values) {
            addCriterion("pstartdate not in", values, "pstartdate");
            return (Criteria) this;
        }

        public Criteria andPstartdateBetween(Date value1, Date value2) {
            addCriterion("pstartdate between", value1, value2, "pstartdate");
            return (Criteria) this;
        }

        public Criteria andPstartdateNotBetween(Date value1, Date value2) {
            addCriterion("pstartdate not between", value1, value2, "pstartdate");
            return (Criteria) this;
        }

        public Criteria andPenddateIsNull() {
            addCriterion("penddate is null");
            return (Criteria) this;
        }

        public Criteria andPenddateIsNotNull() {
            addCriterion("penddate is not null");
            return (Criteria) this;
        }

        public Criteria andPenddateEqualTo(Date value) {
            addCriterion("penddate =", value, "penddate");
            return (Criteria) this;
        }

        public Criteria andPenddateNotEqualTo(Date value) {
            addCriterion("penddate <>", value, "penddate");
            return (Criteria) this;
        }

        public Criteria andPenddateGreaterThan(Date value) {
            addCriterion("penddate >", value, "penddate");
            return (Criteria) this;
        }

        public Criteria andPenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("penddate >=", value, "penddate");
            return (Criteria) this;
        }

        public Criteria andPenddateLessThan(Date value) {
            addCriterion("penddate <", value, "penddate");
            return (Criteria) this;
        }

        public Criteria andPenddateLessThanOrEqualTo(Date value) {
            addCriterion("penddate <=", value, "penddate");
            return (Criteria) this;
        }

        public Criteria andPenddateIn(List<Date> values) {
            addCriterion("penddate in", values, "penddate");
            return (Criteria) this;
        }

        public Criteria andPenddateNotIn(List<Date> values) {
            addCriterion("penddate not in", values, "penddate");
            return (Criteria) this;
        }

        public Criteria andPenddateBetween(Date value1, Date value2) {
            addCriterion("penddate between", value1, value2, "penddate");
            return (Criteria) this;
        }

        public Criteria andPenddateNotBetween(Date value1, Date value2) {
            addCriterion("penddate not between", value1, value2, "penddate");
            return (Criteria) this;
        }

        public Criteria andPlancycleIsNull() {
            addCriterion("plancycle is null");
            return (Criteria) this;
        }

        public Criteria andPlancycleIsNotNull() {
            addCriterion("plancycle is not null");
            return (Criteria) this;
        }

        public Criteria andPlancycleEqualTo(String value) {
            addCriterion("plancycle =", value, "plancycle");
            return (Criteria) this;
        }

        public Criteria andPlancycleNotEqualTo(String value) {
            addCriterion("plancycle <>", value, "plancycle");
            return (Criteria) this;
        }

        public Criteria andPlancycleGreaterThan(String value) {
            addCriterion("plancycle >", value, "plancycle");
            return (Criteria) this;
        }

        public Criteria andPlancycleGreaterThanOrEqualTo(String value) {
            addCriterion("plancycle >=", value, "plancycle");
            return (Criteria) this;
        }

        public Criteria andPlancycleLessThan(String value) {
            addCriterion("plancycle <", value, "plancycle");
            return (Criteria) this;
        }

        public Criteria andPlancycleLessThanOrEqualTo(String value) {
            addCriterion("plancycle <=", value, "plancycle");
            return (Criteria) this;
        }

        public Criteria andPlancycleLike(String value) {
            addCriterion("plancycle like", value, "plancycle");
            return (Criteria) this;
        }

        public Criteria andPlancycleNotLike(String value) {
            addCriterion("plancycle not like", value, "plancycle");
            return (Criteria) this;
        }

        public Criteria andPlancycleIn(List<String> values) {
            addCriterion("plancycle in", values, "plancycle");
            return (Criteria) this;
        }

        public Criteria andPlancycleNotIn(List<String> values) {
            addCriterion("plancycle not in", values, "plancycle");
            return (Criteria) this;
        }

        public Criteria andPlancycleBetween(String value1, String value2) {
            addCriterion("plancycle between", value1, value2, "plancycle");
            return (Criteria) this;
        }

        public Criteria andPlancycleNotBetween(String value1, String value2) {
            addCriterion("plancycle not between", value1, value2, "plancycle");
            return (Criteria) this;
        }

        public Criteria andSumdaytimeIsNull() {
            addCriterion("sumdaytime is null");
            return (Criteria) this;
        }

        public Criteria andSumdaytimeIsNotNull() {
            addCriterion("sumdaytime is not null");
            return (Criteria) this;
        }

        public Criteria andSumdaytimeEqualTo(String value) {
            addCriterion("sumdaytime =", value, "sumdaytime");
            return (Criteria) this;
        }

        public Criteria andSumdaytimeNotEqualTo(String value) {
            addCriterion("sumdaytime <>", value, "sumdaytime");
            return (Criteria) this;
        }

        public Criteria andSumdaytimeGreaterThan(String value) {
            addCriterion("sumdaytime >", value, "sumdaytime");
            return (Criteria) this;
        }

        public Criteria andSumdaytimeGreaterThanOrEqualTo(String value) {
            addCriterion("sumdaytime >=", value, "sumdaytime");
            return (Criteria) this;
        }

        public Criteria andSumdaytimeLessThan(String value) {
            addCriterion("sumdaytime <", value, "sumdaytime");
            return (Criteria) this;
        }

        public Criteria andSumdaytimeLessThanOrEqualTo(String value) {
            addCriterion("sumdaytime <=", value, "sumdaytime");
            return (Criteria) this;
        }

        public Criteria andSumdaytimeLike(String value) {
            addCriterion("sumdaytime like", value, "sumdaytime");
            return (Criteria) this;
        }

        public Criteria andSumdaytimeNotLike(String value) {
            addCriterion("sumdaytime not like", value, "sumdaytime");
            return (Criteria) this;
        }

        public Criteria andSumdaytimeIn(List<String> values) {
            addCriterion("sumdaytime in", values, "sumdaytime");
            return (Criteria) this;
        }

        public Criteria andSumdaytimeNotIn(List<String> values) {
            addCriterion("sumdaytime not in", values, "sumdaytime");
            return (Criteria) this;
        }

        public Criteria andSumdaytimeBetween(String value1, String value2) {
            addCriterion("sumdaytime between", value1, value2, "sumdaytime");
            return (Criteria) this;
        }

        public Criteria andSumdaytimeNotBetween(String value1, String value2) {
            addCriterion("sumdaytime not between", value1, value2, "sumdaytime");
            return (Criteria) this;
        }

        public Criteria andPmnumIsNull() {
            addCriterion("pmnum is null");
            return (Criteria) this;
        }

        public Criteria andPmnumIsNotNull() {
            addCriterion("pmnum is not null");
            return (Criteria) this;
        }

        public Criteria andPmnumEqualTo(String value) {
            addCriterion("pmnum =", value, "pmnum");
            return (Criteria) this;
        }

        public Criteria andPmnumNotEqualTo(String value) {
            addCriterion("pmnum <>", value, "pmnum");
            return (Criteria) this;
        }

        public Criteria andPmnumGreaterThan(String value) {
            addCriterion("pmnum >", value, "pmnum");
            return (Criteria) this;
        }

        public Criteria andPmnumGreaterThanOrEqualTo(String value) {
            addCriterion("pmnum >=", value, "pmnum");
            return (Criteria) this;
        }

        public Criteria andPmnumLessThan(String value) {
            addCriterion("pmnum <", value, "pmnum");
            return (Criteria) this;
        }

        public Criteria andPmnumLessThanOrEqualTo(String value) {
            addCriterion("pmnum <=", value, "pmnum");
            return (Criteria) this;
        }

        public Criteria andPmnumLike(String value) {
            addCriterion("pmnum like", value, "pmnum");
            return (Criteria) this;
        }

        public Criteria andPmnumNotLike(String value) {
            addCriterion("pmnum not like", value, "pmnum");
            return (Criteria) this;
        }

        public Criteria andPmnumIn(List<String> values) {
            addCriterion("pmnum in", values, "pmnum");
            return (Criteria) this;
        }

        public Criteria andPmnumNotIn(List<String> values) {
            addCriterion("pmnum not in", values, "pmnum");
            return (Criteria) this;
        }

        public Criteria andPmnumBetween(String value1, String value2) {
            addCriterion("pmnum between", value1, value2, "pmnum");
            return (Criteria) this;
        }

        public Criteria andPmnumNotBetween(String value1, String value2) {
            addCriterion("pmnum not between", value1, value2, "pmnum");
            return (Criteria) this;
        }

        public Criteria andPmdaysIsNull() {
            addCriterion("pmdays is null");
            return (Criteria) this;
        }

        public Criteria andPmdaysIsNotNull() {
            addCriterion("pmdays is not null");
            return (Criteria) this;
        }

        public Criteria andPmdaysEqualTo(String value) {
            addCriterion("pmdays =", value, "pmdays");
            return (Criteria) this;
        }

        public Criteria andPmdaysNotEqualTo(String value) {
            addCriterion("pmdays <>", value, "pmdays");
            return (Criteria) this;
        }

        public Criteria andPmdaysGreaterThan(String value) {
            addCriterion("pmdays >", value, "pmdays");
            return (Criteria) this;
        }

        public Criteria andPmdaysGreaterThanOrEqualTo(String value) {
            addCriterion("pmdays >=", value, "pmdays");
            return (Criteria) this;
        }

        public Criteria andPmdaysLessThan(String value) {
            addCriterion("pmdays <", value, "pmdays");
            return (Criteria) this;
        }

        public Criteria andPmdaysLessThanOrEqualTo(String value) {
            addCriterion("pmdays <=", value, "pmdays");
            return (Criteria) this;
        }

        public Criteria andPmdaysLike(String value) {
            addCriterion("pmdays like", value, "pmdays");
            return (Criteria) this;
        }

        public Criteria andPmdaysNotLike(String value) {
            addCriterion("pmdays not like", value, "pmdays");
            return (Criteria) this;
        }

        public Criteria andPmdaysIn(List<String> values) {
            addCriterion("pmdays in", values, "pmdays");
            return (Criteria) this;
        }

        public Criteria andPmdaysNotIn(List<String> values) {
            addCriterion("pmdays not in", values, "pmdays");
            return (Criteria) this;
        }

        public Criteria andPmdaysBetween(String value1, String value2) {
            addCriterion("pmdays between", value1, value2, "pmdays");
            return (Criteria) this;
        }

        public Criteria andPmdaysNotBetween(String value1, String value2) {
            addCriterion("pmdays not between", value1, value2, "pmdays");
            return (Criteria) this;
        }

        public Criteria andImnumIsNull() {
            addCriterion("imnum is null");
            return (Criteria) this;
        }

        public Criteria andImnumIsNotNull() {
            addCriterion("imnum is not null");
            return (Criteria) this;
        }

        public Criteria andImnumEqualTo(String value) {
            addCriterion("imnum =", value, "imnum");
            return (Criteria) this;
        }

        public Criteria andImnumNotEqualTo(String value) {
            addCriterion("imnum <>", value, "imnum");
            return (Criteria) this;
        }

        public Criteria andImnumGreaterThan(String value) {
            addCriterion("imnum >", value, "imnum");
            return (Criteria) this;
        }

        public Criteria andImnumGreaterThanOrEqualTo(String value) {
            addCriterion("imnum >=", value, "imnum");
            return (Criteria) this;
        }

        public Criteria andImnumLessThan(String value) {
            addCriterion("imnum <", value, "imnum");
            return (Criteria) this;
        }

        public Criteria andImnumLessThanOrEqualTo(String value) {
            addCriterion("imnum <=", value, "imnum");
            return (Criteria) this;
        }

        public Criteria andImnumLike(String value) {
            addCriterion("imnum like", value, "imnum");
            return (Criteria) this;
        }

        public Criteria andImnumNotLike(String value) {
            addCriterion("imnum not like", value, "imnum");
            return (Criteria) this;
        }

        public Criteria andImnumIn(List<String> values) {
            addCriterion("imnum in", values, "imnum");
            return (Criteria) this;
        }

        public Criteria andImnumNotIn(List<String> values) {
            addCriterion("imnum not in", values, "imnum");
            return (Criteria) this;
        }

        public Criteria andImnumBetween(String value1, String value2) {
            addCriterion("imnum between", value1, value2, "imnum");
            return (Criteria) this;
        }

        public Criteria andImnumNotBetween(String value1, String value2) {
            addCriterion("imnum not between", value1, value2, "imnum");
            return (Criteria) this;
        }

        public Criteria andImdaysIsNull() {
            addCriterion("imdays is null");
            return (Criteria) this;
        }

        public Criteria andImdaysIsNotNull() {
            addCriterion("imdays is not null");
            return (Criteria) this;
        }

        public Criteria andImdaysEqualTo(String value) {
            addCriterion("imdays =", value, "imdays");
            return (Criteria) this;
        }

        public Criteria andImdaysNotEqualTo(String value) {
            addCriterion("imdays <>", value, "imdays");
            return (Criteria) this;
        }

        public Criteria andImdaysGreaterThan(String value) {
            addCriterion("imdays >", value, "imdays");
            return (Criteria) this;
        }

        public Criteria andImdaysGreaterThanOrEqualTo(String value) {
            addCriterion("imdays >=", value, "imdays");
            return (Criteria) this;
        }

        public Criteria andImdaysLessThan(String value) {
            addCriterion("imdays <", value, "imdays");
            return (Criteria) this;
        }

        public Criteria andImdaysLessThanOrEqualTo(String value) {
            addCriterion("imdays <=", value, "imdays");
            return (Criteria) this;
        }

        public Criteria andImdaysLike(String value) {
            addCriterion("imdays like", value, "imdays");
            return (Criteria) this;
        }

        public Criteria andImdaysNotLike(String value) {
            addCriterion("imdays not like", value, "imdays");
            return (Criteria) this;
        }

        public Criteria andImdaysIn(List<String> values) {
            addCriterion("imdays in", values, "imdays");
            return (Criteria) this;
        }

        public Criteria andImdaysNotIn(List<String> values) {
            addCriterion("imdays not in", values, "imdays");
            return (Criteria) this;
        }

        public Criteria andImdaysBetween(String value1, String value2) {
            addCriterion("imdays between", value1, value2, "imdays");
            return (Criteria) this;
        }

        public Criteria andImdaysNotBetween(String value1, String value2) {
            addCriterion("imdays not between", value1, value2, "imdays");
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