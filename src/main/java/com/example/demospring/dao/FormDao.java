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
     *
     * @param startTime
     * @param endTime
     * @return
     */

    @Select("SELECT 开始日期,orderNumber,lineNumber,itemNumber FROM  orderinfo WHERE [开始日期] BETWEEN #{startTime} AND #{endTime} AND ordernumber=#{orderNumber} AND lineNumber=#{lineNumber} group by orderNumber,lineNumber,itemNumber,开始日期")
    public List<Form> findAll(String startTime, String endTime, String orderNumber, String lineNumber);

    @Select("SELECT 开始日期, orderNumber,lineNumber,itemNumber FROM  orderinfo WHERE [开始日期] BETWEEN #{startTime} AND #{endTime} AND ordernumber=#{orderNumber} group by orderNumber,lineNumber,itemNumber,开始日期")
    public List<Form> findAllon(String startTime,String endTime,String orderNumber);


    @Select("SELECT 开始日期,orderNumber,lineNumber,itemNumber FROM  orderinfo WHERE [开始日期] BETWEEN #{startTime} AND #{endTime} group by orderNumber,lineNumber,itemNumber,开始日期")
    public List<Form> findTwo(String startTime,String endTime);


    @Select("SELECT 开始日期,orderNumber,lineNumber,itemNumber FROM  orderinfo WHERE ordernumber=#{orderNumber}  group by orderNumber,lineNumber,itemNumber,开始日期")
    List<Form> findByOrder(String orderNumber);

    @Select("SELECT 开始日期,orderNumber,lineNumber,itemNumber FROM  orderinfo WHERE ordernumber=#{orderNumber} and lineNumber=#{lineNumber}  group by orderNumber,lineNumber,itemNumber,开始日期")
    List<Form> findByOL(String orderNumber, String lineNumber);
}
