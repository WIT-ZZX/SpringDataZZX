package com.wit.zzx.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zxZhang on 16/01/22.
 */
@Service
public class RedisCacheService implements IRedisCacheService{

    @Autowired
    RedisTemplate<String,String> objectRedisTemplate;

    @Resource(name = "objectRedisTemplate")
    private ListOperations<String, String> listOperations;

    @Override
    public void addMessage(String key, String value) {
        listOperations.rightPush(key,value);
    }
}
