package com.wit.zzx.service;

import com.wit.zzx.entity.Visitor;
import com.wit.zzx.repository.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zxZhang on 16/01/15.
 */
@Service
public class VisitorService implements IVisitorService{

    @Autowired
    VisitorRepository visitorRepository;

    @Override
    public void addVisitorOne(String username, String password) {
        Visitor visitor = new Visitor();
        visitor.setId(111);//自增长的,该ID不管用
        visitor.setUsername(username);
        visitor.setPassword(password);
        visitorRepository.save(visitor);
    }

    @Override
    public void addVisitorAll(String[] names, String[] passwords) {
        List<Visitor> vs = new ArrayList<Visitor>();
        for(int i=0; i<names.length && i<passwords.length; i++ ){
            Visitor visitor = new Visitor();
            visitor.setUsername(names[i]);
            visitor.setPassword(passwords[i]);
//            visitorRepository.save(visitor);//只会存储最后的一个对象
            vs.add(visitor);
        }
        visitorRepository.save(vs);
    }

    @Override
    public void deleteOne(int id) {
        visitorRepository.delete(id);
    }

    @Override
    public void deleteAll() {
        visitorRepository.deleteAll();
    }

    @Override
    public void deleteMore(String[] names, String[] passwords) {
        List<Visitor> vs = new ArrayList<Visitor>();
        for(int i=0; i<names.length && i<passwords.length; i++ ){
            Visitor visitor = new Visitor();
            visitor.setUsername(names[i]);
            visitor.setPassword(passwords[i]);
//            visitorRepository.save(visitor);//只会存储最后的一个对象
            vs.add(visitor);
        }
        visitorRepository.save(vs);
        visitorRepository.delete(vs);
    }
}
