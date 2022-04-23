package com.kanri.tinyim.tinyim.controller;

import com.kanri.tinyim.tinyim.pojo.UserPojo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
    @RequestMapping("/user")
    @ResponseBody
    public UserPojo showHelloWorld(){
        UserPojo user=new UserPojo();
        user.setUsername("admin");
        user.setPassword("admin");
        return user;
    }
}
