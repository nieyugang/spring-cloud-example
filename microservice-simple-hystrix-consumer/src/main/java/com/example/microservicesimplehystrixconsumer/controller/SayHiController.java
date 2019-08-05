package com.example.microservicesimplehystrixconsumer.controller;


import com.example.microservicesimplehystrixconsumer.services.HystrixServiceHi;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHiController {

    @Autowired
    HystrixServiceHi hystrixServiceHi;

    @RequestMapping("hi")
    @HystrixCommand(fallbackMethod = "sayError")
    public  String sayHi(@RequestParam(value = "yuGang",defaultValue = "li.Cai") String name){
       return  hystrixServiceHi.sayHiFromClientOne(name);
    }



    public String sayError(@RequestParam(value="Occured Error",defaultValue = "ERROR") String name){
        return  "Occured Error!";
    }
}
