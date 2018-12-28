package com.healthy.vision.service;

import com.github.pagehelper.PageInfo;
import com.healthy.vision.entity.bo.SysUserAddBO;
import com.healthy.vision.entity.bo.SysUserGetListBO;
import com.healthy.vision.entity.bo.SysUserLoginBO;
import com.healthy.vision.entity.bo.SysUserUpdateBO;
import com.healthy.vision.entity.po.SysUserPO;
import com.healthy.vision.entity.vo.ResponseData;
import com.healthy.vision.entity.vo.SysUserVO;

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
  ResponseData<Object> add(SysUserAddBO bo, SysUserPO sysUserPO);
  
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
  ResponseData<SysUserVO> findById(Integer sysUserId);
  
  /**
   * 更新用户数据
   * @param po
   * @return
   */
  ResponseData<Object> update(SysUserUpdateBO bo, SysUserPO sysUserPO);
  
  /**
   * 禁用用户
   * @param po
   * @return
   */
  ResponseData<Object> disable(Integer sysUserId, SysUserPO sysUserPO);
  
  /**
   * 启用用户
   * @param po
   * @return
   */
  ResponseData<Object> enable(Integer sysUserId, SysUserPO sysUserPO);
  
  
  /**
   * 删除用户数据
   * @return
   */
  ResponseData<Object> delete(Integer sysUserId, SysUserPO sysUserPO);

}
