package com.zzq.pojo;

import java.util.ArrayList;
import java.util.List;

public class TeaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeaExample() {
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

        public Criteria andTeaIdIsNull() {
            addCriterion("tea_id is null");
            return (Criteria) this;
        }

        public Criteria andTeaIdIsNotNull() {
            addCriterion("tea_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeaIdEqualTo(Integer value) {
            addCriterion("tea_id =", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotEqualTo(Integer value) {
            addCriterion("tea_id <>", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdGreaterThan(Integer value) {
            addCriterion("tea_id >", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tea_id >=", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdLessThan(Integer value) {
            addCriterion("tea_id <", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdLessThanOrEqualTo(Integer value) {
            addCriterion("tea_id <=", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdIn(List<Integer> values) {
            addCriterion("tea_id in", values, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotIn(List<Integer> values) {
            addCriterion("tea_id not in", values, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdBetween(Integer value1, Integer value2) {
            addCriterion("tea_id between", value1, value2, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tea_id not between", value1, value2, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaNameIsNull() {
            addCriterion("tea_name is null");
            return (Criteria) this;
        }

        public Criteria andTeaNameIsNotNull() {
            addCriterion("tea_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeaNameEqualTo(String value) {
            addCriterion("tea_name =", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotEqualTo(String value) {
            addCriterion("tea_name <>", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThan(String value) {
            addCriterion("tea_name >", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThanOrEqualTo(String value) {
            addCriterion("tea_name >=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThan(String value) {
            addCriterion("tea_name <", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThanOrEqualTo(String value) {
            addCriterion("tea_name <=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLike(String value) {
            addCriterion("tea_name like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotLike(String value) {
            addCriterion("tea_name not like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameIn(List<String> values) {
            addCriterion("tea_name in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotIn(List<String> values) {
            addCriterion("tea_name not in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameBetween(String value1, String value2) {
            addCriterion("tea_name between", value1, value2, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotBetween(String value1, String value2) {
            addCriterion("tea_name not between", value1, value2, "teaName");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTeaTelIsNull() {
            addCriterion("tea_tel is null");
            return (Criteria) this;
        }

        public Criteria andTeaTelIsNotNull() {
            addCriterion("tea_tel is not null");
            return (Criteria) this;
        }

        public Criteria andTeaTelEqualTo(String value) {
            addCriterion("tea_tel =", value, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelNotEqualTo(String value) {
            addCriterion("tea_tel <>", value, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelGreaterThan(String value) {
            addCriterion("tea_tel >", value, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelGreaterThanOrEqualTo(String value) {
            addCriterion("tea_tel >=", value, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelLessThan(String value) {
            addCriterion("tea_tel <", value, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelLessThanOrEqualTo(String value) {
            addCriterion("tea_tel <=", value, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelLike(String value) {
            addCriterion("tea_tel like", value, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelNotLike(String value) {
            addCriterion("tea_tel not like", value, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelIn(List<String> values) {
            addCriterion("tea_tel in", values, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelNotIn(List<String> values) {
            addCriterion("tea_tel not in", values, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelBetween(String value1, String value2) {
            addCriterion("tea_tel between", value1, value2, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaTelNotBetween(String value1, String value2) {
            addCriterion("tea_tel not between", value1, value2, "teaTel");
            return (Criteria) this;
        }

        public Criteria andTeaCardIsNull() {
            addCriterion("tea_card is null");
            return (Criteria) this;
        }

        public Criteria andTeaCardIsNotNull() {
            addCriterion("tea_card is not null");
            return (Criteria) this;
        }

        public Criteria andTeaCardEqualTo(String value) {
            addCriterion("tea_card =", value, "teaCard");
            return (Criteria) this;
        }

        public Criteria andTeaCardNotEqualTo(String value) {
            addCriterion("tea_card <>", value, "teaCard");
            return (Criteria) this;
        }

        public Criteria andTeaCardGreaterThan(String value) {
            addCriterion("tea_card >", value, "teaCard");
            return (Criteria) this;
        }

        public Criteria andTeaCardGreaterThanOrEqualTo(String value) {
            addCriterion("tea_card >=", value, "teaCard");
            return (Criteria) this;
        }

        public Criteria andTeaCardLessThan(String value) {
            addCriterion("tea_card <", value, "teaCard");
            return (Criteria) this;
        }

        public Criteria andTeaCardLessThanOrEqualTo(String value) {
            addCriterion("tea_card <=", value, "teaCard");
            return (Criteria) this;
        }

        public Criteria andTeaCardLike(String value) {
            addCriterion("tea_card like", value, "teaCard");
            return (Criteria) this;
        }

        public Criteria andTeaCardNotLike(String value) {
            addCriterion("tea_card not like", value, "teaCard");
            return (Criteria) this;
        }

        public Criteria andTeaCardIn(List<String> values) {
            addCriterion("tea_card in", values, "teaCard");
            return (Criteria) this;
        }

        public Criteria andTeaCardNotIn(List<String> values) {
            addCriterion("tea_card not in", values, "teaCard");
            return (Criteria) this;
        }

        public Criteria andTeaCardBetween(String value1, String value2) {
            addCriterion("tea_card between", value1, value2, "teaCard");
            return (Criteria) this;
        }

        public Criteria andTeaCardNotBetween(String value1, String value2) {
            addCriterion("tea_card not between", value1, value2, "teaCard");
            return (Criteria) this;
        }

        public Criteria andTeaCollIsNull() {
            addCriterion("tea_coll is null");
            return (Criteria) this;
        }

        public Criteria andTeaCollIsNotNull() {
            addCriterion("tea_coll is not null");
            return (Criteria) this;
        }

        public Criteria andTeaCollEqualTo(String value) {
            addCriterion("tea_coll =", value, "teaColl");
            return (Criteria) this;
        }

        public Criteria andTeaCollNotEqualTo(String value) {
            addCriterion("tea_coll <>", value, "teaColl");
            return (Criteria) this;
        }

        public Criteria andTeaCollGreaterThan(String value) {
            addCriterion("tea_coll >", value, "teaColl");
            return (Criteria) this;
        }

        public Criteria andTeaCollGreaterThanOrEqualTo(String value) {
            addCriterion("tea_coll >=", value, "teaColl");
            return (Criteria) this;
        }

        public Criteria andTeaCollLessThan(String value) {
            addCriterion("tea_coll <", value, "teaColl");
            return (Criteria) this;
        }

        public Criteria andTeaCollLessThanOrEqualTo(String value) {
            addCriterion("tea_coll <=", value, "teaColl");
            return (Criteria) this;
        }

        public Criteria andTeaCollLike(String value) {
            addCriterion("tea_coll like", value, "teaColl");
            return (Criteria) this;
        }

        public Criteria andTeaCollNotLike(String value) {
            addCriterion("tea_coll not like", value, "teaColl");
            return (Criteria) this;
        }

        public Criteria andTeaCollIn(List<String> values) {
            addCriterion("tea_coll in", values, "teaColl");
            return (Criteria) this;
        }

        public Criteria andTeaCollNotIn(List<String> values) {
            addCriterion("tea_coll not in", values, "teaColl");
            return (Criteria) this;
        }

        public Criteria andTeaCollBetween(String value1, String value2) {
            addCriterion("tea_coll between", value1, value2, "teaColl");
            return (Criteria) this;
        }

        public Criteria andTeaCollNotBetween(String value1, String value2) {
            addCriterion("tea_coll not between", value1, value2, "teaColl");
            return (Criteria) this;
        }

        public Criteria andTeaSexIsNull() {
            addCriterion("tea_sex is null");
            return (Criteria) this;
        }

        public Criteria andTeaSexIsNotNull() {
            addCriterion("tea_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTeaSexEqualTo(Integer value) {
            addCriterion("tea_sex =", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotEqualTo(Integer value) {
            addCriterion("tea_sex <>", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexGreaterThan(Integer value) {
            addCriterion("tea_sex >", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("tea_sex >=", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexLessThan(Integer value) {
            addCriterion("tea_sex <", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexLessThanOrEqualTo(Integer value) {
            addCriterion("tea_sex <=", value, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexIn(List<Integer> values) {
            addCriterion("tea_sex in", values, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotIn(List<Integer> values) {
            addCriterion("tea_sex not in", values, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexBetween(Integer value1, Integer value2) {
            addCriterion("tea_sex between", value1, value2, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaSexNotBetween(Integer value1, Integer value2) {
            addCriterion("tea_sex not between", value1, value2, "teaSex");
            return (Criteria) this;
        }

        public Criteria andTeaImgIsNull() {
            addCriterion("tea_img is null");
            return (Criteria) this;
        }

        public Criteria andTeaImgIsNotNull() {
            addCriterion("tea_img is not null");
            return (Criteria) this;
        }

        public Criteria andTeaImgEqualTo(String value) {
            addCriterion("tea_img =", value, "teaImg");
            return (Criteria) this;
        }

        public Criteria andTeaImgNotEqualTo(String value) {
            addCriterion("tea_img <>", value, "teaImg");
            return (Criteria) this;
        }

        public Criteria andTeaImgGreaterThan(String value) {
            addCriterion("tea_img >", value, "teaImg");
            return (Criteria) this;
        }

        public Criteria andTeaImgGreaterThanOrEqualTo(String value) {
            addCriterion("tea_img >=", value, "teaImg");
            return (Criteria) this;
        }

        public Criteria andTeaImgLessThan(String value) {
            addCriterion("tea_img <", value, "teaImg");
            return (Criteria) this;
        }

        public Criteria andTeaImgLessThanOrEqualTo(String value) {
            addCriterion("tea_img <=", value, "teaImg");
            return (Criteria) this;
        }

        public Criteria andTeaImgLike(String value) {
            addCriterion("tea_img like", value, "teaImg");
            return (Criteria) this;
        }

        public Criteria andTeaImgNotLike(String value) {
            addCriterion("tea_img not like", value, "teaImg");
            return (Criteria) this;
        }

        public Criteria andTeaImgIn(List<String> values) {
            addCriterion("tea_img in", values, "teaImg");
            return (Criteria) this;
        }

        public Criteria andTeaImgNotIn(List<String> values) {
            addCriterion("tea_img not in", values, "teaImg");
            return (Criteria) this;
        }

        public Criteria andTeaImgBetween(String value1, String value2) {
            addCriterion("tea_img between", value1, value2, "teaImg");
            return (Criteria) this;
        }

        public Criteria andTeaImgNotBetween(String value1, String value2) {
            addCriterion("tea_img not between", value1, value2, "teaImg");
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