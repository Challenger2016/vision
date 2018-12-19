package com.healthy.vision.entity.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WxPublicPOExample implements Serializable {
    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    protected String orderByClause;

    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    protected boolean distinct;

    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    protected List<Criteria> oredCriteria;

    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    private static final long serialVersionUID = 1L;

    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    public WxPublicPOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
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
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 只读. t_wx_public
     *
     * @mbg.generated 2018-12-19 10:34:36
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

        public Criteria andWxPublicIdIsNull() {
            addCriterion("wx_public_id is null");
            return (Criteria) this;
        }

        public Criteria andWxPublicIdIsNotNull() {
            addCriterion("wx_public_id is not null");
            return (Criteria) this;
        }

        public Criteria andWxPublicIdEqualTo(Long value) {
            addCriterion("wx_public_id =", value, "wxPublicId");
            return (Criteria) this;
        }

        public Criteria andWxPublicIdNotEqualTo(Long value) {
            addCriterion("wx_public_id <>", value, "wxPublicId");
            return (Criteria) this;
        }

        public Criteria andWxPublicIdGreaterThan(Long value) {
            addCriterion("wx_public_id >", value, "wxPublicId");
            return (Criteria) this;
        }

        public Criteria andWxPublicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("wx_public_id >=", value, "wxPublicId");
            return (Criteria) this;
        }

        public Criteria andWxPublicIdLessThan(Long value) {
            addCriterion("wx_public_id <", value, "wxPublicId");
            return (Criteria) this;
        }

        public Criteria andWxPublicIdLessThanOrEqualTo(Long value) {
            addCriterion("wx_public_id <=", value, "wxPublicId");
            return (Criteria) this;
        }

        public Criteria andWxPublicIdIn(List<Long> values) {
            addCriterion("wx_public_id in", values, "wxPublicId");
            return (Criteria) this;
        }

        public Criteria andWxPublicIdNotIn(List<Long> values) {
            addCriterion("wx_public_id not in", values, "wxPublicId");
            return (Criteria) this;
        }

        public Criteria andWxPublicIdBetween(Long value1, Long value2) {
            addCriterion("wx_public_id between", value1, value2, "wxPublicId");
            return (Criteria) this;
        }

        public Criteria andWxPublicIdNotBetween(Long value1, Long value2) {
            addCriterion("wx_public_id not between", value1, value2, "wxPublicId");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIdIsNull() {
            addCriterion("sys_company_id is null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIdIsNotNull() {
            addCriterion("sys_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIdEqualTo(Long value) {
            addCriterion("sys_company_id =", value, "sysCompanyId");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIdNotEqualTo(Long value) {
            addCriterion("sys_company_id <>", value, "sysCompanyId");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIdGreaterThan(Long value) {
            addCriterion("sys_company_id >", value, "sysCompanyId");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_company_id >=", value, "sysCompanyId");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIdLessThan(Long value) {
            addCriterion("sys_company_id <", value, "sysCompanyId");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("sys_company_id <=", value, "sysCompanyId");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIdIn(List<Long> values) {
            addCriterion("sys_company_id in", values, "sysCompanyId");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIdNotIn(List<Long> values) {
            addCriterion("sys_company_id not in", values, "sysCompanyId");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIdBetween(Long value1, Long value2) {
            addCriterion("sys_company_id between", value1, value2, "sysCompanyId");
            return (Criteria) this;
        }

        public Criteria andSysCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("sys_company_id not between", value1, value2, "sysCompanyId");
            return (Criteria) this;
        }

        public Criteria andSysBrandIdIsNull() {
            addCriterion("sys_brand_id is null");
            return (Criteria) this;
        }

        public Criteria andSysBrandIdIsNotNull() {
            addCriterion("sys_brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysBrandIdEqualTo(Long value) {
            addCriterion("sys_brand_id =", value, "sysBrandId");
            return (Criteria) this;
        }

        public Criteria andSysBrandIdNotEqualTo(Long value) {
            addCriterion("sys_brand_id <>", value, "sysBrandId");
            return (Criteria) this;
        }

        public Criteria andSysBrandIdGreaterThan(Long value) {
            addCriterion("sys_brand_id >", value, "sysBrandId");
            return (Criteria) this;
        }

        public Criteria andSysBrandIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_brand_id >=", value, "sysBrandId");
            return (Criteria) this;
        }

        public Criteria andSysBrandIdLessThan(Long value) {
            addCriterion("sys_brand_id <", value, "sysBrandId");
            return (Criteria) this;
        }

        public Criteria andSysBrandIdLessThanOrEqualTo(Long value) {
            addCriterion("sys_brand_id <=", value, "sysBrandId");
            return (Criteria) this;
        }

        public Criteria andSysBrandIdIn(List<Long> values) {
            addCriterion("sys_brand_id in", values, "sysBrandId");
            return (Criteria) this;
        }

        public Criteria andSysBrandIdNotIn(List<Long> values) {
            addCriterion("sys_brand_id not in", values, "sysBrandId");
            return (Criteria) this;
        }

        public Criteria andSysBrandIdBetween(Long value1, Long value2) {
            addCriterion("sys_brand_id between", value1, value2, "sysBrandId");
            return (Criteria) this;
        }

        public Criteria andSysBrandIdNotBetween(Long value1, Long value2) {
            addCriterion("sys_brand_id not between", value1, value2, "sysBrandId");
            return (Criteria) this;
        }

        public Criteria andWxPublicTypeIsNull() {
            addCriterion("wx_public_type is null");
            return (Criteria) this;
        }

        public Criteria andWxPublicTypeIsNotNull() {
            addCriterion("wx_public_type is not null");
            return (Criteria) this;
        }

        public Criteria andWxPublicTypeEqualTo(String value) {
            addCriterion("wx_public_type =", value, "wxPublicType");
            return (Criteria) this;
        }

        public Criteria andWxPublicTypeNotEqualTo(String value) {
            addCriterion("wx_public_type <>", value, "wxPublicType");
            return (Criteria) this;
        }

        public Criteria andWxPublicTypeGreaterThan(String value) {
            addCriterion("wx_public_type >", value, "wxPublicType");
            return (Criteria) this;
        }

        public Criteria andWxPublicTypeGreaterThanOrEqualTo(String value) {
            addCriterion("wx_public_type >=", value, "wxPublicType");
            return (Criteria) this;
        }

        public Criteria andWxPublicTypeLessThan(String value) {
            addCriterion("wx_public_type <", value, "wxPublicType");
            return (Criteria) this;
        }

        public Criteria andWxPublicTypeLessThanOrEqualTo(String value) {
            addCriterion("wx_public_type <=", value, "wxPublicType");
            return (Criteria) this;
        }

        public Criteria andWxPublicTypeLike(String value) {
            addCriterion("wx_public_type like", value, "wxPublicType");
            return (Criteria) this;
        }

        public Criteria andWxPublicTypeNotLike(String value) {
            addCriterion("wx_public_type not like", value, "wxPublicType");
            return (Criteria) this;
        }

        public Criteria andWxPublicTypeIn(List<String> values) {
            addCriterion("wx_public_type in", values, "wxPublicType");
            return (Criteria) this;
        }

        public Criteria andWxPublicTypeNotIn(List<String> values) {
            addCriterion("wx_public_type not in", values, "wxPublicType");
            return (Criteria) this;
        }

        public Criteria andWxPublicTypeBetween(String value1, String value2) {
            addCriterion("wx_public_type between", value1, value2, "wxPublicType");
            return (Criteria) this;
        }

        public Criteria andWxPublicTypeNotBetween(String value1, String value2) {
            addCriterion("wx_public_type not between", value1, value2, "wxPublicType");
            return (Criteria) this;
        }

        public Criteria andMiniProgramTypeIsNull() {
            addCriterion("mini_program_type is null");
            return (Criteria) this;
        }

        public Criteria andMiniProgramTypeIsNotNull() {
            addCriterion("mini_program_type is not null");
            return (Criteria) this;
        }

        public Criteria andMiniProgramTypeEqualTo(String value) {
            addCriterion("mini_program_type =", value, "miniProgramType");
            return (Criteria) this;
        }

        public Criteria andMiniProgramTypeNotEqualTo(String value) {
            addCriterion("mini_program_type <>", value, "miniProgramType");
            return (Criteria) this;
        }

        public Criteria andMiniProgramTypeGreaterThan(String value) {
            addCriterion("mini_program_type >", value, "miniProgramType");
            return (Criteria) this;
        }

        public Criteria andMiniProgramTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mini_program_type >=", value, "miniProgramType");
            return (Criteria) this;
        }

        public Criteria andMiniProgramTypeLessThan(String value) {
            addCriterion("mini_program_type <", value, "miniProgramType");
            return (Criteria) this;
        }

        public Criteria andMiniProgramTypeLessThanOrEqualTo(String value) {
            addCriterion("mini_program_type <=", value, "miniProgramType");
            return (Criteria) this;
        }

        public Criteria andMiniProgramTypeLike(String value) {
            addCriterion("mini_program_type like", value, "miniProgramType");
            return (Criteria) this;
        }

        public Criteria andMiniProgramTypeNotLike(String value) {
            addCriterion("mini_program_type not like", value, "miniProgramType");
            return (Criteria) this;
        }

        public Criteria andMiniProgramTypeIn(List<String> values) {
            addCriterion("mini_program_type in", values, "miniProgramType");
            return (Criteria) this;
        }

        public Criteria andMiniProgramTypeNotIn(List<String> values) {
            addCriterion("mini_program_type not in", values, "miniProgramType");
            return (Criteria) this;
        }

        public Criteria andMiniProgramTypeBetween(String value1, String value2) {
            addCriterion("mini_program_type between", value1, value2, "miniProgramType");
            return (Criteria) this;
        }

        public Criteria andMiniProgramTypeNotBetween(String value1, String value2) {
            addCriterion("mini_program_type not between", value1, value2, "miniProgramType");
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

        public Criteria andOpenAppidIsNull() {
            addCriterion("open_appid is null");
            return (Criteria) this;
        }

        public Criteria andOpenAppidIsNotNull() {
            addCriterion("open_appid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenAppidEqualTo(String value) {
            addCriterion("open_appid =", value, "openAppid");
            return (Criteria) this;
        }

        public Criteria andOpenAppidNotEqualTo(String value) {
            addCriterion("open_appid <>", value, "openAppid");
            return (Criteria) this;
        }

        public Criteria andOpenAppidGreaterThan(String value) {
            addCriterion("open_appid >", value, "openAppid");
            return (Criteria) this;
        }

        public Criteria andOpenAppidGreaterThanOrEqualTo(String value) {
            addCriterion("open_appid >=", value, "openAppid");
            return (Criteria) this;
        }

        public Criteria andOpenAppidLessThan(String value) {
            addCriterion("open_appid <", value, "openAppid");
            return (Criteria) this;
        }

        public Criteria andOpenAppidLessThanOrEqualTo(String value) {
            addCriterion("open_appid <=", value, "openAppid");
            return (Criteria) this;
        }

        public Criteria andOpenAppidLike(String value) {
            addCriterion("open_appid like", value, "openAppid");
            return (Criteria) this;
        }

        public Criteria andOpenAppidNotLike(String value) {
            addCriterion("open_appid not like", value, "openAppid");
            return (Criteria) this;
        }

        public Criteria andOpenAppidIn(List<String> values) {
            addCriterion("open_appid in", values, "openAppid");
            return (Criteria) this;
        }

        public Criteria andOpenAppidNotIn(List<String> values) {
            addCriterion("open_appid not in", values, "openAppid");
            return (Criteria) this;
        }

        public Criteria andOpenAppidBetween(String value1, String value2) {
            addCriterion("open_appid between", value1, value2, "openAppid");
            return (Criteria) this;
        }

        public Criteria andOpenAppidNotBetween(String value1, String value2) {
            addCriterion("open_appid not between", value1, value2, "openAppid");
            return (Criteria) this;
        }

        public Criteria andAssociateWxPublicIdIsNull() {
            addCriterion("associate_wx_public_id is null");
            return (Criteria) this;
        }

        public Criteria andAssociateWxPublicIdIsNotNull() {
            addCriterion("associate_wx_public_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssociateWxPublicIdEqualTo(Long value) {
            addCriterion("associate_wx_public_id =", value, "associateWxPublicId");
            return (Criteria) this;
        }

        public Criteria andAssociateWxPublicIdNotEqualTo(Long value) {
            addCriterion("associate_wx_public_id <>", value, "associateWxPublicId");
            return (Criteria) this;
        }

        public Criteria andAssociateWxPublicIdGreaterThan(Long value) {
            addCriterion("associate_wx_public_id >", value, "associateWxPublicId");
            return (Criteria) this;
        }

        public Criteria andAssociateWxPublicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("associate_wx_public_id >=", value, "associateWxPublicId");
            return (Criteria) this;
        }

        public Criteria andAssociateWxPublicIdLessThan(Long value) {
            addCriterion("associate_wx_public_id <", value, "associateWxPublicId");
            return (Criteria) this;
        }

        public Criteria andAssociateWxPublicIdLessThanOrEqualTo(Long value) {
            addCriterion("associate_wx_public_id <=", value, "associateWxPublicId");
            return (Criteria) this;
        }

        public Criteria andAssociateWxPublicIdIn(List<Long> values) {
            addCriterion("associate_wx_public_id in", values, "associateWxPublicId");
            return (Criteria) this;
        }

        public Criteria andAssociateWxPublicIdNotIn(List<Long> values) {
            addCriterion("associate_wx_public_id not in", values, "associateWxPublicId");
            return (Criteria) this;
        }

        public Criteria andAssociateWxPublicIdBetween(Long value1, Long value2) {
            addCriterion("associate_wx_public_id between", value1, value2, "associateWxPublicId");
            return (Criteria) this;
        }

        public Criteria andAssociateWxPublicIdNotBetween(Long value1, Long value2) {
            addCriterion("associate_wx_public_id not between", value1, value2, "associateWxPublicId");
            return (Criteria) this;
        }

        public Criteria andDomainIsNull() {
            addCriterion("domain is null");
            return (Criteria) this;
        }

        public Criteria andDomainIsNotNull() {
            addCriterion("domain is not null");
            return (Criteria) this;
        }

        public Criteria andDomainEqualTo(String value) {
            addCriterion("domain =", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotEqualTo(String value) {
            addCriterion("domain <>", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThan(String value) {
            addCriterion("domain >", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThanOrEqualTo(String value) {
            addCriterion("domain >=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThan(String value) {
            addCriterion("domain <", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThanOrEqualTo(String value) {
            addCriterion("domain <=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLike(String value) {
            addCriterion("domain like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotLike(String value) {
            addCriterion("domain not like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainIn(List<String> values) {
            addCriterion("domain in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotIn(List<String> values) {
            addCriterion("domain not in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainBetween(String value1, String value2) {
            addCriterion("domain between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotBetween(String value1, String value2) {
            addCriterion("domain not between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlIsNull() {
            addCriterion("qr_code_url is null");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlIsNotNull() {
            addCriterion("qr_code_url is not null");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlEqualTo(String value) {
            addCriterion("qr_code_url =", value, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlNotEqualTo(String value) {
            addCriterion("qr_code_url <>", value, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlGreaterThan(String value) {
            addCriterion("qr_code_url >", value, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("qr_code_url >=", value, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlLessThan(String value) {
            addCriterion("qr_code_url <", value, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlLessThanOrEqualTo(String value) {
            addCriterion("qr_code_url <=", value, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlLike(String value) {
            addCriterion("qr_code_url like", value, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlNotLike(String value) {
            addCriterion("qr_code_url not like", value, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlIn(List<String> values) {
            addCriterion("qr_code_url in", values, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlNotIn(List<String> values) {
            addCriterion("qr_code_url not in", values, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlBetween(String value1, String value2) {
            addCriterion("qr_code_url between", value1, value2, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlNotBetween(String value1, String value2) {
            addCriterion("qr_code_url not between", value1, value2, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlIsNull() {
            addCriterion("head_img_url is null");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlIsNotNull() {
            addCriterion("head_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlEqualTo(String value) {
            addCriterion("head_img_url =", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlNotEqualTo(String value) {
            addCriterion("head_img_url <>", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlGreaterThan(String value) {
            addCriterion("head_img_url >", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("head_img_url >=", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlLessThan(String value) {
            addCriterion("head_img_url <", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlLessThanOrEqualTo(String value) {
            addCriterion("head_img_url <=", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlLike(String value) {
            addCriterion("head_img_url like", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlNotLike(String value) {
            addCriterion("head_img_url not like", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlIn(List<String> values) {
            addCriterion("head_img_url in", values, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlNotIn(List<String> values) {
            addCriterion("head_img_url not in", values, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlBetween(String value1, String value2) {
            addCriterion("head_img_url between", value1, value2, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlNotBetween(String value1, String value2) {
            addCriterion("head_img_url not between", value1, value2, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNull() {
            addCriterion("service_type is null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNotNull() {
            addCriterion("service_type is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeEqualTo(String value) {
            addCriterion("service_type =", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotEqualTo(String value) {
            addCriterion("service_type <>", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThan(String value) {
            addCriterion("service_type >", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("service_type >=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThan(String value) {
            addCriterion("service_type <", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThanOrEqualTo(String value) {
            addCriterion("service_type <=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLike(String value) {
            addCriterion("service_type like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotLike(String value) {
            addCriterion("service_type not like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIn(List<String> values) {
            addCriterion("service_type in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotIn(List<String> values) {
            addCriterion("service_type not in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeBetween(String value1, String value2) {
            addCriterion("service_type between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotBetween(String value1, String value2) {
            addCriterion("service_type not between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeIsNull() {
            addCriterion("verify_type is null");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeIsNotNull() {
            addCriterion("verify_type is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeEqualTo(String value) {
            addCriterion("verify_type =", value, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeNotEqualTo(String value) {
            addCriterion("verify_type <>", value, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeGreaterThan(String value) {
            addCriterion("verify_type >", value, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("verify_type >=", value, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeLessThan(String value) {
            addCriterion("verify_type <", value, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeLessThanOrEqualTo(String value) {
            addCriterion("verify_type <=", value, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeLike(String value) {
            addCriterion("verify_type like", value, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeNotLike(String value) {
            addCriterion("verify_type not like", value, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeIn(List<String> values) {
            addCriterion("verify_type in", values, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeNotIn(List<String> values) {
            addCriterion("verify_type not in", values, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeBetween(String value1, String value2) {
            addCriterion("verify_type between", value1, value2, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeNotBetween(String value1, String value2) {
            addCriterion("verify_type not between", value1, value2, "verifyType");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenIsNull() {
            addCriterion("authorizer_refresh_token is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenIsNotNull() {
            addCriterion("authorizer_refresh_token is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenEqualTo(String value) {
            addCriterion("authorizer_refresh_token =", value, "authorizerRefreshToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenNotEqualTo(String value) {
            addCriterion("authorizer_refresh_token <>", value, "authorizerRefreshToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenGreaterThan(String value) {
            addCriterion("authorizer_refresh_token >", value, "authorizerRefreshToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenGreaterThanOrEqualTo(String value) {
            addCriterion("authorizer_refresh_token >=", value, "authorizerRefreshToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenLessThan(String value) {
            addCriterion("authorizer_refresh_token <", value, "authorizerRefreshToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenLessThanOrEqualTo(String value) {
            addCriterion("authorizer_refresh_token <=", value, "authorizerRefreshToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenLike(String value) {
            addCriterion("authorizer_refresh_token like", value, "authorizerRefreshToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenNotLike(String value) {
            addCriterion("authorizer_refresh_token not like", value, "authorizerRefreshToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenIn(List<String> values) {
            addCriterion("authorizer_refresh_token in", values, "authorizerRefreshToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenNotIn(List<String> values) {
            addCriterion("authorizer_refresh_token not in", values, "authorizerRefreshToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenBetween(String value1, String value2) {
            addCriterion("authorizer_refresh_token between", value1, value2, "authorizerRefreshToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerRefreshTokenNotBetween(String value1, String value2) {
            addCriterion("authorizer_refresh_token not between", value1, value2, "authorizerRefreshToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenIsNull() {
            addCriterion("authorizer_access_token is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenIsNotNull() {
            addCriterion("authorizer_access_token is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenEqualTo(String value) {
            addCriterion("authorizer_access_token =", value, "authorizerAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenNotEqualTo(String value) {
            addCriterion("authorizer_access_token <>", value, "authorizerAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenGreaterThan(String value) {
            addCriterion("authorizer_access_token >", value, "authorizerAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenGreaterThanOrEqualTo(String value) {
            addCriterion("authorizer_access_token >=", value, "authorizerAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenLessThan(String value) {
            addCriterion("authorizer_access_token <", value, "authorizerAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenLessThanOrEqualTo(String value) {
            addCriterion("authorizer_access_token <=", value, "authorizerAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenLike(String value) {
            addCriterion("authorizer_access_token like", value, "authorizerAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenNotLike(String value) {
            addCriterion("authorizer_access_token not like", value, "authorizerAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenIn(List<String> values) {
            addCriterion("authorizer_access_token in", values, "authorizerAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenNotIn(List<String> values) {
            addCriterion("authorizer_access_token not in", values, "authorizerAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenBetween(String value1, String value2) {
            addCriterion("authorizer_access_token between", value1, value2, "authorizerAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenNotBetween(String value1, String value2) {
            addCriterion("authorizer_access_token not between", value1, value2, "authorizerAccessToken");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenTimeIsNull() {
            addCriterion("authorizer_access_token_time is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenTimeIsNotNull() {
            addCriterion("authorizer_access_token_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenTimeEqualTo(Long value) {
            addCriterion("authorizer_access_token_time =", value, "authorizerAccessTokenTime");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenTimeNotEqualTo(Long value) {
            addCriterion("authorizer_access_token_time <>", value, "authorizerAccessTokenTime");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenTimeGreaterThan(Long value) {
            addCriterion("authorizer_access_token_time >", value, "authorizerAccessTokenTime");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("authorizer_access_token_time >=", value, "authorizerAccessTokenTime");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenTimeLessThan(Long value) {
            addCriterion("authorizer_access_token_time <", value, "authorizerAccessTokenTime");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenTimeLessThanOrEqualTo(Long value) {
            addCriterion("authorizer_access_token_time <=", value, "authorizerAccessTokenTime");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenTimeIn(List<Long> values) {
            addCriterion("authorizer_access_token_time in", values, "authorizerAccessTokenTime");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenTimeNotIn(List<Long> values) {
            addCriterion("authorizer_access_token_time not in", values, "authorizerAccessTokenTime");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenTimeBetween(Long value1, Long value2) {
            addCriterion("authorizer_access_token_time between", value1, value2, "authorizerAccessTokenTime");
            return (Criteria) this;
        }

        public Criteria andAuthorizerAccessTokenTimeNotBetween(Long value1, Long value2) {
            addCriterion("authorizer_access_token_time not between", value1, value2, "authorizerAccessTokenTime");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenIsNull() {
            addCriterion("jssdk_access_token is null");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenIsNotNull() {
            addCriterion("jssdk_access_token is not null");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenEqualTo(String value) {
            addCriterion("jssdk_access_token =", value, "jssdkAccessToken");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenNotEqualTo(String value) {
            addCriterion("jssdk_access_token <>", value, "jssdkAccessToken");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenGreaterThan(String value) {
            addCriterion("jssdk_access_token >", value, "jssdkAccessToken");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenGreaterThanOrEqualTo(String value) {
            addCriterion("jssdk_access_token >=", value, "jssdkAccessToken");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenLessThan(String value) {
            addCriterion("jssdk_access_token <", value, "jssdkAccessToken");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenLessThanOrEqualTo(String value) {
            addCriterion("jssdk_access_token <=", value, "jssdkAccessToken");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenLike(String value) {
            addCriterion("jssdk_access_token like", value, "jssdkAccessToken");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenNotLike(String value) {
            addCriterion("jssdk_access_token not like", value, "jssdkAccessToken");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenIn(List<String> values) {
            addCriterion("jssdk_access_token in", values, "jssdkAccessToken");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenNotIn(List<String> values) {
            addCriterion("jssdk_access_token not in", values, "jssdkAccessToken");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenBetween(String value1, String value2) {
            addCriterion("jssdk_access_token between", value1, value2, "jssdkAccessToken");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenNotBetween(String value1, String value2) {
            addCriterion("jssdk_access_token not between", value1, value2, "jssdkAccessToken");
            return (Criteria) this;
        }

        public Criteria andAliasIsNull() {
            addCriterion("alias is null");
            return (Criteria) this;
        }

        public Criteria andAliasIsNotNull() {
            addCriterion("alias is not null");
            return (Criteria) this;
        }

        public Criteria andAliasEqualTo(String value) {
            addCriterion("alias =", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotEqualTo(String value) {
            addCriterion("alias <>", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThan(String value) {
            addCriterion("alias >", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThanOrEqualTo(String value) {
            addCriterion("alias >=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThan(String value) {
            addCriterion("alias <", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThanOrEqualTo(String value) {
            addCriterion("alias <=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLike(String value) {
            addCriterion("alias like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotLike(String value) {
            addCriterion("alias not like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasIn(List<String> values) {
            addCriterion("alias in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotIn(List<String> values) {
            addCriterion("alias not in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasBetween(String value1, String value2) {
            addCriterion("alias between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotBetween(String value1, String value2) {
            addCriterion("alias not between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNull() {
            addCriterion("signature is null");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNotNull() {
            addCriterion("signature is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureEqualTo(String value) {
            addCriterion("signature =", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotEqualTo(String value) {
            addCriterion("signature <>", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThan(String value) {
            addCriterion("signature >", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("signature >=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThan(String value) {
            addCriterion("signature <", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThanOrEqualTo(String value) {
            addCriterion("signature <=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLike(String value) {
            addCriterion("signature like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotLike(String value) {
            addCriterion("signature not like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureIn(List<String> values) {
            addCriterion("signature in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotIn(List<String> values) {
            addCriterion("signature not in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureBetween(String value1, String value2) {
            addCriterion("signature between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotBetween(String value1, String value2) {
            addCriterion("signature not between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andIsOpenStoreIsNull() {
            addCriterion("is_open_store is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenStoreIsNotNull() {
            addCriterion("is_open_store is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenStoreEqualTo(Boolean value) {
            addCriterion("is_open_store =", value, "isOpenStore");
            return (Criteria) this;
        }

        public Criteria andIsOpenStoreNotEqualTo(Boolean value) {
            addCriterion("is_open_store <>", value, "isOpenStore");
            return (Criteria) this;
        }

        public Criteria andIsOpenStoreGreaterThan(Boolean value) {
            addCriterion("is_open_store >", value, "isOpenStore");
            return (Criteria) this;
        }

        public Criteria andIsOpenStoreGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_open_store >=", value, "isOpenStore");
            return (Criteria) this;
        }

        public Criteria andIsOpenStoreLessThan(Boolean value) {
            addCriterion("is_open_store <", value, "isOpenStore");
            return (Criteria) this;
        }

        public Criteria andIsOpenStoreLessThanOrEqualTo(Boolean value) {
            addCriterion("is_open_store <=", value, "isOpenStore");
            return (Criteria) this;
        }

        public Criteria andIsOpenStoreIn(List<Boolean> values) {
            addCriterion("is_open_store in", values, "isOpenStore");
            return (Criteria) this;
        }

        public Criteria andIsOpenStoreNotIn(List<Boolean> values) {
            addCriterion("is_open_store not in", values, "isOpenStore");
            return (Criteria) this;
        }

        public Criteria andIsOpenStoreBetween(Boolean value1, Boolean value2) {
            addCriterion("is_open_store between", value1, value2, "isOpenStore");
            return (Criteria) this;
        }

        public Criteria andIsOpenStoreNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_open_store not between", value1, value2, "isOpenStore");
            return (Criteria) this;
        }

        public Criteria andIsOpenScanIsNull() {
            addCriterion("is_open_scan is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenScanIsNotNull() {
            addCriterion("is_open_scan is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenScanEqualTo(Boolean value) {
            addCriterion("is_open_scan =", value, "isOpenScan");
            return (Criteria) this;
        }

        public Criteria andIsOpenScanNotEqualTo(Boolean value) {
            addCriterion("is_open_scan <>", value, "isOpenScan");
            return (Criteria) this;
        }

        public Criteria andIsOpenScanGreaterThan(Boolean value) {
            addCriterion("is_open_scan >", value, "isOpenScan");
            return (Criteria) this;
        }

        public Criteria andIsOpenScanGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_open_scan >=", value, "isOpenScan");
            return (Criteria) this;
        }

        public Criteria andIsOpenScanLessThan(Boolean value) {
            addCriterion("is_open_scan <", value, "isOpenScan");
            return (Criteria) this;
        }

        public Criteria andIsOpenScanLessThanOrEqualTo(Boolean value) {
            addCriterion("is_open_scan <=", value, "isOpenScan");
            return (Criteria) this;
        }

        public Criteria andIsOpenScanIn(List<Boolean> values) {
            addCriterion("is_open_scan in", values, "isOpenScan");
            return (Criteria) this;
        }

        public Criteria andIsOpenScanNotIn(List<Boolean> values) {
            addCriterion("is_open_scan not in", values, "isOpenScan");
            return (Criteria) this;
        }

        public Criteria andIsOpenScanBetween(Boolean value1, Boolean value2) {
            addCriterion("is_open_scan between", value1, value2, "isOpenScan");
            return (Criteria) this;
        }

        public Criteria andIsOpenScanNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_open_scan not between", value1, value2, "isOpenScan");
            return (Criteria) this;
        }

        public Criteria andIsOpenPayIsNull() {
            addCriterion("is_open_pay is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenPayIsNotNull() {
            addCriterion("is_open_pay is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenPayEqualTo(Boolean value) {
            addCriterion("is_open_pay =", value, "isOpenPay");
            return (Criteria) this;
        }

        public Criteria andIsOpenPayNotEqualTo(Boolean value) {
            addCriterion("is_open_pay <>", value, "isOpenPay");
            return (Criteria) this;
        }

        public Criteria andIsOpenPayGreaterThan(Boolean value) {
            addCriterion("is_open_pay >", value, "isOpenPay");
            return (Criteria) this;
        }

        public Criteria andIsOpenPayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_open_pay >=", value, "isOpenPay");
            return (Criteria) this;
        }

        public Criteria andIsOpenPayLessThan(Boolean value) {
            addCriterion("is_open_pay <", value, "isOpenPay");
            return (Criteria) this;
        }

        public Criteria andIsOpenPayLessThanOrEqualTo(Boolean value) {
            addCriterion("is_open_pay <=", value, "isOpenPay");
            return (Criteria) this;
        }

        public Criteria andIsOpenPayIn(List<Boolean> values) {
            addCriterion("is_open_pay in", values, "isOpenPay");
            return (Criteria) this;
        }

        public Criteria andIsOpenPayNotIn(List<Boolean> values) {
            addCriterion("is_open_pay not in", values, "isOpenPay");
            return (Criteria) this;
        }

        public Criteria andIsOpenPayBetween(Boolean value1, Boolean value2) {
            addCriterion("is_open_pay between", value1, value2, "isOpenPay");
            return (Criteria) this;
        }

        public Criteria andIsOpenPayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_open_pay not between", value1, value2, "isOpenPay");
            return (Criteria) this;
        }

        public Criteria andIsOpenCardIsNull() {
            addCriterion("is_open_card is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenCardIsNotNull() {
            addCriterion("is_open_card is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenCardEqualTo(Boolean value) {
            addCriterion("is_open_card =", value, "isOpenCard");
            return (Criteria) this;
        }

        public Criteria andIsOpenCardNotEqualTo(Boolean value) {
            addCriterion("is_open_card <>", value, "isOpenCard");
            return (Criteria) this;
        }

        public Criteria andIsOpenCardGreaterThan(Boolean value) {
            addCriterion("is_open_card >", value, "isOpenCard");
            return (Criteria) this;
        }

        public Criteria andIsOpenCardGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_open_card >=", value, "isOpenCard");
            return (Criteria) this;
        }

        public Criteria andIsOpenCardLessThan(Boolean value) {
            addCriterion("is_open_card <", value, "isOpenCard");
            return (Criteria) this;
        }

        public Criteria andIsOpenCardLessThanOrEqualTo(Boolean value) {
            addCriterion("is_open_card <=", value, "isOpenCard");
            return (Criteria) this;
        }

        public Criteria andIsOpenCardIn(List<Boolean> values) {
            addCriterion("is_open_card in", values, "isOpenCard");
            return (Criteria) this;
        }

        public Criteria andIsOpenCardNotIn(List<Boolean> values) {
            addCriterion("is_open_card not in", values, "isOpenCard");
            return (Criteria) this;
        }

        public Criteria andIsOpenCardBetween(Boolean value1, Boolean value2) {
            addCriterion("is_open_card between", value1, value2, "isOpenCard");
            return (Criteria) this;
        }

        public Criteria andIsOpenCardNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_open_card not between", value1, value2, "isOpenCard");
            return (Criteria) this;
        }

        public Criteria andIsOpenShakeIsNull() {
            addCriterion("is_open_shake is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenShakeIsNotNull() {
            addCriterion("is_open_shake is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenShakeEqualTo(Boolean value) {
            addCriterion("is_open_shake =", value, "isOpenShake");
            return (Criteria) this;
        }

        public Criteria andIsOpenShakeNotEqualTo(Boolean value) {
            addCriterion("is_open_shake <>", value, "isOpenShake");
            return (Criteria) this;
        }

        public Criteria andIsOpenShakeGreaterThan(Boolean value) {
            addCriterion("is_open_shake >", value, "isOpenShake");
            return (Criteria) this;
        }

        public Criteria andIsOpenShakeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_open_shake >=", value, "isOpenShake");
            return (Criteria) this;
        }

        public Criteria andIsOpenShakeLessThan(Boolean value) {
            addCriterion("is_open_shake <", value, "isOpenShake");
            return (Criteria) this;
        }

        public Criteria andIsOpenShakeLessThanOrEqualTo(Boolean value) {
            addCriterion("is_open_shake <=", value, "isOpenShake");
            return (Criteria) this;
        }

        public Criteria andIsOpenShakeIn(List<Boolean> values) {
            addCriterion("is_open_shake in", values, "isOpenShake");
            return (Criteria) this;
        }

        public Criteria andIsOpenShakeNotIn(List<Boolean> values) {
            addCriterion("is_open_shake not in", values, "isOpenShake");
            return (Criteria) this;
        }

        public Criteria andIsOpenShakeBetween(Boolean value1, Boolean value2) {
            addCriterion("is_open_shake between", value1, value2, "isOpenShake");
            return (Criteria) this;
        }

        public Criteria andIsOpenShakeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_open_shake not between", value1, value2, "isOpenShake");
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

        public Criteria andOriginidIsNull() {
            addCriterion("originid is null");
            return (Criteria) this;
        }

        public Criteria andOriginidIsNotNull() {
            addCriterion("originid is not null");
            return (Criteria) this;
        }

        public Criteria andOriginidEqualTo(String value) {
            addCriterion("originid =", value, "originid");
            return (Criteria) this;
        }

        public Criteria andOriginidNotEqualTo(String value) {
            addCriterion("originid <>", value, "originid");
            return (Criteria) this;
        }

        public Criteria andOriginidGreaterThan(String value) {
            addCriterion("originid >", value, "originid");
            return (Criteria) this;
        }

        public Criteria andOriginidGreaterThanOrEqualTo(String value) {
            addCriterion("originid >=", value, "originid");
            return (Criteria) this;
        }

        public Criteria andOriginidLessThan(String value) {
            addCriterion("originid <", value, "originid");
            return (Criteria) this;
        }

        public Criteria andOriginidLessThanOrEqualTo(String value) {
            addCriterion("originid <=", value, "originid");
            return (Criteria) this;
        }

        public Criteria andOriginidLike(String value) {
            addCriterion("originid like", value, "originid");
            return (Criteria) this;
        }

        public Criteria andOriginidNotLike(String value) {
            addCriterion("originid not like", value, "originid");
            return (Criteria) this;
        }

        public Criteria andOriginidIn(List<String> values) {
            addCriterion("originid in", values, "originid");
            return (Criteria) this;
        }

        public Criteria andOriginidNotIn(List<String> values) {
            addCriterion("originid not in", values, "originid");
            return (Criteria) this;
        }

        public Criteria andOriginidBetween(String value1, String value2) {
            addCriterion("originid between", value1, value2, "originid");
            return (Criteria) this;
        }

        public Criteria andOriginidNotBetween(String value1, String value2) {
            addCriterion("originid not between", value1, value2, "originid");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenTimeIsNull() {
            addCriterion("jssdk_access_token_time is null");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenTimeIsNotNull() {
            addCriterion("jssdk_access_token_time is not null");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenTimeEqualTo(Long value) {
            addCriterion("jssdk_access_token_time =", value, "jssdkAccessTokenTime");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenTimeNotEqualTo(Long value) {
            addCriterion("jssdk_access_token_time <>", value, "jssdkAccessTokenTime");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenTimeGreaterThan(Long value) {
            addCriterion("jssdk_access_token_time >", value, "jssdkAccessTokenTime");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("jssdk_access_token_time >=", value, "jssdkAccessTokenTime");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenTimeLessThan(Long value) {
            addCriterion("jssdk_access_token_time <", value, "jssdkAccessTokenTime");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenTimeLessThanOrEqualTo(Long value) {
            addCriterion("jssdk_access_token_time <=", value, "jssdkAccessTokenTime");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenTimeIn(List<Long> values) {
            addCriterion("jssdk_access_token_time in", values, "jssdkAccessTokenTime");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenTimeNotIn(List<Long> values) {
            addCriterion("jssdk_access_token_time not in", values, "jssdkAccessTokenTime");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenTimeBetween(Long value1, Long value2) {
            addCriterion("jssdk_access_token_time between", value1, value2, "jssdkAccessTokenTime");
            return (Criteria) this;
        }

        public Criteria andJssdkAccessTokenTimeNotBetween(Long value1, Long value2) {
            addCriterion("jssdk_access_token_time not between", value1, value2, "jssdkAccessTokenTime");
            return (Criteria) this;
        }

        public Criteria andPlatformAppidIsNull() {
            addCriterion("platform_appid is null");
            return (Criteria) this;
        }

        public Criteria andPlatformAppidIsNotNull() {
            addCriterion("platform_appid is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformAppidEqualTo(String value) {
            addCriterion("platform_appid =", value, "platformAppid");
            return (Criteria) this;
        }

        public Criteria andPlatformAppidNotEqualTo(String value) {
            addCriterion("platform_appid <>", value, "platformAppid");
            return (Criteria) this;
        }

        public Criteria andPlatformAppidGreaterThan(String value) {
            addCriterion("platform_appid >", value, "platformAppid");
            return (Criteria) this;
        }

        public Criteria andPlatformAppidGreaterThanOrEqualTo(String value) {
            addCriterion("platform_appid >=", value, "platformAppid");
            return (Criteria) this;
        }

        public Criteria andPlatformAppidLessThan(String value) {
            addCriterion("platform_appid <", value, "platformAppid");
            return (Criteria) this;
        }

        public Criteria andPlatformAppidLessThanOrEqualTo(String value) {
            addCriterion("platform_appid <=", value, "platformAppid");
            return (Criteria) this;
        }

        public Criteria andPlatformAppidLike(String value) {
            addCriterion("platform_appid like", value, "platformAppid");
            return (Criteria) this;
        }

        public Criteria andPlatformAppidNotLike(String value) {
            addCriterion("platform_appid not like", value, "platformAppid");
            return (Criteria) this;
        }

        public Criteria andPlatformAppidIn(List<String> values) {
            addCriterion("platform_appid in", values, "platformAppid");
            return (Criteria) this;
        }

        public Criteria andPlatformAppidNotIn(List<String> values) {
            addCriterion("platform_appid not in", values, "platformAppid");
            return (Criteria) this;
        }

        public Criteria andPlatformAppidBetween(String value1, String value2) {
            addCriterion("platform_appid between", value1, value2, "platformAppid");
            return (Criteria) this;
        }

        public Criteria andPlatformAppidNotBetween(String value1, String value2) {
            addCriterion("platform_appid not between", value1, value2, "platformAppid");
            return (Criteria) this;
        }

        public Criteria andIsConnectIsNull() {
            addCriterion("is_connect is null");
            return (Criteria) this;
        }

        public Criteria andIsConnectIsNotNull() {
            addCriterion("is_connect is not null");
            return (Criteria) this;
        }

        public Criteria andIsConnectEqualTo(Boolean value) {
            addCriterion("is_connect =", value, "isConnect");
            return (Criteria) this;
        }

        public Criteria andIsConnectNotEqualTo(Boolean value) {
            addCriterion("is_connect <>", value, "isConnect");
            return (Criteria) this;
        }

        public Criteria andIsConnectGreaterThan(Boolean value) {
            addCriterion("is_connect >", value, "isConnect");
            return (Criteria) this;
        }

        public Criteria andIsConnectGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_connect >=", value, "isConnect");
            return (Criteria) this;
        }

        public Criteria andIsConnectLessThan(Boolean value) {
            addCriterion("is_connect <", value, "isConnect");
            return (Criteria) this;
        }

        public Criteria andIsConnectLessThanOrEqualTo(Boolean value) {
            addCriterion("is_connect <=", value, "isConnect");
            return (Criteria) this;
        }

        public Criteria andIsConnectIn(List<Boolean> values) {
            addCriterion("is_connect in", values, "isConnect");
            return (Criteria) this;
        }

        public Criteria andIsConnectNotIn(List<Boolean> values) {
            addCriterion("is_connect not in", values, "isConnect");
            return (Criteria) this;
        }

        public Criteria andIsConnectBetween(Boolean value1, Boolean value2) {
            addCriterion("is_connect between", value1, value2, "isConnect");
            return (Criteria) this;
        }

        public Criteria andIsConnectNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_connect not between", value1, value2, "isConnect");
            return (Criteria) this;
        }

        public Criteria andMiniProgramInfoIsNull() {
            addCriterion("mini_program_info is null");
            return (Criteria) this;
        }

        public Criteria andMiniProgramInfoIsNotNull() {
            addCriterion("mini_program_info is not null");
            return (Criteria) this;
        }

        public Criteria andMiniProgramInfoEqualTo(String value) {
            addCriterion("mini_program_info =", value, "miniProgramInfo");
            return (Criteria) this;
        }

        public Criteria andMiniProgramInfoNotEqualTo(String value) {
            addCriterion("mini_program_info <>", value, "miniProgramInfo");
            return (Criteria) this;
        }

        public Criteria andMiniProgramInfoGreaterThan(String value) {
            addCriterion("mini_program_info >", value, "miniProgramInfo");
            return (Criteria) this;
        }

        public Criteria andMiniProgramInfoGreaterThanOrEqualTo(String value) {
            addCriterion("mini_program_info >=", value, "miniProgramInfo");
            return (Criteria) this;
        }

        public Criteria andMiniProgramInfoLessThan(String value) {
            addCriterion("mini_program_info <", value, "miniProgramInfo");
            return (Criteria) this;
        }

        public Criteria andMiniProgramInfoLessThanOrEqualTo(String value) {
            addCriterion("mini_program_info <=", value, "miniProgramInfo");
            return (Criteria) this;
        }

        public Criteria andMiniProgramInfoLike(String value) {
            addCriterion("mini_program_info like", value, "miniProgramInfo");
            return (Criteria) this;
        }

        public Criteria andMiniProgramInfoNotLike(String value) {
            addCriterion("mini_program_info not like", value, "miniProgramInfo");
            return (Criteria) this;
        }

        public Criteria andMiniProgramInfoIn(List<String> values) {
            addCriterion("mini_program_info in", values, "miniProgramInfo");
            return (Criteria) this;
        }

        public Criteria andMiniProgramInfoNotIn(List<String> values) {
            addCriterion("mini_program_info not in", values, "miniProgramInfo");
            return (Criteria) this;
        }

        public Criteria andMiniProgramInfoBetween(String value1, String value2) {
            addCriterion("mini_program_info between", value1, value2, "miniProgramInfo");
            return (Criteria) this;
        }

        public Criteria andMiniProgramInfoNotBetween(String value1, String value2) {
            addCriterion("mini_program_info not between", value1, value2, "miniProgramInfo");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameIsNull() {
            addCriterion("principal_name is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameIsNotNull() {
            addCriterion("principal_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameEqualTo(String value) {
            addCriterion("principal_name =", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameNotEqualTo(String value) {
            addCriterion("principal_name <>", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameGreaterThan(String value) {
            addCriterion("principal_name >", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameGreaterThanOrEqualTo(String value) {
            addCriterion("principal_name >=", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameLessThan(String value) {
            addCriterion("principal_name <", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameLessThanOrEqualTo(String value) {
            addCriterion("principal_name <=", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameLike(String value) {
            addCriterion("principal_name like", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameNotLike(String value) {
            addCriterion("principal_name not like", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameIn(List<String> values) {
            addCriterion("principal_name in", values, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameNotIn(List<String> values) {
            addCriterion("principal_name not in", values, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameBetween(String value1, String value2) {
            addCriterion("principal_name between", value1, value2, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameNotBetween(String value1, String value2) {
            addCriterion("principal_name not between", value1, value2, "principalName");
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
    }

    /**9
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_wx_public
     *
     * @mbg.generated do_not_delete_during_merge 2018-12-19 10:34:36
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    /**
     * 只读. t_wx_public
     *
     * @mbg.generated 2018-12-19 10:34:36
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
}