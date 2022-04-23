package com.kanri.tinyim.tinyim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloWorld {
    @RequestMapping("/hello")
    @ResponseBody
    public Map<String, String> showHelloWorld(){
        Map<String, String> map=new HashMap<String, String>();
        map.put("msg", "hello world!");
        return map;
    }
}
