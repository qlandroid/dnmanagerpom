package com.dnmanager.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
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

        public Criteria andRegTimeIsNull() {
            addCriterion("reg_time is null");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNotNull() {
            addCriterion("reg_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegTimeEqualTo(Integer value) {
            addCriterion("reg_time =", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotEqualTo(Integer value) {
            addCriterion("reg_time <>", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThan(Integer value) {
            addCriterion("reg_time >", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("reg_time >=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThan(Integer value) {
            addCriterion("reg_time <", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThanOrEqualTo(Integer value) {
            addCriterion("reg_time <=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeIn(List<Integer> values) {
            addCriterion("reg_time in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotIn(List<Integer> values) {
            addCriterion("reg_time not in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeBetween(Integer value1, Integer value2) {
            addCriterion("reg_time between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("reg_time not between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegIpIsNull() {
            addCriterion("reg_ip is null");
            return (Criteria) this;
        }

        public Criteria andRegIpIsNotNull() {
            addCriterion("reg_ip is not null");
            return (Criteria) this;
        }

        public Criteria andRegIpEqualTo(String value) {
            addCriterion("reg_ip =", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotEqualTo(String value) {
            addCriterion("reg_ip <>", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpGreaterThan(String value) {
            addCriterion("reg_ip >", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpGreaterThanOrEqualTo(String value) {
            addCriterion("reg_ip >=", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLessThan(String value) {
            addCriterion("reg_ip <", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLessThanOrEqualTo(String value) {
            addCriterion("reg_ip <=", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLike(String value) {
            addCriterion("reg_ip like", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotLike(String value) {
            addCriterion("reg_ip not like", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpIn(List<String> values) {
            addCriterion("reg_ip in", values, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotIn(List<String> values) {
            addCriterion("reg_ip not in", values, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpBetween(String value1, String value2) {
            addCriterion("reg_ip between", value1, value2, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotBetween(String value1, String value2) {
            addCriterion("reg_ip not between", value1, value2, "regIp");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNull() {
            addCriterion("login_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Integer value) {
            addCriterion("login_time =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Integer value) {
            addCriterion("login_time <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Integer value) {
            addCriterion("login_time >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_time >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Integer value) {
            addCriterion("login_time <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Integer value) {
            addCriterion("login_time <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Integer> values) {
            addCriterion("login_time in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Integer> values) {
            addCriterion("login_time not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Integer value1, Integer value2) {
            addCriterion("login_time between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("login_time not between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNull() {
            addCriterion("login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNotNull() {
            addCriterion("login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIpEqualTo(String value) {
            addCriterion("login_ip =", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotEqualTo(String value) {
            addCriterion("login_ip <>", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThan(String value) {
            addCriterion("login_ip >", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("login_ip >=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThan(String value) {
            addCriterion("login_ip <", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThanOrEqualTo(String value) {
            addCriterion("login_ip <=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLike(String value) {
            addCriterion("login_ip like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotLike(String value) {
            addCriterion("login_ip not like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpIn(List<String> values) {
            addCriterion("login_ip in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotIn(List<String> values) {
            addCriterion("login_ip not in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpBetween(String value1, String value2) {
            addCriterion("login_ip between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotBetween(String value1, String value2) {
            addCriterion("login_ip not between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andIsLockIsNull() {
            addCriterion("is_lock is null");
            return (Criteria) this;
        }

        public Criteria andIsLockIsNotNull() {
            addCriterion("is_lock is not null");
            return (Criteria) this;
        }

        public Criteria andIsLockEqualTo(Byte value) {
            addCriterion("is_lock =", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotEqualTo(Byte value) {
            addCriterion("is_lock <>", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThan(Byte value) {
            addCriterion("is_lock >", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_lock >=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThan(Byte value) {
            addCriterion("is_lock <", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThanOrEqualTo(Byte value) {
            addCriterion("is_lock <=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockIn(List<Byte> values) {
            addCriterion("is_lock in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotIn(List<Byte> values) {
            addCriterion("is_lock not in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockBetween(Byte value1, Byte value2) {
            addCriterion("is_lock between", value1, value2, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotBetween(Byte value1, Byte value2) {
            addCriterion("is_lock not between", value1, value2, "isLock");
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

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFreeTestIsNull() {
            addCriterion("free_test is null");
            return (Criteria) this;
        }

        public Criteria andFreeTestIsNotNull() {
            addCriterion("free_test is not null");
            return (Criteria) this;
        }

        public Criteria andFreeTestEqualTo(Integer value) {
            addCriterion("free_test =", value, "freeTest");
            return (Criteria) this;
        }

        public Criteria andFreeTestNotEqualTo(Integer value) {
            addCriterion("free_test <>", value, "freeTest");
            return (Criteria) this;
        }

        public Criteria andFreeTestGreaterThan(Integer value) {
            addCriterion("free_test >", value, "freeTest");
            return (Criteria) this;
        }

        public Criteria andFreeTestGreaterThanOrEqualTo(Integer value) {
            addCriterion("free_test >=", value, "freeTest");
            return (Criteria) this;
        }

        public Criteria andFreeTestLessThan(Integer value) {
            addCriterion("free_test <", value, "freeTest");
            return (Criteria) this;
        }

        public Criteria andFreeTestLessThanOrEqualTo(Integer value) {
            addCriterion("free_test <=", value, "freeTest");
            return (Criteria) this;
        }

        public Criteria andFreeTestIn(List<Integer> values) {
            addCriterion("free_test in", values, "freeTest");
            return (Criteria) this;
        }

        public Criteria andFreeTestNotIn(List<Integer> values) {
            addCriterion("free_test not in", values, "freeTest");
            return (Criteria) this;
        }

        public Criteria andFreeTestBetween(Integer value1, Integer value2) {
            addCriterion("free_test between", value1, value2, "freeTest");
            return (Criteria) this;
        }

        public Criteria andFreeTestNotBetween(Integer value1, Integer value2) {
            addCriterion("free_test not between", value1, value2, "freeTest");
            return (Criteria) this;
        }

        public Criteria andVAccountIsNull() {
            addCriterion("v_account is null");
            return (Criteria) this;
        }

        public Criteria andVAccountIsNotNull() {
            addCriterion("v_account is not null");
            return (Criteria) this;
        }

        public Criteria andVAccountEqualTo(String value) {
            addCriterion("v_account =", value, "vAccount");
            return (Criteria) this;
        }

        public Criteria andVAccountNotEqualTo(String value) {
            addCriterion("v_account <>", value, "vAccount");
            return (Criteria) this;
        }

        public Criteria andVAccountGreaterThan(String value) {
            addCriterion("v_account >", value, "vAccount");
            return (Criteria) this;
        }

        public Criteria andVAccountGreaterThanOrEqualTo(String value) {
            addCriterion("v_account >=", value, "vAccount");
            return (Criteria) this;
        }

        public Criteria andVAccountLessThan(String value) {
            addCriterion("v_account <", value, "vAccount");
            return (Criteria) this;
        }

        public Criteria andVAccountLessThanOrEqualTo(String value) {
            addCriterion("v_account <=", value, "vAccount");
            return (Criteria) this;
        }

        public Criteria andVAccountLike(String value) {
            addCriterion("v_account like", value, "vAccount");
            return (Criteria) this;
        }

        public Criteria andVAccountNotLike(String value) {
            addCriterion("v_account not like", value, "vAccount");
            return (Criteria) this;
        }

        public Criteria andVAccountIn(List<String> values) {
            addCriterion("v_account in", values, "vAccount");
            return (Criteria) this;
        }

        public Criteria andVAccountNotIn(List<String> values) {
            addCriterion("v_account not in", values, "vAccount");
            return (Criteria) this;
        }

        public Criteria andVAccountBetween(String value1, String value2) {
            addCriterion("v_account between", value1, value2, "vAccount");
            return (Criteria) this;
        }

        public Criteria andVAccountNotBetween(String value1, String value2) {
            addCriterion("v_account not between", value1, value2, "vAccount");
            return (Criteria) this;
        }

        public Criteria andVPasswordIsNull() {
            addCriterion("v_password is null");
            return (Criteria) this;
        }

        public Criteria andVPasswordIsNotNull() {
            addCriterion("v_password is not null");
            return (Criteria) this;
        }

        public Criteria andVPasswordEqualTo(String value) {
            addCriterion("v_password =", value, "vPassword");
            return (Criteria) this;
        }

        public Criteria andVPasswordNotEqualTo(String value) {
            addCriterion("v_password <>", value, "vPassword");
            return (Criteria) this;
        }

        public Criteria andVPasswordGreaterThan(String value) {
            addCriterion("v_password >", value, "vPassword");
            return (Criteria) this;
        }

        public Criteria andVPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("v_password >=", value, "vPassword");
            return (Criteria) this;
        }

        public Criteria andVPasswordLessThan(String value) {
            addCriterion("v_password <", value, "vPassword");
            return (Criteria) this;
        }

        public Criteria andVPasswordLessThanOrEqualTo(String value) {
            addCriterion("v_password <=", value, "vPassword");
            return (Criteria) this;
        }

        public Criteria andVPasswordLike(String value) {
            addCriterion("v_password like", value, "vPassword");
            return (Criteria) this;
        }

        public Criteria andVPasswordNotLike(String value) {
            addCriterion("v_password not like", value, "vPassword");
            return (Criteria) this;
        }

        public Criteria andVPasswordIn(List<String> values) {
            addCriterion("v_password in", values, "vPassword");
            return (Criteria) this;
        }

        public Criteria andVPasswordNotIn(List<String> values) {
            addCriterion("v_password not in", values, "vPassword");
            return (Criteria) this;
        }

        public Criteria andVPasswordBetween(String value1, String value2) {
            addCriterion("v_password between", value1, value2, "vPassword");
            return (Criteria) this;
        }

        public Criteria andVPasswordNotBetween(String value1, String value2) {
            addCriterion("v_password not between", value1, value2, "vPassword");
            return (Criteria) this;
        }

        public Criteria andVPhoneIsNull() {
            addCriterion("v_phone is null");
            return (Criteria) this;
        }

        public Criteria andVPhoneIsNotNull() {
            addCriterion("v_phone is not null");
            return (Criteria) this;
        }

        public Criteria andVPhoneEqualTo(String value) {
            addCriterion("v_phone =", value, "vPhone");
            return (Criteria) this;
        }

        public Criteria andVPhoneNotEqualTo(String value) {
            addCriterion("v_phone <>", value, "vPhone");
            return (Criteria) this;
        }

        public Criteria andVPhoneGreaterThan(String value) {
            addCriterion("v_phone >", value, "vPhone");
            return (Criteria) this;
        }

        public Criteria andVPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("v_phone >=", value, "vPhone");
            return (Criteria) this;
        }

        public Criteria andVPhoneLessThan(String value) {
            addCriterion("v_phone <", value, "vPhone");
            return (Criteria) this;
        }

        public Criteria andVPhoneLessThanOrEqualTo(String value) {
            addCriterion("v_phone <=", value, "vPhone");
            return (Criteria) this;
        }

        public Criteria andVPhoneLike(String value) {
            addCriterion("v_phone like", value, "vPhone");
            return (Criteria) this;
        }

        public Criteria andVPhoneNotLike(String value) {
            addCriterion("v_phone not like", value, "vPhone");
            return (Criteria) this;
        }

        public Criteria andVPhoneIn(List<String> values) {
            addCriterion("v_phone in", values, "vPhone");
            return (Criteria) this;
        }

        public Criteria andVPhoneNotIn(List<String> values) {
            addCriterion("v_phone not in", values, "vPhone");
            return (Criteria) this;
        }

        public Criteria andVPhoneBetween(String value1, String value2) {
            addCriterion("v_phone between", value1, value2, "vPhone");
            return (Criteria) this;
        }

        public Criteria andVPhoneNotBetween(String value1, String value2) {
            addCriterion("v_phone not between", value1, value2, "vPhone");
            return (Criteria) this;
        }

        public Criteria andYtNumIsNull() {
            addCriterion("yt_num is null");
            return (Criteria) this;
        }

        public Criteria andYtNumIsNotNull() {
            addCriterion("yt_num is not null");
            return (Criteria) this;
        }

        public Criteria andYtNumEqualTo(String value) {
            addCriterion("yt_num =", value, "ytNum");
            return (Criteria) this;
        }

        public Criteria andYtNumNotEqualTo(String value) {
            addCriterion("yt_num <>", value, "ytNum");
            return (Criteria) this;
        }

        public Criteria andYtNumGreaterThan(String value) {
            addCriterion("yt_num >", value, "ytNum");
            return (Criteria) this;
        }

        public Criteria andYtNumGreaterThanOrEqualTo(String value) {
            addCriterion("yt_num >=", value, "ytNum");
            return (Criteria) this;
        }

        public Criteria andYtNumLessThan(String value) {
            addCriterion("yt_num <", value, "ytNum");
            return (Criteria) this;
        }

        public Criteria andYtNumLessThanOrEqualTo(String value) {
            addCriterion("yt_num <=", value, "ytNum");
            return (Criteria) this;
        }

        public Criteria andYtNumLike(String value) {
            addCriterion("yt_num like", value, "ytNum");
            return (Criteria) this;
        }

        public Criteria andYtNumNotLike(String value) {
            addCriterion("yt_num not like", value, "ytNum");
            return (Criteria) this;
        }

        public Criteria andYtNumIn(List<String> values) {
            addCriterion("yt_num in", values, "ytNum");
            return (Criteria) this;
        }

        public Criteria andYtNumNotIn(List<String> values) {
            addCriterion("yt_num not in", values, "ytNum");
            return (Criteria) this;
        }

        public Criteria andYtNumBetween(String value1, String value2) {
            addCriterion("yt_num between", value1, value2, "ytNum");
            return (Criteria) this;
        }

        public Criteria andYtNumNotBetween(String value1, String value2) {
            addCriterion("yt_num not between", value1, value2, "ytNum");
            return (Criteria) this;
        }

        public Criteria andRecMoneyIsNull() {
            addCriterion("rec_money is null");
            return (Criteria) this;
        }

        public Criteria andRecMoneyIsNotNull() {
            addCriterion("rec_money is not null");
            return (Criteria) this;
        }

        public Criteria andRecMoneyEqualTo(Integer value) {
            addCriterion("rec_money =", value, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyNotEqualTo(Integer value) {
            addCriterion("rec_money <>", value, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyGreaterThan(Integer value) {
            addCriterion("rec_money >", value, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("rec_money >=", value, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyLessThan(Integer value) {
            addCriterion("rec_money <", value, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("rec_money <=", value, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyIn(List<Integer> values) {
            addCriterion("rec_money in", values, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyNotIn(List<Integer> values) {
            addCriterion("rec_money not in", values, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyBetween(Integer value1, Integer value2) {
            addCriterion("rec_money between", value1, value2, "recMoney");
            return (Criteria) this;
        }

        public Criteria andRecMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("rec_money not between", value1, value2, "recMoney");
            return (Criteria) this;
        }

        public Criteria andLedTypeIsNull() {
            addCriterion("led_type is null");
            return (Criteria) this;
        }

        public Criteria andLedTypeIsNotNull() {
            addCriterion("led_type is not null");
            return (Criteria) this;
        }

        public Criteria andLedTypeEqualTo(Integer value) {
            addCriterion("led_type =", value, "ledType");
            return (Criteria) this;
        }

        public Criteria andLedTypeNotEqualTo(Integer value) {
            addCriterion("led_type <>", value, "ledType");
            return (Criteria) this;
        }

        public Criteria andLedTypeGreaterThan(Integer value) {
            addCriterion("led_type >", value, "ledType");
            return (Criteria) this;
        }

        public Criteria andLedTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("led_type >=", value, "ledType");
            return (Criteria) this;
        }

        public Criteria andLedTypeLessThan(Integer value) {
            addCriterion("led_type <", value, "ledType");
            return (Criteria) this;
        }

        public Criteria andLedTypeLessThanOrEqualTo(Integer value) {
            addCriterion("led_type <=", value, "ledType");
            return (Criteria) this;
        }

        public Criteria andLedTypeIn(List<Integer> values) {
            addCriterion("led_type in", values, "ledType");
            return (Criteria) this;
        }

        public Criteria andLedTypeNotIn(List<Integer> values) {
            addCriterion("led_type not in", values, "ledType");
            return (Criteria) this;
        }

        public Criteria andLedTypeBetween(Integer value1, Integer value2) {
            addCriterion("led_type between", value1, value2, "ledType");
            return (Criteria) this;
        }

        public Criteria andLedTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("led_type not between", value1, value2, "ledType");
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