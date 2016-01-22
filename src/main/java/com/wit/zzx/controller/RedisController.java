package com.wit.zzx.controller;

import com.wit.zzx.redis.IRedisCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zxZhang on 16/01/22.
 */
@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    IRedisCacheService iRedisCacheService;

    @RequestMapping(value = "/add")
    public String addRedis(){
        String key ="123";
        String value = "abc";
        iRedisCacheService.addMessage(key,value);
        return "addRedis success";
    }

}
