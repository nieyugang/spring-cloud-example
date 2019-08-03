package com.example.mcroservicesimplefeignconsumer.inerface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="eureka-client")
public interface SchedualServiceHi {

    @RequestMapping(value="hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value ="yuGang" ,defaultValue = "yuGang.Nie") String name);

}

