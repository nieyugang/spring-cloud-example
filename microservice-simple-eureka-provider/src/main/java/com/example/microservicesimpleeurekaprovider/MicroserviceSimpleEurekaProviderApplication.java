package com.example.microservicesimpleeurekaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceSimpleEurekaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSimpleEurekaProviderApplication.class, args);
    }

}
