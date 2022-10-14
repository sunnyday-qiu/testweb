package com.sunnyday.redis.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2022/7/6
 */
//@Component
public class RedisDemo {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public void setStr(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public String getStr(String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
