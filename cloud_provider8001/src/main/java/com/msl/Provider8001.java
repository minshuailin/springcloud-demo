package com.msl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author msl
 * @ClassName Provider8001
 * @Date 2020/7/17
 * Description TODO
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Provider8001 {
    public static void main(String[] args) {
        SpringApplication.run(Provider8001.class,args);
    }
}
