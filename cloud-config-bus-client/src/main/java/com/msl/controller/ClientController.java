package com.msl.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author msl
 * @ClassName ClientController2
 * @Date 2020/7/18
 * Description TODO
 */
@RestController
public class ClientController {
    @Value("${config.hello}")
    private String hello;

    @GetMapping("/hello")
    public String hello(){
        return "我是通过config配置中心的配置文件为dev，设置的端口号"+this.hello;
    }
}
