package com.healthy.vision.entity.vo;

import java.util.List;

import com.healthy.vision.entity.po.SysRolePO;
import com.healthy.vision.entity.po.SysUserPO;

public class SysUserVO {
  
  private SysUserPO sysUserPO;
  
  private List<SysRolePO> roleList;

  public SysUserPO getSysUserPO() {
    return sysUserPO;
  }

  public void setSysUserPO(SysUserPO sysUserPO) {
    this.sysUserPO = sysUserPO;
  }

  public List<SysRolePO> getRoleList() {
    return roleList;
  }

  public void setRoleList(List<SysRolePO> roleList) {
    this.roleList = roleList;
  }

  
  

}
