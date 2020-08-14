package com.miniplay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther alan.chen
 * @time 2019/1/2 12:25 PM
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello MiniplayEurekaServerApplication";
    }

}
