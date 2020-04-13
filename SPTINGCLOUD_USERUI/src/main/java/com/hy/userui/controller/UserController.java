package com.hy.userui.controller;

import entity.Comm;
import entity.Result;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class UserController {
    @Autowired
    RestTemplate restTemplate;
    @PostMapping(value="/logins")
    public String logins(User user){
        //需要调用userservice这个微服务
        String url ="http://USERSERVICE/validateUser";
        ResponseEntity<Result> commResponseEntity = restTemplate.postForEntity(url,user,Result.class);
        Result body = commResponseEntity.getBody();
        if(body.getCode()==1){
            return "redirect:/suc.html";
        }else{
            return "redirect:/login.html";
        }


    }
}
