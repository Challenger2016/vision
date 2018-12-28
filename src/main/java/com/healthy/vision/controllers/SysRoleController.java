package com.healthy.vision.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.healthy.vision.entity.bo.SysRoleAddBO;
import com.healthy.vision.entity.bo.SysRoleGetListBO;
import com.healthy.vision.entity.bo.SysRoleUpdateBO;
import com.healthy.vision.entity.po.SysRolePO;
import com.healthy.vision.entity.po.SysUserPO;
import com.healthy.vision.entity.vo.ResponseData;
import com.healthy.vision.entity.vo.SysMenuVO;
import com.healthy.vision.service.SysRoleService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RequestMapping("/sys-role")
@RestController
@Api(value = "角色相关接口")
public class SysRoleController {

  @Autowired
  private SysRoleService sysRoleService;

  @ApiOperation(value = "新增角色")
  @RequestMapping(value = "/add", method = RequestMethod.POST)
  public ResponseData<Object> add(@RequestBody SysRoleAddBO bo, HttpServletRequest request) {
    
    SysUserPO sysUserPO = HttpUtils.getLoginSysUserPO(request);
    
    return this.sysRoleService.add(bo, sysUserPO);


  }


  @ApiOperation(value = "删除角色")
  @RequestMapping(value = "/delete/{sysRoleId}", method = RequestMethod.POST)
  public ResponseData<Object> delete(@PathVariable("sysRoleId")Integer sysRoleId, HttpServletRequest request) {

    SysUserPO sysUserPO = HttpUtils.getLoginSysUserPO(request);
    return this.sysRoleService.delete(sysRoleId, sysUserPO);

  }


  @ApiOperation(value = "查找角色")
  @RequestMapping(value = "/find/{sysRoleId}", method = RequestMethod.POST)
  public ResponseData<SysRolePO> find(@PathVariable("sysRoleId")Integer sysRoleId) {
    
    return this.sysRoleService.find(sysRoleId);

  }
  
  @ApiOperation(value = "获取当前用户菜单权限")
  @RequestMapping(value = "/find-menus", method = RequestMethod.POST)
  public ResponseData<List<SysMenuVO>> findMenus(HttpServletRequest request) {
    
    SysUserPO sysUserPO = HttpUtils.getLoginSysUserPO(request);
    return this.sysRoleService.findMenusByUserId(sysUserPO.getSysUserId());

  }
  


  @ApiOperation(value = "查询角色列表")
  @RequestMapping(value = "/list", method = RequestMethod.POST)
  public ResponseData<PageInfo<SysRolePO>> getList(@RequestBody SysRoleGetListBO bo) {
    return this.sysRoleService.getList(bo);

  }


  @ApiOperation(value = "更新角色")
  @RequestMapping(value = "/update/{sysRoleId}", method = RequestMethod.POST)
  public ResponseData<Object> update(@PathVariable("sysRoleId")Integer sysRoleId, @RequestBody SysRoleUpdateBO bo, HttpServletRequest request) {

    SysUserPO sysUserPO = HttpUtils.getLoginSysUserPO(request);
    return this.sysRoleService.update(bo, sysUserPO);

  }



}
