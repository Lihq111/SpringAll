import org.apache.ibatis.annotations.Insert;
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
public class Test2 {
    Reader reader = null;
    SqlSession session = null;

    @Before
    public void open() {
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
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
    @Insert("insert into student (name, age) values ('333',333)")
    public void testInsert() {
        session.commit();
    }
        /*try {
        Student student = new Student();
        student.setName("222");
        student.setAge(222);
        //session.insert("insert", student);
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        mapper.insert(student);
        session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }*/
}
