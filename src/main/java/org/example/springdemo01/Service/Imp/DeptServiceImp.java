package org.example.springdemo01.Service.Imp;

import org.example.springdemo01.Entity.Dept;
import org.example.springdemo01.Mapper.DeptMapper;
import org.example.springdemo01.Service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Service
public class DeptServiceImp implements DeptService {

    @Autowired//放入ioc容器
    private DeptMapper deptMapper;

    public List<Dept> find(){

        List<Dept> deptList = deptMapper.findAll();
        return deptList;


    }

    public void delete(Integer id){
        deptMapper.delete(id);
    }

    public void add(Dept dept){
        //1.补全当前系统的时间
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        //2.接口
        deptMapper.add(dept);
    }

    public List<Dept> getById(Integer id){
        List<Dept> userlist = deptMapper.getByID(id);
        return userlist;
    }

}
//犯错误！！！localdatetime和localtime一个带着日期一个不带日期！！！