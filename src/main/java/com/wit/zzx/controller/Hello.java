package com.wit.zzx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zxZhang on 16/01/06.
 */
@RestController
public class Hello {
    @RequestMapping("/")
    public void hello(){
        System.out.println("hello world!");
    }
}
