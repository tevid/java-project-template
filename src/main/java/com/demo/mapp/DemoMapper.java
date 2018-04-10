package com.demo.mapp;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public class DemoMapper {

    /**
     * 查询所有
     *
     * @return
     */
    @Select("select id,name,age from person")
    List<PersonDO> selectAll();
}
