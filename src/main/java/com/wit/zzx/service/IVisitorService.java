package com.wit.zzx.service;

import com.wit.zzx.entity.Visitor;

import java.util.List;

/**
 * Created by zxZhang on 16/01/15.
 */
public interface IVisitorService {

    void addVisitorOne(String username, String password);

    void addVisitorAll(String[] names, String[] passwords);

    void deleteOne(int id);

    void deleteAll();

    void deleteMore(String[] names, String[] passwords);

    void update(String beforename, String aftername);

    List<Visitor> findByName(String name);
}
