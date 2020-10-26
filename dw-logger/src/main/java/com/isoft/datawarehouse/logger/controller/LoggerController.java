package com.isoft.datawarehouse.logger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class LoggerController {
    //@ResponseBody 决定方法的返回值是网页还是文本

    @RequestMapping("/applog")
    public String log(@RequestBody String log){
        System.out.println(log);
        return log;
    }
}
