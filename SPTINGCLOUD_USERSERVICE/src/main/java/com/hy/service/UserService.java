package com.hy.service;

import entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    public User getUserById(@Param("id") Long id);

    public int addUser(User user);
}
