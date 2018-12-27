package com.healthy.vision.entity.vo;

import java.util.List;

import com.healthy.vision.entity.po.SysMenuPO;

public class SysMenuVO extends SysMenuPO {
  
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  /**
   * 子集对象
   */
  private List<SysMenuVO> childrenList;
  public List<SysMenuVO> getChildrenList() {
    return childrenList;
  }
  public void setChildrenList(List<SysMenuVO> childrenList) {
    this.childrenList = childrenList;
  }
  
  

}
