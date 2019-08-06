package com.example.microservicesimpleexampleswagger.BeanFactory;

import java.io.Serializable;

public class User implements Serializable {

    String id;
    String username;
    String address;

    private static User user;
    private User(){}

    /**
     * 获取单理的user
     * @return
     */
    public  static User getInstance(){
        if(user ==null){
            synchronized (User.class){
                if(user==null){
                    user = new User();
                }
            }
        }
        return  user;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
