package com.example.microservicesimpleeruekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceSimpleEruekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSimpleEruekaClientApplication.class, args);
    }

}
