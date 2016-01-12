package com.wit.zzx.controller;


import com.wit.zzx.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zxZhang on 16/01/08.
 */
@RestController
@RequestMapping("/api")
public class OrderController{
    private IOrderService orderService = null;

    @Autowired
    public void setOrderService(IOrderService service){ this.orderService = service; }

    @RequestMapping("order/test")
    public List makeATest(){

        List list = this.orderService.findByOrderName("zzx");
        return list;
    }
}
