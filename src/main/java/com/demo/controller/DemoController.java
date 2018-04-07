package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("prefix")
public class DemoController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/getUserName")
    public String getUserName(@RequestParam("userId")String userId){
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        return userId;
    }
}
