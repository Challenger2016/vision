package com.healthy.vision.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;
import com.healthy.vision.entity.bo.SysRoleAddBO;
import com.healthy.vision.entity.bo.SysRoleGetListBO;
import com.healthy.vision.entity.bo.SysRoleUpdateBO;
import com.healthy.vision.entity.po.SysMenuPO;
import com.healthy.vision.entity.po.SysRoleMenuRelPO;
import com.healthy.vision.entity.po.SysRoleMenuRelPOExample;
import com.healthy.vision.entity.po.SysRolePO;
import com.healthy.vision.entity.po.SysRolePOExample;
import com.healthy.vision.entity.po.SysUserPO;
import com.healthy.vision.entity.vo.ResponseData;
import com.healthy.vision.entity.vo.SysMenuVO;
import com.healthy.vision.mappers.SysMenuPOMapper;
import com.healthy.vision.mappers.SysRoleMenuRelPOMapper;
import com.healthy.vision.mappers.SysRolePOMapper;
import com.healthy.vision.service.SysRoleService;

public class SysRoleServiceImpl implements SysRoleService {

  @Autowired
  private SysRolePOMapper sysRolePOMapper;

  @Autowired
  private SysRoleMenuRelPOMapper sysRoleMenuRelPOMapper;

  @Autowired
  private SysMenuPOMapper sysMenuPOMapper;

  @Override
  public ResponseData<Object> add(SysRoleAddBO bo, SysUserPO sysUserPO) {
    Integer sysUserId = sysUserPO.getSysUserId();
    String sysUserName = sysUserPO.getName();

    Date nowDate = new Date();
    SysRolePO sysRolePO = new SysRolePO();
    sysRolePO.setRoleName(bo.getRoleName());
    sysRolePO.setIsAdmin(bo.isAdmin());
    sysRolePO.setCreateUserId(sysUserId);
    sysRolePO.setCreateUserName(sysUserName);
    sysRolePO.setCreateDate(nowDate);
    this.sysRolePOMapper.insertSelective(sysRolePO);

    Integer sysRoleId = sysRolePO.getSysRoleId();

    List<Integer> sysMenuIdList = bo.getSysMenuIdList();
    for (Integer sysMenuId : sysMenuIdList) {

      SysRoleMenuRelPO po = new SysRoleMenuRelPO();
      po.setSysRoleId(sysRoleId);
      po.setSysMenuId(sysMenuId);
      po.setCreateUserId(sysUserId);
      po.setCreateUserName(sysUserName);
      po.setCreateDate(nowDate);

      this.sysRoleMenuRelPOMapper.insertSelective(po);
    }


    return new ResponseData<>();
  }

  @Override
  public ResponseData<PageInfo<SysRolePO>> getList(SysRoleGetListBO bo) {
    String roleName = bo.getRoleName();

    SysRolePOExample example = new SysRolePOExample();
    example.setOrderByClause(" create_date desc ");
    SysRolePOExample.Criteria criteria = example.createCriteria();
    if (StringUtils.isNotBlank(roleName)) {
      criteria.andRoleNameLike("%" + roleName + "%");
    }

    PageMethod.startPage(bo.getPageNum(), bo.getPageSize());
    List<SysRolePO> list = this.sysRolePOMapper.selectByExample(example);

    ResponseData<PageInfo<SysRolePO>> responseData = new ResponseData<>();
    responseData.setData(new PageInfo<>(list));
    return responseData;
  }

  @Override
  public ResponseData<List<SysMenuVO>> findMenus(Integer sysRoleId) {


    List<SysMenuPO> list = this.sysMenuPOMapper.selectBySysRoleId(sysRoleId);
    List<SysMenuVO> sysMenuVOList = this.getSysMenuVOList(list);
    List<SysMenuVO> treeList = this.initTreeMenu(sysMenuVOList, 0);

    ResponseData<List<SysMenuVO>> responseData = new ResponseData<>();
    responseData.setData(treeList);
    return responseData;
  }

  @Override
  public ResponseData<Object> update(SysRoleUpdateBO bo, SysUserPO sysUserPO) {
    Integer sysUserId = sysUserPO.getSysUserId();
    String sysUserName = sysUserPO.getName();
    Integer sysRoleId = bo.getSysRoleId();

    Date nowDate = new Date();
    SysRolePO sysRolePO = new SysRolePO();
    sysRolePO.setSysRoleId(bo.getSysRoleId());
    sysRolePO.setRoleName(bo.getRoleName());
    sysRolePO.setIsAdmin(bo.isAdmin());
    sysRolePO.setModifiedUserId(sysUserId);
    sysRolePO.setModifiedUserName(sysUserName);
    sysRolePO.setModifiedDate(nowDate);
    this.sysRolePOMapper.updateByPrimaryKeySelective(sysRolePO);

    SysRoleMenuRelPOExample exampleDelete = new SysRoleMenuRelPOExample();
    exampleDelete.createCriteria().andSysRoleIdEqualTo(sysRoleId);
    this.sysRoleMenuRelPOMapper.deleteByExample(exampleDelete);

    List<Integer> sysMenuIdList = bo.getSysMenuIdList();
    for (Integer sysMenuId : sysMenuIdList) {

      SysRoleMenuRelPO po = new SysRoleMenuRelPO();
      po.setSysRoleId(sysRoleId);
      po.setSysMenuId(sysMenuId);
      po.setCreateUserId(sysUserId);
      po.setCreateUserName(sysUserName);
      po.setCreateDate(nowDate);

      this.sysRoleMenuRelPOMapper.insertSelective(po);
    }


    return new ResponseData<>();
  }

  @Override
  public ResponseData<Object> delete(Integer sysRoleId, SysUserPO sysUserPO) {


    this.sysRolePOMapper.deleteByPrimaryKey(sysRoleId);
    return new ResponseData<>();
  }


  public List<SysMenuVO> initTreeMenu(List<SysMenuVO> menus, Integer rootId) {
    List<SysMenuVO> functionMenus = new ArrayList<>();

    for (SysMenuVO item : menus) {

      Integer sysMenuId = item.getSysMenuId();
      Integer preMenuId = item.getPreMenuId();

      // 初始化当前rootId的子结构
      if (rootId.equals(preMenuId)) {
        // 处理子结构的子结构
        List<SysMenuVO> childrenList = this.initTreeMenu(menus, sysMenuId);
        item.setChildrenList(childrenList);

        // 返回内容赋值
        functionMenus.add(item);
      }
    }
    return functionMenus;
  }


  public List<SysMenuVO> getSysMenuVOList(List<SysMenuPO> sysMenuPOList) {
    List<SysMenuVO> functionMenus = new ArrayList<>();

    for (SysMenuPO item : sysMenuPOList) {
      SysMenuVO sysMenuVO = new SysMenuVO();
      sysMenuVO.setSysMenuId(item.getSysMenuId());
      sysMenuVO.setPreMenuId(item.getPreMenuId());
      sysMenuVO.setMenuName(item.getMenuName());
      sysMenuVO.setUrl(item.getUrl());
      sysMenuVO.setValid(item.getValid());
      functionMenus.add(sysMenuVO);
    }
    return functionMenus;
  }

  @Override
  public ResponseData<SysRolePO> find(Integer sysRoleId) {

    ResponseData<SysRolePO> responseData = new ResponseData<>();
    SysRolePO sysRolePO = this.sysRolePOMapper.selectByPrimaryKey(sysRoleId);

    responseData.setData(sysRolePO);
    return responseData;
  }

}
