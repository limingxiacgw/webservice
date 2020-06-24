package com.tom;

import com.tom.service.HelloService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Client {
    public static void main(String[] args) {
        // 创建代理对象
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        // 设置远程访问服务端地址
        factory.setAddress("http://localhost:8080/ws/hello");
        // 设置接口类型
        factory.setServiceClass(HelloService.class);
        // 获取服务代理对象
        HelloService helloService = factory.create(HelloService.class);
        String result = helloService.sayHello("李明霞");
        System.out.println(result);

    }
}
