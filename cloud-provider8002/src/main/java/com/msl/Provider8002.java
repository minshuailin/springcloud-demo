package com.msl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author msl
 * @ClassName Provider8002
 * @Date 2020/7/17
 * Description TODO
 */
@SpringBootApplication
@EnableEurekaClient
public class Provider8002 {
    public static void main(String[] args) {
        SpringApplication.run(Provider8002.class,args);
    }
}
