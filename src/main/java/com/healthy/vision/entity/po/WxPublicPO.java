package com.healthy.vision.entity.po;

import java.io.Serializable;
import java.util.Date;

public class WxPublicPO implements Serializable {

  /**
   * 只读. 主键id. wx_public_id
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "主键id", name = "wxPublicId", required = false, example = "")
  private Long wxPublicId;
  /**
   * 只读. 小程序昵称. nick_name
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "小程序昵称", name = "nickName", required = false, example = "")
  private String nickName;
  /**
   * 只读. appid. appid
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "appid", name = "appid", required = false, example = "")
  private String appid;
  /**
   * 只读. 二维码图片的url. qr_code_url
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "二维码图片的url", name = "qrCodeUrl", required = false, example = "")
  private String qrCodeUrl;
  /**
   * 只读. 公众号头像. head_img_url
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "公众号头像", name = "headImgUrl", required = false, example = "")
  private String headImgUrl;
  /**
   * 只读. 公众号类型，0代表订阅号，1代表由历史老帐号升级后的订阅号，2代表服务号. service_type
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "公众号类型，0代表订阅号，1代表由历史老帐号升级后的订阅号，2代表服务号", name = "serviceType",
      required = false, example = "")
  private String serviceType;
  /**
   * 只读. 公众号认证类型，-1代表未认证，0代表微信认证，1代表新浪微博认证，2代表腾讯微博认证，3代表已资质认证通过但还未通过名称认证，4代表已资质认证通过、还未通过名称认证，但通过了新浪微博认证，5代表已资质认证通过、还未通过名称认证，但通过了腾讯微博认证. verify_type
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(
      value = "公众号认证类型，-1代表未认证，0代表微信认证，1代表新浪微博认证，2代表腾讯微博认证，3代表已资质认证通过但还未通过名称认证，4代表已资质认证通过、还未通过名称认证，但通过了新浪微博认证，5代表已资质认证通过、还未通过名称认证，但通过了腾讯微博认证",
      name = "verifyType", required = false, example = "")
  private String verifyType;
  /**
   * 只读. 授权刷新码. authorizer_refresh_token
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "授权刷新码", name = "authorizerRefreshToken", required = false,
      example = "")
  private String authorizerRefreshToken;
  /**
   * 只读. 授权码. authorizer_access_token
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "授权码", name = "authorizerAccessToken", required = false,
      example = "")
  private String authorizerAccessToken;
  /**
   * 只读. 授权码过期时间. authorizer_access_token_time
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "授权码过期时间", name = "authorizerAccessTokenTime", required = false,
      example = "")
  private Long authorizerAccessTokenTime;
  /**
   * 只读. jssdk token. jssdk_access_token
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "jssdk token", name = "jssdkAccessToken", required = false,
      example = "")
  private String jssdkAccessToken;
  /**
   * 只读. 授权方公众号所设置的微信号，可能为空. alias
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "授权方公众号所设置的微信号，可能为空", name = "alias", required = false, example = "")
  private String alias;
  /**
   * 只读. 账号介绍. signature
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "账号介绍", name = "signature", required = false, example = "")
  private String signature;
  /**
   * 只读. 是否开通微信门店功能. is_open_store
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "是否开通微信门店功能", name = "isOpenStore", required = false, example = "")
  private Boolean isOpenStore;
  /**
   * 只读. 是否开通微信扫商品功能. is_open_scan
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "是否开通微信扫商品功能", name = "isOpenScan", required = false, example = "")
  private Boolean isOpenScan;
  /**
   * 只读. 是否开通微信支付功能. is_open_pay
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "是否开通微信支付功能", name = "isOpenPay", required = false, example = "")
  private Boolean isOpenPay;
  /**
   * 只读. 是否开通微信卡券功能. is_open_card
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "是否开通微信卡券功能", name = "isOpenCard", required = false, example = "")
  private Boolean isOpenCard;
  /**
   * 只读. 是否开通微信摇一摇功能. is_open_shake
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "是否开通微信摇一摇功能", name = "isOpenShake", required = false, example = "")
  private Boolean isOpenShake;
  /**
   * 只读. 授权方公众号所设置的微信号，可能为空. code
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "授权方公众号所设置的微信号，可能为空", name = "code", required = false, example = "")
  private String code;
  /**
   * 只读. 原始id. originid
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "原始id", name = "originid", required = false, example = "")
  private String originid;
  /**
   * 只读. jssdk token 过期时间. jssdk_access_token_time
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "jssdk token 过期时间", name = "jssdkAccessTokenTime", required = false,
      example = "")
  private Long jssdkAccessTokenTime;
  /**
   * 只读. 第三方应用appid. platform_appid
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "第三方应用appid", name = "platformAppid", required = false, example = "")
  private String platformAppid;
  /**
   * 只读. 是否授权. is_connect
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "是否授权", name = "isConnect", required = false, example = "")
  private Boolean isConnect;
  /**
   * 只读. 可根据这个字段判断是否为小程序类型授权. mini_program_info
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "可根据这个字段判断是否为小程序类型授权", name = "miniProgramInfo", required = false,
      example = "")
  private String miniProgramInfo;
  /**
   * 只读. 公众号/小程序主体名称. principal_name
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "公众号/小程序主体名称", name = "principalName", required = false,
      example = "")
  private String principalName;
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
   * 只读. 创建时间. create_date
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "创建时间", name = "createDate", required = false, example = "")
  private Date createDate;
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
   * 只读. 数据有效性（1有效，0无效）. valid
   * @mbg.generated  2018-12-26 10:46:20
   */
  @io.swagger.annotations.ApiModelProperty(value = "数据有效性（1有效，0无效）", name = "valid", required = false, example = "")
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
  public Long getWxPublicId() {
    return wxPublicId;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setWxPublicId(Long wxPublicId) {
    this.wxPublicId = wxPublicId;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getNickName() {
    return nickName;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setNickName(String nickName) {
    this.nickName = nickName == null ? null : nickName.trim();
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
  public String getQrCodeUrl() {
    return qrCodeUrl;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setQrCodeUrl(String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl == null ? null : qrCodeUrl.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getHeadImgUrl() {
    return headImgUrl;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setHeadImgUrl(String headImgUrl) {
    this.headImgUrl = headImgUrl == null ? null : headImgUrl.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getServiceType() {
    return serviceType;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setServiceType(String serviceType) {
    this.serviceType = serviceType == null ? null : serviceType.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getVerifyType() {
    return verifyType;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setVerifyType(String verifyType) {
    this.verifyType = verifyType == null ? null : verifyType.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getAuthorizerRefreshToken() {
    return authorizerRefreshToken;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setAuthorizerRefreshToken(String authorizerRefreshToken) {
    this.authorizerRefreshToken = authorizerRefreshToken == null ? null : authorizerRefreshToken.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getAuthorizerAccessToken() {
    return authorizerAccessToken;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setAuthorizerAccessToken(String authorizerAccessToken) {
    this.authorizerAccessToken = authorizerAccessToken == null ? null : authorizerAccessToken.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Long getAuthorizerAccessTokenTime() {
    return authorizerAccessTokenTime;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setAuthorizerAccessTokenTime(Long authorizerAccessTokenTime) {
    this.authorizerAccessTokenTime = authorizerAccessTokenTime;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getJssdkAccessToken() {
    return jssdkAccessToken;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setJssdkAccessToken(String jssdkAccessToken) {
    this.jssdkAccessToken = jssdkAccessToken == null ? null : jssdkAccessToken.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getAlias() {
    return alias;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setAlias(String alias) {
    this.alias = alias == null ? null : alias.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getSignature() {
    return signature;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setSignature(String signature) {
    this.signature = signature == null ? null : signature.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Boolean getIsOpenStore() {
    return isOpenStore;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setIsOpenStore(Boolean isOpenStore) {
    this.isOpenStore = isOpenStore;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Boolean getIsOpenScan() {
    return isOpenScan;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setIsOpenScan(Boolean isOpenScan) {
    this.isOpenScan = isOpenScan;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Boolean getIsOpenPay() {
    return isOpenPay;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setIsOpenPay(Boolean isOpenPay) {
    this.isOpenPay = isOpenPay;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Boolean getIsOpenCard() {
    return isOpenCard;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setIsOpenCard(Boolean isOpenCard) {
    this.isOpenCard = isOpenCard;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Boolean getIsOpenShake() {
    return isOpenShake;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setIsOpenShake(Boolean isOpenShake) {
    this.isOpenShake = isOpenShake;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getCode() {
    return code;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setCode(String code) {
    this.code = code == null ? null : code.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getOriginid() {
    return originid;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setOriginid(String originid) {
    this.originid = originid == null ? null : originid.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Long getJssdkAccessTokenTime() {
    return jssdkAccessTokenTime;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setJssdkAccessTokenTime(Long jssdkAccessTokenTime) {
    this.jssdkAccessTokenTime = jssdkAccessTokenTime;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getPlatformAppid() {
    return platformAppid;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setPlatformAppid(String platformAppid) {
    this.platformAppid = platformAppid == null ? null : platformAppid.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public Boolean getIsConnect() {
    return isConnect;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setIsConnect(Boolean isConnect) {
    this.isConnect = isConnect;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getMiniProgramInfo() {
    return miniProgramInfo;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setMiniProgramInfo(String miniProgramInfo) {
    this.miniProgramInfo = miniProgramInfo == null ? null : miniProgramInfo.trim();
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public String getPrincipalName() {
    return principalName;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setPrincipalName(String principalName) {
    this.principalName = principalName == null ? null : principalName.trim();
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
  public Date getCreateDate() {
    return createDate;
  }

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
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
}