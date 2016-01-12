package com.wit.zzx.repository;

import com.wit.zzx.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by zxZhang on 16/01/08.
 */
public interface OrderRepository extends JpaRepository<OrderEntity,Integer> {
    List<OrderEntity> findByOrderName(String orderName);
}
