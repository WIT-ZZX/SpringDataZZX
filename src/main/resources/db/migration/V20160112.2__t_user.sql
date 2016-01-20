CREATE TABLE IF NOT EXISTS t_user (
  id int NOT NULL AUTO_INCREMENT,
  username VARCHAR(30) NOT NULL  COMMENT '用户姓名',
  password VARCHAR(40) COMMENT '密码',
  PRIMARY KEY (id)
) COMMENT='用户表';