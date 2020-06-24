package com.tom;

import com.tom.entity.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

public class Client {
    @Test
    public void testSave() {
        User user = new User();
        user.setId(100);
        user.setUsername("Meachel");
        user.setCity("beijing");
        WebClient.create("http://localhost:8001/ws/userService/user")
                // 指定请求数据格式为json  Payload: {"User":{"city":"beijing","id":100,"username":"Meachel"}}
                .type(MediaType.APPLICATION_JSON).post(user);
        System.out.println("客户端调用完成");
    }

    @Test
    public void testGet() {
        User user =
                WebClient
                        .create("http://localhost:8001/ws/userService/user/1")
                        .accept(MediaType.APPLICATION_JSON)
                        .get(User.class);
        System.out.println(user);
    }
}
