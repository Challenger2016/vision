package com.healthy.vision.service;

import com.github.pagehelper.PageInfo;
import com.healthy.vision.entity.bo.SysRoleAddBO;
import com.healthy.vision.entity.bo.SysRoleGetListBO;
import com.healthy.vision.entity.po.SysRolePO;
import com.healthy.vision.entity.vo.ResponseData;

/**
 * 角色管理
 * @author 董争光
 * 2018年12月26日下午3:31:14
 */
public interface SysRoleService {
  
  /**
   * 添加角色
   * @param bo
   * @return
   */
  ResponseData<Object> add(SysRoleAddBO bo);
  
  /**
   * 查询角色列表
   * @param roleName
   * @param pageNum
   * @param pageSize
   * @return
   */
  ResponseData<PageInfo<SysRolePO>> getList(SysRoleGetListBO bo);
  
  /**
   * 查询角色
   * @param sysRoleId
   * @return
   */
  ResponseData<SysRolePO> find(Integer sysRoleId);
  
  /**
   * 更新角色
   * @param bo
   * @return
   */
  ResponseData<Object> update(SysRoleAddBO bo);
  
  /**
   * 删除角色
   * @param sysRoleId
   * @return
   */
  ResponseData<Object> delete(Long sysRoleId);

}
