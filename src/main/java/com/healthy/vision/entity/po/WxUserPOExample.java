package com.healthy.vision.entity.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WxUserPOExample implements Serializable {
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
  public WxUserPOExample() {
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
   * 只读. t_wx_user
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

    public Criteria andPublicIdIsNull() {
      addCriterion("public_id is null");
      return (Criteria) this;
    }

    public Criteria andPublicIdIsNotNull() {
      addCriterion("public_id is not null");
      return (Criteria) this;
    }

    public Criteria andPublicIdEqualTo(Integer value) {
      addCriterion("public_id =", value, "publicId");
      return (Criteria) this;
    }

    public Criteria andPublicIdNotEqualTo(Integer value) {
      addCriterion("public_id <>", value, "publicId");
      return (Criteria) this;
    }

    public Criteria andPublicIdGreaterThan(Integer value) {
      addCriterion("public_id >", value, "publicId");
      return (Criteria) this;
    }

    public Criteria andPublicIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("public_id >=", value, "publicId");
      return (Criteria) this;
    }

    public Criteria andPublicIdLessThan(Integer value) {
      addCriterion("public_id <", value, "publicId");
      return (Criteria) this;
    }

    public Criteria andPublicIdLessThanOrEqualTo(Integer value) {
      addCriterion("public_id <=", value, "publicId");
      return (Criteria) this;
    }

    public Criteria andPublicIdIn(List<Integer> values) {
      addCriterion("public_id in", values, "publicId");
      return (Criteria) this;
    }

    public Criteria andPublicIdNotIn(List<Integer> values) {
      addCriterion("public_id not in", values, "publicId");
      return (Criteria) this;
    }

    public Criteria andPublicIdBetween(Integer value1, Integer value2) {
      addCriterion("public_id between", value1, value2, "publicId");
      return (Criteria) this;
    }

    public Criteria andPublicIdNotBetween(Integer value1, Integer value2) {
      addCriterion("public_id not between", value1, value2, "publicId");
      return (Criteria) this;
    }

    public Criteria andAppidIsNull() {
      addCriterion("appid is null");
      return (Criteria) this;
    }

    public Criteria andAppidIsNotNull() {
      addCriterion("appid is not null");
      return (Criteria) this;
    }

    public Criteria andAppidEqualTo(String value) {
      addCriterion("appid =", value, "appid");
      return (Criteria) this;
    }

    public Criteria andAppidNotEqualTo(String value) {
      addCriterion("appid <>", value, "appid");
      return (Criteria) this;
    }

    public Criteria andAppidGreaterThan(String value) {
      addCriterion("appid >", value, "appid");
      return (Criteria) this;
    }

    public Criteria andAppidGreaterThanOrEqualTo(String value) {
      addCriterion("appid >=", value, "appid");
      return (Criteria) this;
    }

    public Criteria andAppidLessThan(String value) {
      addCriterion("appid <", value, "appid");
      return (Criteria) this;
    }

    public Criteria andAppidLessThanOrEqualTo(String value) {
      addCriterion("appid <=", value, "appid");
      return (Criteria) this;
    }

    public Criteria andAppidLike(String value) {
      addCriterion("appid like", value, "appid");
      return (Criteria) this;
    }

    public Criteria andAppidNotLike(String value) {
      addCriterion("appid not like", value, "appid");
      return (Criteria) this;
    }

    public Criteria andAppidIn(List<String> values) {
      addCriterion("appid in", values, "appid");
      return (Criteria) this;
    }

    public Criteria andAppidNotIn(List<String> values) {
      addCriterion("appid not in", values, "appid");
      return (Criteria) this;
    }

    public Criteria andAppidBetween(String value1, String value2) {
      addCriterion("appid between", value1, value2, "appid");
      return (Criteria) this;
    }

    public Criteria andAppidNotBetween(String value1, String value2) {
      addCriterion("appid not between", value1, value2, "appid");
      return (Criteria) this;
    }

    public Criteria andOpenIdIsNull() {
      addCriterion("open_id is null");
      return (Criteria) this;
    }

    public Criteria andOpenIdIsNotNull() {
      addCriterion("open_id is not null");
      return (Criteria) this;
    }

    public Criteria andOpenIdEqualTo(String value) {
      addCriterion("open_id =", value, "openId");
      return (Criteria) this;
    }

    public Criteria andOpenIdNotEqualTo(String value) {
      addCriterion("open_id <>", value, "openId");
      return (Criteria) this;
    }

    public Criteria andOpenIdGreaterThan(String value) {
      addCriterion("open_id >", value, "openId");
      return (Criteria) this;
    }

    public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
      addCriterion("open_id >=", value, "openId");
      return (Criteria) this;
    }

    public Criteria andOpenIdLessThan(String value) {
      addCriterion("open_id <", value, "openId");
      return (Criteria) this;
    }

    public Criteria andOpenIdLessThanOrEqualTo(String value) {
      addCriterion("open_id <=", value, "openId");
      return (Criteria) this;
    }

    public Criteria andOpenIdLike(String value) {
      addCriterion("open_id like", value, "openId");
      return (Criteria) this;
    }

    public Criteria andOpenIdNotLike(String value) {
      addCriterion("open_id not like", value, "openId");
      return (Criteria) this;
    }

    public Criteria andOpenIdIn(List<String> values) {
      addCriterion("open_id in", values, "openId");
      return (Criteria) this;
    }

    public Criteria andOpenIdNotIn(List<String> values) {
      addCriterion("open_id not in", values, "openId");
      return (Criteria) this;
    }

    public Criteria andOpenIdBetween(String value1, String value2) {
      addCriterion("open_id between", value1, value2, "openId");
      return (Criteria) this;
    }

    public Criteria andOpenIdNotBetween(String value1, String value2) {
      addCriterion("open_id not between", value1, value2, "openId");
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

    public Criteria andWxNickIsNull() {
      addCriterion("wx_nick is null");
      return (Criteria) this;
    }

    public Criteria andWxNickIsNotNull() {
      addCriterion("wx_nick is not null");
      return (Criteria) this;
    }

    public Criteria andWxNickEqualTo(String value) {
      addCriterion("wx_nick =", value, "wxNick");
      return (Criteria) this;
    }

    public Criteria andWxNickNotEqualTo(String value) {
      addCriterion("wx_nick <>", value, "wxNick");
      return (Criteria) this;
    }

    public Criteria andWxNickGreaterThan(String value) {
      addCriterion("wx_nick >", value, "wxNick");
      return (Criteria) this;
    }

    public Criteria andWxNickGreaterThanOrEqualTo(String value) {
      addCriterion("wx_nick >=", value, "wxNick");
      return (Criteria) this;
    }

    public Criteria andWxNickLessThan(String value) {
      addCriterion("wx_nick <", value, "wxNick");
      return (Criteria) this;
    }

    public Criteria andWxNickLessThanOrEqualTo(String value) {
      addCriterion("wx_nick <=", value, "wxNick");
      return (Criteria) this;
    }

    public Criteria andWxNickLike(String value) {
      addCriterion("wx_nick like", value, "wxNick");
      return (Criteria) this;
    }

    public Criteria andWxNickNotLike(String value) {
      addCriterion("wx_nick not like", value, "wxNick");
      return (Criteria) this;
    }

    public Criteria andWxNickIn(List<String> values) {
      addCriterion("wx_nick in", values, "wxNick");
      return (Criteria) this;
    }

    public Criteria andWxNickNotIn(List<String> values) {
      addCriterion("wx_nick not in", values, "wxNick");
      return (Criteria) this;
    }

    public Criteria andWxNickBetween(String value1, String value2) {
      addCriterion("wx_nick between", value1, value2, "wxNick");
      return (Criteria) this;
    }

    public Criteria andWxNickNotBetween(String value1, String value2) {
      addCriterion("wx_nick not between", value1, value2, "wxNick");
      return (Criteria) this;
    }

    public Criteria andHeadPortraitsIsNull() {
      addCriterion("head_portraits is null");
      return (Criteria) this;
    }

    public Criteria andHeadPortraitsIsNotNull() {
      addCriterion("head_portraits is not null");
      return (Criteria) this;
    }

    public Criteria andHeadPortraitsEqualTo(String value) {
      addCriterion("head_portraits =", value, "headPortraits");
      return (Criteria) this;
    }

    public Criteria andHeadPortraitsNotEqualTo(String value) {
      addCriterion("head_portraits <>", value, "headPortraits");
      return (Criteria) this;
    }

    public Criteria andHeadPortraitsGreaterThan(String value) {
      addCriterion("head_portraits >", value, "headPortraits");
      return (Criteria) this;
    }

    public Criteria andHeadPortraitsGreaterThanOrEqualTo(String value) {
      addCriterion("head_portraits >=", value, "headPortraits");
      return (Criteria) this;
    }

    public Criteria andHeadPortraitsLessThan(String value) {
      addCriterion("head_portraits <", value, "headPortraits");
      return (Criteria) this;
    }

    public Criteria andHeadPortraitsLessThanOrEqualTo(String value) {
      addCriterion("head_portraits <=", value, "headPortraits");
      return (Criteria) this;
    }

    public Criteria andHeadPortraitsLike(String value) {
      addCriterion("head_portraits like", value, "headPortraits");
      return (Criteria) this;
    }

    public Criteria andHeadPortraitsNotLike(String value) {
      addCriterion("head_portraits not like", value, "headPortraits");
      return (Criteria) this;
    }

    public Criteria andHeadPortraitsIn(List<String> values) {
      addCriterion("head_portraits in", values, "headPortraits");
      return (Criteria) this;
    }

    public Criteria andHeadPortraitsNotIn(List<String> values) {
      addCriterion("head_portraits not in", values, "headPortraits");
      return (Criteria) this;
    }

    public Criteria andHeadPortraitsBetween(String value1, String value2) {
      addCriterion("head_portraits between", value1, value2, "headPortraits");
      return (Criteria) this;
    }

    public Criteria andHeadPortraitsNotBetween(String value1, String value2) {
      addCriterion("head_portraits not between", value1, value2, "headPortraits");
      return (Criteria) this;
    }

    public Criteria andGenderIsNull() {
      addCriterion("gender is null");
      return (Criteria) this;
    }

    public Criteria andGenderIsNotNull() {
      addCriterion("gender is not null");
      return (Criteria) this;
    }

    public Criteria andGenderEqualTo(String value) {
      addCriterion("gender =", value, "gender");
      return (Criteria) this;
    }

    public Criteria andGenderNotEqualTo(String value) {
      addCriterion("gender <>", value, "gender");
      return (Criteria) this;
    }

    public Criteria andGenderGreaterThan(String value) {
      addCriterion("gender >", value, "gender");
      return (Criteria) this;
    }

    public Criteria andGenderGreaterThanOrEqualTo(String value) {
      addCriterion("gender >=", value, "gender");
      return (Criteria) this;
    }

    public Criteria andGenderLessThan(String value) {
      addCriterion("gender <", value, "gender");
      return (Criteria) this;
    }

    public Criteria andGenderLessThanOrEqualTo(String value) {
      addCriterion("gender <=", value, "gender");
      return (Criteria) this;
    }

    public Criteria andGenderLike(String value) {
      addCriterion("gender like", value, "gender");
      return (Criteria) this;
    }

    public Criteria andGenderNotLike(String value) {
      addCriterion("gender not like", value, "gender");
      return (Criteria) this;
    }

    public Criteria andGenderIn(List<String> values) {
      addCriterion("gender in", values, "gender");
      return (Criteria) this;
    }

    public Criteria andGenderNotIn(List<String> values) {
      addCriterion("gender not in", values, "gender");
      return (Criteria) this;
    }

    public Criteria andGenderBetween(String value1, String value2) {
      addCriterion("gender between", value1, value2, "gender");
      return (Criteria) this;
    }

    public Criteria andGenderNotBetween(String value1, String value2) {
      addCriterion("gender not between", value1, value2, "gender");
      return (Criteria) this;
    }

    public Criteria andAgeIsNull() {
      addCriterion("age is null");
      return (Criteria) this;
    }

    public Criteria andAgeIsNotNull() {
      addCriterion("age is not null");
      return (Criteria) this;
    }

    public Criteria andAgeEqualTo(Integer value) {
      addCriterion("age =", value, "age");
      return (Criteria) this;
    }

    public Criteria andAgeNotEqualTo(Integer value) {
      addCriterion("age <>", value, "age");
      return (Criteria) this;
    }

    public Criteria andAgeGreaterThan(Integer value) {
      addCriterion("age >", value, "age");
      return (Criteria) this;
    }

    public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
      addCriterion("age >=", value, "age");
      return (Criteria) this;
    }

    public Criteria andAgeLessThan(Integer value) {
      addCriterion("age <", value, "age");
      return (Criteria) this;
    }

    public Criteria andAgeLessThanOrEqualTo(Integer value) {
      addCriterion("age <=", value, "age");
      return (Criteria) this;
    }

    public Criteria andAgeIn(List<Integer> values) {
      addCriterion("age in", values, "age");
      return (Criteria) this;
    }

    public Criteria andAgeNotIn(List<Integer> values) {
      addCriterion("age not in", values, "age");
      return (Criteria) this;
    }

    public Criteria andAgeBetween(Integer value1, Integer value2) {
      addCriterion("age between", value1, value2, "age");
      return (Criteria) this;
    }

    public Criteria andAgeNotBetween(Integer value1, Integer value2) {
      addCriterion("age not between", value1, value2, "age");
      return (Criteria) this;
    }

    public Criteria andBirthDayIsNull() {
      addCriterion("birth_day is null");
      return (Criteria) this;
    }

    public Criteria andBirthDayIsNotNull() {
      addCriterion("birth_day is not null");
      return (Criteria) this;
    }

    public Criteria andBirthDayEqualTo(Date value) {
      addCriterion("birth_day =", value, "birthDay");
      return (Criteria) this;
    }

    public Criteria andBirthDayNotEqualTo(Date value) {
      addCriterion("birth_day <>", value, "birthDay");
      return (Criteria) this;
    }

    public Criteria andBirthDayGreaterThan(Date value) {
      addCriterion("birth_day >", value, "birthDay");
      return (Criteria) this;
    }

    public Criteria andBirthDayGreaterThanOrEqualTo(Date value) {
      addCriterion("birth_day >=", value, "birthDay");
      return (Criteria) this;
    }

    public Criteria andBirthDayLessThan(Date value) {
      addCriterion("birth_day <", value, "birthDay");
      return (Criteria) this;
    }

    public Criteria andBirthDayLessThanOrEqualTo(Date value) {
      addCriterion("birth_day <=", value, "birthDay");
      return (Criteria) this;
    }

    public Criteria andBirthDayIn(List<Date> values) {
      addCriterion("birth_day in", values, "birthDay");
      return (Criteria) this;
    }

    public Criteria andBirthDayNotIn(List<Date> values) {
      addCriterion("birth_day not in", values, "birthDay");
      return (Criteria) this;
    }

    public Criteria andBirthDayBetween(Date value1, Date value2) {
      addCriterion("birth_day between", value1, value2, "birthDay");
      return (Criteria) this;
    }

    public Criteria andBirthDayNotBetween(Date value1, Date value2) {
      addCriterion("birth_day not between", value1, value2, "birthDay");
      return (Criteria) this;
    }

    public Criteria andIdNemberIsNull() {
      addCriterion("id_nember is null");
      return (Criteria) this;
    }

    public Criteria andIdNemberIsNotNull() {
      addCriterion("id_nember is not null");
      return (Criteria) this;
    }

    public Criteria andIdNemberEqualTo(String value) {
      addCriterion("id_nember =", value, "idNember");
      return (Criteria) this;
    }

    public Criteria andIdNemberNotEqualTo(String value) {
      addCriterion("id_nember <>", value, "idNember");
      return (Criteria) this;
    }

    public Criteria andIdNemberGreaterThan(String value) {
      addCriterion("id_nember >", value, "idNember");
      return (Criteria) this;
    }

    public Criteria andIdNemberGreaterThanOrEqualTo(String value) {
      addCriterion("id_nember >=", value, "idNember");
      return (Criteria) this;
    }

    public Criteria andIdNemberLessThan(String value) {
      addCriterion("id_nember <", value, "idNember");
      return (Criteria) this;
    }

    public Criteria andIdNemberLessThanOrEqualTo(String value) {
      addCriterion("id_nember <=", value, "idNember");
      return (Criteria) this;
    }

    public Criteria andIdNemberLike(String value) {
      addCriterion("id_nember like", value, "idNember");
      return (Criteria) this;
    }

    public Criteria andIdNemberNotLike(String value) {
      addCriterion("id_nember not like", value, "idNember");
      return (Criteria) this;
    }

    public Criteria andIdNemberIn(List<String> values) {
      addCriterion("id_nember in", values, "idNember");
      return (Criteria) this;
    }

    public Criteria andIdNemberNotIn(List<String> values) {
      addCriterion("id_nember not in", values, "idNember");
      return (Criteria) this;
    }

    public Criteria andIdNemberBetween(String value1, String value2) {
      addCriterion("id_nember between", value1, value2, "idNember");
      return (Criteria) this;
    }

    public Criteria andIdNemberNotBetween(String value1, String value2) {
      addCriterion("id_nember not between", value1, value2, "idNember");
      return (Criteria) this;
    }

    public Criteria andProvinceIsNull() {
      addCriterion("province is null");
      return (Criteria) this;
    }

    public Criteria andProvinceIsNotNull() {
      addCriterion("province is not null");
      return (Criteria) this;
    }

    public Criteria andProvinceEqualTo(String value) {
      addCriterion("province =", value, "province");
      return (Criteria) this;
    }

    public Criteria andProvinceNotEqualTo(String value) {
      addCriterion("province <>", value, "province");
      return (Criteria) this;
    }

    public Criteria andProvinceGreaterThan(String value) {
      addCriterion("province >", value, "province");
      return (Criteria) this;
    }

    public Criteria andProvinceGreaterThanOrEqualTo(String value) {
      addCriterion("province >=", value, "province");
      return (Criteria) this;
    }

    public Criteria andProvinceLessThan(String value) {
      addCriterion("province <", value, "province");
      return (Criteria) this;
    }

    public Criteria andProvinceLessThanOrEqualTo(String value) {
      addCriterion("province <=", value, "province");
      return (Criteria) this;
    }

    public Criteria andProvinceLike(String value) {
      addCriterion("province like", value, "province");
      return (Criteria) this;
    }

    public Criteria andProvinceNotLike(String value) {
      addCriterion("province not like", value, "province");
      return (Criteria) this;
    }

    public Criteria andProvinceIn(List<String> values) {
      addCriterion("province in", values, "province");
      return (Criteria) this;
    }

    public Criteria andProvinceNotIn(List<String> values) {
      addCriterion("province not in", values, "province");
      return (Criteria) this;
    }

    public Criteria andProvinceBetween(String value1, String value2) {
      addCriterion("province between", value1, value2, "province");
      return (Criteria) this;
    }

    public Criteria andProvinceNotBetween(String value1, String value2) {
      addCriterion("province not between", value1, value2, "province");
      return (Criteria) this;
    }

    public Criteria andCityIsNull() {
      addCriterion("city is null");
      return (Criteria) this;
    }

    public Criteria andCityIsNotNull() {
      addCriterion("city is not null");
      return (Criteria) this;
    }

    public Criteria andCityEqualTo(String value) {
      addCriterion("city =", value, "city");
      return (Criteria) this;
    }

    public Criteria andCityNotEqualTo(String value) {
      addCriterion("city <>", value, "city");
      return (Criteria) this;
    }

    public Criteria andCityGreaterThan(String value) {
      addCriterion("city >", value, "city");
      return (Criteria) this;
    }

    public Criteria andCityGreaterThanOrEqualTo(String value) {
      addCriterion("city >=", value, "city");
      return (Criteria) this;
    }

    public Criteria andCityLessThan(String value) {
      addCriterion("city <", value, "city");
      return (Criteria) this;
    }

    public Criteria andCityLessThanOrEqualTo(String value) {
      addCriterion("city <=", value, "city");
      return (Criteria) this;
    }

    public Criteria andCityLike(String value) {
      addCriterion("city like", value, "city");
      return (Criteria) this;
    }

    public Criteria andCityNotLike(String value) {
      addCriterion("city not like", value, "city");
      return (Criteria) this;
    }

    public Criteria andCityIn(List<String> values) {
      addCriterion("city in", values, "city");
      return (Criteria) this;
    }

    public Criteria andCityNotIn(List<String> values) {
      addCriterion("city not in", values, "city");
      return (Criteria) this;
    }

    public Criteria andCityBetween(String value1, String value2) {
      addCriterion("city between", value1, value2, "city");
      return (Criteria) this;
    }

    public Criteria andCityNotBetween(String value1, String value2) {
      addCriterion("city not between", value1, value2, "city");
      return (Criteria) this;
    }

    public Criteria andCountyIsNull() {
      addCriterion("county is null");
      return (Criteria) this;
    }

    public Criteria andCountyIsNotNull() {
      addCriterion("county is not null");
      return (Criteria) this;
    }

    public Criteria andCountyEqualTo(String value) {
      addCriterion("county =", value, "county");
      return (Criteria) this;
    }

    public Criteria andCountyNotEqualTo(String value) {
      addCriterion("county <>", value, "county");
      return (Criteria) this;
    }

    public Criteria andCountyGreaterThan(String value) {
      addCriterion("county >", value, "county");
      return (Criteria) this;
    }

    public Criteria andCountyGreaterThanOrEqualTo(String value) {
      addCriterion("county >=", value, "county");
      return (Criteria) this;
    }

    public Criteria andCountyLessThan(String value) {
      addCriterion("county <", value, "county");
      return (Criteria) this;
    }

    public Criteria andCountyLessThanOrEqualTo(String value) {
      addCriterion("county <=", value, "county");
      return (Criteria) this;
    }

    public Criteria andCountyLike(String value) {
      addCriterion("county like", value, "county");
      return (Criteria) this;
    }

    public Criteria andCountyNotLike(String value) {
      addCriterion("county not like", value, "county");
      return (Criteria) this;
    }

    public Criteria andCountyIn(List<String> values) {
      addCriterion("county in", values, "county");
      return (Criteria) this;
    }

    public Criteria andCountyNotIn(List<String> values) {
      addCriterion("county not in", values, "county");
      return (Criteria) this;
    }

    public Criteria andCountyBetween(String value1, String value2) {
      addCriterion("county between", value1, value2, "county");
      return (Criteria) this;
    }

    public Criteria andCountyNotBetween(String value1, String value2) {
      addCriterion("county not between", value1, value2, "county");
      return (Criteria) this;
    }

    public Criteria andDetailAddressIsNull() {
      addCriterion("detail_address is null");
      return (Criteria) this;
    }

    public Criteria andDetailAddressIsNotNull() {
      addCriterion("detail_address is not null");
      return (Criteria) this;
    }

    public Criteria andDetailAddressEqualTo(String value) {
      addCriterion("detail_address =", value, "detailAddress");
      return (Criteria) this;
    }

    public Criteria andDetailAddressNotEqualTo(String value) {
      addCriterion("detail_address <>", value, "detailAddress");
      return (Criteria) this;
    }

    public Criteria andDetailAddressGreaterThan(String value) {
      addCriterion("detail_address >", value, "detailAddress");
      return (Criteria) this;
    }

    public Criteria andDetailAddressGreaterThanOrEqualTo(String value) {
      addCriterion("detail_address >=", value, "detailAddress");
      return (Criteria) this;
    }

    public Criteria andDetailAddressLessThan(String value) {
      addCriterion("detail_address <", value, "detailAddress");
      return (Criteria) this;
    }

    public Criteria andDetailAddressLessThanOrEqualTo(String value) {
      addCriterion("detail_address <=", value, "detailAddress");
      return (Criteria) this;
    }

    public Criteria andDetailAddressLike(String value) {
      addCriterion("detail_address like", value, "detailAddress");
      return (Criteria) this;
    }

    public Criteria andDetailAddressNotLike(String value) {
      addCriterion("detail_address not like", value, "detailAddress");
      return (Criteria) this;
    }

    public Criteria andDetailAddressIn(List<String> values) {
      addCriterion("detail_address in", values, "detailAddress");
      return (Criteria) this;
    }

    public Criteria andDetailAddressNotIn(List<String> values) {
      addCriterion("detail_address not in", values, "detailAddress");
      return (Criteria) this;
    }

    public Criteria andDetailAddressBetween(String value1, String value2) {
      addCriterion("detail_address between", value1, value2, "detailAddress");
      return (Criteria) this;
    }

    public Criteria andDetailAddressNotBetween(String value1, String value2) {
      addCriterion("detail_address not between", value1, value2, "detailAddress");
      return (Criteria) this;
    }

    public Criteria andGuardianNameIsNull() {
      addCriterion("guardian_name is null");
      return (Criteria) this;
    }

    public Criteria andGuardianNameIsNotNull() {
      addCriterion("guardian_name is not null");
      return (Criteria) this;
    }

    public Criteria andGuardianNameEqualTo(String value) {
      addCriterion("guardian_name =", value, "guardianName");
      return (Criteria) this;
    }

    public Criteria andGuardianNameNotEqualTo(String value) {
      addCriterion("guardian_name <>", value, "guardianName");
      return (Criteria) this;
    }

    public Criteria andGuardianNameGreaterThan(String value) {
      addCriterion("guardian_name >", value, "guardianName");
      return (Criteria) this;
    }

    public Criteria andGuardianNameGreaterThanOrEqualTo(String value) {
      addCriterion("guardian_name >=", value, "guardianName");
      return (Criteria) this;
    }

    public Criteria andGuardianNameLessThan(String value) {
      addCriterion("guardian_name <", value, "guardianName");
      return (Criteria) this;
    }

    public Criteria andGuardianNameLessThanOrEqualTo(String value) {
      addCriterion("guardian_name <=", value, "guardianName");
      return (Criteria) this;
    }

    public Criteria andGuardianNameLike(String value) {
      addCriterion("guardian_name like", value, "guardianName");
      return (Criteria) this;
    }

    public Criteria andGuardianNameNotLike(String value) {
      addCriterion("guardian_name not like", value, "guardianName");
      return (Criteria) this;
    }

    public Criteria andGuardianNameIn(List<String> values) {
      addCriterion("guardian_name in", values, "guardianName");
      return (Criteria) this;
    }

    public Criteria andGuardianNameNotIn(List<String> values) {
      addCriterion("guardian_name not in", values, "guardianName");
      return (Criteria) this;
    }

    public Criteria andGuardianNameBetween(String value1, String value2) {
      addCriterion("guardian_name between", value1, value2, "guardianName");
      return (Criteria) this;
    }

    public Criteria andGuardianNameNotBetween(String value1, String value2) {
      addCriterion("guardian_name not between", value1, value2, "guardianName");
      return (Criteria) this;
    }

    public Criteria andGuardianRelationIsNull() {
      addCriterion("guardian_relation is null");
      return (Criteria) this;
    }

    public Criteria andGuardianRelationIsNotNull() {
      addCriterion("guardian_relation is not null");
      return (Criteria) this;
    }

    public Criteria andGuardianRelationEqualTo(String value) {
      addCriterion("guardian_relation =", value, "guardianRelation");
      return (Criteria) this;
    }

    public Criteria andGuardianRelationNotEqualTo(String value) {
      addCriterion("guardian_relation <>", value, "guardianRelation");
      return (Criteria) this;
    }

    public Criteria andGuardianRelationGreaterThan(String value) {
      addCriterion("guardian_relation >", value, "guardianRelation");
      return (Criteria) this;
    }

    public Criteria andGuardianRelationGreaterThanOrEqualTo(String value) {
      addCriterion("guardian_relation >=", value, "guardianRelation");
      return (Criteria) this;
    }

    public Criteria andGuardianRelationLessThan(String value) {
      addCriterion("guardian_relation <", value, "guardianRelation");
      return (Criteria) this;
    }

    public Criteria andGuardianRelationLessThanOrEqualTo(String value) {
      addCriterion("guardian_relation <=", value, "guardianRelation");
      return (Criteria) this;
    }

    public Criteria andGuardianRelationLike(String value) {
      addCriterion("guardian_relation like", value, "guardianRelation");
      return (Criteria) this;
    }

    public Criteria andGuardianRelationNotLike(String value) {
      addCriterion("guardian_relation not like", value, "guardianRelation");
      return (Criteria) this;
    }

    public Criteria andGuardianRelationIn(List<String> values) {
      addCriterion("guardian_relation in", values, "guardianRelation");
      return (Criteria) this;
    }

    public Criteria andGuardianRelationNotIn(List<String> values) {
      addCriterion("guardian_relation not in", values, "guardianRelation");
      return (Criteria) this;
    }

    public Criteria andGuardianRelationBetween(String value1, String value2) {
      addCriterion("guardian_relation between", value1, value2, "guardianRelation");
      return (Criteria) this;
    }

    public Criteria andGuardianRelationNotBetween(String value1, String value2) {
      addCriterion("guardian_relation not between", value1, value2, "guardianRelation");
      return (Criteria) this;
    }

    public Criteria andGuardianPhoneIsNull() {
      addCriterion("guardian_phone is null");
      return (Criteria) this;
    }

    public Criteria andGuardianPhoneIsNotNull() {
      addCriterion("guardian_phone is not null");
      return (Criteria) this;
    }

    public Criteria andGuardianPhoneEqualTo(String value) {
      addCriterion("guardian_phone =", value, "guardianPhone");
      return (Criteria) this;
    }

    public Criteria andGuardianPhoneNotEqualTo(String value) {
      addCriterion("guardian_phone <>", value, "guardianPhone");
      return (Criteria) this;
    }

    public Criteria andGuardianPhoneGreaterThan(String value) {
      addCriterion("guardian_phone >", value, "guardianPhone");
      return (Criteria) this;
    }

    public Criteria andGuardianPhoneGreaterThanOrEqualTo(String value) {
      addCriterion("guardian_phone >=", value, "guardianPhone");
      return (Criteria) this;
    }

    public Criteria andGuardianPhoneLessThan(String value) {
      addCriterion("guardian_phone <", value, "guardianPhone");
      return (Criteria) this;
    }

    public Criteria andGuardianPhoneLessThanOrEqualTo(String value) {
      addCriterion("guardian_phone <=", value, "guardianPhone");
      return (Criteria) this;
    }

    public Criteria andGuardianPhoneLike(String value) {
      addCriterion("guardian_phone like", value, "guardianPhone");
      return (Criteria) this;
    }

    public Criteria andGuardianPhoneNotLike(String value) {
      addCriterion("guardian_phone not like", value, "guardianPhone");
      return (Criteria) this;
    }

    public Criteria andGuardianPhoneIn(List<String> values) {
      addCriterion("guardian_phone in", values, "guardianPhone");
      return (Criteria) this;
    }

    public Criteria andGuardianPhoneNotIn(List<String> values) {
      addCriterion("guardian_phone not in", values, "guardianPhone");
      return (Criteria) this;
    }

    public Criteria andGuardianPhoneBetween(String value1, String value2) {
      addCriterion("guardian_phone between", value1, value2, "guardianPhone");
      return (Criteria) this;
    }

    public Criteria andGuardianPhoneNotBetween(String value1, String value2) {
      addCriterion("guardian_phone not between", value1, value2, "guardianPhone");
      return (Criteria) this;
    }

    public Criteria andGuardianWechatIsNull() {
      addCriterion("guardian_wechat is null");
      return (Criteria) this;
    }

    public Criteria andGuardianWechatIsNotNull() {
      addCriterion("guardian_wechat is not null");
      return (Criteria) this;
    }

    public Criteria andGuardianWechatEqualTo(String value) {
      addCriterion("guardian_wechat =", value, "guardianWechat");
      return (Criteria) this;
    }

    public Criteria andGuardianWechatNotEqualTo(String value) {
      addCriterion("guardian_wechat <>", value, "guardianWechat");
      return (Criteria) this;
    }

    public Criteria andGuardianWechatGreaterThan(String value) {
      addCriterion("guardian_wechat >", value, "guardianWechat");
      return (Criteria) this;
    }

    public Criteria andGuardianWechatGreaterThanOrEqualTo(String value) {
      addCriterion("guardian_wechat >=", value, "guardianWechat");
      return (Criteria) this;
    }

    public Criteria andGuardianWechatLessThan(String value) {
      addCriterion("guardian_wechat <", value, "guardianWechat");
      return (Criteria) this;
    }

    public Criteria andGuardianWechatLessThanOrEqualTo(String value) {
      addCriterion("guardian_wechat <=", value, "guardianWechat");
      return (Criteria) this;
    }

    public Criteria andGuardianWechatLike(String value) {
      addCriterion("guardian_wechat like", value, "guardianWechat");
      return (Criteria) this;
    }

    public Criteria andGuardianWechatNotLike(String value) {
      addCriterion("guardian_wechat not like", value, "guardianWechat");
      return (Criteria) this;
    }

    public Criteria andGuardianWechatIn(List<String> values) {
      addCriterion("guardian_wechat in", values, "guardianWechat");
      return (Criteria) this;
    }

    public Criteria andGuardianWechatNotIn(List<String> values) {
      addCriterion("guardian_wechat not in", values, "guardianWechat");
      return (Criteria) this;
    }

    public Criteria andGuardianWechatBetween(String value1, String value2) {
      addCriterion("guardian_wechat between", value1, value2, "guardianWechat");
      return (Criteria) this;
    }

    public Criteria andGuardianWechatNotBetween(String value1, String value2) {
      addCriterion("guardian_wechat not between", value1, value2, "guardianWechat");
      return (Criteria) this;
    }

    public Criteria andQrCodeIsNull() {
      addCriterion("qr_code is null");
      return (Criteria) this;
    }

    public Criteria andQrCodeIsNotNull() {
      addCriterion("qr_code is not null");
      return (Criteria) this;
    }

    public Criteria andQrCodeEqualTo(String value) {
      addCriterion("qr_code =", value, "qrCode");
      return (Criteria) this;
    }

    public Criteria andQrCodeNotEqualTo(String value) {
      addCriterion("qr_code <>", value, "qrCode");
      return (Criteria) this;
    }

    public Criteria andQrCodeGreaterThan(String value) {
      addCriterion("qr_code >", value, "qrCode");
      return (Criteria) this;
    }

    public Criteria andQrCodeGreaterThanOrEqualTo(String value) {
      addCriterion("qr_code >=", value, "qrCode");
      return (Criteria) this;
    }

    public Criteria andQrCodeLessThan(String value) {
      addCriterion("qr_code <", value, "qrCode");
      return (Criteria) this;
    }

    public Criteria andQrCodeLessThanOrEqualTo(String value) {
      addCriterion("qr_code <=", value, "qrCode");
      return (Criteria) this;
    }

    public Criteria andQrCodeLike(String value) {
      addCriterion("qr_code like", value, "qrCode");
      return (Criteria) this;
    }

    public Criteria andQrCodeNotLike(String value) {
      addCriterion("qr_code not like", value, "qrCode");
      return (Criteria) this;
    }

    public Criteria andQrCodeIn(List<String> values) {
      addCriterion("qr_code in", values, "qrCode");
      return (Criteria) this;
    }

    public Criteria andQrCodeNotIn(List<String> values) {
      addCriterion("qr_code not in", values, "qrCode");
      return (Criteria) this;
    }

    public Criteria andQrCodeBetween(String value1, String value2) {
      addCriterion("qr_code between", value1, value2, "qrCode");
      return (Criteria) this;
    }

    public Criteria andQrCodeNotBetween(String value1, String value2) {
      addCriterion("qr_code not between", value1, value2, "qrCode");
      return (Criteria) this;
    }

    public Criteria andIsRegisterIsNull() {
      addCriterion("is_register is null");
      return (Criteria) this;
    }

    public Criteria andIsRegisterIsNotNull() {
      addCriterion("is_register is not null");
      return (Criteria) this;
    }

    public Criteria andIsRegisterEqualTo(Boolean value) {
      addCriterion("is_register =", value, "isRegister");
      return (Criteria) this;
    }

    public Criteria andIsRegisterNotEqualTo(Boolean value) {
      addCriterion("is_register <>", value, "isRegister");
      return (Criteria) this;
    }

    public Criteria andIsRegisterGreaterThan(Boolean value) {
      addCriterion("is_register >", value, "isRegister");
      return (Criteria) this;
    }

    public Criteria andIsRegisterGreaterThanOrEqualTo(Boolean value) {
      addCriterion("is_register >=", value, "isRegister");
      return (Criteria) this;
    }

    public Criteria andIsRegisterLessThan(Boolean value) {
      addCriterion("is_register <", value, "isRegister");
      return (Criteria) this;
    }

    public Criteria andIsRegisterLessThanOrEqualTo(Boolean value) {
      addCriterion("is_register <=", value, "isRegister");
      return (Criteria) this;
    }

    public Criteria andIsRegisterIn(List<Boolean> values) {
      addCriterion("is_register in", values, "isRegister");
      return (Criteria) this;
    }

    public Criteria andIsRegisterNotIn(List<Boolean> values) {
      addCriterion("is_register not in", values, "isRegister");
      return (Criteria) this;
    }

    public Criteria andIsRegisterBetween(Boolean value1, Boolean value2) {
      addCriterion("is_register between", value1, value2, "isRegister");
      return (Criteria) this;
    }

    public Criteria andIsRegisterNotBetween(Boolean value1, Boolean value2) {
      addCriterion("is_register not between", value1, value2, "isRegister");
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

    public Criteria andCreateUserIdEqualTo(Long value) {
      addCriterion("create_user_id =", value, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdNotEqualTo(Long value) {
      addCriterion("create_user_id <>", value, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdGreaterThan(Long value) {
      addCriterion("create_user_id >", value, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdGreaterThanOrEqualTo(Long value) {
      addCriterion("create_user_id >=", value, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdLessThan(Long value) {
      addCriterion("create_user_id <", value, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdLessThanOrEqualTo(Long value) {
      addCriterion("create_user_id <=", value, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdIn(List<Long> values) {
      addCriterion("create_user_id in", values, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdNotIn(List<Long> values) {
      addCriterion("create_user_id not in", values, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdBetween(Long value1, Long value2) {
      addCriterion("create_user_id between", value1, value2, "createUserId");
      return (Criteria) this;
    }

    public Criteria andCreateUserIdNotBetween(Long value1, Long value2) {
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

    public Criteria andModifiedUserIdEqualTo(Long value) {
      addCriterion("modified_user_id =", value, "modifiedUserId");
      return (Criteria) this;
    }

    public Criteria andModifiedUserIdNotEqualTo(Long value) {
      addCriterion("modified_user_id <>", value, "modifiedUserId");
      return (Criteria) this;
    }

    public Criteria andModifiedUserIdGreaterThan(Long value) {
      addCriterion("modified_user_id >", value, "modifiedUserId");
      return (Criteria) this;
    }

    public Criteria andModifiedUserIdGreaterThanOrEqualTo(Long value) {
      addCriterion("modified_user_id >=", value, "modifiedUserId");
      return (Criteria) this;
    }

    public Criteria andModifiedUserIdLessThan(Long value) {
      addCriterion("modified_user_id <", value, "modifiedUserId");
      return (Criteria) this;
    }

    public Criteria andModifiedUserIdLessThanOrEqualTo(Long value) {
      addCriterion("modified_user_id <=", value, "modifiedUserId");
      return (Criteria) this;
    }

    public Criteria andModifiedUserIdIn(List<Long> values) {
      addCriterion("modified_user_id in", values, "modifiedUserId");
      return (Criteria) this;
    }

    public Criteria andModifiedUserIdNotIn(List<Long> values) {
      addCriterion("modified_user_id not in", values, "modifiedUserId");
      return (Criteria) this;
    }

    public Criteria andModifiedUserIdBetween(Long value1, Long value2) {
      addCriterion("modified_user_id between", value1, value2, "modifiedUserId");
      return (Criteria) this;
    }

    public Criteria andModifiedUserIdNotBetween(Long value1, Long value2) {
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

    public Criteria andVersionIsNull() {
      addCriterion("version is null");
      return (Criteria) this;
    }

    public Criteria andVersionIsNotNull() {
      addCriterion("version is not null");
      return (Criteria) this;
    }

    public Criteria andVersionEqualTo(Integer value) {
      addCriterion("version =", value, "version");
      return (Criteria) this;
    }

    public Criteria andVersionNotEqualTo(Integer value) {
      addCriterion("version <>", value, "version");
      return (Criteria) this;
    }

    public Criteria andVersionGreaterThan(Integer value) {
      addCriterion("version >", value, "version");
      return (Criteria) this;
    }

    public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
      addCriterion("version >=", value, "version");
      return (Criteria) this;
    }

    public Criteria andVersionLessThan(Integer value) {
      addCriterion("version <", value, "version");
      return (Criteria) this;
    }

    public Criteria andVersionLessThanOrEqualTo(Integer value) {
      addCriterion("version <=", value, "version");
      return (Criteria) this;
    }

    public Criteria andVersionIn(List<Integer> values) {
      addCriterion("version in", values, "version");
      return (Criteria) this;
    }

    public Criteria andVersionNotIn(List<Integer> values) {
      addCriterion("version not in", values, "version");
      return (Criteria) this;
    }

    public Criteria andVersionBetween(Integer value1, Integer value2) {
      addCriterion("version between", value1, value2, "version");
      return (Criteria) this;
    }

    public Criteria andVersionNotBetween(Integer value1, Integer value2) {
      addCriterion("version not between", value1, value2, "version");
      return (Criteria) this;
    }
  }

  /**
   * 只读. t_wx_user
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
     * This class corresponds to the database table t_wx_user
     *
     * @mbg.generated do_not_delete_during_merge 2018-12-26 10:42:06
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }
}