package org.example.springdemo01.Service;

import org.apache.ibatis.annotations.Mapper;
import org.example.springdemo01.Entity.Emp;
import org.example.springdemo01.Entity.PageResult;

import java.time.LocalDate;
import java.util.List;


public interface EmpService {
//    long getLength(Integer page,Integer pageSize);
//
//    List<Emp> findAll(Integer page,Integer pageSize);
    PageResult<Emp> page(Integer page, Integer pageSize, String name, Integer gender, LocalDate begin,LocalDate end);
}
