CREATE TABLE IF NOT EXISTS t_visitor (
  id int NOT NULL AUTO_INCREMENT,
  username VARCHAR(10) NOT NULL  COMMENT '用户名',
  password VARCHAR(10) COMMENT '密码',
  PRIMARY KEY (id)
)DEFAULT CHARSET=utf8 COMMENT='游客用户表';

INSERT INTO t_visitor (username, password) VALUES ('zzx', '123');