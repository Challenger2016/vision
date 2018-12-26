package com.healthy.vision.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.healthy.vision.common.enums.SysResponseEnum;
import com.healthy.vision.common.redis.RedisClient;
import com.healthy.vision.entity.bo.SysUserAddBO;
import com.healthy.vision.entity.bo.SysUserGetListBO;
import com.healthy.vision.entity.bo.SysUserLoginBO;
import com.healthy.vision.entity.po.SysUserPO;
import com.healthy.vision.entity.vo.ResponseData;
import com.healthy.vision.service.SysUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RequestMapping("/sysUser")
@RestController
@Api(value = "用户相关接口")
public class SysUserController {

  @Autowired
  private SysUserService sysUserService;
  
  @Autowired
  private RedisClient redisClient;


  @ApiOperation(value = "后台登录")
  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public ResponseData<SysUserPO> login(@RequestBody @Valid SysUserLoginBO bo, HttpServletRequest request) {
    ResponseData<SysUserPO> responseData = this.sysUserService.login(bo);
    if (SysResponseEnum.SUCCESS.getCode() == responseData.getCode()) {
      String sessionId = request.getSession().getId();
      redisClient.set("sessionid_" + sessionId, responseData.getData(), 3600L);
    }

    
    return responseData;
  }

  @ApiOperation(value = "退出")
  @RequestMapping(value = "/logout", method = RequestMethod.POST)
  public void logout(HttpServletRequest request) {
    String sessionId = request.getSession().getId();
    
    redisClient.remove("sessionid_" + sessionId);
  }

  @ApiOperation(value = "添加用户")
  @RequestMapping(value = "/add", method = RequestMethod.POST)
  public ResponseData<Object> add(@RequestBody SysUserAddBO bo) {
    return this.sysUserService.add(bo);

  }

  @ApiOperation(value = "删除")
  @RequestMapping(value = "/delete", method = RequestMethod.POST)
  public ResponseData<Object> delete(Integer sysUserId) {
    return this.sysUserService.delete(sysUserId);

  }

  @ApiOperation(value = "查找用户")
  @RequestMapping(value = "/findById", method = RequestMethod.POST)
  public ResponseData<SysUserPO> findById(Integer sysUserId) {
    return this.sysUserService.findById(sysUserId);

  }

  @ApiOperation(value = "获得用户列表")
  @RequestMapping(value = "/getList", method = RequestMethod.POST)
  public ResponseData<PageInfo<SysUserPO>> getList(@RequestBody SysUserGetListBO bo) {
    return this.sysUserService.getList(bo);


  }

  @ApiOperation(value = "修改用户")
  @RequestMapping(value = "/update", method = RequestMethod.POST)
  public ResponseData<Object> update(@RequestBody SysUserAddBO bo) {
    return this.sysUserService.update(bo);

  }



}
