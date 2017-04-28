package com.yongyou.iSupport.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IsCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IsCommentExample() {
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

        public Criteria andPkCommentIsNull() {
            addCriterion("pk_comment is null");
            return (Criteria) this;
        }

        public Criteria andPkCommentIsNotNull() {
            addCriterion("pk_comment is not null");
            return (Criteria) this;
        }

        public Criteria andPkCommentEqualTo(Integer value) {
            addCriterion("pk_comment =", value, "pkComment");
            return (Criteria) this;
        }

        public Criteria andPkCommentNotEqualTo(Integer value) {
            addCriterion("pk_comment <>", value, "pkComment");
            return (Criteria) this;
        }

        public Criteria andPkCommentGreaterThan(Integer value) {
            addCriterion("pk_comment >", value, "pkComment");
            return (Criteria) this;
        }

        public Criteria andPkCommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_comment >=", value, "pkComment");
            return (Criteria) this;
        }

        public Criteria andPkCommentLessThan(Integer value) {
            addCriterion("pk_comment <", value, "pkComment");
            return (Criteria) this;
        }

        public Criteria andPkCommentLessThanOrEqualTo(Integer value) {
            addCriterion("pk_comment <=", value, "pkComment");
            return (Criteria) this;
        }

        public Criteria andPkCommentIn(List<Integer> values) {
            addCriterion("pk_comment in", values, "pkComment");
            return (Criteria) this;
        }

        public Criteria andPkCommentNotIn(List<Integer> values) {
            addCriterion("pk_comment not in", values, "pkComment");
            return (Criteria) this;
        }

        public Criteria andPkCommentBetween(Integer value1, Integer value2) {
            addCriterion("pk_comment between", value1, value2, "pkComment");
            return (Criteria) this;
        }

        public Criteria andPkCommentNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_comment not between", value1, value2, "pkComment");
            return (Criteria) this;
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

        public Criteria andCommentcodeIsNull() {
            addCriterion("commentcode is null");
            return (Criteria) this;
        }

        public Criteria andCommentcodeIsNotNull() {
            addCriterion("commentcode is not null");
            return (Criteria) this;
        }

        public Criteria andCommentcodeEqualTo(String value) {
            addCriterion("commentcode =", value, "commentcode");
            return (Criteria) this;
        }

        public Criteria andCommentcodeNotEqualTo(String value) {
            addCriterion("commentcode <>", value, "commentcode");
            return (Criteria) this;
        }

        public Criteria andCommentcodeGreaterThan(String value) {
            addCriterion("commentcode >", value, "commentcode");
            return (Criteria) this;
        }

        public Criteria andCommentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("commentcode >=", value, "commentcode");
            return (Criteria) this;
        }

        public Criteria andCommentcodeLessThan(String value) {
            addCriterion("commentcode <", value, "commentcode");
            return (Criteria) this;
        }

        public Criteria andCommentcodeLessThanOrEqualTo(String value) {
            addCriterion("commentcode <=", value, "commentcode");
            return (Criteria) this;
        }

        public Criteria andCommentcodeLike(String value) {
            addCriterion("commentcode like", value, "commentcode");
            return (Criteria) this;
        }

        public Criteria andCommentcodeNotLike(String value) {
            addCriterion("commentcode not like", value, "commentcode");
            return (Criteria) this;
        }

        public Criteria andCommentcodeIn(List<String> values) {
            addCriterion("commentcode in", values, "commentcode");
            return (Criteria) this;
        }

        public Criteria andCommentcodeNotIn(List<String> values) {
            addCriterion("commentcode not in", values, "commentcode");
            return (Criteria) this;
        }

        public Criteria andCommentcodeBetween(String value1, String value2) {
            addCriterion("commentcode between", value1, value2, "commentcode");
            return (Criteria) this;
        }

        public Criteria andCommentcodeNotBetween(String value1, String value2) {
            addCriterion("commentcode not between", value1, value2, "commentcode");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNull() {
            addCriterion("usercode is null");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNotNull() {
            addCriterion("usercode is not null");
            return (Criteria) this;
        }

        public Criteria andUsercodeEqualTo(String value) {
            addCriterion("usercode =", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotEqualTo(String value) {
            addCriterion("usercode <>", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThan(String value) {
            addCriterion("usercode >", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThanOrEqualTo(String value) {
            addCriterion("usercode >=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThan(String value) {
            addCriterion("usercode <", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThanOrEqualTo(String value) {
            addCriterion("usercode <=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLike(String value) {
            addCriterion("usercode like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotLike(String value) {
            addCriterion("usercode not like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeIn(List<String> values) {
            addCriterion("usercode in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotIn(List<String> values) {
            addCriterion("usercode not in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeBetween(String value1, String value2) {
            addCriterion("usercode between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotBetween(String value1, String value2) {
            addCriterion("usercode not between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createDate not between", value1, value2, "createdate");
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