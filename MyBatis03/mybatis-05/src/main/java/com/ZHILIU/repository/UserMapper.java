package com.ZHILIU.repository;


import com.ZHILIU.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author ZHI LIU
 * @date 2022-01-10
 */
public interface UserMapper {

    @Select("select * from user")
    List<User> getUserList();

    //一个参数@param可以省略,建议加上
    @Select("select * from user where id = #{uid}")
    User getUserById(@Param("uid") long id);

    //方法存在多个基本类型的参数 **必须** 加上 @param 注解
    @Select("select * from user where id = #{id} and name = #{name}")
    User getUser(@Param("id") long id,@Param("name") String name);

    @Insert("insert into user(id,name,pwd) value(#{id},#{name},#{pwd})")
    int addUser(User user);

    @Update("update user set name=#{name},pwd=#{pwd} where id = #{id}")
    int updateUser(User user);

    @Delete("delete from user where id = #{id}")
    int deleteUser(long id);

}
