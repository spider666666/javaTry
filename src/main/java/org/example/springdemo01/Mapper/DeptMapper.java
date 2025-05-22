package org.example.springdemo01.Mapper;

import org.apache.ibatis.annotations.*;
import org.example.springdemo01.Entity.Dept;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Mapper
public interface DeptMapper {
//    @Results({
//            @Result(column = "create_time", property = "createTime"),
//            @Result(column = "update_time", property = "updateTime")
//    })
    //也可以通过更改mybatis配置的方式解决数据库的字段名和类的属性名不一致的问题
    @Select("select * from dept")
    public List<Dept> findAll();

    @Delete("delete from dept where id = #{id}")
    public void delete(Integer id);

    @Insert("insert into dept(name,create_time,update_time) values(#{name},#{createTime},#{updateTime})")
    public void add(Dept dept);

    @Select("select * from dept where id = #{id}")
    List<Dept> getByID(Integer id);
}
