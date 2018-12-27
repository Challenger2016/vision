package com.healthy.vision.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.healthy.vision.entity.bo.SysRoleAddBO;
import com.healthy.vision.entity.bo.SysRoleGetListBO;
import com.healthy.vision.entity.bo.SysRoleUpdateBO;
import com.healthy.vision.entity.po.SysRolePO;
import com.healthy.vision.entity.po.SysUserPO;
import com.healthy.vision.entity.vo.ResponseData;
import com.healthy.vision.entity.vo.SysMenuVO;

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
  ResponseData<Object> add(SysRoleAddBO bo, SysUserPO sysUserPO);
  
  /**
   * 查询角色列表
   * @param roleName
   * @param pageNum
   * @param pageSize
   * @return
   */
  ResponseData<PageInfo<SysRolePO>> getList(SysRoleGetListBO bo);
  
  /**
   * 查询角色详情
   * @param sysRoleId
   * @return
   */
  ResponseData<SysRolePO> find(Integer sysRoleId);
  
  /**
   * 查询角色权限
   * @param sysRoleId
   * @return
   */
  ResponseData<List<SysMenuVO>> findMenus(Integer sysRoleId);
  
  /**
   * 更新角色
   * @param bo
   * @return
   */
  ResponseData<Object> update(SysRoleUpdateBO bo, SysUserPO sysUserPO);
  
  /**
   * 删除角色
   * @param sysRoleId
   * @return
   */
  ResponseData<Object> delete(Integer sysRoleId, SysUserPO sysUserPO);

}
