package com.ZHILIU.repository;

import com.ZHILIU.entity.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author ZHI LIU
 * @date 2022-01-12
 */
public interface TeacherMapper {

    @Select("select * from teacher where id = #{tid}")
    Teacher getTeacherById(@Param("tid") long id);

    //获取指定老师下的所有学生及老师信息
    Teacher getTeacher1(@Param("tid") long id);

    //获取指定老师下的所有学生及老师信息
    Teacher getTeacher2(@Param("tid") long id);


}
