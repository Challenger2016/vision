package com.healthy.vision.common.redis;

import com.healthy.vision.common.utils.SpringContextHolder;

public class RedisClientManager {

  public static RedisClient getClient() {
    return SpringContextHolder.getBean(RedisClient.class);
  }
}
