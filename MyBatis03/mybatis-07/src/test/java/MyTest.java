import com.ZHILIU.entity.Blog;
import com.ZHILIU.repository.BlogMapper;
import com.ZHILIU.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * @author ZHI LIU
 * @date 2022-01-13
 */
public class MyTest {

    @Test
    public void testInsert(){
        //已经设置自动提交事务
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();

        blog.setTitle("Mybatis");
        blog.setAuthor("是风动");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.addBlog(blog);

        blog.setTitle("Java");
        blog.setAuthor("是幡动");
        blog.setViews(1000);
        mapper.addBlog(blog);

        blog.setTitle("Spring");
        blog.setAuthor("莫敛此轻寒");
        mapper.addBlog(blog);

        blog.setTitle("微服务");
        blog.setAuthor("莫敛此轻寒");
        mapper.addBlog(blog);

        sqlSession.close();

        sqlSession.close();
    }

    @Test
    public void testIF(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Map<String,String> map = new HashMap<>();
        map.put("title","微服务");
        map.put("author","轻寒");

        System.out.println(mapper.getBlogIF(map));

        sqlSession.close();
    }

    @Test
    public void testChoose(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Map<String,String> map = new HashMap<>();
        //多个参数也只选择一个
        map.put("title","微服务");
        map.put("author","是风动");

        System.out.println(mapper.getBlogChoose(map));

        sqlSession.close();
    }

    @Test
    public void testSet(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Map<String,String> map = new HashMap<>();
//        map.put("title","微服务");
        map.put("author","不是风动");
        map.put("id","3");

        System.out.println(mapper.updateBlogSet(map));

        sqlSession.close();
    }

    @Test
    public void testForeach(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        List<Integer> ids = new ArrayList<>();
//        ids.add(1);

        System.out.println(mapper.getBlogForeach(ids));

        sqlSession.close();
    }

}
