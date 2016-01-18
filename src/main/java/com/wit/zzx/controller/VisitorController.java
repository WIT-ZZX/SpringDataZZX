package com.wit.zzx.controller;

import com.wit.zzx.entity.Visitor;
import com.wit.zzx.service.IVisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zxZhang on 16/01/15.
 */
@RestController
@RequestMapping("/visitor")
public class VisitorController {
    @Autowired
    IVisitorService iVisitorService;

    /**
     * 增加一条数据到数据库
     * @return
     */
    @RequestMapping(value = "/saveOne")
    public boolean saveOne(){
        iVisitorService.addVisitorOne("zzzzz","123");
        return true;
    }

    /**
     * 增加多条数据到数据库
     * @return
     */
    @RequestMapping(value = "/saveAll")
    public String saveAll(){
        String[] names = {"aaa","bbb","ccc","ddd"};
        String[] pwds = {"aaa","bbb","ccc","ddd"};
        iVisitorService.addVisitorAll(names, pwds);
        return "插入多行数据";
    }

    /**
     * 删除一条数据
     * @return
     */
    @RequestMapping("/deleteOne/{id}")
    public String deleteOne(@PathVariable("id") int id){
        iVisitorService.deleteOne(id);
        return "删除一行";
    }

    /**
     * 删除全部数据
     * @return
     */
    @RequestMapping("/deleteAll")
    public String deleteAll(){
        iVisitorService.deleteAll();
        return "删除全部";
    }

    /**
     * 删除多条数据
     * @return
     */
    @RequestMapping("/deleteMore")
    public String deleteMore(){
        String[] names = {"aaa111","bbb111","ccc111","ddd111"};
        String[] pwds = {"aaa111","bbb111","ccc111","ddd111"};
        iVisitorService.deleteMore(names, pwds);
        return "删除多条数据";
    }

    @RequestMapping("/findByName")
    public void find(){
        String name ="zzx";
        List<Visitor> list =iVisitorService.findByName(name);
        Visitor visitor = list.get(0);
        System.out.println(visitor.getUsername());
    }

    @RequestMapping("/update")
    public String update(){
        String beforename = "zzzzz";
        String aftername = "XXXXX";
        iVisitorService.update(beforename, aftername);
        return "修改成功";
    }
}
