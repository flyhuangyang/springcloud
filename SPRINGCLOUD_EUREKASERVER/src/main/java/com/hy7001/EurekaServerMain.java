package com.hy7001;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer    //EurekaServer服务端启动类，接受其它微服务注册进来
public class EurekaServerMain {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServerMain.class).web(true).run(args);
    }
}
