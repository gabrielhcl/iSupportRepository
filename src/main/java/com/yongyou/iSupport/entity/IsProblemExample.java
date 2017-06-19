package com.yongyou.iSupport.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IsProblemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IsProblemExample() {
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

        public Criteria andPkProblemIsNull() {
            addCriterion("pk_problem is null");
            return (Criteria) this;
        }

        public Criteria andPkProblemIsNotNull() {
            addCriterion("pk_problem is not null");
            return (Criteria) this;
        }

        public Criteria andPkProblemEqualTo(Integer value) {
            addCriterion("pk_problem =", value, "pkProblem");
            return (Criteria) this;
        }

        public Criteria andPkProblemNotEqualTo(Integer value) {
            addCriterion("pk_problem <>", value, "pkProblem");
            return (Criteria) this;
        }

        public Criteria andPkProblemGreaterThan(Integer value) {
            addCriterion("pk_problem >", value, "pkProblem");
            return (Criteria) this;
        }

        public Criteria andPkProblemGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_problem >=", value, "pkProblem");
            return (Criteria) this;
        }

        public Criteria andPkProblemLessThan(Integer value) {
            addCriterion("pk_problem <", value, "pkProblem");
            return (Criteria) this;
        }

        public Criteria andPkProblemLessThanOrEqualTo(Integer value) {
            addCriterion("pk_problem <=", value, "pkProblem");
            return (Criteria) this;
        }

        public Criteria andPkProblemIn(List<Integer> values) {
            addCriterion("pk_problem in", values, "pkProblem");
            return (Criteria) this;
        }

        public Criteria andPkProblemNotIn(List<Integer> values) {
            addCriterion("pk_problem not in", values, "pkProblem");
            return (Criteria) this;
        }

        public Criteria andPkProblemBetween(Integer value1, Integer value2) {
            addCriterion("pk_problem between", value1, value2, "pkProblem");
            return (Criteria) this;
        }

        public Criteria andPkProblemNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_problem not between", value1, value2, "pkProblem");
            return (Criteria) this;
        }

        public Criteria andProblemcodeIsNull() {
            addCriterion("problemcode is null");
            return (Criteria) this;
        }

        public Criteria andProblemcodeIsNotNull() {
            addCriterion("problemcode is not null");
            return (Criteria) this;
        }

        public Criteria andProblemcodeEqualTo(String value) {
            addCriterion("problemcode =", value, "problemcode");
            return (Criteria) this;
        }

        public Criteria andProblemcodeNotEqualTo(String value) {
            addCriterion("problemcode <>", value, "problemcode");
            return (Criteria) this;
        }

        public Criteria andProblemcodeGreaterThan(String value) {
            addCriterion("problemcode >", value, "problemcode");
            return (Criteria) this;
        }

        public Criteria andProblemcodeGreaterThanOrEqualTo(String value) {
            addCriterion("problemcode >=", value, "problemcode");
            return (Criteria) this;
        }

        public Criteria andProblemcodeLessThan(String value) {
            addCriterion("problemcode <", value, "problemcode");
            return (Criteria) this;
        }

        public Criteria andProblemcodeLessThanOrEqualTo(String value) {
            addCriterion("problemcode <=", value, "problemcode");
            return (Criteria) this;
        }

        public Criteria andProblemcodeLike(String value) {
            addCriterion("problemcode like", value, "problemcode");
            return (Criteria) this;
        }

        public Criteria andProblemcodeNotLike(String value) {
            addCriterion("problemcode not like", value, "problemcode");
            return (Criteria) this;
        }

        public Criteria andProblemcodeIn(List<String> values) {
            addCriterion("problemcode in", values, "problemcode");
            return (Criteria) this;
        }

        public Criteria andProblemcodeNotIn(List<String> values) {
            addCriterion("problemcode not in", values, "problemcode");
            return (Criteria) this;
        }

        public Criteria andProblemcodeBetween(String value1, String value2) {
            addCriterion("problemcode between", value1, value2, "problemcode");
            return (Criteria) this;
        }

        public Criteria andProblemcodeNotBetween(String value1, String value2) {
            addCriterion("problemcode not between", value1, value2, "problemcode");
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

        public Criteria andCompanyrelatedIsNull() {
            addCriterion("companyrelated is null");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedIsNotNull() {
            addCriterion("companyrelated is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedEqualTo(String value) {
            addCriterion("companyrelated =", value, "companyrelated");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedNotEqualTo(String value) {
            addCriterion("companyrelated <>", value, "companyrelated");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedGreaterThan(String value) {
            addCriterion("companyrelated >", value, "companyrelated");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedGreaterThanOrEqualTo(String value) {
            addCriterion("companyrelated >=", value, "companyrelated");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedLessThan(String value) {
            addCriterion("companyrelated <", value, "companyrelated");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedLessThanOrEqualTo(String value) {
            addCriterion("companyrelated <=", value, "companyrelated");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedLike(String value) {
            addCriterion("companyrelated like", value, "companyrelated");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedNotLike(String value) {
            addCriterion("companyrelated not like", value, "companyrelated");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedIn(List<String> values) {
            addCriterion("companyrelated in", values, "companyrelated");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedNotIn(List<String> values) {
            addCriterion("companyrelated not in", values, "companyrelated");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedBetween(String value1, String value2) {
            addCriterion("companyrelated between", value1, value2, "companyrelated");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedNotBetween(String value1, String value2) {
            addCriterion("companyrelated not between", value1, value2, "companyrelated");
            return (Criteria) this;
        }

        public Criteria andProductrelatedIsNull() {
            addCriterion("productrelated is null");
            return (Criteria) this;
        }

        public Criteria andProductrelatedIsNotNull() {
            addCriterion("productrelated is not null");
            return (Criteria) this;
        }

        public Criteria andProductrelatedEqualTo(String value) {
            addCriterion("productrelated =", value, "productrelated");
            return (Criteria) this;
        }

        public Criteria andProductrelatedNotEqualTo(String value) {
            addCriterion("productrelated <>", value, "productrelated");
            return (Criteria) this;
        }

        public Criteria andProductrelatedGreaterThan(String value) {
            addCriterion("productrelated >", value, "productrelated");
            return (Criteria) this;
        }

        public Criteria andProductrelatedGreaterThanOrEqualTo(String value) {
            addCriterion("productrelated >=", value, "productrelated");
            return (Criteria) this;
        }

        public Criteria andProductrelatedLessThan(String value) {
            addCriterion("productrelated <", value, "productrelated");
            return (Criteria) this;
        }

        public Criteria andProductrelatedLessThanOrEqualTo(String value) {
            addCriterion("productrelated <=", value, "productrelated");
            return (Criteria) this;
        }

        public Criteria andProductrelatedLike(String value) {
            addCriterion("productrelated like", value, "productrelated");
            return (Criteria) this;
        }

        public Criteria andProductrelatedNotLike(String value) {
            addCriterion("productrelated not like", value, "productrelated");
            return (Criteria) this;
        }

        public Criteria andProductrelatedIn(List<String> values) {
            addCriterion("productrelated in", values, "productrelated");
            return (Criteria) this;
        }

        public Criteria andProductrelatedNotIn(List<String> values) {
            addCriterion("productrelated not in", values, "productrelated");
            return (Criteria) this;
        }

        public Criteria andProductrelatedBetween(String value1, String value2) {
            addCriterion("productrelated between", value1, value2, "productrelated");
            return (Criteria) this;
        }

        public Criteria andProductrelatedNotBetween(String value1, String value2) {
            addCriterion("productrelated not between", value1, value2, "productrelated");
            return (Criteria) this;
        }

        public Criteria andModulerelatedIsNull() {
            addCriterion("modulerelated is null");
            return (Criteria) this;
        }

        public Criteria andModulerelatedIsNotNull() {
            addCriterion("modulerelated is not null");
            return (Criteria) this;
        }

        public Criteria andModulerelatedEqualTo(String value) {
            addCriterion("modulerelated =", value, "modulerelated");
            return (Criteria) this;
        }

        public Criteria andModulerelatedNotEqualTo(String value) {
            addCriterion("modulerelated <>", value, "modulerelated");
            return (Criteria) this;
        }

        public Criteria andModulerelatedGreaterThan(String value) {
            addCriterion("modulerelated >", value, "modulerelated");
            return (Criteria) this;
        }

        public Criteria andModulerelatedGreaterThanOrEqualTo(String value) {
            addCriterion("modulerelated >=", value, "modulerelated");
            return (Criteria) this;
        }

        public Criteria andModulerelatedLessThan(String value) {
            addCriterion("modulerelated <", value, "modulerelated");
            return (Criteria) this;
        }

        public Criteria andModulerelatedLessThanOrEqualTo(String value) {
            addCriterion("modulerelated <=", value, "modulerelated");
            return (Criteria) this;
        }

        public Criteria andModulerelatedLike(String value) {
            addCriterion("modulerelated like", value, "modulerelated");
            return (Criteria) this;
        }

        public Criteria andModulerelatedNotLike(String value) {
            addCriterion("modulerelated not like", value, "modulerelated");
            return (Criteria) this;
        }

        public Criteria andModulerelatedIn(List<String> values) {
            addCriterion("modulerelated in", values, "modulerelated");
            return (Criteria) this;
        }

        public Criteria andModulerelatedNotIn(List<String> values) {
            addCriterion("modulerelated not in", values, "modulerelated");
            return (Criteria) this;
        }

        public Criteria andModulerelatedBetween(String value1, String value2) {
            addCriterion("modulerelated between", value1, value2, "modulerelated");
            return (Criteria) this;
        }

        public Criteria andModulerelatedNotBetween(String value1, String value2) {
            addCriterion("modulerelated not between", value1, value2, "modulerelated");
            return (Criteria) this;
        }

        public Criteria andProblempriorityIsNull() {
            addCriterion("problempriority is null");
            return (Criteria) this;
        }

        public Criteria andProblempriorityIsNotNull() {
            addCriterion("problempriority is not null");
            return (Criteria) this;
        }

        public Criteria andProblempriorityEqualTo(String value) {
            addCriterion("problempriority =", value, "problempriority");
            return (Criteria) this;
        }

        public Criteria andProblempriorityNotEqualTo(String value) {
            addCriterion("problempriority <>", value, "problempriority");
            return (Criteria) this;
        }

        public Criteria andProblempriorityGreaterThan(String value) {
            addCriterion("problempriority >", value, "problempriority");
            return (Criteria) this;
        }

        public Criteria andProblempriorityGreaterThanOrEqualTo(String value) {
            addCriterion("problempriority >=", value, "problempriority");
            return (Criteria) this;
        }

        public Criteria andProblempriorityLessThan(String value) {
            addCriterion("problempriority <", value, "problempriority");
            return (Criteria) this;
        }

        public Criteria andProblempriorityLessThanOrEqualTo(String value) {
            addCriterion("problempriority <=", value, "problempriority");
            return (Criteria) this;
        }

        public Criteria andProblempriorityLike(String value) {
            addCriterion("problempriority like", value, "problempriority");
            return (Criteria) this;
        }

        public Criteria andProblempriorityNotLike(String value) {
            addCriterion("problempriority not like", value, "problempriority");
            return (Criteria) this;
        }

        public Criteria andProblempriorityIn(List<String> values) {
            addCriterion("problempriority in", values, "problempriority");
            return (Criteria) this;
        }

        public Criteria andProblempriorityNotIn(List<String> values) {
            addCriterion("problempriority not in", values, "problempriority");
            return (Criteria) this;
        }

        public Criteria andProblempriorityBetween(String value1, String value2) {
            addCriterion("problempriority between", value1, value2, "problempriority");
            return (Criteria) this;
        }

        public Criteria andProblempriorityNotBetween(String value1, String value2) {
            addCriterion("problempriority not between", value1, value2, "problempriority");
            return (Criteria) this;
        }

        public Criteria andProblemtypeIsNull() {
            addCriterion("problemtype is null");
            return (Criteria) this;
        }

        public Criteria andProblemtypeIsNotNull() {
            addCriterion("problemtype is not null");
            return (Criteria) this;
        }

        public Criteria andProblemtypeEqualTo(String value) {
            addCriterion("problemtype =", value, "problemtype");
            return (Criteria) this;
        }

        public Criteria andProblemtypeNotEqualTo(String value) {
            addCriterion("problemtype <>", value, "problemtype");
            return (Criteria) this;
        }

        public Criteria andProblemtypeGreaterThan(String value) {
            addCriterion("problemtype >", value, "problemtype");
            return (Criteria) this;
        }

        public Criteria andProblemtypeGreaterThanOrEqualTo(String value) {
            addCriterion("problemtype >=", value, "problemtype");
            return (Criteria) this;
        }

        public Criteria andProblemtypeLessThan(String value) {
            addCriterion("problemtype <", value, "problemtype");
            return (Criteria) this;
        }

        public Criteria andProblemtypeLessThanOrEqualTo(String value) {
            addCriterion("problemtype <=", value, "problemtype");
            return (Criteria) this;
        }

        public Criteria andProblemtypeLike(String value) {
            addCriterion("problemtype like", value, "problemtype");
            return (Criteria) this;
        }

        public Criteria andProblemtypeNotLike(String value) {
            addCriterion("problemtype not like", value, "problemtype");
            return (Criteria) this;
        }

        public Criteria andProblemtypeIn(List<String> values) {
            addCriterion("problemtype in", values, "problemtype");
            return (Criteria) this;
        }

        public Criteria andProblemtypeNotIn(List<String> values) {
            addCriterion("problemtype not in", values, "problemtype");
            return (Criteria) this;
        }

        public Criteria andProblemtypeBetween(String value1, String value2) {
            addCriterion("problemtype between", value1, value2, "problemtype");
            return (Criteria) this;
        }

        public Criteria andProblemtypeNotBetween(String value1, String value2) {
            addCriterion("problemtype not between", value1, value2, "problemtype");
            return (Criteria) this;
        }

        public Criteria andSubmitterIsNull() {
            addCriterion("submitter is null");
            return (Criteria) this;
        }

        public Criteria andSubmitterIsNotNull() {
            addCriterion("submitter is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitterEqualTo(String value) {
            addCriterion("submitter =", value, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterNotEqualTo(String value) {
            addCriterion("submitter <>", value, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterGreaterThan(String value) {
            addCriterion("submitter >", value, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterGreaterThanOrEqualTo(String value) {
            addCriterion("submitter >=", value, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterLessThan(String value) {
            addCriterion("submitter <", value, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterLessThanOrEqualTo(String value) {
            addCriterion("submitter <=", value, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterLike(String value) {
            addCriterion("submitter like", value, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterNotLike(String value) {
            addCriterion("submitter not like", value, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterIn(List<String> values) {
            addCriterion("submitter in", values, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterNotIn(List<String> values) {
            addCriterion("submitter not in", values, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterBetween(String value1, String value2) {
            addCriterion("submitter between", value1, value2, "submitter");
            return (Criteria) this;
        }

        public Criteria andSubmitterNotBetween(String value1, String value2) {
            addCriterion("submitter not between", value1, value2, "submitter");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andSubmitdateIsNull() {
            addCriterion("submitdate is null");
            return (Criteria) this;
        }

        public Criteria andSubmitdateIsNotNull() {
            addCriterion("submitdate is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitdateEqualTo(Date value) {
            addCriterion("submitdate =", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateNotEqualTo(Date value) {
            addCriterion("submitdate <>", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateGreaterThan(Date value) {
            addCriterion("submitdate >", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateGreaterThanOrEqualTo(Date value) {
            addCriterion("submitdate >=", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateLessThan(Date value) {
            addCriterion("submitdate <", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateLessThanOrEqualTo(Date value) {
            addCriterion("submitdate <=", value, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateIn(List<Date> values) {
            addCriterion("submitdate in", values, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateNotIn(List<Date> values) {
            addCriterion("submitdate not in", values, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateBetween(Date value1, Date value2) {
            addCriterion("submitdate between", value1, value2, "submitdate");
            return (Criteria) this;
        }

        public Criteria andSubmitdateNotBetween(Date value1, Date value2) {
            addCriterion("submitdate not between", value1, value2, "submitdate");
            return (Criteria) this;
        }

        public Criteria andOfficerinchargeIsNull() {
            addCriterion("officerincharge is null");
            return (Criteria) this;
        }

        public Criteria andOfficerinchargeIsNotNull() {
            addCriterion("officerincharge is not null");
            return (Criteria) this;
        }

        public Criteria andOfficerinchargeEqualTo(String value) {
            addCriterion("officerincharge =", value, "officerincharge");
            return (Criteria) this;
        }

        public Criteria andOfficerinchargeNotEqualTo(String value) {
            addCriterion("officerincharge <>", value, "officerincharge");
            return (Criteria) this;
        }

        public Criteria andOfficerinchargeGreaterThan(String value) {
            addCriterion("officerincharge >", value, "officerincharge");
            return (Criteria) this;
        }

        public Criteria andOfficerinchargeGreaterThanOrEqualTo(String value) {
            addCriterion("officerincharge >=", value, "officerincharge");
            return (Criteria) this;
        }

        public Criteria andOfficerinchargeLessThan(String value) {
            addCriterion("officerincharge <", value, "officerincharge");
            return (Criteria) this;
        }

        public Criteria andOfficerinchargeLessThanOrEqualTo(String value) {
            addCriterion("officerincharge <=", value, "officerincharge");
            return (Criteria) this;
        }

        public Criteria andOfficerinchargeLike(String value) {
            addCriterion("officerincharge like", value, "officerincharge");
            return (Criteria) this;
        }

        public Criteria andOfficerinchargeNotLike(String value) {
            addCriterion("officerincharge not like", value, "officerincharge");
            return (Criteria) this;
        }

        public Criteria andOfficerinchargeIn(List<String> values) {
            addCriterion("officerincharge in", values, "officerincharge");
            return (Criteria) this;
        }

        public Criteria andOfficerinchargeNotIn(List<String> values) {
            addCriterion("officerincharge not in", values, "officerincharge");
            return (Criteria) this;
        }

        public Criteria andOfficerinchargeBetween(String value1, String value2) {
            addCriterion("officerincharge between", value1, value2, "officerincharge");
            return (Criteria) this;
        }

        public Criteria andOfficerinchargeNotBetween(String value1, String value2) {
            addCriterion("officerincharge not between", value1, value2, "officerincharge");
            return (Criteria) this;
        }

        public Criteria andProblemstatusIsNull() {
            addCriterion("problemstatus is null");
            return (Criteria) this;
        }

        public Criteria andProblemstatusIsNotNull() {
            addCriterion("problemstatus is not null");
            return (Criteria) this;
        }

        public Criteria andProblemstatusEqualTo(String value) {
            addCriterion("problemstatus =", value, "problemstatus");
            return (Criteria) this;
        }

        public Criteria andProblemstatusNotEqualTo(String value) {
            addCriterion("problemstatus <>", value, "problemstatus");
            return (Criteria) this;
        }

        public Criteria andProblemstatusGreaterThan(String value) {
            addCriterion("problemstatus >", value, "problemstatus");
            return (Criteria) this;
        }

        public Criteria andProblemstatusGreaterThanOrEqualTo(String value) {
            addCriterion("problemstatus >=", value, "problemstatus");
            return (Criteria) this;
        }

        public Criteria andProblemstatusLessThan(String value) {
            addCriterion("problemstatus <", value, "problemstatus");
            return (Criteria) this;
        }

        public Criteria andProblemstatusLessThanOrEqualTo(String value) {
            addCriterion("problemstatus <=", value, "problemstatus");
            return (Criteria) this;
        }

        public Criteria andProblemstatusLike(String value) {
            addCriterion("problemstatus like", value, "problemstatus");
            return (Criteria) this;
        }

        public Criteria andProblemstatusNotLike(String value) {
            addCriterion("problemstatus not like", value, "problemstatus");
            return (Criteria) this;
        }

        public Criteria andProblemstatusIn(List<String> values) {
            addCriterion("problemstatus in", values, "problemstatus");
            return (Criteria) this;
        }

        public Criteria andProblemstatusNotIn(List<String> values) {
            addCriterion("problemstatus not in", values, "problemstatus");
            return (Criteria) this;
        }

        public Criteria andProblemstatusBetween(String value1, String value2) {
            addCriterion("problemstatus between", value1, value2, "problemstatus");
            return (Criteria) this;
        }

        public Criteria andProblemstatusNotBetween(String value1, String value2) {
            addCriterion("problemstatus not between", value1, value2, "problemstatus");
            return (Criteria) this;
        }

        public Criteria andFinishdateIsNull() {
            addCriterion("finishdate is null");
            return (Criteria) this;
        }

        public Criteria andFinishdateIsNotNull() {
            addCriterion("finishdate is not null");
            return (Criteria) this;
        }

        public Criteria andFinishdateEqualTo(Date value) {
            addCriterion("finishdate =", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateNotEqualTo(Date value) {
            addCriterion("finishdate <>", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateGreaterThan(Date value) {
            addCriterion("finishdate >", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateGreaterThanOrEqualTo(Date value) {
            addCriterion("finishdate >=", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateLessThan(Date value) {
            addCriterion("finishdate <", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateLessThanOrEqualTo(Date value) {
            addCriterion("finishdate <=", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateIn(List<Date> values) {
            addCriterion("finishdate in", values, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateNotIn(List<Date> values) {
            addCriterion("finishdate not in", values, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateBetween(Date value1, Date value2) {
            addCriterion("finishdate between", value1, value2, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateNotBetween(Date value1, Date value2) {
            addCriterion("finishdate not between", value1, value2, "finishdate");
            return (Criteria) this;
        }

        public Criteria andProcessingtimeIsNull() {
            addCriterion("processingtime is null");
            return (Criteria) this;
        }

        public Criteria andProcessingtimeIsNotNull() {
            addCriterion("processingtime is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingtimeEqualTo(String value) {
            addCriterion("processingtime =", value, "processingtime");
            return (Criteria) this;
        }

        public Criteria andProcessingtimeNotEqualTo(String value) {
            addCriterion("processingtime <>", value, "processingtime");
            return (Criteria) this;
        }

        public Criteria andProcessingtimeGreaterThan(String value) {
            addCriterion("processingtime >", value, "processingtime");
            return (Criteria) this;
        }

        public Criteria andProcessingtimeGreaterThanOrEqualTo(String value) {
            addCriterion("processingtime >=", value, "processingtime");
            return (Criteria) this;
        }

        public Criteria andProcessingtimeLessThan(String value) {
            addCriterion("processingtime <", value, "processingtime");
            return (Criteria) this;
        }

        public Criteria andProcessingtimeLessThanOrEqualTo(String value) {
            addCriterion("processingtime <=", value, "processingtime");
            return (Criteria) this;
        }

        public Criteria andProcessingtimeLike(String value) {
            addCriterion("processingtime like", value, "processingtime");
            return (Criteria) this;
        }

        public Criteria andProcessingtimeNotLike(String value) {
            addCriterion("processingtime not like", value, "processingtime");
            return (Criteria) this;
        }

        public Criteria andProcessingtimeIn(List<String> values) {
            addCriterion("processingtime in", values, "processingtime");
            return (Criteria) this;
        }

        public Criteria andProcessingtimeNotIn(List<String> values) {
            addCriterion("processingtime not in", values, "processingtime");
            return (Criteria) this;
        }

        public Criteria andProcessingtimeBetween(String value1, String value2) {
            addCriterion("processingtime between", value1, value2, "processingtime");
            return (Criteria) this;
        }

        public Criteria andProcessingtimeNotBetween(String value1, String value2) {
            addCriterion("processingtime not between", value1, value2, "processingtime");
            return (Criteria) this;
        }

        public Criteria andSupportmethodIsNull() {
            addCriterion("supportmethod is null");
            return (Criteria) this;
        }

        public Criteria andSupportmethodIsNotNull() {
            addCriterion("supportmethod is not null");
            return (Criteria) this;
        }

        public Criteria andSupportmethodEqualTo(String value) {
            addCriterion("supportmethod =", value, "supportmethod");
            return (Criteria) this;
        }

        public Criteria andSupportmethodNotEqualTo(String value) {
            addCriterion("supportmethod <>", value, "supportmethod");
            return (Criteria) this;
        }

        public Criteria andSupportmethodGreaterThan(String value) {
            addCriterion("supportmethod >", value, "supportmethod");
            return (Criteria) this;
        }

        public Criteria andSupportmethodGreaterThanOrEqualTo(String value) {
            addCriterion("supportmethod >=", value, "supportmethod");
            return (Criteria) this;
        }

        public Criteria andSupportmethodLessThan(String value) {
            addCriterion("supportmethod <", value, "supportmethod");
            return (Criteria) this;
        }

        public Criteria andSupportmethodLessThanOrEqualTo(String value) {
            addCriterion("supportmethod <=", value, "supportmethod");
            return (Criteria) this;
        }

        public Criteria andSupportmethodLike(String value) {
            addCriterion("supportmethod like", value, "supportmethod");
            return (Criteria) this;
        }

        public Criteria andSupportmethodNotLike(String value) {
            addCriterion("supportmethod not like", value, "supportmethod");
            return (Criteria) this;
        }

        public Criteria andSupportmethodIn(List<String> values) {
            addCriterion("supportmethod in", values, "supportmethod");
            return (Criteria) this;
        }

        public Criteria andSupportmethodNotIn(List<String> values) {
            addCriterion("supportmethod not in", values, "supportmethod");
            return (Criteria) this;
        }

        public Criteria andSupportmethodBetween(String value1, String value2) {
            addCriterion("supportmethod between", value1, value2, "supportmethod");
            return (Criteria) this;
        }

        public Criteria andSupportmethodNotBetween(String value1, String value2) {
            addCriterion("supportmethod not between", value1, value2, "supportmethod");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionIsNull() {
            addCriterion("problemdescription is null");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionIsNotNull() {
            addCriterion("problemdescription is not null");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionEqualTo(String value) {
            addCriterion("problemdescription =", value, "problemdescription");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionNotEqualTo(String value) {
            addCriterion("problemdescription <>", value, "problemdescription");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionGreaterThan(String value) {
            addCriterion("problemdescription >", value, "problemdescription");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("problemdescription >=", value, "problemdescription");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionLessThan(String value) {
            addCriterion("problemdescription <", value, "problemdescription");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionLessThanOrEqualTo(String value) {
            addCriterion("problemdescription <=", value, "problemdescription");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionLike(String value) {
            addCriterion("problemdescription like", value, "problemdescription");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionNotLike(String value) {
            addCriterion("problemdescription not like", value, "problemdescription");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionIn(List<String> values) {
            addCriterion("problemdescription in", values, "problemdescription");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionNotIn(List<String> values) {
            addCriterion("problemdescription not in", values, "problemdescription");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionBetween(String value1, String value2) {
            addCriterion("problemdescription between", value1, value2, "problemdescription");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionNotBetween(String value1, String value2) {
            addCriterion("problemdescription not between", value1, value2, "problemdescription");
            return (Criteria) this;
        }

        public Criteria andDetaileddescriptionIsNull() {
            addCriterion("detaileddescription is null");
            return (Criteria) this;
        }

        public Criteria andDetaileddescriptionIsNotNull() {
            addCriterion("detaileddescription is not null");
            return (Criteria) this;
        }

        public Criteria andDetaileddescriptionEqualTo(String value) {
            addCriterion("detaileddescription =", value, "detaileddescription");
            return (Criteria) this;
        }

        public Criteria andDetaileddescriptionNotEqualTo(String value) {
            addCriterion("detaileddescription <>", value, "detaileddescription");
            return (Criteria) this;
        }

        public Criteria andDetaileddescriptionGreaterThan(String value) {
            addCriterion("detaileddescription >", value, "detaileddescription");
            return (Criteria) this;
        }

        public Criteria andDetaileddescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("detaileddescription >=", value, "detaileddescription");
            return (Criteria) this;
        }

        public Criteria andDetaileddescriptionLessThan(String value) {
            addCriterion("detaileddescription <", value, "detaileddescription");
            return (Criteria) this;
        }

        public Criteria andDetaileddescriptionLessThanOrEqualTo(String value) {
            addCriterion("detaileddescription <=", value, "detaileddescription");
            return (Criteria) this;
        }

        public Criteria andDetaileddescriptionLike(String value) {
            addCriterion("detaileddescription like", value, "detaileddescription");
            return (Criteria) this;
        }

        public Criteria andDetaileddescriptionNotLike(String value) {
            addCriterion("detaileddescription not like", value, "detaileddescription");
            return (Criteria) this;
        }

        public Criteria andDetaileddescriptionIn(List<String> values) {
            addCriterion("detaileddescription in", values, "detaileddescription");
            return (Criteria) this;
        }

        public Criteria andDetaileddescriptionNotIn(List<String> values) {
            addCriterion("detaileddescription not in", values, "detaileddescription");
            return (Criteria) this;
        }

        public Criteria andDetaileddescriptionBetween(String value1, String value2) {
            addCriterion("detaileddescription between", value1, value2, "detaileddescription");
            return (Criteria) this;
        }

        public Criteria andDetaileddescriptionNotBetween(String value1, String value2) {
            addCriterion("detaileddescription not between", value1, value2, "detaileddescription");
            return (Criteria) this;
        }

        public Criteria andSolutionIsNull() {
            addCriterion("solution is null");
            return (Criteria) this;
        }

        public Criteria andSolutionIsNotNull() {
            addCriterion("solution is not null");
            return (Criteria) this;
        }

        public Criteria andSolutionEqualTo(String value) {
            addCriterion("solution =", value, "solution");
            return (Criteria) this;
        }

        public Criteria andSolutionNotEqualTo(String value) {
            addCriterion("solution <>", value, "solution");
            return (Criteria) this;
        }

        public Criteria andSolutionGreaterThan(String value) {
            addCriterion("solution >", value, "solution");
            return (Criteria) this;
        }

        public Criteria andSolutionGreaterThanOrEqualTo(String value) {
            addCriterion("solution >=", value, "solution");
            return (Criteria) this;
        }

        public Criteria andSolutionLessThan(String value) {
            addCriterion("solution <", value, "solution");
            return (Criteria) this;
        }

        public Criteria andSolutionLessThanOrEqualTo(String value) {
            addCriterion("solution <=", value, "solution");
            return (Criteria) this;
        }

        public Criteria andSolutionLike(String value) {
            addCriterion("solution like", value, "solution");
            return (Criteria) this;
        }

        public Criteria andSolutionNotLike(String value) {
            addCriterion("solution not like", value, "solution");
            return (Criteria) this;
        }

        public Criteria andSolutionIn(List<String> values) {
            addCriterion("solution in", values, "solution");
            return (Criteria) this;
        }

        public Criteria andSolutionNotIn(List<String> values) {
            addCriterion("solution not in", values, "solution");
            return (Criteria) this;
        }

        public Criteria andSolutionBetween(String value1, String value2) {
            addCriterion("solution between", value1, value2, "solution");
            return (Criteria) this;
        }

        public Criteria andSolutionNotBetween(String value1, String value2) {
            addCriterion("solution not between", value1, value2, "solution");
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

        public Criteria andAccountnameIsNull() {
            addCriterion("accountname is null");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNotNull() {
            addCriterion("accountname is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnameEqualTo(String value) {
            addCriterion("accountname =", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotEqualTo(String value) {
            addCriterion("accountname <>", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThan(String value) {
            addCriterion("accountname >", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("accountname >=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThan(String value) {
            addCriterion("accountname <", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThanOrEqualTo(String value) {
            addCriterion("accountname <=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLike(String value) {
            addCriterion("accountname like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotLike(String value) {
            addCriterion("accountname not like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameIn(List<String> values) {
            addCriterion("accountname in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotIn(List<String> values) {
            addCriterion("accountname not in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameBetween(String value1, String value2) {
            addCriterion("accountname between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotBetween(String value1, String value2) {
            addCriterion("accountname not between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andNodenameIsNull() {
            addCriterion("nodename is null");
            return (Criteria) this;
        }

        public Criteria andNodenameIsNotNull() {
            addCriterion("nodename is not null");
            return (Criteria) this;
        }

        public Criteria andNodenameEqualTo(String value) {
            addCriterion("nodename =", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameNotEqualTo(String value) {
            addCriterion("nodename <>", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameGreaterThan(String value) {
            addCriterion("nodename >", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameGreaterThanOrEqualTo(String value) {
            addCriterion("nodename >=", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameLessThan(String value) {
            addCriterion("nodename <", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameLessThanOrEqualTo(String value) {
            addCriterion("nodename <=", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameLike(String value) {
            addCriterion("nodename like", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameNotLike(String value) {
            addCriterion("nodename not like", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameIn(List<String> values) {
            addCriterion("nodename in", values, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameNotIn(List<String> values) {
            addCriterion("nodename not in", values, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameBetween(String value1, String value2) {
            addCriterion("nodename between", value1, value2, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameNotBetween(String value1, String value2) {
            addCriterion("nodename not between", value1, value2, "nodename");
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