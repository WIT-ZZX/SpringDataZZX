package com.wit.zzx.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by zxZhang on 16/01/08.
 */
@Entity
@Table(name = "t_order")
public class OrderEntity implements Serializable{
    private int id;
    private String orderNumber;
    private String orderName;
    private int orderPrice;
    private String orderRemark;

    public OrderEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "order_number", nullable = false, insertable = true, updatable = true)
    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Column(name = "order_name", nullable = false, insertable = true, updatable = true)
    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Column(name = "order_price", nullable = false, insertable = true, updatable = true)
    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Column(name = "order_remark", nullable = false, insertable = true, updatable = true)
    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }
}
