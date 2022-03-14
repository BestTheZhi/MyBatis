package com.ZHILIU.repository;

import com.ZHILIU.entity.Student;

import java.util.List;

/**
 * @author ZHI LIU
 * @date 2022-01-12
 */
public interface StudentMapper {

    //查询所有学生的信息，以及对应老师的信息
    public List<Student> getStudentList1();

    //查询所有学生的信息，以及对应老师的信息
    public List<Student> getStudentList2();

}
