package com.yongyou.iSupport.entity;

import java.util.ArrayList;
import java.util.List;

public class IsBShanxiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IsBShanxiExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andNewstypeIsNull() {
            addCriterion("newstype is null");
            return (Criteria) this;
        }

        public Criteria andNewstypeIsNotNull() {
            addCriterion("newstype is not null");
            return (Criteria) this;
        }

        public Criteria andNewstypeEqualTo(String value) {
            addCriterion("newstype =", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeNotEqualTo(String value) {
            addCriterion("newstype <>", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeGreaterThan(String value) {
            addCriterion("newstype >", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeGreaterThanOrEqualTo(String value) {
            addCriterion("newstype >=", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeLessThan(String value) {
            addCriterion("newstype <", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeLessThanOrEqualTo(String value) {
            addCriterion("newstype <=", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeLike(String value) {
            addCriterion("newstype like", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeNotLike(String value) {
            addCriterion("newstype not like", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeIn(List<String> values) {
            addCriterion("newstype in", values, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeNotIn(List<String> values) {
            addCriterion("newstype not in", values, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeBetween(String value1, String value2) {
            addCriterion("newstype between", value1, value2, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeNotBetween(String value1, String value2) {
            addCriterion("newstype not between", value1, value2, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewsareaIsNull() {
            addCriterion("newsarea is null");
            return (Criteria) this;
        }

        public Criteria andNewsareaIsNotNull() {
            addCriterion("newsarea is not null");
            return (Criteria) this;
        }

        public Criteria andNewsareaEqualTo(String value) {
            addCriterion("newsarea =", value, "newsarea");
            return (Criteria) this;
        }

        public Criteria andNewsareaNotEqualTo(String value) {
            addCriterion("newsarea <>", value, "newsarea");
            return (Criteria) this;
        }

        public Criteria andNewsareaGreaterThan(String value) {
            addCriterion("newsarea >", value, "newsarea");
            return (Criteria) this;
        }

        public Criteria andNewsareaGreaterThanOrEqualTo(String value) {
            addCriterion("newsarea >=", value, "newsarea");
            return (Criteria) this;
        }

        public Criteria andNewsareaLessThan(String value) {
            addCriterion("newsarea <", value, "newsarea");
            return (Criteria) this;
        }

        public Criteria andNewsareaLessThanOrEqualTo(String value) {
            addCriterion("newsarea <=", value, "newsarea");
            return (Criteria) this;
        }

        public Criteria andNewsareaLike(String value) {
            addCriterion("newsarea like", value, "newsarea");
            return (Criteria) this;
        }

        public Criteria andNewsareaNotLike(String value) {
            addCriterion("newsarea not like", value, "newsarea");
            return (Criteria) this;
        }

        public Criteria andNewsareaIn(List<String> values) {
            addCriterion("newsarea in", values, "newsarea");
            return (Criteria) this;
        }

        public Criteria andNewsareaNotIn(List<String> values) {
            addCriterion("newsarea not in", values, "newsarea");
            return (Criteria) this;
        }

        public Criteria andNewsareaBetween(String value1, String value2) {
            addCriterion("newsarea between", value1, value2, "newsarea");
            return (Criteria) this;
        }

        public Criteria andNewsareaNotBetween(String value1, String value2) {
            addCriterion("newsarea not between", value1, value2, "newsarea");
            return (Criteria) this;
        }

        public Criteria andNewsaddressIsNull() {
            addCriterion("newsaddress is null");
            return (Criteria) this;
        }

        public Criteria andNewsaddressIsNotNull() {
            addCriterion("newsaddress is not null");
            return (Criteria) this;
        }

        public Criteria andNewsaddressEqualTo(String value) {
            addCriterion("newsaddress =", value, "newsaddress");
            return (Criteria) this;
        }

        public Criteria andNewsaddressNotEqualTo(String value) {
            addCriterion("newsaddress <>", value, "newsaddress");
            return (Criteria) this;
        }

        public Criteria andNewsaddressGreaterThan(String value) {
            addCriterion("newsaddress >", value, "newsaddress");
            return (Criteria) this;
        }

        public Criteria andNewsaddressGreaterThanOrEqualTo(String value) {
            addCriterion("newsaddress >=", value, "newsaddress");
            return (Criteria) this;
        }

        public Criteria andNewsaddressLessThan(String value) {
            addCriterion("newsaddress <", value, "newsaddress");
            return (Criteria) this;
        }

        public Criteria andNewsaddressLessThanOrEqualTo(String value) {
            addCriterion("newsaddress <=", value, "newsaddress");
            return (Criteria) this;
        }

        public Criteria andNewsaddressLike(String value) {
            addCriterion("newsaddress like", value, "newsaddress");
            return (Criteria) this;
        }

        public Criteria andNewsaddressNotLike(String value) {
            addCriterion("newsaddress not like", value, "newsaddress");
            return (Criteria) this;
        }

        public Criteria andNewsaddressIn(List<String> values) {
            addCriterion("newsaddress in", values, "newsaddress");
            return (Criteria) this;
        }

        public Criteria andNewsaddressNotIn(List<String> values) {
            addCriterion("newsaddress not in", values, "newsaddress");
            return (Criteria) this;
        }

        public Criteria andNewsaddressBetween(String value1, String value2) {
            addCriterion("newsaddress between", value1, value2, "newsaddress");
            return (Criteria) this;
        }

        public Criteria andNewsaddressNotBetween(String value1, String value2) {
            addCriterion("newsaddress not between", value1, value2, "newsaddress");
            return (Criteria) this;
        }

        public Criteria andNewssourceIsNull() {
            addCriterion("newssource is null");
            return (Criteria) this;
        }

        public Criteria andNewssourceIsNotNull() {
            addCriterion("newssource is not null");
            return (Criteria) this;
        }

        public Criteria andNewssourceEqualTo(String value) {
            addCriterion("newssource =", value, "newssource");
            return (Criteria) this;
        }

        public Criteria andNewssourceNotEqualTo(String value) {
            addCriterion("newssource <>", value, "newssource");
            return (Criteria) this;
        }

        public Criteria andNewssourceGreaterThan(String value) {
            addCriterion("newssource >", value, "newssource");
            return (Criteria) this;
        }

        public Criteria andNewssourceGreaterThanOrEqualTo(String value) {
            addCriterion("newssource >=", value, "newssource");
            return (Criteria) this;
        }

        public Criteria andNewssourceLessThan(String value) {
            addCriterion("newssource <", value, "newssource");
            return (Criteria) this;
        }

        public Criteria andNewssourceLessThanOrEqualTo(String value) {
            addCriterion("newssource <=", value, "newssource");
            return (Criteria) this;
        }

        public Criteria andNewssourceLike(String value) {
            addCriterion("newssource like", value, "newssource");
            return (Criteria) this;
        }

        public Criteria andNewssourceNotLike(String value) {
            addCriterion("newssource not like", value, "newssource");
            return (Criteria) this;
        }

        public Criteria andNewssourceIn(List<String> values) {
            addCriterion("newssource in", values, "newssource");
            return (Criteria) this;
        }

        public Criteria andNewssourceNotIn(List<String> values) {
            addCriterion("newssource not in", values, "newssource");
            return (Criteria) this;
        }

        public Criteria andNewssourceBetween(String value1, String value2) {
            addCriterion("newssource between", value1, value2, "newssource");
            return (Criteria) this;
        }

        public Criteria andNewssourceNotBetween(String value1, String value2) {
            addCriterion("newssource not between", value1, value2, "newssource");
            return (Criteria) this;
        }

        public Criteria andGirlnumberIsNull() {
            addCriterion("girlnumber is null");
            return (Criteria) this;
        }

        public Criteria andGirlnumberIsNotNull() {
            addCriterion("girlnumber is not null");
            return (Criteria) this;
        }

        public Criteria andGirlnumberEqualTo(String value) {
            addCriterion("girlnumber =", value, "girlnumber");
            return (Criteria) this;
        }

        public Criteria andGirlnumberNotEqualTo(String value) {
            addCriterion("girlnumber <>", value, "girlnumber");
            return (Criteria) this;
        }

        public Criteria andGirlnumberGreaterThan(String value) {
            addCriterion("girlnumber >", value, "girlnumber");
            return (Criteria) this;
        }

        public Criteria andGirlnumberGreaterThanOrEqualTo(String value) {
            addCriterion("girlnumber >=", value, "girlnumber");
            return (Criteria) this;
        }

        public Criteria andGirlnumberLessThan(String value) {
            addCriterion("girlnumber <", value, "girlnumber");
            return (Criteria) this;
        }

        public Criteria andGirlnumberLessThanOrEqualTo(String value) {
            addCriterion("girlnumber <=", value, "girlnumber");
            return (Criteria) this;
        }

        public Criteria andGirlnumberLike(String value) {
            addCriterion("girlnumber like", value, "girlnumber");
            return (Criteria) this;
        }

        public Criteria andGirlnumberNotLike(String value) {
            addCriterion("girlnumber not like", value, "girlnumber");
            return (Criteria) this;
        }

        public Criteria andGirlnumberIn(List<String> values) {
            addCriterion("girlnumber in", values, "girlnumber");
            return (Criteria) this;
        }

        public Criteria andGirlnumberNotIn(List<String> values) {
            addCriterion("girlnumber not in", values, "girlnumber");
            return (Criteria) this;
        }

        public Criteria andGirlnumberBetween(String value1, String value2) {
            addCriterion("girlnumber between", value1, value2, "girlnumber");
            return (Criteria) this;
        }

        public Criteria andGirlnumberNotBetween(String value1, String value2) {
            addCriterion("girlnumber not between", value1, value2, "girlnumber");
            return (Criteria) this;
        }

        public Criteria andGirlageIsNull() {
            addCriterion("girlage is null");
            return (Criteria) this;
        }

        public Criteria andGirlageIsNotNull() {
            addCriterion("girlage is not null");
            return (Criteria) this;
        }

        public Criteria andGirlageEqualTo(String value) {
            addCriterion("girlage =", value, "girlage");
            return (Criteria) this;
        }

        public Criteria andGirlageNotEqualTo(String value) {
            addCriterion("girlage <>", value, "girlage");
            return (Criteria) this;
        }

        public Criteria andGirlageGreaterThan(String value) {
            addCriterion("girlage >", value, "girlage");
            return (Criteria) this;
        }

        public Criteria andGirlageGreaterThanOrEqualTo(String value) {
            addCriterion("girlage >=", value, "girlage");
            return (Criteria) this;
        }

        public Criteria andGirlageLessThan(String value) {
            addCriterion("girlage <", value, "girlage");
            return (Criteria) this;
        }

        public Criteria andGirlageLessThanOrEqualTo(String value) {
            addCriterion("girlage <=", value, "girlage");
            return (Criteria) this;
        }

        public Criteria andGirlageLike(String value) {
            addCriterion("girlage like", value, "girlage");
            return (Criteria) this;
        }

        public Criteria andGirlageNotLike(String value) {
            addCriterion("girlage not like", value, "girlage");
            return (Criteria) this;
        }

        public Criteria andGirlageIn(List<String> values) {
            addCriterion("girlage in", values, "girlage");
            return (Criteria) this;
        }

        public Criteria andGirlageNotIn(List<String> values) {
            addCriterion("girlage not in", values, "girlage");
            return (Criteria) this;
        }

        public Criteria andGirlageBetween(String value1, String value2) {
            addCriterion("girlage between", value1, value2, "girlage");
            return (Criteria) this;
        }

        public Criteria andGirlageNotBetween(String value1, String value2) {
            addCriterion("girlage not between", value1, value2, "girlage");
            return (Criteria) this;
        }

        public Criteria andQualityIsNull() {
            addCriterion("quality is null");
            return (Criteria) this;
        }

        public Criteria andQualityIsNotNull() {
            addCriterion("quality is not null");
            return (Criteria) this;
        }

        public Criteria andQualityEqualTo(String value) {
            addCriterion("quality =", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotEqualTo(String value) {
            addCriterion("quality <>", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityGreaterThan(String value) {
            addCriterion("quality >", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityGreaterThanOrEqualTo(String value) {
            addCriterion("quality >=", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityLessThan(String value) {
            addCriterion("quality <", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityLessThanOrEqualTo(String value) {
            addCriterion("quality <=", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityLike(String value) {
            addCriterion("quality like", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotLike(String value) {
            addCriterion("quality not like", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityIn(List<String> values) {
            addCriterion("quality in", values, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotIn(List<String> values) {
            addCriterion("quality not in", values, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityBetween(String value1, String value2) {
            addCriterion("quality between", value1, value2, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotBetween(String value1, String value2) {
            addCriterion("quality not between", value1, value2, "quality");
            return (Criteria) this;
        }

        public Criteria andAppearanceIsNull() {
            addCriterion("appearance is null");
            return (Criteria) this;
        }

        public Criteria andAppearanceIsNotNull() {
            addCriterion("appearance is not null");
            return (Criteria) this;
        }

        public Criteria andAppearanceEqualTo(String value) {
            addCriterion("appearance =", value, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceNotEqualTo(String value) {
            addCriterion("appearance <>", value, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceGreaterThan(String value) {
            addCriterion("appearance >", value, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceGreaterThanOrEqualTo(String value) {
            addCriterion("appearance >=", value, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceLessThan(String value) {
            addCriterion("appearance <", value, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceLessThanOrEqualTo(String value) {
            addCriterion("appearance <=", value, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceLike(String value) {
            addCriterion("appearance like", value, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceNotLike(String value) {
            addCriterion("appearance not like", value, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceIn(List<String> values) {
            addCriterion("appearance in", values, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceNotIn(List<String> values) {
            addCriterion("appearance not in", values, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceBetween(String value1, String value2) {
            addCriterion("appearance between", value1, value2, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceNotBetween(String value1, String value2) {
            addCriterion("appearance not between", value1, value2, "appearance");
            return (Criteria) this;
        }

        public Criteria andProjectIsNull() {
            addCriterion("project is null");
            return (Criteria) this;
        }

        public Criteria andProjectIsNotNull() {
            addCriterion("project is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEqualTo(String value) {
            addCriterion("project =", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotEqualTo(String value) {
            addCriterion("project <>", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThan(String value) {
            addCriterion("project >", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThanOrEqualTo(String value) {
            addCriterion("project >=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThan(String value) {
            addCriterion("project <", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThanOrEqualTo(String value) {
            addCriterion("project <=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLike(String value) {
            addCriterion("project like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotLike(String value) {
            addCriterion("project not like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectIn(List<String> values) {
            addCriterion("project in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotIn(List<String> values) {
            addCriterion("project not in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectBetween(String value1, String value2) {
            addCriterion("project between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotBetween(String value1, String value2) {
            addCriterion("project not between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andOpentimeIsNull() {
            addCriterion("opentime is null");
            return (Criteria) this;
        }

        public Criteria andOpentimeIsNotNull() {
            addCriterion("opentime is not null");
            return (Criteria) this;
        }

        public Criteria andOpentimeEqualTo(String value) {
            addCriterion("opentime =", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotEqualTo(String value) {
            addCriterion("opentime <>", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeGreaterThan(String value) {
            addCriterion("opentime >", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeGreaterThanOrEqualTo(String value) {
            addCriterion("opentime >=", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeLessThan(String value) {
            addCriterion("opentime <", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeLessThanOrEqualTo(String value) {
            addCriterion("opentime <=", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeLike(String value) {
            addCriterion("opentime like", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotLike(String value) {
            addCriterion("opentime not like", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeIn(List<String> values) {
            addCriterion("opentime in", values, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotIn(List<String> values) {
            addCriterion("opentime not in", values, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeBetween(String value1, String value2) {
            addCriterion("opentime between", value1, value2, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotBetween(String value1, String value2) {
            addCriterion("opentime not between", value1, value2, "opentime");
            return (Criteria) this;
        }

        public Criteria andEnvironmentIsNull() {
            addCriterion("environment is null");
            return (Criteria) this;
        }

        public Criteria andEnvironmentIsNotNull() {
            addCriterion("environment is not null");
            return (Criteria) this;
        }

        public Criteria andEnvironmentEqualTo(String value) {
            addCriterion("environment =", value, "environment");
            return (Criteria) this;
        }

        public Criteria andEnvironmentNotEqualTo(String value) {
            addCriterion("environment <>", value, "environment");
            return (Criteria) this;
        }

        public Criteria andEnvironmentGreaterThan(String value) {
            addCriterion("environment >", value, "environment");
            return (Criteria) this;
        }

        public Criteria andEnvironmentGreaterThanOrEqualTo(String value) {
            addCriterion("environment >=", value, "environment");
            return (Criteria) this;
        }

        public Criteria andEnvironmentLessThan(String value) {
            addCriterion("environment <", value, "environment");
            return (Criteria) this;
        }

        public Criteria andEnvironmentLessThanOrEqualTo(String value) {
            addCriterion("environment <=", value, "environment");
            return (Criteria) this;
        }

        public Criteria andEnvironmentLike(String value) {
            addCriterion("environment like", value, "environment");
            return (Criteria) this;
        }

        public Criteria andEnvironmentNotLike(String value) {
            addCriterion("environment not like", value, "environment");
            return (Criteria) this;
        }

        public Criteria andEnvironmentIn(List<String> values) {
            addCriterion("environment in", values, "environment");
            return (Criteria) this;
        }

        public Criteria andEnvironmentNotIn(List<String> values) {
            addCriterion("environment not in", values, "environment");
            return (Criteria) this;
        }

        public Criteria andEnvironmentBetween(String value1, String value2) {
            addCriterion("environment between", value1, value2, "environment");
            return (Criteria) this;
        }

        public Criteria andEnvironmentNotBetween(String value1, String value2) {
            addCriterion("environment not between", value1, value2, "environment");
            return (Criteria) this;
        }

        public Criteria andSafetyIsNull() {
            addCriterion("safety is null");
            return (Criteria) this;
        }

        public Criteria andSafetyIsNotNull() {
            addCriterion("safety is not null");
            return (Criteria) this;
        }

        public Criteria andSafetyEqualTo(String value) {
            addCriterion("safety =", value, "safety");
            return (Criteria) this;
        }

        public Criteria andSafetyNotEqualTo(String value) {
            addCriterion("safety <>", value, "safety");
            return (Criteria) this;
        }

        public Criteria andSafetyGreaterThan(String value) {
            addCriterion("safety >", value, "safety");
            return (Criteria) this;
        }

        public Criteria andSafetyGreaterThanOrEqualTo(String value) {
            addCriterion("safety >=", value, "safety");
            return (Criteria) this;
        }

        public Criteria andSafetyLessThan(String value) {
            addCriterion("safety <", value, "safety");
            return (Criteria) this;
        }

        public Criteria andSafetyLessThanOrEqualTo(String value) {
            addCriterion("safety <=", value, "safety");
            return (Criteria) this;
        }

        public Criteria andSafetyLike(String value) {
            addCriterion("safety like", value, "safety");
            return (Criteria) this;
        }

        public Criteria andSafetyNotLike(String value) {
            addCriterion("safety not like", value, "safety");
            return (Criteria) this;
        }

        public Criteria andSafetyIn(List<String> values) {
            addCriterion("safety in", values, "safety");
            return (Criteria) this;
        }

        public Criteria andSafetyNotIn(List<String> values) {
            addCriterion("safety not in", values, "safety");
            return (Criteria) this;
        }

        public Criteria andSafetyBetween(String value1, String value2) {
            addCriterion("safety between", value1, value2, "safety");
            return (Criteria) this;
        }

        public Criteria andSafetyNotBetween(String value1, String value2) {
            addCriterion("safety not between", value1, value2, "safety");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNull() {
            addCriterion("mobilephone is null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNotNull() {
            addCriterion("mobilephone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneEqualTo(String value) {
            addCriterion("mobilephone =", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotEqualTo(String value) {
            addCriterion("mobilephone <>", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThan(String value) {
            addCriterion("mobilephone >", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("mobilephone >=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThan(String value) {
            addCriterion("mobilephone <", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("mobilephone <=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLike(String value) {
            addCriterion("mobilephone like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotLike(String value) {
            addCriterion("mobilephone not like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIn(List<String> values) {
            addCriterion("mobilephone in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotIn(List<String> values) {
            addCriterion("mobilephone not in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneBetween(String value1, String value2) {
            addCriterion("mobilephone between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotBetween(String value1, String value2) {
            addCriterion("mobilephone not between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andEvaluateIsNull() {
            addCriterion("evaluate is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateIsNotNull() {
            addCriterion("evaluate is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateEqualTo(String value) {
            addCriterion("evaluate =", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateNotEqualTo(String value) {
            addCriterion("evaluate <>", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateGreaterThan(String value) {
            addCriterion("evaluate >", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate >=", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateLessThan(String value) {
            addCriterion("evaluate <", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateLessThanOrEqualTo(String value) {
            addCriterion("evaluate <=", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateLike(String value) {
            addCriterion("evaluate like", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateNotLike(String value) {
            addCriterion("evaluate not like", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateIn(List<String> values) {
            addCriterion("evaluate in", values, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateNotIn(List<String> values) {
            addCriterion("evaluate not in", values, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateBetween(String value1, String value2) {
            addCriterion("evaluate between", value1, value2, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateNotBetween(String value1, String value2) {
            addCriterion("evaluate not between", value1, value2, "evaluate");
            return (Criteria) this;
        }

        public Criteria andNewsremarkIsNull() {
            addCriterion("newsremark is null");
            return (Criteria) this;
        }

        public Criteria andNewsremarkIsNotNull() {
            addCriterion("newsremark is not null");
            return (Criteria) this;
        }

        public Criteria andNewsremarkEqualTo(String value) {
            addCriterion("newsremark =", value, "newsremark");
            return (Criteria) this;
        }

        public Criteria andNewsremarkNotEqualTo(String value) {
            addCriterion("newsremark <>", value, "newsremark");
            return (Criteria) this;
        }

        public Criteria andNewsremarkGreaterThan(String value) {
            addCriterion("newsremark >", value, "newsremark");
            return (Criteria) this;
        }

        public Criteria andNewsremarkGreaterThanOrEqualTo(String value) {
            addCriterion("newsremark >=", value, "newsremark");
            return (Criteria) this;
        }

        public Criteria andNewsremarkLessThan(String value) {
            addCriterion("newsremark <", value, "newsremark");
            return (Criteria) this;
        }

        public Criteria andNewsremarkLessThanOrEqualTo(String value) {
            addCriterion("newsremark <=", value, "newsremark");
            return (Criteria) this;
        }

        public Criteria andNewsremarkLike(String value) {
            addCriterion("newsremark like", value, "newsremark");
            return (Criteria) this;
        }

        public Criteria andNewsremarkNotLike(String value) {
            addCriterion("newsremark not like", value, "newsremark");
            return (Criteria) this;
        }

        public Criteria andNewsremarkIn(List<String> values) {
            addCriterion("newsremark in", values, "newsremark");
            return (Criteria) this;
        }

        public Criteria andNewsremarkNotIn(List<String> values) {
            addCriterion("newsremark not in", values, "newsremark");
            return (Criteria) this;
        }

        public Criteria andNewsremarkBetween(String value1, String value2) {
            addCriterion("newsremark between", value1, value2, "newsremark");
            return (Criteria) this;
        }

        public Criteria andNewsremarkNotBetween(String value1, String value2) {
            addCriterion("newsremark not between", value1, value2, "newsremark");
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