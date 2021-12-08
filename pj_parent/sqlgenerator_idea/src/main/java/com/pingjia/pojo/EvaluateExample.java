package com.pingjia.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluateExample() {
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

        public Criteria andUCardnoIsNull() {
            addCriterion("u_cardNo is null");
            return (Criteria) this;
        }

        public Criteria andUCardnoIsNotNull() {
            addCriterion("u_cardNo is not null");
            return (Criteria) this;
        }

        public Criteria andUCardnoEqualTo(String value) {
            addCriterion("u_cardNo =", value, "uCardno");
            return (Criteria) this;
        }

        public Criteria andUCardnoNotEqualTo(String value) {
            addCriterion("u_cardNo <>", value, "uCardno");
            return (Criteria) this;
        }

        public Criteria andUCardnoGreaterThan(String value) {
            addCriterion("u_cardNo >", value, "uCardno");
            return (Criteria) this;
        }

        public Criteria andUCardnoGreaterThanOrEqualTo(String value) {
            addCriterion("u_cardNo >=", value, "uCardno");
            return (Criteria) this;
        }

        public Criteria andUCardnoLessThan(String value) {
            addCriterion("u_cardNo <", value, "uCardno");
            return (Criteria) this;
        }

        public Criteria andUCardnoLessThanOrEqualTo(String value) {
            addCriterion("u_cardNo <=", value, "uCardno");
            return (Criteria) this;
        }

        public Criteria andUCardnoLike(String value) {
            addCriterion("u_cardNo like", value, "uCardno");
            return (Criteria) this;
        }

        public Criteria andUCardnoNotLike(String value) {
            addCriterion("u_cardNo not like", value, "uCardno");
            return (Criteria) this;
        }

        public Criteria andUCardnoIn(List<String> values) {
            addCriterion("u_cardNo in", values, "uCardno");
            return (Criteria) this;
        }

        public Criteria andUCardnoNotIn(List<String> values) {
            addCriterion("u_cardNo not in", values, "uCardno");
            return (Criteria) this;
        }

        public Criteria andUCardnoBetween(String value1, String value2) {
            addCriterion("u_cardNo between", value1, value2, "uCardno");
            return (Criteria) this;
        }

        public Criteria andUCardnoNotBetween(String value1, String value2) {
            addCriterion("u_cardNo not between", value1, value2, "uCardno");
            return (Criteria) this;
        }

        public Criteria andUUsernameIsNull() {
            addCriterion("u_username is null");
            return (Criteria) this;
        }

        public Criteria andUUsernameIsNotNull() {
            addCriterion("u_username is not null");
            return (Criteria) this;
        }

        public Criteria andUUsernameEqualTo(String value) {
            addCriterion("u_username =", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameNotEqualTo(String value) {
            addCriterion("u_username <>", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameGreaterThan(String value) {
            addCriterion("u_username >", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("u_username >=", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameLessThan(String value) {
            addCriterion("u_username <", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameLessThanOrEqualTo(String value) {
            addCriterion("u_username <=", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameLike(String value) {
            addCriterion("u_username like", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameNotLike(String value) {
            addCriterion("u_username not like", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameIn(List<String> values) {
            addCriterion("u_username in", values, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameNotIn(List<String> values) {
            addCriterion("u_username not in", values, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameBetween(String value1, String value2) {
            addCriterion("u_username between", value1, value2, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameNotBetween(String value1, String value2) {
            addCriterion("u_username not between", value1, value2, "uUsername");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentCreatedTimeIsNull() {
            addCriterion("content_created_time is null");
            return (Criteria) this;
        }

        public Criteria andContentCreatedTimeIsNotNull() {
            addCriterion("content_created_time is not null");
            return (Criteria) this;
        }

        public Criteria andContentCreatedTimeEqualTo(Date value) {
            addCriterion("content_created_time =", value, "contentCreatedTime");
            return (Criteria) this;
        }

        public Criteria andContentCreatedTimeNotEqualTo(Date value) {
            addCriterion("content_created_time <>", value, "contentCreatedTime");
            return (Criteria) this;
        }

        public Criteria andContentCreatedTimeGreaterThan(Date value) {
            addCriterion("content_created_time >", value, "contentCreatedTime");
            return (Criteria) this;
        }

        public Criteria andContentCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("content_created_time >=", value, "contentCreatedTime");
            return (Criteria) this;
        }

        public Criteria andContentCreatedTimeLessThan(Date value) {
            addCriterion("content_created_time <", value, "contentCreatedTime");
            return (Criteria) this;
        }

        public Criteria andContentCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("content_created_time <=", value, "contentCreatedTime");
            return (Criteria) this;
        }

        public Criteria andContentCreatedTimeIn(List<Date> values) {
            addCriterion("content_created_time in", values, "contentCreatedTime");
            return (Criteria) this;
        }

        public Criteria andContentCreatedTimeNotIn(List<Date> values) {
            addCriterion("content_created_time not in", values, "contentCreatedTime");
            return (Criteria) this;
        }

        public Criteria andContentCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("content_created_time between", value1, value2, "contentCreatedTime");
            return (Criteria) this;
        }

        public Criteria andContentCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("content_created_time not between", value1, value2, "contentCreatedTime");
            return (Criteria) this;
        }

        public Criteria andContentUpdateTimeIsNull() {
            addCriterion("content_update_time is null");
            return (Criteria) this;
        }

        public Criteria andContentUpdateTimeIsNotNull() {
            addCriterion("content_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andContentUpdateTimeEqualTo(Date value) {
            addCriterion("content_update_time =", value, "contentUpdateTime");
            return (Criteria) this;
        }

        public Criteria andContentUpdateTimeNotEqualTo(Date value) {
            addCriterion("content_update_time <>", value, "contentUpdateTime");
            return (Criteria) this;
        }

        public Criteria andContentUpdateTimeGreaterThan(Date value) {
            addCriterion("content_update_time >", value, "contentUpdateTime");
            return (Criteria) this;
        }

        public Criteria andContentUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("content_update_time >=", value, "contentUpdateTime");
            return (Criteria) this;
        }

        public Criteria andContentUpdateTimeLessThan(Date value) {
            addCriterion("content_update_time <", value, "contentUpdateTime");
            return (Criteria) this;
        }

        public Criteria andContentUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("content_update_time <=", value, "contentUpdateTime");
            return (Criteria) this;
        }

        public Criteria andContentUpdateTimeIn(List<Date> values) {
            addCriterion("content_update_time in", values, "contentUpdateTime");
            return (Criteria) this;
        }

        public Criteria andContentUpdateTimeNotIn(List<Date> values) {
            addCriterion("content_update_time not in", values, "contentUpdateTime");
            return (Criteria) this;
        }

        public Criteria andContentUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("content_update_time between", value1, value2, "contentUpdateTime");
            return (Criteria) this;
        }

        public Criteria andContentUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("content_update_time not between", value1, value2, "contentUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCCardnoIsNull() {
            addCriterion("c_cardNo is null");
            return (Criteria) this;
        }

        public Criteria andCCardnoIsNotNull() {
            addCriterion("c_cardNo is not null");
            return (Criteria) this;
        }

        public Criteria andCCardnoEqualTo(String value) {
            addCriterion("c_cardNo =", value, "cCardno");
            return (Criteria) this;
        }

        public Criteria andCCardnoNotEqualTo(String value) {
            addCriterion("c_cardNo <>", value, "cCardno");
            return (Criteria) this;
        }

        public Criteria andCCardnoGreaterThan(String value) {
            addCriterion("c_cardNo >", value, "cCardno");
            return (Criteria) this;
        }

        public Criteria andCCardnoGreaterThanOrEqualTo(String value) {
            addCriterion("c_cardNo >=", value, "cCardno");
            return (Criteria) this;
        }

        public Criteria andCCardnoLessThan(String value) {
            addCriterion("c_cardNo <", value, "cCardno");
            return (Criteria) this;
        }

        public Criteria andCCardnoLessThanOrEqualTo(String value) {
            addCriterion("c_cardNo <=", value, "cCardno");
            return (Criteria) this;
        }

        public Criteria andCCardnoLike(String value) {
            addCriterion("c_cardNo like", value, "cCardno");
            return (Criteria) this;
        }

        public Criteria andCCardnoNotLike(String value) {
            addCriterion("c_cardNo not like", value, "cCardno");
            return (Criteria) this;
        }

        public Criteria andCCardnoIn(List<String> values) {
            addCriterion("c_cardNo in", values, "cCardno");
            return (Criteria) this;
        }

        public Criteria andCCardnoNotIn(List<String> values) {
            addCriterion("c_cardNo not in", values, "cCardno");
            return (Criteria) this;
        }

        public Criteria andCCardnoBetween(String value1, String value2) {
            addCriterion("c_cardNo between", value1, value2, "cCardno");
            return (Criteria) this;
        }

        public Criteria andCCardnoNotBetween(String value1, String value2) {
            addCriterion("c_cardNo not between", value1, value2, "cCardno");
            return (Criteria) this;
        }

        public Criteria andENameIsNull() {
            addCriterion("e_name is null");
            return (Criteria) this;
        }

        public Criteria andENameIsNotNull() {
            addCriterion("e_name is not null");
            return (Criteria) this;
        }

        public Criteria andENameEqualTo(String value) {
            addCriterion("e_name =", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotEqualTo(String value) {
            addCriterion("e_name <>", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameGreaterThan(String value) {
            addCriterion("e_name >", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameGreaterThanOrEqualTo(String value) {
            addCriterion("e_name >=", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLessThan(String value) {
            addCriterion("e_name <", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLessThanOrEqualTo(String value) {
            addCriterion("e_name <=", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLike(String value) {
            addCriterion("e_name like", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotLike(String value) {
            addCriterion("e_name not like", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameIn(List<String> values) {
            addCriterion("e_name in", values, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotIn(List<String> values) {
            addCriterion("e_name not in", values, "eName");
            return (Criteria) this;
        }

        public Criteria andENameBetween(String value1, String value2) {
            addCriterion("e_name between", value1, value2, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotBetween(String value1, String value2) {
            addCriterion("e_name not between", value1, value2, "eName");
            return (Criteria) this;
        }

        public Criteria andEFlagIsNull() {
            addCriterion("e_flag is null");
            return (Criteria) this;
        }

        public Criteria andEFlagIsNotNull() {
            addCriterion("e_flag is not null");
            return (Criteria) this;
        }

        public Criteria andEFlagEqualTo(Integer value) {
            addCriterion("e_flag =", value, "eFlag");
            return (Criteria) this;
        }

        public Criteria andEFlagNotEqualTo(Integer value) {
            addCriterion("e_flag <>", value, "eFlag");
            return (Criteria) this;
        }

        public Criteria andEFlagGreaterThan(Integer value) {
            addCriterion("e_flag >", value, "eFlag");
            return (Criteria) this;
        }

        public Criteria andEFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_flag >=", value, "eFlag");
            return (Criteria) this;
        }

        public Criteria andEFlagLessThan(Integer value) {
            addCriterion("e_flag <", value, "eFlag");
            return (Criteria) this;
        }

        public Criteria andEFlagLessThanOrEqualTo(Integer value) {
            addCriterion("e_flag <=", value, "eFlag");
            return (Criteria) this;
        }

        public Criteria andEFlagIn(List<Integer> values) {
            addCriterion("e_flag in", values, "eFlag");
            return (Criteria) this;
        }

        public Criteria andEFlagNotIn(List<Integer> values) {
            addCriterion("e_flag not in", values, "eFlag");
            return (Criteria) this;
        }

        public Criteria andEFlagBetween(Integer value1, Integer value2) {
            addCriterion("e_flag between", value1, value2, "eFlag");
            return (Criteria) this;
        }

        public Criteria andEFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("e_flag not between", value1, value2, "eFlag");
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