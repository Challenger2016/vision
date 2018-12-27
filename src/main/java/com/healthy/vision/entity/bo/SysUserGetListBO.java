package com.healthy.vision.entity.bo;

public class SysUserGetListBO {

  @io.swagger.annotations.ApiModelProperty(value = "用户code", name = "sysUserCode", required = false, example = "")
  private String sysUserCode;

  @io.swagger.annotations.ApiModelProperty(value = "手机号", name = "phone", required = false, example = "")
  private String phone;

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



  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
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
