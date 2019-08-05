package com.example.microservicesimplehystrixconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@SpringBootApplication(scanBasePackages = "com.example.microservicesimplehystrixconsumer")
@EnableDiscoveryClient
@EnableHystrix
@EnableCircuitBreaker
@FeignClient
public class MicroserviceSimpleHystrixConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSimpleHystrixConsumerApplication.class, args);
    }

}
