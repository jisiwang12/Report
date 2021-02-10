package com.example.demospring.dao;

import com.example.demospring.domain.Form;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author gsq 2021/2/9
 */
@Mapper
public interface FormDao {

    /**
     * 根据时间查询所有记录
     * @param startTime
     * @param endTime
     * @return
     */
    @Select("SELECT * FROM  orderinfo WHERE [开始日期] BETWEEN #{startTime} AND #{endTime}")
    public List<Form> findAll(String startTime,String endTime);
}
