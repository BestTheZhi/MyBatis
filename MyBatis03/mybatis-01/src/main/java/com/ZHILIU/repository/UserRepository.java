package com.ZHILIU.repository;

import com.ZHILIU.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @author ZHI LIU
 * @date 2022-01-10
 */
public interface UserRepository {
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

    //万能Map
    int addUser1(Map<String,Object> map);

    //万能Map
    int updateUser1(Map<String,Object> map);

    //模糊查询
    List<User> getUserLike(String value);

}
