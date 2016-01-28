package com.wit.zzx.redis;

import com.wit.zzx.entity.Visitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zxZhang on 16/01/22.
 */
@Service
public class RedisCacheService implements IRedisCacheService{

    @Autowired
    RedisTemplate<String,String> objectRedisTemplate;

    @Autowired
    RedisTemplate<String, Object> objectRedisTemplates;

    @Resource(name = "objectRedisTemplate")//引入redisConfig
    private ListOperations<String, String> listOperations;

    private BoundHashOperations<String,String ,String> boundHashOperations;

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
    public void putObject(Visitor visitor) {
        boundHashOperations = objectRedisTemplates.boundHashOps("visitor:" + visitor.getId());
        Map<String,String> data = new HashMap<String,String>();
        data.put("id",""+visitor.getId());
        data.put("username",visitor.getUsername());
        data.put("password",visitor.getPassword());
        boundHashOperations.putAll(data);
    }

    @Override
    public List<Visitor> getObj(int id) {
        HashOperations hashOperations = objectRedisTemplate.opsForHash();
        String ids = (String) hashOperations.get("visitor:" + id, "id");
        String username = (String) hashOperations.get("visitor:" + id,"username");
        String password = (String) hashOperations.get("visitor:" + id,"password");
        Visitor visitor = new Visitor();
        visitor.setId(Integer.parseInt(ids));
        visitor.setUsername(username);
        visitor.setPassword(password);
        List<Visitor> list = new ArrayList<>();
        list.add(visitor);
        return list;
    }


}
