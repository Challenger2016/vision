package com.healthy.vision.entity.bo;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class SysUserUpdateBO {

  @io.swagger.annotations.ApiModelProperty(value = "用户id", name = "sysUserId", required = false, example = "")
  @NotNull
  private Integer sysUserId;
  
  @io.swagger.annotations.ApiModelProperty(value = "姓名", name = "name", required = false, example = "")
  @NotBlank
  private String name;
  
  @io.swagger.annotations.ApiModelProperty(value = "密码", name = "password", required = false, example = "")
  @NotBlank
  private String password;

  @io.swagger.annotations.ApiModelProperty(value = "手机号", name = "phone", required = false, example = "")
  @NotBlank
  private String phone;

  @io.swagger.annotations.ApiModelProperty(value = "岗位", name = "position", required = false, example = "")
  private String position;
  
  @io.swagger.annotations.ApiModelProperty(value = "角色id集合", name = "sysRoleIdList", required = true, example = "")
  @NotNull
  private List<Integer> sysRoleIdList;
  
  @io.swagger.annotations.ApiModelProperty(value = "备注", name = "remark", required = false, example = "")
  private String remark;

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public List<Integer> getSysRoleIdList() {
    return sysRoleIdList;
  }

  public void setSysRoleIdList(List<Integer> sysRoleIdList) {
    this.sysRoleIdList = sysRoleIdList;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public Integer getSysUserId() {
    return sysUserId;
  }

  public void setSysUserId(Integer sysUserId) {
    this.sysUserId = sysUserId;
  }
  
  
}
