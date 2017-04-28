package com.yongyou.iSupport.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IsSDweekplaneNExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IsSDweekplaneNExample() {
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

        public Criteria andPkSDweekplaneNIsNull() {
            addCriterion("pk_s_dweekplane_n is null");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneNIsNotNull() {
            addCriterion("pk_s_dweekplane_n is not null");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneNEqualTo(Integer value) {
            addCriterion("pk_s_dweekplane_n =", value, "pkSDweekplaneN");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneNNotEqualTo(Integer value) {
            addCriterion("pk_s_dweekplane_n <>", value, "pkSDweekplaneN");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneNGreaterThan(Integer value) {
            addCriterion("pk_s_dweekplane_n >", value, "pkSDweekplaneN");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneNGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_s_dweekplane_n >=", value, "pkSDweekplaneN");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneNLessThan(Integer value) {
            addCriterion("pk_s_dweekplane_n <", value, "pkSDweekplaneN");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneNLessThanOrEqualTo(Integer value) {
            addCriterion("pk_s_dweekplane_n <=", value, "pkSDweekplaneN");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneNIn(List<Integer> values) {
            addCriterion("pk_s_dweekplane_n in", values, "pkSDweekplaneN");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneNNotIn(List<Integer> values) {
            addCriterion("pk_s_dweekplane_n not in", values, "pkSDweekplaneN");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneNBetween(Integer value1, Integer value2) {
            addCriterion("pk_s_dweekplane_n between", value1, value2, "pkSDweekplaneN");
            return (Criteria) this;
        }

        public Criteria andPkSDweekplaneNNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_s_dweekplane_n not between", value1, value2, "pkSDweekplaneN");
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

        public Criteria andWeekplstarttimeIsNull() {
            addCriterion("weekplstarttime is null");
            return (Criteria) this;
        }

        public Criteria andWeekplstarttimeIsNotNull() {
            addCriterion("weekplstarttime is not null");
            return (Criteria) this;
        }

        public Criteria andWeekplstarttimeEqualTo(Date value) {
            addCriterion("weekplstarttime =", value, "weekplstarttime");
            return (Criteria) this;
        }

        public Criteria andWeekplstarttimeNotEqualTo(Date value) {
            addCriterion("weekplstarttime <>", value, "weekplstarttime");
            return (Criteria) this;
        }

        public Criteria andWeekplstarttimeGreaterThan(Date value) {
            addCriterion("weekplstarttime >", value, "weekplstarttime");
            return (Criteria) this;
        }

        public Criteria andWeekplstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("weekplstarttime >=", value, "weekplstarttime");
            return (Criteria) this;
        }

        public Criteria andWeekplstarttimeLessThan(Date value) {
            addCriterion("weekplstarttime <", value, "weekplstarttime");
            return (Criteria) this;
        }

        public Criteria andWeekplstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("weekplstarttime <=", value, "weekplstarttime");
            return (Criteria) this;
        }

        public Criteria andWeekplstarttimeIn(List<Date> values) {
            addCriterion("weekplstarttime in", values, "weekplstarttime");
            return (Criteria) this;
        }

        public Criteria andWeekplstarttimeNotIn(List<Date> values) {
            addCriterion("weekplstarttime not in", values, "weekplstarttime");
            return (Criteria) this;
        }

        public Criteria andWeekplstarttimeBetween(Date value1, Date value2) {
            addCriterion("weekplstarttime between", value1, value2, "weekplstarttime");
            return (Criteria) this;
        }

        public Criteria andWeekplstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("weekplstarttime not between", value1, value2, "weekplstarttime");
            return (Criteria) this;
        }

        public Criteria andWeekplfinishtimeIsNull() {
            addCriterion("weekplfinishtime is null");
            return (Criteria) this;
        }

        public Criteria andWeekplfinishtimeIsNotNull() {
            addCriterion("weekplfinishtime is not null");
            return (Criteria) this;
        }

        public Criteria andWeekplfinishtimeEqualTo(Date value) {
            addCriterion("weekplfinishtime =", value, "weekplfinishtime");
            return (Criteria) this;
        }

        public Criteria andWeekplfinishtimeNotEqualTo(Date value) {
            addCriterion("weekplfinishtime <>", value, "weekplfinishtime");
            return (Criteria) this;
        }

        public Criteria andWeekplfinishtimeGreaterThan(Date value) {
            addCriterion("weekplfinishtime >", value, "weekplfinishtime");
            return (Criteria) this;
        }

        public Criteria andWeekplfinishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("weekplfinishtime >=", value, "weekplfinishtime");
            return (Criteria) this;
        }

        public Criteria andWeekplfinishtimeLessThan(Date value) {
            addCriterion("weekplfinishtime <", value, "weekplfinishtime");
            return (Criteria) this;
        }

        public Criteria andWeekplfinishtimeLessThanOrEqualTo(Date value) {
            addCriterion("weekplfinishtime <=", value, "weekplfinishtime");
            return (Criteria) this;
        }

        public Criteria andWeekplfinishtimeIn(List<Date> values) {
            addCriterion("weekplfinishtime in", values, "weekplfinishtime");
            return (Criteria) this;
        }

        public Criteria andWeekplfinishtimeNotIn(List<Date> values) {
            addCriterion("weekplfinishtime not in", values, "weekplfinishtime");
            return (Criteria) this;
        }

        public Criteria andWeekplfinishtimeBetween(Date value1, Date value2) {
            addCriterion("weekplfinishtime between", value1, value2, "weekplfinishtime");
            return (Criteria) this;
        }

        public Criteria andWeekplfinishtimeNotBetween(Date value1, Date value2) {
            addCriterion("weekplfinishtime not between", value1, value2, "weekplfinishtime");
            return (Criteria) this;
        }

        public Criteria andNextweektaskIsNull() {
            addCriterion("nextweektask is null");
            return (Criteria) this;
        }

        public Criteria andNextweektaskIsNotNull() {
            addCriterion("nextweektask is not null");
            return (Criteria) this;
        }

        public Criteria andNextweektaskEqualTo(String value) {
            addCriterion("nextweektask =", value, "nextweektask");
            return (Criteria) this;
        }

        public Criteria andNextweektaskNotEqualTo(String value) {
            addCriterion("nextweektask <>", value, "nextweektask");
            return (Criteria) this;
        }

        public Criteria andNextweektaskGreaterThan(String value) {
            addCriterion("nextweektask >", value, "nextweektask");
            return (Criteria) this;
        }

        public Criteria andNextweektaskGreaterThanOrEqualTo(String value) {
            addCriterion("nextweektask >=", value, "nextweektask");
            return (Criteria) this;
        }

        public Criteria andNextweektaskLessThan(String value) {
            addCriterion("nextweektask <", value, "nextweektask");
            return (Criteria) this;
        }

        public Criteria andNextweektaskLessThanOrEqualTo(String value) {
            addCriterion("nextweektask <=", value, "nextweektask");
            return (Criteria) this;
        }

        public Criteria andNextweektaskLike(String value) {
            addCriterion("nextweektask like", value, "nextweektask");
            return (Criteria) this;
        }

        public Criteria andNextweektaskNotLike(String value) {
            addCriterion("nextweektask not like", value, "nextweektask");
            return (Criteria) this;
        }

        public Criteria andNextweektaskIn(List<String> values) {
            addCriterion("nextweektask in", values, "nextweektask");
            return (Criteria) this;
        }

        public Criteria andNextweektaskNotIn(List<String> values) {
            addCriterion("nextweektask not in", values, "nextweektask");
            return (Criteria) this;
        }

        public Criteria andNextweektaskBetween(String value1, String value2) {
            addCriterion("nextweektask between", value1, value2, "nextweektask");
            return (Criteria) this;
        }

        public Criteria andNextweektaskNotBetween(String value1, String value2) {
            addCriterion("nextweektask not between", value1, value2, "nextweektask");
            return (Criteria) this;
        }

        public Criteria andNextpersonliableIsNull() {
            addCriterion("nextpersonliable is null");
            return (Criteria) this;
        }

        public Criteria andNextpersonliableIsNotNull() {
            addCriterion("nextpersonliable is not null");
            return (Criteria) this;
        }

        public Criteria andNextpersonliableEqualTo(String value) {
            addCriterion("nextpersonliable =", value, "nextpersonliable");
            return (Criteria) this;
        }

        public Criteria andNextpersonliableNotEqualTo(String value) {
            addCriterion("nextpersonliable <>", value, "nextpersonliable");
            return (Criteria) this;
        }

        public Criteria andNextpersonliableGreaterThan(String value) {
            addCriterion("nextpersonliable >", value, "nextpersonliable");
            return (Criteria) this;
        }

        public Criteria andNextpersonliableGreaterThanOrEqualTo(String value) {
            addCriterion("nextpersonliable >=", value, "nextpersonliable");
            return (Criteria) this;
        }

        public Criteria andNextpersonliableLessThan(String value) {
            addCriterion("nextpersonliable <", value, "nextpersonliable");
            return (Criteria) this;
        }

        public Criteria andNextpersonliableLessThanOrEqualTo(String value) {
            addCriterion("nextpersonliable <=", value, "nextpersonliable");
            return (Criteria) this;
        }

        public Criteria andNextpersonliableLike(String value) {
            addCriterion("nextpersonliable like", value, "nextpersonliable");
            return (Criteria) this;
        }

        public Criteria andNextpersonliableNotLike(String value) {
            addCriterion("nextpersonliable not like", value, "nextpersonliable");
            return (Criteria) this;
        }

        public Criteria andNextpersonliableIn(List<String> values) {
            addCriterion("nextpersonliable in", values, "nextpersonliable");
            return (Criteria) this;
        }

        public Criteria andNextpersonliableNotIn(List<String> values) {
            addCriterion("nextpersonliable not in", values, "nextpersonliable");
            return (Criteria) this;
        }

        public Criteria andNextpersonliableBetween(String value1, String value2) {
            addCriterion("nextpersonliable between", value1, value2, "nextpersonliable");
            return (Criteria) this;
        }

        public Criteria andNextpersonliableNotBetween(String value1, String value2) {
            addCriterion("nextpersonliable not between", value1, value2, "nextpersonliable");
            return (Criteria) this;
        }

        public Criteria andNextweekstarttimeIsNull() {
            addCriterion("nextweekstarttime is null");
            return (Criteria) this;
        }

        public Criteria andNextweekstarttimeIsNotNull() {
            addCriterion("nextweekstarttime is not null");
            return (Criteria) this;
        }

        public Criteria andNextweekstarttimeEqualTo(Date value) {
            addCriterion("nextweekstarttime =", value, "nextweekstarttime");
            return (Criteria) this;
        }

        public Criteria andNextweekstarttimeNotEqualTo(Date value) {
            addCriterion("nextweekstarttime <>", value, "nextweekstarttime");
            return (Criteria) this;
        }

        public Criteria andNextweekstarttimeGreaterThan(Date value) {
            addCriterion("nextweekstarttime >", value, "nextweekstarttime");
            return (Criteria) this;
        }

        public Criteria andNextweekstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("nextweekstarttime >=", value, "nextweekstarttime");
            return (Criteria) this;
        }

        public Criteria andNextweekstarttimeLessThan(Date value) {
            addCriterion("nextweekstarttime <", value, "nextweekstarttime");
            return (Criteria) this;
        }

        public Criteria andNextweekstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("nextweekstarttime <=", value, "nextweekstarttime");
            return (Criteria) this;
        }

        public Criteria andNextweekstarttimeIn(List<Date> values) {
            addCriterion("nextweekstarttime in", values, "nextweekstarttime");
            return (Criteria) this;
        }

        public Criteria andNextweekstarttimeNotIn(List<Date> values) {
            addCriterion("nextweekstarttime not in", values, "nextweekstarttime");
            return (Criteria) this;
        }

        public Criteria andNextweekstarttimeBetween(Date value1, Date value2) {
            addCriterion("nextweekstarttime between", value1, value2, "nextweekstarttime");
            return (Criteria) this;
        }

        public Criteria andNextweekstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("nextweekstarttime not between", value1, value2, "nextweekstarttime");
            return (Criteria) this;
        }

        public Criteria andNextweekfinishtimeIsNull() {
            addCriterion("nextweekfinishtime is null");
            return (Criteria) this;
        }

        public Criteria andNextweekfinishtimeIsNotNull() {
            addCriterion("nextweekfinishtime is not null");
            return (Criteria) this;
        }

        public Criteria andNextweekfinishtimeEqualTo(Date value) {
            addCriterion("nextweekfinishtime =", value, "nextweekfinishtime");
            return (Criteria) this;
        }

        public Criteria andNextweekfinishtimeNotEqualTo(Date value) {
            addCriterion("nextweekfinishtime <>", value, "nextweekfinishtime");
            return (Criteria) this;
        }

        public Criteria andNextweekfinishtimeGreaterThan(Date value) {
            addCriterion("nextweekfinishtime >", value, "nextweekfinishtime");
            return (Criteria) this;
        }

        public Criteria andNextweekfinishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("nextweekfinishtime >=", value, "nextweekfinishtime");
            return (Criteria) this;
        }

        public Criteria andNextweekfinishtimeLessThan(Date value) {
            addCriterion("nextweekfinishtime <", value, "nextweekfinishtime");
            return (Criteria) this;
        }

        public Criteria andNextweekfinishtimeLessThanOrEqualTo(Date value) {
            addCriterion("nextweekfinishtime <=", value, "nextweekfinishtime");
            return (Criteria) this;
        }

        public Criteria andNextweekfinishtimeIn(List<Date> values) {
            addCriterion("nextweekfinishtime in", values, "nextweekfinishtime");
            return (Criteria) this;
        }

        public Criteria andNextweekfinishtimeNotIn(List<Date> values) {
            addCriterion("nextweekfinishtime not in", values, "nextweekfinishtime");
            return (Criteria) this;
        }

        public Criteria andNextweekfinishtimeBetween(Date value1, Date value2) {
            addCriterion("nextweekfinishtime between", value1, value2, "nextweekfinishtime");
            return (Criteria) this;
        }

        public Criteria andNextweekfinishtimeNotBetween(Date value1, Date value2) {
            addCriterion("nextweekfinishtime not between", value1, value2, "nextweekfinishtime");
            return (Criteria) this;
        }

        public Criteria andExplainIsNull() {
            addCriterion("explain is null");
            return (Criteria) this;
        }

        public Criteria andExplainIsNotNull() {
            addCriterion("explain is not null");
            return (Criteria) this;
        }

        public Criteria andExplainEqualTo(String value) {
            addCriterion("explain =", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotEqualTo(String value) {
            addCriterion("explain <>", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainGreaterThan(String value) {
            addCriterion("explain >", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainGreaterThanOrEqualTo(String value) {
            addCriterion("explain >=", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainLessThan(String value) {
            addCriterion("explain <", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainLessThanOrEqualTo(String value) {
            addCriterion("explain <=", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainLike(String value) {
            addCriterion("explain like", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotLike(String value) {
            addCriterion("explain not like", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainIn(List<String> values) {
            addCriterion("explain in", values, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotIn(List<String> values) {
            addCriterion("explain not in", values, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainBetween(String value1, String value2) {
            addCriterion("explain between", value1, value2, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotBetween(String value1, String value2) {
            addCriterion("explain not between", value1, value2, "explain");
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