package com.healthy.vision.service.impl;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.healthy.vision.common.enums.SysResponseEnum;
import com.healthy.vision.common.utils.EncryptionUtils;
import com.healthy.vision.entity.bo.SysUserAddBO;
import com.healthy.vision.entity.bo.SysUserGetListBO;
import com.healthy.vision.entity.bo.SysUserLoginBO;
import com.healthy.vision.entity.po.SysUserPO;
import com.healthy.vision.entity.po.SysUserPOExample;
import com.healthy.vision.entity.vo.ResponseData;
import com.healthy.vision.mappers.SysUserPOMapper;
import com.healthy.vision.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {

  @Autowired
  private SysUserPOMapper sysUserPOMapper;
  
  @Override
  public ResponseData<SysUserPO> login(SysUserLoginBO bo) {
    ResponseData<SysUserPO> responseData = new ResponseData<>();
    
    String phone = bo.getPhone();
    String password = EncryptionUtils.md5(bo.getPassword());
    
    SysUserPOExample example = new SysUserPOExample();
    example.createCriteria().andPhoneNumberEqualTo(phone).andPasswordEqualTo(password);
    
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
  public ResponseData<Object> add(SysUserAddBO bo) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ResponseData<PageInfo<SysUserPO>> getList(SysUserGetListBO bo) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ResponseData<SysUserPO> findById(Integer sysUserId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ResponseData<Object> update(SysUserAddBO po) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ResponseData<Object> delete(Integer sysUserId) {
    // TODO Auto-generated method stub
    return null;
  }

  

}
