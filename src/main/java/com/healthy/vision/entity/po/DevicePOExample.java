package com.healthy.vision.entity.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DevicePOExample implements Serializable {
    /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  protected String orderByClause;
  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  protected boolean distinct;
  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  protected List<Criteria> oredCriteria;
  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  private static final long serialVersionUID = 1L;

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public DevicePOExample() {
    oredCriteria = new ArrayList<Criteria>();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setOrderByClause(String orderByClause) {
    this.orderByClause = orderByClause;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getOrderByClause() {
    return orderByClause;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setDistinct(boolean distinct) {
    this.distinct = distinct;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public boolean isDistinct() {
    return distinct;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public List<Criteria> getOredCriteria() {
    return oredCriteria;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void or(Criteria criteria) {
    oredCriteria.add(criteria);
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Criteria or() {
    Criteria criteria = createCriteriaInternal();
    oredCriteria.add(criteria);
    return criteria;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Criteria createCriteria() {
    Criteria criteria = createCriteriaInternal();
    if (oredCriteria.size() == 0) {
      oredCriteria.add(criteria);
    }
    return criteria;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  protected Criteria createCriteriaInternal() {
    Criteria criteria = new Criteria();
    return criteria;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void clear() {
    oredCriteria.clear();
    orderByClause = null;
    distinct = false;
  }

  /**
   * 只读. t_device
   * @mbg.generated  2018-12-26 10:46:20
   */
  protected abstract static class GeneratedCriteria implements Serializable {
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

    public Criteria andDeviceIdIsNull() {
      addCriterion("device_id is null");
      return (Criteria) this;
    }

    public Criteria andDeviceIdIsNotNull() {
      addCriterion("device_id is not null");
      return (Criteria) this;
    }

    public Criteria andDeviceIdEqualTo(Integer value) {
      addCriterion("device_id =", value, "deviceId");
      return (Criteria) this;
    }

    public Criteria andDeviceIdNotEqualTo(Integer value) {
      addCriterion("device_id <>", value, "deviceId");
      return (Criteria) this;
    }

    public Criteria andDeviceIdGreaterThan(Integer value) {
      addCriterion("device_id >", value, "deviceId");
      return (Criteria) this;
    }

    public Criteria andDeviceIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("device_id >=", value, "deviceId");
      return (Criteria) this;
    }

    public Criteria andDeviceIdLessThan(Integer value) {
      addCriterion("device_id <", value, "deviceId");
      return (Criteria) this;
    }

    public Criteria andDeviceIdLessThanOrEqualTo(Integer value) {
      addCriterion("device_id <=", value, "deviceId");
      return (Criteria) this;
    }

    public Criteria andDeviceIdIn(List<Integer> values) {
      addCriterion("device_id in", values, "deviceId");
      return (Criteria) this;
    }

    public Criteria andDeviceIdNotIn(List<Integer> values) {
      addCriterion("device_id not in", values, "deviceId");
      return (Criteria) this;
    }

    public Criteria andDeviceIdBetween(Integer value1, Integer value2) {
      addCriterion("device_id between", value1, value2, "deviceId");
      return (Criteria) this;
    }

    public Criteria andDeviceIdNotBetween(Integer value1, Integer value2) {
      addCriterion("device_id not between", value1, value2, "deviceId");
      return (Criteria) this;
    }

    public Criteria andDeviceCodeIsNull() {
      addCriterion("device_code is null");
      return (Criteria) this;
    }

    public Criteria andDeviceCodeIsNotNull() {
      addCriterion("device_code is not null");
      return (Criteria) this;
    }

    public Criteria andDeviceCodeEqualTo(String value) {
      addCriterion("device_code =", value, "deviceCode");
      return (Criteria) this;
    }

    public Criteria andDeviceCodeNotEqualTo(String value) {
      addCriterion("device_code <>", value, "deviceCode");
      return (Criteria) this;
    }

    public Criteria andDeviceCodeGreaterThan(String value) {
      addCriterion("device_code >", value, "deviceCode");
      return (Criteria) this;
    }

    public Criteria andDeviceCodeGreaterThanOrEqualTo(String value) {
      addCriterion("device_code >=", value, "deviceCode");
      return (Criteria) this;
    }

    public Criteria andDeviceCodeLessThan(String value) {
      addCriterion("device_code <", value, "deviceCode");
      return (Criteria) this;
    }

    public Criteria andDeviceCodeLessThanOrEqualTo(String value) {
      addCriterion("device_code <=", value, "deviceCode");
      return (Criteria) this;
    }

    public Criteria andDeviceCodeLike(String value) {
      addCriterion("device_code like", value, "deviceCode");
      return (Criteria) this;
    }

    public Criteria andDeviceCodeNotLike(String value) {
      addCriterion("device_code not like", value, "deviceCode");
      return (Criteria) this;
    }

    public Criteria andDeviceCodeIn(List<String> values) {
      addCriterion("device_code in", values, "deviceCode");
      return (Criteria) this;
    }

    public Criteria andDeviceCodeNotIn(List<String> values) {
      addCriterion("device_code not in", values, "deviceCode");
      return (Criteria) this;
    }

    public Criteria andDeviceCodeBetween(String value1, String value2) {
      addCriterion("device_code between", value1, value2, "deviceCode");
      return (Criteria) this;
    }

    public Criteria andDeviceCodeNotBetween(String value1, String value2) {
      addCriterion("device_code not between", value1, value2, "deviceCode");
      return (Criteria) this;
    }

    public Criteria andDeviceNameIsNull() {
      addCriterion("device_name is null");
      return (Criteria) this;
    }

    public Criteria andDeviceNameIsNotNull() {
      addCriterion("device_name is not null");
      return (Criteria) this;
    }

    public Criteria andDeviceNameEqualTo(String value) {
      addCriterion("device_name =", value, "deviceName");
      return (Criteria) this;
    }

    public Criteria andDeviceNameNotEqualTo(String value) {
      addCriterion("device_name <>", value, "deviceName");
      return (Criteria) this;
    }

    public Criteria andDeviceNameGreaterThan(String value) {
      addCriterion("device_name >", value, "deviceName");
      return (Criteria) this;
    }

    public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
      addCriterion("device_name >=", value, "deviceName");
      return (Criteria) this;
    }

    public Criteria andDeviceNameLessThan(String value) {
      addCriterion("device_name <", value, "deviceName");
      return (Criteria) this;
    }

    public Criteria andDeviceNameLessThanOrEqualTo(String value) {
      addCriterion("device_name <=", value, "deviceName");
      return (Criteria) this;
    }

    public Criteria andDeviceNameLike(String value) {
      addCriterion("device_name like", value, "deviceName");
      return (Criteria) this;
    }

    public Criteria andDeviceNameNotLike(String value) {
      addCriterion("device_name not like", value, "deviceName");
      return (Criteria) this;
    }

    public Criteria andDeviceNameIn(List<String> values) {
      addCriterion("device_name in", values, "deviceName");
      return (Criteria) this;
    }

    public Criteria andDeviceNameNotIn(List<String> values) {
      addCriterion("device_name not in", values, "deviceName");
      return (Criteria) this;
    }

    public Criteria andDeviceNameBetween(String value1, String value2) {
      addCriterion("device_name between", value1, value2, "deviceName");
      return (Criteria) this;
    }

    public Criteria andDeviceNameNotBetween(String value1, String value2) {
      addCriterion("device_name not between", value1, value2, "deviceName");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeIsNull() {
      addCriterion("device_type is null");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeIsNotNull() {
      addCriterion("device_type is not null");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeEqualTo(String value) {
      addCriterion("device_type =", value, "deviceType");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeNotEqualTo(String value) {
      addCriterion("device_type <>", value, "deviceType");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeGreaterThan(String value) {
      addCriterion("device_type >", value, "deviceType");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeGreaterThanOrEqualTo(String value) {
      addCriterion("device_type >=", value, "deviceType");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeLessThan(String value) {
      addCriterion("device_type <", value, "deviceType");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeLessThanOrEqualTo(String value) {
      addCriterion("device_type <=", value, "deviceType");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeLike(String value) {
      addCriterion("device_type like", value, "deviceType");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeNotLike(String value) {
      addCriterion("device_type not like", value, "deviceType");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeIn(List<String> values) {
      addCriterion("device_type in", values, "deviceType");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeNotIn(List<String> values) {
      addCriterion("device_type not in", values, "deviceType");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeBetween(String value1, String value2) {
      addCriterion("device_type between", value1, value2, "deviceType");
      return (Criteria) this;
    }

    public Criteria andDeviceTypeNotBetween(String value1, String value2) {
      addCriterion("device_type not between", value1, value2, "deviceType");
      return (Criteria) this;
    }

    public Criteria andAddressIsNull() {
      addCriterion("address is null");
      return (Criteria) this;
    }

    public Criteria andAddressIsNotNull() {
      addCriterion("address is not null");
      return (Criteria) this;
    }

    public Criteria andAddressEqualTo(String value) {
      addCriterion("address =", value, "address");
      return (Criteria) this;
    }

    public Criteria andAddressNotEqualTo(String value) {
      addCriterion("address <>", value, "address");
      return (Criteria) this;
    }

    public Criteria andAddressGreaterThan(String value) {
      addCriterion("address >", value, "address");
      return (Criteria) this;
    }

    public Criteria andAddressGreaterThanOrEqualTo(String value) {
      addCriterion("address >=", value, "address");
      return (Criteria) this;
    }

    public Criteria andAddressLessThan(String value) {
      addCriterion("address <", value, "address");
      return (Criteria) this;
    }

    public Criteria andAddressLessThanOrEqualTo(String value) {
      addCriterion("address <=", value, "address");
      return (Criteria) this;
    }

    public Criteria andAddressLike(String value) {
      addCriterion("address like", value, "address");
      return (Criteria) this;
    }

    public Criteria andAddressNotLike(String value) {
      addCriterion("address not like", value, "address");
      return (Criteria) this;
    }

    public Criteria andAddressIn(List<String> values) {
      addCriterion("address in", values, "address");
      return (Criteria) this;
    }

    public Criteria andAddressNotIn(List<String> values) {
      addCriterion("address not in", values, "address");
      return (Criteria) this;
    }

    public Criteria andAddressBetween(String value1, String value2) {
      addCriterion("address between", value1, value2, "address");
      return (Criteria) this;
    }

    public Criteria andAddressNotBetween(String value1, String value2) {
      addCriterion("address not between", value1, value2, "address");
      return (Criteria) this;
    }

    public Criteria andRemarkIsNull() {
      addCriterion("remark is null");
      return (Criteria) this;
    }

    public Criteria andRemarkIsNotNull() {
      addCriterion("remark is not null");
      return (Criteria) this;
    }

    public Criteria andRemarkEqualTo(String value) {
      addCriterion("remark =", value, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkNotEqualTo(String value) {
      addCriterion("remark <>", value, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkGreaterThan(String value) {
      addCriterion("remark >", value, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkGreaterThanOrEqualTo(String value) {
      addCriterion("remark >=", value, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkLessThan(String value) {
      addCriterion("remark <", value, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkLessThanOrEqualTo(String value) {
      addCriterion("remark <=", value, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkLike(String value) {
      addCriterion("remark like", value, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkNotLike(String value) {
      addCriterion("remark not like", value, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkIn(List<String> values) {
      addCriterion("remark in", values, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkNotIn(List<String> values) {
      addCriterion("remark not in", values, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkBetween(String value1, String value2) {
      addCriterion("remark between", value1, value2, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkNotBetween(String value1, String value2) {
      addCriterion("remark not between", value1, value2, "remark");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdIsNull() {
      addCriterion("create_user_id is null");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdIsNotNull() {
      addCriterion("create_user_id is not null");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdEqualTo(Integer value) {
      addCriterion("create_user_id =", value, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdNotEqualTo(Integer value) {
      addCriterion("create_user_id <>", value, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdGreaterThan(Integer value) {
      addCriterion("create_user_id >", value, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("create_user_id >=", value, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdLessThan(Integer value) {
      addCriterion("create_user_id <", value, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdLessThanOrEqualTo(Integer value) {
      addCriterion("create_user_id <=", value, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdIn(List<Integer> values) {
      addCriterion("create_user_id in", values, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdNotIn(List<Integer> values) {
      addCriterion("create_user_id not in", values, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdBetween(Integer value1, Integer value2) {
      addCriterion("create_user_id between", value1, value2, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdNotBetween(Integer value1, Integer value2) {
      addCriterion("create_user_id not between", value1, value2, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserNameIsNull() {
      addCriterion("create_user_name is null");
      return (Criteria) this;
    }

    public Criteria andCreateUserNameIsNotNull() {
      addCriterion("create_user_name is not null");
      return (Criteria) this;
    }

    public Criteria andCreateUserNameEqualTo(String value) {
      addCriterion("create_user_name =", value, "createUserName");
      return (Criteria) this;
    }

    public Criteria andCreateUserNameNotEqualTo(String value) {
      addCriterion("create_user_name <>", value, "createUserName");
      return (Criteria) this;
    }

    public Criteria andCreateUserNameGreaterThan(String value) {
      addCriterion("create_user_name >", value, "createUserName");
      return (Criteria) this;
    }

    public Criteria andCreateUserNameGreaterThanOrEqualTo(String value) {
      addCriterion("create_user_name >=", value, "createUserName");
      return (Criteria) this;
    }

    public Criteria andCreateUserNameLessThan(String value) {
      addCriterion("create_user_name <", value, "createUserName");
      return (Criteria) this;
    }

    public Criteria andCreateUserNameLessThanOrEqualTo(String value) {
      addCriterion("create_user_name <=", value, "createUserName");
      return (Criteria) this;
    }

    public Criteria andCreateUserNameLike(String value) {
      addCriterion("create_user_name like", value, "createUserName");
      return (Criteria) this;
    }

    public Criteria andCreateUserNameNotLike(String value) {
      addCriterion("create_user_name not like", value, "createUserName");
      return (Criteria) this;
    }

    public Criteria andCreateUserNameIn(List<String> values) {
      addCriterion("create_user_name in", values, "createUserName");
      return (Criteria) this;
    }

    public Criteria andCreateUserNameNotIn(List<String> values) {
      addCriterion("create_user_name not in", values, "createUserName");
      return (Criteria) this;
    }

    public Criteria andCreateUserNameBetween(String value1, String value2) {
      addCriterion("create_user_name between", value1, value2, "createUserName");
      return (Criteria) this;
    }

    public Criteria andCreateUserNameNotBetween(String value1, String value2) {
      addCriterion("create_user_name not between", value1, value2, "createUserName");
      return (Criteria) this;
    }

    public Criteria andCreateCreateIsNull() {
      addCriterion("create_create is null");
      return (Criteria) this;
    }

    public Criteria andCreateCreateIsNotNull() {
      addCriterion("create_create is not null");
      return (Criteria) this;
    }

    public Criteria andCreateCreateEqualTo(Date value) {
      addCriterion("create_create =", value, "createCreate");
      return (Criteria) this;
    }

    public Criteria andCreateCreateNotEqualTo(Date value) {
      addCriterion("create_create <>", value, "createCreate");
      return (Criteria) this;
    }

    public Criteria andCreateCreateGreaterThan(Date value) {
      addCriterion("create_create >", value, "createCreate");
      return (Criteria) this;
    }

    public Criteria andCreateCreateGreaterThanOrEqualTo(Date value) {
      addCriterion("create_create >=", value, "createCreate");
      return (Criteria) this;
    }

    public Criteria andCreateCreateLessThan(Date value) {
      addCriterion("create_create <", value, "createCreate");
      return (Criteria) this;
    }

    public Criteria andCreateCreateLessThanOrEqualTo(Date value) {
      addCriterion("create_create <=", value, "createCreate");
      return (Criteria) this;
    }

    public Criteria andCreateCreateIn(List<Date> values) {
      addCriterion("create_create in", values, "createCreate");
      return (Criteria) this;
    }

    public Criteria andCreateCreateNotIn(List<Date> values) {
      addCriterion("create_create not in", values, "createCreate");
      return (Criteria) this;
    }

    public Criteria andCreateCreateBetween(Date value1, Date value2) {
      addCriterion("create_create between", value1, value2, "createCreate");
      return (Criteria) this;
    }

    public Criteria andCreateCreateNotBetween(Date value1, Date value2) {
      addCriterion("create_create not between", value1, value2, "createCreate");
      return (Criteria) this;
    }

    public Criteria andModifiedUserIdIsNull() {
      addCriterion("modified_user_id is null");
      return (Criteria) this;
    }

    public Criteria andModifiedUserIdIsNotNull() {
      addCriterion("modified_user_id is not null");
      return (Criteria) this;
    }

    public Criteria andModifiedUserIdEqualTo(Integer value) {
      addCriterion("modified_user_id =", value, "modifiedUserId");
      return (Criteria) this;
    }

    public Criteria andModifiedUserIdNotEqualTo(Integer value) {
      addCriterion("modified_user_id <>", value, "modifiedUserId");
      return (Criteria) this;
    }

    public Criteria andModifiedUserIdGreaterThan(Integer value) {
      addCriterion("modified_user_id >", value, "modifiedUserId");
      return (Criteria) this;
    }

    public Criteria andModifiedUserIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("modified_user_id >=", value, "modifiedUserId");
      return (Criteria) this;
    }

    public Criteria andModifiedUserIdLessThan(Integer value) {
      addCriterion("modified_user_id <", value, "modifiedUserId");
      return (Criteria) this;
    }

    public Criteria andModifiedUserIdLessThanOrEqualTo(Integer value) {
      addCriterion("modified_user_id <=", value, "modifiedUserId");
      return (Criteria) this;
    }

    public Criteria andModifiedUserIdIn(List<Integer> values) {
      addCriterion("modified_user_id in", values, "modifiedUserId");
      return (Criteria) this;
    }

    public Criteria andModifiedUserIdNotIn(List<Integer> values) {
      addCriterion("modified_user_id not in", values, "modifiedUserId");
      return (Criteria) this;
    }

    public Criteria andModifiedUserIdBetween(Integer value1, Integer value2) {
      addCriterion("modified_user_id between", value1, value2, "modifiedUserId");
      return (Criteria) this;
    }

    public Criteria andModifiedUserIdNotBetween(Integer value1, Integer value2) {
      addCriterion("modified_user_id not between", value1, value2, "modifiedUserId");
      return (Criteria) this;
    }

    public Criteria andModifiedUserNameIsNull() {
      addCriterion("modified_user_name is null");
      return (Criteria) this;
    }

    public Criteria andModifiedUserNameIsNotNull() {
      addCriterion("modified_user_name is not null");
      return (Criteria) this;
    }

    public Criteria andModifiedUserNameEqualTo(String value) {
      addCriterion("modified_user_name =", value, "modifiedUserName");
      return (Criteria) this;
    }

    public Criteria andModifiedUserNameNotEqualTo(String value) {
      addCriterion("modified_user_name <>", value, "modifiedUserName");
      return (Criteria) this;
    }

    public Criteria andModifiedUserNameGreaterThan(String value) {
      addCriterion("modified_user_name >", value, "modifiedUserName");
      return (Criteria) this;
    }

    public Criteria andModifiedUserNameGreaterThanOrEqualTo(String value) {
      addCriterion("modified_user_name >=", value, "modifiedUserName");
      return (Criteria) this;
    }

    public Criteria andModifiedUserNameLessThan(String value) {
      addCriterion("modified_user_name <", value, "modifiedUserName");
      return (Criteria) this;
    }

    public Criteria andModifiedUserNameLessThanOrEqualTo(String value) {
      addCriterion("modified_user_name <=", value, "modifiedUserName");
      return (Criteria) this;
    }

    public Criteria andModifiedUserNameLike(String value) {
      addCriterion("modified_user_name like", value, "modifiedUserName");
      return (Criteria) this;
    }

    public Criteria andModifiedUserNameNotLike(String value) {
      addCriterion("modified_user_name not like", value, "modifiedUserName");
      return (Criteria) this;
    }

    public Criteria andModifiedUserNameIn(List<String> values) {
      addCriterion("modified_user_name in", values, "modifiedUserName");
      return (Criteria) this;
    }

    public Criteria andModifiedUserNameNotIn(List<String> values) {
      addCriterion("modified_user_name not in", values, "modifiedUserName");
      return (Criteria) this;
    }

    public Criteria andModifiedUserNameBetween(String value1, String value2) {
      addCriterion("modified_user_name between", value1, value2, "modifiedUserName");
      return (Criteria) this;
    }

    public Criteria andModifiedUserNameNotBetween(String value1, String value2) {
      addCriterion("modified_user_name not between", value1, value2, "modifiedUserName");
      return (Criteria) this;
    }

    public Criteria andModifiedDateIsNull() {
      addCriterion("modified_date is null");
      return (Criteria) this;
    }

    public Criteria andModifiedDateIsNotNull() {
      addCriterion("modified_date is not null");
      return (Criteria) this;
    }

    public Criteria andModifiedDateEqualTo(Date value) {
      addCriterion("modified_date =", value, "modifiedDate");
      return (Criteria) this;
    }

    public Criteria andModifiedDateNotEqualTo(Date value) {
      addCriterion("modified_date <>", value, "modifiedDate");
      return (Criteria) this;
    }

    public Criteria andModifiedDateGreaterThan(Date value) {
      addCriterion("modified_date >", value, "modifiedDate");
      return (Criteria) this;
    }

    public Criteria andModifiedDateGreaterThanOrEqualTo(Date value) {
      addCriterion("modified_date >=", value, "modifiedDate");
      return (Criteria) this;
    }

    public Criteria andModifiedDateLessThan(Date value) {
      addCriterion("modified_date <", value, "modifiedDate");
      return (Criteria) this;
    }

    public Criteria andModifiedDateLessThanOrEqualTo(Date value) {
      addCriterion("modified_date <=", value, "modifiedDate");
      return (Criteria) this;
    }

    public Criteria andModifiedDateIn(List<Date> values) {
      addCriterion("modified_date in", values, "modifiedDate");
      return (Criteria) this;
    }

    public Criteria andModifiedDateNotIn(List<Date> values) {
      addCriterion("modified_date not in", values, "modifiedDate");
      return (Criteria) this;
    }

    public Criteria andModifiedDateBetween(Date value1, Date value2) {
      addCriterion("modified_date between", value1, value2, "modifiedDate");
      return (Criteria) this;
    }

    public Criteria andModifiedDateNotBetween(Date value1, Date value2) {
      addCriterion("modified_date not between", value1, value2, "modifiedDate");
      return (Criteria) this;
    }

    public Criteria andValidIsNull() {
      addCriterion("valid is null");
      return (Criteria) this;
    }

    public Criteria andValidIsNotNull() {
      addCriterion("valid is not null");
      return (Criteria) this;
    }

    public Criteria andValidEqualTo(Boolean value) {
      addCriterion("valid =", value, "valid");
      return (Criteria) this;
    }

    public Criteria andValidNotEqualTo(Boolean value) {
      addCriterion("valid <>", value, "valid");
      return (Criteria) this;
    }

    public Criteria andValidGreaterThan(Boolean value) {
      addCriterion("valid >", value, "valid");
      return (Criteria) this;
    }

    public Criteria andValidGreaterThanOrEqualTo(Boolean value) {
      addCriterion("valid >=", value, "valid");
      return (Criteria) this;
    }

    public Criteria andValidLessThan(Boolean value) {
      addCriterion("valid <", value, "valid");
      return (Criteria) this;
    }

    public Criteria andValidLessThanOrEqualTo(Boolean value) {
      addCriterion("valid <=", value, "valid");
      return (Criteria) this;
    }

    public Criteria andValidIn(List<Boolean> values) {
      addCriterion("valid in", values, "valid");
      return (Criteria) this;
    }

    public Criteria andValidNotIn(List<Boolean> values) {
      addCriterion("valid not in", values, "valid");
      return (Criteria) this;
    }

    public Criteria andValidBetween(Boolean value1, Boolean value2) {
      addCriterion("valid between", value1, value2, "valid");
      return (Criteria) this;
    }

    public Criteria andValidNotBetween(Boolean value1, Boolean value2) {
      addCriterion("valid not between", value1, value2, "valid");
      return (Criteria) this;
    }
  }

  /**
   * 只读. t_device
   * @mbg.generated  2018-12-26 10:46:20
   */
  public static class Criterion implements Serializable {
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

    /**9
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_device
     *
     * @mbg.generated do_not_delete_during_merge 2018-12-26 10:42:06
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }
}