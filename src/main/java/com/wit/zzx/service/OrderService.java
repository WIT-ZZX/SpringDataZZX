package com.wit.zzx.service;


import com.wit.zzx.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zxZhang on 16/01/08.
 */
@Service
public class OrderService implements IOrderService{
    private OrderRepository orderRepository = null;
    @Autowired
    public void setOrderRepository(OrderRepository repository){ this.orderRepository = repository; }
    @Override
    public List findByOrderName(String orderName) {

//        List list = orderRepository.findAll();
        List list = orderRepository.findByOrderName(orderName);
        return list;
    }
}
