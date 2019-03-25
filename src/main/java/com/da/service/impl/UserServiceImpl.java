package com.da.service.impl;

import com.da.mapper.UserMapper;
import com.da.po.User;
import com.da.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer insert(User user) {
        user.setCreatetime(new Date());
        Integer i = userMapper.insert(user);
        return i;
    }

    @Override
    public List<User> list(User user) {
        return userMapper.list(user);
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
