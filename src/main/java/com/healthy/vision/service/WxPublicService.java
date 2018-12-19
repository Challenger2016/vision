package com.healthy.vision.service;

import java.util.List;

import com.healthy.vision.entity.po.WxPublicPO;
import com.healthy.vision.entity.vo.ResponseData;

public interface WxPublicService {
  
  ResponseData<List<WxPublicPO>> getList();
  
  ResponseData<Long> insert(WxPublicPO wxPublicPO);
  
  ResponseData<Object> update(WxPublicPO wxPublicPO);
  
  ResponseData<Object> delete(Long wxPublicId);

}
