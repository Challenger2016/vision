package com.healthy.vision.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.healthy.vision.entity.bo.CheckRecordGetListBO;
import com.healthy.vision.entity.po.CheckRecordPO;
import com.healthy.vision.entity.vo.CheckRecordGetListVO;
import com.healthy.vision.entity.vo.ResponseData;
import com.healthy.vision.mappers.CheckRecordPOMapper;
import com.healthy.vision.service.CheckRecordService;

@Service
public class CheckRecordServiceImpl implements CheckRecordService {

  @Autowired
  private CheckRecordPOMapper checkRecordPOMapper;
  
  @Override
  public ResponseData<PageInfo<CheckRecordGetListVO>> getList(CheckRecordGetListBO bo) {
    
    PageHelper.offsetPage(bo.getPageNum(), bo.getPageSize());
    
    List<CheckRecordGetListVO> list = checkRecordPOMapper.selectByCondition(bo);
    
    ResponseData<PageInfo<CheckRecordGetListVO>> responseData  = new ResponseData<>();
    responseData.setData(new PageInfo<>(list));
    
    return responseData;
  }

  @Override
  public ResponseData<CheckRecordPO> find(Integer checkRecordId) {

    CheckRecordPO checkRecordPO = checkRecordPOMapper.selectByPrimaryKey(checkRecordId);
    
    ResponseData<CheckRecordPO> responseData = new ResponseData<CheckRecordPO>();
    responseData.setData(checkRecordPO);
    return responseData;
  }

  @Override
  public ResponseData<Object> update(CheckRecordPO po) {

    checkRecordPOMapper.updateByPrimaryKeySelective(po);
    return new ResponseData<>();
  }

  @Override
  public ResponseData<Object> delete(Integer checkRecordId) {
    
    checkRecordPOMapper.deleteByPrimaryKey(checkRecordId);
    return new ResponseData<>();
  }

  

}
