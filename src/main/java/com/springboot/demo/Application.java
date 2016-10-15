package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by qlxrc on 2016/10/15.
 */
@EntityScan(basePackages="com.springboot.models")
@ComponentScan(basePackages="com")
@EnableJpaRepositories(basePackages="com")
@SpringBootApplication
public class Application {
//public class Application extends SpringBootServletInitializer {

    /*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
           return application.sources(Application.class);
    }*/

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
