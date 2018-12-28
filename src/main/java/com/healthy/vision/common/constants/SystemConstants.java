package com.healthy.vision.common.constants;

/**
 * 
 * @author 董争光
 * 2018年7月12日下午6:12:51
 */
public class SystemConstants {

  /**
   * 数据有效状态
   */
  public static final Boolean TABLE_VALID_EFFECTIVE = Boolean.TRUE;    //有效
  public static final Boolean TABLE_VALID_INVALID = Boolean.FALSE;    //无效

  /**
   * 系统用户状态
   */
  public static final Boolean SYS_USER_STATUS_DISABLE = Boolean.FALSE; //禁用
  public static final Boolean SYS_USER_STATUS_ENABLE = Boolean.TRUE; //启用

  /**
   * 券状态
   */
  public static final Byte COUPON_STATUS_CREATE = 1;    //新建
  public static final Byte COUPON_STATUS_ONLINE_BIND = 5;  //线上绑定
  public static final Byte COUPON_STATUS_SYNCHROING = 10;  //同步中
  public static final Byte COUPON_STATUS_USED = 20;  //未使用
  public static final Byte COUPON_STATUS_OVERDUE = 25;  //已过期
  public static final Byte COUPON_STATUS_UNUSED = 30;  //已使用


  public static final String WX_PUBLIC_TYPE_PUBLIC = "1";    //公众号
  public static final String WX_PUBLIC_TYPE_MINI = "2";    //小程序
  
  /**
   * 小程序业务类型：10-个人中心小程序，20-微商城小程序
   */
  public static final String MINI_PROGRAM_TYPE_PUBLIC = "00";    //
  public static final String MINI_PROGRAM_TYPE_PERSION = "10";    //
  public static final String MINI_PROGRAM_TYPE_MALL = "20";    //
  
  
  /**
   * 券使用类型
   */
  public static final Byte COUPON_USE_TYPE_ONLINE = 1;  //线上
  public static final Byte COUPON_USE_TYPE_OFFLINE = 2;  //线下
  
  
  public static final Byte COUPON_STATUS_CHANGE_BUSINESS_TYPE_OVERDUE = 1;  //过期
  public static final Byte COUPON_STATUS_CHANGE_BUSINESS_TYPE_USE = 2;  //核销
  public static final Byte COUPON_STATUS_CHANGE_BUSINESS_TYPE_TRANSFER = 3;  //转赠
  public static final Byte COUPON_STATUS_CHANGE_BUSINESS_TYPE_CANCEL_USE = 4;  //冲正

  /**
   * 券锁定类型
   */
  public static final Boolean COUPON_STATUS_CHANGE_IS_LOCK = Boolean.TRUE; //锁定
  public static final Boolean COUPON_STATUS_CHANGE_IS_UNLOCK = Boolean.FALSE; //未锁定

  /**
   * 券发放类型
   */
  public static final Byte COUPON_STATUS_CHANGE_SEND_TYPE = 105;  //受赠

  /**
   * 券绑定状态
   */
  public static final Boolean COUPON_BIND_STATUS_BIND = Boolean.TRUE;//绑定
  public static final Boolean COUPON_BIND_STATUS_UNBIND = Boolean.FALSE;//未绑定

  public static final long WECHAT_MESSAGE_RESULT_ERRORCODE = 0;


  public static final String CHARSET = "UTF-8";


  public static final String BUSSINESS_MODULE_CODE_WECHAT_OFFLINE_TRADE = "wechat_offline_trade";


  public static final String ROCKET_LOG_SEND_STATE_CREATE = "00";
  public static final String ROCKET_LOG_SEND_STATE_PRODUCER_FAIL = "05";
  public static final String ROCKET_LOG_SEND_STATE_PRODUCER_SUCCESS = "10";
  public static final String ROCKET_LOG_SEND_STATE_CONSUMER_FAIL = "15";
  public static final String ROCKET_LOG_SEND_STATE_CONSUMER_SUCCESS = "20";


  public static final String WECHAT_MESSAGE_LOG_SEND_STATE_CREATE = "00";
  public static final String WECHAT_MESSAGE_LOG_SEND_STATE_FAIL = "05";
  public static final String WECHAT_MESSAGE_LOG_SEND_STATE_SUCCESS = "10";
  
  public static final Boolean WECHAT_MESSAGE_LOG_IS_RESEND_YES = true;
  public static final Boolean WECHAT_MESSAGE_LOG_IS_RESEND_NO = false;
  
  public static final String WECHAT_VIP_FOCUS_STATE_YES = "Y"; 
  public static final String WECHAT_VIP_FOCUS_STATE_NO = "N";
  
  public static final String SYSTEM_TABLE_ACTIVE_STATE_YES = "Y";
  public static final String SYSTEM_TABLE_ACTIVE_STATE_NO = "N";
  
  public static final String WECHAT_TEMPLATE_SEND_STATE_YES = "Y";
  public static final String WECHAT_TEMPLATE_SEND_STATE_NO = "N";
  
  public static final String ROCKET_CONFIG_MODEL_NAME = "message";
  public static final String ROCKET_CONFIG_ROLE_TYPE_PRODUCER = "producer";
  public static final String ROCKET_CONFIG_ROLE_TYPE_CONSUMER = "consumer";
  
  public static final String ROCKET_CONFIG_BUSINESS_TYPE_WECHAT_SIMPLE_MESSAGE = "wechatSimpleMessage";
  
  public static final String ROCKET_TOPIC_SIMPLE_MESSAGE = "public_bizvane_message";
  
  public static final String ROCKET_TAG_SIMPLE = "wechat_simple_tag";

  public static final String ROCKET_TAG_SEND_COUPON = "wechat_tag_sendCoupon";

  public static final String ROCKET_CONFIG_BUSINESS_TYPE_WECHAT_SEND_COUPON = "wechatSendCoupon";
  
}
