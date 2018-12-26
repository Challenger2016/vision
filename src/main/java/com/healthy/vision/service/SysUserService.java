package com.healthy.vision.service;

import com.github.pagehelper.PageInfo;
import com.healthy.vision.entity.bo.SysUserAddBO;
import com.healthy.vision.entity.bo.SysUserGetListBO;
import com.healthy.vision.entity.bo.SysUserLoginBO;
import com.healthy.vision.entity.po.SysUserPO;
import com.healthy.vision.entity.vo.ResponseData;

/**
 * 用户账号管理
 * @author 董争光
 * 2018年12月26日下午2:58:23
 */
public interface SysUserService {
  
  /**
   * 登录
   * @param phone
   * @param password
   * @return
   */
  ResponseData<SysUserPO> login(SysUserLoginBO bo);
  
  /**
   * 添加用户
   * @param bo
   * @return
   */
  ResponseData<Object> add(SysUserAddBO bo);
  
  /**
   * 分页查询用户数据
   * @param po
   * @return
   */
  ResponseData<PageInfo<SysUserPO>> getList(SysUserGetListBO bo);
  
  /**
   * 通过id查询用户
   * @param sysUserId
   * @return
   */
  ResponseData<SysUserPO> findById(Integer sysUserId);
  
  /**
   * 更新用户数据
   * @param po
   * @return
   */
  ResponseData<Object> update(SysUserAddBO po);
  
  /**
   * 删除用户数据
   * @return
   */
  ResponseData<Object> delete(Integer sysUserId);

}
