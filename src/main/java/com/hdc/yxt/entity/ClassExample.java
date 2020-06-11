package com.hdc.yxt.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassExample() {
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

        public Criteria andClassnameIsNull() {
            addCriterion("classname is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("classname is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("classname =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("classname <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("classname >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("classname >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("classname <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("classname <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("classname like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("classname not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("classname in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("classname not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("classname between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("classname not between", value1, value2, "classname");
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

        public Criteria andClassimplIsNull() {
            addCriterion("classimpl is null");
            return (Criteria) this;
        }

        public Criteria andClassimplIsNotNull() {
            addCriterion("classimpl is not null");
            return (Criteria) this;
        }

        public Criteria andClassimplEqualTo(String value) {
            addCriterion("classimpl =", value, "classimpl");
            return (Criteria) this;
        }

        public Criteria andClassimplNotEqualTo(String value) {
            addCriterion("classimpl <>", value, "classimpl");
            return (Criteria) this;
        }

        public Criteria andClassimplGreaterThan(String value) {
            addCriterion("classimpl >", value, "classimpl");
            return (Criteria) this;
        }

        public Criteria andClassimplGreaterThanOrEqualTo(String value) {
            addCriterion("classimpl >=", value, "classimpl");
            return (Criteria) this;
        }

        public Criteria andClassimplLessThan(String value) {
            addCriterion("classimpl <", value, "classimpl");
            return (Criteria) this;
        }

        public Criteria andClassimplLessThanOrEqualTo(String value) {
            addCriterion("classimpl <=", value, "classimpl");
            return (Criteria) this;
        }

        public Criteria andClassimplLike(String value) {
            addCriterion("classimpl like", value, "classimpl");
            return (Criteria) this;
        }

        public Criteria andClassimplNotLike(String value) {
            addCriterion("classimpl not like", value, "classimpl");
            return (Criteria) this;
        }

        public Criteria andClassimplIn(List<String> values) {
            addCriterion("classimpl in", values, "classimpl");
            return (Criteria) this;
        }

        public Criteria andClassimplNotIn(List<String> values) {
            addCriterion("classimpl not in", values, "classimpl");
            return (Criteria) this;
        }

        public Criteria andClassimplBetween(String value1, String value2) {
            addCriterion("classimpl between", value1, value2, "classimpl");
            return (Criteria) this;
        }

        public Criteria andClassimplNotBetween(String value1, String value2) {
            addCriterion("classimpl not between", value1, value2, "classimpl");
            return (Criteria) this;
        }

        public Criteria andWatchnumIsNull() {
            addCriterion("watchnum is null");
            return (Criteria) this;
        }

        public Criteria andWatchnumIsNotNull() {
            addCriterion("watchnum is not null");
            return (Criteria) this;
        }

        public Criteria andWatchnumEqualTo(Integer value) {
            addCriterion("watchnum =", value, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumNotEqualTo(Integer value) {
            addCriterion("watchnum <>", value, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumGreaterThan(Integer value) {
            addCriterion("watchnum >", value, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("watchnum >=", value, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumLessThan(Integer value) {
            addCriterion("watchnum <", value, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumLessThanOrEqualTo(Integer value) {
            addCriterion("watchnum <=", value, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumIn(List<Integer> values) {
            addCriterion("watchnum in", values, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumNotIn(List<Integer> values) {
            addCriterion("watchnum not in", values, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumBetween(Integer value1, Integer value2) {
            addCriterion("watchnum between", value1, value2, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumNotBetween(Integer value1, Integer value2) {
            addCriterion("watchnum not between", value1, value2, "watchnum");
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

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andClasstimeIsNull() {
            addCriterion("classTime is null");
            return (Criteria) this;
        }

        public Criteria andClasstimeIsNotNull() {
            addCriterion("classTime is not null");
            return (Criteria) this;
        }

        public Criteria andClasstimeEqualTo(Date value) {
            addCriterion("classTime =", value, "classtime");
            return (Criteria) this;
        }

        public Criteria andClasstimeNotEqualTo(Date value) {
            addCriterion("classTime <>", value, "classtime");
            return (Criteria) this;
        }

        public Criteria andClasstimeGreaterThan(Date value) {
            addCriterion("classTime >", value, "classtime");
            return (Criteria) this;
        }

        public Criteria andClasstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("classTime >=", value, "classtime");
            return (Criteria) this;
        }

        public Criteria andClasstimeLessThan(Date value) {
            addCriterion("classTime <", value, "classtime");
            return (Criteria) this;
        }

        public Criteria andClasstimeLessThanOrEqualTo(Date value) {
            addCriterion("classTime <=", value, "classtime");
            return (Criteria) this;
        }

        public Criteria andClasstimeIn(List<Date> values) {
            addCriterion("classTime in", values, "classtime");
            return (Criteria) this;
        }

        public Criteria andClasstimeNotIn(List<Date> values) {
            addCriterion("classTime not in", values, "classtime");
            return (Criteria) this;
        }

        public Criteria andClasstimeBetween(Date value1, Date value2) {
            addCriterion("classTime between", value1, value2, "classtime");
            return (Criteria) this;
        }

        public Criteria andClasstimeNotBetween(Date value1, Date value2) {
            addCriterion("classTime not between", value1, value2, "classtime");
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