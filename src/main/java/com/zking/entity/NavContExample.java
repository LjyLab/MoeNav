package com.zking.entity;

import java.util.ArrayList;
import java.util.List;

public class NavContExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NavContExample() {
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

        public Criteria andMoeCidIsNull() {
            addCriterion("moe_cid is null");
            return (Criteria) this;
        }

        public Criteria andMoeCidIsNotNull() {
            addCriterion("moe_cid is not null");
            return (Criteria) this;
        }

        public Criteria andMoeCidEqualTo(Integer value) {
            addCriterion("moe_cid =", value, "moeCid");
            return (Criteria) this;
        }

        public Criteria andMoeCidNotEqualTo(Integer value) {
            addCriterion("moe_cid <>", value, "moeCid");
            return (Criteria) this;
        }

        public Criteria andMoeCidGreaterThan(Integer value) {
            addCriterion("moe_cid >", value, "moeCid");
            return (Criteria) this;
        }

        public Criteria andMoeCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("moe_cid >=", value, "moeCid");
            return (Criteria) this;
        }

        public Criteria andMoeCidLessThan(Integer value) {
            addCriterion("moe_cid <", value, "moeCid");
            return (Criteria) this;
        }

        public Criteria andMoeCidLessThanOrEqualTo(Integer value) {
            addCriterion("moe_cid <=", value, "moeCid");
            return (Criteria) this;
        }

        public Criteria andMoeCidIn(List<Integer> values) {
            addCriterion("moe_cid in", values, "moeCid");
            return (Criteria) this;
        }

        public Criteria andMoeCidNotIn(List<Integer> values) {
            addCriterion("moe_cid not in", values, "moeCid");
            return (Criteria) this;
        }

        public Criteria andMoeCidBetween(Integer value1, Integer value2) {
            addCriterion("moe_cid between", value1, value2, "moeCid");
            return (Criteria) this;
        }

        public Criteria andMoeCidNotBetween(Integer value1, Integer value2) {
            addCriterion("moe_cid not between", value1, value2, "moeCid");
            return (Criteria) this;
        }

        public Criteria andMoeNameIsNull() {
            addCriterion("moe_name is null");
            return (Criteria) this;
        }

        public Criteria andMoeNameIsNotNull() {
            addCriterion("moe_name is not null");
            return (Criteria) this;
        }

        public Criteria andMoeNameEqualTo(String value) {
            addCriterion("moe_name =", value, "moeName");
            return (Criteria) this;
        }

        public Criteria andMoeNameNotEqualTo(String value) {
            addCriterion("moe_name <>", value, "moeName");
            return (Criteria) this;
        }

        public Criteria andMoeNameGreaterThan(String value) {
            addCriterion("moe_name >", value, "moeName");
            return (Criteria) this;
        }

        public Criteria andMoeNameGreaterThanOrEqualTo(String value) {
            addCriterion("moe_name >=", value, "moeName");
            return (Criteria) this;
        }

        public Criteria andMoeNameLessThan(String value) {
            addCriterion("moe_name <", value, "moeName");
            return (Criteria) this;
        }

        public Criteria andMoeNameLessThanOrEqualTo(String value) {
            addCriterion("moe_name <=", value, "moeName");
            return (Criteria) this;
        }

        public Criteria andMoeNameLike(String value) {
            addCriterion("moe_name like", value, "moeName");
            return (Criteria) this;
        }

        public Criteria andMoeNameNotLike(String value) {
            addCriterion("moe_name not like", value, "moeName");
            return (Criteria) this;
        }

        public Criteria andMoeNameIn(List<String> values) {
            addCriterion("moe_name in", values, "moeName");
            return (Criteria) this;
        }

        public Criteria andMoeNameNotIn(List<String> values) {
            addCriterion("moe_name not in", values, "moeName");
            return (Criteria) this;
        }

        public Criteria andMoeNameBetween(String value1, String value2) {
            addCriterion("moe_name between", value1, value2, "moeName");
            return (Criteria) this;
        }

        public Criteria andMoeNameNotBetween(String value1, String value2) {
            addCriterion("moe_name not between", value1, value2, "moeName");
            return (Criteria) this;
        }

        public Criteria andMoeUrlIsNull() {
            addCriterion("moe_url is null");
            return (Criteria) this;
        }

        public Criteria andMoeUrlIsNotNull() {
            addCriterion("moe_url is not null");
            return (Criteria) this;
        }

        public Criteria andMoeUrlEqualTo(String value) {
            addCriterion("moe_url =", value, "moeUrl");
            return (Criteria) this;
        }

        public Criteria andMoeUrlNotEqualTo(String value) {
            addCriterion("moe_url <>", value, "moeUrl");
            return (Criteria) this;
        }

        public Criteria andMoeUrlGreaterThan(String value) {
            addCriterion("moe_url >", value, "moeUrl");
            return (Criteria) this;
        }

        public Criteria andMoeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("moe_url >=", value, "moeUrl");
            return (Criteria) this;
        }

        public Criteria andMoeUrlLessThan(String value) {
            addCriterion("moe_url <", value, "moeUrl");
            return (Criteria) this;
        }

        public Criteria andMoeUrlLessThanOrEqualTo(String value) {
            addCriterion("moe_url <=", value, "moeUrl");
            return (Criteria) this;
        }

        public Criteria andMoeUrlLike(String value) {
            addCriterion("moe_url like", value, "moeUrl");
            return (Criteria) this;
        }

        public Criteria andMoeUrlNotLike(String value) {
            addCriterion("moe_url not like", value, "moeUrl");
            return (Criteria) this;
        }

        public Criteria andMoeUrlIn(List<String> values) {
            addCriterion("moe_url in", values, "moeUrl");
            return (Criteria) this;
        }

        public Criteria andMoeUrlNotIn(List<String> values) {
            addCriterion("moe_url not in", values, "moeUrl");
            return (Criteria) this;
        }

        public Criteria andMoeUrlBetween(String value1, String value2) {
            addCriterion("moe_url between", value1, value2, "moeUrl");
            return (Criteria) this;
        }

        public Criteria andMoeUrlNotBetween(String value1, String value2) {
            addCriterion("moe_url not between", value1, value2, "moeUrl");
            return (Criteria) this;
        }

        public Criteria andMoeSortIsNull() {
            addCriterion("moe_sort is null");
            return (Criteria) this;
        }

        public Criteria andMoeSortIsNotNull() {
            addCriterion("moe_sort is not null");
            return (Criteria) this;
        }

        public Criteria andMoeSortEqualTo(String value) {
            addCriterion("moe_sort =", value, "moeSort");
            return (Criteria) this;
        }

        public Criteria andMoeSortNotEqualTo(String value) {
            addCriterion("moe_sort <>", value, "moeSort");
            return (Criteria) this;
        }

        public Criteria andMoeSortGreaterThan(String value) {
            addCriterion("moe_sort >", value, "moeSort");
            return (Criteria) this;
        }

        public Criteria andMoeSortGreaterThanOrEqualTo(String value) {
            addCriterion("moe_sort >=", value, "moeSort");
            return (Criteria) this;
        }

        public Criteria andMoeSortLessThan(String value) {
            addCriterion("moe_sort <", value, "moeSort");
            return (Criteria) this;
        }

        public Criteria andMoeSortLessThanOrEqualTo(String value) {
            addCriterion("moe_sort <=", value, "moeSort");
            return (Criteria) this;
        }

        public Criteria andMoeSortLike(String value) {
            addCriterion("moe_sort like", value, "moeSort");
            return (Criteria) this;
        }

        public Criteria andMoeSortNotLike(String value) {
            addCriterion("moe_sort not like", value, "moeSort");
            return (Criteria) this;
        }

        public Criteria andMoeSortIn(List<String> values) {
            addCriterion("moe_sort in", values, "moeSort");
            return (Criteria) this;
        }

        public Criteria andMoeSortNotIn(List<String> values) {
            addCriterion("moe_sort not in", values, "moeSort");
            return (Criteria) this;
        }

        public Criteria andMoeSortBetween(String value1, String value2) {
            addCriterion("moe_sort between", value1, value2, "moeSort");
            return (Criteria) this;
        }

        public Criteria andMoeSortNotBetween(String value1, String value2) {
            addCriterion("moe_sort not between", value1, value2, "moeSort");
            return (Criteria) this;
        }

        public Criteria andMoeImageIsNull() {
            addCriterion("moe_image is null");
            return (Criteria) this;
        }

        public Criteria andMoeImageIsNotNull() {
            addCriterion("moe_image is not null");
            return (Criteria) this;
        }

        public Criteria andMoeImageEqualTo(String value) {
            addCriterion("moe_image =", value, "moeImage");
            return (Criteria) this;
        }

        public Criteria andMoeImageNotEqualTo(String value) {
            addCriterion("moe_image <>", value, "moeImage");
            return (Criteria) this;
        }

        public Criteria andMoeImageGreaterThan(String value) {
            addCriterion("moe_image >", value, "moeImage");
            return (Criteria) this;
        }

        public Criteria andMoeImageGreaterThanOrEqualTo(String value) {
            addCriterion("moe_image >=", value, "moeImage");
            return (Criteria) this;
        }

        public Criteria andMoeImageLessThan(String value) {
            addCriterion("moe_image <", value, "moeImage");
            return (Criteria) this;
        }

        public Criteria andMoeImageLessThanOrEqualTo(String value) {
            addCriterion("moe_image <=", value, "moeImage");
            return (Criteria) this;
        }

        public Criteria andMoeImageLike(String value) {
            addCriterion("moe_image like", value, "moeImage");
            return (Criteria) this;
        }

        public Criteria andMoeImageNotLike(String value) {
            addCriterion("moe_image not like", value, "moeImage");
            return (Criteria) this;
        }

        public Criteria andMoeImageIn(List<String> values) {
            addCriterion("moe_image in", values, "moeImage");
            return (Criteria) this;
        }

        public Criteria andMoeImageNotIn(List<String> values) {
            addCriterion("moe_image not in", values, "moeImage");
            return (Criteria) this;
        }

        public Criteria andMoeImageBetween(String value1, String value2) {
            addCriterion("moe_image between", value1, value2, "moeImage");
            return (Criteria) this;
        }

        public Criteria andMoeImageNotBetween(String value1, String value2) {
            addCriterion("moe_image not between", value1, value2, "moeImage");
            return (Criteria) this;
        }

        public Criteria andMoeDescriptionIsNull() {
            addCriterion("moe_description is null");
            return (Criteria) this;
        }

        public Criteria andMoeDescriptionIsNotNull() {
            addCriterion("moe_description is not null");
            return (Criteria) this;
        }

        public Criteria andMoeDescriptionEqualTo(String value) {
            addCriterion("moe_description =", value, "moeDescription");
            return (Criteria) this;
        }

        public Criteria andMoeDescriptionNotEqualTo(String value) {
            addCriterion("moe_description <>", value, "moeDescription");
            return (Criteria) this;
        }

        public Criteria andMoeDescriptionGreaterThan(String value) {
            addCriterion("moe_description >", value, "moeDescription");
            return (Criteria) this;
        }

        public Criteria andMoeDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("moe_description >=", value, "moeDescription");
            return (Criteria) this;
        }

        public Criteria andMoeDescriptionLessThan(String value) {
            addCriterion("moe_description <", value, "moeDescription");
            return (Criteria) this;
        }

        public Criteria andMoeDescriptionLessThanOrEqualTo(String value) {
            addCriterion("moe_description <=", value, "moeDescription");
            return (Criteria) this;
        }

        public Criteria andMoeDescriptionLike(String value) {
            addCriterion("moe_description like", value, "moeDescription");
            return (Criteria) this;
        }

        public Criteria andMoeDescriptionNotLike(String value) {
            addCriterion("moe_description not like", value, "moeDescription");
            return (Criteria) this;
        }

        public Criteria andMoeDescriptionIn(List<String> values) {
            addCriterion("moe_description in", values, "moeDescription");
            return (Criteria) this;
        }

        public Criteria andMoeDescriptionNotIn(List<String> values) {
            addCriterion("moe_description not in", values, "moeDescription");
            return (Criteria) this;
        }

        public Criteria andMoeDescriptionBetween(String value1, String value2) {
            addCriterion("moe_description between", value1, value2, "moeDescription");
            return (Criteria) this;
        }

        public Criteria andMoeDescriptionNotBetween(String value1, String value2) {
            addCriterion("moe_description not between", value1, value2, "moeDescription");
            return (Criteria) this;
        }

        public Criteria andMoeUserIsNull() {
            addCriterion("moe_user is null");
            return (Criteria) this;
        }

        public Criteria andMoeUserIsNotNull() {
            addCriterion("moe_user is not null");
            return (Criteria) this;
        }

        public Criteria andMoeUserEqualTo(String value) {
            addCriterion("moe_user =", value, "moeUser");
            return (Criteria) this;
        }

        public Criteria andMoeUserNotEqualTo(String value) {
            addCriterion("moe_user <>", value, "moeUser");
            return (Criteria) this;
        }

        public Criteria andMoeUserGreaterThan(String value) {
            addCriterion("moe_user >", value, "moeUser");
            return (Criteria) this;
        }

        public Criteria andMoeUserGreaterThanOrEqualTo(String value) {
            addCriterion("moe_user >=", value, "moeUser");
            return (Criteria) this;
        }

        public Criteria andMoeUserLessThan(String value) {
            addCriterion("moe_user <", value, "moeUser");
            return (Criteria) this;
        }

        public Criteria andMoeUserLessThanOrEqualTo(String value) {
            addCriterion("moe_user <=", value, "moeUser");
            return (Criteria) this;
        }

        public Criteria andMoeUserLike(String value) {
            addCriterion("moe_user like", value, "moeUser");
            return (Criteria) this;
        }

        public Criteria andMoeUserNotLike(String value) {
            addCriterion("moe_user not like", value, "moeUser");
            return (Criteria) this;
        }

        public Criteria andMoeUserIn(List<String> values) {
            addCriterion("moe_user in", values, "moeUser");
            return (Criteria) this;
        }

        public Criteria andMoeUserNotIn(List<String> values) {
            addCriterion("moe_user not in", values, "moeUser");
            return (Criteria) this;
        }

        public Criteria andMoeUserBetween(String value1, String value2) {
            addCriterion("moe_user between", value1, value2, "moeUser");
            return (Criteria) this;
        }

        public Criteria andMoeUserNotBetween(String value1, String value2) {
            addCriterion("moe_user not between", value1, value2, "moeUser");
            return (Criteria) this;
        }

        public Criteria andMoeOrderIsNull() {
            addCriterion("moe_order is null");
            return (Criteria) this;
        }

        public Criteria andMoeOrderIsNotNull() {
            addCriterion("moe_order is not null");
            return (Criteria) this;
        }

        public Criteria andMoeOrderEqualTo(String value) {
            addCriterion("moe_order =", value, "moeOrder");
            return (Criteria) this;
        }

        public Criteria andMoeOrderNotEqualTo(String value) {
            addCriterion("moe_order <>", value, "moeOrder");
            return (Criteria) this;
        }

        public Criteria andMoeOrderGreaterThan(String value) {
            addCriterion("moe_order >", value, "moeOrder");
            return (Criteria) this;
        }

        public Criteria andMoeOrderGreaterThanOrEqualTo(String value) {
            addCriterion("moe_order >=", value, "moeOrder");
            return (Criteria) this;
        }

        public Criteria andMoeOrderLessThan(String value) {
            addCriterion("moe_order <", value, "moeOrder");
            return (Criteria) this;
        }

        public Criteria andMoeOrderLessThanOrEqualTo(String value) {
            addCriterion("moe_order <=", value, "moeOrder");
            return (Criteria) this;
        }

        public Criteria andMoeOrderLike(String value) {
            addCriterion("moe_order like", value, "moeOrder");
            return (Criteria) this;
        }

        public Criteria andMoeOrderNotLike(String value) {
            addCriterion("moe_order not like", value, "moeOrder");
            return (Criteria) this;
        }

        public Criteria andMoeOrderIn(List<String> values) {
            addCriterion("moe_order in", values, "moeOrder");
            return (Criteria) this;
        }

        public Criteria andMoeOrderNotIn(List<String> values) {
            addCriterion("moe_order not in", values, "moeOrder");
            return (Criteria) this;
        }

        public Criteria andMoeOrderBetween(String value1, String value2) {
            addCriterion("moe_order between", value1, value2, "moeOrder");
            return (Criteria) this;
        }

        public Criteria andMoeOrderNotBetween(String value1, String value2) {
            addCriterion("moe_order not between", value1, value2, "moeOrder");
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