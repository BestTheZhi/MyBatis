import com.ZHILIU.entity.User;
import com.ZHILIU.repository.UserMapper;
import com.ZHILIU.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author ZHI LIU
 * @date 2022-01-14
 */
public class MyTest {

    @Test
    public void test1(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = mapper.getUserById(1);
        System.out.println(user1);

        sqlSession.close();

        System.out.println("---------------------");

        sqlSession = MyBatisUtils.getSqlSession();

        mapper = sqlSession.getMapper(UserMapper.class);
        User user2 = mapper.getUserById(1);
        System.out.println(user2);

        System.out.println("---------------------");
        System.out.println("user1 == user2" + (user1 == user2));

        sqlSession.close();
    }

}
