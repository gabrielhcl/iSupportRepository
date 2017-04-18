package com.yongyou.iSupport.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IsBProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IsBProjectExample() {
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

        public Criteria andBillcodeIsNull() {
            addCriterion("billcode is null");
            return (Criteria) this;
        }

        public Criteria andBillcodeIsNotNull() {
            addCriterion("billcode is not null");
            return (Criteria) this;
        }

        public Criteria andBillcodeEqualTo(String value) {
            addCriterion("billcode =", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeNotEqualTo(String value) {
            addCriterion("billcode <>", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeGreaterThan(String value) {
            addCriterion("billcode >", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeGreaterThanOrEqualTo(String value) {
            addCriterion("billcode >=", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeLessThan(String value) {
            addCriterion("billcode <", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeLessThanOrEqualTo(String value) {
            addCriterion("billcode <=", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeLike(String value) {
            addCriterion("billcode like", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeNotLike(String value) {
            addCriterion("billcode not like", value, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeIn(List<String> values) {
            addCriterion("billcode in", values, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeNotIn(List<String> values) {
            addCriterion("billcode not in", values, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeBetween(String value1, String value2) {
            addCriterion("billcode between", value1, value2, "billcode");
            return (Criteria) this;
        }

        public Criteria andBillcodeNotBetween(String value1, String value2) {
            addCriterion("billcode not between", value1, value2, "billcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeIsNull() {
            addCriterion("projectcode is null");
            return (Criteria) this;
        }

        public Criteria andProjectcodeIsNotNull() {
            addCriterion("projectcode is not null");
            return (Criteria) this;
        }

        public Criteria andProjectcodeEqualTo(String value) {
            addCriterion("projectcode =", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeNotEqualTo(String value) {
            addCriterion("projectcode <>", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeGreaterThan(String value) {
            addCriterion("projectcode >", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeGreaterThanOrEqualTo(String value) {
            addCriterion("projectcode >=", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeLessThan(String value) {
            addCriterion("projectcode <", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeLessThanOrEqualTo(String value) {
            addCriterion("projectcode <=", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeLike(String value) {
            addCriterion("projectcode like", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeNotLike(String value) {
            addCriterion("projectcode not like", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeIn(List<String> values) {
            addCriterion("projectcode in", values, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeNotIn(List<String> values) {
            addCriterion("projectcode not in", values, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeBetween(String value1, String value2) {
            addCriterion("projectcode between", value1, value2, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeNotBetween(String value1, String value2) {
            addCriterion("projectcode not between", value1, value2, "projectcode");
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

        public Criteria andCustomernameIsNull() {
            addCriterion("customername is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("customername is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("customername =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("customername <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("customername >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("customername >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("customername <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("customername <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("customername like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("customername not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("customername in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("customername not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("customername between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("customername not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andGroupcodeIsNull() {
            addCriterion("groupcode is null");
            return (Criteria) this;
        }

        public Criteria andGroupcodeIsNotNull() {
            addCriterion("groupcode is not null");
            return (Criteria) this;
        }

        public Criteria andGroupcodeEqualTo(String value) {
            addCriterion("groupcode =", value, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeNotEqualTo(String value) {
            addCriterion("groupcode <>", value, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeGreaterThan(String value) {
            addCriterion("groupcode >", value, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeGreaterThanOrEqualTo(String value) {
            addCriterion("groupcode >=", value, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeLessThan(String value) {
            addCriterion("groupcode <", value, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeLessThanOrEqualTo(String value) {
            addCriterion("groupcode <=", value, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeLike(String value) {
            addCriterion("groupcode like", value, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeNotLike(String value) {
            addCriterion("groupcode not like", value, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeIn(List<String> values) {
            addCriterion("groupcode in", values, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeNotIn(List<String> values) {
            addCriterion("groupcode not in", values, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeBetween(String value1, String value2) {
            addCriterion("groupcode between", value1, value2, "groupcode");
            return (Criteria) this;
        }

        public Criteria andGroupcodeNotBetween(String value1, String value2) {
            addCriterion("groupcode not between", value1, value2, "groupcode");
            return (Criteria) this;
        }

        public Criteria andServicestimeIsNull() {
            addCriterion("servicestime is null");
            return (Criteria) this;
        }

        public Criteria andServicestimeIsNotNull() {
            addCriterion("servicestime is not null");
            return (Criteria) this;
        }

        public Criteria andServicestimeEqualTo(Date value) {
            addCriterion("servicestime =", value, "servicestime");
            return (Criteria) this;
        }

        public Criteria andServicestimeNotEqualTo(Date value) {
            addCriterion("servicestime <>", value, "servicestime");
            return (Criteria) this;
        }

        public Criteria andServicestimeGreaterThan(Date value) {
            addCriterion("servicestime >", value, "servicestime");
            return (Criteria) this;
        }

        public Criteria andServicestimeGreaterThanOrEqualTo(Date value) {
            addCriterion("servicestime >=", value, "servicestime");
            return (Criteria) this;
        }

        public Criteria andServicestimeLessThan(Date value) {
            addCriterion("servicestime <", value, "servicestime");
            return (Criteria) this;
        }

        public Criteria andServicestimeLessThanOrEqualTo(Date value) {
            addCriterion("servicestime <=", value, "servicestime");
            return (Criteria) this;
        }

        public Criteria andServicestimeIn(List<Date> values) {
            addCriterion("servicestime in", values, "servicestime");
            return (Criteria) this;
        }

        public Criteria andServicestimeNotIn(List<Date> values) {
            addCriterion("servicestime not in", values, "servicestime");
            return (Criteria) this;
        }

        public Criteria andServicestimeBetween(Date value1, Date value2) {
            addCriterion("servicestime between", value1, value2, "servicestime");
            return (Criteria) this;
        }

        public Criteria andServicestimeNotBetween(Date value1, Date value2) {
            addCriterion("servicestime not between", value1, value2, "servicestime");
            return (Criteria) this;
        }

        public Criteria andServiceftimeIsNull() {
            addCriterion("serviceftime is null");
            return (Criteria) this;
        }

        public Criteria andServiceftimeIsNotNull() {
            addCriterion("serviceftime is not null");
            return (Criteria) this;
        }

        public Criteria andServiceftimeEqualTo(Date value) {
            addCriterion("serviceftime =", value, "serviceftime");
            return (Criteria) this;
        }

        public Criteria andServiceftimeNotEqualTo(Date value) {
            addCriterion("serviceftime <>", value, "serviceftime");
            return (Criteria) this;
        }

        public Criteria andServiceftimeGreaterThan(Date value) {
            addCriterion("serviceftime >", value, "serviceftime");
            return (Criteria) this;
        }

        public Criteria andServiceftimeGreaterThanOrEqualTo(Date value) {
            addCriterion("serviceftime >=", value, "serviceftime");
            return (Criteria) this;
        }

        public Criteria andServiceftimeLessThan(Date value) {
            addCriterion("serviceftime <", value, "serviceftime");
            return (Criteria) this;
        }

        public Criteria andServiceftimeLessThanOrEqualTo(Date value) {
            addCriterion("serviceftime <=", value, "serviceftime");
            return (Criteria) this;
        }

        public Criteria andServiceftimeIn(List<Date> values) {
            addCriterion("serviceftime in", values, "serviceftime");
            return (Criteria) this;
        }

        public Criteria andServiceftimeNotIn(List<Date> values) {
            addCriterion("serviceftime not in", values, "serviceftime");
            return (Criteria) this;
        }

        public Criteria andServiceftimeBetween(Date value1, Date value2) {
            addCriterion("serviceftime between", value1, value2, "serviceftime");
            return (Criteria) this;
        }

        public Criteria andServiceftimeNotBetween(Date value1, Date value2) {
            addCriterion("serviceftime not between", value1, value2, "serviceftime");
            return (Criteria) this;
        }

        public Criteria andIsimplementIsNull() {
            addCriterion("isimplement is null");
            return (Criteria) this;
        }

        public Criteria andIsimplementIsNotNull() {
            addCriterion("isimplement is not null");
            return (Criteria) this;
        }

        public Criteria andIsimplementEqualTo(Integer value) {
            addCriterion("isimplement =", value, "isimplement");
            return (Criteria) this;
        }

        public Criteria andIsimplementNotEqualTo(Integer value) {
            addCriterion("isimplement <>", value, "isimplement");
            return (Criteria) this;
        }

        public Criteria andIsimplementGreaterThan(Integer value) {
            addCriterion("isimplement >", value, "isimplement");
            return (Criteria) this;
        }

        public Criteria andIsimplementGreaterThanOrEqualTo(Integer value) {
            addCriterion("isimplement >=", value, "isimplement");
            return (Criteria) this;
        }

        public Criteria andIsimplementLessThan(Integer value) {
            addCriterion("isimplement <", value, "isimplement");
            return (Criteria) this;
        }

        public Criteria andIsimplementLessThanOrEqualTo(Integer value) {
            addCriterion("isimplement <=", value, "isimplement");
            return (Criteria) this;
        }

        public Criteria andIsimplementIn(List<Integer> values) {
            addCriterion("isimplement in", values, "isimplement");
            return (Criteria) this;
        }

        public Criteria andIsimplementNotIn(List<Integer> values) {
            addCriterion("isimplement not in", values, "isimplement");
            return (Criteria) this;
        }

        public Criteria andIsimplementBetween(Integer value1, Integer value2) {
            addCriterion("isimplement between", value1, value2, "isimplement");
            return (Criteria) this;
        }

        public Criteria andIsimplementNotBetween(Integer value1, Integer value2) {
            addCriterion("isimplement not between", value1, value2, "isimplement");
            return (Criteria) this;
        }

        public Criteria andContractcodeIsNull() {
            addCriterion("contractcode is null");
            return (Criteria) this;
        }

        public Criteria andContractcodeIsNotNull() {
            addCriterion("contractcode is not null");
            return (Criteria) this;
        }

        public Criteria andContractcodeEqualTo(String value) {
            addCriterion("contractcode =", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeNotEqualTo(String value) {
            addCriterion("contractcode <>", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeGreaterThan(String value) {
            addCriterion("contractcode >", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeGreaterThanOrEqualTo(String value) {
            addCriterion("contractcode >=", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeLessThan(String value) {
            addCriterion("contractcode <", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeLessThanOrEqualTo(String value) {
            addCriterion("contractcode <=", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeLike(String value) {
            addCriterion("contractcode like", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeNotLike(String value) {
            addCriterion("contractcode not like", value, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeIn(List<String> values) {
            addCriterion("contractcode in", values, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeNotIn(List<String> values) {
            addCriterion("contractcode not in", values, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeBetween(String value1, String value2) {
            addCriterion("contractcode between", value1, value2, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractcodeNotBetween(String value1, String value2) {
            addCriterion("contractcode not between", value1, value2, "contractcode");
            return (Criteria) this;
        }

        public Criteria andContractnameIsNull() {
            addCriterion("contractname is null");
            return (Criteria) this;
        }

        public Criteria andContractnameIsNotNull() {
            addCriterion("contractname is not null");
            return (Criteria) this;
        }

        public Criteria andContractnameEqualTo(String value) {
            addCriterion("contractname =", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameNotEqualTo(String value) {
            addCriterion("contractname <>", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameGreaterThan(String value) {
            addCriterion("contractname >", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameGreaterThanOrEqualTo(String value) {
            addCriterion("contractname >=", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameLessThan(String value) {
            addCriterion("contractname <", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameLessThanOrEqualTo(String value) {
            addCriterion("contractname <=", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameLike(String value) {
            addCriterion("contractname like", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameNotLike(String value) {
            addCriterion("contractname not like", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameIn(List<String> values) {
            addCriterion("contractname in", values, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameNotIn(List<String> values) {
            addCriterion("contractname not in", values, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameBetween(String value1, String value2) {
            addCriterion("contractname between", value1, value2, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameNotBetween(String value1, String value2) {
            addCriterion("contractname not between", value1, value2, "contractname");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNull() {
            addCriterion("areacode is null");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNotNull() {
            addCriterion("areacode is not null");
            return (Criteria) this;
        }

        public Criteria andAreacodeEqualTo(String value) {
            addCriterion("areacode =", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotEqualTo(String value) {
            addCriterion("areacode <>", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThan(String value) {
            addCriterion("areacode >", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThanOrEqualTo(String value) {
            addCriterion("areacode >=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThan(String value) {
            addCriterion("areacode <", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThanOrEqualTo(String value) {
            addCriterion("areacode <=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLike(String value) {
            addCriterion("areacode like", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotLike(String value) {
            addCriterion("areacode not like", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeIn(List<String> values) {
            addCriterion("areacode in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotIn(List<String> values) {
            addCriterion("areacode not in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeBetween(String value1, String value2) {
            addCriterion("areacode between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotBetween(String value1, String value2) {
            addCriterion("areacode not between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andProductcodeIsNull() {
            addCriterion("productcode is null");
            return (Criteria) this;
        }

        public Criteria andProductcodeIsNotNull() {
            addCriterion("productcode is not null");
            return (Criteria) this;
        }

        public Criteria andProductcodeEqualTo(String value) {
            addCriterion("productcode =", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotEqualTo(String value) {
            addCriterion("productcode <>", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeGreaterThan(String value) {
            addCriterion("productcode >", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeGreaterThanOrEqualTo(String value) {
            addCriterion("productcode >=", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeLessThan(String value) {
            addCriterion("productcode <", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeLessThanOrEqualTo(String value) {
            addCriterion("productcode <=", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeLike(String value) {
            addCriterion("productcode like", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotLike(String value) {
            addCriterion("productcode not like", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeIn(List<String> values) {
            addCriterion("productcode in", values, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotIn(List<String> values) {
            addCriterion("productcode not in", values, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeBetween(String value1, String value2) {
            addCriterion("productcode between", value1, value2, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotBetween(String value1, String value2) {
            addCriterion("productcode not between", value1, value2, "productcode");
            return (Criteria) this;
        }

        public Criteria andModulemessageIsNull() {
            addCriterion("modulemessage is null");
            return (Criteria) this;
        }

        public Criteria andModulemessageIsNotNull() {
            addCriterion("modulemessage is not null");
            return (Criteria) this;
        }

        public Criteria andModulemessageEqualTo(String value) {
            addCriterion("modulemessage =", value, "modulemessage");
            return (Criteria) this;
        }

        public Criteria andModulemessageNotEqualTo(String value) {
            addCriterion("modulemessage <>", value, "modulemessage");
            return (Criteria) this;
        }

        public Criteria andModulemessageGreaterThan(String value) {
            addCriterion("modulemessage >", value, "modulemessage");
            return (Criteria) this;
        }

        public Criteria andModulemessageGreaterThanOrEqualTo(String value) {
            addCriterion("modulemessage >=", value, "modulemessage");
            return (Criteria) this;
        }

        public Criteria andModulemessageLessThan(String value) {
            addCriterion("modulemessage <", value, "modulemessage");
            return (Criteria) this;
        }

        public Criteria andModulemessageLessThanOrEqualTo(String value) {
            addCriterion("modulemessage <=", value, "modulemessage");
            return (Criteria) this;
        }

        public Criteria andModulemessageLike(String value) {
            addCriterion("modulemessage like", value, "modulemessage");
            return (Criteria) this;
        }

        public Criteria andModulemessageNotLike(String value) {
            addCriterion("modulemessage not like", value, "modulemessage");
            return (Criteria) this;
        }

        public Criteria andModulemessageIn(List<String> values) {
            addCriterion("modulemessage in", values, "modulemessage");
            return (Criteria) this;
        }

        public Criteria andModulemessageNotIn(List<String> values) {
            addCriterion("modulemessage not in", values, "modulemessage");
            return (Criteria) this;
        }

        public Criteria andModulemessageBetween(String value1, String value2) {
            addCriterion("modulemessage between", value1, value2, "modulemessage");
            return (Criteria) this;
        }

        public Criteria andModulemessageNotBetween(String value1, String value2) {
            addCriterion("modulemessage not between", value1, value2, "modulemessage");
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

        public Criteria andApposIsNull() {
            addCriterion("appos is null");
            return (Criteria) this;
        }

        public Criteria andApposIsNotNull() {
            addCriterion("appos is not null");
            return (Criteria) this;
        }

        public Criteria andApposEqualTo(String value) {
            addCriterion("appos =", value, "appos");
            return (Criteria) this;
        }

        public Criteria andApposNotEqualTo(String value) {
            addCriterion("appos <>", value, "appos");
            return (Criteria) this;
        }

        public Criteria andApposGreaterThan(String value) {
            addCriterion("appos >", value, "appos");
            return (Criteria) this;
        }

        public Criteria andApposGreaterThanOrEqualTo(String value) {
            addCriterion("appos >=", value, "appos");
            return (Criteria) this;
        }

        public Criteria andApposLessThan(String value) {
            addCriterion("appos <", value, "appos");
            return (Criteria) this;
        }

        public Criteria andApposLessThanOrEqualTo(String value) {
            addCriterion("appos <=", value, "appos");
            return (Criteria) this;
        }

        public Criteria andApposLike(String value) {
            addCriterion("appos like", value, "appos");
            return (Criteria) this;
        }

        public Criteria andApposNotLike(String value) {
            addCriterion("appos not like", value, "appos");
            return (Criteria) this;
        }

        public Criteria andApposIn(List<String> values) {
            addCriterion("appos in", values, "appos");
            return (Criteria) this;
        }

        public Criteria andApposNotIn(List<String> values) {
            addCriterion("appos not in", values, "appos");
            return (Criteria) this;
        }

        public Criteria andApposBetween(String value1, String value2) {
            addCriterion("appos between", value1, value2, "appos");
            return (Criteria) this;
        }

        public Criteria andApposNotBetween(String value1, String value2) {
            addCriterion("appos not between", value1, value2, "appos");
            return (Criteria) this;
        }

        public Criteria andAppsysversionIsNull() {
            addCriterion("appsysversion is null");
            return (Criteria) this;
        }

        public Criteria andAppsysversionIsNotNull() {
            addCriterion("appsysversion is not null");
            return (Criteria) this;
        }

        public Criteria andAppsysversionEqualTo(String value) {
            addCriterion("appsysversion =", value, "appsysversion");
            return (Criteria) this;
        }

        public Criteria andAppsysversionNotEqualTo(String value) {
            addCriterion("appsysversion <>", value, "appsysversion");
            return (Criteria) this;
        }

        public Criteria andAppsysversionGreaterThan(String value) {
            addCriterion("appsysversion >", value, "appsysversion");
            return (Criteria) this;
        }

        public Criteria andAppsysversionGreaterThanOrEqualTo(String value) {
            addCriterion("appsysversion >=", value, "appsysversion");
            return (Criteria) this;
        }

        public Criteria andAppsysversionLessThan(String value) {
            addCriterion("appsysversion <", value, "appsysversion");
            return (Criteria) this;
        }

        public Criteria andAppsysversionLessThanOrEqualTo(String value) {
            addCriterion("appsysversion <=", value, "appsysversion");
            return (Criteria) this;
        }

        public Criteria andAppsysversionLike(String value) {
            addCriterion("appsysversion like", value, "appsysversion");
            return (Criteria) this;
        }

        public Criteria andAppsysversionNotLike(String value) {
            addCriterion("appsysversion not like", value, "appsysversion");
            return (Criteria) this;
        }

        public Criteria andAppsysversionIn(List<String> values) {
            addCriterion("appsysversion in", values, "appsysversion");
            return (Criteria) this;
        }

        public Criteria andAppsysversionNotIn(List<String> values) {
            addCriterion("appsysversion not in", values, "appsysversion");
            return (Criteria) this;
        }

        public Criteria andAppsysversionBetween(String value1, String value2) {
            addCriterion("appsysversion between", value1, value2, "appsysversion");
            return (Criteria) this;
        }

        public Criteria andAppsysversionNotBetween(String value1, String value2) {
            addCriterion("appsysversion not between", value1, value2, "appsysversion");
            return (Criteria) this;
        }

        public Criteria andAppbrandIsNull() {
            addCriterion("appbrand is null");
            return (Criteria) this;
        }

        public Criteria andAppbrandIsNotNull() {
            addCriterion("appbrand is not null");
            return (Criteria) this;
        }

        public Criteria andAppbrandEqualTo(String value) {
            addCriterion("appbrand =", value, "appbrand");
            return (Criteria) this;
        }

        public Criteria andAppbrandNotEqualTo(String value) {
            addCriterion("appbrand <>", value, "appbrand");
            return (Criteria) this;
        }

        public Criteria andAppbrandGreaterThan(String value) {
            addCriterion("appbrand >", value, "appbrand");
            return (Criteria) this;
        }

        public Criteria andAppbrandGreaterThanOrEqualTo(String value) {
            addCriterion("appbrand >=", value, "appbrand");
            return (Criteria) this;
        }

        public Criteria andAppbrandLessThan(String value) {
            addCriterion("appbrand <", value, "appbrand");
            return (Criteria) this;
        }

        public Criteria andAppbrandLessThanOrEqualTo(String value) {
            addCriterion("appbrand <=", value, "appbrand");
            return (Criteria) this;
        }

        public Criteria andAppbrandLike(String value) {
            addCriterion("appbrand like", value, "appbrand");
            return (Criteria) this;
        }

        public Criteria andAppbrandNotLike(String value) {
            addCriterion("appbrand not like", value, "appbrand");
            return (Criteria) this;
        }

        public Criteria andAppbrandIn(List<String> values) {
            addCriterion("appbrand in", values, "appbrand");
            return (Criteria) this;
        }

        public Criteria andAppbrandNotIn(List<String> values) {
            addCriterion("appbrand not in", values, "appbrand");
            return (Criteria) this;
        }

        public Criteria andAppbrandBetween(String value1, String value2) {
            addCriterion("appbrand between", value1, value2, "appbrand");
            return (Criteria) this;
        }

        public Criteria andAppbrandNotBetween(String value1, String value2) {
            addCriterion("appbrand not between", value1, value2, "appbrand");
            return (Criteria) this;
        }

        public Criteria andAppcpuIsNull() {
            addCriterion("appcpu is null");
            return (Criteria) this;
        }

        public Criteria andAppcpuIsNotNull() {
            addCriterion("appcpu is not null");
            return (Criteria) this;
        }

        public Criteria andAppcpuEqualTo(String value) {
            addCriterion("appcpu =", value, "appcpu");
            return (Criteria) this;
        }

        public Criteria andAppcpuNotEqualTo(String value) {
            addCriterion("appcpu <>", value, "appcpu");
            return (Criteria) this;
        }

        public Criteria andAppcpuGreaterThan(String value) {
            addCriterion("appcpu >", value, "appcpu");
            return (Criteria) this;
        }

        public Criteria andAppcpuGreaterThanOrEqualTo(String value) {
            addCriterion("appcpu >=", value, "appcpu");
            return (Criteria) this;
        }

        public Criteria andAppcpuLessThan(String value) {
            addCriterion("appcpu <", value, "appcpu");
            return (Criteria) this;
        }

        public Criteria andAppcpuLessThanOrEqualTo(String value) {
            addCriterion("appcpu <=", value, "appcpu");
            return (Criteria) this;
        }

        public Criteria andAppcpuLike(String value) {
            addCriterion("appcpu like", value, "appcpu");
            return (Criteria) this;
        }

        public Criteria andAppcpuNotLike(String value) {
            addCriterion("appcpu not like", value, "appcpu");
            return (Criteria) this;
        }

        public Criteria andAppcpuIn(List<String> values) {
            addCriterion("appcpu in", values, "appcpu");
            return (Criteria) this;
        }

        public Criteria andAppcpuNotIn(List<String> values) {
            addCriterion("appcpu not in", values, "appcpu");
            return (Criteria) this;
        }

        public Criteria andAppcpuBetween(String value1, String value2) {
            addCriterion("appcpu between", value1, value2, "appcpu");
            return (Criteria) this;
        }

        public Criteria andAppcpuNotBetween(String value1, String value2) {
            addCriterion("appcpu not between", value1, value2, "appcpu");
            return (Criteria) this;
        }

        public Criteria andAppcpunumIsNull() {
            addCriterion("appcpunum is null");
            return (Criteria) this;
        }

        public Criteria andAppcpunumIsNotNull() {
            addCriterion("appcpunum is not null");
            return (Criteria) this;
        }

        public Criteria andAppcpunumEqualTo(String value) {
            addCriterion("appcpunum =", value, "appcpunum");
            return (Criteria) this;
        }

        public Criteria andAppcpunumNotEqualTo(String value) {
            addCriterion("appcpunum <>", value, "appcpunum");
            return (Criteria) this;
        }

        public Criteria andAppcpunumGreaterThan(String value) {
            addCriterion("appcpunum >", value, "appcpunum");
            return (Criteria) this;
        }

        public Criteria andAppcpunumGreaterThanOrEqualTo(String value) {
            addCriterion("appcpunum >=", value, "appcpunum");
            return (Criteria) this;
        }

        public Criteria andAppcpunumLessThan(String value) {
            addCriterion("appcpunum <", value, "appcpunum");
            return (Criteria) this;
        }

        public Criteria andAppcpunumLessThanOrEqualTo(String value) {
            addCriterion("appcpunum <=", value, "appcpunum");
            return (Criteria) this;
        }

        public Criteria andAppcpunumLike(String value) {
            addCriterion("appcpunum like", value, "appcpunum");
            return (Criteria) this;
        }

        public Criteria andAppcpunumNotLike(String value) {
            addCriterion("appcpunum not like", value, "appcpunum");
            return (Criteria) this;
        }

        public Criteria andAppcpunumIn(List<String> values) {
            addCriterion("appcpunum in", values, "appcpunum");
            return (Criteria) this;
        }

        public Criteria andAppcpunumNotIn(List<String> values) {
            addCriterion("appcpunum not in", values, "appcpunum");
            return (Criteria) this;
        }

        public Criteria andAppcpunumBetween(String value1, String value2) {
            addCriterion("appcpunum between", value1, value2, "appcpunum");
            return (Criteria) this;
        }

        public Criteria andAppcpunumNotBetween(String value1, String value2) {
            addCriterion("appcpunum not between", value1, value2, "appcpunum");
            return (Criteria) this;
        }

        public Criteria andAppramIsNull() {
            addCriterion("appram is null");
            return (Criteria) this;
        }

        public Criteria andAppramIsNotNull() {
            addCriterion("appram is not null");
            return (Criteria) this;
        }

        public Criteria andAppramEqualTo(String value) {
            addCriterion("appram =", value, "appram");
            return (Criteria) this;
        }

        public Criteria andAppramNotEqualTo(String value) {
            addCriterion("appram <>", value, "appram");
            return (Criteria) this;
        }

        public Criteria andAppramGreaterThan(String value) {
            addCriterion("appram >", value, "appram");
            return (Criteria) this;
        }

        public Criteria andAppramGreaterThanOrEqualTo(String value) {
            addCriterion("appram >=", value, "appram");
            return (Criteria) this;
        }

        public Criteria andAppramLessThan(String value) {
            addCriterion("appram <", value, "appram");
            return (Criteria) this;
        }

        public Criteria andAppramLessThanOrEqualTo(String value) {
            addCriterion("appram <=", value, "appram");
            return (Criteria) this;
        }

        public Criteria andAppramLike(String value) {
            addCriterion("appram like", value, "appram");
            return (Criteria) this;
        }

        public Criteria andAppramNotLike(String value) {
            addCriterion("appram not like", value, "appram");
            return (Criteria) this;
        }

        public Criteria andAppramIn(List<String> values) {
            addCriterion("appram in", values, "appram");
            return (Criteria) this;
        }

        public Criteria andAppramNotIn(List<String> values) {
            addCriterion("appram not in", values, "appram");
            return (Criteria) this;
        }

        public Criteria andAppramBetween(String value1, String value2) {
            addCriterion("appram between", value1, value2, "appram");
            return (Criteria) this;
        }

        public Criteria andAppramNotBetween(String value1, String value2) {
            addCriterion("appram not between", value1, value2, "appram");
            return (Criteria) this;
        }

        public Criteria andDbosIsNull() {
            addCriterion("dbos is null");
            return (Criteria) this;
        }

        public Criteria andDbosIsNotNull() {
            addCriterion("dbos is not null");
            return (Criteria) this;
        }

        public Criteria andDbosEqualTo(String value) {
            addCriterion("dbos =", value, "dbos");
            return (Criteria) this;
        }

        public Criteria andDbosNotEqualTo(String value) {
            addCriterion("dbos <>", value, "dbos");
            return (Criteria) this;
        }

        public Criteria andDbosGreaterThan(String value) {
            addCriterion("dbos >", value, "dbos");
            return (Criteria) this;
        }

        public Criteria andDbosGreaterThanOrEqualTo(String value) {
            addCriterion("dbos >=", value, "dbos");
            return (Criteria) this;
        }

        public Criteria andDbosLessThan(String value) {
            addCriterion("dbos <", value, "dbos");
            return (Criteria) this;
        }

        public Criteria andDbosLessThanOrEqualTo(String value) {
            addCriterion("dbos <=", value, "dbos");
            return (Criteria) this;
        }

        public Criteria andDbosLike(String value) {
            addCriterion("dbos like", value, "dbos");
            return (Criteria) this;
        }

        public Criteria andDbosNotLike(String value) {
            addCriterion("dbos not like", value, "dbos");
            return (Criteria) this;
        }

        public Criteria andDbosIn(List<String> values) {
            addCriterion("dbos in", values, "dbos");
            return (Criteria) this;
        }

        public Criteria andDbosNotIn(List<String> values) {
            addCriterion("dbos not in", values, "dbos");
            return (Criteria) this;
        }

        public Criteria andDbosBetween(String value1, String value2) {
            addCriterion("dbos between", value1, value2, "dbos");
            return (Criteria) this;
        }

        public Criteria andDbosNotBetween(String value1, String value2) {
            addCriterion("dbos not between", value1, value2, "dbos");
            return (Criteria) this;
        }

        public Criteria andDbosversionIsNull() {
            addCriterion("dbosversion is null");
            return (Criteria) this;
        }

        public Criteria andDbosversionIsNotNull() {
            addCriterion("dbosversion is not null");
            return (Criteria) this;
        }

        public Criteria andDbosversionEqualTo(String value) {
            addCriterion("dbosversion =", value, "dbosversion");
            return (Criteria) this;
        }

        public Criteria andDbosversionNotEqualTo(String value) {
            addCriterion("dbosversion <>", value, "dbosversion");
            return (Criteria) this;
        }

        public Criteria andDbosversionGreaterThan(String value) {
            addCriterion("dbosversion >", value, "dbosversion");
            return (Criteria) this;
        }

        public Criteria andDbosversionGreaterThanOrEqualTo(String value) {
            addCriterion("dbosversion >=", value, "dbosversion");
            return (Criteria) this;
        }

        public Criteria andDbosversionLessThan(String value) {
            addCriterion("dbosversion <", value, "dbosversion");
            return (Criteria) this;
        }

        public Criteria andDbosversionLessThanOrEqualTo(String value) {
            addCriterion("dbosversion <=", value, "dbosversion");
            return (Criteria) this;
        }

        public Criteria andDbosversionLike(String value) {
            addCriterion("dbosversion like", value, "dbosversion");
            return (Criteria) this;
        }

        public Criteria andDbosversionNotLike(String value) {
            addCriterion("dbosversion not like", value, "dbosversion");
            return (Criteria) this;
        }

        public Criteria andDbosversionIn(List<String> values) {
            addCriterion("dbosversion in", values, "dbosversion");
            return (Criteria) this;
        }

        public Criteria andDbosversionNotIn(List<String> values) {
            addCriterion("dbosversion not in", values, "dbosversion");
            return (Criteria) this;
        }

        public Criteria andDbosversionBetween(String value1, String value2) {
            addCriterion("dbosversion between", value1, value2, "dbosversion");
            return (Criteria) this;
        }

        public Criteria andDbosversionNotBetween(String value1, String value2) {
            addCriterion("dbosversion not between", value1, value2, "dbosversion");
            return (Criteria) this;
        }

        public Criteria andDbbrandIsNull() {
            addCriterion("dbbrand is null");
            return (Criteria) this;
        }

        public Criteria andDbbrandIsNotNull() {
            addCriterion("dbbrand is not null");
            return (Criteria) this;
        }

        public Criteria andDbbrandEqualTo(String value) {
            addCriterion("dbbrand =", value, "dbbrand");
            return (Criteria) this;
        }

        public Criteria andDbbrandNotEqualTo(String value) {
            addCriterion("dbbrand <>", value, "dbbrand");
            return (Criteria) this;
        }

        public Criteria andDbbrandGreaterThan(String value) {
            addCriterion("dbbrand >", value, "dbbrand");
            return (Criteria) this;
        }

        public Criteria andDbbrandGreaterThanOrEqualTo(String value) {
            addCriterion("dbbrand >=", value, "dbbrand");
            return (Criteria) this;
        }

        public Criteria andDbbrandLessThan(String value) {
            addCriterion("dbbrand <", value, "dbbrand");
            return (Criteria) this;
        }

        public Criteria andDbbrandLessThanOrEqualTo(String value) {
            addCriterion("dbbrand <=", value, "dbbrand");
            return (Criteria) this;
        }

        public Criteria andDbbrandLike(String value) {
            addCriterion("dbbrand like", value, "dbbrand");
            return (Criteria) this;
        }

        public Criteria andDbbrandNotLike(String value) {
            addCriterion("dbbrand not like", value, "dbbrand");
            return (Criteria) this;
        }

        public Criteria andDbbrandIn(List<String> values) {
            addCriterion("dbbrand in", values, "dbbrand");
            return (Criteria) this;
        }

        public Criteria andDbbrandNotIn(List<String> values) {
            addCriterion("dbbrand not in", values, "dbbrand");
            return (Criteria) this;
        }

        public Criteria andDbbrandBetween(String value1, String value2) {
            addCriterion("dbbrand between", value1, value2, "dbbrand");
            return (Criteria) this;
        }

        public Criteria andDbbrandNotBetween(String value1, String value2) {
            addCriterion("dbbrand not between", value1, value2, "dbbrand");
            return (Criteria) this;
        }

        public Criteria andDbcpuIsNull() {
            addCriterion("dbcpu is null");
            return (Criteria) this;
        }

        public Criteria andDbcpuIsNotNull() {
            addCriterion("dbcpu is not null");
            return (Criteria) this;
        }

        public Criteria andDbcpuEqualTo(String value) {
            addCriterion("dbcpu =", value, "dbcpu");
            return (Criteria) this;
        }

        public Criteria andDbcpuNotEqualTo(String value) {
            addCriterion("dbcpu <>", value, "dbcpu");
            return (Criteria) this;
        }

        public Criteria andDbcpuGreaterThan(String value) {
            addCriterion("dbcpu >", value, "dbcpu");
            return (Criteria) this;
        }

        public Criteria andDbcpuGreaterThanOrEqualTo(String value) {
            addCriterion("dbcpu >=", value, "dbcpu");
            return (Criteria) this;
        }

        public Criteria andDbcpuLessThan(String value) {
            addCriterion("dbcpu <", value, "dbcpu");
            return (Criteria) this;
        }

        public Criteria andDbcpuLessThanOrEqualTo(String value) {
            addCriterion("dbcpu <=", value, "dbcpu");
            return (Criteria) this;
        }

        public Criteria andDbcpuLike(String value) {
            addCriterion("dbcpu like", value, "dbcpu");
            return (Criteria) this;
        }

        public Criteria andDbcpuNotLike(String value) {
            addCriterion("dbcpu not like", value, "dbcpu");
            return (Criteria) this;
        }

        public Criteria andDbcpuIn(List<String> values) {
            addCriterion("dbcpu in", values, "dbcpu");
            return (Criteria) this;
        }

        public Criteria andDbcpuNotIn(List<String> values) {
            addCriterion("dbcpu not in", values, "dbcpu");
            return (Criteria) this;
        }

        public Criteria andDbcpuBetween(String value1, String value2) {
            addCriterion("dbcpu between", value1, value2, "dbcpu");
            return (Criteria) this;
        }

        public Criteria andDbcpuNotBetween(String value1, String value2) {
            addCriterion("dbcpu not between", value1, value2, "dbcpu");
            return (Criteria) this;
        }

        public Criteria andDbcpunumIsNull() {
            addCriterion("dbcpunum is null");
            return (Criteria) this;
        }

        public Criteria andDbcpunumIsNotNull() {
            addCriterion("dbcpunum is not null");
            return (Criteria) this;
        }

        public Criteria andDbcpunumEqualTo(String value) {
            addCriterion("dbcpunum =", value, "dbcpunum");
            return (Criteria) this;
        }

        public Criteria andDbcpunumNotEqualTo(String value) {
            addCriterion("dbcpunum <>", value, "dbcpunum");
            return (Criteria) this;
        }

        public Criteria andDbcpunumGreaterThan(String value) {
            addCriterion("dbcpunum >", value, "dbcpunum");
            return (Criteria) this;
        }

        public Criteria andDbcpunumGreaterThanOrEqualTo(String value) {
            addCriterion("dbcpunum >=", value, "dbcpunum");
            return (Criteria) this;
        }

        public Criteria andDbcpunumLessThan(String value) {
            addCriterion("dbcpunum <", value, "dbcpunum");
            return (Criteria) this;
        }

        public Criteria andDbcpunumLessThanOrEqualTo(String value) {
            addCriterion("dbcpunum <=", value, "dbcpunum");
            return (Criteria) this;
        }

        public Criteria andDbcpunumLike(String value) {
            addCriterion("dbcpunum like", value, "dbcpunum");
            return (Criteria) this;
        }

        public Criteria andDbcpunumNotLike(String value) {
            addCriterion("dbcpunum not like", value, "dbcpunum");
            return (Criteria) this;
        }

        public Criteria andDbcpunumIn(List<String> values) {
            addCriterion("dbcpunum in", values, "dbcpunum");
            return (Criteria) this;
        }

        public Criteria andDbcpunumNotIn(List<String> values) {
            addCriterion("dbcpunum not in", values, "dbcpunum");
            return (Criteria) this;
        }

        public Criteria andDbcpunumBetween(String value1, String value2) {
            addCriterion("dbcpunum between", value1, value2, "dbcpunum");
            return (Criteria) this;
        }

        public Criteria andDbcpunumNotBetween(String value1, String value2) {
            addCriterion("dbcpunum not between", value1, value2, "dbcpunum");
            return (Criteria) this;
        }

        public Criteria andDbramIsNull() {
            addCriterion("dbram is null");
            return (Criteria) this;
        }

        public Criteria andDbramIsNotNull() {
            addCriterion("dbram is not null");
            return (Criteria) this;
        }

        public Criteria andDbramEqualTo(String value) {
            addCriterion("dbram =", value, "dbram");
            return (Criteria) this;
        }

        public Criteria andDbramNotEqualTo(String value) {
            addCriterion("dbram <>", value, "dbram");
            return (Criteria) this;
        }

        public Criteria andDbramGreaterThan(String value) {
            addCriterion("dbram >", value, "dbram");
            return (Criteria) this;
        }

        public Criteria andDbramGreaterThanOrEqualTo(String value) {
            addCriterion("dbram >=", value, "dbram");
            return (Criteria) this;
        }

        public Criteria andDbramLessThan(String value) {
            addCriterion("dbram <", value, "dbram");
            return (Criteria) this;
        }

        public Criteria andDbramLessThanOrEqualTo(String value) {
            addCriterion("dbram <=", value, "dbram");
            return (Criteria) this;
        }

        public Criteria andDbramLike(String value) {
            addCriterion("dbram like", value, "dbram");
            return (Criteria) this;
        }

        public Criteria andDbramNotLike(String value) {
            addCriterion("dbram not like", value, "dbram");
            return (Criteria) this;
        }

        public Criteria andDbramIn(List<String> values) {
            addCriterion("dbram in", values, "dbram");
            return (Criteria) this;
        }

        public Criteria andDbramNotIn(List<String> values) {
            addCriterion("dbram not in", values, "dbram");
            return (Criteria) this;
        }

        public Criteria andDbramBetween(String value1, String value2) {
            addCriterion("dbram between", value1, value2, "dbram");
            return (Criteria) this;
        }

        public Criteria andDbramNotBetween(String value1, String value2) {
            addCriterion("dbram not between", value1, value2, "dbram");
            return (Criteria) this;
        }

        public Criteria andWasstarusIsNull() {
            addCriterion("wasstarus is null");
            return (Criteria) this;
        }

        public Criteria andWasstarusIsNotNull() {
            addCriterion("wasstarus is not null");
            return (Criteria) this;
        }

        public Criteria andWasstarusEqualTo(String value) {
            addCriterion("wasstarus =", value, "wasstarus");
            return (Criteria) this;
        }

        public Criteria andWasstarusNotEqualTo(String value) {
            addCriterion("wasstarus <>", value, "wasstarus");
            return (Criteria) this;
        }

        public Criteria andWasstarusGreaterThan(String value) {
            addCriterion("wasstarus >", value, "wasstarus");
            return (Criteria) this;
        }

        public Criteria andWasstarusGreaterThanOrEqualTo(String value) {
            addCriterion("wasstarus >=", value, "wasstarus");
            return (Criteria) this;
        }

        public Criteria andWasstarusLessThan(String value) {
            addCriterion("wasstarus <", value, "wasstarus");
            return (Criteria) this;
        }

        public Criteria andWasstarusLessThanOrEqualTo(String value) {
            addCriterion("wasstarus <=", value, "wasstarus");
            return (Criteria) this;
        }

        public Criteria andWasstarusLike(String value) {
            addCriterion("wasstarus like", value, "wasstarus");
            return (Criteria) this;
        }

        public Criteria andWasstarusNotLike(String value) {
            addCriterion("wasstarus not like", value, "wasstarus");
            return (Criteria) this;
        }

        public Criteria andWasstarusIn(List<String> values) {
            addCriterion("wasstarus in", values, "wasstarus");
            return (Criteria) this;
        }

        public Criteria andWasstarusNotIn(List<String> values) {
            addCriterion("wasstarus not in", values, "wasstarus");
            return (Criteria) this;
        }

        public Criteria andWasstarusBetween(String value1, String value2) {
            addCriterion("wasstarus between", value1, value2, "wasstarus");
            return (Criteria) this;
        }

        public Criteria andWasstarusNotBetween(String value1, String value2) {
            addCriterion("wasstarus not between", value1, value2, "wasstarus");
            return (Criteria) this;
        }

        public Criteria andServeraddressIsNull() {
            addCriterion("serveraddress is null");
            return (Criteria) this;
        }

        public Criteria andServeraddressIsNotNull() {
            addCriterion("serveraddress is not null");
            return (Criteria) this;
        }

        public Criteria andServeraddressEqualTo(String value) {
            addCriterion("serveraddress =", value, "serveraddress");
            return (Criteria) this;
        }

        public Criteria andServeraddressNotEqualTo(String value) {
            addCriterion("serveraddress <>", value, "serveraddress");
            return (Criteria) this;
        }

        public Criteria andServeraddressGreaterThan(String value) {
            addCriterion("serveraddress >", value, "serveraddress");
            return (Criteria) this;
        }

        public Criteria andServeraddressGreaterThanOrEqualTo(String value) {
            addCriterion("serveraddress >=", value, "serveraddress");
            return (Criteria) this;
        }

        public Criteria andServeraddressLessThan(String value) {
            addCriterion("serveraddress <", value, "serveraddress");
            return (Criteria) this;
        }

        public Criteria andServeraddressLessThanOrEqualTo(String value) {
            addCriterion("serveraddress <=", value, "serveraddress");
            return (Criteria) this;
        }

        public Criteria andServeraddressLike(String value) {
            addCriterion("serveraddress like", value, "serveraddress");
            return (Criteria) this;
        }

        public Criteria andServeraddressNotLike(String value) {
            addCriterion("serveraddress not like", value, "serveraddress");
            return (Criteria) this;
        }

        public Criteria andServeraddressIn(List<String> values) {
            addCriterion("serveraddress in", values, "serveraddress");
            return (Criteria) this;
        }

        public Criteria andServeraddressNotIn(List<String> values) {
            addCriterion("serveraddress not in", values, "serveraddress");
            return (Criteria) this;
        }

        public Criteria andServeraddressBetween(String value1, String value2) {
            addCriterion("serveraddress between", value1, value2, "serveraddress");
            return (Criteria) this;
        }

        public Criteria andServeraddressNotBetween(String value1, String value2) {
            addCriterion("serveraddress not between", value1, value2, "serveraddress");
            return (Criteria) this;
        }

        public Criteria andTypewidthIsNull() {
            addCriterion("typewidth is null");
            return (Criteria) this;
        }

        public Criteria andTypewidthIsNotNull() {
            addCriterion("typewidth is not null");
            return (Criteria) this;
        }

        public Criteria andTypewidthEqualTo(String value) {
            addCriterion("typewidth =", value, "typewidth");
            return (Criteria) this;
        }

        public Criteria andTypewidthNotEqualTo(String value) {
            addCriterion("typewidth <>", value, "typewidth");
            return (Criteria) this;
        }

        public Criteria andTypewidthGreaterThan(String value) {
            addCriterion("typewidth >", value, "typewidth");
            return (Criteria) this;
        }

        public Criteria andTypewidthGreaterThanOrEqualTo(String value) {
            addCriterion("typewidth >=", value, "typewidth");
            return (Criteria) this;
        }

        public Criteria andTypewidthLessThan(String value) {
            addCriterion("typewidth <", value, "typewidth");
            return (Criteria) this;
        }

        public Criteria andTypewidthLessThanOrEqualTo(String value) {
            addCriterion("typewidth <=", value, "typewidth");
            return (Criteria) this;
        }

        public Criteria andTypewidthLike(String value) {
            addCriterion("typewidth like", value, "typewidth");
            return (Criteria) this;
        }

        public Criteria andTypewidthNotLike(String value) {
            addCriterion("typewidth not like", value, "typewidth");
            return (Criteria) this;
        }

        public Criteria andTypewidthIn(List<String> values) {
            addCriterion("typewidth in", values, "typewidth");
            return (Criteria) this;
        }

        public Criteria andTypewidthNotIn(List<String> values) {
            addCriterion("typewidth not in", values, "typewidth");
            return (Criteria) this;
        }

        public Criteria andTypewidthBetween(String value1, String value2) {
            addCriterion("typewidth between", value1, value2, "typewidth");
            return (Criteria) this;
        }

        public Criteria andTypewidthNotBetween(String value1, String value2) {
            addCriterion("typewidth not between", value1, value2, "typewidth");
            return (Criteria) this;
        }

        public Criteria andAntivirussoftwareIsNull() {
            addCriterion("antivirussoftware is null");
            return (Criteria) this;
        }

        public Criteria andAntivirussoftwareIsNotNull() {
            addCriterion("antivirussoftware is not null");
            return (Criteria) this;
        }

        public Criteria andAntivirussoftwareEqualTo(String value) {
            addCriterion("antivirussoftware =", value, "antivirussoftware");
            return (Criteria) this;
        }

        public Criteria andAntivirussoftwareNotEqualTo(String value) {
            addCriterion("antivirussoftware <>", value, "antivirussoftware");
            return (Criteria) this;
        }

        public Criteria andAntivirussoftwareGreaterThan(String value) {
            addCriterion("antivirussoftware >", value, "antivirussoftware");
            return (Criteria) this;
        }

        public Criteria andAntivirussoftwareGreaterThanOrEqualTo(String value) {
            addCriterion("antivirussoftware >=", value, "antivirussoftware");
            return (Criteria) this;
        }

        public Criteria andAntivirussoftwareLessThan(String value) {
            addCriterion("antivirussoftware <", value, "antivirussoftware");
            return (Criteria) this;
        }

        public Criteria andAntivirussoftwareLessThanOrEqualTo(String value) {
            addCriterion("antivirussoftware <=", value, "antivirussoftware");
            return (Criteria) this;
        }

        public Criteria andAntivirussoftwareLike(String value) {
            addCriterion("antivirussoftware like", value, "antivirussoftware");
            return (Criteria) this;
        }

        public Criteria andAntivirussoftwareNotLike(String value) {
            addCriterion("antivirussoftware not like", value, "antivirussoftware");
            return (Criteria) this;
        }

        public Criteria andAntivirussoftwareIn(List<String> values) {
            addCriterion("antivirussoftware in", values, "antivirussoftware");
            return (Criteria) this;
        }

        public Criteria andAntivirussoftwareNotIn(List<String> values) {
            addCriterion("antivirussoftware not in", values, "antivirussoftware");
            return (Criteria) this;
        }

        public Criteria andAntivirussoftwareBetween(String value1, String value2) {
            addCriterion("antivirussoftware between", value1, value2, "antivirussoftware");
            return (Criteria) this;
        }

        public Criteria andAntivirussoftwareNotBetween(String value1, String value2) {
            addCriterion("antivirussoftware not between", value1, value2, "antivirussoftware");
            return (Criteria) this;
        }

        public Criteria andOnlinenumIsNull() {
            addCriterion("onlinenum is null");
            return (Criteria) this;
        }

        public Criteria andOnlinenumIsNotNull() {
            addCriterion("onlinenum is not null");
            return (Criteria) this;
        }

        public Criteria andOnlinenumEqualTo(String value) {
            addCriterion("onlinenum =", value, "onlinenum");
            return (Criteria) this;
        }

        public Criteria andOnlinenumNotEqualTo(String value) {
            addCriterion("onlinenum <>", value, "onlinenum");
            return (Criteria) this;
        }

        public Criteria andOnlinenumGreaterThan(String value) {
            addCriterion("onlinenum >", value, "onlinenum");
            return (Criteria) this;
        }

        public Criteria andOnlinenumGreaterThanOrEqualTo(String value) {
            addCriterion("onlinenum >=", value, "onlinenum");
            return (Criteria) this;
        }

        public Criteria andOnlinenumLessThan(String value) {
            addCriterion("onlinenum <", value, "onlinenum");
            return (Criteria) this;
        }

        public Criteria andOnlinenumLessThanOrEqualTo(String value) {
            addCriterion("onlinenum <=", value, "onlinenum");
            return (Criteria) this;
        }

        public Criteria andOnlinenumLike(String value) {
            addCriterion("onlinenum like", value, "onlinenum");
            return (Criteria) this;
        }

        public Criteria andOnlinenumNotLike(String value) {
            addCriterion("onlinenum not like", value, "onlinenum");
            return (Criteria) this;
        }

        public Criteria andOnlinenumIn(List<String> values) {
            addCriterion("onlinenum in", values, "onlinenum");
            return (Criteria) this;
        }

        public Criteria andOnlinenumNotIn(List<String> values) {
            addCriterion("onlinenum not in", values, "onlinenum");
            return (Criteria) this;
        }

        public Criteria andOnlinenumBetween(String value1, String value2) {
            addCriterion("onlinenum between", value1, value2, "onlinenum");
            return (Criteria) this;
        }

        public Criteria andOnlinenumNotBetween(String value1, String value2) {
            addCriterion("onlinenum not between", value1, value2, "onlinenum");
            return (Criteria) this;
        }

        public Criteria andClientnumIsNull() {
            addCriterion("clientnum is null");
            return (Criteria) this;
        }

        public Criteria andClientnumIsNotNull() {
            addCriterion("clientnum is not null");
            return (Criteria) this;
        }

        public Criteria andClientnumEqualTo(String value) {
            addCriterion("clientnum =", value, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumNotEqualTo(String value) {
            addCriterion("clientnum <>", value, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumGreaterThan(String value) {
            addCriterion("clientnum >", value, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumGreaterThanOrEqualTo(String value) {
            addCriterion("clientnum >=", value, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumLessThan(String value) {
            addCriterion("clientnum <", value, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumLessThanOrEqualTo(String value) {
            addCriterion("clientnum <=", value, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumLike(String value) {
            addCriterion("clientnum like", value, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumNotLike(String value) {
            addCriterion("clientnum not like", value, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumIn(List<String> values) {
            addCriterion("clientnum in", values, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumNotIn(List<String> values) {
            addCriterion("clientnum not in", values, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumBetween(String value1, String value2) {
            addCriterion("clientnum between", value1, value2, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumNotBetween(String value1, String value2) {
            addCriterion("clientnum not between", value1, value2, "clientnum");
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