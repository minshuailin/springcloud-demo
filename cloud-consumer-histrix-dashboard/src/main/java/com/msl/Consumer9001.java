package com.msl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author msl
 * @ClassName Consumer9001
 * @Date 2020/7/17
 * Description TODO
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrixDashboard
public class Consumer9001 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer9001.class,args);
    }
}
