package com.wreck.service;

import com.wreck.mapper.UserMapper;

public class userServiceImpl implements userService {

    private UserMapper userMapper;
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    public int addUser() {
        return userMapper.addUser();
    }
}
