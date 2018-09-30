package com.example.mapper;

import com.example.model.CompanyAgent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author 王兴荣
 * @create 2018-07-26 15:35
 **/
/*@Mapper*/
/*也可以在启动文件加*/
public interface CompanyAgentMapper {
    @Select("select * from GJB_zkd.GJB_company_agent where ca_id = #{ca_id}")
    CompanyAgent findById(@Param("ca_id") Integer ca_id);
}
