package com.ZHILIU.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author ZHI LIU
 * @date 2022-01-12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    private long id;
    private String name;
    //老师对应多个学生
    private List<Student> students;
}
