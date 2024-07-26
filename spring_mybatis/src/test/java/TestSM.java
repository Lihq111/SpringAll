import mapper.DeptMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

/**
 * @author LHQ
 * @description :
 */
public class TestSM {
    Reader reader = null;
    SqlSession session = null;

    @Before
    public void open() {
        try {
            reader = Resources.getResourceAsReader("spring.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            session = sqlSessionFactory.openSession();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @After
    public void close() {
        if (session != null) {
            session.close();
        }
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public  void mains() {
        // 加载Spring配置文件
        //ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        // 获取DeptMapper对象
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        //DeptMapper deptMapper = context.getBean(DeptMapper.class);
//        List<Dept> d = mapper.selectAll();
//        for (Dept dept : d) {
//            System.out.println(dept);
//        }
    }
}
