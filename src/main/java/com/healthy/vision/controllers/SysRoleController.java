package com.healthy.vision.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.healthy.vision.common.redis.RedisClient;
import com.healthy.vision.entity.bo.SysRoleAddBO;
import com.healthy.vision.entity.bo.SysRoleGetListBO;
import com.healthy.vision.entity.bo.SysRoleUpdateBO;
import com.healthy.vision.entity.po.SysRolePO;
import com.healthy.vision.entity.po.SysUserPO;
import com.healthy.vision.entity.vo.ResponseData;
import com.healthy.vision.service.SysRoleService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RequestMapping("/sysRole")
@RestController
@Api(value = "角色相关接口")
public class SysRoleController {

  @Autowired
  private SysRoleService sysRoleService;

  @Autowired
  private RedisClient redisClient;

  @ApiOperation(value = "新增角色")
  @RequestMapping(value = "/add", method = RequestMethod.POST)
  public ResponseData<Object> add(@RequestBody SysRoleAddBO bo, HttpServletRequest request) {
    String sessionId = request.getSession().getId();
    
    SysUserPO sysUserPO = (SysUserPO) redisClient.get("sessionid_" + sessionId);
    
    return this.sysRoleService.add(bo, sysUserPO);


  }


  @ApiOperation(value = "删除角色")
  @RequestMapping(value = "/delete", method = RequestMethod.POST)
  public ResponseData<Object> delete(Integer sysRoleId, HttpServletRequest request) {
    String sessionId = request.getSession().getId();
    SysUserPO sysUserPO = (SysUserPO) redisClient.get("sessionid_" + sessionId);
    return this.sysRoleService.delete(sysRoleId, sysUserPO);

  }


  @ApiOperation(value = "查找角色")
  @RequestMapping(value = "/find", method = RequestMethod.POST)
  public ResponseData<SysRolePO> find(Integer sysRoleId) {
    
    return this.sysRoleService.find(sysRoleId);

  }


  @ApiOperation(value = "查询角色列表")
  @RequestMapping(value = "/getList", method = RequestMethod.POST)
  public ResponseData<PageInfo<SysRolePO>> getList(@RequestBody SysRoleGetListBO bo) {
    return this.sysRoleService.getList(bo);

  }


  @ApiOperation(value = "更新角色")
  @RequestMapping(value = "/update", method = RequestMethod.POST)
  public ResponseData<Object> update(@RequestBody SysRoleUpdateBO bo, HttpServletRequest request) {
    String sessionId = request.getSession().getId();
    SysUserPO sysUserPO = (SysUserPO) redisClient.get("sessionid_" + sessionId);
    return this.sysRoleService.update(bo, sysUserPO);

  }



}
