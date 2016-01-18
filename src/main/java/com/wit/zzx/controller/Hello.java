package com.wit.zzx.controller;

import com.wit.zzx.entity.Visitor;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zxZhang on 16/01/06.
 */
@RestController
public class Hello {
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public void hello(@RequestBody Visitor visitor ,HttpRequest request){
        System.out.println("hello world!");
        System.out.println("Visitor :"+ visitor.getId()+"_____"+visitor.getUsername()+"________"+visitor.getPassword());
    }

    @RequestMapping("/")
    public void hello(){
        System.out.println("hello world!");
    }
}
