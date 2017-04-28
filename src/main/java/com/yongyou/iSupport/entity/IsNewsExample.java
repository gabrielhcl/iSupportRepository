package com.yongyou.iSupport.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IsNewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IsNewsExample() {
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

        public Criteria andPkNewsIsNull() {
            addCriterion("pk_news is null");
            return (Criteria) this;
        }

        public Criteria andPkNewsIsNotNull() {
            addCriterion("pk_news is not null");
            return (Criteria) this;
        }

        public Criteria andPkNewsEqualTo(Integer value) {
            addCriterion("pk_news =", value, "pkNews");
            return (Criteria) this;
        }

        public Criteria andPkNewsNotEqualTo(Integer value) {
            addCriterion("pk_news <>", value, "pkNews");
            return (Criteria) this;
        }

        public Criteria andPkNewsGreaterThan(Integer value) {
            addCriterion("pk_news >", value, "pkNews");
            return (Criteria) this;
        }

        public Criteria andPkNewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_news >=", value, "pkNews");
            return (Criteria) this;
        }

        public Criteria andPkNewsLessThan(Integer value) {
            addCriterion("pk_news <", value, "pkNews");
            return (Criteria) this;
        }

        public Criteria andPkNewsLessThanOrEqualTo(Integer value) {
            addCriterion("pk_news <=", value, "pkNews");
            return (Criteria) this;
        }

        public Criteria andPkNewsIn(List<Integer> values) {
            addCriterion("pk_news in", values, "pkNews");
            return (Criteria) this;
        }

        public Criteria andPkNewsNotIn(List<Integer> values) {
            addCriterion("pk_news not in", values, "pkNews");
            return (Criteria) this;
        }

        public Criteria andPkNewsBetween(Integer value1, Integer value2) {
            addCriterion("pk_news between", value1, value2, "pkNews");
            return (Criteria) this;
        }

        public Criteria andPkNewsNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_news not between", value1, value2, "pkNews");
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

        public Criteria andNewscodeIsNull() {
            addCriterion("newscode is null");
            return (Criteria) this;
        }

        public Criteria andNewscodeIsNotNull() {
            addCriterion("newscode is not null");
            return (Criteria) this;
        }

        public Criteria andNewscodeEqualTo(String value) {
            addCriterion("newscode =", value, "newscode");
            return (Criteria) this;
        }

        public Criteria andNewscodeNotEqualTo(String value) {
            addCriterion("newscode <>", value, "newscode");
            return (Criteria) this;
        }

        public Criteria andNewscodeGreaterThan(String value) {
            addCriterion("newscode >", value, "newscode");
            return (Criteria) this;
        }

        public Criteria andNewscodeGreaterThanOrEqualTo(String value) {
            addCriterion("newscode >=", value, "newscode");
            return (Criteria) this;
        }

        public Criteria andNewscodeLessThan(String value) {
            addCriterion("newscode <", value, "newscode");
            return (Criteria) this;
        }

        public Criteria andNewscodeLessThanOrEqualTo(String value) {
            addCriterion("newscode <=", value, "newscode");
            return (Criteria) this;
        }

        public Criteria andNewscodeLike(String value) {
            addCriterion("newscode like", value, "newscode");
            return (Criteria) this;
        }

        public Criteria andNewscodeNotLike(String value) {
            addCriterion("newscode not like", value, "newscode");
            return (Criteria) this;
        }

        public Criteria andNewscodeIn(List<String> values) {
            addCriterion("newscode in", values, "newscode");
            return (Criteria) this;
        }

        public Criteria andNewscodeNotIn(List<String> values) {
            addCriterion("newscode not in", values, "newscode");
            return (Criteria) this;
        }

        public Criteria andNewscodeBetween(String value1, String value2) {
            addCriterion("newscode between", value1, value2, "newscode");
            return (Criteria) this;
        }

        public Criteria andNewscodeNotBetween(String value1, String value2) {
            addCriterion("newscode not between", value1, value2, "newscode");
            return (Criteria) this;
        }

        public Criteria andNewstitleIsNull() {
            addCriterion("newstitle is null");
            return (Criteria) this;
        }

        public Criteria andNewstitleIsNotNull() {
            addCriterion("newstitle is not null");
            return (Criteria) this;
        }

        public Criteria andNewstitleEqualTo(String value) {
            addCriterion("newstitle =", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotEqualTo(String value) {
            addCriterion("newstitle <>", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleGreaterThan(String value) {
            addCriterion("newstitle >", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleGreaterThanOrEqualTo(String value) {
            addCriterion("newstitle >=", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleLessThan(String value) {
            addCriterion("newstitle <", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleLessThanOrEqualTo(String value) {
            addCriterion("newstitle <=", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleLike(String value) {
            addCriterion("newstitle like", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotLike(String value) {
            addCriterion("newstitle not like", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleIn(List<String> values) {
            addCriterion("newstitle in", values, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotIn(List<String> values) {
            addCriterion("newstitle not in", values, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleBetween(String value1, String value2) {
            addCriterion("newstitle between", value1, value2, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotBetween(String value1, String value2) {
            addCriterion("newstitle not between", value1, value2, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewsdateIsNull() {
            addCriterion("newsdate is null");
            return (Criteria) this;
        }

        public Criteria andNewsdateIsNotNull() {
            addCriterion("newsdate is not null");
            return (Criteria) this;
        }

        public Criteria andNewsdateEqualTo(Date value) {
            addCriterion("newsdate =", value, "newsdate");
            return (Criteria) this;
        }

        public Criteria andNewsdateNotEqualTo(Date value) {
            addCriterion("newsdate <>", value, "newsdate");
            return (Criteria) this;
        }

        public Criteria andNewsdateGreaterThan(Date value) {
            addCriterion("newsdate >", value, "newsdate");
            return (Criteria) this;
        }

        public Criteria andNewsdateGreaterThanOrEqualTo(Date value) {
            addCriterion("newsdate >=", value, "newsdate");
            return (Criteria) this;
        }

        public Criteria andNewsdateLessThan(Date value) {
            addCriterion("newsdate <", value, "newsdate");
            return (Criteria) this;
        }

        public Criteria andNewsdateLessThanOrEqualTo(Date value) {
            addCriterion("newsdate <=", value, "newsdate");
            return (Criteria) this;
        }

        public Criteria andNewsdateIn(List<Date> values) {
            addCriterion("newsdate in", values, "newsdate");
            return (Criteria) this;
        }

        public Criteria andNewsdateNotIn(List<Date> values) {
            addCriterion("newsdate not in", values, "newsdate");
            return (Criteria) this;
        }

        public Criteria andNewsdateBetween(Date value1, Date value2) {
            addCriterion("newsdate between", value1, value2, "newsdate");
            return (Criteria) this;
        }

        public Criteria andNewsdateNotBetween(Date value1, Date value2) {
            addCriterion("newsdate not between", value1, value2, "newsdate");
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

        public Criteria andNewscontentIsNull() {
            addCriterion("newscontent is null");
            return (Criteria) this;
        }

        public Criteria andNewscontentIsNotNull() {
            addCriterion("newscontent is not null");
            return (Criteria) this;
        }

        public Criteria andNewscontentEqualTo(String value) {
            addCriterion("newscontent =", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentNotEqualTo(String value) {
            addCriterion("newscontent <>", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentGreaterThan(String value) {
            addCriterion("newscontent >", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentGreaterThanOrEqualTo(String value) {
            addCriterion("newscontent >=", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentLessThan(String value) {
            addCriterion("newscontent <", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentLessThanOrEqualTo(String value) {
            addCriterion("newscontent <=", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentLike(String value) {
            addCriterion("newscontent like", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentNotLike(String value) {
            addCriterion("newscontent not like", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentIn(List<String> values) {
            addCriterion("newscontent in", values, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentNotIn(List<String> values) {
            addCriterion("newscontent not in", values, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentBetween(String value1, String value2) {
            addCriterion("newscontent between", value1, value2, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentNotBetween(String value1, String value2) {
            addCriterion("newscontent not between", value1, value2, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewspictureIsNull() {
            addCriterion("newspicture is null");
            return (Criteria) this;
        }

        public Criteria andNewspictureIsNotNull() {
            addCriterion("newspicture is not null");
            return (Criteria) this;
        }

        public Criteria andNewspictureEqualTo(String value) {
            addCriterion("newspicture =", value, "newspicture");
            return (Criteria) this;
        }

        public Criteria andNewspictureNotEqualTo(String value) {
            addCriterion("newspicture <>", value, "newspicture");
            return (Criteria) this;
        }

        public Criteria andNewspictureGreaterThan(String value) {
            addCriterion("newspicture >", value, "newspicture");
            return (Criteria) this;
        }

        public Criteria andNewspictureGreaterThanOrEqualTo(String value) {
            addCriterion("newspicture >=", value, "newspicture");
            return (Criteria) this;
        }

        public Criteria andNewspictureLessThan(String value) {
            addCriterion("newspicture <", value, "newspicture");
            return (Criteria) this;
        }

        public Criteria andNewspictureLessThanOrEqualTo(String value) {
            addCriterion("newspicture <=", value, "newspicture");
            return (Criteria) this;
        }

        public Criteria andNewspictureLike(String value) {
            addCriterion("newspicture like", value, "newspicture");
            return (Criteria) this;
        }

        public Criteria andNewspictureNotLike(String value) {
            addCriterion("newspicture not like", value, "newspicture");
            return (Criteria) this;
        }

        public Criteria andNewspictureIn(List<String> values) {
            addCriterion("newspicture in", values, "newspicture");
            return (Criteria) this;
        }

        public Criteria andNewspictureNotIn(List<String> values) {
            addCriterion("newspicture not in", values, "newspicture");
            return (Criteria) this;
        }

        public Criteria andNewspictureBetween(String value1, String value2) {
            addCriterion("newspicture between", value1, value2, "newspicture");
            return (Criteria) this;
        }

        public Criteria andNewspictureNotBetween(String value1, String value2) {
            addCriterion("newspicture not between", value1, value2, "newspicture");
            return (Criteria) this;
        }

        public Criteria andNewsremarksIsNull() {
            addCriterion("newsremarks is null");
            return (Criteria) this;
        }

        public Criteria andNewsremarksIsNotNull() {
            addCriterion("newsremarks is not null");
            return (Criteria) this;
        }

        public Criteria andNewsremarksEqualTo(String value) {
            addCriterion("newsremarks =", value, "newsremarks");
            return (Criteria) this;
        }

        public Criteria andNewsremarksNotEqualTo(String value) {
            addCriterion("newsremarks <>", value, "newsremarks");
            return (Criteria) this;
        }

        public Criteria andNewsremarksGreaterThan(String value) {
            addCriterion("newsremarks >", value, "newsremarks");
            return (Criteria) this;
        }

        public Criteria andNewsremarksGreaterThanOrEqualTo(String value) {
            addCriterion("newsremarks >=", value, "newsremarks");
            return (Criteria) this;
        }

        public Criteria andNewsremarksLessThan(String value) {
            addCriterion("newsremarks <", value, "newsremarks");
            return (Criteria) this;
        }

        public Criteria andNewsremarksLessThanOrEqualTo(String value) {
            addCriterion("newsremarks <=", value, "newsremarks");
            return (Criteria) this;
        }

        public Criteria andNewsremarksLike(String value) {
            addCriterion("newsremarks like", value, "newsremarks");
            return (Criteria) this;
        }

        public Criteria andNewsremarksNotLike(String value) {
            addCriterion("newsremarks not like", value, "newsremarks");
            return (Criteria) this;
        }

        public Criteria andNewsremarksIn(List<String> values) {
            addCriterion("newsremarks in", values, "newsremarks");
            return (Criteria) this;
        }

        public Criteria andNewsremarksNotIn(List<String> values) {
            addCriterion("newsremarks not in", values, "newsremarks");
            return (Criteria) this;
        }

        public Criteria andNewsremarksBetween(String value1, String value2) {
            addCriterion("newsremarks between", value1, value2, "newsremarks");
            return (Criteria) this;
        }

        public Criteria andNewsremarksNotBetween(String value1, String value2) {
            addCriterion("newsremarks not between", value1, value2, "newsremarks");
            return (Criteria) this;
        }

        public Criteria andIscommentIsNull() {
            addCriterion("iscomment is null");
            return (Criteria) this;
        }

        public Criteria andIscommentIsNotNull() {
            addCriterion("iscomment is not null");
            return (Criteria) this;
        }

        public Criteria andIscommentEqualTo(String value) {
            addCriterion("iscomment =", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentNotEqualTo(String value) {
            addCriterion("iscomment <>", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentGreaterThan(String value) {
            addCriterion("iscomment >", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentGreaterThanOrEqualTo(String value) {
            addCriterion("iscomment >=", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentLessThan(String value) {
            addCriterion("iscomment <", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentLessThanOrEqualTo(String value) {
            addCriterion("iscomment <=", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentLike(String value) {
            addCriterion("iscomment like", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentNotLike(String value) {
            addCriterion("iscomment not like", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentIn(List<String> values) {
            addCriterion("iscomment in", values, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentNotIn(List<String> values) {
            addCriterion("iscomment not in", values, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentBetween(String value1, String value2) {
            addCriterion("iscomment between", value1, value2, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentNotBetween(String value1, String value2) {
            addCriterion("iscomment not between", value1, value2, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIstopIsNull() {
            addCriterion("istop is null");
            return (Criteria) this;
        }

        public Criteria andIstopIsNotNull() {
            addCriterion("istop is not null");
            return (Criteria) this;
        }

        public Criteria andIstopEqualTo(String value) {
            addCriterion("istop =", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotEqualTo(String value) {
            addCriterion("istop <>", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThan(String value) {
            addCriterion("istop >", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThanOrEqualTo(String value) {
            addCriterion("istop >=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThan(String value) {
            addCriterion("istop <", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThanOrEqualTo(String value) {
            addCriterion("istop <=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLike(String value) {
            addCriterion("istop like", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotLike(String value) {
            addCriterion("istop not like", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopIn(List<String> values) {
            addCriterion("istop in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotIn(List<String> values) {
            addCriterion("istop not in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopBetween(String value1, String value2) {
            addCriterion("istop between", value1, value2, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotBetween(String value1, String value2) {
            addCriterion("istop not between", value1, value2, "istop");
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