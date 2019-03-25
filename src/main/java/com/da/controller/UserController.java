package com.da.controller;

import com.da.po.User;
import com.da.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public String add(User user){
        Integer id = userService.insert(user);
        return id+"";
    }

    @RequestMapping("/findById")
    public User findById(Integer id){
        User user = userService.findById(id);
        return user;
    }

    @RequestMapping("/list")
    public User list(User user){
        List<User> list = userService.list(user);
        return user;
    }

}
