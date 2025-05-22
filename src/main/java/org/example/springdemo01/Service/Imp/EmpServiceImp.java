package org.example.springdemo01.Service.Imp;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.example.springdemo01.Entity.Emp;
import org.example.springdemo01.Entity.PageResult;
import org.example.springdemo01.Mapper.EmpMapper;
import org.example.springdemo01.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmpServiceImp implements EmpService {

    @Autowired
    private EmpMapper empMapper;

//    @Override
//    public long getLength(Integer page,Integer pageSize) {
//        //1.获取数据
//
//        //2.长度
//        long total = empMapper.getLength();
//
//        return total;
//    }
//
//    @Override
//    public List<Emp> findAll(Integer page,Integer pageSize) {
//        //3.人员信息
//        List<Emp> empList = empMapper.findAll();
//
//        return empList;

    public PageResult<Emp> page(Integer page, Integer pageSize,String name, Integer gender, LocalDate begin, LocalDate end) {
//        //1.调用接口，获取数据
//        long total = empMapper.count();
//        //2.调用接口，查询列表
//        Integer pageStart = (page-1)* pageSize;
//        List<Emp> empList = empMapper.findAll(pageStart,pageSize);
//        //3.封装结果
//        return new PageResult<Emp>(total,empList);


//  基于pagehelper实现分页查询
        //1.设置分页参数
        PageHelper.startPage(page,pageSize);

        //2.执行查询
        List<Emp> empList = empMapper.findAll(name,gender,begin,end);

        Page<Emp> emppage = (Page<Emp>)empList;

        //3.返回参数
        return new PageResult<Emp>(emppage.getTotal(),emppage.getResult());

    }


}
