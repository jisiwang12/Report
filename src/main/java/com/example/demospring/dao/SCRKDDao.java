package com.example.demospring.dao;

import com.example.demospring.domain.SCRKD;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author diao 2021/2/18
 */
@Mapper
public interface SCRKDDao {

    @Select({"<script>",
            "SELECT * FROM SCRKD",
            "WHERE 1=1",
            "<when test='moNumber!=null'>",
            " AND moNumber = #{moNumber}",
            "</when>",
            "<when test='moLineNumber!=null'>",
            " AND moLineNumber=#{moLineNumber}",
            "</when>",
            "<when test='startTime!=null and endTime!=null'>",
            " AND 入库日期 between #{startTime} and #{endTime}",
            "</when>",
            "</script>"})
    public List<SCRKD> finAll(String startTime, String endTime, String moNumber, String moLineNumber);
}
