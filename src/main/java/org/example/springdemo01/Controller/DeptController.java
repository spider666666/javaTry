package org.example.springdemo01.Controller;

import org.example.springdemo01.Entity.Dept;
import org.example.springdemo01.Entity.Result;
import org.example.springdemo01.Service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {


    @Autowired
    private DeptService deptService;

    //查
    @GetMapping("/depts")
    public Result depts(){

        List<Dept> data = deptService.find();
        System.out.println("返回成功");

        return Result.success(data);
    }
    //删
    @DeleteMapping("/depts")
    public Result delete(Integer id){
        deptService.delete(id);
        return Result.success();
    }
    //增
    @PostMapping("/depts")
    //RequestBody将json格式的数据封装到对象中
    public Result add(@RequestBody Dept dept){
        deptService.add(dept);
        return Result.success();
    }

    //查询回显
    @GetMapping("/depts/{id}")
    public Result query(@PathVariable Integer id){
        List<Dept> queryid = deptService.getById(id);
        return Result.success(queryid);

    }
}
/*
考察知识点
1.当需要获取请求信息中的参数值时，有两种方法：
    1.使用httpServetRequest对象的方法RequestParam()获取对应的参数，注意返回值是字符串的形式
    2.使用注解的方式，@RequestParam(value = "",request = false/true)

2.对比RequestParam和PathVariable():
前者是将参数直接嵌入到url路径中，而后者是把参数放到了查询字符串当中


 */