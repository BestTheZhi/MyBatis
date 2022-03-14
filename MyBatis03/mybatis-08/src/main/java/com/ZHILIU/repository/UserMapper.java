package com.ZHILIU.repository;

import com.ZHILIU.entity.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author ZHI LIU
 * @date 2022-01-14
 */
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User getUserById(long id);

    @Update("update user set name = #{name},pwd=#{pwd} where id = #{id}")
    int updateUser(User user);


}
