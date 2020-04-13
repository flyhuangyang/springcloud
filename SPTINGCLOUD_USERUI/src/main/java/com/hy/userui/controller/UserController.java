package com.hy.userui.controller;

import entity.Result;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class UserController {
    private static final String REST_URL_PREFIX = "http://localhost:8081";
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping(value="/user/get/{id}")
    public User getUser(@PathVariable("id")Long id){
        return restTemplate.getForObject(REST_URL_PREFIX + "/user/get/" + id, User.class);
    }

    @RequestMapping("/user/add")
    public Integer addUser(User user) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/addUser", user, Integer.class);
    }
}
