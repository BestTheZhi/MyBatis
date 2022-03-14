package com.ZHILIU.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author ZHI LIU
 * @date 2022-01-13
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
    private long id;
    private String title;
    private String author;
    //数据库表中字段是create_time
    //在mybatis-config.xml中开启驼峰命名自动映射
    private Date createTime;
    private long views;
}
