package com.healthy.vision.entity.bo;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class SysRoleUpdateBO {

  public Integer getSysRoleId() {
    return sysRoleId;
  }

  public void setSysRoleId(Integer sysRoleId) {
    this.sysRoleId = sysRoleId;
  }

  @NotNull
  private Integer sysRoleId;
  
  @io.swagger.annotations.ApiModelProperty(value = "角色名称", name = "roleName", required = false, example = "")
  @NotBlank
  private String roleName;

  @io.swagger.annotations.ApiModelProperty(value = "是否为管理员", name = "isAdmin", required = false, example = "")
  private boolean isAdmin;
  
  @io.swagger.annotations.ApiModelProperty(value = "菜单id集合", name = "sysMenuIdList", required = true, example = "")
  @NotNull
  private List<Integer> sysMenuIdList;

  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public boolean isAdmin() {
    return isAdmin;
  }

  public void setAdmin(boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  public List<Integer> getSysMenuIdList() {
    return sysMenuIdList;
  }

  public void setSysMenuIdList(List<Integer> sysMenuIdList) {
    this.sysMenuIdList = sysMenuIdList;
  }

  
  
  
}
