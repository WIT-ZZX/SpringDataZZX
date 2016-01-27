package com.wit.zzx.repository;

import com.wit.zzx.entity.Visitor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by zxZhang on 16/01/08.
 */
public interface VisitorRepository extends CrudRepository<Visitor, Integer> {

    List<Visitor> findByUsername(String username);

    List<Visitor> findById(int id);
}
