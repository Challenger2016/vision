package com.healthy.vision.entity.po;

import java.io.Serializable;
import java.util.Date;

public class SysRolePO implements Serializable {

  /**
   * 只读. 企业角色id. sys_role_id
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "企业角色id", name = "sysRoleId", required = false, example = "")
  private Integer sysRoleId;
  /**
   * 只读. 角色code. role_code
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "角色code", name = "roleCode", required = false, example = "")
  private String roleCode;
  /**
   * 只读. 角色名称. role_name
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "角色名称", name = "roleName", required = false, example = "")
  private String roleName;
  /**
   * 只读. 是否为管理员. is_admin
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "是否为管理员", name = "isAdmin", required = false, example = "")
  private Boolean isAdmin;
  /**
   * 只读. 状态：0=禁用；1=启用. status
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "状态：0=禁用；1=启用", name = "status", required = false, example = "")
  private Boolean status;
  /**
   * 只读. 备注. remark
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "备注", name = "remark", required = false, example = "")
  private String remark;
  /**
   * 只读. 创建人id. create_user_id
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "创建人id", name = "createUserId", required = false, example = "")
  private Integer createUserId;
  /**
   * 只读. 创建人. create_user_name
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "创建人", name = "createUserName", required = false, example = "")
  private String createUserName;
  /**
   * 只读. 创建日期. create_date
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "创建日期", name = "createDate", required = false, example = "")
  private Date createDate;
  /**
   * 只读. 修改人id. modified_user_id
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "修改人id", name = "modifiedUserId", required = false, example = "")
  private Integer modifiedUserId;
  /**
   * 只读. 修改人. modified_user_name
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "修改人", name = "modifiedUserName", required = false, example = "")
  private String modifiedUserName;
  /**
   * 只读. 修改时间. modified_date
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "修改时间", name = "modifiedDate", required = false, example = "")
  private Date modifiedDate;
  /**
   * 只读. 数据有效性：1=有效；0=无效. valid
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "数据有效性：1=有效；0=无效", name = "valid", required = false, example = "")
  private Boolean valid;
  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  private static final long serialVersionUID = 1L;

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Integer getSysRoleId() {
    return sysRoleId;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setSysRoleId(Integer sysRoleId) {
    this.sysRoleId = sysRoleId;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getRoleCode() {
    return roleCode;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setRoleCode(String roleCode) {
    this.roleCode = roleCode == null ? null : roleCode.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getRoleName() {
    return roleName;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setRoleName(String roleName) {
    this.roleName = roleName == null ? null : roleName.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Boolean getIsAdmin() {
    return isAdmin;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Boolean getStatus() {
    return status;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setStatus(Boolean status) {
    this.status = status;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getRemark() {
    return remark;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setRemark(String remark) {
    this.remark = remark == null ? null : remark.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Integer getCreateUserId() {
    return createUserId;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setCreateUserId(Integer createUserId) {
    this.createUserId = createUserId;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getCreateUserName() {
    return createUserName;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setCreateUserName(String createUserName) {
    this.createUserName = createUserName == null ? null : createUserName.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Date getCreateDate() {
    return createDate;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Integer getModifiedUserId() {
    return modifiedUserId;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setModifiedUserId(Integer modifiedUserId) {
    this.modifiedUserId = modifiedUserId;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getModifiedUserName() {
    return modifiedUserName;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setModifiedUserName(String modifiedUserName) {
    this.modifiedUserName = modifiedUserName == null ? null : modifiedUserName.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Date getModifiedDate() {
    return modifiedDate;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Boolean getValid() {
    return valid;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setValid(Boolean valid) {
    this.valid = valid;
  }
}