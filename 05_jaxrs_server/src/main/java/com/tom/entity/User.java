package com.tom.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 基于restful风格的webservice 服务端和客户端通过xml或者json传输数据
 * xml:
 * <User>
 *     <id>100</id>
 *     <username>zhangsan</username>
 *     <city>beijing</city>
 * </User>
 * json
 * {"User":{
 *     "id":100,"username":"zhangsan","city":"beijing"
 * }}
 */
@XmlRootElement(name = "User")
public class User {
    private Integer id;
    private String username;
    private String city;

    private List<Car> cars = new ArrayList<Car>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", city='" + city + '\'' +
                ", cars=" + cars +
                '}';
    }
}
