package com.yantodev.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;


@ComponentScan(basePackages = {
        "com.yantodev.api",
        "com.yantodev.api.dto"
})
@EntityScan(basePackages = "com.yantodev.api.model")
@EnableJpaRepositories(basePackages = {
        "com.yantodev.api.dao"
})
@SpringBootApplication
@Configuration
@EnableResourceServer
@EnableAuthorizationServer
public class RestApiJavaApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestApiJavaApplication.class, args);
    }
}
