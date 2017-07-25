package com.doocker.crm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table student
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table student
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table student
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    public StudentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
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
     * This method corresponds to the database table student
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
     * This method corresponds to the database table student
     *
     * @mbggenerated Tue Jul 25 17:40:39 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
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
     * This class corresponds to the database table student
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

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentQqIsNull() {
            addCriterion("student_qq is null");
            return (Criteria) this;
        }

        public Criteria andStudentQqIsNotNull() {
            addCriterion("student_qq is not null");
            return (Criteria) this;
        }

        public Criteria andStudentQqEqualTo(Integer value) {
            addCriterion("student_qq =", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqNotEqualTo(Integer value) {
            addCriterion("student_qq <>", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqGreaterThan(Integer value) {
            addCriterion("student_qq >", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_qq >=", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqLessThan(Integer value) {
            addCriterion("student_qq <", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqLessThanOrEqualTo(Integer value) {
            addCriterion("student_qq <=", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqIn(List<Integer> values) {
            addCriterion("student_qq in", values, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqNotIn(List<Integer> values) {
            addCriterion("student_qq not in", values, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqBetween(Integer value1, Integer value2) {
            addCriterion("student_qq between", value1, value2, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqNotBetween(Integer value1, Integer value2) {
            addCriterion("student_qq not between", value1, value2, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentTelIsNull() {
            addCriterion("student_tel is null");
            return (Criteria) this;
        }

        public Criteria andStudentTelIsNotNull() {
            addCriterion("student_tel is not null");
            return (Criteria) this;
        }

        public Criteria andStudentTelEqualTo(Integer value) {
            addCriterion("student_tel =", value, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelNotEqualTo(Integer value) {
            addCriterion("student_tel <>", value, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelGreaterThan(Integer value) {
            addCriterion("student_tel >", value, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_tel >=", value, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelLessThan(Integer value) {
            addCriterion("student_tel <", value, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelLessThanOrEqualTo(Integer value) {
            addCriterion("student_tel <=", value, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelIn(List<Integer> values) {
            addCriterion("student_tel in", values, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelNotIn(List<Integer> values) {
            addCriterion("student_tel not in", values, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelBetween(Integer value1, Integer value2) {
            addCriterion("student_tel between", value1, value2, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentTelNotBetween(Integer value1, Integer value2) {
            addCriterion("student_tel not between", value1, value2, "studentTel");
            return (Criteria) this;
        }

        public Criteria andStudentClassIsNull() {
            addCriterion("student_class is null");
            return (Criteria) this;
        }

        public Criteria andStudentClassIsNotNull() {
            addCriterion("student_class is not null");
            return (Criteria) this;
        }

        public Criteria andStudentClassEqualTo(String value) {
            addCriterion("student_class =", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassNotEqualTo(String value) {
            addCriterion("student_class <>", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassGreaterThan(String value) {
            addCriterion("student_class >", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassGreaterThanOrEqualTo(String value) {
            addCriterion("student_class >=", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassLessThan(String value) {
            addCriterion("student_class <", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassLessThanOrEqualTo(String value) {
            addCriterion("student_class <=", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassLike(String value) {
            addCriterion("student_class like", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassNotLike(String value) {
            addCriterion("student_class not like", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassIn(List<String> values) {
            addCriterion("student_class in", values, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassNotIn(List<String> values) {
            addCriterion("student_class not in", values, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassBetween(String value1, String value2) {
            addCriterion("student_class between", value1, value2, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassNotBetween(String value1, String value2) {
            addCriterion("student_class not between", value1, value2, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentEntryIsNull() {
            addCriterion("student_entry is null");
            return (Criteria) this;
        }

        public Criteria andStudentEntryIsNotNull() {
            addCriterion("student_entry is not null");
            return (Criteria) this;
        }

        public Criteria andStudentEntryEqualTo(Date value) {
            addCriterionForJDBCDate("student_entry =", value, "studentEntry");
            return (Criteria) this;
        }

        public Criteria andStudentEntryNotEqualTo(Date value) {
            addCriterionForJDBCDate("student_entry <>", value, "studentEntry");
            return (Criteria) this;
        }

        public Criteria andStudentEntryGreaterThan(Date value) {
            addCriterionForJDBCDate("student_entry >", value, "studentEntry");
            return (Criteria) this;
        }

        public Criteria andStudentEntryGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("student_entry >=", value, "studentEntry");
            return (Criteria) this;
        }

        public Criteria andStudentEntryLessThan(Date value) {
            addCriterionForJDBCDate("student_entry <", value, "studentEntry");
            return (Criteria) this;
        }

        public Criteria andStudentEntryLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("student_entry <=", value, "studentEntry");
            return (Criteria) this;
        }

        public Criteria andStudentEntryIn(List<Date> values) {
            addCriterionForJDBCDate("student_entry in", values, "studentEntry");
            return (Criteria) this;
        }

        public Criteria andStudentEntryNotIn(List<Date> values) {
            addCriterionForJDBCDate("student_entry not in", values, "studentEntry");
            return (Criteria) this;
        }

        public Criteria andStudentEntryBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("student_entry between", value1, value2, "studentEntry");
            return (Criteria) this;
        }

        public Criteria andStudentEntryNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("student_entry not between", value1, value2, "studentEntry");
            return (Criteria) this;
        }

        public Criteria andStudentCostIsNull() {
            addCriterion("student_cost is null");
            return (Criteria) this;
        }

        public Criteria andStudentCostIsNotNull() {
            addCriterion("student_cost is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCostEqualTo(Float value) {
            addCriterion("student_cost =", value, "studentCost");
            return (Criteria) this;
        }

        public Criteria andStudentCostNotEqualTo(Float value) {
            addCriterion("student_cost <>", value, "studentCost");
            return (Criteria) this;
        }

        public Criteria andStudentCostGreaterThan(Float value) {
            addCriterion("student_cost >", value, "studentCost");
            return (Criteria) this;
        }

        public Criteria andStudentCostGreaterThanOrEqualTo(Float value) {
            addCriterion("student_cost >=", value, "studentCost");
            return (Criteria) this;
        }

        public Criteria andStudentCostLessThan(Float value) {
            addCriterion("student_cost <", value, "studentCost");
            return (Criteria) this;
        }

        public Criteria andStudentCostLessThanOrEqualTo(Float value) {
            addCriterion("student_cost <=", value, "studentCost");
            return (Criteria) this;
        }

        public Criteria andStudentCostIn(List<Float> values) {
            addCriterion("student_cost in", values, "studentCost");
            return (Criteria) this;
        }

        public Criteria andStudentCostNotIn(List<Float> values) {
            addCriterion("student_cost not in", values, "studentCost");
            return (Criteria) this;
        }

        public Criteria andStudentCostBetween(Float value1, Float value2) {
            addCriterion("student_cost between", value1, value2, "studentCost");
            return (Criteria) this;
        }

        public Criteria andStudentCostNotBetween(Float value1, Float value2) {
            addCriterion("student_cost not between", value1, value2, "studentCost");
            return (Criteria) this;
        }

        public Criteria andStudentStatusIsNull() {
            addCriterion("student_status is null");
            return (Criteria) this;
        }

        public Criteria andStudentStatusIsNotNull() {
            addCriterion("student_status is not null");
            return (Criteria) this;
        }

        public Criteria andStudentStatusEqualTo(String value) {
            addCriterion("student_status =", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusNotEqualTo(String value) {
            addCriterion("student_status <>", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusGreaterThan(String value) {
            addCriterion("student_status >", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("student_status >=", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusLessThan(String value) {
            addCriterion("student_status <", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusLessThanOrEqualTo(String value) {
            addCriterion("student_status <=", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusLike(String value) {
            addCriterion("student_status like", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusNotLike(String value) {
            addCriterion("student_status not like", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusIn(List<String> values) {
            addCriterion("student_status in", values, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusNotIn(List<String> values) {
            addCriterion("student_status not in", values, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusBetween(String value1, String value2) {
            addCriterion("student_status between", value1, value2, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusNotBetween(String value1, String value2) {
            addCriterion("student_status not between", value1, value2, "studentStatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table student
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
     * This class corresponds to the database table student
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