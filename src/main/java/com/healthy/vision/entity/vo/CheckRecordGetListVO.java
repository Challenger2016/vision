package com.healthy.vision.entity.vo;

public class CheckRecordGetListVO {

  @io.swagger.annotations.ApiModelProperty(value = "姓名", name = "name", required = false, example = "")
  private String name;

  @io.swagger.annotations.ApiModelProperty(value = "身份证号", name = "idNember", required = false, example = "")
  private String idNember;
  
  @io.swagger.annotations.ApiModelProperty(value = "年龄", name = "age", required = false, example = "")
  private Integer age;
  
  @io.swagger.annotations.ApiModelProperty(value = "检测日期", name = "checkDate", required = false, example = "")
  private String checkDate;
  
  @io.swagger.annotations.ApiModelProperty(value = "number-数字，picture-图像，图像只有一幅，图像类型时，左右眼标识忽略", name = "dataType", required = false, example = "")
  private String dataType;
  
  @io.swagger.annotations.ApiModelProperty(value = "左右眼：OD-左眼，OS-右眼", name = "eyeType", required = false, example = "")
  private String eyeType;

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
  
  
}
