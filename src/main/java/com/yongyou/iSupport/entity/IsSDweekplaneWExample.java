package com.yongyou.iSupport.entity;

import java.util.ArrayList;
import java.util.List;

public class IsSDweekplaneWExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IsSDweekplaneWExample() {
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

        public Criteria andPkSDweekplaneWIsNull() {
            addCriterion("pk_s_dweekplane_w is null");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneWIsNotNull() {
            addCriterion("pk_s_dweekplane_w is not null");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneWEqualTo(Integer value) {
            addCriterion("pk_s_dweekplane_w =", value, "pkSDweekplaneW");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneWNotEqualTo(Integer value) {
            addCriterion("pk_s_dweekplane_w <>", value, "pkSDweekplaneW");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneWGreaterThan(Integer value) {
            addCriterion("pk_s_dweekplane_w >", value, "pkSDweekplaneW");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneWGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_s_dweekplane_w >=", value, "pkSDweekplaneW");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneWLessThan(Integer value) {
            addCriterion("pk_s_dweekplane_w <", value, "pkSDweekplaneW");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneWLessThanOrEqualTo(Integer value) {
            addCriterion("pk_s_dweekplane_w <=", value, "pkSDweekplaneW");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneWIn(List<Integer> values) {
            addCriterion("pk_s_dweekplane_w in", values, "pkSDweekplaneW");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneWNotIn(List<Integer> values) {
            addCriterion("pk_s_dweekplane_w not in", values, "pkSDweekplaneW");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneWBetween(Integer value1, Integer value2) {
            addCriterion("pk_s_dweekplane_w between", value1, value2, "pkSDweekplaneW");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneWNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_s_dweekplane_w not between", value1, value2, "pkSDweekplaneW");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneHIsNull() {
            addCriterion("pk_s_dweekplane_h is null");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneHIsNotNull() {
            addCriterion("pk_s_dweekplane_h is not null");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneHEqualTo(Integer value) {
            addCriterion("pk_s_dweekplane_h =", value, "pkSDweekplaneH");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneHNotEqualTo(Integer value) {
            addCriterion("pk_s_dweekplane_h <>", value, "pkSDweekplaneH");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneHGreaterThan(Integer value) {
            addCriterion("pk_s_dweekplane_h >", value, "pkSDweekplaneH");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneHGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_s_dweekplane_h >=", value, "pkSDweekplaneH");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneHLessThan(Integer value) {
            addCriterion("pk_s_dweekplane_h <", value, "pkSDweekplaneH");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneHLessThanOrEqualTo(Integer value) {
            addCriterion("pk_s_dweekplane_h <=", value, "pkSDweekplaneH");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneHIn(List<Integer> values) {
            addCriterion("pk_s_dweekplane_h in", values, "pkSDweekplaneH");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneHNotIn(List<Integer> values) {
            addCriterion("pk_s_dweekplane_h not in", values, "pkSDweekplaneH");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneHBetween(Integer value1, Integer value2) {
            addCriterion("pk_s_dweekplane_h between", value1, value2, "pkSDweekplaneH");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneHNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_s_dweekplane_h not between", value1, value2, "pkSDweekplaneH");
            return (Criteria) this;
        }

        public Criteria andNotfinishtaskIsNull() {
            addCriterion("notfinishtask is null");
            return (Criteria) this;
        }

        public Criteria andNotfinishtaskIsNotNull() {
            addCriterion("notfinishtask is not null");
            return (Criteria) this;
        }

        public Criteria andNotfinishtaskEqualTo(String value) {
            addCriterion("notfinishtask =", value, "notfinishtask");
            return (Criteria) this;
        }

        public Criteria andNotfinishtaskNotEqualTo(String value) {
            addCriterion("notfinishtask <>", value, "notfinishtask");
            return (Criteria) this;
        }

        public Criteria andNotfinishtaskGreaterThan(String value) {
            addCriterion("notfinishtask >", value, "notfinishtask");
            return (Criteria) this;
        }

        public Criteria andNotfinishtaskGreaterThanOrEqualTo(String value) {
            addCriterion("notfinishtask >=", value, "notfinishtask");
            return (Criteria) this;
        }

        public Criteria andNotfinishtaskLessThan(String value) {
            addCriterion("notfinishtask <", value, "notfinishtask");
            return (Criteria) this;
        }

        public Criteria andNotfinishtaskLessThanOrEqualTo(String value) {
            addCriterion("notfinishtask <=", value, "notfinishtask");
            return (Criteria) this;
        }

        public Criteria andNotfinishtaskLike(String value) {
            addCriterion("notfinishtask like", value, "notfinishtask");
            return (Criteria) this;
        }

        public Criteria andNotfinishtaskNotLike(String value) {
            addCriterion("notfinishtask not like", value, "notfinishtask");
            return (Criteria) this;
        }

        public Criteria andNotfinishtaskIn(List<String> values) {
            addCriterion("notfinishtask in", values, "notfinishtask");
            return (Criteria) this;
        }

        public Criteria andNotfinishtaskNotIn(List<String> values) {
            addCriterion("notfinishtask not in", values, "notfinishtask");
            return (Criteria) this;
        }

        public Criteria andNotfinishtaskBetween(String value1, String value2) {
            addCriterion("notfinishtask between", value1, value2, "notfinishtask");
            return (Criteria) this;
        }

        public Criteria andNotfinishtaskNotBetween(String value1, String value2) {
            addCriterion("notfinishtask not between", value1, value2, "notfinishtask");
            return (Criteria) this;
        }

        public Criteria andPersonliableIsNull() {
            addCriterion("personliable is null");
            return (Criteria) this;
        }

        public Criteria andPersonliableIsNotNull() {
            addCriterion("personliable is not null");
            return (Criteria) this;
        }

        public Criteria andPersonliableEqualTo(String value) {
            addCriterion("personliable =", value, "personliable");
            return (Criteria) this;
        }

        public Criteria andPersonliableNotEqualTo(String value) {
            addCriterion("personliable <>", value, "personliable");
            return (Criteria) this;
        }

        public Criteria andPersonliableGreaterThan(String value) {
            addCriterion("personliable >", value, "personliable");
            return (Criteria) this;
        }

        public Criteria andPersonliableGreaterThanOrEqualTo(String value) {
            addCriterion("personliable >=", value, "personliable");
            return (Criteria) this;
        }

        public Criteria andPersonliableLessThan(String value) {
            addCriterion("personliable <", value, "personliable");
            return (Criteria) this;
        }

        public Criteria andPersonliableLessThanOrEqualTo(String value) {
            addCriterion("personliable <=", value, "personliable");
            return (Criteria) this;
        }

        public Criteria andPersonliableLike(String value) {
            addCriterion("personliable like", value, "personliable");
            return (Criteria) this;
        }

        public Criteria andPersonliableNotLike(String value) {
            addCriterion("personliable not like", value, "personliable");
            return (Criteria) this;
        }

        public Criteria andPersonliableIn(List<String> values) {
            addCriterion("personliable in", values, "personliable");
            return (Criteria) this;
        }

        public Criteria andPersonliableNotIn(List<String> values) {
            addCriterion("personliable not in", values, "personliable");
            return (Criteria) this;
        }

        public Criteria andPersonliableBetween(String value1, String value2) {
            addCriterion("personliable between", value1, value2, "personliable");
            return (Criteria) this;
        }

        public Criteria andPersonliableNotBetween(String value1, String value2) {
            addCriterion("personliable not between", value1, value2, "personliable");
            return (Criteria) this;
        }

        public Criteria andNotfinishreasonIsNull() {
            addCriterion("notfinishreason is null");
            return (Criteria) this;
        }

        public Criteria andNotfinishreasonIsNotNull() {
            addCriterion("notfinishreason is not null");
            return (Criteria) this;
        }

        public Criteria andNotfinishreasonEqualTo(String value) {
            addCriterion("notfinishreason =", value, "notfinishreason");
            return (Criteria) this;
        }

        public Criteria andNotfinishreasonNotEqualTo(String value) {
            addCriterion("notfinishreason <>", value, "notfinishreason");
            return (Criteria) this;
        }

        public Criteria andNotfinishreasonGreaterThan(String value) {
            addCriterion("notfinishreason >", value, "notfinishreason");
            return (Criteria) this;
        }

        public Criteria andNotfinishreasonGreaterThanOrEqualTo(String value) {
            addCriterion("notfinishreason >=", value, "notfinishreason");
            return (Criteria) this;
        }

        public Criteria andNotfinishreasonLessThan(String value) {
            addCriterion("notfinishreason <", value, "notfinishreason");
            return (Criteria) this;
        }

        public Criteria andNotfinishreasonLessThanOrEqualTo(String value) {
            addCriterion("notfinishreason <=", value, "notfinishreason");
            return (Criteria) this;
        }

        public Criteria andNotfinishreasonLike(String value) {
            addCriterion("notfinishreason like", value, "notfinishreason");
            return (Criteria) this;
        }

        public Criteria andNotfinishreasonNotLike(String value) {
            addCriterion("notfinishreason not like", value, "notfinishreason");
            return (Criteria) this;
        }

        public Criteria andNotfinishreasonIn(List<String> values) {
            addCriterion("notfinishreason in", values, "notfinishreason");
            return (Criteria) this;
        }

        public Criteria andNotfinishreasonNotIn(List<String> values) {
            addCriterion("notfinishreason not in", values, "notfinishreason");
            return (Criteria) this;
        }

        public Criteria andNotfinishreasonBetween(String value1, String value2) {
            addCriterion("notfinishreason between", value1, value2, "notfinishreason");
            return (Criteria) this;
        }

        public Criteria andNotfinishreasonNotBetween(String value1, String value2) {
            addCriterion("notfinishreason not between", value1, value2, "notfinishreason");
            return (Criteria) this;
        }

        public Criteria andConcretemeasureIsNull() {
            addCriterion("concretemeasure is null");
            return (Criteria) this;
        }

        public Criteria andConcretemeasureIsNotNull() {
            addCriterion("concretemeasure is not null");
            return (Criteria) this;
        }

        public Criteria andConcretemeasureEqualTo(String value) {
            addCriterion("concretemeasure =", value, "concretemeasure");
            return (Criteria) this;
        }

        public Criteria andConcretemeasureNotEqualTo(String value) {
            addCriterion("concretemeasure <>", value, "concretemeasure");
            return (Criteria) this;
        }

        public Criteria andConcretemeasureGreaterThan(String value) {
            addCriterion("concretemeasure >", value, "concretemeasure");
            return (Criteria) this;
        }

        public Criteria andConcretemeasureGreaterThanOrEqualTo(String value) {
            addCriterion("concretemeasure >=", value, "concretemeasure");
            return (Criteria) this;
        }

        public Criteria andConcretemeasureLessThan(String value) {
            addCriterion("concretemeasure <", value, "concretemeasure");
            return (Criteria) this;
        }

        public Criteria andConcretemeasureLessThanOrEqualTo(String value) {
            addCriterion("concretemeasure <=", value, "concretemeasure");
            return (Criteria) this;
        }

        public Criteria andConcretemeasureLike(String value) {
            addCriterion("concretemeasure like", value, "concretemeasure");
            return (Criteria) this;
        }

        public Criteria andConcretemeasureNotLike(String value) {
            addCriterion("concretemeasure not like", value, "concretemeasure");
            return (Criteria) this;
        }

        public Criteria andConcretemeasureIn(List<String> values) {
            addCriterion("concretemeasure in", values, "concretemeasure");
            return (Criteria) this;
        }

        public Criteria andConcretemeasureNotIn(List<String> values) {
            addCriterion("concretemeasure not in", values, "concretemeasure");
            return (Criteria) this;
        }

        public Criteria andConcretemeasureBetween(String value1, String value2) {
            addCriterion("concretemeasure between", value1, value2, "concretemeasure");
            return (Criteria) this;
        }

        public Criteria andConcretemeasureNotBetween(String value1, String value2) {
            addCriterion("concretemeasure not between", value1, value2, "concretemeasure");
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