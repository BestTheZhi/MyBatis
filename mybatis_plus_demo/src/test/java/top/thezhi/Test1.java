package top.thezhi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.thezhi.mapper.BaseInfoMapper;

/**
 * @author ZHI LIU
 * @date 2022-11-23
 */

@SpringBootTest
public class Test1 {

    @Autowired
    @SuppressWarnings("all")
    private BaseInfoMapper baseInfoMapper;

    @Test
    public void test1(){
        System.out.println(baseInfoMapper.selectList(null));
    }

}
