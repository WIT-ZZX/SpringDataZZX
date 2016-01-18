CREATE TABLE IF NOT EXISTS t_order (
  id int NOT NULL AUTO_INCREMENT,
  order_number VARCHAR(10) NOT NULL  COMMENT '订单编号',
  order_name VARCHAR(10) COMMENT '订单名字',
  order_price INT COMMENT '订单价格',
  order_remark VARCHAR(50) COMMENT '订单备注',
  PRIMARY KEY (id)
) COMMENT='订单表';