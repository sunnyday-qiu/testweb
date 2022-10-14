package com.sunnyday.redis.test;

import com.sunnyday.redis.RedisApplication;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = RedisApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestRedis {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testGetStr() {
        System.out.println(redisTemplate.boundValueOps("test").get());
    }

    @Test
    public void testSet() {
        redisTemplate.boundValueOps("test").set(1L);
        testGetStr();
        redisTemplate.boundValueOps("test").increment();
        testGetStr();

        redisTemplate.boundValueOps("test").increment(2);
        testGetStr();

        redisTemplate.boundValueOps("test").increment(2.1);
        testGetStr();

        redisTemplate.boundValueOps("test").decrement();
        testGetStr();

        redisTemplate.boundValueOps("test").decrement(2);
        testGetStr();
    }
}
