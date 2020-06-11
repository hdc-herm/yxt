package com.hdc.yxt.entity;

import java.util.ArrayList;
import java.util.List;

public class BuissnessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuissnessExample() {
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

        public Criteria andClassidIsNull() {
            addCriterion("classId is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("classId is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(Integer value) {
            addCriterion("classId =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(Integer value) {
            addCriterion("classId <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(Integer value) {
            addCriterion("classId >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("classId >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(Integer value) {
            addCriterion("classId <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(Integer value) {
            addCriterion("classId <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<Integer> values) {
            addCriterion("classId in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<Integer> values) {
            addCriterion("classId not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(Integer value1, Integer value2) {
            addCriterion("classId between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(Integer value1, Integer value2) {
            addCriterion("classId not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andSortidIsNull() {
            addCriterion("sortId is null");
            return (Criteria) this;
        }

        public Criteria andSortidIsNotNull() {
            addCriterion("sortId is not null");
            return (Criteria) this;
        }

        public Criteria andSortidEqualTo(Integer value) {
            addCriterion("sortId =", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotEqualTo(Integer value) {
            addCriterion("sortId <>", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidGreaterThan(Integer value) {
            addCriterion("sortId >", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sortId >=", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidLessThan(Integer value) {
            addCriterion("sortId <", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidLessThanOrEqualTo(Integer value) {
            addCriterion("sortId <=", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidIn(List<Integer> values) {
            addCriterion("sortId in", values, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotIn(List<Integer> values) {
            addCriterion("sortId not in", values, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidBetween(Integer value1, Integer value2) {
            addCriterion("sortId between", value1, value2, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotBetween(Integer value1, Integer value2) {
            addCriterion("sortId not between", value1, value2, "sortid");
            return (Criteria) this;
        }

        public Criteria andDirectionidIsNull() {
            addCriterion("directionId is null");
            return (Criteria) this;
        }

        public Criteria andDirectionidIsNotNull() {
            addCriterion("directionId is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionidEqualTo(Integer value) {
            addCriterion("directionId =", value, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidNotEqualTo(Integer value) {
            addCriterion("directionId <>", value, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidGreaterThan(Integer value) {
            addCriterion("directionId >", value, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("directionId >=", value, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidLessThan(Integer value) {
            addCriterion("directionId <", value, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidLessThanOrEqualTo(Integer value) {
            addCriterion("directionId <=", value, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidIn(List<Integer> values) {
            addCriterion("directionId in", values, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidNotIn(List<Integer> values) {
            addCriterion("directionId not in", values, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidBetween(Integer value1, Integer value2) {
            addCriterion("directionId between", value1, value2, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidNotBetween(Integer value1, Integer value2) {
            addCriterion("directionId not between", value1, value2, "directionid");
            return (Criteria) this;
        }

        public Criteria andBuissnessimplIsNull() {
            addCriterion("buissnessImpl is null");
            return (Criteria) this;
        }

        public Criteria andBuissnessimplIsNotNull() {
            addCriterion("buissnessImpl is not null");
            return (Criteria) this;
        }

        public Criteria andBuissnessimplEqualTo(String value) {
            addCriterion("buissnessImpl =", value, "buissnessimpl");
            return (Criteria) this;
        }

        public Criteria andBuissnessimplNotEqualTo(String value) {
            addCriterion("buissnessImpl <>", value, "buissnessimpl");
            return (Criteria) this;
        }

        public Criteria andBuissnessimplGreaterThan(String value) {
            addCriterion("buissnessImpl >", value, "buissnessimpl");
            return (Criteria) this;
        }

        public Criteria andBuissnessimplGreaterThanOrEqualTo(String value) {
            addCriterion("buissnessImpl >=", value, "buissnessimpl");
            return (Criteria) this;
        }

        public Criteria andBuissnessimplLessThan(String value) {
            addCriterion("buissnessImpl <", value, "buissnessimpl");
            return (Criteria) this;
        }

        public Criteria andBuissnessimplLessThanOrEqualTo(String value) {
            addCriterion("buissnessImpl <=", value, "buissnessimpl");
            return (Criteria) this;
        }

        public Criteria andBuissnessimplLike(String value) {
            addCriterion("buissnessImpl like", value, "buissnessimpl");
            return (Criteria) this;
        }

        public Criteria andBuissnessimplNotLike(String value) {
            addCriterion("buissnessImpl not like", value, "buissnessimpl");
            return (Criteria) this;
        }

        public Criteria andBuissnessimplIn(List<String> values) {
            addCriterion("buissnessImpl in", values, "buissnessimpl");
            return (Criteria) this;
        }

        public Criteria andBuissnessimplNotIn(List<String> values) {
            addCriterion("buissnessImpl not in", values, "buissnessimpl");
            return (Criteria) this;
        }

        public Criteria andBuissnessimplBetween(String value1, String value2) {
            addCriterion("buissnessImpl between", value1, value2, "buissnessimpl");
            return (Criteria) this;
        }

        public Criteria andBuissnessimplNotBetween(String value1, String value2) {
            addCriterion("buissnessImpl not between", value1, value2, "buissnessimpl");
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