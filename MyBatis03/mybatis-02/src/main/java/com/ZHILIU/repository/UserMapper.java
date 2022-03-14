package com.ZHILIU.repository;


import com.ZHILIU.entity.User;

import java.util.List;

/**
 * @author ZHI LIU
 * @date 2022-01-10
 */
public interface UserMapper {
    //获取全部用户
    List<User> getUserList();

    //按照id查询用户
    User getUserById(long id);

    //添加一个用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除用户
    int deleteById(long id);


}
