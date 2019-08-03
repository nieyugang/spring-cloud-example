package com.example.microservicesimpleeurekaprovider02.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroServiceController {

    @Value("${server.port}")
    String port;


    @RequestMapping(value="hi")
    public String sayHello(@RequestParam(value="name",defaultValue = "yugang.nie") String name){
        return "hello "+name+"  ,i am port"+port;
    }

}
