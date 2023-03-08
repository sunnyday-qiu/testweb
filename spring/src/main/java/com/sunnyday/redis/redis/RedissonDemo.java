package com.sunnyday.redis.redis;


import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

public class RedissonDemo {


    public static void main(String[] args) {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://localhost:6379");
        RedissonClient redissonClient = Redisson.create(config);


        RLock lock = redissonClient.getLock("LOCK1");

        lock.lockAsync();

    }
}
