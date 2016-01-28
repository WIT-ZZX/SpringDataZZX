package com.wit.zzx.controller;

import com.wit.zzx.entity.Visitor;
import com.wit.zzx.redis.IRedisCacheService;
import com.wit.zzx.repository.VisitorRepository;
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

    @Autowired
    VisitorRepository visitorRepository;

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

    @RequestMapping(value = "/get/{key}")
    public String getRedis(@PathVariable("key")String key){
        List l = iRedisCacheService.getMessage(key);
//        System.out.println("............."+l.size());
        return "redis del success";
    }

    @RequestMapping(value = "/del/{key}")
    public String delKey(@PathVariable("key")String key){
        iRedisCacheService.clear(key);
        return "delete "+key+" success";
    }

    /**
     * 存一个对象hash到redis
     * @param id
     * @return
     */
    @RequestMapping(value = "/putObj/{id}")
    public String putObj(@PathVariable("id")int id){
        List<Visitor> list = visitorRepository.findById(id);

        if(list.size()!=0){
//            iRedisCacheService.putObject(list.get(0));
            for(Visitor v :list){
                iRedisCacheService.putObject(v);
            }
            return "存取一个对象到redis";
        }else {
            return "id未找到对象";
        }


    }

    /**
     * 存多个对象hash到redis
     * @param name
     * @return
     */
    @RequestMapping(value = "/put2Obj/{name}")
    public String putMoreObj(@PathVariable("name")String name){
        List<Visitor> list = visitorRepository.findByUsername(name);
        if(list.size()!=0){
            for(Visitor v :list){
                iRedisCacheService.putObject(v);
            }
            return "存取多个对象到redis";
        }else {
            return "根据"+name+"未找到对象";
        }
    }

    /**
     * 从Redis取一个对象
     * @param id
     * @return
     */
    @RequestMapping(value = "/getObj/{id}")
    public String getObj(@PathVariable("id")int id){
        List<Visitor> list = iRedisCacheService.getObj(id);
        if(list.size()!=0){
            return "id:"+list.get(0).getId()+" username:"+list.get(0).getUsername()+" password:"+list.get(0).getPassword();
        }else
            return "Not　Found";
    }
}
