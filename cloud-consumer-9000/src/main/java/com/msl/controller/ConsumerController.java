package com.msl.controller;

import com.msl.server.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author msl
 * @ClassName ConsumerController
 * @Date 2020/7/17
 * Description TODO
 */
@RestController
public class ConsumerController {

    @Autowired
    private Hello hello;

    @GetMapping("/index")
    public String index(){
        return hello.get();
    }
}
