package com.holley.emcpshare.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PpfCustomerFeeMonthOtherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PpfCustomerFeeMonthOtherExample() {
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

        public Criteria andCustomeridIsNull() {
            addCriterion("CUSTOMERID is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("CUSTOMERID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("CUSTOMERID =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("CUSTOMERID <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("CUSTOMERID >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMERID >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("CUSTOMERID <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMERID <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("CUSTOMERID in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("CUSTOMERID not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMERID between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMERID not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andDatatimeIsNull() {
            addCriterion("DATATIME is null");
            return (Criteria) this;
        }

        public Criteria andDatatimeIsNotNull() {
            addCriterion("DATATIME is not null");
            return (Criteria) this;
        }

        public Criteria andDatatimeEqualTo(Date value) {
            addCriterion("DATATIME =", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeNotEqualTo(Date value) {
            addCriterion("DATATIME <>", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeGreaterThan(Date value) {
            addCriterion("DATATIME >", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DATATIME >=", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeLessThan(Date value) {
            addCriterion("DATATIME <", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeLessThanOrEqualTo(Date value) {
            addCriterion("DATATIME <=", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeIn(List<Date> values) {
            addCriterion("DATATIME in", values, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeNotIn(List<Date> values) {
            addCriterion("DATATIME not in", values, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeBetween(Date value1, Date value2) {
            addCriterion("DATATIME between", value1, value2, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeNotBetween(Date value1, Date value2) {
            addCriterion("DATATIME not between", value1, value2, "datatime");
            return (Criteria) this;
        }

        public Criteria andEnergytypeIsNull() {
            addCriterion("ENERGYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andEnergytypeIsNotNull() {
            addCriterion("ENERGYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEnergytypeEqualTo(Short value) {
            addCriterion("ENERGYTYPE =", value, "energytype");
            return (Criteria) this;
        }

        public Criteria andEnergytypeNotEqualTo(Short value) {
            addCriterion("ENERGYTYPE <>", value, "energytype");
            return (Criteria) this;
        }

        public Criteria andEnergytypeGreaterThan(Short value) {
            addCriterion("ENERGYTYPE >", value, "energytype");
            return (Criteria) this;
        }

        public Criteria andEnergytypeGreaterThanOrEqualTo(Short value) {
            addCriterion("ENERGYTYPE >=", value, "energytype");
            return (Criteria) this;
        }

        public Criteria andEnergytypeLessThan(Short value) {
            addCriterion("ENERGYTYPE <", value, "energytype");
            return (Criteria) this;
        }

        public Criteria andEnergytypeLessThanOrEqualTo(Short value) {
            addCriterion("ENERGYTYPE <=", value, "energytype");
            return (Criteria) this;
        }

        public Criteria andEnergytypeIn(List<Short> values) {
            addCriterion("ENERGYTYPE in", values, "energytype");
            return (Criteria) this;
        }

        public Criteria andEnergytypeNotIn(List<Short> values) {
            addCriterion("ENERGYTYPE not in", values, "energytype");
            return (Criteria) this;
        }

        public Criteria andEnergytypeBetween(Short value1, Short value2) {
            addCriterion("ENERGYTYPE between", value1, value2, "energytype");
            return (Criteria) this;
        }

        public Criteria andEnergytypeNotBetween(Short value1, Short value2) {
            addCriterion("ENERGYTYPE not between", value1, value2, "energytype");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("FEE is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("FEE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(BigDecimal value) {
            addCriterion("FEE =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(BigDecimal value) {
            addCriterion("FEE <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(BigDecimal value) {
            addCriterion("FEE >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(BigDecimal value) {
            addCriterion("FEE <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<BigDecimal> values) {
            addCriterion("FEE in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<BigDecimal> values) {
            addCriterion("FEE not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andUsablemoneyIsNull() {
            addCriterion("USABLEMONEY is null");
            return (Criteria) this;
        }

        public Criteria andUsablemoneyIsNotNull() {
            addCriterion("USABLEMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andUsablemoneyEqualTo(BigDecimal value) {
            addCriterion("USABLEMONEY =", value, "usablemoney");
            return (Criteria) this;
        }

        public Criteria andUsablemoneyNotEqualTo(BigDecimal value) {
            addCriterion("USABLEMONEY <>", value, "usablemoney");
            return (Criteria) this;
        }

        public Criteria andUsablemoneyGreaterThan(BigDecimal value) {
            addCriterion("USABLEMONEY >", value, "usablemoney");
            return (Criteria) this;
        }

        public Criteria andUsablemoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USABLEMONEY >=", value, "usablemoney");
            return (Criteria) this;
        }

        public Criteria andUsablemoneyLessThan(BigDecimal value) {
            addCriterion("USABLEMONEY <", value, "usablemoney");
            return (Criteria) this;
        }

        public Criteria andUsablemoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USABLEMONEY <=", value, "usablemoney");
            return (Criteria) this;
        }

        public Criteria andUsablemoneyIn(List<BigDecimal> values) {
            addCriterion("USABLEMONEY in", values, "usablemoney");
            return (Criteria) this;
        }

        public Criteria andUsablemoneyNotIn(List<BigDecimal> values) {
            addCriterion("USABLEMONEY not in", values, "usablemoney");
            return (Criteria) this;
        }

        public Criteria andUsablemoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USABLEMONEY between", value1, value2, "usablemoney");
            return (Criteria) this;
        }

        public Criteria andUsablemoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USABLEMONEY not between", value1, value2, "usablemoney");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("ADDTIME is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("ADDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("ADDTIME =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("ADDTIME <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("ADDTIME >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ADDTIME >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("ADDTIME <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("ADDTIME <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("ADDTIME in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("ADDTIME not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("ADDTIME between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("ADDTIME not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeIsNull() {
            addCriterion("BILLTIME is null");
            return (Criteria) this;
        }

        public Criteria andBilltimeIsNotNull() {
            addCriterion("BILLTIME is not null");
            return (Criteria) this;
        }

        public Criteria andBilltimeEqualTo(Date value) {
            addCriterion("BILLTIME =", value, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeNotEqualTo(Date value) {
            addCriterion("BILLTIME <>", value, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeGreaterThan(Date value) {
            addCriterion("BILLTIME >", value, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BILLTIME >=", value, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeLessThan(Date value) {
            addCriterion("BILLTIME <", value, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeLessThanOrEqualTo(Date value) {
            addCriterion("BILLTIME <=", value, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeIn(List<Date> values) {
            addCriterion("BILLTIME in", values, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeNotIn(List<Date> values) {
            addCriterion("BILLTIME not in", values, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeBetween(Date value1, Date value2) {
            addCriterion("BILLTIME between", value1, value2, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeNotBetween(Date value1, Date value2) {
            addCriterion("BILLTIME not between", value1, value2, "billtime");
            return (Criteria) this;
        }

        public Criteria andCutstatusIsNull() {
            addCriterion("CUTSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andCutstatusIsNotNull() {
            addCriterion("CUTSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCutstatusEqualTo(Short value) {
            addCriterion("CUTSTATUS =", value, "cutstatus");
            return (Criteria) this;
        }

        public Criteria andCutstatusNotEqualTo(Short value) {
            addCriterion("CUTSTATUS <>", value, "cutstatus");
            return (Criteria) this;
        }

        public Criteria andCutstatusGreaterThan(Short value) {
            addCriterion("CUTSTATUS >", value, "cutstatus");
            return (Criteria) this;
        }

        public Criteria andCutstatusGreaterThanOrEqualTo(Short value) {
            addCriterion("CUTSTATUS >=", value, "cutstatus");
            return (Criteria) this;
        }

        public Criteria andCutstatusLessThan(Short value) {
            addCriterion("CUTSTATUS <", value, "cutstatus");
            return (Criteria) this;
        }

        public Criteria andCutstatusLessThanOrEqualTo(Short value) {
            addCriterion("CUTSTATUS <=", value, "cutstatus");
            return (Criteria) this;
        }

        public Criteria andCutstatusIn(List<Short> values) {
            addCriterion("CUTSTATUS in", values, "cutstatus");
            return (Criteria) this;
        }

        public Criteria andCutstatusNotIn(List<Short> values) {
            addCriterion("CUTSTATUS not in", values, "cutstatus");
            return (Criteria) this;
        }

        public Criteria andCutstatusBetween(Short value1, Short value2) {
            addCriterion("CUTSTATUS between", value1, value2, "cutstatus");
            return (Criteria) this;
        }

        public Criteria andCutstatusNotBetween(Short value1, Short value2) {
            addCriterion("CUTSTATUS not between", value1, value2, "cutstatus");
            return (Criteria) this;
        }

        public Criteria andCuttimeIsNull() {
            addCriterion("CUTTIME is null");
            return (Criteria) this;
        }

        public Criteria andCuttimeIsNotNull() {
            addCriterion("CUTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCuttimeEqualTo(Date value) {
            addCriterion("CUTTIME =", value, "cuttime");
            return (Criteria) this;
        }

        public Criteria andCuttimeNotEqualTo(Date value) {
            addCriterion("CUTTIME <>", value, "cuttime");
            return (Criteria) this;
        }

        public Criteria andCuttimeGreaterThan(Date value) {
            addCriterion("CUTTIME >", value, "cuttime");
            return (Criteria) this;
        }

        public Criteria andCuttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CUTTIME >=", value, "cuttime");
            return (Criteria) this;
        }

        public Criteria andCuttimeLessThan(Date value) {
            addCriterion("CUTTIME <", value, "cuttime");
            return (Criteria) this;
        }

        public Criteria andCuttimeLessThanOrEqualTo(Date value) {
            addCriterion("CUTTIME <=", value, "cuttime");
            return (Criteria) this;
        }

        public Criteria andCuttimeIn(List<Date> values) {
            addCriterion("CUTTIME in", values, "cuttime");
            return (Criteria) this;
        }

        public Criteria andCuttimeNotIn(List<Date> values) {
            addCriterion("CUTTIME not in", values, "cuttime");
            return (Criteria) this;
        }

        public Criteria andCuttimeBetween(Date value1, Date value2) {
            addCriterion("CUTTIME between", value1, value2, "cuttime");
            return (Criteria) this;
        }

        public Criteria andCuttimeNotBetween(Date value1, Date value2) {
            addCriterion("CUTTIME not between", value1, value2, "cuttime");
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