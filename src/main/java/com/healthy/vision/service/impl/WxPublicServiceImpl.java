package com.healthy.vision.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthy.vision.entity.po.WxPublicPO;
import com.healthy.vision.entity.po.WxPublicPOExample;
import com.healthy.vision.entity.vo.ResponseData;
import com.healthy.vision.mappers.WxPublicPOMapper;
import com.healthy.vision.service.WxPublicService;

@Service
public class WxPublicServiceImpl implements WxPublicService {

  @Autowired
  private WxPublicPOMapper wxPublicPOMapper;
  
  @Override
  public ResponseData<List<WxPublicPO>> getList() {
    // TODO Auto-generated method stub
    
    ResponseData<List<WxPublicPO>> responseData = new ResponseData<>();
    
    List<WxPublicPO> list = wxPublicPOMapper.selectByExample(new WxPublicPOExample());
    
    responseData.setData(list);
    return responseData;
  }

  @Override
  public ResponseData<Long> insert(WxPublicPO wxPublicPO) {
    ResponseData<Long> responseData = new ResponseData<>();
    
    wxPublicPOMapper.insertSelective(wxPublicPO);
    Long wxPublicId = wxPublicPO.getWxPublicId();
    
    responseData.setData(wxPublicId);
    return responseData;
  }

  @Override
  public ResponseData<Object> update(WxPublicPO wxPublicPO) {
    ResponseData<Object> responseData = new ResponseData<>();
    
    wxPublicPOMapper.updateByPrimaryKeySelective(wxPublicPO);

    return responseData;
  }

  @Override
  public ResponseData<Object> delete(Long wxPublicId) {
    ResponseData<Object> responseData = new ResponseData<>();
    
    wxPublicPOMapper.deleteByPrimaryKey(wxPublicId);

    return responseData;
  }

}
