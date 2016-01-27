package com.wit.zzx.controller;

import com.wit.zzx.redis.IRedisCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    @RequestMapping(value = "/add2/{key}/{value}")
    public String add2Redis(@PathVariable("key") String key, @PathVariable("value") String value){
        iRedisCacheService.addMessage(key,value);
        return "add2Redis success";
    }

    @RequestMapping(value = "get/{key}")
    public String getRedis(@PathVariable("key")String key){
        List l = iRedisCacheService.getMessage(key);
//        System.out.println("............."+l.size());
        return "redis del success";
    }

    @RequestMapping(value = "del/{key}")
    public String delKey(@PathVariable("key")String key){
        iRedisCacheService.clear(key);
        return "delete "+key+" success";
    }
}
