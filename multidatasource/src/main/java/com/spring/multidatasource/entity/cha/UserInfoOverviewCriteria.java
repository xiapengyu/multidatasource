package com.spring.multidatasource.entity.cha;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoOverviewCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoOverviewCriteria() {
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

        public Criteria andUserUuidIsNull() {
            addCriterion("user_uuid is null");
            return (Criteria) this;
        }

        public Criteria andUserUuidIsNotNull() {
            addCriterion("user_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUserUuidEqualTo(String value) {
            addCriterion("user_uuid =", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidNotEqualTo(String value) {
            addCriterion("user_uuid <>", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidGreaterThan(String value) {
            addCriterion("user_uuid >", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidGreaterThanOrEqualTo(String value) {
            addCriterion("user_uuid >=", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidLessThan(String value) {
            addCriterion("user_uuid <", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidLessThanOrEqualTo(String value) {
            addCriterion("user_uuid <=", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidLike(String value) {
            addCriterion("user_uuid like", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidNotLike(String value) {
            addCriterion("user_uuid not like", value, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidIn(List<String> values) {
            addCriterion("user_uuid in", values, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidNotIn(List<String> values) {
            addCriterion("user_uuid not in", values, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidBetween(String value1, String value2) {
            addCriterion("user_uuid between", value1, value2, "userUuid");
            return (Criteria) this;
        }

        public Criteria andUserUuidNotBetween(String value1, String value2) {
            addCriterion("user_uuid not between", value1, value2, "userUuid");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andAllRechargeAmountIsNull() {
            addCriterion("all_recharge_amount is null");
            return (Criteria) this;
        }

        public Criteria andAllRechargeAmountIsNotNull() {
            addCriterion("all_recharge_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAllRechargeAmountEqualTo(BigDecimal value) {
            addCriterion("all_recharge_amount =", value, "allRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andAllRechargeAmountNotEqualTo(BigDecimal value) {
            addCriterion("all_recharge_amount <>", value, "allRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andAllRechargeAmountGreaterThan(BigDecimal value) {
            addCriterion("all_recharge_amount >", value, "allRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andAllRechargeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("all_recharge_amount >=", value, "allRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andAllRechargeAmountLessThan(BigDecimal value) {
            addCriterion("all_recharge_amount <", value, "allRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andAllRechargeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("all_recharge_amount <=", value, "allRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andAllRechargeAmountIn(List<BigDecimal> values) {
            addCriterion("all_recharge_amount in", values, "allRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andAllRechargeAmountNotIn(List<BigDecimal> values) {
            addCriterion("all_recharge_amount not in", values, "allRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andAllRechargeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_recharge_amount between", value1, value2, "allRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andAllRechargeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_recharge_amount not between", value1, value2, "allRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andAllConsumeAmountIsNull() {
            addCriterion("all_consume_amount is null");
            return (Criteria) this;
        }

        public Criteria andAllConsumeAmountIsNotNull() {
            addCriterion("all_consume_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAllConsumeAmountEqualTo(BigDecimal value) {
            addCriterion("all_consume_amount =", value, "allConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andAllConsumeAmountNotEqualTo(BigDecimal value) {
            addCriterion("all_consume_amount <>", value, "allConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andAllConsumeAmountGreaterThan(BigDecimal value) {
            addCriterion("all_consume_amount >", value, "allConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andAllConsumeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("all_consume_amount >=", value, "allConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andAllConsumeAmountLessThan(BigDecimal value) {
            addCriterion("all_consume_amount <", value, "allConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andAllConsumeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("all_consume_amount <=", value, "allConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andAllConsumeAmountIn(List<BigDecimal> values) {
            addCriterion("all_consume_amount in", values, "allConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andAllConsumeAmountNotIn(List<BigDecimal> values) {
            addCriterion("all_consume_amount not in", values, "allConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andAllConsumeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_consume_amount between", value1, value2, "allConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andAllConsumeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_consume_amount not between", value1, value2, "allConsumeAmount");
            return (Criteria) this;
        }

        public Criteria andAllElectricityKwhIsNull() {
            addCriterion("all_electricity_kwh is null");
            return (Criteria) this;
        }

        public Criteria andAllElectricityKwhIsNotNull() {
            addCriterion("all_electricity_kwh is not null");
            return (Criteria) this;
        }

        public Criteria andAllElectricityKwhEqualTo(BigDecimal value) {
            addCriterion("all_electricity_kwh =", value, "allElectricityKwh");
            return (Criteria) this;
        }

        public Criteria andAllElectricityKwhNotEqualTo(BigDecimal value) {
            addCriterion("all_electricity_kwh <>", value, "allElectricityKwh");
            return (Criteria) this;
        }

        public Criteria andAllElectricityKwhGreaterThan(BigDecimal value) {
            addCriterion("all_electricity_kwh >", value, "allElectricityKwh");
            return (Criteria) this;
        }

        public Criteria andAllElectricityKwhGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("all_electricity_kwh >=", value, "allElectricityKwh");
            return (Criteria) this;
        }

        public Criteria andAllElectricityKwhLessThan(BigDecimal value) {
            addCriterion("all_electricity_kwh <", value, "allElectricityKwh");
            return (Criteria) this;
        }

        public Criteria andAllElectricityKwhLessThanOrEqualTo(BigDecimal value) {
            addCriterion("all_electricity_kwh <=", value, "allElectricityKwh");
            return (Criteria) this;
        }

        public Criteria andAllElectricityKwhIn(List<BigDecimal> values) {
            addCriterion("all_electricity_kwh in", values, "allElectricityKwh");
            return (Criteria) this;
        }

        public Criteria andAllElectricityKwhNotIn(List<BigDecimal> values) {
            addCriterion("all_electricity_kwh not in", values, "allElectricityKwh");
            return (Criteria) this;
        }

        public Criteria andAllElectricityKwhBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_electricity_kwh between", value1, value2, "allElectricityKwh");
            return (Criteria) this;
        }

        public Criteria andAllElectricityKwhNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("all_electricity_kwh not between", value1, value2, "allElectricityKwh");
            return (Criteria) this;
        }

        public Criteria andAllConsumeNumIsNull() {
            addCriterion("all_consume_num is null");
            return (Criteria) this;
        }

        public Criteria andAllConsumeNumIsNotNull() {
            addCriterion("all_consume_num is not null");
            return (Criteria) this;
        }

        public Criteria andAllConsumeNumEqualTo(Integer value) {
            addCriterion("all_consume_num =", value, "allConsumeNum");
            return (Criteria) this;
        }

        public Criteria andAllConsumeNumNotEqualTo(Integer value) {
            addCriterion("all_consume_num <>", value, "allConsumeNum");
            return (Criteria) this;
        }

        public Criteria andAllConsumeNumGreaterThan(Integer value) {
            addCriterion("all_consume_num >", value, "allConsumeNum");
            return (Criteria) this;
        }

        public Criteria andAllConsumeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("all_consume_num >=", value, "allConsumeNum");
            return (Criteria) this;
        }

        public Criteria andAllConsumeNumLessThan(Integer value) {
            addCriterion("all_consume_num <", value, "allConsumeNum");
            return (Criteria) this;
        }

        public Criteria andAllConsumeNumLessThanOrEqualTo(Integer value) {
            addCriterion("all_consume_num <=", value, "allConsumeNum");
            return (Criteria) this;
        }

        public Criteria andAllConsumeNumIn(List<Integer> values) {
            addCriterion("all_consume_num in", values, "allConsumeNum");
            return (Criteria) this;
        }

        public Criteria andAllConsumeNumNotIn(List<Integer> values) {
            addCriterion("all_consume_num not in", values, "allConsumeNum");
            return (Criteria) this;
        }

        public Criteria andAllConsumeNumBetween(Integer value1, Integer value2) {
            addCriterion("all_consume_num between", value1, value2, "allConsumeNum");
            return (Criteria) this;
        }

        public Criteria andAllConsumeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("all_consume_num not between", value1, value2, "allConsumeNum");
            return (Criteria) this;
        }

        public Criteria andSignIsNull() {
            addCriterion("sign is null");
            return (Criteria) this;
        }

        public Criteria andSignIsNotNull() {
            addCriterion("sign is not null");
            return (Criteria) this;
        }

        public Criteria andSignEqualTo(String value) {
            addCriterion("sign =", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotEqualTo(String value) {
            addCriterion("sign <>", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThan(String value) {
            addCriterion("sign >", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThanOrEqualTo(String value) {
            addCriterion("sign >=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThan(String value) {
            addCriterion("sign <", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThanOrEqualTo(String value) {
            addCriterion("sign <=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLike(String value) {
            addCriterion("sign like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotLike(String value) {
            addCriterion("sign not like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignIn(List<String> values) {
            addCriterion("sign in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotIn(List<String> values) {
            addCriterion("sign not in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignBetween(String value1, String value2) {
            addCriterion("sign between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotBetween(String value1, String value2) {
            addCriterion("sign not between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andTotalChargingTimeIsNull() {
            addCriterion("total_charging_time is null");
            return (Criteria) this;
        }

        public Criteria andTotalChargingTimeIsNotNull() {
            addCriterion("total_charging_time is not null");
            return (Criteria) this;
        }

        public Criteria andTotalChargingTimeEqualTo(Long value) {
            addCriterion("total_charging_time =", value, "totalChargingTime");
            return (Criteria) this;
        }

        public Criteria andTotalChargingTimeNotEqualTo(Long value) {
            addCriterion("total_charging_time <>", value, "totalChargingTime");
            return (Criteria) this;
        }

        public Criteria andTotalChargingTimeGreaterThan(Long value) {
            addCriterion("total_charging_time >", value, "totalChargingTime");
            return (Criteria) this;
        }

        public Criteria andTotalChargingTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("total_charging_time >=", value, "totalChargingTime");
            return (Criteria) this;
        }

        public Criteria andTotalChargingTimeLessThan(Long value) {
            addCriterion("total_charging_time <", value, "totalChargingTime");
            return (Criteria) this;
        }

        public Criteria andTotalChargingTimeLessThanOrEqualTo(Long value) {
            addCriterion("total_charging_time <=", value, "totalChargingTime");
            return (Criteria) this;
        }

        public Criteria andTotalChargingTimeIn(List<Long> values) {
            addCriterion("total_charging_time in", values, "totalChargingTime");
            return (Criteria) this;
        }

        public Criteria andTotalChargingTimeNotIn(List<Long> values) {
            addCriterion("total_charging_time not in", values, "totalChargingTime");
            return (Criteria) this;
        }

        public Criteria andTotalChargingTimeBetween(Long value1, Long value2) {
            addCriterion("total_charging_time between", value1, value2, "totalChargingTime");
            return (Criteria) this;
        }

        public Criteria andTotalChargingTimeNotBetween(Long value1, Long value2) {
            addCriterion("total_charging_time not between", value1, value2, "totalChargingTime");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Short value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Short value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Short value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Short value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Short value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Short> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Short> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Short value1, Short value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Short value1, Short value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(String value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(String value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(String value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(String value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(String value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(String value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLike(String value) {
            addCriterion("province_id like", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotLike(String value) {
            addCriterion("province_id not like", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<String> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<String> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(String value1, String value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(String value1, String value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(String value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(String value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(String value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(String value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(String value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(String value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLike(String value) {
            addCriterion("city_id like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotLike(String value) {
            addCriterion("city_id not like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<String> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<String> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(String value1, String value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(String value1, String value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNull() {
            addCriterion("region_id is null");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNotNull() {
            addCriterion("region_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegionIdEqualTo(String value) {
            addCriterion("region_id =", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotEqualTo(String value) {
            addCriterion("region_id <>", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThan(String value) {
            addCriterion("region_id >", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThanOrEqualTo(String value) {
            addCriterion("region_id >=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThan(String value) {
            addCriterion("region_id <", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThanOrEqualTo(String value) {
            addCriterion("region_id <=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLike(String value) {
            addCriterion("region_id like", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotLike(String value) {
            addCriterion("region_id not like", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdIn(List<String> values) {
            addCriterion("region_id in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotIn(List<String> values) {
            addCriterion("region_id not in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdBetween(String value1, String value2) {
            addCriterion("region_id between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotBetween(String value1, String value2) {
            addCriterion("region_id not between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andStationUuidIsNull() {
            addCriterion("station_uuid is null");
            return (Criteria) this;
        }

        public Criteria andStationUuidIsNotNull() {
            addCriterion("station_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andStationUuidEqualTo(String value) {
            addCriterion("station_uuid =", value, "stationUuid");
            return (Criteria) this;
        }

        public Criteria andStationUuidNotEqualTo(String value) {
            addCriterion("station_uuid <>", value, "stationUuid");
            return (Criteria) this;
        }

        public Criteria andStationUuidGreaterThan(String value) {
            addCriterion("station_uuid >", value, "stationUuid");
            return (Criteria) this;
        }

        public Criteria andStationUuidGreaterThanOrEqualTo(String value) {
            addCriterion("station_uuid >=", value, "stationUuid");
            return (Criteria) this;
        }

        public Criteria andStationUuidLessThan(String value) {
            addCriterion("station_uuid <", value, "stationUuid");
            return (Criteria) this;
        }

        public Criteria andStationUuidLessThanOrEqualTo(String value) {
            addCriterion("station_uuid <=", value, "stationUuid");
            return (Criteria) this;
        }

        public Criteria andStationUuidLike(String value) {
            addCriterion("station_uuid like", value, "stationUuid");
            return (Criteria) this;
        }

        public Criteria andStationUuidNotLike(String value) {
            addCriterion("station_uuid not like", value, "stationUuid");
            return (Criteria) this;
        }

        public Criteria andStationUuidIn(List<String> values) {
            addCriterion("station_uuid in", values, "stationUuid");
            return (Criteria) this;
        }

        public Criteria andStationUuidNotIn(List<String> values) {
            addCriterion("station_uuid not in", values, "stationUuid");
            return (Criteria) this;
        }

        public Criteria andStationUuidBetween(String value1, String value2) {
            addCriterion("station_uuid between", value1, value2, "stationUuid");
            return (Criteria) this;
        }

        public Criteria andStationUuidNotBetween(String value1, String value2) {
            addCriterion("station_uuid not between", value1, value2, "stationUuid");
            return (Criteria) this;
        }

        public Criteria andActivityLockingAmountIsNull() {
            addCriterion("activity_locking_amount is null");
            return (Criteria) this;
        }

        public Criteria andActivityLockingAmountIsNotNull() {
            addCriterion("activity_locking_amount is not null");
            return (Criteria) this;
        }

        public Criteria andActivityLockingAmountEqualTo(BigDecimal value) {
            addCriterion("activity_locking_amount =", value, "activityLockingAmount");
            return (Criteria) this;
        }

        public Criteria andActivityLockingAmountNotEqualTo(BigDecimal value) {
            addCriterion("activity_locking_amount <>", value, "activityLockingAmount");
            return (Criteria) this;
        }

        public Criteria andActivityLockingAmountGreaterThan(BigDecimal value) {
            addCriterion("activity_locking_amount >", value, "activityLockingAmount");
            return (Criteria) this;
        }

        public Criteria andActivityLockingAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("activity_locking_amount >=", value, "activityLockingAmount");
            return (Criteria) this;
        }

        public Criteria andActivityLockingAmountLessThan(BigDecimal value) {
            addCriterion("activity_locking_amount <", value, "activityLockingAmount");
            return (Criteria) this;
        }

        public Criteria andActivityLockingAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("activity_locking_amount <=", value, "activityLockingAmount");
            return (Criteria) this;
        }

        public Criteria andActivityLockingAmountIn(List<BigDecimal> values) {
            addCriterion("activity_locking_amount in", values, "activityLockingAmount");
            return (Criteria) this;
        }

        public Criteria andActivityLockingAmountNotIn(List<BigDecimal> values) {
            addCriterion("activity_locking_amount not in", values, "activityLockingAmount");
            return (Criteria) this;
        }

        public Criteria andActivityLockingAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("activity_locking_amount between", value1, value2, "activityLockingAmount");
            return (Criteria) this;
        }

        public Criteria andActivityLockingAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("activity_locking_amount not between", value1, value2, "activityLockingAmount");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIsNull() {
            addCriterion("avatar_url is null");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIsNotNull() {
            addCriterion("avatar_url is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlEqualTo(String value) {
            addCriterion("avatar_url =", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotEqualTo(String value) {
            addCriterion("avatar_url <>", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlGreaterThan(String value) {
            addCriterion("avatar_url >", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlGreaterThanOrEqualTo(String value) {
            addCriterion("avatar_url >=", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLessThan(String value) {
            addCriterion("avatar_url <", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLessThanOrEqualTo(String value) {
            addCriterion("avatar_url <=", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLike(String value) {
            addCriterion("avatar_url like", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotLike(String value) {
            addCriterion("avatar_url not like", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIn(List<String> values) {
            addCriterion("avatar_url in", values, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotIn(List<String> values) {
            addCriterion("avatar_url not in", values, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlBetween(String value1, String value2) {
            addCriterion("avatar_url between", value1, value2, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotBetween(String value1, String value2) {
            addCriterion("avatar_url not between", value1, value2, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNull() {
            addCriterion("union_id is null");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNotNull() {
            addCriterion("union_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnionIdEqualTo(String value) {
            addCriterion("union_id =", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotEqualTo(String value) {
            addCriterion("union_id <>", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThan(String value) {
            addCriterion("union_id >", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThanOrEqualTo(String value) {
            addCriterion("union_id >=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThan(String value) {
            addCriterion("union_id <", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThanOrEqualTo(String value) {
            addCriterion("union_id <=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLike(String value) {
            addCriterion("union_id like", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotLike(String value) {
            addCriterion("union_id not like", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdIn(List<String> values) {
            addCriterion("union_id in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotIn(List<String> values) {
            addCriterion("union_id not in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdBetween(String value1, String value2) {
            addCriterion("union_id between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotBetween(String value1, String value2) {
            addCriterion("union_id not between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andIsSyncIsNull() {
            addCriterion("is_sync is null");
            return (Criteria) this;
        }

        public Criteria andIsSyncIsNotNull() {
            addCriterion("is_sync is not null");
            return (Criteria) this;
        }

        public Criteria andIsSyncEqualTo(Short value) {
            addCriterion("is_sync =", value, "isSync");
            return (Criteria) this;
        }

        public Criteria andIsSyncNotEqualTo(Short value) {
            addCriterion("is_sync <>", value, "isSync");
            return (Criteria) this;
        }

        public Criteria andIsSyncGreaterThan(Short value) {
            addCriterion("is_sync >", value, "isSync");
            return (Criteria) this;
        }

        public Criteria andIsSyncGreaterThanOrEqualTo(Short value) {
            addCriterion("is_sync >=", value, "isSync");
            return (Criteria) this;
        }

        public Criteria andIsSyncLessThan(Short value) {
            addCriterion("is_sync <", value, "isSync");
            return (Criteria) this;
        }

        public Criteria andIsSyncLessThanOrEqualTo(Short value) {
            addCriterion("is_sync <=", value, "isSync");
            return (Criteria) this;
        }

        public Criteria andIsSyncIn(List<Short> values) {
            addCriterion("is_sync in", values, "isSync");
            return (Criteria) this;
        }

        public Criteria andIsSyncNotIn(List<Short> values) {
            addCriterion("is_sync not in", values, "isSync");
            return (Criteria) this;
        }

        public Criteria andIsSyncBetween(Short value1, Short value2) {
            addCriterion("is_sync between", value1, value2, "isSync");
            return (Criteria) this;
        }

        public Criteria andIsSyncNotBetween(Short value1, Short value2) {
            addCriterion("is_sync not between", value1, value2, "isSync");
            return (Criteria) this;
        }

        public Criteria andChannelLockingAmountIsNull() {
            addCriterion("channel_locking_amount is null");
            return (Criteria) this;
        }

        public Criteria andChannelLockingAmountIsNotNull() {
            addCriterion("channel_locking_amount is not null");
            return (Criteria) this;
        }

        public Criteria andChannelLockingAmountEqualTo(BigDecimal value) {
            addCriterion("channel_locking_amount =", value, "channelLockingAmount");
            return (Criteria) this;
        }

        public Criteria andChannelLockingAmountNotEqualTo(BigDecimal value) {
            addCriterion("channel_locking_amount <>", value, "channelLockingAmount");
            return (Criteria) this;
        }

        public Criteria andChannelLockingAmountGreaterThan(BigDecimal value) {
            addCriterion("channel_locking_amount >", value, "channelLockingAmount");
            return (Criteria) this;
        }

        public Criteria andChannelLockingAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("channel_locking_amount >=", value, "channelLockingAmount");
            return (Criteria) this;
        }

        public Criteria andChannelLockingAmountLessThan(BigDecimal value) {
            addCriterion("channel_locking_amount <", value, "channelLockingAmount");
            return (Criteria) this;
        }

        public Criteria andChannelLockingAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("channel_locking_amount <=", value, "channelLockingAmount");
            return (Criteria) this;
        }

        public Criteria andChannelLockingAmountIn(List<BigDecimal> values) {
            addCriterion("channel_locking_amount in", values, "channelLockingAmount");
            return (Criteria) this;
        }

        public Criteria andChannelLockingAmountNotIn(List<BigDecimal> values) {
            addCriterion("channel_locking_amount not in", values, "channelLockingAmount");
            return (Criteria) this;
        }

        public Criteria andChannelLockingAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("channel_locking_amount between", value1, value2, "channelLockingAmount");
            return (Criteria) this;
        }

        public Criteria andChannelLockingAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("channel_locking_amount not between", value1, value2, "channelLockingAmount");
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