package com.healthy.vision.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.healthy.vision.entity.bo.CheckRecordGetListBO;
import com.healthy.vision.entity.po.CheckRecordPO;
import com.healthy.vision.entity.vo.CheckRecordGetListVO;
import com.healthy.vision.entity.vo.ResponseData;
import com.healthy.vision.service.CheckRecordService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RequestMapping("/check-record")
@RestController
@Api(value = "检测记录相关接口")
public class CheckRecordController {

  @Autowired
  private CheckRecordService checkRecordService;


  @ApiOperation(value = "删除检测记录")
  @RequestMapping(value = "/delete/{checkRecordId}", method = RequestMethod.POST)
  public ResponseData<Object> delete(@PathVariable("checkRecordId")Integer checkRecordId) {
    return this.checkRecordService.delete(checkRecordId);

  }

  @ApiOperation(value = "查询检测记录明细")
  @RequestMapping(value = "/find/{checkRecordId}", method = RequestMethod.POST)
  public ResponseData<CheckRecordPO> find(@PathVariable("checkRecordId") Integer checkRecordId) {
    return this.checkRecordService.find(checkRecordId);

  }

  @ApiOperation(value = "分页查询检测记录列表")
  @RequestMapping(value = "/list", method = RequestMethod.POST)
  public ResponseData<PageInfo<CheckRecordGetListVO>> getList(@RequestBody CheckRecordGetListBO bo) {
    return this.checkRecordService.getList(bo);

  }

  @ApiOperation(value = "更新检测记录")
  @RequestMapping(value = "/update/{checkRecordId}", method = RequestMethod.POST)
  public ResponseData<Object> update(@PathVariable("checkRecordId") @RequestBody CheckRecordPO po) {
    return this.checkRecordService.update(po);

  }



}
