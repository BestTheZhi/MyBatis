package com.ZHILIU.test;

import com.ZHILIU.entity.Student;
import com.ZHILIU.entity.Teacher;
import com.ZHILIU.repository.StudentMapper;
import com.ZHILIU.repository.TeacherMapper;
import com.ZHILIU.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author ZHI LIU
 * @date 2022-01-12
 */
public class MyTest {

    @Test
    public void testStudentMapper(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> studentList = mapper.getStudentList2();
        for(Student s : studentList ){
            System.out.println(s);
        }

        sqlSession.close();

    }

    @Test
    public void testTeacherMapper(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher = mapper.getTeacher1(1L);
        System.out.println("Teacher["+teacher.getId()+"---"+teacher.getName()+"]");
        List<Student> students = teacher.getStudents();
        for(Student s : students){
            System.out.println(s);
        }

        sqlSession.close();

    }



}
