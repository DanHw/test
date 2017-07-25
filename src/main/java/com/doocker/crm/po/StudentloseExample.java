package com.doocker.crm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentloseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table studentlose
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table studentlose
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table studentlose
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studentlose
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
     */
    public StudentloseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studentlose
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studentlose
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studentlose
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studentlose
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studentlose
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studentlose
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studentlose
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studentlose
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
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
     * This method corresponds to the database table studentlose
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studentlose
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table studentlose
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andClassbeforeIsNull() {
            addCriterion("classbefore is null");
            return (Criteria) this;
        }

        public Criteria andClassbeforeIsNotNull() {
            addCriterion("classbefore is not null");
            return (Criteria) this;
        }

        public Criteria andClassbeforeEqualTo(String value) {
            addCriterion("classbefore =", value, "classbefore");
            return (Criteria) this;
        }

        public Criteria andClassbeforeNotEqualTo(String value) {
            addCriterion("classbefore <>", value, "classbefore");
            return (Criteria) this;
        }

        public Criteria andClassbeforeGreaterThan(String value) {
            addCriterion("classbefore >", value, "classbefore");
            return (Criteria) this;
        }

        public Criteria andClassbeforeGreaterThanOrEqualTo(String value) {
            addCriterion("classbefore >=", value, "classbefore");
            return (Criteria) this;
        }

        public Criteria andClassbeforeLessThan(String value) {
            addCriterion("classbefore <", value, "classbefore");
            return (Criteria) this;
        }

        public Criteria andClassbeforeLessThanOrEqualTo(String value) {
            addCriterion("classbefore <=", value, "classbefore");
            return (Criteria) this;
        }

        public Criteria andClassbeforeLike(String value) {
            addCriterion("classbefore like", value, "classbefore");
            return (Criteria) this;
        }

        public Criteria andClassbeforeNotLike(String value) {
            addCriterion("classbefore not like", value, "classbefore");
            return (Criteria) this;
        }

        public Criteria andClassbeforeIn(List<String> values) {
            addCriterion("classbefore in", values, "classbefore");
            return (Criteria) this;
        }

        public Criteria andClassbeforeNotIn(List<String> values) {
            addCriterion("classbefore not in", values, "classbefore");
            return (Criteria) this;
        }

        public Criteria andClassbeforeBetween(String value1, String value2) {
            addCriterion("classbefore between", value1, value2, "classbefore");
            return (Criteria) this;
        }

        public Criteria andClassbeforeNotBetween(String value1, String value2) {
            addCriterion("classbefore not between", value1, value2, "classbefore");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andLosetimeIsNull() {
            addCriterion("losetime is null");
            return (Criteria) this;
        }

        public Criteria andLosetimeIsNotNull() {
            addCriterion("losetime is not null");
            return (Criteria) this;
        }

        public Criteria andLosetimeEqualTo(Date value) {
            addCriterionForJDBCDate("losetime =", value, "losetime");
            return (Criteria) this;
        }

        public Criteria andLosetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("losetime <>", value, "losetime");
            return (Criteria) this;
        }

        public Criteria andLosetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("losetime >", value, "losetime");
            return (Criteria) this;
        }

        public Criteria andLosetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("losetime >=", value, "losetime");
            return (Criteria) this;
        }

        public Criteria andLosetimeLessThan(Date value) {
            addCriterionForJDBCDate("losetime <", value, "losetime");
            return (Criteria) this;
        }

        public Criteria andLosetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("losetime <=", value, "losetime");
            return (Criteria) this;
        }

        public Criteria andLosetimeIn(List<Date> values) {
            addCriterionForJDBCDate("losetime in", values, "losetime");
            return (Criteria) this;
        }

        public Criteria andLosetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("losetime not in", values, "losetime");
            return (Criteria) this;
        }

        public Criteria andLosetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("losetime between", value1, value2, "losetime");
            return (Criteria) this;
        }

        public Criteria andLosetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("losetime not between", value1, value2, "losetime");
            return (Criteria) this;
        }

        public Criteria andBywhoIsNull() {
            addCriterion("bywho is null");
            return (Criteria) this;
        }

        public Criteria andBywhoIsNotNull() {
            addCriterion("bywho is not null");
            return (Criteria) this;
        }

        public Criteria andBywhoEqualTo(String value) {
            addCriterion("bywho =", value, "bywho");
            return (Criteria) this;
        }

        public Criteria andBywhoNotEqualTo(String value) {
            addCriterion("bywho <>", value, "bywho");
            return (Criteria) this;
        }

        public Criteria andBywhoGreaterThan(String value) {
            addCriterion("bywho >", value, "bywho");
            return (Criteria) this;
        }

        public Criteria andBywhoGreaterThanOrEqualTo(String value) {
            addCriterion("bywho >=", value, "bywho");
            return (Criteria) this;
        }

        public Criteria andBywhoLessThan(String value) {
            addCriterion("bywho <", value, "bywho");
            return (Criteria) this;
        }

        public Criteria andBywhoLessThanOrEqualTo(String value) {
            addCriterion("bywho <=", value, "bywho");
            return (Criteria) this;
        }

        public Criteria andBywhoLike(String value) {
            addCriterion("bywho like", value, "bywho");
            return (Criteria) this;
        }

        public Criteria andBywhoNotLike(String value) {
            addCriterion("bywho not like", value, "bywho");
            return (Criteria) this;
        }

        public Criteria andBywhoIn(List<String> values) {
            addCriterion("bywho in", values, "bywho");
            return (Criteria) this;
        }

        public Criteria andBywhoNotIn(List<String> values) {
            addCriterion("bywho not in", values, "bywho");
            return (Criteria) this;
        }

        public Criteria andBywhoBetween(String value1, String value2) {
            addCriterion("bywho between", value1, value2, "bywho");
            return (Criteria) this;
        }

        public Criteria andBywhoNotBetween(String value1, String value2) {
            addCriterion("bywho not between", value1, value2, "bywho");
            return (Criteria) this;
        }

        public Criteria andRefundIsNull() {
            addCriterion("refund is null");
            return (Criteria) this;
        }

        public Criteria andRefundIsNotNull() {
            addCriterion("refund is not null");
            return (Criteria) this;
        }

        public Criteria andRefundEqualTo(String value) {
            addCriterion("refund =", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundNotEqualTo(String value) {
            addCriterion("refund <>", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundGreaterThan(String value) {
            addCriterion("refund >", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundGreaterThanOrEqualTo(String value) {
            addCriterion("refund >=", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundLessThan(String value) {
            addCriterion("refund <", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundLessThanOrEqualTo(String value) {
            addCriterion("refund <=", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundLike(String value) {
            addCriterion("refund like", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundNotLike(String value) {
            addCriterion("refund not like", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundIn(List<String> values) {
            addCriterion("refund in", values, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundNotIn(List<String> values) {
            addCriterion("refund not in", values, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundBetween(String value1, String value2) {
            addCriterion("refund between", value1, value2, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundNotBetween(String value1, String value2) {
            addCriterion("refund not between", value1, value2, "refund");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(Integer value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(Integer value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(Integer value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(Integer value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(Integer value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(Integer value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<Integer> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<Integer> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(Integer value1, Integer value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(Integer value1, Integer value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table studentlose
     *
     * @mbggenerated do_not_delete_during_merge Tue Jul 25 22:00:49 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table studentlose
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
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