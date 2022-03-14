package com.ZHILIU.test;

import com.ZHILIU.entity.User;
import com.ZHILIU.repository.UserMapper;
import com.ZHILIU.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author ZHI LIU
 * @date 2022-01-12
 */
public class AnnoTest {


    @Test
    public void test(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

//        System.out.println(userMapper.getUserList());

//        System.out.println(userMapper.getUserById(1L));

//        System.out.println(userMapper.getUser(1L,"等风"));

//        userMapper.addUser(new User(7,"小志","191919"));

//        System.out.println(userMapper.updateUser(new User(7, "小智", "191919")));

        System.out.println(userMapper.deleteUser(7L));

        sqlSession.close();

    }

}
