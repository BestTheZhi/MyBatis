package com.ZHILIU.repository;


import com.ZHILIU.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @author ZHI LIU
 * @date 2022-01-10
 */
public interface UserMapper {

    //按照id查询用户
    User getUserById(long id);

    //分页limit
    List<User> getUserLimit(Map<String,Integer> map);

    //分页rowBounds
    List<User> getUserByRowBounds();
}
