package com.tom;

import com.tom.service.impl.HelloServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.interceptor.OutgoingChainInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class server {
    public static void main(String[] args) {
        // 获取jaxws对象
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        // 设置服务地址
        factory.setAddress("http://localhost:8080/ws/hello");
        // 设置服务类型
        factory.setServiceBean(new HelloServiceImpl());
        // 添加日志输入输出拦截器，观察soap请求
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());
        // 创建服务
        factory.create();
        System.out.println("服务发布成功");

    }
}
