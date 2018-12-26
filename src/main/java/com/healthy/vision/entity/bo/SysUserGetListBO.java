package com.healthy.vision.entity.bo;

public class SysUserGetListBO {

  @io.swagger.annotations.ApiModelProperty(value = "用户code", name = "sysUserCode", required = false, example = "")
  private String sysUserCode;

  @io.swagger.annotations.ApiModelProperty(value = "手机号", name = "phoneNumber", required = false, example = "")
  private String phoneNumber;

  @io.swagger.annotations.ApiModelProperty(value = "姓名", name = "name", required = false, example = "")
  private String name;
  
  private int pageNum;
  
  private int pageSize;

  public String getSysUserCode() {
    return sysUserCode;
  }

  public void setSysUserCode(String sysUserCode) {
    this.sysUserCode = sysUserCode;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
