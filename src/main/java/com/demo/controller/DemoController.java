package com.demo.controller;

import org.jboss.logging.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("prefix")
public class DemoController {

    @RequestMapping("/getUserName")
    public String getUserName(@RequestParam("userId")String userId){
        return userId;
    }
}
