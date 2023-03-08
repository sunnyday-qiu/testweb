package com.sunnyday.redis.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2022/7/6
 */
@Component
public class RedisDemo {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Transactional
    public void setStr(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public String getStr(String key) {

        Boolean lock = redisTemplate.opsForValue().setIfAbsent("key", "value", 30, TimeUnit.SECONDS);

        return redisTemplate.opsForValue().get(key);
    }
}
