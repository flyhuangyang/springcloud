package com.hy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class UserUiMain {

    /**
     * 提供多种访问远程http服务的方法
     * 是一种访问restful服务的模板类，是spring提供的用户访问rest服务的客户端模板工具集
     * @return
     */
//    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {  //

        return new RestTemplate();
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(UserUiMain.class).web(true).run(args);
    }
}
