package com.healthy.vision.entity.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckRecordPOExample implements Serializable {
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
  public CheckRecordPOExample() {
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
   * 只读. t_check_record
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

    public Criteria andCheckRecordIdIsNull() {
      addCriterion("check_record_id is null");
      return (Criteria) this;
    }

    public Criteria andCheckRecordIdIsNotNull() {
      addCriterion("check_record_id is not null");
      return (Criteria) this;
    }

    public Criteria andCheckRecordIdEqualTo(Integer value) {
      addCriterion("check_record_id =", value, "checkRecordId");
      return (Criteria) this;
    }

    public Criteria andCheckRecordIdNotEqualTo(Integer value) {
      addCriterion("check_record_id <>", value, "checkRecordId");
      return (Criteria) this;
    }

    public Criteria andCheckRecordIdGreaterThan(Integer value) {
      addCriterion("check_record_id >", value, "checkRecordId");
      return (Criteria) this;
    }

    public Criteria andCheckRecordIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("check_record_id >=", value, "checkRecordId");
      return (Criteria) this;
    }

    public Criteria andCheckRecordIdLessThan(Integer value) {
      addCriterion("check_record_id <", value, "checkRecordId");
      return (Criteria) this;
    }

    public Criteria andCheckRecordIdLessThanOrEqualTo(Integer value) {
      addCriterion("check_record_id <=", value, "checkRecordId");
      return (Criteria) this;
    }

    public Criteria andCheckRecordIdIn(List<Integer> values) {
      addCriterion("check_record_id in", values, "checkRecordId");
      return (Criteria) this;
    }

    public Criteria andCheckRecordIdNotIn(List<Integer> values) {
      addCriterion("check_record_id not in", values, "checkRecordId");
      return (Criteria) this;
    }

    public Criteria andCheckRecordIdBetween(Integer value1, Integer value2) {
      addCriterion("check_record_id between", value1, value2, "checkRecordId");
      return (Criteria) this;
    }

    public Criteria andCheckRecordIdNotBetween(Integer value1, Integer value2) {
      addCriterion("check_record_id not between", value1, value2, "checkRecordId");
      return (Criteria) this;
    }

    public Criteria andWxUserIdIsNull() {
      addCriterion("wx_user_id is null");
      return (Criteria) this;
    }

    public Criteria andWxUserIdIsNotNull() {
      addCriterion("wx_user_id is not null");
      return (Criteria) this;
    }

    public Criteria andWxUserIdEqualTo(Integer value) {
      addCriterion("wx_user_id =", value, "wxUserId");
      return (Criteria) this;
    }

    public Criteria andWxUserIdNotEqualTo(Integer value) {
      addCriterion("wx_user_id <>", value, "wxUserId");
      return (Criteria) this;
    }

    public Criteria andWxUserIdGreaterThan(Integer value) {
      addCriterion("wx_user_id >", value, "wxUserId");
      return (Criteria) this;
    }

    public Criteria andWxUserIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("wx_user_id >=", value, "wxUserId");
      return (Criteria) this;
    }

    public Criteria andWxUserIdLessThan(Integer value) {
      addCriterion("wx_user_id <", value, "wxUserId");
      return (Criteria) this;
    }

    public Criteria andWxUserIdLessThanOrEqualTo(Integer value) {
      addCriterion("wx_user_id <=", value, "wxUserId");
      return (Criteria) this;
    }

    public Criteria andWxUserIdIn(List<Integer> values) {
      addCriterion("wx_user_id in", values, "wxUserId");
      return (Criteria) this;
    }

    public Criteria andWxUserIdNotIn(List<Integer> values) {
      addCriterion("wx_user_id not in", values, "wxUserId");
      return (Criteria) this;
    }

    public Criteria andWxUserIdBetween(Integer value1, Integer value2) {
      addCriterion("wx_user_id between", value1, value2, "wxUserId");
      return (Criteria) this;
    }

    public Criteria andWxUserIdNotBetween(Integer value1, Integer value2) {
      addCriterion("wx_user_id not between", value1, value2, "wxUserId");
      return (Criteria) this;
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

    public Criteria andCheckDateIsNull() {
      addCriterion("check_date is null");
      return (Criteria) this;
    }

    public Criteria andCheckDateIsNotNull() {
      addCriterion("check_date is not null");
      return (Criteria) this;
    }

    public Criteria andCheckDateEqualTo(Date value) {
      addCriterion("check_date =", value, "checkDate");
      return (Criteria) this;
    }

    public Criteria andCheckDateNotEqualTo(Date value) {
      addCriterion("check_date <>", value, "checkDate");
      return (Criteria) this;
    }

    public Criteria andCheckDateGreaterThan(Date value) {
      addCriterion("check_date >", value, "checkDate");
      return (Criteria) this;
    }

    public Criteria andCheckDateGreaterThanOrEqualTo(Date value) {
      addCriterion("check_date >=", value, "checkDate");
      return (Criteria) this;
    }

    public Criteria andCheckDateLessThan(Date value) {
      addCriterion("check_date <", value, "checkDate");
      return (Criteria) this;
    }

    public Criteria andCheckDateLessThanOrEqualTo(Date value) {
      addCriterion("check_date <=", value, "checkDate");
      return (Criteria) this;
    }

    public Criteria andCheckDateIn(List<Date> values) {
      addCriterion("check_date in", values, "checkDate");
      return (Criteria) this;
    }

    public Criteria andCheckDateNotIn(List<Date> values) {
      addCriterion("check_date not in", values, "checkDate");
      return (Criteria) this;
    }

    public Criteria andCheckDateBetween(Date value1, Date value2) {
      addCriterion("check_date between", value1, value2, "checkDate");
      return (Criteria) this;
    }

    public Criteria andCheckDateNotBetween(Date value1, Date value2) {
      addCriterion("check_date not between", value1, value2, "checkDate");
      return (Criteria) this;
    }

    public Criteria andDataTypeIsNull() {
      addCriterion("data_type is null");
      return (Criteria) this;
    }

    public Criteria andDataTypeIsNotNull() {
      addCriterion("data_type is not null");
      return (Criteria) this;
    }

    public Criteria andDataTypeEqualTo(String value) {
      addCriterion("data_type =", value, "dataType");
      return (Criteria) this;
    }

    public Criteria andDataTypeNotEqualTo(String value) {
      addCriterion("data_type <>", value, "dataType");
      return (Criteria) this;
    }

    public Criteria andDataTypeGreaterThan(String value) {
      addCriterion("data_type >", value, "dataType");
      return (Criteria) this;
    }

    public Criteria andDataTypeGreaterThanOrEqualTo(String value) {
      addCriterion("data_type >=", value, "dataType");
      return (Criteria) this;
    }

    public Criteria andDataTypeLessThan(String value) {
      addCriterion("data_type <", value, "dataType");
      return (Criteria) this;
    }

    public Criteria andDataTypeLessThanOrEqualTo(String value) {
      addCriterion("data_type <=", value, "dataType");
      return (Criteria) this;
    }

    public Criteria andDataTypeLike(String value) {
      addCriterion("data_type like", value, "dataType");
      return (Criteria) this;
    }

    public Criteria andDataTypeNotLike(String value) {
      addCriterion("data_type not like", value, "dataType");
      return (Criteria) this;
    }

    public Criteria andDataTypeIn(List<String> values) {
      addCriterion("data_type in", values, "dataType");
      return (Criteria) this;
    }

    public Criteria andDataTypeNotIn(List<String> values) {
      addCriterion("data_type not in", values, "dataType");
      return (Criteria) this;
    }

    public Criteria andDataTypeBetween(String value1, String value2) {
      addCriterion("data_type between", value1, value2, "dataType");
      return (Criteria) this;
    }

    public Criteria andDataTypeNotBetween(String value1, String value2) {
      addCriterion("data_type not between", value1, value2, "dataType");
      return (Criteria) this;
    }

    public Criteria andEyeTypeIsNull() {
      addCriterion("eye_type is null");
      return (Criteria) this;
    }

    public Criteria andEyeTypeIsNotNull() {
      addCriterion("eye_type is not null");
      return (Criteria) this;
    }

    public Criteria andEyeTypeEqualTo(String value) {
      addCriterion("eye_type =", value, "eyeType");
      return (Criteria) this;
    }

    public Criteria andEyeTypeNotEqualTo(String value) {
      addCriterion("eye_type <>", value, "eyeType");
      return (Criteria) this;
    }

    public Criteria andEyeTypeGreaterThan(String value) {
      addCriterion("eye_type >", value, "eyeType");
      return (Criteria) this;
    }

    public Criteria andEyeTypeGreaterThanOrEqualTo(String value) {
      addCriterion("eye_type >=", value, "eyeType");
      return (Criteria) this;
    }

    public Criteria andEyeTypeLessThan(String value) {
      addCriterion("eye_type <", value, "eyeType");
      return (Criteria) this;
    }

    public Criteria andEyeTypeLessThanOrEqualTo(String value) {
      addCriterion("eye_type <=", value, "eyeType");
      return (Criteria) this;
    }

    public Criteria andEyeTypeLike(String value) {
      addCriterion("eye_type like", value, "eyeType");
      return (Criteria) this;
    }

    public Criteria andEyeTypeNotLike(String value) {
      addCriterion("eye_type not like", value, "eyeType");
      return (Criteria) this;
    }

    public Criteria andEyeTypeIn(List<String> values) {
      addCriterion("eye_type in", values, "eyeType");
      return (Criteria) this;
    }

    public Criteria andEyeTypeNotIn(List<String> values) {
      addCriterion("eye_type not in", values, "eyeType");
      return (Criteria) this;
    }

    public Criteria andEyeTypeBetween(String value1, String value2) {
      addCriterion("eye_type between", value1, value2, "eyeType");
      return (Criteria) this;
    }

    public Criteria andEyeTypeNotBetween(String value1, String value2) {
      addCriterion("eye_type not between", value1, value2, "eyeType");
      return (Criteria) this;
    }

    public Criteria andPupilIsNull() {
      addCriterion("pupil is null");
      return (Criteria) this;
    }

    public Criteria andPupilIsNotNull() {
      addCriterion("pupil is not null");
      return (Criteria) this;
    }

    public Criteria andPupilEqualTo(Double value) {
      addCriterion("pupil =", value, "pupil");
      return (Criteria) this;
    }

    public Criteria andPupilNotEqualTo(Double value) {
      addCriterion("pupil <>", value, "pupil");
      return (Criteria) this;
    }

    public Criteria andPupilGreaterThan(Double value) {
      addCriterion("pupil >", value, "pupil");
      return (Criteria) this;
    }

    public Criteria andPupilGreaterThanOrEqualTo(Double value) {
      addCriterion("pupil >=", value, "pupil");
      return (Criteria) this;
    }

    public Criteria andPupilLessThan(Double value) {
      addCriterion("pupil <", value, "pupil");
      return (Criteria) this;
    }

    public Criteria andPupilLessThanOrEqualTo(Double value) {
      addCriterion("pupil <=", value, "pupil");
      return (Criteria) this;
    }

    public Criteria andPupilIn(List<Double> values) {
      addCriterion("pupil in", values, "pupil");
      return (Criteria) this;
    }

    public Criteria andPupilNotIn(List<Double> values) {
      addCriterion("pupil not in", values, "pupil");
      return (Criteria) this;
    }

    public Criteria andPupilBetween(Double value1, Double value2) {
      addCriterion("pupil between", value1, value2, "pupil");
      return (Criteria) this;
    }

    public Criteria andPupilNotBetween(Double value1, Double value2) {
      addCriterion("pupil not between", value1, value2, "pupil");
      return (Criteria) this;
    }

    public Criteria andSe1IsNull() {
      addCriterion("se1 is null");
      return (Criteria) this;
    }

    public Criteria andSe1IsNotNull() {
      addCriterion("se1 is not null");
      return (Criteria) this;
    }

    public Criteria andSe1EqualTo(Double value) {
      addCriterion("se1 =", value, "se1");
      return (Criteria) this;
    }

    public Criteria andSe1NotEqualTo(Double value) {
      addCriterion("se1 <>", value, "se1");
      return (Criteria) this;
    }

    public Criteria andSe1GreaterThan(Double value) {
      addCriterion("se1 >", value, "se1");
      return (Criteria) this;
    }

    public Criteria andSe1GreaterThanOrEqualTo(Double value) {
      addCriterion("se1 >=", value, "se1");
      return (Criteria) this;
    }

    public Criteria andSe1LessThan(Double value) {
      addCriterion("se1 <", value, "se1");
      return (Criteria) this;
    }

    public Criteria andSe1LessThanOrEqualTo(Double value) {
      addCriterion("se1 <=", value, "se1");
      return (Criteria) this;
    }

    public Criteria andSe1In(List<Double> values) {
      addCriterion("se1 in", values, "se1");
      return (Criteria) this;
    }

    public Criteria andSe1NotIn(List<Double> values) {
      addCriterion("se1 not in", values, "se1");
      return (Criteria) this;
    }

    public Criteria andSe1Between(Double value1, Double value2) {
      addCriterion("se1 between", value1, value2, "se1");
      return (Criteria) this;
    }

    public Criteria andSe1NotBetween(Double value1, Double value2) {
      addCriterion("se1 not between", value1, value2, "se1");
      return (Criteria) this;
    }

    public Criteria andDs1IsNull() {
      addCriterion("ds1 is null");
      return (Criteria) this;
    }

    public Criteria andDs1IsNotNull() {
      addCriterion("ds1 is not null");
      return (Criteria) this;
    }

    public Criteria andDs1EqualTo(Double value) {
      addCriterion("ds1 =", value, "ds1");
      return (Criteria) this;
    }

    public Criteria andDs1NotEqualTo(Double value) {
      addCriterion("ds1 <>", value, "ds1");
      return (Criteria) this;
    }

    public Criteria andDs1GreaterThan(Double value) {
      addCriterion("ds1 >", value, "ds1");
      return (Criteria) this;
    }

    public Criteria andDs1GreaterThanOrEqualTo(Double value) {
      addCriterion("ds1 >=", value, "ds1");
      return (Criteria) this;
    }

    public Criteria andDs1LessThan(Double value) {
      addCriterion("ds1 <", value, "ds1");
      return (Criteria) this;
    }

    public Criteria andDs1LessThanOrEqualTo(Double value) {
      addCriterion("ds1 <=", value, "ds1");
      return (Criteria) this;
    }

    public Criteria andDs1In(List<Double> values) {
      addCriterion("ds1 in", values, "ds1");
      return (Criteria) this;
    }

    public Criteria andDs1NotIn(List<Double> values) {
      addCriterion("ds1 not in", values, "ds1");
      return (Criteria) this;
    }

    public Criteria andDs1Between(Double value1, Double value2) {
      addCriterion("ds1 between", value1, value2, "ds1");
      return (Criteria) this;
    }

    public Criteria andDs1NotBetween(Double value1, Double value2) {
      addCriterion("ds1 not between", value1, value2, "ds1");
      return (Criteria) this;
    }

    public Criteria andDc1IsNull() {
      addCriterion("dc1 is null");
      return (Criteria) this;
    }

    public Criteria andDc1IsNotNull() {
      addCriterion("dc1 is not null");
      return (Criteria) this;
    }

    public Criteria andDc1EqualTo(Double value) {
      addCriterion("dc1 =", value, "dc1");
      return (Criteria) this;
    }

    public Criteria andDc1NotEqualTo(Double value) {
      addCriterion("dc1 <>", value, "dc1");
      return (Criteria) this;
    }

    public Criteria andDc1GreaterThan(Double value) {
      addCriterion("dc1 >", value, "dc1");
      return (Criteria) this;
    }

    public Criteria andDc1GreaterThanOrEqualTo(Double value) {
      addCriterion("dc1 >=", value, "dc1");
      return (Criteria) this;
    }

    public Criteria andDc1LessThan(Double value) {
      addCriterion("dc1 <", value, "dc1");
      return (Criteria) this;
    }

    public Criteria andDc1LessThanOrEqualTo(Double value) {
      addCriterion("dc1 <=", value, "dc1");
      return (Criteria) this;
    }

    public Criteria andDc1In(List<Double> values) {
      addCriterion("dc1 in", values, "dc1");
      return (Criteria) this;
    }

    public Criteria andDc1NotIn(List<Double> values) {
      addCriterion("dc1 not in", values, "dc1");
      return (Criteria) this;
    }

    public Criteria andDc1Between(Double value1, Double value2) {
      addCriterion("dc1 between", value1, value2, "dc1");
      return (Criteria) this;
    }

    public Criteria andDc1NotBetween(Double value1, Double value2) {
      addCriterion("dc1 not between", value1, value2, "dc1");
      return (Criteria) this;
    }

    public Criteria andAxis1IsNull() {
      addCriterion("axis1 is null");
      return (Criteria) this;
    }

    public Criteria andAxis1IsNotNull() {
      addCriterion("axis1 is not null");
      return (Criteria) this;
    }

    public Criteria andAxis1EqualTo(Integer value) {
      addCriterion("axis1 =", value, "axis1");
      return (Criteria) this;
    }

    public Criteria andAxis1NotEqualTo(Integer value) {
      addCriterion("axis1 <>", value, "axis1");
      return (Criteria) this;
    }

    public Criteria andAxis1GreaterThan(Integer value) {
      addCriterion("axis1 >", value, "axis1");
      return (Criteria) this;
    }

    public Criteria andAxis1GreaterThanOrEqualTo(Integer value) {
      addCriterion("axis1 >=", value, "axis1");
      return (Criteria) this;
    }

    public Criteria andAxis1LessThan(Integer value) {
      addCriterion("axis1 <", value, "axis1");
      return (Criteria) this;
    }

    public Criteria andAxis1LessThanOrEqualTo(Integer value) {
      addCriterion("axis1 <=", value, "axis1");
      return (Criteria) this;
    }

    public Criteria andAxis1In(List<Integer> values) {
      addCriterion("axis1 in", values, "axis1");
      return (Criteria) this;
    }

    public Criteria andAxis1NotIn(List<Integer> values) {
      addCriterion("axis1 not in", values, "axis1");
      return (Criteria) this;
    }

    public Criteria andAxis1Between(Integer value1, Integer value2) {
      addCriterion("axis1 between", value1, value2, "axis1");
      return (Criteria) this;
    }

    public Criteria andAxis1NotBetween(Integer value1, Integer value2) {
      addCriterion("axis1 not between", value1, value2, "axis1");
      return (Criteria) this;
    }

    public Criteria andSe2IsNull() {
      addCriterion("se2 is null");
      return (Criteria) this;
    }

    public Criteria andSe2IsNotNull() {
      addCriterion("se2 is not null");
      return (Criteria) this;
    }

    public Criteria andSe2EqualTo(Double value) {
      addCriterion("se2 =", value, "se2");
      return (Criteria) this;
    }

    public Criteria andSe2NotEqualTo(Double value) {
      addCriterion("se2 <>", value, "se2");
      return (Criteria) this;
    }

    public Criteria andSe2GreaterThan(Double value) {
      addCriterion("se2 >", value, "se2");
      return (Criteria) this;
    }

    public Criteria andSe2GreaterThanOrEqualTo(Double value) {
      addCriterion("se2 >=", value, "se2");
      return (Criteria) this;
    }

    public Criteria andSe2LessThan(Double value) {
      addCriterion("se2 <", value, "se2");
      return (Criteria) this;
    }

    public Criteria andSe2LessThanOrEqualTo(Double value) {
      addCriterion("se2 <=", value, "se2");
      return (Criteria) this;
    }

    public Criteria andSe2In(List<Double> values) {
      addCriterion("se2 in", values, "se2");
      return (Criteria) this;
    }

    public Criteria andSe2NotIn(List<Double> values) {
      addCriterion("se2 not in", values, "se2");
      return (Criteria) this;
    }

    public Criteria andSe2Between(Double value1, Double value2) {
      addCriterion("se2 between", value1, value2, "se2");
      return (Criteria) this;
    }

    public Criteria andSe2NotBetween(Double value1, Double value2) {
      addCriterion("se2 not between", value1, value2, "se2");
      return (Criteria) this;
    }

    public Criteria andDs2IsNull() {
      addCriterion("ds2 is null");
      return (Criteria) this;
    }

    public Criteria andDs2IsNotNull() {
      addCriterion("ds2 is not null");
      return (Criteria) this;
    }

    public Criteria andDs2EqualTo(Double value) {
      addCriterion("ds2 =", value, "ds2");
      return (Criteria) this;
    }

    public Criteria andDs2NotEqualTo(Double value) {
      addCriterion("ds2 <>", value, "ds2");
      return (Criteria) this;
    }

    public Criteria andDs2GreaterThan(Double value) {
      addCriterion("ds2 >", value, "ds2");
      return (Criteria) this;
    }

    public Criteria andDs2GreaterThanOrEqualTo(Double value) {
      addCriterion("ds2 >=", value, "ds2");
      return (Criteria) this;
    }

    public Criteria andDs2LessThan(Double value) {
      addCriterion("ds2 <", value, "ds2");
      return (Criteria) this;
    }

    public Criteria andDs2LessThanOrEqualTo(Double value) {
      addCriterion("ds2 <=", value, "ds2");
      return (Criteria) this;
    }

    public Criteria andDs2In(List<Double> values) {
      addCriterion("ds2 in", values, "ds2");
      return (Criteria) this;
    }

    public Criteria andDs2NotIn(List<Double> values) {
      addCriterion("ds2 not in", values, "ds2");
      return (Criteria) this;
    }

    public Criteria andDs2Between(Double value1, Double value2) {
      addCriterion("ds2 between", value1, value2, "ds2");
      return (Criteria) this;
    }

    public Criteria andDs2NotBetween(Double value1, Double value2) {
      addCriterion("ds2 not between", value1, value2, "ds2");
      return (Criteria) this;
    }

    public Criteria andDc2IsNull() {
      addCriterion("dc2 is null");
      return (Criteria) this;
    }

    public Criteria andDc2IsNotNull() {
      addCriterion("dc2 is not null");
      return (Criteria) this;
    }

    public Criteria andDc2EqualTo(Double value) {
      addCriterion("dc2 =", value, "dc2");
      return (Criteria) this;
    }

    public Criteria andDc2NotEqualTo(Double value) {
      addCriterion("dc2 <>", value, "dc2");
      return (Criteria) this;
    }

    public Criteria andDc2GreaterThan(Double value) {
      addCriterion("dc2 >", value, "dc2");
      return (Criteria) this;
    }

    public Criteria andDc2GreaterThanOrEqualTo(Double value) {
      addCriterion("dc2 >=", value, "dc2");
      return (Criteria) this;
    }

    public Criteria andDc2LessThan(Double value) {
      addCriterion("dc2 <", value, "dc2");
      return (Criteria) this;
    }

    public Criteria andDc2LessThanOrEqualTo(Double value) {
      addCriterion("dc2 <=", value, "dc2");
      return (Criteria) this;
    }

    public Criteria andDc2In(List<Double> values) {
      addCriterion("dc2 in", values, "dc2");
      return (Criteria) this;
    }

    public Criteria andDc2NotIn(List<Double> values) {
      addCriterion("dc2 not in", values, "dc2");
      return (Criteria) this;
    }

    public Criteria andDc2Between(Double value1, Double value2) {
      addCriterion("dc2 between", value1, value2, "dc2");
      return (Criteria) this;
    }

    public Criteria andDc2NotBetween(Double value1, Double value2) {
      addCriterion("dc2 not between", value1, value2, "dc2");
      return (Criteria) this;
    }

    public Criteria andAxis2IsNull() {
      addCriterion("axis2 is null");
      return (Criteria) this;
    }

    public Criteria andAxis2IsNotNull() {
      addCriterion("axis2 is not null");
      return (Criteria) this;
    }

    public Criteria andAxis2EqualTo(Integer value) {
      addCriterion("axis2 =", value, "axis2");
      return (Criteria) this;
    }

    public Criteria andAxis2NotEqualTo(Integer value) {
      addCriterion("axis2 <>", value, "axis2");
      return (Criteria) this;
    }

    public Criteria andAxis2GreaterThan(Integer value) {
      addCriterion("axis2 >", value, "axis2");
      return (Criteria) this;
    }

    public Criteria andAxis2GreaterThanOrEqualTo(Integer value) {
      addCriterion("axis2 >=", value, "axis2");
      return (Criteria) this;
    }

    public Criteria andAxis2LessThan(Integer value) {
      addCriterion("axis2 <", value, "axis2");
      return (Criteria) this;
    }

    public Criteria andAxis2LessThanOrEqualTo(Integer value) {
      addCriterion("axis2 <=", value, "axis2");
      return (Criteria) this;
    }

    public Criteria andAxis2In(List<Integer> values) {
      addCriterion("axis2 in", values, "axis2");
      return (Criteria) this;
    }

    public Criteria andAxis2NotIn(List<Integer> values) {
      addCriterion("axis2 not in", values, "axis2");
      return (Criteria) this;
    }

    public Criteria andAxis2Between(Integer value1, Integer value2) {
      addCriterion("axis2 between", value1, value2, "axis2");
      return (Criteria) this;
    }

    public Criteria andAxis2NotBetween(Integer value1, Integer value2) {
      addCriterion("axis2 not between", value1, value2, "axis2");
      return (Criteria) this;
    }

    public Criteria andPdIsNull() {
      addCriterion("pd is null");
      return (Criteria) this;
    }

    public Criteria andPdIsNotNull() {
      addCriterion("pd is not null");
      return (Criteria) this;
    }

    public Criteria andPdEqualTo(Integer value) {
      addCriterion("pd =", value, "pd");
      return (Criteria) this;
    }

    public Criteria andPdNotEqualTo(Integer value) {
      addCriterion("pd <>", value, "pd");
      return (Criteria) this;
    }

    public Criteria andPdGreaterThan(Integer value) {
      addCriterion("pd >", value, "pd");
      return (Criteria) this;
    }

    public Criteria andPdGreaterThanOrEqualTo(Integer value) {
      addCriterion("pd >=", value, "pd");
      return (Criteria) this;
    }

    public Criteria andPdLessThan(Integer value) {
      addCriterion("pd <", value, "pd");
      return (Criteria) this;
    }

    public Criteria andPdLessThanOrEqualTo(Integer value) {
      addCriterion("pd <=", value, "pd");
      return (Criteria) this;
    }

    public Criteria andPdIn(List<Integer> values) {
      addCriterion("pd in", values, "pd");
      return (Criteria) this;
    }

    public Criteria andPdNotIn(List<Integer> values) {
      addCriterion("pd not in", values, "pd");
      return (Criteria) this;
    }

    public Criteria andPdBetween(Integer value1, Integer value2) {
      addCriterion("pd between", value1, value2, "pd");
      return (Criteria) this;
    }

    public Criteria andPdNotBetween(Integer value1, Integer value2) {
      addCriterion("pd not between", value1, value2, "pd");
      return (Criteria) this;
    }

    public Criteria andMmHgIsNull() {
      addCriterion("mm_hg is null");
      return (Criteria) this;
    }

    public Criteria andMmHgIsNotNull() {
      addCriterion("mm_hg is not null");
      return (Criteria) this;
    }

    public Criteria andMmHgEqualTo(Double value) {
      addCriterion("mm_hg =", value, "mmHg");
      return (Criteria) this;
    }

    public Criteria andMmHgNotEqualTo(Double value) {
      addCriterion("mm_hg <>", value, "mmHg");
      return (Criteria) this;
    }

    public Criteria andMmHgGreaterThan(Double value) {
      addCriterion("mm_hg >", value, "mmHg");
      return (Criteria) this;
    }

    public Criteria andMmHgGreaterThanOrEqualTo(Double value) {
      addCriterion("mm_hg >=", value, "mmHg");
      return (Criteria) this;
    }

    public Criteria andMmHgLessThan(Double value) {
      addCriterion("mm_hg <", value, "mmHg");
      return (Criteria) this;
    }

    public Criteria andMmHgLessThanOrEqualTo(Double value) {
      addCriterion("mm_hg <=", value, "mmHg");
      return (Criteria) this;
    }

    public Criteria andMmHgIn(List<Double> values) {
      addCriterion("mm_hg in", values, "mmHg");
      return (Criteria) this;
    }

    public Criteria andMmHgNotIn(List<Double> values) {
      addCriterion("mm_hg not in", values, "mmHg");
      return (Criteria) this;
    }

    public Criteria andMmHgBetween(Double value1, Double value2) {
      addCriterion("mm_hg between", value1, value2, "mmHg");
      return (Criteria) this;
    }

    public Criteria andMmHgNotBetween(Double value1, Double value2) {
      addCriterion("mm_hg not between", value1, value2, "mmHg");
      return (Criteria) this;
    }

    public Criteria andGazeHorizontalIsNull() {
      addCriterion("gaze_horizontal is null");
      return (Criteria) this;
    }

    public Criteria andGazeHorizontalIsNotNull() {
      addCriterion("gaze_horizontal is not null");
      return (Criteria) this;
    }

    public Criteria andGazeHorizontalEqualTo(Integer value) {
      addCriterion("gaze_horizontal =", value, "gazeHorizontal");
      return (Criteria) this;
    }

    public Criteria andGazeHorizontalNotEqualTo(Integer value) {
      addCriterion("gaze_horizontal <>", value, "gazeHorizontal");
      return (Criteria) this;
    }

    public Criteria andGazeHorizontalGreaterThan(Integer value) {
      addCriterion("gaze_horizontal >", value, "gazeHorizontal");
      return (Criteria) this;
    }

    public Criteria andGazeHorizontalGreaterThanOrEqualTo(Integer value) {
      addCriterion("gaze_horizontal >=", value, "gazeHorizontal");
      return (Criteria) this;
    }

    public Criteria andGazeHorizontalLessThan(Integer value) {
      addCriterion("gaze_horizontal <", value, "gazeHorizontal");
      return (Criteria) this;
    }

    public Criteria andGazeHorizontalLessThanOrEqualTo(Integer value) {
      addCriterion("gaze_horizontal <=", value, "gazeHorizontal");
      return (Criteria) this;
    }

    public Criteria andGazeHorizontalIn(List<Integer> values) {
      addCriterion("gaze_horizontal in", values, "gazeHorizontal");
      return (Criteria) this;
    }

    public Criteria andGazeHorizontalNotIn(List<Integer> values) {
      addCriterion("gaze_horizontal not in", values, "gazeHorizontal");
      return (Criteria) this;
    }

    public Criteria andGazeHorizontalBetween(Integer value1, Integer value2) {
      addCriterion("gaze_horizontal between", value1, value2, "gazeHorizontal");
      return (Criteria) this;
    }

    public Criteria andGazeHorizontalNotBetween(Integer value1, Integer value2) {
      addCriterion("gaze_horizontal not between", value1, value2, "gazeHorizontal");
      return (Criteria) this;
    }

    public Criteria andGazevVerticalIsNull() {
      addCriterion("gazev_vertical is null");
      return (Criteria) this;
    }

    public Criteria andGazevVerticalIsNotNull() {
      addCriterion("gazev_vertical is not null");
      return (Criteria) this;
    }

    public Criteria andGazevVerticalEqualTo(Integer value) {
      addCriterion("gazev_vertical =", value, "gazevVertical");
      return (Criteria) this;
    }

    public Criteria andGazevVerticalNotEqualTo(Integer value) {
      addCriterion("gazev_vertical <>", value, "gazevVertical");
      return (Criteria) this;
    }

    public Criteria andGazevVerticalGreaterThan(Integer value) {
      addCriterion("gazev_vertical >", value, "gazevVertical");
      return (Criteria) this;
    }

    public Criteria andGazevVerticalGreaterThanOrEqualTo(Integer value) {
      addCriterion("gazev_vertical >=", value, "gazevVertical");
      return (Criteria) this;
    }

    public Criteria andGazevVerticalLessThan(Integer value) {
      addCriterion("gazev_vertical <", value, "gazevVertical");
      return (Criteria) this;
    }

    public Criteria andGazevVerticalLessThanOrEqualTo(Integer value) {
      addCriterion("gazev_vertical <=", value, "gazevVertical");
      return (Criteria) this;
    }

    public Criteria andGazevVerticalIn(List<Integer> values) {
      addCriterion("gazev_vertical in", values, "gazevVertical");
      return (Criteria) this;
    }

    public Criteria andGazevVerticalNotIn(List<Integer> values) {
      addCriterion("gazev_vertical not in", values, "gazevVertical");
      return (Criteria) this;
    }

    public Criteria andGazevVerticalBetween(Integer value1, Integer value2) {
      addCriterion("gazev_vertical between", value1, value2, "gazevVertical");
      return (Criteria) this;
    }

    public Criteria andGazevVerticalNotBetween(Integer value1, Integer value2) {
      addCriterion("gazev_vertical not between", value1, value2, "gazevVertical");
      return (Criteria) this;
    }

    public Criteria andCheckCodeIsNull() {
      addCriterion("check_code is null");
      return (Criteria) this;
    }

    public Criteria andCheckCodeIsNotNull() {
      addCriterion("check_code is not null");
      return (Criteria) this;
    }

    public Criteria andCheckCodeEqualTo(String value) {
      addCriterion("check_code =", value, "checkCode");
      return (Criteria) this;
    }

    public Criteria andCheckCodeNotEqualTo(String value) {
      addCriterion("check_code <>", value, "checkCode");
      return (Criteria) this;
    }

    public Criteria andCheckCodeGreaterThan(String value) {
      addCriterion("check_code >", value, "checkCode");
      return (Criteria) this;
    }

    public Criteria andCheckCodeGreaterThanOrEqualTo(String value) {
      addCriterion("check_code >=", value, "checkCode");
      return (Criteria) this;
    }

    public Criteria andCheckCodeLessThan(String value) {
      addCriterion("check_code <", value, "checkCode");
      return (Criteria) this;
    }

    public Criteria andCheckCodeLessThanOrEqualTo(String value) {
      addCriterion("check_code <=", value, "checkCode");
      return (Criteria) this;
    }

    public Criteria andCheckCodeLike(String value) {
      addCriterion("check_code like", value, "checkCode");
      return (Criteria) this;
    }

    public Criteria andCheckCodeNotLike(String value) {
      addCriterion("check_code not like", value, "checkCode");
      return (Criteria) this;
    }

    public Criteria andCheckCodeIn(List<String> values) {
      addCriterion("check_code in", values, "checkCode");
      return (Criteria) this;
    }

    public Criteria andCheckCodeNotIn(List<String> values) {
      addCriterion("check_code not in", values, "checkCode");
      return (Criteria) this;
    }

    public Criteria andCheckCodeBetween(String value1, String value2) {
      addCriterion("check_code between", value1, value2, "checkCode");
      return (Criteria) this;
    }

    public Criteria andCheckCodeNotBetween(String value1, String value2) {
      addCriterion("check_code not between", value1, value2, "checkCode");
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
   * 只读. t_check_record
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
     * This class corresponds to the database table t_check_record
     *
     * @mbg.generated do_not_delete_during_merge 2018-12-26 10:42:06
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }
}