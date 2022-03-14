package com.ZHILIU.repository;


import com.ZHILIU.entity.User;
import com.ZHILIU.utils.MyBatisUtils;
import com.mysql.cj.result.Row;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ZHI LIU
 * @date 2022-01-10
 */
public class UserMapperTest {

    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void testLog4j(){
        //日志级别
        logger.info("info : testLog4j()...");
        logger.debug("debug : testLog4j()...");
        logger.error("error : testLog4j()...");
    }

    @Test
    public void testLimit(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Integer> map = new HashMap<>();
        map.put("startIndex",1);
        map.put("pageSize",3);
        List<User> userLis = userMapper.getUserLimit(map);
        System.out.println(userLis);

        sqlSession.close();
    }

    @Test
    public void testRowBounds(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        RowBounds rowBounds = new RowBounds(1,3);
        List<User> userList = sqlSession.selectList("com.ZHILIU.repository.UserMapper.getUserByRowBounds", null, rowBounds);
        System.out.println(userList);

        sqlSession.close();

    }


}
