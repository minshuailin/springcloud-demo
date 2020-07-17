package com.msl.server;

import org.springframework.stereotype.Component;

/**
 * @author msl
 * @ClassName HelloHystrix
 * @Date 2020/7/17
 * Description TODO
 */
@Component
public class HelloHystrix implements Hello {

    @Override
    public String get() {
        return "hello,this message failed";
    }
}
