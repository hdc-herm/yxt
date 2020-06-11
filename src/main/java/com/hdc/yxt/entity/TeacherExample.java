package com.hdc.yxt.entity;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeachernameIsNull() {
            addCriterion("teachername is null");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNotNull() {
            addCriterion("teachername is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernameEqualTo(String value) {
            addCriterion("teachername =", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotEqualTo(String value) {
            addCriterion("teachername <>", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThan(String value) {
            addCriterion("teachername >", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThanOrEqualTo(String value) {
            addCriterion("teachername >=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThan(String value) {
            addCriterion("teachername <", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThanOrEqualTo(String value) {
            addCriterion("teachername <=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLike(String value) {
            addCriterion("teachername like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotLike(String value) {
            addCriterion("teachername not like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameIn(List<String> values) {
            addCriterion("teachername in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotIn(List<String> values) {
            addCriterion("teachername not in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameBetween(String value1, String value2) {
            addCriterion("teachername between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotBetween(String value1, String value2) {
            addCriterion("teachername not between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andExpertiseIsNull() {
            addCriterion("expertise is null");
            return (Criteria) this;
        }

        public Criteria andExpertiseIsNotNull() {
            addCriterion("expertise is not null");
            return (Criteria) this;
        }

        public Criteria andExpertiseEqualTo(String value) {
            addCriterion("expertise =", value, "expertise");
            return (Criteria) this;
        }

        public Criteria andExpertiseNotEqualTo(String value) {
            addCriterion("expertise <>", value, "expertise");
            return (Criteria) this;
        }

        public Criteria andExpertiseGreaterThan(String value) {
            addCriterion("expertise >", value, "expertise");
            return (Criteria) this;
        }

        public Criteria andExpertiseGreaterThanOrEqualTo(String value) {
            addCriterion("expertise >=", value, "expertise");
            return (Criteria) this;
        }

        public Criteria andExpertiseLessThan(String value) {
            addCriterion("expertise <", value, "expertise");
            return (Criteria) this;
        }

        public Criteria andExpertiseLessThanOrEqualTo(String value) {
            addCriterion("expertise <=", value, "expertise");
            return (Criteria) this;
        }

        public Criteria andExpertiseLike(String value) {
            addCriterion("expertise like", value, "expertise");
            return (Criteria) this;
        }

        public Criteria andExpertiseNotLike(String value) {
            addCriterion("expertise not like", value, "expertise");
            return (Criteria) this;
        }

        public Criteria andExpertiseIn(List<String> values) {
            addCriterion("expertise in", values, "expertise");
            return (Criteria) this;
        }

        public Criteria andExpertiseNotIn(List<String> values) {
            addCriterion("expertise not in", values, "expertise");
            return (Criteria) this;
        }

        public Criteria andExpertiseBetween(String value1, String value2) {
            addCriterion("expertise between", value1, value2, "expertise");
            return (Criteria) this;
        }

        public Criteria andExpertiseNotBetween(String value1, String value2) {
            addCriterion("expertise not between", value1, value2, "expertise");
            return (Criteria) this;
        }

        public Criteria andExpindustryIsNull() {
            addCriterion("expIndustry is null");
            return (Criteria) this;
        }

        public Criteria andExpindustryIsNotNull() {
            addCriterion("expIndustry is not null");
            return (Criteria) this;
        }

        public Criteria andExpindustryEqualTo(String value) {
            addCriterion("expIndustry =", value, "expindustry");
            return (Criteria) this;
        }

        public Criteria andExpindustryNotEqualTo(String value) {
            addCriterion("expIndustry <>", value, "expindustry");
            return (Criteria) this;
        }

        public Criteria andExpindustryGreaterThan(String value) {
            addCriterion("expIndustry >", value, "expindustry");
            return (Criteria) this;
        }

        public Criteria andExpindustryGreaterThanOrEqualTo(String value) {
            addCriterion("expIndustry >=", value, "expindustry");
            return (Criteria) this;
        }

        public Criteria andExpindustryLessThan(String value) {
            addCriterion("expIndustry <", value, "expindustry");
            return (Criteria) this;
        }

        public Criteria andExpindustryLessThanOrEqualTo(String value) {
            addCriterion("expIndustry <=", value, "expindustry");
            return (Criteria) this;
        }

        public Criteria andExpindustryLike(String value) {
            addCriterion("expIndustry like", value, "expindustry");
            return (Criteria) this;
        }

        public Criteria andExpindustryNotLike(String value) {
            addCriterion("expIndustry not like", value, "expindustry");
            return (Criteria) this;
        }

        public Criteria andExpindustryIn(List<String> values) {
            addCriterion("expIndustry in", values, "expindustry");
            return (Criteria) this;
        }

        public Criteria andExpindustryNotIn(List<String> values) {
            addCriterion("expIndustry not in", values, "expindustry");
            return (Criteria) this;
        }

        public Criteria andExpindustryBetween(String value1, String value2) {
            addCriterion("expIndustry between", value1, value2, "expindustry");
            return (Criteria) this;
        }

        public Criteria andExpindustryNotBetween(String value1, String value2) {
            addCriterion("expIndustry not between", value1, value2, "expindustry");
            return (Criteria) this;
        }

        public Criteria andAddressallIsNull() {
            addCriterion("addressall is null");
            return (Criteria) this;
        }

        public Criteria andAddressallIsNotNull() {
            addCriterion("addressall is not null");
            return (Criteria) this;
        }

        public Criteria andAddressallEqualTo(String value) {
            addCriterion("addressall =", value, "addressall");
            return (Criteria) this;
        }

        public Criteria andAddressallNotEqualTo(String value) {
            addCriterion("addressall <>", value, "addressall");
            return (Criteria) this;
        }

        public Criteria andAddressallGreaterThan(String value) {
            addCriterion("addressall >", value, "addressall");
            return (Criteria) this;
        }

        public Criteria andAddressallGreaterThanOrEqualTo(String value) {
            addCriterion("addressall >=", value, "addressall");
            return (Criteria) this;
        }

        public Criteria andAddressallLessThan(String value) {
            addCriterion("addressall <", value, "addressall");
            return (Criteria) this;
        }

        public Criteria andAddressallLessThanOrEqualTo(String value) {
            addCriterion("addressall <=", value, "addressall");
            return (Criteria) this;
        }

        public Criteria andAddressallLike(String value) {
            addCriterion("addressall like", value, "addressall");
            return (Criteria) this;
        }

        public Criteria andAddressallNotLike(String value) {
            addCriterion("addressall not like", value, "addressall");
            return (Criteria) this;
        }

        public Criteria andAddressallIn(List<String> values) {
            addCriterion("addressall in", values, "addressall");
            return (Criteria) this;
        }

        public Criteria andAddressallNotIn(List<String> values) {
            addCriterion("addressall not in", values, "addressall");
            return (Criteria) this;
        }

        public Criteria andAddressallBetween(String value1, String value2) {
            addCriterion("addressall between", value1, value2, "addressall");
            return (Criteria) this;
        }

        public Criteria andAddressallNotBetween(String value1, String value2) {
            addCriterion("addressall not between", value1, value2, "addressall");
            return (Criteria) this;
        }

        public Criteria andAgreenumIsNull() {
            addCriterion("agreenum is null");
            return (Criteria) this;
        }

        public Criteria andAgreenumIsNotNull() {
            addCriterion("agreenum is not null");
            return (Criteria) this;
        }

        public Criteria andAgreenumEqualTo(Integer value) {
            addCriterion("agreenum =", value, "agreenum");
            return (Criteria) this;
        }

        public Criteria andAgreenumNotEqualTo(Integer value) {
            addCriterion("agreenum <>", value, "agreenum");
            return (Criteria) this;
        }

        public Criteria andAgreenumGreaterThan(Integer value) {
            addCriterion("agreenum >", value, "agreenum");
            return (Criteria) this;
        }

        public Criteria andAgreenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("agreenum >=", value, "agreenum");
            return (Criteria) this;
        }

        public Criteria andAgreenumLessThan(Integer value) {
            addCriterion("agreenum <", value, "agreenum");
            return (Criteria) this;
        }

        public Criteria andAgreenumLessThanOrEqualTo(Integer value) {
            addCriterion("agreenum <=", value, "agreenum");
            return (Criteria) this;
        }

        public Criteria andAgreenumIn(List<Integer> values) {
            addCriterion("agreenum in", values, "agreenum");
            return (Criteria) this;
        }

        public Criteria andAgreenumNotIn(List<Integer> values) {
            addCriterion("agreenum not in", values, "agreenum");
            return (Criteria) this;
        }

        public Criteria andAgreenumBetween(Integer value1, Integer value2) {
            addCriterion("agreenum between", value1, value2, "agreenum");
            return (Criteria) this;
        }

        public Criteria andAgreenumNotBetween(Integer value1, Integer value2) {
            addCriterion("agreenum not between", value1, value2, "agreenum");
            return (Criteria) this;
        }

        public Criteria andComscoreIsNull() {
            addCriterion("comscore is null");
            return (Criteria) this;
        }

        public Criteria andComscoreIsNotNull() {
            addCriterion("comscore is not null");
            return (Criteria) this;
        }

        public Criteria andComscoreEqualTo(Integer value) {
            addCriterion("comscore =", value, "comscore");
            return (Criteria) this;
        }

        public Criteria andComscoreNotEqualTo(Integer value) {
            addCriterion("comscore <>", value, "comscore");
            return (Criteria) this;
        }

        public Criteria andComscoreGreaterThan(Integer value) {
            addCriterion("comscore >", value, "comscore");
            return (Criteria) this;
        }

        public Criteria andComscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("comscore >=", value, "comscore");
            return (Criteria) this;
        }

        public Criteria andComscoreLessThan(Integer value) {
            addCriterion("comscore <", value, "comscore");
            return (Criteria) this;
        }

        public Criteria andComscoreLessThanOrEqualTo(Integer value) {
            addCriterion("comscore <=", value, "comscore");
            return (Criteria) this;
        }

        public Criteria andComscoreIn(List<Integer> values) {
            addCriterion("comscore in", values, "comscore");
            return (Criteria) this;
        }

        public Criteria andComscoreNotIn(List<Integer> values) {
            addCriterion("comscore not in", values, "comscore");
            return (Criteria) this;
        }

        public Criteria andComscoreBetween(Integer value1, Integer value2) {
            addCriterion("comscore between", value1, value2, "comscore");
            return (Criteria) this;
        }

        public Criteria andComscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("comscore not between", value1, value2, "comscore");
            return (Criteria) this;
        }

        public Criteria andTeacherleavalIsNull() {
            addCriterion("teacherleaval is null");
            return (Criteria) this;
        }

        public Criteria andTeacherleavalIsNotNull() {
            addCriterion("teacherleaval is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherleavalEqualTo(Integer value) {
            addCriterion("teacherleaval =", value, "teacherleaval");
            return (Criteria) this;
        }

        public Criteria andTeacherleavalNotEqualTo(Integer value) {
            addCriterion("teacherleaval <>", value, "teacherleaval");
            return (Criteria) this;
        }

        public Criteria andTeacherleavalGreaterThan(Integer value) {
            addCriterion("teacherleaval >", value, "teacherleaval");
            return (Criteria) this;
        }

        public Criteria andTeacherleavalGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacherleaval >=", value, "teacherleaval");
            return (Criteria) this;
        }

        public Criteria andTeacherleavalLessThan(Integer value) {
            addCriterion("teacherleaval <", value, "teacherleaval");
            return (Criteria) this;
        }

        public Criteria andTeacherleavalLessThanOrEqualTo(Integer value) {
            addCriterion("teacherleaval <=", value, "teacherleaval");
            return (Criteria) this;
        }

        public Criteria andTeacherleavalIn(List<Integer> values) {
            addCriterion("teacherleaval in", values, "teacherleaval");
            return (Criteria) this;
        }

        public Criteria andTeacherleavalNotIn(List<Integer> values) {
            addCriterion("teacherleaval not in", values, "teacherleaval");
            return (Criteria) this;
        }

        public Criteria andTeacherleavalBetween(Integer value1, Integer value2) {
            addCriterion("teacherleaval between", value1, value2, "teacherleaval");
            return (Criteria) this;
        }

        public Criteria andTeacherleavalNotBetween(Integer value1, Integer value2) {
            addCriterion("teacherleaval not between", value1, value2, "teacherleaval");
            return (Criteria) this;
        }

        public Criteria andTeacherimplIsNull() {
            addCriterion("teacherImpl is null");
            return (Criteria) this;
        }

        public Criteria andTeacherimplIsNotNull() {
            addCriterion("teacherImpl is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherimplEqualTo(String value) {
            addCriterion("teacherImpl =", value, "teacherimpl");
            return (Criteria) this;
        }

        public Criteria andTeacherimplNotEqualTo(String value) {
            addCriterion("teacherImpl <>", value, "teacherimpl");
            return (Criteria) this;
        }

        public Criteria andTeacherimplGreaterThan(String value) {
            addCriterion("teacherImpl >", value, "teacherimpl");
            return (Criteria) this;
        }

        public Criteria andTeacherimplGreaterThanOrEqualTo(String value) {
            addCriterion("teacherImpl >=", value, "teacherimpl");
            return (Criteria) this;
        }

        public Criteria andTeacherimplLessThan(String value) {
            addCriterion("teacherImpl <", value, "teacherimpl");
            return (Criteria) this;
        }

        public Criteria andTeacherimplLessThanOrEqualTo(String value) {
            addCriterion("teacherImpl <=", value, "teacherimpl");
            return (Criteria) this;
        }

        public Criteria andTeacherimplLike(String value) {
            addCriterion("teacherImpl like", value, "teacherimpl");
            return (Criteria) this;
        }

        public Criteria andTeacherimplNotLike(String value) {
            addCriterion("teacherImpl not like", value, "teacherimpl");
            return (Criteria) this;
        }

        public Criteria andTeacherimplIn(List<String> values) {
            addCriterion("teacherImpl in", values, "teacherimpl");
            return (Criteria) this;
        }

        public Criteria andTeacherimplNotIn(List<String> values) {
            addCriterion("teacherImpl not in", values, "teacherimpl");
            return (Criteria) this;
        }

        public Criteria andTeacherimplBetween(String value1, String value2) {
            addCriterion("teacherImpl between", value1, value2, "teacherimpl");
            return (Criteria) this;
        }

        public Criteria andTeacherimplNotBetween(String value1, String value2) {
            addCriterion("teacherImpl not between", value1, value2, "teacherimpl");
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