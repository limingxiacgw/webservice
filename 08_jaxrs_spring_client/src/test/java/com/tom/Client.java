package com.tom;

import com.tom.entity.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

public class Client {
    @Test
    public void testSave(){
        User user = new User();
        user.setId(500);
        user.setUsername("limingxia");
        user.setCity("beijing");
        WebClient.create("http://localhost:8080/ws/userService/userService/user")
                .type(MediaType.APPLICATION_JSON).post(user);
        System.out.println("保存成功");
    }

    @Test
    public void testGet() {
        User user = WebClient.create("http://localhost:8080/ws/userService/userService/user/1")
                .accept(MediaType.APPLICATION_JSON).get(User.class);
        System.out.println(user.toString());

    }
}
