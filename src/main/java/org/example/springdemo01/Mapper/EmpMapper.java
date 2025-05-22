package org.example.springdemo01.Mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.springdemo01.Entity.Emp;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {


//    @Select("select e.*,d.name deptName from emp e left join dept d on e.dept_id = d.id limit #{pageStart},#{pageSize}")
//    List<Emp> findAll(@Param("pageStart") Integer pageStart, @Param("pageSize") Integer pageSize);
//
//    @Select("select count(*) from emp e left join dept d on e.dept_id = d.id")
//    long count();
//

//    //这里使用分页查询的一个插件来实现查询操作，此时无需考虑与分页相关的操作，limit直接去掉,就是一条普通的查询语句
//    @Select("select e.*,d.name deptName from emp e left join dept d on e.dept_id = d.id")
//    List<Emp> findAll(String name, Integer gender, LocalDate begin, LocalDate end);

    //条件分页查询
//    @Select("select e.*,d.name deptName from emp e left join dept d on e.dept_id = d.id where e.name like '%宋%' and e.gender = #{gender} and e.entry_date between '2000-01-01' and '2015-01-02' ")
    List<Emp> findAll(@Param("name") String name,
                      @Param("gender") Integer gender,
                      @Param("begin") LocalDate begin,
                      @Param("end") LocalDate end);

}



/*
1.在Java中双引号和单引号的用处是不一样的
2.即使传入的参数名与 SQL 中的变量名一致，在多参数方法中仍需使用@Param注解。这是因为 MyBatis 默认不会将方法参数名直接映射到 SQL 中，
单参数方法：无需@Param，可直接使用参数名（无论是否与 SQL 变量名一致）。
多参数方法：必须使用@Param注解，否则参数名会被映射为arg0、arg1或param1、param2，导致 SQL 中的变量名匹配失败。



//现在使用pageHelper实现分页查询


 */

