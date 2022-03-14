package com.ZHILIU.repository;


import com.ZHILIU.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author ZHI LIU
 * @date 2022-01-10
 */
public class UserRepositoryTest {

    @Test
    public void test1(){
        //1.获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        //2.获取MaBatis实例化的repository接口对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //3.映射器实例 执行
        System.out.println(userMapper.getUserById(1L));


        //4.关闭SqlSession
        sqlSession.close();

    }


}
