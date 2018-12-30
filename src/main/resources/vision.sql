/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : vision

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-12-30 16:19:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_check_record
-- ----------------------------
DROP TABLE IF EXISTS `t_check_record`;
CREATE TABLE `t_check_record` (
  `check_record_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `wx_user_id` int(11) DEFAULT NULL COMMENT '微信用户id',
  `device_id` int(11) DEFAULT NULL COMMENT '设备id',
  `device_type` varchar(20) DEFAULT NULL COMMENT '设备类型',
  `check_date` datetime DEFAULT NULL COMMENT '检测日期',
  `data_type` varchar(20) DEFAULT NULL COMMENT '数据类型：number-数字，picture-图像，图像只有一幅，图像类型时，左右眼标识忽略',
  `eye_type` varchar(20) DEFAULT NULL COMMENT '左右眼：OD-左眼，OS-右眼',
  `pupil` double(5,1) DEFAULT NULL COMMENT '瞳孔大小',
  `se1` double(5,2) DEFAULT NULL COMMENT 'CYL-等效球面度',
  `ds1` double(5,2) DEFAULT NULL COMMENT 'CYL-球面度',
  `dc1` double(5,2) DEFAULT NULL COMMENT 'CYL-柱面度',
  `axis1` int(11) DEFAULT NULL COMMENT 'CYL-柱面轴位角',
  `se2` double(5,2) DEFAULT NULL COMMENT 'CYL+等效球面度',
  `ds2` double(5,2) DEFAULT NULL COMMENT 'CYL+球面度',
  `dc2` double(5,2) DEFAULT NULL COMMENT 'CYL+柱面度',
  `axis2` int(11) DEFAULT NULL COMMENT 'CYL+柱面轴位角',
  `pd` int(11) DEFAULT NULL COMMENT '瞳距',
  `mm_hg` double(5,1) DEFAULT NULL COMMENT '眼压',
  `gaze_horizontal` int(11) DEFAULT NULL COMMENT '水平固视',
  `gazev_vertical` int(11) DEFAULT NULL COMMENT '垂直固视',
  `check_code` varchar(50) DEFAULT NULL COMMENT '校验码',
  `remark` varchar(300) DEFAULT NULL COMMENT '备注',
  `create_user_id` int(20) DEFAULT NULL COMMENT '创建人id',
  `create_user_name` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modified_user_id` int(20) DEFAULT NULL COMMENT '修改人id',
  `modified_user_name` varchar(50) DEFAULT NULL COMMENT '修改人',
  `modified_date` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  `valid` tinyint(1) DEFAULT '1' COMMENT '数据有效性：1=有效；0=无效',
  PRIMARY KEY (`check_record_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for t_device
-- ----------------------------
DROP TABLE IF EXISTS `t_device`;
CREATE TABLE `t_device` (
  `device_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `device_code` varchar(50) DEFAULT NULL COMMENT '设备编号',
  `device_name` varchar(50) DEFAULT NULL COMMENT '设备名称',
  `device_type` varchar(20) DEFAULT NULL COMMENT '设备类型：10-筛选仪，20-检测器',
  `address` varchar(255) DEFAULT NULL COMMENT '设备地址',
  `remark` varchar(300) DEFAULT NULL COMMENT '备注',
  `create_user_id` int(20) DEFAULT NULL COMMENT '创建人id',
  `create_user_name` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modified_user_id` int(20) DEFAULT NULL COMMENT '修改人id',
  `modified_user_name` varchar(50) DEFAULT NULL COMMENT '修改人',
  `modified_date` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  `valid` tinyint(1) DEFAULT '1' COMMENT '数据有效性：1=有效；0=无效',
  PRIMARY KEY (`device_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='设备表';

-- ----------------------------
-- Table structure for t_sys_dictionary
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_dictionary`;
CREATE TABLE `t_sys_dictionary` (
  `sys_dictionary_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id示例8888',
  `code` varchar(255) DEFAULT NULL COMMENT 'code',
  `type` varchar(255) DEFAULT NULL COMMENT '类型',
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `value` varchar(255) DEFAULT NULL COMMENT '值',
  `sort` bigint(10) DEFAULT NULL COMMENT '显示顺序',
  `remark` varchar(300) DEFAULT NULL COMMENT '备注',
  `create_user_id` int(11) DEFAULT NULL COMMENT '创建人id',
  `create_user_name` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_date` datetime DEFAULT NULL COMMENT '创建日期',
  `modified_user_id` int(11) DEFAULT NULL COMMENT '修改人id',
  `modified_user_name` varchar(50) DEFAULT NULL COMMENT '修改人',
  `modified_date` datetime DEFAULT NULL COMMENT '修改时间',
  `valid` tinyint(1) DEFAULT '1' COMMENT '数据有效性：1=有效；0=无效',
  PRIMARY KEY (`sys_dictionary_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COMMENT='字典表';

-- ----------------------------
-- Table structure for t_sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_menu`;
CREATE TABLE `t_sys_menu` (
  `sys_menu_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'pkid',
  `menu_code` varchar(20) DEFAULT NULL COMMENT '菜单code',
  `menu_name` varchar(500) DEFAULT NULL COMMENT '菜单名称',
  `pre_menu_id` int(11) DEFAULT NULL COMMENT '上级菜单id',
  `url` varchar(255) DEFAULT NULL COMMENT '菜单URL',
  `icon` varchar(255) DEFAULT NULL COMMENT '菜单icon',
  `sort` int(11) DEFAULT NULL COMMENT '显示顺序',
  `remark` varchar(300) DEFAULT NULL COMMENT '备注',
  `create_user_id` int(11) DEFAULT NULL COMMENT '创建人id',
  `create_user_name` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_date` datetime DEFAULT NULL COMMENT '创建日期',
  `modified_user_id` int(11) DEFAULT NULL COMMENT '修改人id',
  `modified_user_name` varchar(50) DEFAULT NULL COMMENT '修改人',
  `modified_date` datetime DEFAULT NULL COMMENT '修改时间',
  `valid` tinyint(1) DEFAULT '1' COMMENT '数据有效性：1=有效；0=无效',
  PRIMARY KEY (`sys_menu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=132 DEFAULT CHARSET=utf8mb4 COMMENT='菜单表';

-- ----------------------------
-- Table structure for t_sys_role
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role`;
CREATE TABLE `t_sys_role` (
  `sys_role_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '企业角色id',
  `role_code` varchar(20) DEFAULT NULL COMMENT '角色code',
  `role_name` varchar(20) DEFAULT NULL COMMENT '角色名称',
  `is_admin` tinyint(1) unsigned DEFAULT '0' COMMENT '是否为管理员',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态：0=禁用；1=启用',
  `remark` varchar(300) DEFAULT NULL COMMENT '备注',
  `create_user_id` int(11) DEFAULT NULL COMMENT '创建人id',
  `create_user_name` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_date` datetime DEFAULT NULL COMMENT '创建日期',
  `modified_user_id` int(11) DEFAULT NULL COMMENT '修改人id',
  `modified_user_name` varchar(50) DEFAULT NULL COMMENT '修改人',
  `modified_date` datetime DEFAULT NULL COMMENT '修改时间',
  `valid` tinyint(1) DEFAULT '1' COMMENT '数据有效性：1=有效；0=无效',
  PRIMARY KEY (`sys_role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4568 DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Table structure for t_sys_role_menu_rel
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role_menu_rel`;
CREATE TABLE `t_sys_role_menu_rel` (
  `sys_role_menu_rel_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'pkid',
  `sys_role_id` int(11) DEFAULT NULL COMMENT '角色id',
  `sys_menu_id` int(11) DEFAULT NULL COMMENT '菜单id',
  `remark` varchar(300) DEFAULT NULL COMMENT '备注',
  `create_user_id` int(11) DEFAULT NULL COMMENT '创建人id',
  `create_user_name` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_date` datetime DEFAULT NULL COMMENT '创建日期',
  `modified_user_id` int(11) DEFAULT NULL COMMENT '修改人id',
  `modified_user_name` varchar(50) DEFAULT NULL COMMENT '修改人',
  `modified_date` datetime DEFAULT NULL COMMENT '修改时间',
  `valid` tinyint(1) DEFAULT '1' COMMENT '数据有效性：1=有效；0=无效',
  PRIMARY KEY (`sys_role_menu_rel_id`)
) ENGINE=InnoDB AUTO_INCREMENT=35285 DEFAULT CHARSET=utf8 COMMENT='角色 菜单，关系表';

-- ----------------------------
-- Table structure for t_sys_user
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user`;
CREATE TABLE `t_sys_user` (
  `sys_user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'pkid',
  `sys_user_code` varchar(20) DEFAULT NULL COMMENT '用户code',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `name` varchar(500) DEFAULT NULL COMMENT '姓名',
  `position` varchar(50) DEFAULT NULL COMMENT '岗位',
  `status` tinyint(1) DEFAULT '1' COMMENT '状态：0=禁用；1=启用',
  `last_login_date` datetime DEFAULT NULL COMMENT '上一次登录时间',
  `remark` varchar(300) DEFAULT NULL COMMENT '备注',
  `create_user_id` int(11) DEFAULT NULL COMMENT '创建人id',
  `create_user_name` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_date` datetime DEFAULT NULL COMMENT '创建日期',
  `modified_user_id` int(11) DEFAULT NULL COMMENT '修改人id',
  `modified_user_name` varchar(50) DEFAULT NULL COMMENT '修改人',
  `modified_date` datetime DEFAULT NULL COMMENT '修改时间',
  `valid` tinyint(1) DEFAULT '1' COMMENT '数据有效性：1=有效；0=无效',
  PRIMARY KEY (`sys_user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13314 DEFAULT CHARSET=utf8 COMMENT='用户账号表';

-- ----------------------------
-- Table structure for t_sys_user_role_rel
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user_role_rel`;
CREATE TABLE `t_sys_user_role_rel` (
  `sys_user_role_rel_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'pkid',
  `sys_user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `sys_role_id` int(11) DEFAULT NULL COMMENT '角色id',
  `remark` varchar(300) DEFAULT NULL COMMENT '备注',
  `create_user_id` int(11) DEFAULT NULL COMMENT '创建人id',
  `create_user_name` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_date` datetime DEFAULT NULL COMMENT '创建日期',
  `modified_user_id` int(11) DEFAULT NULL COMMENT '修改人id',
  `modified_user_name` varchar(50) DEFAULT NULL COMMENT '修改人',
  `modified_date` datetime DEFAULT NULL COMMENT '修改时间',
  `valid` tinyint(1) DEFAULT '1' COMMENT '数据有效性：1=有效；0=无效',
  PRIMARY KEY (`sys_user_role_rel_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4810 DEFAULT CHARSET=utf8 COMMENT='账号角色，关系表';

-- ----------------------------
-- Table structure for t_wx_public
-- ----------------------------
DROP TABLE IF EXISTS `t_wx_public`;
CREATE TABLE `t_wx_public` (
  `wx_public_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `nick_name` varchar(100) DEFAULT NULL COMMENT '小程序昵称',
  `appid` varchar(100) DEFAULT NULL COMMENT 'appid',
  `qr_code_url` varchar(255) DEFAULT NULL COMMENT '二维码图片的url',
  `head_img_url` varchar(255) DEFAULT NULL COMMENT '公众号头像',
  `service_type` char(1) DEFAULT NULL COMMENT '公众号类型，0代表订阅号，1代表由历史老帐号升级后的订阅号，2代表服务号',
  `verify_type` char(2) DEFAULT NULL COMMENT '公众号认证类型，-1代表未认证，0代表微信认证，1代表新浪微博认证，2代表腾讯微博认证，3代表已资质认证通过但还未通过名称认证，4代表已资质认证通过、还未通过名称认证，但通过了新浪微博认证，5代表已资质认证通过、还未通过名称认证，但通过了腾讯微博认证',
  `authorizer_refresh_token` varchar(200) DEFAULT NULL COMMENT '授权刷新码',
  `authorizer_access_token` varchar(200) DEFAULT NULL COMMENT '授权码',
  `authorizer_access_token_time` bigint(20) DEFAULT NULL COMMENT '授权码过期时间',
  `jssdk_access_token` varchar(200) DEFAULT NULL COMMENT 'jssdk token',
  `alias` varchar(50) DEFAULT NULL COMMENT '授权方公众号所设置的微信号，可能为空',
  `signature` varchar(500) DEFAULT NULL COMMENT '账号介绍',
  `is_open_store` tinyint(1) DEFAULT NULL COMMENT '是否开通微信门店功能',
  `is_open_scan` tinyint(1) DEFAULT NULL COMMENT '是否开通微信扫商品功能',
  `is_open_pay` tinyint(1) DEFAULT NULL COMMENT '是否开通微信支付功能',
  `is_open_card` tinyint(1) DEFAULT NULL COMMENT '是否开通微信卡券功能',
  `is_open_shake` tinyint(1) DEFAULT NULL COMMENT '是否开通微信摇一摇功能',
  `code` varchar(100) DEFAULT NULL COMMENT '授权方公众号所设置的微信号，可能为空',
  `originid` varchar(100) DEFAULT NULL COMMENT '原始id',
  `jssdk_access_token_time` bigint(20) DEFAULT NULL COMMENT 'jssdk token 过期时间',
  `platform_appid` varchar(100) DEFAULT NULL COMMENT '第三方应用appid',
  `is_connect` tinyint(1) DEFAULT NULL COMMENT '是否授权',
  `mini_program_info` varchar(1000) DEFAULT NULL COMMENT '可根据这个字段判断是否为小程序类型授权',
  `principal_name` varchar(100) DEFAULT NULL COMMENT '公众号/小程序主体名称',
  `remark` varchar(300) DEFAULT NULL COMMENT '备注',
  `create_user_id` bigint(20) DEFAULT NULL COMMENT '创建人id',
  `create_user_name` varchar(255) DEFAULT NULL COMMENT '创建人',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `modified_user_id` bigint(20) DEFAULT NULL COMMENT '修改人id',
  `modified_user_name` varchar(255) DEFAULT NULL COMMENT '修改人',
  `modified_date` datetime DEFAULT NULL COMMENT '修改时间',
  `valid` tinyint(1) DEFAULT '1' COMMENT '数据有效性（1有效，0无效）',
  PRIMARY KEY (`wx_public_id`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8mb4 COMMENT='小程序表';

-- ----------------------------
-- Table structure for t_wx_user
-- ----------------------------
DROP TABLE IF EXISTS `t_wx_user`;
CREATE TABLE `t_wx_user` (
  `wx_user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `public_id` int(11) DEFAULT NULL COMMENT '小程序id',
  `appid` varchar(100) DEFAULT NULL COMMENT 'appid',
  `open_id` varchar(100) DEFAULT NULL COMMENT '微信openid',
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `wx_nick` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '微信昵称',
  `head_portraits` varchar(255) DEFAULT NULL COMMENT '微信头像',
  `gender` varchar(2) DEFAULT NULL COMMENT '性别,女：0 男：1',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `birth_day` datetime DEFAULT NULL COMMENT '生日',
  `id_nember` varchar(30) DEFAULT NULL COMMENT '身份证号',
  `province` varchar(50) DEFAULT NULL COMMENT '省份',
  `city` varchar(50) DEFAULT NULL COMMENT '城市',
  `county` varchar(50) DEFAULT NULL COMMENT '区县',
  `detail_address` varchar(255) DEFAULT NULL COMMENT '详细地址',
  `guardian_name` varchar(20) DEFAULT NULL COMMENT '监护人',
  `guardian_relation` varchar(2) DEFAULT NULL COMMENT '监护关系：1-父亲，2-母亲，10-其他',
  `guardian_phone` varchar(20) DEFAULT NULL COMMENT '监护人手机号',
  `guardian_wechat` varchar(30) DEFAULT NULL COMMENT '监护人微信号',
  `qr_code` varchar(255) DEFAULT NULL COMMENT '二维码地址',
  `is_register` tinyint(1) DEFAULT NULL COMMENT '是否注册：0-未注册，1-已注册',
  `remark` varchar(300) DEFAULT NULL COMMENT '备注',
  `create_user_id` bigint(20) DEFAULT NULL COMMENT '创建人id',
  `create_user_name` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modified_user_id` bigint(20) DEFAULT NULL COMMENT '修改人id',
  `modified_user_name` varchar(50) DEFAULT NULL COMMENT '修改人',
  `modified_date` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  `valid` tinyint(1) DEFAULT '1' COMMENT '数据有效性：1=有效；0=无效',
  `version` int(11) DEFAULT '1' COMMENT '版本号',
  PRIMARY KEY (`wx_user_id`),
  KEY `open_id` (`open_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='微信用户表';

-- ----------------------------
-- Event structure for 1
-- ----------------------------
DROP EVENT IF EXISTS `1`;
DELIMITER ;;
CREATE DEFINER=`bizvane_2018`@`%` EVENT `1` ON SCHEDULE EVERY 1 SECOND STARTS '2018-11-12 21:06:31' ON COMPLETION NOT PRESERVE ENABLE DO SELECT
    count(*)
FROM
    t_coupon_entity
WHERE
    coupon_name = 'B全渠道转增券'
AND coupon_status = 20
;;
DELIMITER ;
