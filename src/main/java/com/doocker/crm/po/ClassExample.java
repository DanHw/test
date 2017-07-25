package com.doocker.crm.po;

import java.util.ArrayList;
import java.util.List;

public class ClassExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    public ClassExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
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

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNull() {
            addCriterion("class_name is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("class_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("class_name =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("class_name <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("class_name >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_name >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("class_name <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("class_name <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("class_name like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("class_name not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("class_name in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("class_name not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("class_name between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("class_name not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassDescIsNull() {
            addCriterion("class_desc is null");
            return (Criteria) this;
        }

        public Criteria andClassDescIsNotNull() {
            addCriterion("class_desc is not null");
            return (Criteria) this;
        }

        public Criteria andClassDescEqualTo(String value) {
            addCriterion("class_desc =", value, "classDesc");
            return (Criteria) this;
        }

        public Criteria andClassDescNotEqualTo(String value) {
            addCriterion("class_desc <>", value, "classDesc");
            return (Criteria) this;
        }

        public Criteria andClassDescGreaterThan(String value) {
            addCriterion("class_desc >", value, "classDesc");
            return (Criteria) this;
        }

        public Criteria andClassDescGreaterThanOrEqualTo(String value) {
            addCriterion("class_desc >=", value, "classDesc");
            return (Criteria) this;
        }

        public Criteria andClassDescLessThan(String value) {
            addCriterion("class_desc <", value, "classDesc");
            return (Criteria) this;
        }

        public Criteria andClassDescLessThanOrEqualTo(String value) {
            addCriterion("class_desc <=", value, "classDesc");
            return (Criteria) this;
        }

        public Criteria andClassDescLike(String value) {
            addCriterion("class_desc like", value, "classDesc");
            return (Criteria) this;
        }

        public Criteria andClassDescNotLike(String value) {
            addCriterion("class_desc not like", value, "classDesc");
            return (Criteria) this;
        }

        public Criteria andClassDescIn(List<String> values) {
            addCriterion("class_desc in", values, "classDesc");
            return (Criteria) this;
        }

        public Criteria andClassDescNotIn(List<String> values) {
            addCriterion("class_desc not in", values, "classDesc");
            return (Criteria) this;
        }

        public Criteria andClassDescBetween(String value1, String value2) {
            addCriterion("class_desc between", value1, value2, "classDesc");
            return (Criteria) this;
        }

        public Criteria andClassDescNotBetween(String value1, String value2) {
            addCriterion("class_desc not between", value1, value2, "classDesc");
            return (Criteria) this;
        }

        public Criteria andClassPeriodIsNull() {
            addCriterion("class_period is null");
            return (Criteria) this;
        }

        public Criteria andClassPeriodIsNotNull() {
            addCriterion("class_period is not null");
            return (Criteria) this;
        }

        public Criteria andClassPeriodEqualTo(Integer value) {
            addCriterion("class_period =", value, "classPeriod");
            return (Criteria) this;
        }

        public Criteria andClassPeriodNotEqualTo(Integer value) {
            addCriterion("class_period <>", value, "classPeriod");
            return (Criteria) this;
        }

        public Criteria andClassPeriodGreaterThan(Integer value) {
            addCriterion("class_period >", value, "classPeriod");
            return (Criteria) this;
        }

        public Criteria andClassPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_period >=", value, "classPeriod");
            return (Criteria) this;
        }

        public Criteria andClassPeriodLessThan(Integer value) {
            addCriterion("class_period <", value, "classPeriod");
            return (Criteria) this;
        }

        public Criteria andClassPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("class_period <=", value, "classPeriod");
            return (Criteria) this;
        }

        public Criteria andClassPeriodIn(List<Integer> values) {
            addCriterion("class_period in", values, "classPeriod");
            return (Criteria) this;
        }

        public Criteria andClassPeriodNotIn(List<Integer> values) {
            addCriterion("class_period not in", values, "classPeriod");
            return (Criteria) this;
        }

        public Criteria andClassPeriodBetween(Integer value1, Integer value2) {
            addCriterion("class_period between", value1, value2, "classPeriod");
            return (Criteria) this;
        }

        public Criteria andClassPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("class_period not between", value1, value2, "classPeriod");
            return (Criteria) this;
        }

        public Criteria andClassFeescaleIsNull() {
            addCriterion("class_feescale is null");
            return (Criteria) this;
        }

        public Criteria andClassFeescaleIsNotNull() {
            addCriterion("class_feescale is not null");
            return (Criteria) this;
        }

        public Criteria andClassFeescaleEqualTo(Integer value) {
            addCriterion("class_feescale =", value, "classFeescale");
            return (Criteria) this;
        }

        public Criteria andClassFeescaleNotEqualTo(Integer value) {
            addCriterion("class_feescale <>", value, "classFeescale");
            return (Criteria) this;
        }

        public Criteria andClassFeescaleGreaterThan(Integer value) {
            addCriterion("class_feescale >", value, "classFeescale");
            return (Criteria) this;
        }

        public Criteria andClassFeescaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_feescale >=", value, "classFeescale");
            return (Criteria) this;
        }

        public Criteria andClassFeescaleLessThan(Integer value) {
            addCriterion("class_feescale <", value, "classFeescale");
            return (Criteria) this;
        }

        public Criteria andClassFeescaleLessThanOrEqualTo(Integer value) {
            addCriterion("class_feescale <=", value, "classFeescale");
            return (Criteria) this;
        }

        public Criteria andClassFeescaleIn(List<Integer> values) {
            addCriterion("class_feescale in", values, "classFeescale");
            return (Criteria) this;
        }

        public Criteria andClassFeescaleNotIn(List<Integer> values) {
            addCriterion("class_feescale not in", values, "classFeescale");
            return (Criteria) this;
        }

        public Criteria andClassFeescaleBetween(Integer value1, Integer value2) {
            addCriterion("class_feescale between", value1, value2, "classFeescale");
            return (Criteria) this;
        }

        public Criteria andClassFeescaleNotBetween(Integer value1, Integer value2) {
            addCriterion("class_feescale not between", value1, value2, "classFeescale");
            return (Criteria) this;
        }

        public Criteria andClassBeforeIsNull() {
            addCriterion("class_before is null");
            return (Criteria) this;
        }

        public Criteria andClassBeforeIsNotNull() {
            addCriterion("class_before is not null");
            return (Criteria) this;
        }

        public Criteria andClassBeforeEqualTo(String value) {
            addCriterion("class_before =", value, "classBefore");
            return (Criteria) this;
        }

        public Criteria andClassBeforeNotEqualTo(String value) {
            addCriterion("class_before <>", value, "classBefore");
            return (Criteria) this;
        }

        public Criteria andClassBeforeGreaterThan(String value) {
            addCriterion("class_before >", value, "classBefore");
            return (Criteria) this;
        }

        public Criteria andClassBeforeGreaterThanOrEqualTo(String value) {
            addCriterion("class_before >=", value, "classBefore");
            return (Criteria) this;
        }

        public Criteria andClassBeforeLessThan(String value) {
            addCriterion("class_before <", value, "classBefore");
            return (Criteria) this;
        }

        public Criteria andClassBeforeLessThanOrEqualTo(String value) {
            addCriterion("class_before <=", value, "classBefore");
            return (Criteria) this;
        }

        public Criteria andClassBeforeLike(String value) {
            addCriterion("class_before like", value, "classBefore");
            return (Criteria) this;
        }

        public Criteria andClassBeforeNotLike(String value) {
            addCriterion("class_before not like", value, "classBefore");
            return (Criteria) this;
        }

        public Criteria andClassBeforeIn(List<String> values) {
            addCriterion("class_before in", values, "classBefore");
            return (Criteria) this;
        }

        public Criteria andClassBeforeNotIn(List<String> values) {
            addCriterion("class_before not in", values, "classBefore");
            return (Criteria) this;
        }

        public Criteria andClassBeforeBetween(String value1, String value2) {
            addCriterion("class_before between", value1, value2, "classBefore");
            return (Criteria) this;
        }

        public Criteria andClassBeforeNotBetween(String value1, String value2) {
            addCriterion("class_before not between", value1, value2, "classBefore");
            return (Criteria) this;
        }

        public Criteria andClassAfterIsNull() {
            addCriterion("class_after is null");
            return (Criteria) this;
        }

        public Criteria andClassAfterIsNotNull() {
            addCriterion("class_after is not null");
            return (Criteria) this;
        }

        public Criteria andClassAfterEqualTo(String value) {
            addCriterion("class_after =", value, "classAfter");
            return (Criteria) this;
        }

        public Criteria andClassAfterNotEqualTo(String value) {
            addCriterion("class_after <>", value, "classAfter");
            return (Criteria) this;
        }

        public Criteria andClassAfterGreaterThan(String value) {
            addCriterion("class_after >", value, "classAfter");
            return (Criteria) this;
        }

        public Criteria andClassAfterGreaterThanOrEqualTo(String value) {
            addCriterion("class_after >=", value, "classAfter");
            return (Criteria) this;
        }

        public Criteria andClassAfterLessThan(String value) {
            addCriterion("class_after <", value, "classAfter");
            return (Criteria) this;
        }

        public Criteria andClassAfterLessThanOrEqualTo(String value) {
            addCriterion("class_after <=", value, "classAfter");
            return (Criteria) this;
        }

        public Criteria andClassAfterLike(String value) {
            addCriterion("class_after like", value, "classAfter");
            return (Criteria) this;
        }

        public Criteria andClassAfterNotLike(String value) {
            addCriterion("class_after not like", value, "classAfter");
            return (Criteria) this;
        }

        public Criteria andClassAfterIn(List<String> values) {
            addCriterion("class_after in", values, "classAfter");
            return (Criteria) this;
        }

        public Criteria andClassAfterNotIn(List<String> values) {
            addCriterion("class_after not in", values, "classAfter");
            return (Criteria) this;
        }

        public Criteria andClassAfterBetween(String value1, String value2) {
            addCriterion("class_after between", value1, value2, "classAfter");
            return (Criteria) this;
        }

        public Criteria andClassAfterNotBetween(String value1, String value2) {
            addCriterion("class_after not between", value1, value2, "classAfter");
            return (Criteria) this;
        }

        public Criteria andClassResaonIsNull() {
            addCriterion("class_resaon is null");
            return (Criteria) this;
        }

        public Criteria andClassResaonIsNotNull() {
            addCriterion("class_resaon is not null");
            return (Criteria) this;
        }

        public Criteria andClassResaonEqualTo(String value) {
            addCriterion("class_resaon =", value, "classResaon");
            return (Criteria) this;
        }

        public Criteria andClassResaonNotEqualTo(String value) {
            addCriterion("class_resaon <>", value, "classResaon");
            return (Criteria) this;
        }

        public Criteria andClassResaonGreaterThan(String value) {
            addCriterion("class_resaon >", value, "classResaon");
            return (Criteria) this;
        }

        public Criteria andClassResaonGreaterThanOrEqualTo(String value) {
            addCriterion("class_resaon >=", value, "classResaon");
            return (Criteria) this;
        }

        public Criteria andClassResaonLessThan(String value) {
            addCriterion("class_resaon <", value, "classResaon");
            return (Criteria) this;
        }

        public Criteria andClassResaonLessThanOrEqualTo(String value) {
            addCriterion("class_resaon <=", value, "classResaon");
            return (Criteria) this;
        }

        public Criteria andClassResaonLike(String value) {
            addCriterion("class_resaon like", value, "classResaon");
            return (Criteria) this;
        }

        public Criteria andClassResaonNotLike(String value) {
            addCriterion("class_resaon not like", value, "classResaon");
            return (Criteria) this;
        }

        public Criteria andClassResaonIn(List<String> values) {
            addCriterion("class_resaon in", values, "classResaon");
            return (Criteria) this;
        }

        public Criteria andClassResaonNotIn(List<String> values) {
            addCriterion("class_resaon not in", values, "classResaon");
            return (Criteria) this;
        }

        public Criteria andClassResaonBetween(String value1, String value2) {
            addCriterion("class_resaon between", value1, value2, "classResaon");
            return (Criteria) this;
        }

        public Criteria andClassResaonNotBetween(String value1, String value2) {
            addCriterion("class_resaon not between", value1, value2, "classResaon");
            return (Criteria) this;
        }

        public Criteria andClassByIsNull() {
            addCriterion("class_by is null");
            return (Criteria) this;
        }

        public Criteria andClassByIsNotNull() {
            addCriterion("class_by is not null");
            return (Criteria) this;
        }

        public Criteria andClassByEqualTo(String value) {
            addCriterion("class_by =", value, "classBy");
            return (Criteria) this;
        }

        public Criteria andClassByNotEqualTo(String value) {
            addCriterion("class_by <>", value, "classBy");
            return (Criteria) this;
        }

        public Criteria andClassByGreaterThan(String value) {
            addCriterion("class_by >", value, "classBy");
            return (Criteria) this;
        }

        public Criteria andClassByGreaterThanOrEqualTo(String value) {
            addCriterion("class_by >=", value, "classBy");
            return (Criteria) this;
        }

        public Criteria andClassByLessThan(String value) {
            addCriterion("class_by <", value, "classBy");
            return (Criteria) this;
        }

        public Criteria andClassByLessThanOrEqualTo(String value) {
            addCriterion("class_by <=", value, "classBy");
            return (Criteria) this;
        }

        public Criteria andClassByLike(String value) {
            addCriterion("class_by like", value, "classBy");
            return (Criteria) this;
        }

        public Criteria andClassByNotLike(String value) {
            addCriterion("class_by not like", value, "classBy");
            return (Criteria) this;
        }

        public Criteria andClassByIn(List<String> values) {
            addCriterion("class_by in", values, "classBy");
            return (Criteria) this;
        }

        public Criteria andClassByNotIn(List<String> values) {
            addCriterion("class_by not in", values, "classBy");
            return (Criteria) this;
        }

        public Criteria andClassByBetween(String value1, String value2) {
            addCriterion("class_by between", value1, value2, "classBy");
            return (Criteria) this;
        }

        public Criteria andClassByNotBetween(String value1, String value2) {
            addCriterion("class_by not between", value1, value2, "classBy");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table class
     *
     * @mbggenerated do_not_delete_during_merge Tue Jul 25 17:40:39 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
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