package com.healthy.vision.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.healthy.vision.common.enums.SysResponseEnum;
import com.healthy.vision.entity.bo.SysUserAddBO;
import com.healthy.vision.entity.bo.SysUserGetListBO;
import com.healthy.vision.entity.bo.SysUserLoginBO;
import com.healthy.vision.entity.bo.SysUserUpdateBO;
import com.healthy.vision.entity.po.SysUserPO;
import com.healthy.vision.entity.vo.ResponseData;
import com.healthy.vision.entity.vo.SysUserVO;
import com.healthy.vision.service.SysUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RequestMapping("/sys-user")
@RestController
@Api(value = "用户相关接口")
public class SysUserController {

  @Autowired
  private SysUserService sysUserService;

  @ApiOperation(value = "后台登录")
  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public ResponseData<SysUserPO> login(@RequestBody @Valid SysUserLoginBO bo, HttpServletRequest request) {
    ResponseData<SysUserPO> responseData = this.sysUserService.login(bo);
    if (SysResponseEnum.SUCCESS.getCode() == responseData.getCode()) {
      HttpUtils.login(request, responseData.getData());
    }
    
    return responseData;
  }

  @ApiOperation(value = "退出")
  @RequestMapping(value = "/logout", method = RequestMethod.POST)
  public void logout(HttpServletRequest request) {
    HttpUtils.logout(request);
  }

  @ApiOperation(value = "添加用户")
  @RequestMapping(value = "/add", method = RequestMethod.POST)
  public ResponseData<Object> add(@RequestBody SysUserAddBO bo, HttpServletRequest request) {
    
    SysUserPO loginSysUserPO = HttpUtils.getLoginSysUserPO(request);
    return this.sysUserService.add(bo, loginSysUserPO);

  }

  @ApiOperation(value = "删除")
  @RequestMapping(value = "/delete/{sysUserId}", method = RequestMethod.POST)
  public ResponseData<Object> delete(@PathVariable("sysUserId") Integer sysUserId, HttpServletRequest request) {
    SysUserPO loginSysUserPO = HttpUtils.getLoginSysUserPO(request);
    return this.sysUserService.delete(sysUserId, loginSysUserPO);

  }

  @ApiOperation(value = "查找用户")
  @RequestMapping(value = "/find-byId/{sysUserId}", method = RequestMethod.POST)
  public ResponseData<SysUserVO> findById(@PathVariable("sysUserId") Integer sysUserId) {

    return this.sysUserService.findById(sysUserId);

  }

  @ApiOperation(value = "获得用户列表")
  @RequestMapping(value = "/list", method = RequestMethod.POST)
  public ResponseData<PageInfo<SysUserPO>> getList(@RequestBody SysUserGetListBO bo) {
    return this.sysUserService.getList(bo);


  }

  @ApiOperation(value = "修改用户")
  @RequestMapping(value = "/update/{sysUserId}", method = RequestMethod.POST)
  public ResponseData<Object> update(@PathVariable("sysUserId")Integer sysUserId, @RequestBody SysUserUpdateBO bo, HttpServletRequest request) {
    SysUserPO loginSysUserPO = HttpUtils.getLoginSysUserPO(request);
    return this.sysUserService.update(bo, loginSysUserPO);

  }
  
  @ApiOperation(value = "禁用用户")
  @RequestMapping(value = "/disable/{sysUserId}", method = RequestMethod.POST)
  public ResponseData<Object> disable(@PathVariable("sysUserId")Integer sysUserId, HttpServletRequest request) {
    SysUserPO loginSysUserPO = HttpUtils.getLoginSysUserPO(request);
    return this.sysUserService.disable(sysUserId, loginSysUserPO);

  }
  
  @ApiOperation(value = "启用用户")
  @RequestMapping(value = "/enable/{sysUserId}", method = RequestMethod.POST)
  public ResponseData<Object> enable(@PathVariable("sysUserId")Integer sysUserId, HttpServletRequest request) {
    SysUserPO loginSysUserPO = HttpUtils.getLoginSysUserPO(request);
    return this.sysUserService.enable(sysUserId, loginSysUserPO);

  }



}
