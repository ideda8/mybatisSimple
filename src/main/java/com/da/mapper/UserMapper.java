package com.da.mapper;

import com.da.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper //注解方式才需要
public interface UserMapper {
    public Integer insert(User user);

    //注解方式才需要
    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "username", column = "username"),
        @Result(property = "address", column = "address"),
        @Result(property = "createtime", column = "createtime")
    })
    @Select("select * from user")
    public List<User> list(User user);

    public User findById(Integer id);

    public User findByUsername(String username);
}
