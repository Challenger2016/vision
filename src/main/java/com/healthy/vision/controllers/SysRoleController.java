package com.healthy.vision.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.healthy.vision.entity.bo.SysRoleAddBO;
import com.healthy.vision.entity.bo.SysRoleGetListBO;
import com.healthy.vision.entity.po.SysRolePO;
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


  @ApiOperation(value = "新增角色")
  @RequestMapping(value = "/add", method = RequestMethod.POST)
  public ResponseData<Object> add(@RequestBody SysRoleAddBO bo) {
    return this.sysRoleService.add(bo);

  }


  @ApiOperation(value = "删除角色")
  @RequestMapping(value = "/delete", method = RequestMethod.POST)
  public ResponseData<Object> delete(Long sysRoleId) {
    return this.sysRoleService.delete(sysRoleId);

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
  public ResponseData<Object> update(@RequestBody SysRoleAddBO bo) {
    return this.sysRoleService.update(bo);

  }



}
