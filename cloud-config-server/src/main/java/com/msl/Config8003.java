package com.msl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author msl
 * @ClassName Config8003
 * @Date 2020/7/17
 * Description TODO
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class Config8003 {
    public static void main(String[] args) {
        SpringApplication.run(Config8003.class,args);
    }
}
