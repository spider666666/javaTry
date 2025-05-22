package org.example.springdemo01.Controller;

import org.example.springdemo01.Entity.Emp;
import org.example.springdemo01.Entity.PageResult;
import org.example.springdemo01.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    //查询所有的员工信息，以及各自归属的部门名称
    @GetMapping("emps")
    //请求参数的接收
    //
    public PageResult<Emp> findAll(@RequestParam(defaultValue = "1") Integer page,
                                   @RequestParam(defaultValue = "2") Integer pageSize,
                                   String name, Integer gender,
                                   @DateTimeFormat(pattern = "yyyy-MM-dd")LocalDate begin,
                                   @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end){


//        //1.查询员工人数
//        long total = empService.getLength(Integer page,Integer pageSize);
//
//        //2.查询员工信息
//        List<Emp> empList = empService.findAll(Integer page,Integer pageSize);

        //调用业务层
        PageResult<Emp> pageResult = empService.page(page,pageSize,name,gender,begin,end);




        //3.返回响应数据
        return pageResult;
    }


}
