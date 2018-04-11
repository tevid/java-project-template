package com.demo.controller;

import com.alibaba.fastjson.JSON;
import com.demo.mapp.DemoMapper;
import com.demo.vo.DemoVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
@Api(value = "demo",description = "测试接口")
public class DemoController {
    @Autowired
    DemoMapper demoMapper;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/getUserName",method = RequestMethod.GET)
    @ApiOperation(value = "获取用户名", notes = "获取用户名。", response = String.class, tags = {"DEMO"})
    public String getUserName(@RequestParam("userId")@ApiParam(value = "用户id", required=true)String userId){
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        return userId;
    }

    @RequestMapping(value = "/getAllTasks",method = RequestMethod.GET)
    @ApiOperation(value = "获取用户名", notes = "获取用户名。", response = String.class, tags = {"DEMO"})
    public List<DemoVO> getAllTasks(){
        List<DemoVO> list = demoMapper.selectAll();
        return list;
    }
}
