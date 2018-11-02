package com.cmbchina.controller;

import com.cmbchina.service.HelloService;
import com.cmbchina.vo.request.HelloRequestVo;
import com.cmbchina.vo.response.HelloResponseVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by sanshui on 2018/11/2.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Resource
    private HelloService helloService;

    @PostMapping("/say")
    public HelloResponseVo say(HelloRequestVo requestVo) {
        String say =  helloService.say(requestVo.getSay());
        HelloResponseVo vo =  new HelloResponseVo();
        vo.setSay(say);
        return vo;
    }
}
