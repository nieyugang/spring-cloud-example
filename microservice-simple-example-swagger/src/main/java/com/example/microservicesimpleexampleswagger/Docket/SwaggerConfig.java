package com.example.microservicesimpleexampleswagger.Docket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi(){
        return  new Docket(DocumentationType.SWAGGER_2).pathMapping("/").select().apis(RequestHandlerSelectors.basePackage("com.example.microservicesimpleexampleswagger")).paths(PathSelectors.any()).build().apiInfo(new ApiInfoBuilder().title("SpringCloud&Swagger2整合").description("Description:SpringCloud 整合Swagger2,详细信息").version("2.9.2").contact(new Contact("yugang.nie","blog.csdn.net","yugang.nie@foxmail.com")).license("The Apache Lience").licenseUrl("www.baidu.com").build());
    }
}
