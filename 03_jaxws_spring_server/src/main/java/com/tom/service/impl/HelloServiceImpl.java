package com.tom.service.impl;

import com.tom.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return name + "你好";
    }
}
