package com.phearun.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackageClasses={App.class, ArticleService.class, ArticleRepository.class})
@ComponentScan(basePackages={"com.phearun.web.controller", "com.phearun.service", "com.phearun.repository"})
public class App{
    public static void main( String[] args ){
        SpringApplication.run(App.class, args);
    }
}