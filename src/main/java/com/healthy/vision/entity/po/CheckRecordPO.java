package com.healthy.vision.entity.po;

import java.io.Serializable;
import java.util.Date;

public class CheckRecordPO implements Serializable {

  /**
   * 只读. 主键id. check_record_id
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "主键id", name = "checkRecordId", required = false, example = "")
  private Integer checkRecordId;
  /**
   * 只读. 微信用户id. wx_user_id
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "微信用户id", name = "wxUserId", required = false, example = "")
  private Integer wxUserId;
  /**
   * 只读. 设备id. device_id
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "设备id", name = "deviceId", required = false, example = "")
  private Integer deviceId;
  /**
   * 只读. 设备类型. device_type
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "设备类型", name = "deviceType", required = false, example = "")
  private String deviceType;
  /**
   * 只读. 检测日期. check_date
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "检测日期", name = "checkDate", required = false, example = "")
  private Date checkDate;
  /**
   * 只读. 数据类型：number-数字，picture-图像，图像只有一幅，图像类型时，左右眼标识忽略. data_type
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "数据类型：number-数字，picture-图像，图像只有一幅，图像类型时，左右眼标识忽略", name = "dataType",
      required = false, example = "")
  private String dataType;
  /**
   * 只读. 左右眼：OD-左眼，OS-右眼. eye_type
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "左右眼：OD-左眼，OS-右眼", name = "eyeType", required = false, example = "")
  private String eyeType;
  /**
   * 只读. 瞳孔大小. pupil
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "瞳孔大小", name = "pupil", required = false, example = "")
  private Double pupil;
  /**
   * 只读. CYL-等效球面度. se1
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "CYL-等效球面度", name = "se1", required = false, example = "")
  private Double se1;
  /**
   * 只读. CYL-球面度. ds1
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "CYL-球面度", name = "ds1", required = false, example = "")
  private Double ds1;
  /**
   * 只读. CYL-柱面度. dc1
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "CYL-柱面度", name = "dc1", required = false, example = "")
  private Double dc1;
  /**
   * 只读. CYL-柱面轴位角. axis1
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "CYL-柱面轴位角", name = "axis1", required = false, example = "")
  private Integer axis1;
  /**
   * 只读. CYL+等效球面度. se2
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "CYL+等效球面度", name = "se2", required = false, example = "")
  private Double se2;
  /**
   * 只读. CYL+球面度. ds2
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "CYL+球面度", name = "ds2", required = false, example = "")
  private Double ds2;
  /**
   * 只读. CYL+柱面度. dc2
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "CYL+柱面度", name = "dc2", required = false, example = "")
  private Double dc2;
  /**
   * 只读. CYL+柱面轴位角. axis2
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "CYL+柱面轴位角", name = "axis2", required = false, example = "")
  private Integer axis2;
  /**
   * 只读. 瞳距. pd
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "瞳距", name = "pd", required = false, example = "")
  private Integer pd;
  /**
   * 只读. 眼压. mm_hg
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "眼压", name = "mmHg", required = false, example = "")
  private Double mmHg;
  /**
   * 只读. 水平固视. gaze_horizontal
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "水平固视", name = "gazeHorizontal", required = false, example = "")
  private Integer gazeHorizontal;
  /**
   * 只读. 垂直固视. gazev_vertical
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "垂直固视", name = "gazevVertical", required = false, example = "")
  private Integer gazevVertical;
  /**
   * 只读. 校验码. check_code
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "校验码", name = "checkCode", required = false, example = "")
  private String checkCode;
  /**
   * 只读. 备注. remark
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "备注", name = "remark", required = false, example = "")
  private String remark;
  /**
   * 只读. 创建人id. create_user_id
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "创建人id", name = "createUserId", required = false, example = "")
  private Integer createUserId;
  /**
   * 只读. 创建人. create_user_name
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "创建人", name = "createUserName", required = false, example = "")
  private String createUserName;
  /**
   * 只读. 创建时间. create_create
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "创建时间", name = "createCreate", required = false, example = "")
  private Date createCreate;
  /**
   * 只读. 修改人id. modified_user_id
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "修改人id", name = "modifiedUserId", required = false, example = "")
  private Integer modifiedUserId;
  /**
   * 只读. 修改人. modified_user_name
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "修改人", name = "modifiedUserName", required = false, example = "")
  private String modifiedUserName;
  /**
   * 只读. 修改时间. modified_date
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "修改时间", name = "modifiedDate", required = false, example = "")
  private Date modifiedDate;
  /**
   * 只读. 数据有效性：1=有效；0=无效. valid
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "数据有效性：1=有效；0=无效", name = "valid", required = false, example = "")
  private Boolean valid;
  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  private static final long serialVersionUID = 1L;

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Integer getCheckRecordId() {
    return checkRecordId;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setCheckRecordId(Integer checkRecordId) {
    this.checkRecordId = checkRecordId;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Integer getWxUserId() {
    return wxUserId;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setWxUserId(Integer wxUserId) {
    this.wxUserId = wxUserId;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Integer getDeviceId() {
    return deviceId;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setDeviceId(Integer deviceId) {
    this.deviceId = deviceId;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getDeviceType() {
    return deviceType;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType == null ? null : deviceType.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Date getCheckDate() {
    return checkDate;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setCheckDate(Date checkDate) {
    this.checkDate = checkDate;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getDataType() {
    return dataType;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setDataType(String dataType) {
    this.dataType = dataType == null ? null : dataType.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getEyeType() {
    return eyeType;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setEyeType(String eyeType) {
    this.eyeType = eyeType == null ? null : eyeType.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Double getPupil() {
    return pupil;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setPupil(Double pupil) {
    this.pupil = pupil;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Double getSe1() {
    return se1;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setSe1(Double se1) {
    this.se1 = se1;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Double getDs1() {
    return ds1;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setDs1(Double ds1) {
    this.ds1 = ds1;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Double getDc1() {
    return dc1;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setDc1(Double dc1) {
    this.dc1 = dc1;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Integer getAxis1() {
    return axis1;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setAxis1(Integer axis1) {
    this.axis1 = axis1;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Double getSe2() {
    return se2;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setSe2(Double se2) {
    this.se2 = se2;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Double getDs2() {
    return ds2;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setDs2(Double ds2) {
    this.ds2 = ds2;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Double getDc2() {
    return dc2;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setDc2(Double dc2) {
    this.dc2 = dc2;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Integer getAxis2() {
    return axis2;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setAxis2(Integer axis2) {
    this.axis2 = axis2;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Integer getPd() {
    return pd;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setPd(Integer pd) {
    this.pd = pd;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Double getMmHg() {
    return mmHg;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setMmHg(Double mmHg) {
    this.mmHg = mmHg;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Integer getGazeHorizontal() {
    return gazeHorizontal;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setGazeHorizontal(Integer gazeHorizontal) {
    this.gazeHorizontal = gazeHorizontal;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Integer getGazevVertical() {
    return gazevVertical;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setGazevVertical(Integer gazevVertical) {
    this.gazevVertical = gazevVertical;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getCheckCode() {
    return checkCode;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setCheckCode(String checkCode) {
    this.checkCode = checkCode == null ? null : checkCode.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getRemark() {
    return remark;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setRemark(String remark) {
    this.remark = remark == null ? null : remark.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Integer getCreateUserId() {
    return createUserId;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setCreateUserId(Integer createUserId) {
    this.createUserId = createUserId;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getCreateUserName() {
    return createUserName;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setCreateUserName(String createUserName) {
    this.createUserName = createUserName == null ? null : createUserName.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Date getCreateCreate() {
    return createCreate;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setCreateCreate(Date createCreate) {
    this.createCreate = createCreate;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Integer getModifiedUserId() {
    return modifiedUserId;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setModifiedUserId(Integer modifiedUserId) {
    this.modifiedUserId = modifiedUserId;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getModifiedUserName() {
    return modifiedUserName;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setModifiedUserName(String modifiedUserName) {
    this.modifiedUserName = modifiedUserName == null ? null : modifiedUserName.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Date getModifiedDate() {
    return modifiedDate;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Boolean getValid() {
    return valid;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setValid(Boolean valid) {
    this.valid = valid;
  }
}