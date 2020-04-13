package com.hy.controller;

import com.hy.mapper.UserMapper;
import com.hy.service.UserService;
import entity.Comm;
import entity.Result;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value="/addUser")
    public Result addUser(@RequestBody User user){
        int add = userService.addUser(user);
        Result  r=new Result();
        if(add >0){
            r.setCode(1);
            r.setMsg("请输入正确的数值");
        }
        return r;
    }

    @GetMapping("/user/get/{id}")
    public User getByUser(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }
}
