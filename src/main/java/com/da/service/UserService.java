package com.da.service;

import com.da.po.User;
import java.util.List;

public interface UserService {
    public Integer insert(User user);

    public List<User> list(User user);

    public User findById(Integer id);

    public User findByUsername(String username);
}
