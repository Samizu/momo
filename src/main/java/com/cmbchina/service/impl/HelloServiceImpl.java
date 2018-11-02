package com.cmbchina.service.impl;

import com.cmbchina.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * Created by sanshui on 2018/11/2.
 */
@Service
public class HelloServiceImpl implements HelloService{

    @Override
    public String say(String str) {
        return "say " + str;
    }
}
