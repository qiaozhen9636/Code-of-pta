/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: Test
 * Author:   Administrator
 * Date:     2018/10/8 19:32
 * Description: 这是一个测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * qiaozhen         修改时间          版本号             描述
 */

import com.qiaozhen.beans.Damo1;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈这是一个测试类〉
 *
 * @author Administrator
 * @create 2018/10/8
 * @since 1.0.0
 */

public class Test {
    @org.junit.Test
    public void test(){
        System.out.println("111");
    }
    @org.junit.Test
    public void name() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Damo1> all = sqlSession.selectList("test1.selectAll","id");
        for (Damo1 damo: all) {
            System.out.println(damo);
        }
        sqlSession.close();
    }
}
