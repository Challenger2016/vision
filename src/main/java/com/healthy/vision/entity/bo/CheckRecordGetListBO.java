package com.healthy.vision.entity.bo;

public class CheckRecordGetListBO {

  @io.swagger.annotations.ApiModelProperty(value = "姓名", name = "name", required = false, example = "")
  private String name;

  @io.swagger.annotations.ApiModelProperty(value = "身份证号", name = "idNember", required = false, example = "")
  private String idNember;
  
  private int pageNum;
  
  private int pageSize;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getIdNember() {
    return idNember;
  }

  public void setIdNember(String idNember) {
    this.idNember = idNember;
  }

  public int getPageNum() {
    return pageNum;
  }

  public void setPageNum(int pageNum) {
    this.pageNum = pageNum;
  }

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }
  
  
}
