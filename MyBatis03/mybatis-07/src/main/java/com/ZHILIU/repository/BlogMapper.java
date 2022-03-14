package com.ZHILIU.repository;

import com.ZHILIU.entity.Blog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author ZHI LIU
 * @date 2022-01-13
 */
public interface BlogMapper {

    @Insert("insert into blog (title,author,create_time,views)" +
            "values(#{title},#{author},#{createTime},#{views})")
    int addBlog(Blog blog);

    //测试IF
    //参数也可以是Blog blog
    List<Blog> getBlogIF(Map<String,String> map);

    //测试choose
    List<Blog> getBlogChoose(Map<String,String> map);

    //测试set
    int updateBlogSet(Map<String,String> map);

    //测试foreach
    List<Blog> getBlogForeach(@Param("ids") List<Integer> ids);

}
