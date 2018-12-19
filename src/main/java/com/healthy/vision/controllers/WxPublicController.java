package com.healthy.vision.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.healthy.vision.entity.po.WxPublicPO;
import com.healthy.vision.entity.vo.ResponseData;
import com.healthy.vision.service.WxPublicService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RequestMapping("/wxPublic")
@RestController
@Api(value="公众号相关接口")
public class WxPublicController{

  @Autowired 
  private WxPublicService wxPublicService;


    @ApiOperation(value = "查询公众号列表")
    @RequestMapping(value = "/getList",method = RequestMethod.POST)
    public ResponseData<List<WxPublicPO>> getList(){
      return wxPublicService.getList();
      
    }
    
    @ApiOperation(value = "新增公众号")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public ResponseData<Long> insert(@RequestBody WxPublicPO wxPublicPO){
      return wxPublicService.insert(wxPublicPO);
      
    }
    
    @ApiOperation(value = "修改公众号")
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ResponseData<Object> update(@RequestBody WxPublicPO wxPublicPO){
      return wxPublicService.update(wxPublicPO);
      
    }
    
    @ApiOperation(value = "删除公众号")
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public ResponseData<Object> delete(@RequestParam("wxPublicId")Long wxPublicId){
      return wxPublicService.delete(wxPublicId);
      
    }

    


}
