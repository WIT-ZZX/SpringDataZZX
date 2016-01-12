package com.wit.zzx.controller;


import com.wit.zzx.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;
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

    @RequestMapping(value = "order/test_hello",method = RequestMethod.POST)
    public String makeBTest(HttpServletRequest request) throws Exception{
        RequestContext requestContext = new RequestContext(request);
        System.out.println(requestContext.getMessage("id"));
        return "hello world";
    }
}
