package com.tom;

import com.tom.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class client {

    @Resource
    private HelloService helloService;

    @Test
    public void test(){
        System.out.println(helloService.getClass()); // class com.sun.proxy.$Proxy45
        System.out.println(helloService.sayHello("李明霞"));
    }
}
