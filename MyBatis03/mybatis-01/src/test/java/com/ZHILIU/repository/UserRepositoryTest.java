package com.ZHILIU.repository;

import com.ZHILIU.entity.User;
import com.ZHILIU.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        UserRepository userRepository = sqlSession.getMapper(UserRepository.class);
        //3.映射器实例 执行
        List<User> userList = userRepository.getUserList();

//        List<Object> objects = sqlSession.selectList("com.com.ZHILIU.repository.UserRepository.getUserList");
//        List<User> userList = sqlSession.selectList("com.com.ZHILIU.repository.UserRepository.getUserList");

        System.out.println(userList);

        //4.关闭SqlSession
        sqlSession.close();

    }

    @Test
    public void test2(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        UserRepository userMapper = sqlSession.getMapper(UserRepository.class);

        //1.
        //System.out.println(userMapper.getUserById(1));

        //2.
//        if(userMapper.addUser(new User(4, "青卡", "123123"))>0){
//            System.out.println("添加成功!");
//        }

        //3.
//        if(userMapper.updateUser(new User(4, "青卡", "123456"))>0){
//            System.out.println("修改成功!");
//        }

//        if(userMapper.deleteById(4L)>0){
//            System.out.println("删除成功!");
//        }

        //4.万能Map
//        Map<String, Object> map = new HashMap<>();
//        map.put("userId",5);
//        map.put("userName","GodZii");
//
//        System.out.println(userMapper.addUser1(map));
//        System.out.println(userMapper.updateUser1(map));

        System.out.println(userMapper.getUserLike("小"));

        //增删改需要提交事务
        sqlSession.commit();

        sqlSession.close();

    }

}
