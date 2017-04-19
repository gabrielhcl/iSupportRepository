package com.yongyou.iSupport.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IsSDweekplanePExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IsSDweekplanePExample() {
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

        public Criteria andPkSDweekplanePIsNull() {
            addCriterion("pk_s_dweekplane_p is null");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplanePIsNotNull() {
            addCriterion("pk_s_dweekplane_p is not null");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplanePEqualTo(Integer value) {
            addCriterion("pk_s_dweekplane_p =", value, "pkSDweekplaneP");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplanePNotEqualTo(Integer value) {
            addCriterion("pk_s_dweekplane_p <>", value, "pkSDweekplaneP");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplanePGreaterThan(Integer value) {
            addCriterion("pk_s_dweekplane_p >", value, "pkSDweekplaneP");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplanePGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_s_dweekplane_p >=", value, "pkSDweekplaneP");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplanePLessThan(Integer value) {
            addCriterion("pk_s_dweekplane_p <", value, "pkSDweekplaneP");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplanePLessThanOrEqualTo(Integer value) {
            addCriterion("pk_s_dweekplane_p <=", value, "pkSDweekplaneP");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplanePIn(List<Integer> values) {
            addCriterion("pk_s_dweekplane_p in", values, "pkSDweekplaneP");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplanePNotIn(List<Integer> values) {
            addCriterion("pk_s_dweekplane_p not in", values, "pkSDweekplaneP");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplanePBetween(Integer value1, Integer value2) {
            addCriterion("pk_s_dweekplane_p between", value1, value2, "pkSDweekplaneP");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplanePNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_s_dweekplane_p not between", value1, value2, "pkSDweekplaneP");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneTIsNull() {
            addCriterion("pk_s_dweekplane_t is null");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneTIsNotNull() {
            addCriterion("pk_s_dweekplane_t is not null");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneTEqualTo(Integer value) {
            addCriterion("pk_s_dweekplane_t =", value, "pkSDweekplaneT");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneTNotEqualTo(Integer value) {
            addCriterion("pk_s_dweekplane_t <>", value, "pkSDweekplaneT");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneTGreaterThan(Integer value) {
            addCriterion("pk_s_dweekplane_t >", value, "pkSDweekplaneT");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneTGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_s_dweekplane_t >=", value, "pkSDweekplaneT");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneTLessThan(Integer value) {
            addCriterion("pk_s_dweekplane_t <", value, "pkSDweekplaneT");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneTLessThanOrEqualTo(Integer value) {
            addCriterion("pk_s_dweekplane_t <=", value, "pkSDweekplaneT");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneTIn(List<Integer> values) {
            addCriterion("pk_s_dweekplane_t in", values, "pkSDweekplaneT");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneTNotIn(List<Integer> values) {
            addCriterion("pk_s_dweekplane_t not in", values, "pkSDweekplaneT");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneTBetween(Integer value1, Integer value2) {
            addCriterion("pk_s_dweekplane_t between", value1, value2, "pkSDweekplaneT");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneTNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_s_dweekplane_t not between", value1, value2, "pkSDweekplaneT");
            return (Criteria) this;
        }

        public Criteria andProblemIsNull() {
            addCriterion("problem is null");
            return (Criteria) this;
        }

        public Criteria andProblemIsNotNull() {
            addCriterion("problem is not null");
            return (Criteria) this;
        }

        public Criteria andProblemEqualTo(String value) {
            addCriterion("problem =", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemNotEqualTo(String value) {
            addCriterion("problem <>", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemGreaterThan(String value) {
            addCriterion("problem >", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemGreaterThanOrEqualTo(String value) {
            addCriterion("problem >=", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemLessThan(String value) {
            addCriterion("problem <", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemLessThanOrEqualTo(String value) {
            addCriterion("problem <=", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemLike(String value) {
            addCriterion("problem like", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemNotLike(String value) {
            addCriterion("problem not like", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemIn(List<String> values) {
            addCriterion("problem in", values, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemNotIn(List<String> values) {
            addCriterion("problem not in", values, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemBetween(String value1, String value2) {
            addCriterion("problem between", value1, value2, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemNotBetween(String value1, String value2) {
            addCriterion("problem not between", value1, value2, "problem");
            return (Criteria) this;
        }

        public Criteria andNeedhelpIsNull() {
            addCriterion("needhelp is null");
            return (Criteria) this;
        }

        public Criteria andNeedhelpIsNotNull() {
            addCriterion("needhelp is not null");
            return (Criteria) this;
        }

        public Criteria andNeedhelpEqualTo(String value) {
            addCriterion("needhelp =", value, "needhelp");
            return (Criteria) this;
        }

        public Criteria andNeedhelpNotEqualTo(String value) {
            addCriterion("needhelp <>", value, "needhelp");
            return (Criteria) this;
        }

        public Criteria andNeedhelpGreaterThan(String value) {
            addCriterion("needhelp >", value, "needhelp");
            return (Criteria) this;
        }

        public Criteria andNeedhelpGreaterThanOrEqualTo(String value) {
            addCriterion("needhelp >=", value, "needhelp");
            return (Criteria) this;
        }

        public Criteria andNeedhelpLessThan(String value) {
            addCriterion("needhelp <", value, "needhelp");
            return (Criteria) this;
        }

        public Criteria andNeedhelpLessThanOrEqualTo(String value) {
            addCriterion("needhelp <=", value, "needhelp");
            return (Criteria) this;
        }

        public Criteria andNeedhelpLike(String value) {
            addCriterion("needhelp like", value, "needhelp");
            return (Criteria) this;
        }

        public Criteria andNeedhelpNotLike(String value) {
            addCriterion("needhelp not like", value, "needhelp");
            return (Criteria) this;
        }

        public Criteria andNeedhelpIn(List<String> values) {
            addCriterion("needhelp in", values, "needhelp");
            return (Criteria) this;
        }

        public Criteria andNeedhelpNotIn(List<String> values) {
            addCriterion("needhelp not in", values, "needhelp");
            return (Criteria) this;
        }

        public Criteria andNeedhelpBetween(String value1, String value2) {
            addCriterion("needhelp between", value1, value2, "needhelp");
            return (Criteria) this;
        }

        public Criteria andNeedhelpNotBetween(String value1, String value2) {
            addCriterion("needhelp not between", value1, value2, "needhelp");
            return (Criteria) this;
        }

        public Criteria andHopefinishtimeIsNull() {
            addCriterion("hopefinishtime is null");
            return (Criteria) this;
        }

        public Criteria andHopefinishtimeIsNotNull() {
            addCriterion("hopefinishtime is not null");
            return (Criteria) this;
        }

        public Criteria andHopefinishtimeEqualTo(Date value) {
            addCriterion("hopefinishtime =", value, "hopefinishtime");
            return (Criteria) this;
        }

        public Criteria andHopefinishtimeNotEqualTo(Date value) {
            addCriterion("hopefinishtime <>", value, "hopefinishtime");
            return (Criteria) this;
        }

        public Criteria andHopefinishtimeGreaterThan(Date value) {
            addCriterion("hopefinishtime >", value, "hopefinishtime");
            return (Criteria) this;
        }

        public Criteria andHopefinishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("hopefinishtime >=", value, "hopefinishtime");
            return (Criteria) this;
        }

        public Criteria andHopefinishtimeLessThan(Date value) {
            addCriterion("hopefinishtime <", value, "hopefinishtime");
            return (Criteria) this;
        }

        public Criteria andHopefinishtimeLessThanOrEqualTo(Date value) {
            addCriterion("hopefinishtime <=", value, "hopefinishtime");
            return (Criteria) this;
        }

        public Criteria andHopefinishtimeIn(List<Date> values) {
            addCriterion("hopefinishtime in", values, "hopefinishtime");
            return (Criteria) this;
        }

        public Criteria andHopefinishtimeNotIn(List<Date> values) {
            addCriterion("hopefinishtime not in", values, "hopefinishtime");
            return (Criteria) this;
        }

        public Criteria andHopefinishtimeBetween(Date value1, Date value2) {
            addCriterion("hopefinishtime between", value1, value2, "hopefinishtime");
            return (Criteria) this;
        }

        public Criteria andHopefinishtimeNotBetween(Date value1, Date value2) {
            addCriterion("hopefinishtime not between", value1, value2, "hopefinishtime");
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