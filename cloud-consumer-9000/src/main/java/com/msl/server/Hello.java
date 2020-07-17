package com.msl.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author msl
 * @ClassName Hello
 * @Date 2020/7/17
 * Description TODO
 *      @FeignClient ：服务消费者，调用服务提供者产生的服务，
 *                     name: 对应提供者的spring.application.name
 *                      fallback: 当需要调用的服务出现异常时，会调用这个回调 （熔断器）
 */
@FeignClient(name = "provider8001",fallback = HelloHystrix.class)
public interface Hello {
    @RequestMapping("/get")
    public String get();
}
