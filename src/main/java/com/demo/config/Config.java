package com.demo.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by joezou on 2017/3/2.
 */
@SpringBootApplication
@Configuration
@EnableSwagger2 //Enable swagger 2.0 spec
public class Config {
    @Bean
    public Docket demoApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("DEMO")
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(RequestMapping.class))
                .paths(PathSelectors.regex("/demo.*"))
                .build()
                .apiInfo(apiinfo());
    }

    private ApiInfo apiinfo() {
        return new ApiInfoBuilder()
                .title("Demo API")
                .description("测试接口")
                .version("1.0")
                .contact(new Contact("Joe Zou","http://github.com/zouyx", "yixian.zou@gmail.com"))
                .build();
    }
}
