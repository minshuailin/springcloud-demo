package com.msl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author msl
 * @ClassName ConfigBus8005
 * @Date 2020/7/18
 * Description TODO
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigBus8005 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigBus8005.class,args);
    }
}
