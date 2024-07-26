import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import bean.Student;
import mapper.StudentMapper;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * @author LHQ
 * @description :
 */
public class Test1 {
    //获取mapper对象
    private Object getSqlSession() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        reader.close();
        return sqlSessionFactory.openSession(true);
    }

    @Test
    //查询所以学生信息
    public void selectAllStudents() throws IOException {
        SqlSession session = (SqlSession) getSqlSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> students = mapper.selectAll();
        students.forEach(System.out::println);
    }

    @Test
    //添加学生信息
    public void insertStudent() throws IOException {
        SqlSession session = (SqlSession) getSqlSession();
        session.insert("insert", new Student("喜羊羊", 222));
        //session.update("updateById", new Student("111", 111));
//        StudentMapper mapper = session.getMapper(StudentMapper.class);
//        Student student = new Student("Tom2", 22);
//        mapper.insert(student);
        session.close();
        System.out.println("添加成功");
    }

    @Test
    //修改学生信息
    public void updateStudent() throws IOException {
        SqlSession session = (SqlSession) getSqlSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Student student = new Student("Tom2", 20);
        mapper.updateById(1, 25);
        session.close();
        System.out.println("修改成功");
    }


    @Test
    //删除学生信息
    public void deleteStudent() throws IOException {
        SqlSession session = (SqlSession) getSqlSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        mapper.deleteById(1);
        session.close();
        System.out.println("删除成功");
    }

}