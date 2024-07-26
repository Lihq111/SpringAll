import bean.Dept;
import bean.Employee;
import mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author LHQ
 * @description :
 */
public class TestEmployee {

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

    //分页查询所有员工信息
    @Test
    public void testFindAllEmpByPage() {
        RowBounds rowBounds = new RowBounds(3, 2);
        // 第一页，每页显示2条
        List<Employee> employeesList = session.selectList("selectAllEmpByPage", rowBounds);
        for (Employee employee : employeesList) {
            System.out.println("Employee{" +
                    "id=" + employee.getId() +
                    ", name='" + employee.getName() + '\'' +
                    ", age=" + employee.getAge() +
                    ", salary=" + employee.getSalary() +
                    ", dept=" + employee.getDept().getName() +
                    '}');
        }
    }

    //分组查询每个部门员工的平均工资
    @Test
    public void testFindAvgSalaryByDept() {
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        List<Map<String, Object>> result = mapper.findAvgSalaryByDept();
        for (Map<String, Object> map : result) {
            map.forEach((k, v) -> System.out.println(k + " : " + v));
        }
    }

    @Test
    @Transactional
    public void testSQL() {
        Employee employee = new Employee();
        //employee.setId(4);
        employee.setName("44");
        //employee.setAge(25);
        try {
            //session.insert("insertEmployee", employee);
            //session.update("updateEmployee",employee);
            session.selectList("selectEmployeeById", employee);
        }catch (Exception e){
            e.printStackTrace();
            session.rollback();
        }
        session.commit();
    }
}