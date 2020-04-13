package com.hy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer    //启用EurekaServer注册模块
public class EurekaServerMain {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServerMain.class).web(true).run(args);
    }
}
