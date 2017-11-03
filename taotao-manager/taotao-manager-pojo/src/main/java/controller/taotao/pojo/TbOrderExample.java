package controller.taotao.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("PAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("PAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(String value) {
            addCriterion("PAYMENT =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(String value) {
            addCriterion("PAYMENT <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(String value) {
            addCriterion("PAYMENT >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(String value) {
            addCriterion("PAYMENT <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLike(String value) {
            addCriterion("PAYMENT like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotLike(String value) {
            addCriterion("PAYMENT not like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<String> values) {
            addCriterion("PAYMENT in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<String> values) {
            addCriterion("PAYMENT not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(String value1, String value2) {
            addCriterion("PAYMENT between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(String value1, String value2) {
            addCriterion("PAYMENT not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("PAYMENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("PAYMENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(String value) {
            addCriterion("PAYMENT_TYPE =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(String value) {
            addCriterion("PAYMENT_TYPE <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(String value) {
            addCriterion("PAYMENT_TYPE >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_TYPE >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(String value) {
            addCriterion("PAYMENT_TYPE <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_TYPE <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLike(String value) {
            addCriterion("PAYMENT_TYPE like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotLike(String value) {
            addCriterion("PAYMENT_TYPE not like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<String> values) {
            addCriterion("PAYMENT_TYPE in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<String> values) {
            addCriterion("PAYMENT_TYPE not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(String value1, String value2) {
            addCriterion("PAYMENT_TYPE between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_TYPE not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPostFeeIsNull() {
            addCriterion("POST_FEE is null");
            return (Criteria) this;
        }

        public Criteria andPostFeeIsNotNull() {
            addCriterion("POST_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andPostFeeEqualTo(String value) {
            addCriterion("POST_FEE =", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeNotEqualTo(String value) {
            addCriterion("POST_FEE <>", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeGreaterThan(String value) {
            addCriterion("POST_FEE >", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeGreaterThanOrEqualTo(String value) {
            addCriterion("POST_FEE >=", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeLessThan(String value) {
            addCriterion("POST_FEE <", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeLessThanOrEqualTo(String value) {
            addCriterion("POST_FEE <=", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeLike(String value) {
            addCriterion("POST_FEE like", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeNotLike(String value) {
            addCriterion("POST_FEE not like", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeIn(List<String> values) {
            addCriterion("POST_FEE in", values, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeNotIn(List<String> values) {
            addCriterion("POST_FEE not in", values, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeBetween(String value1, String value2) {
            addCriterion("POST_FEE between", value1, value2, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeNotBetween(String value1, String value2) {
            addCriterion("POST_FEE not between", value1, value2, "postFee");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNull() {
            addCriterion("PAYMENT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNotNull() {
            addCriterion("PAYMENT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeEqualTo(String value) {
            addCriterion("PAYMENT_TIME =", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualTo(String value) {
            addCriterion("PAYMENT_TIME <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThan(String value) {
            addCriterion("PAYMENT_TIME >", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_TIME >=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThan(String value) {
            addCriterion("PAYMENT_TIME <", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_TIME <=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLike(String value) {
            addCriterion("PAYMENT_TIME like", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotLike(String value) {
            addCriterion("PAYMENT_TIME not like", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIn(List<String> values) {
            addCriterion("PAYMENT_TIME in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotIn(List<String> values) {
            addCriterion("PAYMENT_TIME not in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeBetween(String value1, String value2) {
            addCriterion("PAYMENT_TIME between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_TIME not between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeIsNull() {
            addCriterion("CONSIGN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andConsignTimeIsNotNull() {
            addCriterion("CONSIGN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andConsignTimeEqualTo(String value) {
            addCriterion("CONSIGN_TIME =", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeNotEqualTo(String value) {
            addCriterion("CONSIGN_TIME <>", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeGreaterThan(String value) {
            addCriterion("CONSIGN_TIME >", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CONSIGN_TIME >=", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeLessThan(String value) {
            addCriterion("CONSIGN_TIME <", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeLessThanOrEqualTo(String value) {
            addCriterion("CONSIGN_TIME <=", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeLike(String value) {
            addCriterion("CONSIGN_TIME like", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeNotLike(String value) {
            addCriterion("CONSIGN_TIME not like", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeIn(List<String> values) {
            addCriterion("CONSIGN_TIME in", values, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeNotIn(List<String> values) {
            addCriterion("CONSIGN_TIME not in", values, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeBetween(String value1, String value2) {
            addCriterion("CONSIGN_TIME between", value1, value2, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeNotBetween(String value1, String value2) {
            addCriterion("CONSIGN_TIME not between", value1, value2, "consignTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("END_TIME like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("END_TIME not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNull() {
            addCriterion("CLOSE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNotNull() {
            addCriterion("CLOSE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeEqualTo(String value) {
            addCriterion("CLOSE_TIME =", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotEqualTo(String value) {
            addCriterion("CLOSE_TIME <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThan(String value) {
            addCriterion("CLOSE_TIME >", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CLOSE_TIME >=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThan(String value) {
            addCriterion("CLOSE_TIME <", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThanOrEqualTo(String value) {
            addCriterion("CLOSE_TIME <=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLike(String value) {
            addCriterion("CLOSE_TIME like", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotLike(String value) {
            addCriterion("CLOSE_TIME not like", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIn(List<String> values) {
            addCriterion("CLOSE_TIME in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotIn(List<String> values) {
            addCriterion("CLOSE_TIME not in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeBetween(String value1, String value2) {
            addCriterion("CLOSE_TIME between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotBetween(String value1, String value2) {
            addCriterion("CLOSE_TIME not between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andShippingNameIsNull() {
            addCriterion("SHIPPING_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShippingNameIsNotNull() {
            addCriterion("SHIPPING_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShippingNameEqualTo(String value) {
            addCriterion("SHIPPING_NAME =", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotEqualTo(String value) {
            addCriterion("SHIPPING_NAME <>", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameGreaterThan(String value) {
            addCriterion("SHIPPING_NAME >", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHIPPING_NAME >=", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameLessThan(String value) {
            addCriterion("SHIPPING_NAME <", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameLessThanOrEqualTo(String value) {
            addCriterion("SHIPPING_NAME <=", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameLike(String value) {
            addCriterion("SHIPPING_NAME like", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotLike(String value) {
            addCriterion("SHIPPING_NAME not like", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameIn(List<String> values) {
            addCriterion("SHIPPING_NAME in", values, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotIn(List<String> values) {
            addCriterion("SHIPPING_NAME not in", values, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameBetween(String value1, String value2) {
            addCriterion("SHIPPING_NAME between", value1, value2, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotBetween(String value1, String value2) {
            addCriterion("SHIPPING_NAME not between", value1, value2, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingCodeIsNull() {
            addCriterion("SHIPPING_CODE is null");
            return (Criteria) this;
        }

        public Criteria andShippingCodeIsNotNull() {
            addCriterion("SHIPPING_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andShippingCodeEqualTo(String value) {
            addCriterion("SHIPPING_CODE =", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotEqualTo(String value) {
            addCriterion("SHIPPING_CODE <>", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeGreaterThan(String value) {
            addCriterion("SHIPPING_CODE >", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SHIPPING_CODE >=", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeLessThan(String value) {
            addCriterion("SHIPPING_CODE <", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeLessThanOrEqualTo(String value) {
            addCriterion("SHIPPING_CODE <=", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeLike(String value) {
            addCriterion("SHIPPING_CODE like", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotLike(String value) {
            addCriterion("SHIPPING_CODE not like", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeIn(List<String> values) {
            addCriterion("SHIPPING_CODE in", values, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotIn(List<String> values) {
            addCriterion("SHIPPING_CODE not in", values, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeBetween(String value1, String value2) {
            addCriterion("SHIPPING_CODE between", value1, value2, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotBetween(String value1, String value2) {
            addCriterion("SHIPPING_CODE not between", value1, value2, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageIsNull() {
            addCriterion("BUYER_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageIsNotNull() {
            addCriterion("BUYER_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageEqualTo(String value) {
            addCriterion("BUYER_MESSAGE =", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageNotEqualTo(String value) {
            addCriterion("BUYER_MESSAGE <>", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageGreaterThan(String value) {
            addCriterion("BUYER_MESSAGE >", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_MESSAGE >=", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageLessThan(String value) {
            addCriterion("BUYER_MESSAGE <", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageLessThanOrEqualTo(String value) {
            addCriterion("BUYER_MESSAGE <=", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageLike(String value) {
            addCriterion("BUYER_MESSAGE like", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageNotLike(String value) {
            addCriterion("BUYER_MESSAGE not like", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageIn(List<String> values) {
            addCriterion("BUYER_MESSAGE in", values, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageNotIn(List<String> values) {
            addCriterion("BUYER_MESSAGE not in", values, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageBetween(String value1, String value2) {
            addCriterion("BUYER_MESSAGE between", value1, value2, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageNotBetween(String value1, String value2) {
            addCriterion("BUYER_MESSAGE not between", value1, value2, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerNickIsNull() {
            addCriterion("BUYER_NICK is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNickIsNotNull() {
            addCriterion("BUYER_NICK is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNickEqualTo(String value) {
            addCriterion("BUYER_NICK =", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNotEqualTo(String value) {
            addCriterion("BUYER_NICK <>", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickGreaterThan(String value) {
            addCriterion("BUYER_NICK >", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_NICK >=", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickLessThan(String value) {
            addCriterion("BUYER_NICK <", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickLessThanOrEqualTo(String value) {
            addCriterion("BUYER_NICK <=", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickLike(String value) {
            addCriterion("BUYER_NICK like", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNotLike(String value) {
            addCriterion("BUYER_NICK not like", value, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickIn(List<String> values) {
            addCriterion("BUYER_NICK in", values, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNotIn(List<String> values) {
            addCriterion("BUYER_NICK not in", values, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickBetween(String value1, String value2) {
            addCriterion("BUYER_NICK between", value1, value2, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerNickNotBetween(String value1, String value2) {
            addCriterion("BUYER_NICK not between", value1, value2, "buyerNick");
            return (Criteria) this;
        }

        public Criteria andBuyerRateIsNull() {
            addCriterion("BUYER_RATE is null");
            return (Criteria) this;
        }

        public Criteria andBuyerRateIsNotNull() {
            addCriterion("BUYER_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerRateEqualTo(String value) {
            addCriterion("BUYER_RATE =", value, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateNotEqualTo(String value) {
            addCriterion("BUYER_RATE <>", value, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateGreaterThan(String value) {
            addCriterion("BUYER_RATE >", value, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_RATE >=", value, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateLessThan(String value) {
            addCriterion("BUYER_RATE <", value, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateLessThanOrEqualTo(String value) {
            addCriterion("BUYER_RATE <=", value, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateLike(String value) {
            addCriterion("BUYER_RATE like", value, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateNotLike(String value) {
            addCriterion("BUYER_RATE not like", value, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateIn(List<String> values) {
            addCriterion("BUYER_RATE in", values, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateNotIn(List<String> values) {
            addCriterion("BUYER_RATE not in", values, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateBetween(String value1, String value2) {
            addCriterion("BUYER_RATE between", value1, value2, "buyerRate");
            return (Criteria) this;
        }

        public Criteria andBuyerRateNotBetween(String value1, String value2) {
            addCriterion("BUYER_RATE not between", value1, value2, "buyerRate");
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