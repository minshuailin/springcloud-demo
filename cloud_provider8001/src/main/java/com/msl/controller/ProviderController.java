package com.msl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author msl
 * @ClassName ProviderController
 * @Date 2020/7/17
 * Description TODO
 */
@RestController
public class ProviderController {

    @GetMapping("/get")
    public String get(){
        return "hello eureka provider1";
    }
}
