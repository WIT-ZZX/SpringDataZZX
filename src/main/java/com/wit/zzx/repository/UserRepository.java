package com.wit.zzx.repository;

import com.wit.zzx.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * 查询数据库springdata中的user表的数据
 * */
public interface UserRepository extends CrudRepository<User, Integer> {
    User findById(int id);
}
