package com.yongyou.iSupport.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IsSDweekplaneHExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IsSDweekplaneHExample() {
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

        public Criteria andPkDweekplaneHIsNull() {
            addCriterion("pk_dweekplane_h is null");
            return (Criteria) this;
        }

        public Criteria andPkDweekplaneHIsNotNull() {
            addCriterion("pk_dweekplane_h is not null");
            return (Criteria) this;
        }

        public Criteria andPkDweekplaneHEqualTo(Integer value) {
            addCriterion("pk_dweekplane_h =", value, "pkDweekplaneH");
            return (Criteria) this;
        }

        public Criteria andPkDweekplaneHNotEqualTo(Integer value) {
            addCriterion("pk_dweekplane_h <>", value, "pkDweekplaneH");
            return (Criteria) this;
        }

        public Criteria andPkDweekplaneHGreaterThan(Integer value) {
            addCriterion("pk_dweekplane_h >", value, "pkDweekplaneH");
            return (Criteria) this;
        }

        public Criteria andPkDweekplaneHGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_dweekplane_h >=", value, "pkDweekplaneH");
            return (Criteria) this;
        }

        public Criteria andPkDweekplaneHLessThan(Integer value) {
            addCriterion("pk_dweekplane_h <", value, "pkDweekplaneH");
            return (Criteria) this;
        }

        public Criteria andPkDweekplaneHLessThanOrEqualTo(Integer value) {
            addCriterion("pk_dweekplane_h <=", value, "pkDweekplaneH");
            return (Criteria) this;
        }

        public Criteria andPkDweekplaneHIn(List<Integer> values) {
            addCriterion("pk_dweekplane_h in", values, "pkDweekplaneH");
            return (Criteria) this;
        }

        public Criteria andPkDweekplaneHNotIn(List<Integer> values) {
            addCriterion("pk_dweekplane_h not in", values, "pkDweekplaneH");
            return (Criteria) this;
        }

        public Criteria andPkDweekplaneHBetween(Integer value1, Integer value2) {
            addCriterion("pk_dweekplane_h between", value1, value2, "pkDweekplaneH");
            return (Criteria) this;
        }

        public Criteria andPkDweekplaneHNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_dweekplane_h not between", value1, value2, "pkDweekplaneH");
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

        public Criteria andPkProjectIsNull() {
            addCriterion("pk_project is null");
            return (Criteria) this;
        }

        public Criteria andPkProjectIsNotNull() {
            addCriterion("pk_project is not null");
            return (Criteria) this;
        }

        public Criteria andPkProjectEqualTo(Integer value) {
            addCriterion("pk_project =", value, "pkProject");
            return (Criteria) this;
        }

        public Criteria andPkProjectNotEqualTo(Integer value) {
            addCriterion("pk_project <>", value, "pkProject");
            return (Criteria) this;
        }

        public Criteria andPkProjectGreaterThan(Integer value) {
            addCriterion("pk_project >", value, "pkProject");
            return (Criteria) this;
        }

        public Criteria andPkProjectGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_project >=", value, "pkProject");
            return (Criteria) this;
        }

        public Criteria andPkProjectLessThan(Integer value) {
            addCriterion("pk_project <", value, "pkProject");
            return (Criteria) this;
        }

        public Criteria andPkProjectLessThanOrEqualTo(Integer value) {
            addCriterion("pk_project <=", value, "pkProject");
            return (Criteria) this;
        }

        public Criteria andPkProjectIn(List<Integer> values) {
            addCriterion("pk_project in", values, "pkProject");
            return (Criteria) this;
        }

        public Criteria andPkProjectNotIn(List<Integer> values) {
            addCriterion("pk_project not in", values, "pkProject");
            return (Criteria) this;
        }

        public Criteria andPkProjectBetween(Integer value1, Integer value2) {
            addCriterion("pk_project between", value1, value2, "pkProject");
            return (Criteria) this;
        }

        public Criteria andPkProjectNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_project not between", value1, value2, "pkProject");
            return (Criteria) this;
        }

        public Criteria andCorpnameIsNull() {
            addCriterion("corpname is null");
            return (Criteria) this;
        }

        public Criteria andCorpnameIsNotNull() {
            addCriterion("corpname is not null");
            return (Criteria) this;
        }

        public Criteria andCorpnameEqualTo(String value) {
            addCriterion("corpname =", value, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameNotEqualTo(String value) {
            addCriterion("corpname <>", value, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameGreaterThan(String value) {
            addCriterion("corpname >", value, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameGreaterThanOrEqualTo(String value) {
            addCriterion("corpname >=", value, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameLessThan(String value) {
            addCriterion("corpname <", value, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameLessThanOrEqualTo(String value) {
            addCriterion("corpname <=", value, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameLike(String value) {
            addCriterion("corpname like", value, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameNotLike(String value) {
            addCriterion("corpname not like", value, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameIn(List<String> values) {
            addCriterion("corpname in", values, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameNotIn(List<String> values) {
            addCriterion("corpname not in", values, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameBetween(String value1, String value2) {
            addCriterion("corpname between", value1, value2, "corpname");
            return (Criteria) this;
        }

        public Criteria andCorpnameNotBetween(String value1, String value2) {
            addCriterion("corpname not between", value1, value2, "corpname");
            return (Criteria) this;
        }

        public Criteria andFilldateIsNull() {
            addCriterion("filldate is null");
            return (Criteria) this;
        }

        public Criteria andFilldateIsNotNull() {
            addCriterion("filldate is not null");
            return (Criteria) this;
        }

        public Criteria andFilldateEqualTo(Date value) {
            addCriterion("filldate =", value, "filldate");
            return (Criteria) this;
        }

        public Criteria andFilldateNotEqualTo(Date value) {
            addCriterion("filldate <>", value, "filldate");
            return (Criteria) this;
        }

        public Criteria andFilldateGreaterThan(Date value) {
            addCriterion("filldate >", value, "filldate");
            return (Criteria) this;
        }

        public Criteria andFilldateGreaterThanOrEqualTo(Date value) {
            addCriterion("filldate >=", value, "filldate");
            return (Criteria) this;
        }

        public Criteria andFilldateLessThan(Date value) {
            addCriterion("filldate <", value, "filldate");
            return (Criteria) this;
        }

        public Criteria andFilldateLessThanOrEqualTo(Date value) {
            addCriterion("filldate <=", value, "filldate");
            return (Criteria) this;
        }

        public Criteria andFilldateIn(List<Date> values) {
            addCriterion("filldate in", values, "filldate");
            return (Criteria) this;
        }

        public Criteria andFilldateNotIn(List<Date> values) {
            addCriterion("filldate not in", values, "filldate");
            return (Criteria) this;
        }

        public Criteria andFilldateBetween(Date value1, Date value2) {
            addCriterion("filldate between", value1, value2, "filldate");
            return (Criteria) this;
        }

        public Criteria andFilldateNotBetween(Date value1, Date value2) {
            addCriterion("filldate not between", value1, value2, "filldate");
            return (Criteria) this;
        }

        public Criteria andPkMianplaneIsNull() {
            addCriterion("pk_mianplane is null");
            return (Criteria) this;
        }

        public Criteria andPkMianplaneIsNotNull() {
            addCriterion("pk_mianplane is not null");
            return (Criteria) this;
        }

        public Criteria andPkMianplaneEqualTo(Integer value) {
            addCriterion("pk_mianplane =", value, "pkMianplane");
            return (Criteria) this;
        }

        public Criteria andPkMianplaneNotEqualTo(Integer value) {
            addCriterion("pk_mianplane <>", value, "pkMianplane");
            return (Criteria) this;
        }

        public Criteria andPkMianplaneGreaterThan(Integer value) {
            addCriterion("pk_mianplane >", value, "pkMianplane");
            return (Criteria) this;
        }

        public Criteria andPkMianplaneGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_mianplane >=", value, "pkMianplane");
            return (Criteria) this;
        }

        public Criteria andPkMianplaneLessThan(Integer value) {
            addCriterion("pk_mianplane <", value, "pkMianplane");
            return (Criteria) this;
        }

        public Criteria andPkMianplaneLessThanOrEqualTo(Integer value) {
            addCriterion("pk_mianplane <=", value, "pkMianplane");
            return (Criteria) this;
        }

        public Criteria andPkMianplaneIn(List<Integer> values) {
            addCriterion("pk_mianplane in", values, "pkMianplane");
            return (Criteria) this;
        }

        public Criteria andPkMianplaneNotIn(List<Integer> values) {
            addCriterion("pk_mianplane not in", values, "pkMianplane");
            return (Criteria) this;
        }

        public Criteria andPkMianplaneBetween(Integer value1, Integer value2) {
            addCriterion("pk_mianplane between", value1, value2, "pkMianplane");
            return (Criteria) this;
        }

        public Criteria andPkMianplaneNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_mianplane not between", value1, value2, "pkMianplane");
            return (Criteria) this;
        }

        public Criteria andPlanestartdateIsNull() {
            addCriterion("planestartdate is null");
            return (Criteria) this;
        }

        public Criteria andPlanestartdateIsNotNull() {
            addCriterion("planestartdate is not null");
            return (Criteria) this;
        }

        public Criteria andPlanestartdateEqualTo(Date value) {
            addCriterion("planestartdate =", value, "planestartdate");
            return (Criteria) this;
        }

        public Criteria andPlanestartdateNotEqualTo(Date value) {
            addCriterion("planestartdate <>", value, "planestartdate");
            return (Criteria) this;
        }

        public Criteria andPlanestartdateGreaterThan(Date value) {
            addCriterion("planestartdate >", value, "planestartdate");
            return (Criteria) this;
        }

        public Criteria andPlanestartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("planestartdate >=", value, "planestartdate");
            return (Criteria) this;
        }

        public Criteria andPlanestartdateLessThan(Date value) {
            addCriterion("planestartdate <", value, "planestartdate");
            return (Criteria) this;
        }

        public Criteria andPlanestartdateLessThanOrEqualTo(Date value) {
            addCriterion("planestartdate <=", value, "planestartdate");
            return (Criteria) this;
        }

        public Criteria andPlanestartdateIn(List<Date> values) {
            addCriterion("planestartdate in", values, "planestartdate");
            return (Criteria) this;
        }

        public Criteria andPlanestartdateNotIn(List<Date> values) {
            addCriterion("planestartdate not in", values, "planestartdate");
            return (Criteria) this;
        }

        public Criteria andPlanestartdateBetween(Date value1, Date value2) {
            addCriterion("planestartdate between", value1, value2, "planestartdate");
            return (Criteria) this;
        }

        public Criteria andPlanestartdateNotBetween(Date value1, Date value2) {
            addCriterion("planestartdate not between", value1, value2, "planestartdate");
            return (Criteria) this;
        }

        public Criteria andPlanefinishdateIsNull() {
            addCriterion("planefinishdate is null");
            return (Criteria) this;
        }

        public Criteria andPlanefinishdateIsNotNull() {
            addCriterion("planefinishdate is not null");
            return (Criteria) this;
        }

        public Criteria andPlanefinishdateEqualTo(Date value) {
            addCriterion("planefinishdate =", value, "planefinishdate");
            return (Criteria) this;
        }

        public Criteria andPlanefinishdateNotEqualTo(Date value) {
            addCriterion("planefinishdate <>", value, "planefinishdate");
            return (Criteria) this;
        }

        public Criteria andPlanefinishdateGreaterThan(Date value) {
            addCriterion("planefinishdate >", value, "planefinishdate");
            return (Criteria) this;
        }

        public Criteria andPlanefinishdateGreaterThanOrEqualTo(Date value) {
            addCriterion("planefinishdate >=", value, "planefinishdate");
            return (Criteria) this;
        }

        public Criteria andPlanefinishdateLessThan(Date value) {
            addCriterion("planefinishdate <", value, "planefinishdate");
            return (Criteria) this;
        }

        public Criteria andPlanefinishdateLessThanOrEqualTo(Date value) {
            addCriterion("planefinishdate <=", value, "planefinishdate");
            return (Criteria) this;
        }

        public Criteria andPlanefinishdateIn(List<Date> values) {
            addCriterion("planefinishdate in", values, "planefinishdate");
            return (Criteria) this;
        }

        public Criteria andPlanefinishdateNotIn(List<Date> values) {
            addCriterion("planefinishdate not in", values, "planefinishdate");
            return (Criteria) this;
        }

        public Criteria andPlanefinishdateBetween(Date value1, Date value2) {
            addCriterion("planefinishdate between", value1, value2, "planefinishdate");
            return (Criteria) this;
        }

        public Criteria andPlanefinishdateNotBetween(Date value1, Date value2) {
            addCriterion("planefinishdate not between", value1, value2, "planefinishdate");
            return (Criteria) this;
        }

        public Criteria andStartprojectdateIsNull() {
            addCriterion("startprojectdate is null");
            return (Criteria) this;
        }

        public Criteria andStartprojectdateIsNotNull() {
            addCriterion("startprojectdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartprojectdateEqualTo(Date value) {
            addCriterion("startprojectdate =", value, "startprojectdate");
            return (Criteria) this;
        }

        public Criteria andStartprojectdateNotEqualTo(Date value) {
            addCriterion("startprojectdate <>", value, "startprojectdate");
            return (Criteria) this;
        }

        public Criteria andStartprojectdateGreaterThan(Date value) {
            addCriterion("startprojectdate >", value, "startprojectdate");
            return (Criteria) this;
        }

        public Criteria andStartprojectdateGreaterThanOrEqualTo(Date value) {
            addCriterion("startprojectdate >=", value, "startprojectdate");
            return (Criteria) this;
        }

        public Criteria andStartprojectdateLessThan(Date value) {
            addCriterion("startprojectdate <", value, "startprojectdate");
            return (Criteria) this;
        }

        public Criteria andStartprojectdateLessThanOrEqualTo(Date value) {
            addCriterion("startprojectdate <=", value, "startprojectdate");
            return (Criteria) this;
        }

        public Criteria andStartprojectdateIn(List<Date> values) {
            addCriterion("startprojectdate in", values, "startprojectdate");
            return (Criteria) this;
        }

        public Criteria andStartprojectdateNotIn(List<Date> values) {
            addCriterion("startprojectdate not in", values, "startprojectdate");
            return (Criteria) this;
        }

        public Criteria andStartprojectdateBetween(Date value1, Date value2) {
            addCriterion("startprojectdate between", value1, value2, "startprojectdate");
            return (Criteria) this;
        }

        public Criteria andStartprojectdateNotBetween(Date value1, Date value2) {
            addCriterion("startprojectdate not between", value1, value2, "startprojectdate");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerIsNull() {
            addCriterion("projectmanager is null");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerIsNotNull() {
            addCriterion("projectmanager is not null");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerEqualTo(String value) {
            addCriterion("projectmanager =", value, "projectmanager");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerNotEqualTo(String value) {
            addCriterion("projectmanager <>", value, "projectmanager");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerGreaterThan(String value) {
            addCriterion("projectmanager >", value, "projectmanager");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerGreaterThanOrEqualTo(String value) {
            addCriterion("projectmanager >=", value, "projectmanager");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerLessThan(String value) {
            addCriterion("projectmanager <", value, "projectmanager");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerLessThanOrEqualTo(String value) {
            addCriterion("projectmanager <=", value, "projectmanager");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerLike(String value) {
            addCriterion("projectmanager like", value, "projectmanager");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerNotLike(String value) {
            addCriterion("projectmanager not like", value, "projectmanager");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerIn(List<String> values) {
            addCriterion("projectmanager in", values, "projectmanager");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerNotIn(List<String> values) {
            addCriterion("projectmanager not in", values, "projectmanager");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerBetween(String value1, String value2) {
            addCriterion("projectmanager between", value1, value2, "projectmanager");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerNotBetween(String value1, String value2) {
            addCriterion("projectmanager not between", value1, value2, "projectmanager");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerdaytimeIsNull() {
            addCriterion("projectmanagerdaytime is null");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerdaytimeIsNotNull() {
            addCriterion("projectmanagerdaytime is not null");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerdaytimeEqualTo(String value) {
            addCriterion("projectmanagerdaytime =", value, "projectmanagerdaytime");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerdaytimeNotEqualTo(String value) {
            addCriterion("projectmanagerdaytime <>", value, "projectmanagerdaytime");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerdaytimeGreaterThan(String value) {
            addCriterion("projectmanagerdaytime >", value, "projectmanagerdaytime");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerdaytimeGreaterThanOrEqualTo(String value) {
            addCriterion("projectmanagerdaytime >=", value, "projectmanagerdaytime");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerdaytimeLessThan(String value) {
            addCriterion("projectmanagerdaytime <", value, "projectmanagerdaytime");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerdaytimeLessThanOrEqualTo(String value) {
            addCriterion("projectmanagerdaytime <=", value, "projectmanagerdaytime");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerdaytimeLike(String value) {
            addCriterion("projectmanagerdaytime like", value, "projectmanagerdaytime");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerdaytimeNotLike(String value) {
            addCriterion("projectmanagerdaytime not like", value, "projectmanagerdaytime");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerdaytimeIn(List<String> values) {
            addCriterion("projectmanagerdaytime in", values, "projectmanagerdaytime");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerdaytimeNotIn(List<String> values) {
            addCriterion("projectmanagerdaytime not in", values, "projectmanagerdaytime");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerdaytimeBetween(String value1, String value2) {
            addCriterion("projectmanagerdaytime between", value1, value2, "projectmanagerdaytime");
            return (Criteria) this;
        }

        public Criteria andProjectmanagerdaytimeNotBetween(String value1, String value2) {
            addCriterion("projectmanagerdaytime not between", value1, value2, "projectmanagerdaytime");
            return (Criteria) this;
        }

        public Criteria andImpconsultantIsNull() {
            addCriterion("impconsultant is null");
            return (Criteria) this;
        }

        public Criteria andImpconsultantIsNotNull() {
            addCriterion("impconsultant is not null");
            return (Criteria) this;
        }

        public Criteria andImpconsultantEqualTo(String value) {
            addCriterion("impconsultant =", value, "impconsultant");
            return (Criteria) this;
        }

        public Criteria andImpconsultantNotEqualTo(String value) {
            addCriterion("impconsultant <>", value, "impconsultant");
            return (Criteria) this;
        }

        public Criteria andImpconsultantGreaterThan(String value) {
            addCriterion("impconsultant >", value, "impconsultant");
            return (Criteria) this;
        }

        public Criteria andImpconsultantGreaterThanOrEqualTo(String value) {
            addCriterion("impconsultant >=", value, "impconsultant");
            return (Criteria) this;
        }

        public Criteria andImpconsultantLessThan(String value) {
            addCriterion("impconsultant <", value, "impconsultant");
            return (Criteria) this;
        }

        public Criteria andImpconsultantLessThanOrEqualTo(String value) {
            addCriterion("impconsultant <=", value, "impconsultant");
            return (Criteria) this;
        }

        public Criteria andImpconsultantLike(String value) {
            addCriterion("impconsultant like", value, "impconsultant");
            return (Criteria) this;
        }

        public Criteria andImpconsultantNotLike(String value) {
            addCriterion("impconsultant not like", value, "impconsultant");
            return (Criteria) this;
        }

        public Criteria andImpconsultantIn(List<String> values) {
            addCriterion("impconsultant in", values, "impconsultant");
            return (Criteria) this;
        }

        public Criteria andImpconsultantNotIn(List<String> values) {
            addCriterion("impconsultant not in", values, "impconsultant");
            return (Criteria) this;
        }

        public Criteria andImpconsultantBetween(String value1, String value2) {
            addCriterion("impconsultant between", value1, value2, "impconsultant");
            return (Criteria) this;
        }

        public Criteria andImpconsultantNotBetween(String value1, String value2) {
            addCriterion("impconsultant not between", value1, value2, "impconsultant");
            return (Criteria) this;
        }

        public Criteria andImpconsultantdaytimeIsNull() {
            addCriterion("impconsultantdaytime is null");
            return (Criteria) this;
        }

        public Criteria andImpconsultantdaytimeIsNotNull() {
            addCriterion("impconsultantdaytime is not null");
            return (Criteria) this;
        }

        public Criteria andImpconsultantdaytimeEqualTo(String value) {
            addCriterion("impconsultantdaytime =", value, "impconsultantdaytime");
            return (Criteria) this;
        }

        public Criteria andImpconsultantdaytimeNotEqualTo(String value) {
            addCriterion("impconsultantdaytime <>", value, "impconsultantdaytime");
            return (Criteria) this;
        }

        public Criteria andImpconsultantdaytimeGreaterThan(String value) {
            addCriterion("impconsultantdaytime >", value, "impconsultantdaytime");
            return (Criteria) this;
        }

        public Criteria andImpconsultantdaytimeGreaterThanOrEqualTo(String value) {
            addCriterion("impconsultantdaytime >=", value, "impconsultantdaytime");
            return (Criteria) this;
        }

        public Criteria andImpconsultantdaytimeLessThan(String value) {
            addCriterion("impconsultantdaytime <", value, "impconsultantdaytime");
            return (Criteria) this;
        }

        public Criteria andImpconsultantdaytimeLessThanOrEqualTo(String value) {
            addCriterion("impconsultantdaytime <=", value, "impconsultantdaytime");
            return (Criteria) this;
        }

        public Criteria andImpconsultantdaytimeLike(String value) {
            addCriterion("impconsultantdaytime like", value, "impconsultantdaytime");
            return (Criteria) this;
        }

        public Criteria andImpconsultantdaytimeNotLike(String value) {
            addCriterion("impconsultantdaytime not like", value, "impconsultantdaytime");
            return (Criteria) this;
        }

        public Criteria andImpconsultantdaytimeIn(List<String> values) {
            addCriterion("impconsultantdaytime in", values, "impconsultantdaytime");
            return (Criteria) this;
        }

        public Criteria andImpconsultantdaytimeNotIn(List<String> values) {
            addCriterion("impconsultantdaytime not in", values, "impconsultantdaytime");
            return (Criteria) this;
        }

        public Criteria andImpconsultantdaytimeBetween(String value1, String value2) {
            addCriterion("impconsultantdaytime between", value1, value2, "impconsultantdaytime");
            return (Criteria) this;
        }

        public Criteria andImpconsultantdaytimeNotBetween(String value1, String value2) {
            addCriterion("impconsultantdaytime not between", value1, value2, "impconsultantdaytime");
            return (Criteria) this;
        }

        public Criteria andDevconsultantIsNull() {
            addCriterion("devconsultant is null");
            return (Criteria) this;
        }

        public Criteria andDevconsultantIsNotNull() {
            addCriterion("devconsultant is not null");
            return (Criteria) this;
        }

        public Criteria andDevconsultantEqualTo(String value) {
            addCriterion("devconsultant =", value, "devconsultant");
            return (Criteria) this;
        }

        public Criteria andDevconsultantNotEqualTo(String value) {
            addCriterion("devconsultant <>", value, "devconsultant");
            return (Criteria) this;
        }

        public Criteria andDevconsultantGreaterThan(String value) {
            addCriterion("devconsultant >", value, "devconsultant");
            return (Criteria) this;
        }

        public Criteria andDevconsultantGreaterThanOrEqualTo(String value) {
            addCriterion("devconsultant >=", value, "devconsultant");
            return (Criteria) this;
        }

        public Criteria andDevconsultantLessThan(String value) {
            addCriterion("devconsultant <", value, "devconsultant");
            return (Criteria) this;
        }

        public Criteria andDevconsultantLessThanOrEqualTo(String value) {
            addCriterion("devconsultant <=", value, "devconsultant");
            return (Criteria) this;
        }

        public Criteria andDevconsultantLike(String value) {
            addCriterion("devconsultant like", value, "devconsultant");
            return (Criteria) this;
        }

        public Criteria andDevconsultantNotLike(String value) {
            addCriterion("devconsultant not like", value, "devconsultant");
            return (Criteria) this;
        }

        public Criteria andDevconsultantIn(List<String> values) {
            addCriterion("devconsultant in", values, "devconsultant");
            return (Criteria) this;
        }

        public Criteria andDevconsultantNotIn(List<String> values) {
            addCriterion("devconsultant not in", values, "devconsultant");
            return (Criteria) this;
        }

        public Criteria andDevconsultantBetween(String value1, String value2) {
            addCriterion("devconsultant between", value1, value2, "devconsultant");
            return (Criteria) this;
        }

        public Criteria andDevconsultantNotBetween(String value1, String value2) {
            addCriterion("devconsultant not between", value1, value2, "devconsultant");
            return (Criteria) this;
        }

        public Criteria andDevconsultantdaytimeIsNull() {
            addCriterion("devconsultantdaytime is null");
            return (Criteria) this;
        }

        public Criteria andDevconsultantdaytimeIsNotNull() {
            addCriterion("devconsultantdaytime is not null");
            return (Criteria) this;
        }

        public Criteria andDevconsultantdaytimeEqualTo(String value) {
            addCriterion("devconsultantdaytime =", value, "devconsultantdaytime");
            return (Criteria) this;
        }

        public Criteria andDevconsultantdaytimeNotEqualTo(String value) {
            addCriterion("devconsultantdaytime <>", value, "devconsultantdaytime");
            return (Criteria) this;
        }

        public Criteria andDevconsultantdaytimeGreaterThan(String value) {
            addCriterion("devconsultantdaytime >", value, "devconsultantdaytime");
            return (Criteria) this;
        }

        public Criteria andDevconsultantdaytimeGreaterThanOrEqualTo(String value) {
            addCriterion("devconsultantdaytime >=", value, "devconsultantdaytime");
            return (Criteria) this;
        }

        public Criteria andDevconsultantdaytimeLessThan(String value) {
            addCriterion("devconsultantdaytime <", value, "devconsultantdaytime");
            return (Criteria) this;
        }

        public Criteria andDevconsultantdaytimeLessThanOrEqualTo(String value) {
            addCriterion("devconsultantdaytime <=", value, "devconsultantdaytime");
            return (Criteria) this;
        }

        public Criteria andDevconsultantdaytimeLike(String value) {
            addCriterion("devconsultantdaytime like", value, "devconsultantdaytime");
            return (Criteria) this;
        }

        public Criteria andDevconsultantdaytimeNotLike(String value) {
            addCriterion("devconsultantdaytime not like", value, "devconsultantdaytime");
            return (Criteria) this;
        }

        public Criteria andDevconsultantdaytimeIn(List<String> values) {
            addCriterion("devconsultantdaytime in", values, "devconsultantdaytime");
            return (Criteria) this;
        }

        public Criteria andDevconsultantdaytimeNotIn(List<String> values) {
            addCriterion("devconsultantdaytime not in", values, "devconsultantdaytime");
            return (Criteria) this;
        }

        public Criteria andDevconsultantdaytimeBetween(String value1, String value2) {
            addCriterion("devconsultantdaytime between", value1, value2, "devconsultantdaytime");
            return (Criteria) this;
        }

        public Criteria andDevconsultantdaytimeNotBetween(String value1, String value2) {
            addCriterion("devconsultantdaytime not between", value1, value2, "devconsultantdaytime");
            return (Criteria) this;
        }

        public Criteria andPlanesumdaytimeIsNull() {
            addCriterion("planesumdaytime is null");
            return (Criteria) this;
        }

        public Criteria andPlanesumdaytimeIsNotNull() {
            addCriterion("planesumdaytime is not null");
            return (Criteria) this;
        }

        public Criteria andPlanesumdaytimeEqualTo(String value) {
            addCriterion("planesumdaytime =", value, "planesumdaytime");
            return (Criteria) this;
        }

        public Criteria andPlanesumdaytimeNotEqualTo(String value) {
            addCriterion("planesumdaytime <>", value, "planesumdaytime");
            return (Criteria) this;
        }

        public Criteria andPlanesumdaytimeGreaterThan(String value) {
            addCriterion("planesumdaytime >", value, "planesumdaytime");
            return (Criteria) this;
        }

        public Criteria andPlanesumdaytimeGreaterThanOrEqualTo(String value) {
            addCriterion("planesumdaytime >=", value, "planesumdaytime");
            return (Criteria) this;
        }

        public Criteria andPlanesumdaytimeLessThan(String value) {
            addCriterion("planesumdaytime <", value, "planesumdaytime");
            return (Criteria) this;
        }

        public Criteria andPlanesumdaytimeLessThanOrEqualTo(String value) {
            addCriterion("planesumdaytime <=", value, "planesumdaytime");
            return (Criteria) this;
        }

        public Criteria andPlanesumdaytimeLike(String value) {
            addCriterion("planesumdaytime like", value, "planesumdaytime");
            return (Criteria) this;
        }

        public Criteria andPlanesumdaytimeNotLike(String value) {
            addCriterion("planesumdaytime not like", value, "planesumdaytime");
            return (Criteria) this;
        }

        public Criteria andPlanesumdaytimeIn(List<String> values) {
            addCriterion("planesumdaytime in", values, "planesumdaytime");
            return (Criteria) this;
        }

        public Criteria andPlanesumdaytimeNotIn(List<String> values) {
            addCriterion("planesumdaytime not in", values, "planesumdaytime");
            return (Criteria) this;
        }

        public Criteria andPlanesumdaytimeBetween(String value1, String value2) {
            addCriterion("planesumdaytime between", value1, value2, "planesumdaytime");
            return (Criteria) this;
        }

        public Criteria andPlanesumdaytimeNotBetween(String value1, String value2) {
            addCriterion("planesumdaytime not between", value1, value2, "planesumdaytime");
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

        public Criteria andStageinIsNull() {
            addCriterion("stagein is null");
            return (Criteria) this;
        }

        public Criteria andStageinIsNotNull() {
            addCriterion("stagein is not null");
            return (Criteria) this;
        }

        public Criteria andStageinEqualTo(String value) {
            addCriterion("stagein =", value, "stagein");
            return (Criteria) this;
        }

        public Criteria andStageinNotEqualTo(String value) {
            addCriterion("stagein <>", value, "stagein");
            return (Criteria) this;
        }

        public Criteria andStageinGreaterThan(String value) {
            addCriterion("stagein >", value, "stagein");
            return (Criteria) this;
        }

        public Criteria andStageinGreaterThanOrEqualTo(String value) {
            addCriterion("stagein >=", value, "stagein");
            return (Criteria) this;
        }

        public Criteria andStageinLessThan(String value) {
            addCriterion("stagein <", value, "stagein");
            return (Criteria) this;
        }

        public Criteria andStageinLessThanOrEqualTo(String value) {
            addCriterion("stagein <=", value, "stagein");
            return (Criteria) this;
        }

        public Criteria andStageinLike(String value) {
            addCriterion("stagein like", value, "stagein");
            return (Criteria) this;
        }

        public Criteria andStageinNotLike(String value) {
            addCriterion("stagein not like", value, "stagein");
            return (Criteria) this;
        }

        public Criteria andStageinIn(List<String> values) {
            addCriterion("stagein in", values, "stagein");
            return (Criteria) this;
        }

        public Criteria andStageinNotIn(List<String> values) {
            addCriterion("stagein not in", values, "stagein");
            return (Criteria) this;
        }

        public Criteria andStageinBetween(String value1, String value2) {
            addCriterion("stagein between", value1, value2, "stagein");
            return (Criteria) this;
        }

        public Criteria andStageinNotBetween(String value1, String value2) {
            addCriterion("stagein not between", value1, value2, "stagein");
            return (Criteria) this;
        }

        public Criteria andYiprojectmanagerIsNull() {
            addCriterion("yiprojectmanager is null");
            return (Criteria) this;
        }

        public Criteria andYiprojectmanagerIsNotNull() {
            addCriterion("yiprojectmanager is not null");
            return (Criteria) this;
        }

        public Criteria andYiprojectmanagerEqualTo(String value) {
            addCriterion("yiprojectmanager =", value, "yiprojectmanager");
            return (Criteria) this;
        }

        public Criteria andYiprojectmanagerNotEqualTo(String value) {
            addCriterion("yiprojectmanager <>", value, "yiprojectmanager");
            return (Criteria) this;
        }

        public Criteria andYiprojectmanagerGreaterThan(String value) {
            addCriterion("yiprojectmanager >", value, "yiprojectmanager");
            return (Criteria) this;
        }

        public Criteria andYiprojectmanagerGreaterThanOrEqualTo(String value) {
            addCriterion("yiprojectmanager >=", value, "yiprojectmanager");
            return (Criteria) this;
        }

        public Criteria andYiprojectmanagerLessThan(String value) {
            addCriterion("yiprojectmanager <", value, "yiprojectmanager");
            return (Criteria) this;
        }

        public Criteria andYiprojectmanagerLessThanOrEqualTo(String value) {
            addCriterion("yiprojectmanager <=", value, "yiprojectmanager");
            return (Criteria) this;
        }

        public Criteria andYiprojectmanagerLike(String value) {
            addCriterion("yiprojectmanager like", value, "yiprojectmanager");
            return (Criteria) this;
        }

        public Criteria andYiprojectmanagerNotLike(String value) {
            addCriterion("yiprojectmanager not like", value, "yiprojectmanager");
            return (Criteria) this;
        }

        public Criteria andYiprojectmanagerIn(List<String> values) {
            addCriterion("yiprojectmanager in", values, "yiprojectmanager");
            return (Criteria) this;
        }

        public Criteria andYiprojectmanagerNotIn(List<String> values) {
            addCriterion("yiprojectmanager not in", values, "yiprojectmanager");
            return (Criteria) this;
        }

        public Criteria andYiprojectmanagerBetween(String value1, String value2) {
            addCriterion("yiprojectmanager between", value1, value2, "yiprojectmanager");
            return (Criteria) this;
        }

        public Criteria andYiprojectmanagerNotBetween(String value1, String value2) {
            addCriterion("yiprojectmanager not between", value1, value2, "yiprojectmanager");
            return (Criteria) this;
        }

        public Criteria andRadioIsNull() {
            addCriterion("radio is null");
            return (Criteria) this;
        }

        public Criteria andRadioIsNotNull() {
            addCriterion("radio is not null");
            return (Criteria) this;
        }

        public Criteria andRadioEqualTo(String value) {
            addCriterion("radio =", value, "radio");
            return (Criteria) this;
        }

        public Criteria andRadioNotEqualTo(String value) {
            addCriterion("radio <>", value, "radio");
            return (Criteria) this;
        }

        public Criteria andRadioGreaterThan(String value) {
            addCriterion("radio >", value, "radio");
            return (Criteria) this;
        }

        public Criteria andRadioGreaterThanOrEqualTo(String value) {
            addCriterion("radio >=", value, "radio");
            return (Criteria) this;
        }

        public Criteria andRadioLessThan(String value) {
            addCriterion("radio <", value, "radio");
            return (Criteria) this;
        }

        public Criteria andRadioLessThanOrEqualTo(String value) {
            addCriterion("radio <=", value, "radio");
            return (Criteria) this;
        }

        public Criteria andRadioLike(String value) {
            addCriterion("radio like", value, "radio");
            return (Criteria) this;
        }

        public Criteria andRadioNotLike(String value) {
            addCriterion("radio not like", value, "radio");
            return (Criteria) this;
        }

        public Criteria andRadioIn(List<String> values) {
            addCriterion("radio in", values, "radio");
            return (Criteria) this;
        }

        public Criteria andRadioNotIn(List<String> values) {
            addCriterion("radio not in", values, "radio");
            return (Criteria) this;
        }

        public Criteria andRadioBetween(String value1, String value2) {
            addCriterion("radio between", value1, value2, "radio");
            return (Criteria) this;
        }

        public Criteria andRadioNotBetween(String value1, String value2) {
            addCriterion("radio not between", value1, value2, "radio");
            return (Criteria) this;
        }

        public Criteria andLagdaysIsNull() {
            addCriterion("lagdays is null");
            return (Criteria) this;
        }

        public Criteria andLagdaysIsNotNull() {
            addCriterion("lagdays is not null");
            return (Criteria) this;
        }

        public Criteria andLagdaysEqualTo(String value) {
            addCriterion("lagdays =", value, "lagdays");
            return (Criteria) this;
        }

        public Criteria andLagdaysNotEqualTo(String value) {
            addCriterion("lagdays <>", value, "lagdays");
            return (Criteria) this;
        }

        public Criteria andLagdaysGreaterThan(String value) {
            addCriterion("lagdays >", value, "lagdays");
            return (Criteria) this;
        }

        public Criteria andLagdaysGreaterThanOrEqualTo(String value) {
            addCriterion("lagdays >=", value, "lagdays");
            return (Criteria) this;
        }

        public Criteria andLagdaysLessThan(String value) {
            addCriterion("lagdays <", value, "lagdays");
            return (Criteria) this;
        }

        public Criteria andLagdaysLessThanOrEqualTo(String value) {
            addCriterion("lagdays <=", value, "lagdays");
            return (Criteria) this;
        }

        public Criteria andLagdaysLike(String value) {
            addCriterion("lagdays like", value, "lagdays");
            return (Criteria) this;
        }

        public Criteria andLagdaysNotLike(String value) {
            addCriterion("lagdays not like", value, "lagdays");
            return (Criteria) this;
        }

        public Criteria andLagdaysIn(List<String> values) {
            addCriterion("lagdays in", values, "lagdays");
            return (Criteria) this;
        }

        public Criteria andLagdaysNotIn(List<String> values) {
            addCriterion("lagdays not in", values, "lagdays");
            return (Criteria) this;
        }

        public Criteria andLagdaysBetween(String value1, String value2) {
            addCriterion("lagdays between", value1, value2, "lagdays");
            return (Criteria) this;
        }

        public Criteria andLagdaysNotBetween(String value1, String value2) {
            addCriterion("lagdays not between", value1, value2, "lagdays");
            return (Criteria) this;
        }

        public Criteria andRiskwarningIsNull() {
            addCriterion("riskwarning is null");
            return (Criteria) this;
        }

        public Criteria andRiskwarningIsNotNull() {
            addCriterion("riskwarning is not null");
            return (Criteria) this;
        }

        public Criteria andRiskwarningEqualTo(String value) {
            addCriterion("riskwarning =", value, "riskwarning");
            return (Criteria) this;
        }

        public Criteria andRiskwarningNotEqualTo(String value) {
            addCriterion("riskwarning <>", value, "riskwarning");
            return (Criteria) this;
        }

        public Criteria andRiskwarningGreaterThan(String value) {
            addCriterion("riskwarning >", value, "riskwarning");
            return (Criteria) this;
        }

        public Criteria andRiskwarningGreaterThanOrEqualTo(String value) {
            addCriterion("riskwarning >=", value, "riskwarning");
            return (Criteria) this;
        }

        public Criteria andRiskwarningLessThan(String value) {
            addCriterion("riskwarning <", value, "riskwarning");
            return (Criteria) this;
        }

        public Criteria andRiskwarningLessThanOrEqualTo(String value) {
            addCriterion("riskwarning <=", value, "riskwarning");
            return (Criteria) this;
        }

        public Criteria andRiskwarningLike(String value) {
            addCriterion("riskwarning like", value, "riskwarning");
            return (Criteria) this;
        }

        public Criteria andRiskwarningNotLike(String value) {
            addCriterion("riskwarning not like", value, "riskwarning");
            return (Criteria) this;
        }

        public Criteria andRiskwarningIn(List<String> values) {
            addCriterion("riskwarning in", values, "riskwarning");
            return (Criteria) this;
        }

        public Criteria andRiskwarningNotIn(List<String> values) {
            addCriterion("riskwarning not in", values, "riskwarning");
            return (Criteria) this;
        }

        public Criteria andRiskwarningBetween(String value1, String value2) {
            addCriterion("riskwarning between", value1, value2, "riskwarning");
            return (Criteria) this;
        }

        public Criteria andRiskwarningNotBetween(String value1, String value2) {
            addCriterion("riskwarning not between", value1, value2, "riskwarning");
            return (Criteria) this;
        }

        public Criteria andProplstarttimeIsNull() {
            addCriterion("proplstarttime is null");
            return (Criteria) this;
        }

        public Criteria andProplstarttimeIsNotNull() {
            addCriterion("proplstarttime is not null");
            return (Criteria) this;
        }

        public Criteria andProplstarttimeEqualTo(Date value) {
            addCriterion("proplstarttime =", value, "proplstarttime");
            return (Criteria) this;
        }

        public Criteria andProplstarttimeNotEqualTo(Date value) {
            addCriterion("proplstarttime <>", value, "proplstarttime");
            return (Criteria) this;
        }

        public Criteria andProplstarttimeGreaterThan(Date value) {
            addCriterion("proplstarttime >", value, "proplstarttime");
            return (Criteria) this;
        }

        public Criteria andProplstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("proplstarttime >=", value, "proplstarttime");
            return (Criteria) this;
        }

        public Criteria andProplstarttimeLessThan(Date value) {
            addCriterion("proplstarttime <", value, "proplstarttime");
            return (Criteria) this;
        }

        public Criteria andProplstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("proplstarttime <=", value, "proplstarttime");
            return (Criteria) this;
        }

        public Criteria andProplstarttimeIn(List<Date> values) {
            addCriterion("proplstarttime in", values, "proplstarttime");
            return (Criteria) this;
        }

        public Criteria andProplstarttimeNotIn(List<Date> values) {
            addCriterion("proplstarttime not in", values, "proplstarttime");
            return (Criteria) this;
        }

        public Criteria andProplstarttimeBetween(Date value1, Date value2) {
            addCriterion("proplstarttime between", value1, value2, "proplstarttime");
            return (Criteria) this;
        }

        public Criteria andProplstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("proplstarttime not between", value1, value2, "proplstarttime");
            return (Criteria) this;
        }

        public Criteria andProplstatusIsNull() {
            addCriterion("proplstatus is null");
            return (Criteria) this;
        }

        public Criteria andProplstatusIsNotNull() {
            addCriterion("proplstatus is not null");
            return (Criteria) this;
        }

        public Criteria andProplstatusEqualTo(String value) {
            addCriterion("proplstatus =", value, "proplstatus");
            return (Criteria) this;
        }

        public Criteria andProplstatusNotEqualTo(String value) {
            addCriterion("proplstatus <>", value, "proplstatus");
            return (Criteria) this;
        }

        public Criteria andProplstatusGreaterThan(String value) {
            addCriterion("proplstatus >", value, "proplstatus");
            return (Criteria) this;
        }

        public Criteria andProplstatusGreaterThanOrEqualTo(String value) {
            addCriterion("proplstatus >=", value, "proplstatus");
            return (Criteria) this;
        }

        public Criteria andProplstatusLessThan(String value) {
            addCriterion("proplstatus <", value, "proplstatus");
            return (Criteria) this;
        }

        public Criteria andProplstatusLessThanOrEqualTo(String value) {
            addCriterion("proplstatus <=", value, "proplstatus");
            return (Criteria) this;
        }

        public Criteria andProplstatusLike(String value) {
            addCriterion("proplstatus like", value, "proplstatus");
            return (Criteria) this;
        }

        public Criteria andProplstatusNotLike(String value) {
            addCriterion("proplstatus not like", value, "proplstatus");
            return (Criteria) this;
        }

        public Criteria andProplstatusIn(List<String> values) {
            addCriterion("proplstatus in", values, "proplstatus");
            return (Criteria) this;
        }

        public Criteria andProplstatusNotIn(List<String> values) {
            addCriterion("proplstatus not in", values, "proplstatus");
            return (Criteria) this;
        }

        public Criteria andProplstatusBetween(String value1, String value2) {
            addCriterion("proplstatus between", value1, value2, "proplstatus");
            return (Criteria) this;
        }

        public Criteria andProplstatusNotBetween(String value1, String value2) {
            addCriterion("proplstatus not between", value1, value2, "proplstatus");
            return (Criteria) this;
        }

        public Criteria andBpdesignstarttimeIsNull() {
            addCriterion("bpdesignstarttime is null");
            return (Criteria) this;
        }

        public Criteria andBpdesignstarttimeIsNotNull() {
            addCriterion("bpdesignstarttime is not null");
            return (Criteria) this;
        }

        public Criteria andBpdesignstarttimeEqualTo(Date value) {
            addCriterion("bpdesignstarttime =", value, "bpdesignstarttime");
            return (Criteria) this;
        }

        public Criteria andBpdesignstarttimeNotEqualTo(Date value) {
            addCriterion("bpdesignstarttime <>", value, "bpdesignstarttime");
            return (Criteria) this;
        }

        public Criteria andBpdesignstarttimeGreaterThan(Date value) {
            addCriterion("bpdesignstarttime >", value, "bpdesignstarttime");
            return (Criteria) this;
        }

        public Criteria andBpdesignstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bpdesignstarttime >=", value, "bpdesignstarttime");
            return (Criteria) this;
        }

        public Criteria andBpdesignstarttimeLessThan(Date value) {
            addCriterion("bpdesignstarttime <", value, "bpdesignstarttime");
            return (Criteria) this;
        }

        public Criteria andBpdesignstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("bpdesignstarttime <=", value, "bpdesignstarttime");
            return (Criteria) this;
        }

        public Criteria andBpdesignstarttimeIn(List<Date> values) {
            addCriterion("bpdesignstarttime in", values, "bpdesignstarttime");
            return (Criteria) this;
        }

        public Criteria andBpdesignstarttimeNotIn(List<Date> values) {
            addCriterion("bpdesignstarttime not in", values, "bpdesignstarttime");
            return (Criteria) this;
        }

        public Criteria andBpdesignstarttimeBetween(Date value1, Date value2) {
            addCriterion("bpdesignstarttime between", value1, value2, "bpdesignstarttime");
            return (Criteria) this;
        }

        public Criteria andBpdesignstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("bpdesignstarttime not between", value1, value2, "bpdesignstarttime");
            return (Criteria) this;
        }

        public Criteria andBpdesignstatusIsNull() {
            addCriterion("bpdesignstatus is null");
            return (Criteria) this;
        }

        public Criteria andBpdesignstatusIsNotNull() {
            addCriterion("bpdesignstatus is not null");
            return (Criteria) this;
        }

        public Criteria andBpdesignstatusEqualTo(String value) {
            addCriterion("bpdesignstatus =", value, "bpdesignstatus");
            return (Criteria) this;
        }

        public Criteria andBpdesignstatusNotEqualTo(String value) {
            addCriterion("bpdesignstatus <>", value, "bpdesignstatus");
            return (Criteria) this;
        }

        public Criteria andBpdesignstatusGreaterThan(String value) {
            addCriterion("bpdesignstatus >", value, "bpdesignstatus");
            return (Criteria) this;
        }

        public Criteria andBpdesignstatusGreaterThanOrEqualTo(String value) {
            addCriterion("bpdesignstatus >=", value, "bpdesignstatus");
            return (Criteria) this;
        }

        public Criteria andBpdesignstatusLessThan(String value) {
            addCriterion("bpdesignstatus <", value, "bpdesignstatus");
            return (Criteria) this;
        }

        public Criteria andBpdesignstatusLessThanOrEqualTo(String value) {
            addCriterion("bpdesignstatus <=", value, "bpdesignstatus");
            return (Criteria) this;
        }

        public Criteria andBpdesignstatusLike(String value) {
            addCriterion("bpdesignstatus like", value, "bpdesignstatus");
            return (Criteria) this;
        }

        public Criteria andBpdesignstatusNotLike(String value) {
            addCriterion("bpdesignstatus not like", value, "bpdesignstatus");
            return (Criteria) this;
        }

        public Criteria andBpdesignstatusIn(List<String> values) {
            addCriterion("bpdesignstatus in", values, "bpdesignstatus");
            return (Criteria) this;
        }

        public Criteria andBpdesignstatusNotIn(List<String> values) {
            addCriterion("bpdesignstatus not in", values, "bpdesignstatus");
            return (Criteria) this;
        }

        public Criteria andBpdesignstatusBetween(String value1, String value2) {
            addCriterion("bpdesignstatus between", value1, value2, "bpdesignstatus");
            return (Criteria) this;
        }

        public Criteria andBpdesignstatusNotBetween(String value1, String value2) {
            addCriterion("bpdesignstatus not between", value1, value2, "bpdesignstatus");
            return (Criteria) this;
        }

        public Criteria andSysbuildstarttimeIsNull() {
            addCriterion("sysbuildstarttime is null");
            return (Criteria) this;
        }

        public Criteria andSysbuildstarttimeIsNotNull() {
            addCriterion("sysbuildstarttime is not null");
            return (Criteria) this;
        }

        public Criteria andSysbuildstarttimeEqualTo(Date value) {
            addCriterion("sysbuildstarttime =", value, "sysbuildstarttime");
            return (Criteria) this;
        }

        public Criteria andSysbuildstarttimeNotEqualTo(Date value) {
            addCriterion("sysbuildstarttime <>", value, "sysbuildstarttime");
            return (Criteria) this;
        }

        public Criteria andSysbuildstarttimeGreaterThan(Date value) {
            addCriterion("sysbuildstarttime >", value, "sysbuildstarttime");
            return (Criteria) this;
        }

        public Criteria andSysbuildstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sysbuildstarttime >=", value, "sysbuildstarttime");
            return (Criteria) this;
        }

        public Criteria andSysbuildstarttimeLessThan(Date value) {
            addCriterion("sysbuildstarttime <", value, "sysbuildstarttime");
            return (Criteria) this;
        }

        public Criteria andSysbuildstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("sysbuildstarttime <=", value, "sysbuildstarttime");
            return (Criteria) this;
        }

        public Criteria andSysbuildstarttimeIn(List<Date> values) {
            addCriterion("sysbuildstarttime in", values, "sysbuildstarttime");
            return (Criteria) this;
        }

        public Criteria andSysbuildstarttimeNotIn(List<Date> values) {
            addCriterion("sysbuildstarttime not in", values, "sysbuildstarttime");
            return (Criteria) this;
        }

        public Criteria andSysbuildstarttimeBetween(Date value1, Date value2) {
            addCriterion("sysbuildstarttime between", value1, value2, "sysbuildstarttime");
            return (Criteria) this;
        }

        public Criteria andSysbuildstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("sysbuildstarttime not between", value1, value2, "sysbuildstarttime");
            return (Criteria) this;
        }

        public Criteria andSysbuildstatusIsNull() {
            addCriterion("sysbuildstatus is null");
            return (Criteria) this;
        }

        public Criteria andSysbuildstatusIsNotNull() {
            addCriterion("sysbuildstatus is not null");
            return (Criteria) this;
        }

        public Criteria andSysbuildstatusEqualTo(String value) {
            addCriterion("sysbuildstatus =", value, "sysbuildstatus");
            return (Criteria) this;
        }

        public Criteria andSysbuildstatusNotEqualTo(String value) {
            addCriterion("sysbuildstatus <>", value, "sysbuildstatus");
            return (Criteria) this;
        }

        public Criteria andSysbuildstatusGreaterThan(String value) {
            addCriterion("sysbuildstatus >", value, "sysbuildstatus");
            return (Criteria) this;
        }

        public Criteria andSysbuildstatusGreaterThanOrEqualTo(String value) {
            addCriterion("sysbuildstatus >=", value, "sysbuildstatus");
            return (Criteria) this;
        }

        public Criteria andSysbuildstatusLessThan(String value) {
            addCriterion("sysbuildstatus <", value, "sysbuildstatus");
            return (Criteria) this;
        }

        public Criteria andSysbuildstatusLessThanOrEqualTo(String value) {
            addCriterion("sysbuildstatus <=", value, "sysbuildstatus");
            return (Criteria) this;
        }

        public Criteria andSysbuildstatusLike(String value) {
            addCriterion("sysbuildstatus like", value, "sysbuildstatus");
            return (Criteria) this;
        }

        public Criteria andSysbuildstatusNotLike(String value) {
            addCriterion("sysbuildstatus not like", value, "sysbuildstatus");
            return (Criteria) this;
        }

        public Criteria andSysbuildstatusIn(List<String> values) {
            addCriterion("sysbuildstatus in", values, "sysbuildstatus");
            return (Criteria) this;
        }

        public Criteria andSysbuildstatusNotIn(List<String> values) {
            addCriterion("sysbuildstatus not in", values, "sysbuildstatus");
            return (Criteria) this;
        }

        public Criteria andSysbuildstatusBetween(String value1, String value2) {
            addCriterion("sysbuildstatus between", value1, value2, "sysbuildstatus");
            return (Criteria) this;
        }

        public Criteria andSysbuildstatusNotBetween(String value1, String value2) {
            addCriterion("sysbuildstatus not between", value1, value2, "sysbuildstatus");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstarttimeIsNull() {
            addCriterion("onlineswitchstarttime is null");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstarttimeIsNotNull() {
            addCriterion("onlineswitchstarttime is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstarttimeEqualTo(Date value) {
            addCriterion("onlineswitchstarttime =", value, "onlineswitchstarttime");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstarttimeNotEqualTo(Date value) {
            addCriterion("onlineswitchstarttime <>", value, "onlineswitchstarttime");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstarttimeGreaterThan(Date value) {
            addCriterion("onlineswitchstarttime >", value, "onlineswitchstarttime");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("onlineswitchstarttime >=", value, "onlineswitchstarttime");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstarttimeLessThan(Date value) {
            addCriterion("onlineswitchstarttime <", value, "onlineswitchstarttime");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("onlineswitchstarttime <=", value, "onlineswitchstarttime");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstarttimeIn(List<Date> values) {
            addCriterion("onlineswitchstarttime in", values, "onlineswitchstarttime");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstarttimeNotIn(List<Date> values) {
            addCriterion("onlineswitchstarttime not in", values, "onlineswitchstarttime");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstarttimeBetween(Date value1, Date value2) {
            addCriterion("onlineswitchstarttime between", value1, value2, "onlineswitchstarttime");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("onlineswitchstarttime not between", value1, value2, "onlineswitchstarttime");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstatusIsNull() {
            addCriterion("onlineswitchstatus is null");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstatusIsNotNull() {
            addCriterion("onlineswitchstatus is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstatusEqualTo(String value) {
            addCriterion("onlineswitchstatus =", value, "onlineswitchstatus");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstatusNotEqualTo(String value) {
            addCriterion("onlineswitchstatus <>", value, "onlineswitchstatus");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstatusGreaterThan(String value) {
            addCriterion("onlineswitchstatus >", value, "onlineswitchstatus");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstatusGreaterThanOrEqualTo(String value) {
            addCriterion("onlineswitchstatus >=", value, "onlineswitchstatus");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstatusLessThan(String value) {
            addCriterion("onlineswitchstatus <", value, "onlineswitchstatus");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstatusLessThanOrEqualTo(String value) {
            addCriterion("onlineswitchstatus <=", value, "onlineswitchstatus");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstatusLike(String value) {
            addCriterion("onlineswitchstatus like", value, "onlineswitchstatus");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstatusNotLike(String value) {
            addCriterion("onlineswitchstatus not like", value, "onlineswitchstatus");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstatusIn(List<String> values) {
            addCriterion("onlineswitchstatus in", values, "onlineswitchstatus");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstatusNotIn(List<String> values) {
            addCriterion("onlineswitchstatus not in", values, "onlineswitchstatus");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstatusBetween(String value1, String value2) {
            addCriterion("onlineswitchstatus between", value1, value2, "onlineswitchstatus");
            return (Criteria) this;
        }

        public Criteria andOnlineswitchstatusNotBetween(String value1, String value2) {
            addCriterion("onlineswitchstatus not between", value1, value2, "onlineswitchstatus");
            return (Criteria) this;
        }

        public Criteria andSusupportstarttimeIsNull() {
            addCriterion("susupportstarttime is null");
            return (Criteria) this;
        }

        public Criteria andSusupportstarttimeIsNotNull() {
            addCriterion("susupportstarttime is not null");
            return (Criteria) this;
        }

        public Criteria andSusupportstarttimeEqualTo(Date value) {
            addCriterion("susupportstarttime =", value, "susupportstarttime");
            return (Criteria) this;
        }

        public Criteria andSusupportstarttimeNotEqualTo(Date value) {
            addCriterion("susupportstarttime <>", value, "susupportstarttime");
            return (Criteria) this;
        }

        public Criteria andSusupportstarttimeGreaterThan(Date value) {
            addCriterion("susupportstarttime >", value, "susupportstarttime");
            return (Criteria) this;
        }

        public Criteria andSusupportstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("susupportstarttime >=", value, "susupportstarttime");
            return (Criteria) this;
        }

        public Criteria andSusupportstarttimeLessThan(Date value) {
            addCriterion("susupportstarttime <", value, "susupportstarttime");
            return (Criteria) this;
        }

        public Criteria andSusupportstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("susupportstarttime <=", value, "susupportstarttime");
            return (Criteria) this;
        }

        public Criteria andSusupportstarttimeIn(List<Date> values) {
            addCriterion("susupportstarttime in", values, "susupportstarttime");
            return (Criteria) this;
        }

        public Criteria andSusupportstarttimeNotIn(List<Date> values) {
            addCriterion("susupportstarttime not in", values, "susupportstarttime");
            return (Criteria) this;
        }

        public Criteria andSusupportstarttimeBetween(Date value1, Date value2) {
            addCriterion("susupportstarttime between", value1, value2, "susupportstarttime");
            return (Criteria) this;
        }

        public Criteria andSusupportstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("susupportstarttime not between", value1, value2, "susupportstarttime");
            return (Criteria) this;
        }

        public Criteria andSusupportstatusIsNull() {
            addCriterion("susupportstatus is null");
            return (Criteria) this;
        }

        public Criteria andSusupportstatusIsNotNull() {
            addCriterion("susupportstatus is not null");
            return (Criteria) this;
        }

        public Criteria andSusupportstatusEqualTo(String value) {
            addCriterion("susupportstatus =", value, "susupportstatus");
            return (Criteria) this;
        }

        public Criteria andSusupportstatusNotEqualTo(String value) {
            addCriterion("susupportstatus <>", value, "susupportstatus");
            return (Criteria) this;
        }

        public Criteria andSusupportstatusGreaterThan(String value) {
            addCriterion("susupportstatus >", value, "susupportstatus");
            return (Criteria) this;
        }

        public Criteria andSusupportstatusGreaterThanOrEqualTo(String value) {
            addCriterion("susupportstatus >=", value, "susupportstatus");
            return (Criteria) this;
        }

        public Criteria andSusupportstatusLessThan(String value) {
            addCriterion("susupportstatus <", value, "susupportstatus");
            return (Criteria) this;
        }

        public Criteria andSusupportstatusLessThanOrEqualTo(String value) {
            addCriterion("susupportstatus <=", value, "susupportstatus");
            return (Criteria) this;
        }

        public Criteria andSusupportstatusLike(String value) {
            addCriterion("susupportstatus like", value, "susupportstatus");
            return (Criteria) this;
        }

        public Criteria andSusupportstatusNotLike(String value) {
            addCriterion("susupportstatus not like", value, "susupportstatus");
            return (Criteria) this;
        }

        public Criteria andSusupportstatusIn(List<String> values) {
            addCriterion("susupportstatus in", values, "susupportstatus");
            return (Criteria) this;
        }

        public Criteria andSusupportstatusNotIn(List<String> values) {
            addCriterion("susupportstatus not in", values, "susupportstatus");
            return (Criteria) this;
        }

        public Criteria andSusupportstatusBetween(String value1, String value2) {
            addCriterion("susupportstatus between", value1, value2, "susupportstatus");
            return (Criteria) this;
        }

        public Criteria andSusupportstatusNotBetween(String value1, String value2) {
            addCriterion("susupportstatus not between", value1, value2, "susupportstatus");
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