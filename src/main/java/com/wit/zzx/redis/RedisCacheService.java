package com.wit.zzx.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zxZhang on 16/01/22.
 */
@Service
public class RedisCacheService implements IRedisCacheService{

    @Autowired
    RedisTemplate<String,String> objectRedisTemplate;

    @Resource(name = "objectRedisTemplate")//引入redis配置
    private ListOperations<String, String> listOperations;

    @Override
    public void addMessage(String key, String value) {
        listOperations.rightPush(key,value);
    }

    @Override
    public List<byte[]> getMessage(String key) {
//        byte[] b = objectRedisTemplate.getStringSerializer().serialize(key);
        String b = listOperations.leftPop(key);//只能取出一条记录
        System.out.println("............."+b);
        List<byte[]> list = null;
        return list;
    }

    @Override
    public void clear(String key) {
        if(objectRedisTemplate.hasKey(key)){
            objectRedisTemplate.delete(key);
        }else
            System.out.println("this "+key +" is not exist");
    }

    @Override
    public void putObject() {

    }


}
