package com.healthy.vision.entity.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysDictionaryPOExample implements Serializable {
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
  public SysDictionaryPOExample() {
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
   * 只读. t_sys_dictionary
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

    public Criteria andSysDictionaryIdIsNull() {
      addCriterion("sys_dictionary_id is null");
      return (Criteria) this;
    }

    public Criteria andSysDictionaryIdIsNotNull() {
      addCriterion("sys_dictionary_id is not null");
      return (Criteria) this;
    }

    public Criteria andSysDictionaryIdEqualTo(Integer value) {
      addCriterion("sys_dictionary_id =", value, "sysDictionaryId");
      return (Criteria) this;
    }

    public Criteria andSysDictionaryIdNotEqualTo(Integer value) {
      addCriterion("sys_dictionary_id <>", value, "sysDictionaryId");
      return (Criteria) this;
    }

    public Criteria andSysDictionaryIdGreaterThan(Integer value) {
      addCriterion("sys_dictionary_id >", value, "sysDictionaryId");
      return (Criteria) this;
    }

    public Criteria andSysDictionaryIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("sys_dictionary_id >=", value, "sysDictionaryId");
      return (Criteria) this;
    }

    public Criteria andSysDictionaryIdLessThan(Integer value) {
      addCriterion("sys_dictionary_id <", value, "sysDictionaryId");
      return (Criteria) this;
    }

    public Criteria andSysDictionaryIdLessThanOrEqualTo(Integer value) {
      addCriterion("sys_dictionary_id <=", value, "sysDictionaryId");
      return (Criteria) this;
    }

    public Criteria andSysDictionaryIdIn(List<Integer> values) {
      addCriterion("sys_dictionary_id in", values, "sysDictionaryId");
      return (Criteria) this;
    }

    public Criteria andSysDictionaryIdNotIn(List<Integer> values) {
      addCriterion("sys_dictionary_id not in", values, "sysDictionaryId");
      return (Criteria) this;
    }

    public Criteria andSysDictionaryIdBetween(Integer value1, Integer value2) {
      addCriterion("sys_dictionary_id between", value1, value2, "sysDictionaryId");
      return (Criteria) this;
    }

    public Criteria andSysDictionaryIdNotBetween(Integer value1, Integer value2) {
      addCriterion("sys_dictionary_id not between", value1, value2, "sysDictionaryId");
      return (Criteria) this;
    }

    public Criteria andCodeIsNull() {
      addCriterion("code is null");
      return (Criteria) this;
    }

    public Criteria andCodeIsNotNull() {
      addCriterion("code is not null");
      return (Criteria) this;
    }

    public Criteria andCodeEqualTo(String value) {
      addCriterion("code =", value, "code");
      return (Criteria) this;
    }

    public Criteria andCodeNotEqualTo(String value) {
      addCriterion("code <>", value, "code");
      return (Criteria) this;
    }

    public Criteria andCodeGreaterThan(String value) {
      addCriterion("code >", value, "code");
      return (Criteria) this;
    }

    public Criteria andCodeGreaterThanOrEqualTo(String value) {
      addCriterion("code >=", value, "code");
      return (Criteria) this;
    }

    public Criteria andCodeLessThan(String value) {
      addCriterion("code <", value, "code");
      return (Criteria) this;
    }

    public Criteria andCodeLessThanOrEqualTo(String value) {
      addCriterion("code <=", value, "code");
      return (Criteria) this;
    }

    public Criteria andCodeLike(String value) {
      addCriterion("code like", value, "code");
      return (Criteria) this;
    }

    public Criteria andCodeNotLike(String value) {
      addCriterion("code not like", value, "code");
      return (Criteria) this;
    }

    public Criteria andCodeIn(List<String> values) {
      addCriterion("code in", values, "code");
      return (Criteria) this;
    }

    public Criteria andCodeNotIn(List<String> values) {
      addCriterion("code not in", values, "code");
      return (Criteria) this;
    }

    public Criteria andCodeBetween(String value1, String value2) {
      addCriterion("code between", value1, value2, "code");
      return (Criteria) this;
    }

    public Criteria andCodeNotBetween(String value1, String value2) {
      addCriterion("code not between", value1, value2, "code");
      return (Criteria) this;
    }

    public Criteria andTypeIsNull() {
      addCriterion("type is null");
      return (Criteria) this;
    }

    public Criteria andTypeIsNotNull() {
      addCriterion("type is not null");
      return (Criteria) this;
    }

    public Criteria andTypeEqualTo(String value) {
      addCriterion("type =", value, "type");
      return (Criteria) this;
    }

    public Criteria andTypeNotEqualTo(String value) {
      addCriterion("type <>", value, "type");
      return (Criteria) this;
    }

    public Criteria andTypeGreaterThan(String value) {
      addCriterion("type >", value, "type");
      return (Criteria) this;
    }

    public Criteria andTypeGreaterThanOrEqualTo(String value) {
      addCriterion("type >=", value, "type");
      return (Criteria) this;
    }

    public Criteria andTypeLessThan(String value) {
      addCriterion("type <", value, "type");
      return (Criteria) this;
    }

    public Criteria andTypeLessThanOrEqualTo(String value) {
      addCriterion("type <=", value, "type");
      return (Criteria) this;
    }

    public Criteria andTypeLike(String value) {
      addCriterion("type like", value, "type");
      return (Criteria) this;
    }

    public Criteria andTypeNotLike(String value) {
      addCriterion("type not like", value, "type");
      return (Criteria) this;
    }

    public Criteria andTypeIn(List<String> values) {
      addCriterion("type in", values, "type");
      return (Criteria) this;
    }

    public Criteria andTypeNotIn(List<String> values) {
      addCriterion("type not in", values, "type");
      return (Criteria) this;
    }

    public Criteria andTypeBetween(String value1, String value2) {
      addCriterion("type between", value1, value2, "type");
      return (Criteria) this;
    }

    public Criteria andTypeNotBetween(String value1, String value2) {
      addCriterion("type not between", value1, value2, "type");
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

    public Criteria andNameEqualTo(String value) {
      addCriterion("name =", value, "name");
      return (Criteria) this;
    }

    public Criteria andNameNotEqualTo(String value) {
      addCriterion("name <>", value, "name");
      return (Criteria) this;
    }

    public Criteria andNameGreaterThan(String value) {
      addCriterion("name >", value, "name");
      return (Criteria) this;
    }

    public Criteria andNameGreaterThanOrEqualTo(String value) {
      addCriterion("name >=", value, "name");
      return (Criteria) this;
    }

    public Criteria andNameLessThan(String value) {
      addCriterion("name <", value, "name");
      return (Criteria) this;
    }

    public Criteria andNameLessThanOrEqualTo(String value) {
      addCriterion("name <=", value, "name");
      return (Criteria) this;
    }

    public Criteria andNameLike(String value) {
      addCriterion("name like", value, "name");
      return (Criteria) this;
    }

    public Criteria andNameNotLike(String value) {
      addCriterion("name not like", value, "name");
      return (Criteria) this;
    }

    public Criteria andNameIn(List<String> values) {
      addCriterion("name in", values, "name");
      return (Criteria) this;
    }

    public Criteria andNameNotIn(List<String> values) {
      addCriterion("name not in", values, "name");
      return (Criteria) this;
    }

    public Criteria andNameBetween(String value1, String value2) {
      addCriterion("name between", value1, value2, "name");
      return (Criteria) this;
    }

    public Criteria andNameNotBetween(String value1, String value2) {
      addCriterion("name not between", value1, value2, "name");
      return (Criteria) this;
    }

    public Criteria andValueIsNull() {
      addCriterion("value is null");
      return (Criteria) this;
    }

    public Criteria andValueIsNotNull() {
      addCriterion("value is not null");
      return (Criteria) this;
    }

    public Criteria andValueEqualTo(String value) {
      addCriterion("value =", value, "value");
      return (Criteria) this;
    }

    public Criteria andValueNotEqualTo(String value) {
      addCriterion("value <>", value, "value");
      return (Criteria) this;
    }

    public Criteria andValueGreaterThan(String value) {
      addCriterion("value >", value, "value");
      return (Criteria) this;
    }

    public Criteria andValueGreaterThanOrEqualTo(String value) {
      addCriterion("value >=", value, "value");
      return (Criteria) this;
    }

    public Criteria andValueLessThan(String value) {
      addCriterion("value <", value, "value");
      return (Criteria) this;
    }

    public Criteria andValueLessThanOrEqualTo(String value) {
      addCriterion("value <=", value, "value");
      return (Criteria) this;
    }

    public Criteria andValueLike(String value) {
      addCriterion("value like", value, "value");
      return (Criteria) this;
    }

    public Criteria andValueNotLike(String value) {
      addCriterion("value not like", value, "value");
      return (Criteria) this;
    }

    public Criteria andValueIn(List<String> values) {
      addCriterion("value in", values, "value");
      return (Criteria) this;
    }

    public Criteria andValueNotIn(List<String> values) {
      addCriterion("value not in", values, "value");
      return (Criteria) this;
    }

    public Criteria andValueBetween(String value1, String value2) {
      addCriterion("value between", value1, value2, "value");
      return (Criteria) this;
    }

    public Criteria andValueNotBetween(String value1, String value2) {
      addCriterion("value not between", value1, value2, "value");
      return (Criteria) this;
    }

    public Criteria andSortIsNull() {
      addCriterion("sort is null");
      return (Criteria) this;
    }

    public Criteria andSortIsNotNull() {
      addCriterion("sort is not null");
      return (Criteria) this;
    }

    public Criteria andSortEqualTo(Long value) {
      addCriterion("sort =", value, "sort");
      return (Criteria) this;
    }

    public Criteria andSortNotEqualTo(Long value) {
      addCriterion("sort <>", value, "sort");
      return (Criteria) this;
    }

    public Criteria andSortGreaterThan(Long value) {
      addCriterion("sort >", value, "sort");
      return (Criteria) this;
    }

    public Criteria andSortGreaterThanOrEqualTo(Long value) {
      addCriterion("sort >=", value, "sort");
      return (Criteria) this;
    }

    public Criteria andSortLessThan(Long value) {
      addCriterion("sort <", value, "sort");
      return (Criteria) this;
    }

    public Criteria andSortLessThanOrEqualTo(Long value) {
      addCriterion("sort <=", value, "sort");
      return (Criteria) this;
    }

    public Criteria andSortIn(List<Long> values) {
      addCriterion("sort in", values, "sort");
      return (Criteria) this;
    }

    public Criteria andSortNotIn(List<Long> values) {
      addCriterion("sort not in", values, "sort");
      return (Criteria) this;
    }

    public Criteria andSortBetween(Long value1, Long value2) {
      addCriterion("sort between", value1, value2, "sort");
      return (Criteria) this;
    }

    public Criteria andSortNotBetween(Long value1, Long value2) {
      addCriterion("sort not between", value1, value2, "sort");
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

    public Criteria andCreateDateIsNull() {
      addCriterion("create_date is null");
      return (Criteria) this;
    }

    public Criteria andCreateDateIsNotNull() {
      addCriterion("create_date is not null");
      return (Criteria) this;
    }

    public Criteria andCreateDateEqualTo(Date value) {
      addCriterion("create_date =", value, "createDate");
      return (Criteria) this;
    }

    public Criteria andCreateDateNotEqualTo(Date value) {
      addCriterion("create_date <>", value, "createDate");
      return (Criteria) this;
    }

    public Criteria andCreateDateGreaterThan(Date value) {
      addCriterion("create_date >", value, "createDate");
      return (Criteria) this;
    }

    public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
      addCriterion("create_date >=", value, "createDate");
      return (Criteria) this;
    }

    public Criteria andCreateDateLessThan(Date value) {
      addCriterion("create_date <", value, "createDate");
      return (Criteria) this;
    }

    public Criteria andCreateDateLessThanOrEqualTo(Date value) {
      addCriterion("create_date <=", value, "createDate");
      return (Criteria) this;
    }

    public Criteria andCreateDateIn(List<Date> values) {
      addCriterion("create_date in", values, "createDate");
      return (Criteria) this;
    }

    public Criteria andCreateDateNotIn(List<Date> values) {
      addCriterion("create_date not in", values, "createDate");
      return (Criteria) this;
    }

    public Criteria andCreateDateBetween(Date value1, Date value2) {
      addCriterion("create_date between", value1, value2, "createDate");
      return (Criteria) this;
    }

    public Criteria andCreateDateNotBetween(Date value1, Date value2) {
      addCriterion("create_date not between", value1, value2, "createDate");
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
   * 只读. t_sys_dictionary
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
     * This class corresponds to the database table t_sys_dictionary
     *
     * @mbg.generated do_not_delete_during_merge 2018-12-26 10:42:06
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }
}