package org.example.springdemo01.Service;

import org.example.springdemo01.Entity.Dept;

import java.util.List;

public interface DeptService {

    public List<Dept> find();

    public void delete(Integer id);

    public void add(Dept dept);

    public List<Dept> getById(Integer id);
}
