package com.healthy.vision.entity.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysMenuPOExample implements Serializable {
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
  public SysMenuPOExample() {
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
   * 只读. t_sys_menu
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

    public Criteria andSysMenuIdIsNull() {
      addCriterion("sys_menu_id is null");
      return (Criteria) this;
    }

    public Criteria andSysMenuIdIsNotNull() {
      addCriterion("sys_menu_id is not null");
      return (Criteria) this;
    }

    public Criteria andSysMenuIdEqualTo(Integer value) {
      addCriterion("sys_menu_id =", value, "sysMenuId");
      return (Criteria) this;
    }

    public Criteria andSysMenuIdNotEqualTo(Integer value) {
      addCriterion("sys_menu_id <>", value, "sysMenuId");
      return (Criteria) this;
    }

    public Criteria andSysMenuIdGreaterThan(Integer value) {
      addCriterion("sys_menu_id >", value, "sysMenuId");
      return (Criteria) this;
    }

    public Criteria andSysMenuIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("sys_menu_id >=", value, "sysMenuId");
      return (Criteria) this;
    }

    public Criteria andSysMenuIdLessThan(Integer value) {
      addCriterion("sys_menu_id <", value, "sysMenuId");
      return (Criteria) this;
    }

    public Criteria andSysMenuIdLessThanOrEqualTo(Integer value) {
      addCriterion("sys_menu_id <=", value, "sysMenuId");
      return (Criteria) this;
    }

    public Criteria andSysMenuIdIn(List<Integer> values) {
      addCriterion("sys_menu_id in", values, "sysMenuId");
      return (Criteria) this;
    }

    public Criteria andSysMenuIdNotIn(List<Integer> values) {
      addCriterion("sys_menu_id not in", values, "sysMenuId");
      return (Criteria) this;
    }

    public Criteria andSysMenuIdBetween(Integer value1, Integer value2) {
      addCriterion("sys_menu_id between", value1, value2, "sysMenuId");
      return (Criteria) this;
    }

    public Criteria andSysMenuIdNotBetween(Integer value1, Integer value2) {
      addCriterion("sys_menu_id not between", value1, value2, "sysMenuId");
      return (Criteria) this;
    }

    public Criteria andMenuCodeIsNull() {
      addCriterion("menu_code is null");
      return (Criteria) this;
    }

    public Criteria andMenuCodeIsNotNull() {
      addCriterion("menu_code is not null");
      return (Criteria) this;
    }

    public Criteria andMenuCodeEqualTo(String value) {
      addCriterion("menu_code =", value, "menuCode");
      return (Criteria) this;
    }

    public Criteria andMenuCodeNotEqualTo(String value) {
      addCriterion("menu_code <>", value, "menuCode");
      return (Criteria) this;
    }

    public Criteria andMenuCodeGreaterThan(String value) {
      addCriterion("menu_code >", value, "menuCode");
      return (Criteria) this;
    }

    public Criteria andMenuCodeGreaterThanOrEqualTo(String value) {
      addCriterion("menu_code >=", value, "menuCode");
      return (Criteria) this;
    }

    public Criteria andMenuCodeLessThan(String value) {
      addCriterion("menu_code <", value, "menuCode");
      return (Criteria) this;
    }

    public Criteria andMenuCodeLessThanOrEqualTo(String value) {
      addCriterion("menu_code <=", value, "menuCode");
      return (Criteria) this;
    }

    public Criteria andMenuCodeLike(String value) {
      addCriterion("menu_code like", value, "menuCode");
      return (Criteria) this;
    }

    public Criteria andMenuCodeNotLike(String value) {
      addCriterion("menu_code not like", value, "menuCode");
      return (Criteria) this;
    }

    public Criteria andMenuCodeIn(List<String> values) {
      addCriterion("menu_code in", values, "menuCode");
      return (Criteria) this;
    }

    public Criteria andMenuCodeNotIn(List<String> values) {
      addCriterion("menu_code not in", values, "menuCode");
      return (Criteria) this;
    }

    public Criteria andMenuCodeBetween(String value1, String value2) {
      addCriterion("menu_code between", value1, value2, "menuCode");
      return (Criteria) this;
    }

    public Criteria andMenuCodeNotBetween(String value1, String value2) {
      addCriterion("menu_code not between", value1, value2, "menuCode");
      return (Criteria) this;
    }

    public Criteria andMenuNameIsNull() {
      addCriterion("menu_name is null");
      return (Criteria) this;
    }

    public Criteria andMenuNameIsNotNull() {
      addCriterion("menu_name is not null");
      return (Criteria) this;
    }

    public Criteria andMenuNameEqualTo(String value) {
      addCriterion("menu_name =", value, "menuName");
      return (Criteria) this;
    }

    public Criteria andMenuNameNotEqualTo(String value) {
      addCriterion("menu_name <>", value, "menuName");
      return (Criteria) this;
    }

    public Criteria andMenuNameGreaterThan(String value) {
      addCriterion("menu_name >", value, "menuName");
      return (Criteria) this;
    }

    public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
      addCriterion("menu_name >=", value, "menuName");
      return (Criteria) this;
    }

    public Criteria andMenuNameLessThan(String value) {
      addCriterion("menu_name <", value, "menuName");
      return (Criteria) this;
    }

    public Criteria andMenuNameLessThanOrEqualTo(String value) {
      addCriterion("menu_name <=", value, "menuName");
      return (Criteria) this;
    }

    public Criteria andMenuNameLike(String value) {
      addCriterion("menu_name like", value, "menuName");
      return (Criteria) this;
    }

    public Criteria andMenuNameNotLike(String value) {
      addCriterion("menu_name not like", value, "menuName");
      return (Criteria) this;
    }

    public Criteria andMenuNameIn(List<String> values) {
      addCriterion("menu_name in", values, "menuName");
      return (Criteria) this;
    }

    public Criteria andMenuNameNotIn(List<String> values) {
      addCriterion("menu_name not in", values, "menuName");
      return (Criteria) this;
    }

    public Criteria andMenuNameBetween(String value1, String value2) {
      addCriterion("menu_name between", value1, value2, "menuName");
      return (Criteria) this;
    }

    public Criteria andMenuNameNotBetween(String value1, String value2) {
      addCriterion("menu_name not between", value1, value2, "menuName");
      return (Criteria) this;
    }

    public Criteria andPreMenuIdIsNull() {
      addCriterion("pre_menu_id is null");
      return (Criteria) this;
    }

    public Criteria andPreMenuIdIsNotNull() {
      addCriterion("pre_menu_id is not null");
      return (Criteria) this;
    }

    public Criteria andPreMenuIdEqualTo(Integer value) {
      addCriterion("pre_menu_id =", value, "preMenuId");
      return (Criteria) this;
    }

    public Criteria andPreMenuIdNotEqualTo(Integer value) {
      addCriterion("pre_menu_id <>", value, "preMenuId");
      return (Criteria) this;
    }

    public Criteria andPreMenuIdGreaterThan(Integer value) {
      addCriterion("pre_menu_id >", value, "preMenuId");
      return (Criteria) this;
    }

    public Criteria andPreMenuIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("pre_menu_id >=", value, "preMenuId");
      return (Criteria) this;
    }

    public Criteria andPreMenuIdLessThan(Integer value) {
      addCriterion("pre_menu_id <", value, "preMenuId");
      return (Criteria) this;
    }

    public Criteria andPreMenuIdLessThanOrEqualTo(Integer value) {
      addCriterion("pre_menu_id <=", value, "preMenuId");
      return (Criteria) this;
    }

    public Criteria andPreMenuIdIn(List<Integer> values) {
      addCriterion("pre_menu_id in", values, "preMenuId");
      return (Criteria) this;
    }

    public Criteria andPreMenuIdNotIn(List<Integer> values) {
      addCriterion("pre_menu_id not in", values, "preMenuId");
      return (Criteria) this;
    }

    public Criteria andPreMenuIdBetween(Integer value1, Integer value2) {
      addCriterion("pre_menu_id between", value1, value2, "preMenuId");
      return (Criteria) this;
    }

    public Criteria andPreMenuIdNotBetween(Integer value1, Integer value2) {
      addCriterion("pre_menu_id not between", value1, value2, "preMenuId");
      return (Criteria) this;
    }

    public Criteria andUrlIsNull() {
      addCriterion("url is null");
      return (Criteria) this;
    }

    public Criteria andUrlIsNotNull() {
      addCriterion("url is not null");
      return (Criteria) this;
    }

    public Criteria andUrlEqualTo(String value) {
      addCriterion("url =", value, "url");
      return (Criteria) this;
    }

    public Criteria andUrlNotEqualTo(String value) {
      addCriterion("url <>", value, "url");
      return (Criteria) this;
    }

    public Criteria andUrlGreaterThan(String value) {
      addCriterion("url >", value, "url");
      return (Criteria) this;
    }

    public Criteria andUrlGreaterThanOrEqualTo(String value) {
      addCriterion("url >=", value, "url");
      return (Criteria) this;
    }

    public Criteria andUrlLessThan(String value) {
      addCriterion("url <", value, "url");
      return (Criteria) this;
    }

    public Criteria andUrlLessThanOrEqualTo(String value) {
      addCriterion("url <=", value, "url");
      return (Criteria) this;
    }

    public Criteria andUrlLike(String value) {
      addCriterion("url like", value, "url");
      return (Criteria) this;
    }

    public Criteria andUrlNotLike(String value) {
      addCriterion("url not like", value, "url");
      return (Criteria) this;
    }

    public Criteria andUrlIn(List<String> values) {
      addCriterion("url in", values, "url");
      return (Criteria) this;
    }

    public Criteria andUrlNotIn(List<String> values) {
      addCriterion("url not in", values, "url");
      return (Criteria) this;
    }

    public Criteria andUrlBetween(String value1, String value2) {
      addCriterion("url between", value1, value2, "url");
      return (Criteria) this;
    }

    public Criteria andUrlNotBetween(String value1, String value2) {
      addCriterion("url not between", value1, value2, "url");
      return (Criteria) this;
    }

    public Criteria andIconIsNull() {
      addCriterion("icon is null");
      return (Criteria) this;
    }

    public Criteria andIconIsNotNull() {
      addCriterion("icon is not null");
      return (Criteria) this;
    }

    public Criteria andIconEqualTo(String value) {
      addCriterion("icon =", value, "icon");
      return (Criteria) this;
    }

    public Criteria andIconNotEqualTo(String value) {
      addCriterion("icon <>", value, "icon");
      return (Criteria) this;
    }

    public Criteria andIconGreaterThan(String value) {
      addCriterion("icon >", value, "icon");
      return (Criteria) this;
    }

    public Criteria andIconGreaterThanOrEqualTo(String value) {
      addCriterion("icon >=", value, "icon");
      return (Criteria) this;
    }

    public Criteria andIconLessThan(String value) {
      addCriterion("icon <", value, "icon");
      return (Criteria) this;
    }

    public Criteria andIconLessThanOrEqualTo(String value) {
      addCriterion("icon <=", value, "icon");
      return (Criteria) this;
    }

    public Criteria andIconLike(String value) {
      addCriterion("icon like", value, "icon");
      return (Criteria) this;
    }

    public Criteria andIconNotLike(String value) {
      addCriterion("icon not like", value, "icon");
      return (Criteria) this;
    }

    public Criteria andIconIn(List<String> values) {
      addCriterion("icon in", values, "icon");
      return (Criteria) this;
    }

    public Criteria andIconNotIn(List<String> values) {
      addCriterion("icon not in", values, "icon");
      return (Criteria) this;
    }

    public Criteria andIconBetween(String value1, String value2) {
      addCriterion("icon between", value1, value2, "icon");
      return (Criteria) this;
    }

    public Criteria andIconNotBetween(String value1, String value2) {
      addCriterion("icon not between", value1, value2, "icon");
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

    public Criteria andSortEqualTo(Integer value) {
      addCriterion("sort =", value, "sort");
      return (Criteria) this;
    }

    public Criteria andSortNotEqualTo(Integer value) {
      addCriterion("sort <>", value, "sort");
      return (Criteria) this;
    }

    public Criteria andSortGreaterThan(Integer value) {
      addCriterion("sort >", value, "sort");
      return (Criteria) this;
    }

    public Criteria andSortGreaterThanOrEqualTo(Integer value) {
      addCriterion("sort >=", value, "sort");
      return (Criteria) this;
    }

    public Criteria andSortLessThan(Integer value) {
      addCriterion("sort <", value, "sort");
      return (Criteria) this;
    }

    public Criteria andSortLessThanOrEqualTo(Integer value) {
      addCriterion("sort <=", value, "sort");
      return (Criteria) this;
    }

    public Criteria andSortIn(List<Integer> values) {
      addCriterion("sort in", values, "sort");
      return (Criteria) this;
    }

    public Criteria andSortNotIn(List<Integer> values) {
      addCriterion("sort not in", values, "sort");
      return (Criteria) this;
    }

    public Criteria andSortBetween(Integer value1, Integer value2) {
      addCriterion("sort between", value1, value2, "sort");
      return (Criteria) this;
    }

    public Criteria andSortNotBetween(Integer value1, Integer value2) {
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
   * 只读. t_sys_menu
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
     * This class corresponds to the database table t_sys_menu
     *
     * @mbg.generated do_not_delete_during_merge 2018-12-26 10:42:06
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }
}