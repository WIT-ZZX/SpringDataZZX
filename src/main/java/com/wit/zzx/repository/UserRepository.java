package com.wit.zzx.repository;

import com.wit.zzx.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * ��ѯ���ݿ�springdata�е�user�������
 * */
public interface UserRepository extends CrudRepository<User, Integer> {
    User findById(int id);
}
