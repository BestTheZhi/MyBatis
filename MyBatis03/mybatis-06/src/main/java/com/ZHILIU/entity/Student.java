package com.ZHILIU.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ZHI LIU
 * @date 2022-01-12
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private long id;
    private String name;

    //学生tid(外键)关联老师主键id
    private Teacher teacher;
}
