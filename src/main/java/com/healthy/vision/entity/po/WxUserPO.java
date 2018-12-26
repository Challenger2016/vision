package com.healthy.vision.entity.po;

import java.io.Serializable;
import java.util.Date;

public class WxUserPO implements Serializable {

  /**
   * 只读. 主键id. wx_user_id
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "主键id", name = "wxUserId", required = false, example = "")
  private Integer wxUserId;
  /**
   * 只读. 小程序id. public_id
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "小程序id", name = "publicId", required = false, example = "")
  private Integer publicId;
  /**
   * 只读. appid. appid
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "appid", name = "appid", required = false, example = "")
  private String appid;
  /**
   * 只读. 微信openid. open_id
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "微信openid", name = "openId", required = false, example = "")
  private String openId;
  /**
   * 只读. 姓名. name
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "姓名", name = "name", required = false, example = "")
  private String name;
  /**
   * 只读. 微信昵称. wx_nick
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "微信昵称", name = "wxNick", required = false, example = "")
  private String wxNick;
  /**
   * 只读. 微信头像. head_portraits
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "微信头像", name = "headPortraits", required = false, example = "")
  private String headPortraits;
  /**
   * 只读. 性别,女：0 男：1. gender
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "性别,女：0 男：1", name = "gender", required = false, example = "")
  private String gender;
  /**
   * 只读. 年龄. age
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "年龄", name = "age", required = false, example = "")
  private Integer age;
  /**
   * 只读. 生日. birth_day
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "生日", name = "birthDay", required = false, example = "")
  private Date birthDay;
  /**
   * 只读. 身份证号. id_nember
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "身份证号", name = "idNember", required = false, example = "")
  private String idNember;
  /**
   * 只读. 省份. province
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "省份", name = "province", required = false, example = "")
  private String province;
  /**
   * 只读. 城市. city
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "城市", name = "city", required = false, example = "")
  private String city;
  /**
   * 只读. 区县. county
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "区县", name = "county", required = false, example = "")
  private String county;
  /**
   * 只读. 详细地址. detail_address
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "详细地址", name = "detailAddress", required = false, example = "")
  private String detailAddress;
  /**
   * 只读. 监护人. guardian_name
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "监护人", name = "guardianName", required = false, example = "")
  private String guardianName;
  /**
   * 只读. 监护关系：1-父亲，2-母亲，10-其他. guardian_relation
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "监护关系：1-父亲，2-母亲，10-其他", name = "guardianRelation", required = false,
      example = "")
  private String guardianRelation;
  /**
   * 只读. 监护人手机号. guardian_phone
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "监护人手机号", name = "guardianPhone", required = false, example = "")
  private String guardianPhone;
  /**
   * 只读. 监护人微信号. guardian_wechat
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "监护人微信号", name = "guardianWechat", required = false, example = "")
  private String guardianWechat;
  /**
   * 只读. 二维码地址. qr_code
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "二维码地址", name = "qrCode", required = false, example = "")
  private String qrCode;
  /**
   * 只读. 是否注册：0-未注册，1-已注册. is_register
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "是否注册：0-未注册，1-已注册", name = "isRegister", required = false,
      example = "")
  private Boolean isRegister;
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
  private Long createUserId;
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
  private Long modifiedUserId;
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
   * 只读. 版本号. version
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "版本号", name = "version", required = false, example = "")
  private Integer version;
  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  private static final long serialVersionUID = 1L;

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
  public Integer getPublicId() {
    return publicId;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setPublicId(Integer publicId) {
    this.publicId = publicId;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getAppid() {
    return appid;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setAppid(String appid) {
    this.appid = appid == null ? null : appid.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getOpenId() {
    return openId;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setOpenId(String openId) {
    this.openId = openId == null ? null : openId.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getName() {
    return name;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setName(String name) {
    this.name = name == null ? null : name.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getWxNick() {
    return wxNick;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setWxNick(String wxNick) {
    this.wxNick = wxNick == null ? null : wxNick.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getHeadPortraits() {
    return headPortraits;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setHeadPortraits(String headPortraits) {
    this.headPortraits = headPortraits == null ? null : headPortraits.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getGender() {
    return gender;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setGender(String gender) {
    this.gender = gender == null ? null : gender.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Integer getAge() {
    return age;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setAge(Integer age) {
    this.age = age;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Date getBirthDay() {
    return birthDay;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setBirthDay(Date birthDay) {
    this.birthDay = birthDay;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getIdNember() {
    return idNember;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setIdNember(String idNember) {
    this.idNember = idNember == null ? null : idNember.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getProvince() {
    return province;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setProvince(String province) {
    this.province = province == null ? null : province.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getCity() {
    return city;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setCity(String city) {
    this.city = city == null ? null : city.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getCounty() {
    return county;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setCounty(String county) {
    this.county = county == null ? null : county.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getDetailAddress() {
    return detailAddress;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress == null ? null : detailAddress.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getGuardianName() {
    return guardianName;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setGuardianName(String guardianName) {
    this.guardianName = guardianName == null ? null : guardianName.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getGuardianRelation() {
    return guardianRelation;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setGuardianRelation(String guardianRelation) {
    this.guardianRelation = guardianRelation == null ? null : guardianRelation.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getGuardianPhone() {
    return guardianPhone;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setGuardianPhone(String guardianPhone) {
    this.guardianPhone = guardianPhone == null ? null : guardianPhone.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getGuardianWechat() {
    return guardianWechat;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setGuardianWechat(String guardianWechat) {
    this.guardianWechat = guardianWechat == null ? null : guardianWechat.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getQrCode() {
    return qrCode;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setQrCode(String qrCode) {
    this.qrCode = qrCode == null ? null : qrCode.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Boolean getIsRegister() {
    return isRegister;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setIsRegister(Boolean isRegister) {
    this.isRegister = isRegister;
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
  public Long getCreateUserId() {
    return createUserId;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setCreateUserId(Long createUserId) {
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
  public Long getModifiedUserId() {
    return modifiedUserId;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setModifiedUserId(Long modifiedUserId) {
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

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Integer getVersion() {
    return version;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setVersion(Integer version) {
    this.version = version;
  }
}