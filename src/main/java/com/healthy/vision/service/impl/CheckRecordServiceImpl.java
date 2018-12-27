package com.healthy.vision.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageInfo;
import com.healthy.vision.entity.bo.CheckRecordGetListBO;
import com.healthy.vision.entity.po.CheckRecordPO;
import com.healthy.vision.entity.po.CheckRecordPOExample;
import com.healthy.vision.entity.po.CheckRecordPOExample.Criteria;
import com.healthy.vision.entity.vo.ResponseData;
import com.healthy.vision.mappers.CheckRecordPOMapper;
import com.healthy.vision.service.CheckRecordService;

public class CheckRecordServiceImpl implements CheckRecordService {

  @Autowired
  private CheckRecordPOMapper checkRecordPOMapper;
  
  @Override
  public ResponseData<PageInfo<CheckRecordPO>> getList(CheckRecordGetListBO bo) {

    String name = bo.getName();
    String idNember = bo.getIdNember();

    CheckRecordPOExample example = new CheckRecordPOExample();
    Criteria createCriteria = example.createCriteria();
    if (StringUtils.isNotBlank(name)) {
      //createCriteria.and
    }
    
    checkRecordPOMapper.selectByExample(example);
    return null;
  }

  @Override
  public ResponseData<CheckRecordPO> find(Integer checkRecordId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ResponseData<Object> update(CheckRecordPO po) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ResponseData<Object> delete(Integer checkRecordId) {
    // TODO Auto-generated method stub
    return null;
  }

  

}
