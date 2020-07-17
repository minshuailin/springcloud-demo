package com.msl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author msl
 * @ClassName EurekaMain7001
 * @Date 2020/7/14
 * Description TODO
 */
@SpringBootApplication
@EnableEurekaServer //开启服务端
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
    }
}
