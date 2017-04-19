package com.yongyou.iSupport.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IsSDweekplaneTExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IsSDweekplaneTExample() {
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

        public Criteria andWeekstartdateIsNull() {
            addCriterion("weekstartdate is null");
            return (Criteria) this;
        }

        public Criteria andWeekstartdateIsNotNull() {
            addCriterion("weekstartdate is not null");
            return (Criteria) this;
        }

        public Criteria andWeekstartdateEqualTo(Date value) {
            addCriterion("weekstartdate =", value, "weekstartdate");
            return (Criteria) this;
        }

        public Criteria andWeekstartdateNotEqualTo(Date value) {
            addCriterion("weekstartdate <>", value, "weekstartdate");
            return (Criteria) this;
        }

        public Criteria andWeekstartdateGreaterThan(Date value) {
            addCriterion("weekstartdate >", value, "weekstartdate");
            return (Criteria) this;
        }

        public Criteria andWeekstartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("weekstartdate >=", value, "weekstartdate");
            return (Criteria) this;
        }

        public Criteria andWeekstartdateLessThan(Date value) {
            addCriterion("weekstartdate <", value, "weekstartdate");
            return (Criteria) this;
        }

        public Criteria andWeekstartdateLessThanOrEqualTo(Date value) {
            addCriterion("weekstartdate <=", value, "weekstartdate");
            return (Criteria) this;
        }

        public Criteria andWeekstartdateIn(List<Date> values) {
            addCriterion("weekstartdate in", values, "weekstartdate");
            return (Criteria) this;
        }

        public Criteria andWeekstartdateNotIn(List<Date> values) {
            addCriterion("weekstartdate not in", values, "weekstartdate");
            return (Criteria) this;
        }

        public Criteria andWeekstartdateBetween(Date value1, Date value2) {
            addCriterion("weekstartdate between", value1, value2, "weekstartdate");
            return (Criteria) this;
        }

        public Criteria andWeekstartdateNotBetween(Date value1, Date value2) {
            addCriterion("weekstartdate not between", value1, value2, "weekstartdate");
            return (Criteria) this;
        }

        public Criteria andWeekfinishdateIsNull() {
            addCriterion("weekfinishdate is null");
            return (Criteria) this;
        }

        public Criteria andWeekfinishdateIsNotNull() {
            addCriterion("weekfinishdate is not null");
            return (Criteria) this;
        }

        public Criteria andWeekfinishdateEqualTo(Date value) {
            addCriterion("weekfinishdate =", value, "weekfinishdate");
            return (Criteria) this;
        }

        public Criteria andWeekfinishdateNotEqualTo(Date value) {
            addCriterion("weekfinishdate <>", value, "weekfinishdate");
            return (Criteria) this;
        }

        public Criteria andWeekfinishdateGreaterThan(Date value) {
            addCriterion("weekfinishdate >", value, "weekfinishdate");
            return (Criteria) this;
        }

        public Criteria andWeekfinishdateGreaterThanOrEqualTo(Date value) {
            addCriterion("weekfinishdate >=", value, "weekfinishdate");
            return (Criteria) this;
        }

        public Criteria andWeekfinishdateLessThan(Date value) {
            addCriterion("weekfinishdate <", value, "weekfinishdate");
            return (Criteria) this;
        }

        public Criteria andWeekfinishdateLessThanOrEqualTo(Date value) {
            addCriterion("weekfinishdate <=", value, "weekfinishdate");
            return (Criteria) this;
        }

        public Criteria andWeekfinishdateIn(List<Date> values) {
            addCriterion("weekfinishdate in", values, "weekfinishdate");
            return (Criteria) this;
        }

        public Criteria andWeekfinishdateNotIn(List<Date> values) {
            addCriterion("weekfinishdate not in", values, "weekfinishdate");
            return (Criteria) this;
        }

        public Criteria andWeekfinishdateBetween(Date value1, Date value2) {
            addCriterion("weekfinishdate between", value1, value2, "weekfinishdate");
            return (Criteria) this;
        }

        public Criteria andWeekfinishdateNotBetween(Date value1, Date value2) {
            addCriterion("weekfinishdate not between", value1, value2, "weekfinishdate");
            return (Criteria) this;
        }

        public Criteria andWeekworktaskIsNull() {
            addCriterion("weekworktask is null");
            return (Criteria) this;
        }

        public Criteria andWeekworktaskIsNotNull() {
            addCriterion("weekworktask is not null");
            return (Criteria) this;
        }

        public Criteria andWeekworktaskEqualTo(String value) {
            addCriterion("weekworktask =", value, "weekworktask");
            return (Criteria) this;
        }

        public Criteria andWeekworktaskNotEqualTo(String value) {
            addCriterion("weekworktask <>", value, "weekworktask");
            return (Criteria) this;
        }

        public Criteria andWeekworktaskGreaterThan(String value) {
            addCriterion("weekworktask >", value, "weekworktask");
            return (Criteria) this;
        }

        public Criteria andWeekworktaskGreaterThanOrEqualTo(String value) {
            addCriterion("weekworktask >=", value, "weekworktask");
            return (Criteria) this;
        }

        public Criteria andWeekworktaskLessThan(String value) {
            addCriterion("weekworktask <", value, "weekworktask");
            return (Criteria) this;
        }

        public Criteria andWeekworktaskLessThanOrEqualTo(String value) {
            addCriterion("weekworktask <=", value, "weekworktask");
            return (Criteria) this;
        }

        public Criteria andWeekworktaskLike(String value) {
            addCriterion("weekworktask like", value, "weekworktask");
            return (Criteria) this;
        }

        public Criteria andWeekworktaskNotLike(String value) {
            addCriterion("weekworktask not like", value, "weekworktask");
            return (Criteria) this;
        }

        public Criteria andWeekworktaskIn(List<String> values) {
            addCriterion("weekworktask in", values, "weekworktask");
            return (Criteria) this;
        }

        public Criteria andWeekworktaskNotIn(List<String> values) {
            addCriterion("weekworktask not in", values, "weekworktask");
            return (Criteria) this;
        }

        public Criteria andWeekworktaskBetween(String value1, String value2) {
            addCriterion("weekworktask between", value1, value2, "weekworktask");
            return (Criteria) this;
        }

        public Criteria andWeekworktaskNotBetween(String value1, String value2) {
            addCriterion("weekworktask not between", value1, value2, "weekworktask");
            return (Criteria) this;
        }

        public Criteria andWeekpersonliableIsNull() {
            addCriterion("weekpersonliable is null");
            return (Criteria) this;
        }

        public Criteria andWeekpersonliableIsNotNull() {
            addCriterion("weekpersonliable is not null");
            return (Criteria) this;
        }

        public Criteria andWeekpersonliableEqualTo(String value) {
            addCriterion("weekpersonliable =", value, "weekpersonliable");
            return (Criteria) this;
        }

        public Criteria andWeekpersonliableNotEqualTo(String value) {
            addCriterion("weekpersonliable <>", value, "weekpersonliable");
            return (Criteria) this;
        }

        public Criteria andWeekpersonliableGreaterThan(String value) {
            addCriterion("weekpersonliable >", value, "weekpersonliable");
            return (Criteria) this;
        }

        public Criteria andWeekpersonliableGreaterThanOrEqualTo(String value) {
            addCriterion("weekpersonliable >=", value, "weekpersonliable");
            return (Criteria) this;
        }

        public Criteria andWeekpersonliableLessThan(String value) {
            addCriterion("weekpersonliable <", value, "weekpersonliable");
            return (Criteria) this;
        }

        public Criteria andWeekpersonliableLessThanOrEqualTo(String value) {
            addCriterion("weekpersonliable <=", value, "weekpersonliable");
            return (Criteria) this;
        }

        public Criteria andWeekpersonliableLike(String value) {
            addCriterion("weekpersonliable like", value, "weekpersonliable");
            return (Criteria) this;
        }

        public Criteria andWeekpersonliableNotLike(String value) {
            addCriterion("weekpersonliable not like", value, "weekpersonliable");
            return (Criteria) this;
        }

        public Criteria andWeekpersonliableIn(List<String> values) {
            addCriterion("weekpersonliable in", values, "weekpersonliable");
            return (Criteria) this;
        }

        public Criteria andWeekpersonliableNotIn(List<String> values) {
            addCriterion("weekpersonliable not in", values, "weekpersonliable");
            return (Criteria) this;
        }

        public Criteria andWeekpersonliableBetween(String value1, String value2) {
            addCriterion("weekpersonliable between", value1, value2, "weekpersonliable");
            return (Criteria) this;
        }

        public Criteria andWeekpersonliableNotBetween(String value1, String value2) {
            addCriterion("weekpersonliable not between", value1, value2, "weekpersonliable");
            return (Criteria) this;
        }

        public Criteria andWeekworkstarttimeIsNull() {
            addCriterion("weekworkstarttime is null");
            return (Criteria) this;
        }

        public Criteria andWeekworkstarttimeIsNotNull() {
            addCriterion("weekworkstarttime is not null");
            return (Criteria) this;
        }

        public Criteria andWeekworkstarttimeEqualTo(Date value) {
            addCriterion("weekworkstarttime =", value, "weekworkstarttime");
            return (Criteria) this;
        }

        public Criteria andWeekworkstarttimeNotEqualTo(Date value) {
            addCriterion("weekworkstarttime <>", value, "weekworkstarttime");
            return (Criteria) this;
        }

        public Criteria andWeekworkstarttimeGreaterThan(Date value) {
            addCriterion("weekworkstarttime >", value, "weekworkstarttime");
            return (Criteria) this;
        }

        public Criteria andWeekworkstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("weekworkstarttime >=", value, "weekworkstarttime");
            return (Criteria) this;
        }

        public Criteria andWeekworkstarttimeLessThan(Date value) {
            addCriterion("weekworkstarttime <", value, "weekworkstarttime");
            return (Criteria) this;
        }

        public Criteria andWeekworkstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("weekworkstarttime <=", value, "weekworkstarttime");
            return (Criteria) this;
        }

        public Criteria andWeekworkstarttimeIn(List<Date> values) {
            addCriterion("weekworkstarttime in", values, "weekworkstarttime");
            return (Criteria) this;
        }

        public Criteria andWeekworkstarttimeNotIn(List<Date> values) {
            addCriterion("weekworkstarttime not in", values, "weekworkstarttime");
            return (Criteria) this;
        }

        public Criteria andWeekworkstarttimeBetween(Date value1, Date value2) {
            addCriterion("weekworkstarttime between", value1, value2, "weekworkstarttime");
            return (Criteria) this;
        }

        public Criteria andWeekworkstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("weekworkstarttime not between", value1, value2, "weekworkstarttime");
            return (Criteria) this;
        }

        public Criteria andWeekworkfinishtimeIsNull() {
            addCriterion("weekworkfinishtime is null");
            return (Criteria) this;
        }

        public Criteria andWeekworkfinishtimeIsNotNull() {
            addCriterion("weekworkfinishtime is not null");
            return (Criteria) this;
        }

        public Criteria andWeekworkfinishtimeEqualTo(Date value) {
            addCriterion("weekworkfinishtime =", value, "weekworkfinishtime");
            return (Criteria) this;
        }

        public Criteria andWeekworkfinishtimeNotEqualTo(Date value) {
            addCriterion("weekworkfinishtime <>", value, "weekworkfinishtime");
            return (Criteria) this;
        }

        public Criteria andWeekworkfinishtimeGreaterThan(Date value) {
            addCriterion("weekworkfinishtime >", value, "weekworkfinishtime");
            return (Criteria) this;
        }

        public Criteria andWeekworkfinishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("weekworkfinishtime >=", value, "weekworkfinishtime");
            return (Criteria) this;
        }

        public Criteria andWeekworkfinishtimeLessThan(Date value) {
            addCriterion("weekworkfinishtime <", value, "weekworkfinishtime");
            return (Criteria) this;
        }

        public Criteria andWeekworkfinishtimeLessThanOrEqualTo(Date value) {
            addCriterion("weekworkfinishtime <=", value, "weekworkfinishtime");
            return (Criteria) this;
        }

        public Criteria andWeekworkfinishtimeIn(List<Date> values) {
            addCriterion("weekworkfinishtime in", values, "weekworkfinishtime");
            return (Criteria) this;
        }

        public Criteria andWeekworkfinishtimeNotIn(List<Date> values) {
            addCriterion("weekworkfinishtime not in", values, "weekworkfinishtime");
            return (Criteria) this;
        }

        public Criteria andWeekworkfinishtimeBetween(Date value1, Date value2) {
            addCriterion("weekworkfinishtime between", value1, value2, "weekworkfinishtime");
            return (Criteria) this;
        }

        public Criteria andWeekworkfinishtimeNotBetween(Date value1, Date value2) {
            addCriterion("weekworkfinishtime not between", value1, value2, "weekworkfinishtime");
            return (Criteria) this;
        }

        public Criteria andWeekworkexplainIsNull() {
            addCriterion("weekworkexplain is null");
            return (Criteria) this;
        }

        public Criteria andWeekworkexplainIsNotNull() {
            addCriterion("weekworkexplain is not null");
            return (Criteria) this;
        }

        public Criteria andWeekworkexplainEqualTo(String value) {
            addCriterion("weekworkexplain =", value, "weekworkexplain");
            return (Criteria) this;
        }

        public Criteria andWeekworkexplainNotEqualTo(String value) {
            addCriterion("weekworkexplain <>", value, "weekworkexplain");
            return (Criteria) this;
        }

        public Criteria andWeekworkexplainGreaterThan(String value) {
            addCriterion("weekworkexplain >", value, "weekworkexplain");
            return (Criteria) this;
        }

        public Criteria andWeekworkexplainGreaterThanOrEqualTo(String value) {
            addCriterion("weekworkexplain >=", value, "weekworkexplain");
            return (Criteria) this;
        }

        public Criteria andWeekworkexplainLessThan(String value) {
            addCriterion("weekworkexplain <", value, "weekworkexplain");
            return (Criteria) this;
        }

        public Criteria andWeekworkexplainLessThanOrEqualTo(String value) {
            addCriterion("weekworkexplain <=", value, "weekworkexplain");
            return (Criteria) this;
        }

        public Criteria andWeekworkexplainLike(String value) {
            addCriterion("weekworkexplain like", value, "weekworkexplain");
            return (Criteria) this;
        }

        public Criteria andWeekworkexplainNotLike(String value) {
            addCriterion("weekworkexplain not like", value, "weekworkexplain");
            return (Criteria) this;
        }

        public Criteria andWeekworkexplainIn(List<String> values) {
            addCriterion("weekworkexplain in", values, "weekworkexplain");
            return (Criteria) this;
        }

        public Criteria andWeekworkexplainNotIn(List<String> values) {
            addCriterion("weekworkexplain not in", values, "weekworkexplain");
            return (Criteria) this;
        }

        public Criteria andWeekworkexplainBetween(String value1, String value2) {
            addCriterion("weekworkexplain between", value1, value2, "weekworkexplain");
            return (Criteria) this;
        }

        public Criteria andWeekworkexplainNotBetween(String value1, String value2) {
            addCriterion("weekworkexplain not between", value1, value2, "weekworkexplain");
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