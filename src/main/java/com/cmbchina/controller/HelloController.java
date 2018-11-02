package com.cmbchina.controller;

import com.cmbchina.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by sanshui on 2018/11/2.
 */
@RestController("/hello")
public class HelloController {

    @Resource
    private HelloService helloService;

    @GetMapping("/say")
    public String say(String str){
        return helloService.say(str);
    }
}
