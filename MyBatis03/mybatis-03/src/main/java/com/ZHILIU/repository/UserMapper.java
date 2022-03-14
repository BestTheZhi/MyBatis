package com.ZHILIU.repository;


import com.ZHILIU.entity.User;

import java.util.List;

/**
 * @author ZHI LIU
 * @date 2022-01-10
 */
public interface UserMapper {

    //按照id查询用户
    User getUserById(long id);

}
