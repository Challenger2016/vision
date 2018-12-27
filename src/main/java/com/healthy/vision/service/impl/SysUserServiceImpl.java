package com.healthy.vision.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.healthy.vision.common.enums.SysResponseEnum;
import com.healthy.vision.common.utils.EncryptionUtils;
import com.healthy.vision.entity.bo.SysUserAddBO;
import com.healthy.vision.entity.bo.SysUserGetListBO;
import com.healthy.vision.entity.bo.SysUserLoginBO;
import com.healthy.vision.entity.bo.SysUserUpdateBO;
import com.healthy.vision.entity.po.SysRolePO;
import com.healthy.vision.entity.po.SysUserPO;
import com.healthy.vision.entity.po.SysUserPOExample;
import com.healthy.vision.entity.po.SysUserPOExample.Criteria;
import com.healthy.vision.entity.po.SysUserRoleRelPO;
import com.healthy.vision.entity.po.SysUserRoleRelPOExample;
import com.healthy.vision.entity.vo.ResponseData;
import com.healthy.vision.entity.vo.SysUserVO;
import com.healthy.vision.mappers.SysUserPOMapper;
import com.healthy.vision.mappers.SysUserRoleRelPOMapper;
import com.healthy.vision.service.SysRoleService;
import com.healthy.vision.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {

  @Autowired
  private SysUserPOMapper sysUserPOMapper;
  
  @Autowired
  private SysUserRoleRelPOMapper sysUserRoleRelPOMapper;
  
  @Autowired
  private SysRoleService sysRoleService;
  
  @Override
  public ResponseData<SysUserPO> login(SysUserLoginBO bo) {
    ResponseData<SysUserPO> responseData = new ResponseData<>();
    
    String phone = bo.getPhone();
    String password = EncryptionUtils.md5(bo.getPassword());
    
    SysUserPOExample example = new SysUserPOExample();
    example.createCriteria().andPhoneEqualTo(phone).andPasswordEqualTo(password);
    
    List<SysUserPO> list = sysUserPOMapper.selectByExample(example);
    if (CollectionUtils.isEmpty(list)) {
      responseData.setCode(SysResponseEnum.USER_LOGIN_FAILED.getCode());
      responseData.setMessage(SysResponseEnum.USER_LOGIN_FAILED.getMessage());
      return responseData;
    }
    
    responseData.setData(list.get(0));
    
    return responseData;
  }

  @Override
  public ResponseData<Object> add(SysUserAddBO bo, SysUserPO sysUserPO) {

    Integer createUserId = sysUserPO.getSysUserId();
    String createUserName = sysUserPO.getName();
    
    String password = EncryptionUtils.md5(bo.getPassword());

    Date nowDate = new Date();
    SysUserPO record = new SysUserPO();
    record.setName(bo.getName());
    record.setPassword(password);;
    record.setPhone(bo.getPhone());
    record.setCreateUserName(createUserName);
    record.setCreateDate(nowDate);
    record.setCreateUserId(createUserId);
    this.sysUserPOMapper.insertSelective(record);

    Integer sysUserId = record.getSysUserId();

    List<Integer> sysRoleIdList = bo.getSysRoleIdList();
    for (Integer sysRoleId : sysRoleIdList) {

      SysUserRoleRelPO po = new SysUserRoleRelPO();
      po.setSysUserId(sysUserId);
      po.setSysRoleId(sysRoleId);
      po.setCreateUserId(createUserId);
      po.setCreateUserName(createUserName);
      po.setCreateDate(nowDate);

      this.sysUserRoleRelPOMapper.insertSelective(po);
    }


    return new ResponseData<>();
  }

  @Override
  public ResponseData<PageInfo<SysUserPO>> getList(SysUserGetListBO bo) {
    String name = bo.getName();
    String sysUserCode = bo.getSysUserCode();
    String phone = bo.getPhone();
    
    SysUserPOExample example = new SysUserPOExample();
    Criteria criteria = example.createCriteria();
    if (StringUtils.isNotBlank(name)) {
      criteria.andNameLike("%" + name + "%");
    }
    if (StringUtils.isNotBlank(sysUserCode)) {
      criteria.andSysUserCodeLike("%" + sysUserCode + "%");
    }
    if (StringUtils.isNotBlank(phone)) {
      criteria.andPhoneLike("%" + phone + "%");
    }
    
    PageHelper.startPage(bo.getPageNum(), bo.getPageSize());
    List<SysUserPO> sysUserPOList = sysUserPOMapper.selectByExample(example);
    
    ResponseData<PageInfo<SysUserPO>> responseData = new ResponseData<>();
    responseData.setData(new PageInfo<>(sysUserPOList));
    return responseData;
  }

  @Override
  public ResponseData<SysUserVO> findById(Integer sysUserId) {
    // TODO Auto-generated method stub
    ResponseData<SysUserVO> responseData = new ResponseData<>();
    SysUserVO sysUserVO = new SysUserVO();
    
    SysUserPO sysUserPO = sysUserPOMapper.selectByPrimaryKey(sysUserId);
    sysUserVO.setSysUserPO(sysUserPO);

    List<SysRolePO> roleList = sysRoleService.getListByUserId(sysUserId).getData();
    sysUserVO.setRoleList(roleList);
    
    responseData.setData(sysUserVO);
    return responseData;
  }

  @Override
  public ResponseData<Object> update(SysUserUpdateBO bo, SysUserPO sysUserPO) {
    Integer createUserId = sysUserPO.getSysUserId();
    String createUserName = sysUserPO.getName();
    
    Integer sysUserId = bo.getSysUserId();
    
    String password = EncryptionUtils.md5(bo.getPassword());

    Date nowDate = new Date();
    SysUserPO record = new SysUserPO();
    record.setSysUserId(sysUserId);
    record.setName(bo.getName());
    record.setPassword(password);;
    record.setPhone(bo.getPhone());
    record.setCreateUserName(createUserName);
    record.setCreateDate(nowDate);
    record.setCreateUserId(createUserId);
    this.sysUserPOMapper.updateByPrimaryKeySelective(record);

    List<Integer> sysRoleIdList = bo.getSysRoleIdList();
    if (CollectionUtils.isNotEmpty(sysRoleIdList)) {
      
      SysUserRoleRelPOExample example = new SysUserRoleRelPOExample();
      example.createCriteria().andSysUserIdEqualTo(sysUserId);
      this.sysUserRoleRelPOMapper.deleteByExample(example);
      
      for (Integer sysRoleId : sysRoleIdList) {

        SysUserRoleRelPO po = new SysUserRoleRelPO();
        po.setSysUserId(sysUserId);
        po.setSysRoleId(sysRoleId);
        po.setCreateUserId(createUserId);
        po.setCreateUserName(createUserName);
        po.setCreateDate(nowDate);

        this.sysUserRoleRelPOMapper.insertSelective(po);
      }
    }
    return new ResponseData<>();
  }

  @Override
  public ResponseData<Object> delete(Integer sysUserId, SysUserPO sysUserPO) {

    sysUserPOMapper.deleteByPrimaryKey(sysUserId);
    return new ResponseData<>();
  }

  

}
