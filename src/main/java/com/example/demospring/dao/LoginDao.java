package com.example.demospring.dao;

import com.example.demospring.domain.Ordertest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LoginDao {

    @Select(value = "select * from ordertest")
    public List<Ordertest> login();
}
