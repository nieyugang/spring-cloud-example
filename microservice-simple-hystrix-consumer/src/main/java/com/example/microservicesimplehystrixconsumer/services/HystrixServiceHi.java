package com.example.microservicesimplehystrixconsumer.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="eureka-client")
public interface HystrixServiceHi {

    @RequestMapping(value = "hi",method = RequestMethod.POST)
    String sayHiFromClientOne(@RequestParam(value="yugGang",defaultValue = "li.Cai") String name);
}
