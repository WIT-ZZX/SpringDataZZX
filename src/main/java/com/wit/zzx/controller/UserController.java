package com.wit.zzx.controller;

import com.wit.zzx.entity.ObjectResult;
import com.wit.zzx.entity.User;
import com.wit.zzx.repository.UserRepository;
import com.wit.zzx.utils.HttpException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wjh on 2016/1/12.
 * 用户管理
 */
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserRepository userRepository;

    /**
     * 通过user 的id查找user表中的信息
     * @param id 用户id
     */
    @RequestMapping(value="/user/{id}",method=RequestMethod.GET)
    public Object getUser(@PathVariable("id") int id)throws HttpException{
        id=(id==0)?1:id;
        System.out.println("-----------------" + id);
        User user = userRepository.findById(id);
        ObjectResult obj=new ObjectResult("success",user);
        return obj;
    }
}
