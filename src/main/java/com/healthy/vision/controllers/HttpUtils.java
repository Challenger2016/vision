package com.healthy.vision.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.healthy.vision.common.redis.RedisClientManager;
import com.healthy.vision.entity.po.SysUserPO;

@Component
public class HttpUtils {
  
  public static void login(HttpServletRequest request, SysUserPO sysUserPO) {
    String sessionId = request.getSession().getId();
    RedisClientManager.getClient().set("sessionid_" + sessionId, sysUserPO, 3600L);

  }
  
  public static void logout(HttpServletRequest request) {
    String sessionId = request.getSession().getId();
    
    RedisClientManager.getClient().remove("sessionid_" + sessionId);

  }

  public static SysUserPO getLoginSysUserPO(HttpServletRequest request) {
    String sessionId = request.getSession().getId();
    return (SysUserPO) (RedisClientManager.getClient().get("sessionid_" + sessionId));

  }
}
