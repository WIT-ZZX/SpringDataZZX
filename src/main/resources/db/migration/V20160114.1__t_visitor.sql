CREATE TABLE IF NOT EXISTS t_visitor (
  id int NOT NULL,
  username VARCHAR(10) NOT NULL  COMMENT '用户名',
  password VARCHAR(10) COMMENT '密码',
  PRIMARY KEY (id)
) COMMENT='游客用户表';