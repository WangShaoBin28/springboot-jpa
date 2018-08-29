package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAutoConfiguration   //根据添加的jar包开启自动配置
//@ComponentScan(value = "com.*") //如果没和application同级就用扫描
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
