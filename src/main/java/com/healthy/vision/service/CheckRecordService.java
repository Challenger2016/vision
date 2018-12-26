package com.healthy.vision.service;

import com.github.pagehelper.PageInfo;
import com.healthy.vision.entity.bo.CheckRecordGetListBO;
import com.healthy.vision.entity.po.CheckRecordPO;
import com.healthy.vision.entity.vo.ResponseData;
/**
 * 检测记录管理
 * @author 董争光
 * 2018年12月26日下午3:46:33
 */
public interface CheckRecordService {
  
  /**
   * 分页查询检测记录列表
   * @param bo
   * @param pageNum
   * @param pageSize
   * @return
   */
  ResponseData<PageInfo<CheckRecordPO>> getList(CheckRecordGetListBO bo);
  
  /**
   * 查询检测记录明细
   * @param checkRecordId
   * @return
   */
  ResponseData<CheckRecordPO> find(Integer checkRecordId);
  
  /**
   * 更新检测记录
   * @param po
   * @return
   */
  ResponseData<Object> update(CheckRecordPO po);
  
  /**
   * 删除检测记录
   * @param checkRecordId
   * @return
   */
  ResponseData<Object> delete(Integer checkRecordId);
}
