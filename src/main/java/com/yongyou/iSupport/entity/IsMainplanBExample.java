package com.yongyou.iSupport.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IsMainplanBExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IsMainplanBExample() {
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

        public Criteria andPkMainplanBIsNull() {
            addCriterion("pk_mainplan_b is null");
            return (Criteria) this;
        }

        public Criteria andPkMainplanBIsNotNull() {
            addCriterion("pk_mainplan_b is not null");
            return (Criteria) this;
        }

        public Criteria andPkMainplanBEqualTo(Integer value) {
            addCriterion("pk_mainplan_b =", value, "pkMainplanB");
            return (Criteria) this;
        }

        public Criteria andPkMainplanBNotEqualTo(Integer value) {
            addCriterion("pk_mainplan_b <>", value, "pkMainplanB");
            return (Criteria) this;
        }

        public Criteria andPkMainplanBGreaterThan(Integer value) {
            addCriterion("pk_mainplan_b >", value, "pkMainplanB");
            return (Criteria) this;
        }

        public Criteria andPkMainplanBGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_mainplan_b >=", value, "pkMainplanB");
            return (Criteria) this;
        }

        public Criteria andPkMainplanBLessThan(Integer value) {
            addCriterion("pk_mainplan_b <", value, "pkMainplanB");
            return (Criteria) this;
        }

        public Criteria andPkMainplanBLessThanOrEqualTo(Integer value) {
            addCriterion("pk_mainplan_b <=", value, "pkMainplanB");
            return (Criteria) this;
        }

        public Criteria andPkMainplanBIn(List<Integer> values) {
            addCriterion("pk_mainplan_b in", values, "pkMainplanB");
            return (Criteria) this;
        }

        public Criteria andPkMainplanBNotIn(List<Integer> values) {
            addCriterion("pk_mainplan_b not in", values, "pkMainplanB");
            return (Criteria) this;
        }

        public Criteria andPkMainplanBBetween(Integer value1, Integer value2) {
            addCriterion("pk_mainplan_b between", value1, value2, "pkMainplanB");
            return (Criteria) this;
        }

        public Criteria andPkMainplanBNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_mainplan_b not between", value1, value2, "pkMainplanB");
            return (Criteria) this;
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

        public Criteria andPlancodeIsNull() {
            addCriterion("plancode is null");
            return (Criteria) this;
        }

        public Criteria andPlancodeIsNotNull() {
            addCriterion("plancode is not null");
            return (Criteria) this;
        }

        public Criteria andPlancodeEqualTo(String value) {
            addCriterion("plancode =", value, "plancode");
            return (Criteria) this;
        }

        public Criteria andPlancodeNotEqualTo(String value) {
            addCriterion("plancode <>", value, "plancode");
            return (Criteria) this;
        }

        public Criteria andPlancodeGreaterThan(String value) {
            addCriterion("plancode >", value, "plancode");
            return (Criteria) this;
        }

        public Criteria andPlancodeGreaterThanOrEqualTo(String value) {
            addCriterion("plancode >=", value, "plancode");
            return (Criteria) this;
        }

        public Criteria andPlancodeLessThan(String value) {
            addCriterion("plancode <", value, "plancode");
            return (Criteria) this;
        }

        public Criteria andPlancodeLessThanOrEqualTo(String value) {
            addCriterion("plancode <=", value, "plancode");
            return (Criteria) this;
        }

        public Criteria andPlancodeLike(String value) {
            addCriterion("plancode like", value, "plancode");
            return (Criteria) this;
        }

        public Criteria andPlancodeNotLike(String value) {
            addCriterion("plancode not like", value, "plancode");
            return (Criteria) this;
        }

        public Criteria andPlancodeIn(List<String> values) {
            addCriterion("plancode in", values, "plancode");
            return (Criteria) this;
        }

        public Criteria andPlancodeNotIn(List<String> values) {
            addCriterion("plancode not in", values, "plancode");
            return (Criteria) this;
        }

        public Criteria andPlancodeBetween(String value1, String value2) {
            addCriterion("plancode between", value1, value2, "plancode");
            return (Criteria) this;
        }

        public Criteria andPlancodeNotBetween(String value1, String value2) {
            addCriterion("plancode not between", value1, value2, "plancode");
            return (Criteria) this;
        }

        public Criteria andPlannameIsNull() {
            addCriterion("planname is null");
            return (Criteria) this;
        }

        public Criteria andPlannameIsNotNull() {
            addCriterion("planname is not null");
            return (Criteria) this;
        }

        public Criteria andPlannameEqualTo(String value) {
            addCriterion("planname =", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameNotEqualTo(String value) {
            addCriterion("planname <>", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameGreaterThan(String value) {
            addCriterion("planname >", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameGreaterThanOrEqualTo(String value) {
            addCriterion("planname >=", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameLessThan(String value) {
            addCriterion("planname <", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameLessThanOrEqualTo(String value) {
            addCriterion("planname <=", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameLike(String value) {
            addCriterion("planname like", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameNotLike(String value) {
            addCriterion("planname not like", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameIn(List<String> values) {
            addCriterion("planname in", values, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameNotIn(List<String> values) {
            addCriterion("planname not in", values, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameBetween(String value1, String value2) {
            addCriterion("planname between", value1, value2, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameNotBetween(String value1, String value2) {
            addCriterion("planname not between", value1, value2, "planname");
            return (Criteria) this;
        }

        public Criteria andSpstartdateIsNull() {
            addCriterion("spstartdate is null");
            return (Criteria) this;
        }

        public Criteria andSpstartdateIsNotNull() {
            addCriterion("spstartdate is not null");
            return (Criteria) this;
        }

        public Criteria andSpstartdateEqualTo(Date value) {
            addCriterion("spstartdate =", value, "spstartdate");
            return (Criteria) this;
        }

        public Criteria andSpstartdateNotEqualTo(Date value) {
            addCriterion("spstartdate <>", value, "spstartdate");
            return (Criteria) this;
        }

        public Criteria andSpstartdateGreaterThan(Date value) {
            addCriterion("spstartdate >", value, "spstartdate");
            return (Criteria) this;
        }

        public Criteria andSpstartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("spstartdate >=", value, "spstartdate");
            return (Criteria) this;
        }

        public Criteria andSpstartdateLessThan(Date value) {
            addCriterion("spstartdate <", value, "spstartdate");
            return (Criteria) this;
        }

        public Criteria andSpstartdateLessThanOrEqualTo(Date value) {
            addCriterion("spstartdate <=", value, "spstartdate");
            return (Criteria) this;
        }

        public Criteria andSpstartdateIn(List<Date> values) {
            addCriterion("spstartdate in", values, "spstartdate");
            return (Criteria) this;
        }

        public Criteria andSpstartdateNotIn(List<Date> values) {
            addCriterion("spstartdate not in", values, "spstartdate");
            return (Criteria) this;
        }

        public Criteria andSpstartdateBetween(Date value1, Date value2) {
            addCriterion("spstartdate between", value1, value2, "spstartdate");
            return (Criteria) this;
        }

        public Criteria andSpstartdateNotBetween(Date value1, Date value2) {
            addCriterion("spstartdate not between", value1, value2, "spstartdate");
            return (Criteria) this;
        }

        public Criteria andSpenddateIsNull() {
            addCriterion("spenddate is null");
            return (Criteria) this;
        }

        public Criteria andSpenddateIsNotNull() {
            addCriterion("spenddate is not null");
            return (Criteria) this;
        }

        public Criteria andSpenddateEqualTo(Date value) {
            addCriterion("spenddate =", value, "spenddate");
            return (Criteria) this;
        }

        public Criteria andSpenddateNotEqualTo(Date value) {
            addCriterion("spenddate <>", value, "spenddate");
            return (Criteria) this;
        }

        public Criteria andSpenddateGreaterThan(Date value) {
            addCriterion("spenddate >", value, "spenddate");
            return (Criteria) this;
        }

        public Criteria andSpenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("spenddate >=", value, "spenddate");
            return (Criteria) this;
        }

        public Criteria andSpenddateLessThan(Date value) {
            addCriterion("spenddate <", value, "spenddate");
            return (Criteria) this;
        }

        public Criteria andSpenddateLessThanOrEqualTo(Date value) {
            addCriterion("spenddate <=", value, "spenddate");
            return (Criteria) this;
        }

        public Criteria andSpenddateIn(List<Date> values) {
            addCriterion("spenddate in", values, "spenddate");
            return (Criteria) this;
        }

        public Criteria andSpenddateNotIn(List<Date> values) {
            addCriterion("spenddate not in", values, "spenddate");
            return (Criteria) this;
        }

        public Criteria andSpenddateBetween(Date value1, Date value2) {
            addCriterion("spenddate between", value1, value2, "spenddate");
            return (Criteria) this;
        }

        public Criteria andSpenddateNotBetween(Date value1, Date value2) {
            addCriterion("spenddate not between", value1, value2, "spenddate");
            return (Criteria) this;
        }

        public Criteria andSplancycleIsNull() {
            addCriterion("splancycle is null");
            return (Criteria) this;
        }

        public Criteria andSplancycleIsNotNull() {
            addCriterion("splancycle is not null");
            return (Criteria) this;
        }

        public Criteria andSplancycleEqualTo(String value) {
            addCriterion("splancycle =", value, "splancycle");
            return (Criteria) this;
        }

        public Criteria andSplancycleNotEqualTo(String value) {
            addCriterion("splancycle <>", value, "splancycle");
            return (Criteria) this;
        }

        public Criteria andSplancycleGreaterThan(String value) {
            addCriterion("splancycle >", value, "splancycle");
            return (Criteria) this;
        }

        public Criteria andSplancycleGreaterThanOrEqualTo(String value) {
            addCriterion("splancycle >=", value, "splancycle");
            return (Criteria) this;
        }

        public Criteria andSplancycleLessThan(String value) {
            addCriterion("splancycle <", value, "splancycle");
            return (Criteria) this;
        }

        public Criteria andSplancycleLessThanOrEqualTo(String value) {
            addCriterion("splancycle <=", value, "splancycle");
            return (Criteria) this;
        }

        public Criteria andSplancycleLike(String value) {
            addCriterion("splancycle like", value, "splancycle");
            return (Criteria) this;
        }

        public Criteria andSplancycleNotLike(String value) {
            addCriterion("splancycle not like", value, "splancycle");
            return (Criteria) this;
        }

        public Criteria andSplancycleIn(List<String> values) {
            addCriterion("splancycle in", values, "splancycle");
            return (Criteria) this;
        }

        public Criteria andSplancycleNotIn(List<String> values) {
            addCriterion("splancycle not in", values, "splancycle");
            return (Criteria) this;
        }

        public Criteria andSplancycleBetween(String value1, String value2) {
            addCriterion("splancycle between", value1, value2, "splancycle");
            return (Criteria) this;
        }

        public Criteria andSplancycleNotBetween(String value1, String value2) {
            addCriterion("splancycle not between", value1, value2, "splancycle");
            return (Criteria) this;
        }

        public Criteria andSpmnumIsNull() {
            addCriterion("spmnum is null");
            return (Criteria) this;
        }

        public Criteria andSpmnumIsNotNull() {
            addCriterion("spmnum is not null");
            return (Criteria) this;
        }

        public Criteria andSpmnumEqualTo(String value) {
            addCriterion("spmnum =", value, "spmnum");
            return (Criteria) this;
        }

        public Criteria andSpmnumNotEqualTo(String value) {
            addCriterion("spmnum <>", value, "spmnum");
            return (Criteria) this;
        }

        public Criteria andSpmnumGreaterThan(String value) {
            addCriterion("spmnum >", value, "spmnum");
            return (Criteria) this;
        }

        public Criteria andSpmnumGreaterThanOrEqualTo(String value) {
            addCriterion("spmnum >=", value, "spmnum");
            return (Criteria) this;
        }

        public Criteria andSpmnumLessThan(String value) {
            addCriterion("spmnum <", value, "spmnum");
            return (Criteria) this;
        }

        public Criteria andSpmnumLessThanOrEqualTo(String value) {
            addCriterion("spmnum <=", value, "spmnum");
            return (Criteria) this;
        }

        public Criteria andSpmnumLike(String value) {
            addCriterion("spmnum like", value, "spmnum");
            return (Criteria) this;
        }

        public Criteria andSpmnumNotLike(String value) {
            addCriterion("spmnum not like", value, "spmnum");
            return (Criteria) this;
        }

        public Criteria andSpmnumIn(List<String> values) {
            addCriterion("spmnum in", values, "spmnum");
            return (Criteria) this;
        }

        public Criteria andSpmnumNotIn(List<String> values) {
            addCriterion("spmnum not in", values, "spmnum");
            return (Criteria) this;
        }

        public Criteria andSpmnumBetween(String value1, String value2) {
            addCriterion("spmnum between", value1, value2, "spmnum");
            return (Criteria) this;
        }

        public Criteria andSpmnumNotBetween(String value1, String value2) {
            addCriterion("spmnum not between", value1, value2, "spmnum");
            return (Criteria) this;
        }

        public Criteria andSpmdaysIsNull() {
            addCriterion("spmdays is null");
            return (Criteria) this;
        }

        public Criteria andSpmdaysIsNotNull() {
            addCriterion("spmdays is not null");
            return (Criteria) this;
        }

        public Criteria andSpmdaysEqualTo(String value) {
            addCriterion("spmdays =", value, "spmdays");
            return (Criteria) this;
        }

        public Criteria andSpmdaysNotEqualTo(String value) {
            addCriterion("spmdays <>", value, "spmdays");
            return (Criteria) this;
        }

        public Criteria andSpmdaysGreaterThan(String value) {
            addCriterion("spmdays >", value, "spmdays");
            return (Criteria) this;
        }

        public Criteria andSpmdaysGreaterThanOrEqualTo(String value) {
            addCriterion("spmdays >=", value, "spmdays");
            return (Criteria) this;
        }

        public Criteria andSpmdaysLessThan(String value) {
            addCriterion("spmdays <", value, "spmdays");
            return (Criteria) this;
        }

        public Criteria andSpmdaysLessThanOrEqualTo(String value) {
            addCriterion("spmdays <=", value, "spmdays");
            return (Criteria) this;
        }

        public Criteria andSpmdaysLike(String value) {
            addCriterion("spmdays like", value, "spmdays");
            return (Criteria) this;
        }

        public Criteria andSpmdaysNotLike(String value) {
            addCriterion("spmdays not like", value, "spmdays");
            return (Criteria) this;
        }

        public Criteria andSpmdaysIn(List<String> values) {
            addCriterion("spmdays in", values, "spmdays");
            return (Criteria) this;
        }

        public Criteria andSpmdaysNotIn(List<String> values) {
            addCriterion("spmdays not in", values, "spmdays");
            return (Criteria) this;
        }

        public Criteria andSpmdaysBetween(String value1, String value2) {
            addCriterion("spmdays between", value1, value2, "spmdays");
            return (Criteria) this;
        }

        public Criteria andSpmdaysNotBetween(String value1, String value2) {
            addCriterion("spmdays not between", value1, value2, "spmdays");
            return (Criteria) this;
        }

        public Criteria andSimnumIsNull() {
            addCriterion("simnum is null");
            return (Criteria) this;
        }

        public Criteria andSimnumIsNotNull() {
            addCriterion("simnum is not null");
            return (Criteria) this;
        }

        public Criteria andSimnumEqualTo(String value) {
            addCriterion("simnum =", value, "simnum");
            return (Criteria) this;
        }

        public Criteria andSimnumNotEqualTo(String value) {
            addCriterion("simnum <>", value, "simnum");
            return (Criteria) this;
        }

        public Criteria andSimnumGreaterThan(String value) {
            addCriterion("simnum >", value, "simnum");
            return (Criteria) this;
        }

        public Criteria andSimnumGreaterThanOrEqualTo(String value) {
            addCriterion("simnum >=", value, "simnum");
            return (Criteria) this;
        }

        public Criteria andSimnumLessThan(String value) {
            addCriterion("simnum <", value, "simnum");
            return (Criteria) this;
        }

        public Criteria andSimnumLessThanOrEqualTo(String value) {
            addCriterion("simnum <=", value, "simnum");
            return (Criteria) this;
        }

        public Criteria andSimnumLike(String value) {
            addCriterion("simnum like", value, "simnum");
            return (Criteria) this;
        }

        public Criteria andSimnumNotLike(String value) {
            addCriterion("simnum not like", value, "simnum");
            return (Criteria) this;
        }

        public Criteria andSimnumIn(List<String> values) {
            addCriterion("simnum in", values, "simnum");
            return (Criteria) this;
        }

        public Criteria andSimnumNotIn(List<String> values) {
            addCriterion("simnum not in", values, "simnum");
            return (Criteria) this;
        }

        public Criteria andSimnumBetween(String value1, String value2) {
            addCriterion("simnum between", value1, value2, "simnum");
            return (Criteria) this;
        }

        public Criteria andSimnumNotBetween(String value1, String value2) {
            addCriterion("simnum not between", value1, value2, "simnum");
            return (Criteria) this;
        }

        public Criteria andSimdaysIsNull() {
            addCriterion("simdays is null");
            return (Criteria) this;
        }

        public Criteria andSimdaysIsNotNull() {
            addCriterion("simdays is not null");
            return (Criteria) this;
        }

        public Criteria andSimdaysEqualTo(String value) {
            addCriterion("simdays =", value, "simdays");
            return (Criteria) this;
        }

        public Criteria andSimdaysNotEqualTo(String value) {
            addCriterion("simdays <>", value, "simdays");
            return (Criteria) this;
        }

        public Criteria andSimdaysGreaterThan(String value) {
            addCriterion("simdays >", value, "simdays");
            return (Criteria) this;
        }

        public Criteria andSimdaysGreaterThanOrEqualTo(String value) {
            addCriterion("simdays >=", value, "simdays");
            return (Criteria) this;
        }

        public Criteria andSimdaysLessThan(String value) {
            addCriterion("simdays <", value, "simdays");
            return (Criteria) this;
        }

        public Criteria andSimdaysLessThanOrEqualTo(String value) {
            addCriterion("simdays <=", value, "simdays");
            return (Criteria) this;
        }

        public Criteria andSimdaysLike(String value) {
            addCriterion("simdays like", value, "simdays");
            return (Criteria) this;
        }

        public Criteria andSimdaysNotLike(String value) {
            addCriterion("simdays not like", value, "simdays");
            return (Criteria) this;
        }

        public Criteria andSimdaysIn(List<String> values) {
            addCriterion("simdays in", values, "simdays");
            return (Criteria) this;
        }

        public Criteria andSimdaysNotIn(List<String> values) {
            addCriterion("simdays not in", values, "simdays");
            return (Criteria) this;
        }

        public Criteria andSimdaysBetween(String value1, String value2) {
            addCriterion("simdays between", value1, value2, "simdays");
            return (Criteria) this;
        }

        public Criteria andSimdaysNotBetween(String value1, String value2) {
            addCriterion("simdays not between", value1, value2, "simdays");
            return (Criteria) this;
        }

        public Criteria andAlldaysIsNull() {
            addCriterion("alldays is null");
            return (Criteria) this;
        }

        public Criteria andAlldaysIsNotNull() {
            addCriterion("alldays is not null");
            return (Criteria) this;
        }

        public Criteria andAlldaysEqualTo(String value) {
            addCriterion("alldays =", value, "alldays");
            return (Criteria) this;
        }

        public Criteria andAlldaysNotEqualTo(String value) {
            addCriterion("alldays <>", value, "alldays");
            return (Criteria) this;
        }

        public Criteria andAlldaysGreaterThan(String value) {
            addCriterion("alldays >", value, "alldays");
            return (Criteria) this;
        }

        public Criteria andAlldaysGreaterThanOrEqualTo(String value) {
            addCriterion("alldays >=", value, "alldays");
            return (Criteria) this;
        }

        public Criteria andAlldaysLessThan(String value) {
            addCriterion("alldays <", value, "alldays");
            return (Criteria) this;
        }

        public Criteria andAlldaysLessThanOrEqualTo(String value) {
            addCriterion("alldays <=", value, "alldays");
            return (Criteria) this;
        }

        public Criteria andAlldaysLike(String value) {
            addCriterion("alldays like", value, "alldays");
            return (Criteria) this;
        }

        public Criteria andAlldaysNotLike(String value) {
            addCriterion("alldays not like", value, "alldays");
            return (Criteria) this;
        }

        public Criteria andAlldaysIn(List<String> values) {
            addCriterion("alldays in", values, "alldays");
            return (Criteria) this;
        }

        public Criteria andAlldaysNotIn(List<String> values) {
            addCriterion("alldays not in", values, "alldays");
            return (Criteria) this;
        }

        public Criteria andAlldaysBetween(String value1, String value2) {
            addCriterion("alldays between", value1, value2, "alldays");
            return (Criteria) this;
        }

        public Criteria andAlldaysNotBetween(String value1, String value2) {
            addCriterion("alldays not between", value1, value2, "alldays");
            return (Criteria) this;
        }

        public Criteria andUfroleIsNull() {
            addCriterion("ufrole is null");
            return (Criteria) this;
        }

        public Criteria andUfroleIsNotNull() {
            addCriterion("ufrole is not null");
            return (Criteria) this;
        }

        public Criteria andUfroleEqualTo(String value) {
            addCriterion("ufrole =", value, "ufrole");
            return (Criteria) this;
        }

        public Criteria andUfroleNotEqualTo(String value) {
            addCriterion("ufrole <>", value, "ufrole");
            return (Criteria) this;
        }

        public Criteria andUfroleGreaterThan(String value) {
            addCriterion("ufrole >", value, "ufrole");
            return (Criteria) this;
        }

        public Criteria andUfroleGreaterThanOrEqualTo(String value) {
            addCriterion("ufrole >=", value, "ufrole");
            return (Criteria) this;
        }

        public Criteria andUfroleLessThan(String value) {
            addCriterion("ufrole <", value, "ufrole");
            return (Criteria) this;
        }

        public Criteria andUfroleLessThanOrEqualTo(String value) {
            addCriterion("ufrole <=", value, "ufrole");
            return (Criteria) this;
        }

        public Criteria andUfroleLike(String value) {
            addCriterion("ufrole like", value, "ufrole");
            return (Criteria) this;
        }

        public Criteria andUfroleNotLike(String value) {
            addCriterion("ufrole not like", value, "ufrole");
            return (Criteria) this;
        }

        public Criteria andUfroleIn(List<String> values) {
            addCriterion("ufrole in", values, "ufrole");
            return (Criteria) this;
        }

        public Criteria andUfroleNotIn(List<String> values) {
            addCriterion("ufrole not in", values, "ufrole");
            return (Criteria) this;
        }

        public Criteria andUfroleBetween(String value1, String value2) {
            addCriterion("ufrole between", value1, value2, "ufrole");
            return (Criteria) this;
        }

        public Criteria andUfroleNotBetween(String value1, String value2) {
            addCriterion("ufrole not between", value1, value2, "ufrole");
            return (Criteria) this;
        }

        public Criteria andUfmemberIsNull() {
            addCriterion("ufmember is null");
            return (Criteria) this;
        }

        public Criteria andUfmemberIsNotNull() {
            addCriterion("ufmember is not null");
            return (Criteria) this;
        }

        public Criteria andUfmemberEqualTo(String value) {
            addCriterion("ufmember =", value, "ufmember");
            return (Criteria) this;
        }

        public Criteria andUfmemberNotEqualTo(String value) {
            addCriterion("ufmember <>", value, "ufmember");
            return (Criteria) this;
        }

        public Criteria andUfmemberGreaterThan(String value) {
            addCriterion("ufmember >", value, "ufmember");
            return (Criteria) this;
        }

        public Criteria andUfmemberGreaterThanOrEqualTo(String value) {
            addCriterion("ufmember >=", value, "ufmember");
            return (Criteria) this;
        }

        public Criteria andUfmemberLessThan(String value) {
            addCriterion("ufmember <", value, "ufmember");
            return (Criteria) this;
        }

        public Criteria andUfmemberLessThanOrEqualTo(String value) {
            addCriterion("ufmember <=", value, "ufmember");
            return (Criteria) this;
        }

        public Criteria andUfmemberLike(String value) {
            addCriterion("ufmember like", value, "ufmember");
            return (Criteria) this;
        }

        public Criteria andUfmemberNotLike(String value) {
            addCriterion("ufmember not like", value, "ufmember");
            return (Criteria) this;
        }

        public Criteria andUfmemberIn(List<String> values) {
            addCriterion("ufmember in", values, "ufmember");
            return (Criteria) this;
        }

        public Criteria andUfmemberNotIn(List<String> values) {
            addCriterion("ufmember not in", values, "ufmember");
            return (Criteria) this;
        }

        public Criteria andUfmemberBetween(String value1, String value2) {
            addCriterion("ufmember between", value1, value2, "ufmember");
            return (Criteria) this;
        }

        public Criteria andUfmemberNotBetween(String value1, String value2) {
            addCriterion("ufmember not between", value1, value2, "ufmember");
            return (Criteria) this;
        }

        public Criteria andCustroleIsNull() {
            addCriterion("custrole is null");
            return (Criteria) this;
        }

        public Criteria andCustroleIsNotNull() {
            addCriterion("custrole is not null");
            return (Criteria) this;
        }

        public Criteria andCustroleEqualTo(String value) {
            addCriterion("custrole =", value, "custrole");
            return (Criteria) this;
        }

        public Criteria andCustroleNotEqualTo(String value) {
            addCriterion("custrole <>", value, "custrole");
            return (Criteria) this;
        }

        public Criteria andCustroleGreaterThan(String value) {
            addCriterion("custrole >", value, "custrole");
            return (Criteria) this;
        }

        public Criteria andCustroleGreaterThanOrEqualTo(String value) {
            addCriterion("custrole >=", value, "custrole");
            return (Criteria) this;
        }

        public Criteria andCustroleLessThan(String value) {
            addCriterion("custrole <", value, "custrole");
            return (Criteria) this;
        }

        public Criteria andCustroleLessThanOrEqualTo(String value) {
            addCriterion("custrole <=", value, "custrole");
            return (Criteria) this;
        }

        public Criteria andCustroleLike(String value) {
            addCriterion("custrole like", value, "custrole");
            return (Criteria) this;
        }

        public Criteria andCustroleNotLike(String value) {
            addCriterion("custrole not like", value, "custrole");
            return (Criteria) this;
        }

        public Criteria andCustroleIn(List<String> values) {
            addCriterion("custrole in", values, "custrole");
            return (Criteria) this;
        }

        public Criteria andCustroleNotIn(List<String> values) {
            addCriterion("custrole not in", values, "custrole");
            return (Criteria) this;
        }

        public Criteria andCustroleBetween(String value1, String value2) {
            addCriterion("custrole between", value1, value2, "custrole");
            return (Criteria) this;
        }

        public Criteria andCustroleNotBetween(String value1, String value2) {
            addCriterion("custrole not between", value1, value2, "custrole");
            return (Criteria) this;
        }

        public Criteria andServicecontentIsNull() {
            addCriterion("servicecontent is null");
            return (Criteria) this;
        }

        public Criteria andServicecontentIsNotNull() {
            addCriterion("servicecontent is not null");
            return (Criteria) this;
        }

        public Criteria andServicecontentEqualTo(String value) {
            addCriterion("servicecontent =", value, "servicecontent");
            return (Criteria) this;
        }

        public Criteria andServicecontentNotEqualTo(String value) {
            addCriterion("servicecontent <>", value, "servicecontent");
            return (Criteria) this;
        }

        public Criteria andServicecontentGreaterThan(String value) {
            addCriterion("servicecontent >", value, "servicecontent");
            return (Criteria) this;
        }

        public Criteria andServicecontentGreaterThanOrEqualTo(String value) {
            addCriterion("servicecontent >=", value, "servicecontent");
            return (Criteria) this;
        }

        public Criteria andServicecontentLessThan(String value) {
            addCriterion("servicecontent <", value, "servicecontent");
            return (Criteria) this;
        }

        public Criteria andServicecontentLessThanOrEqualTo(String value) {
            addCriterion("servicecontent <=", value, "servicecontent");
            return (Criteria) this;
        }

        public Criteria andServicecontentLike(String value) {
            addCriterion("servicecontent like", value, "servicecontent");
            return (Criteria) this;
        }

        public Criteria andServicecontentNotLike(String value) {
            addCriterion("servicecontent not like", value, "servicecontent");
            return (Criteria) this;
        }

        public Criteria andServicecontentIn(List<String> values) {
            addCriterion("servicecontent in", values, "servicecontent");
            return (Criteria) this;
        }

        public Criteria andServicecontentNotIn(List<String> values) {
            addCriterion("servicecontent not in", values, "servicecontent");
            return (Criteria) this;
        }

        public Criteria andServicecontentBetween(String value1, String value2) {
            addCriterion("servicecontent between", value1, value2, "servicecontent");
            return (Criteria) this;
        }

        public Criteria andServicecontentNotBetween(String value1, String value2) {
            addCriterion("servicecontent not between", value1, value2, "servicecontent");
            return (Criteria) this;
        }

        public Criteria andUfdocumentIsNull() {
            addCriterion("ufdocument is null");
            return (Criteria) this;
        }

        public Criteria andUfdocumentIsNotNull() {
            addCriterion("ufdocument is not null");
            return (Criteria) this;
        }

        public Criteria andUfdocumentEqualTo(String value) {
            addCriterion("ufdocument =", value, "ufdocument");
            return (Criteria) this;
        }

        public Criteria andUfdocumentNotEqualTo(String value) {
            addCriterion("ufdocument <>", value, "ufdocument");
            return (Criteria) this;
        }

        public Criteria andUfdocumentGreaterThan(String value) {
            addCriterion("ufdocument >", value, "ufdocument");
            return (Criteria) this;
        }

        public Criteria andUfdocumentGreaterThanOrEqualTo(String value) {
            addCriterion("ufdocument >=", value, "ufdocument");
            return (Criteria) this;
        }

        public Criteria andUfdocumentLessThan(String value) {
            addCriterion("ufdocument <", value, "ufdocument");
            return (Criteria) this;
        }

        public Criteria andUfdocumentLessThanOrEqualTo(String value) {
            addCriterion("ufdocument <=", value, "ufdocument");
            return (Criteria) this;
        }

        public Criteria andUfdocumentLike(String value) {
            addCriterion("ufdocument like", value, "ufdocument");
            return (Criteria) this;
        }

        public Criteria andUfdocumentNotLike(String value) {
            addCriterion("ufdocument not like", value, "ufdocument");
            return (Criteria) this;
        }

        public Criteria andUfdocumentIn(List<String> values) {
            addCriterion("ufdocument in", values, "ufdocument");
            return (Criteria) this;
        }

        public Criteria andUfdocumentNotIn(List<String> values) {
            addCriterion("ufdocument not in", values, "ufdocument");
            return (Criteria) this;
        }

        public Criteria andUfdocumentBetween(String value1, String value2) {
            addCriterion("ufdocument between", value1, value2, "ufdocument");
            return (Criteria) this;
        }

        public Criteria andUfdocumentNotBetween(String value1, String value2) {
            addCriterion("ufdocument not between", value1, value2, "ufdocument");
            return (Criteria) this;
        }

        public Criteria andSremarkIsNull() {
            addCriterion("sremark is null");
            return (Criteria) this;
        }

        public Criteria andSremarkIsNotNull() {
            addCriterion("sremark is not null");
            return (Criteria) this;
        }

        public Criteria andSremarkEqualTo(String value) {
            addCriterion("sremark =", value, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkNotEqualTo(String value) {
            addCriterion("sremark <>", value, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkGreaterThan(String value) {
            addCriterion("sremark >", value, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkGreaterThanOrEqualTo(String value) {
            addCriterion("sremark >=", value, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkLessThan(String value) {
            addCriterion("sremark <", value, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkLessThanOrEqualTo(String value) {
            addCriterion("sremark <=", value, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkLike(String value) {
            addCriterion("sremark like", value, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkNotLike(String value) {
            addCriterion("sremark not like", value, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkIn(List<String> values) {
            addCriterion("sremark in", values, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkNotIn(List<String> values) {
            addCriterion("sremark not in", values, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkBetween(String value1, String value2) {
            addCriterion("sremark between", value1, value2, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkNotBetween(String value1, String value2) {
            addCriterion("sremark not between", value1, value2, "sremark");
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