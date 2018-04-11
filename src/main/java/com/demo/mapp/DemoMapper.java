package com.demo.mapp;

import com.demo.vo.DemoVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DemoMapper {

    /**
     * 查询所有
     *
     * @return
     */
    @Select("select task_id taskId,task_name taskName from test_demo")
    List<DemoVO> selectAll();
}
