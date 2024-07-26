import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import bean.Dept;
import bean.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * @author LHQ
 * @description :
 */
public class TestDept {
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

    // 测试查询所有部门信息
    @Test
    public void testFindAllDept() {
        List<Dept> deptList = session.selectList("selectAllDept","开发部门");
        deptList.forEach(System.out::println);
    }

    //查询开发部门里的所有的员工信息
    @Test
    public void testFindAllEmpByDept() {
        List<Employee> employeesList = session.selectList("selectAllEmpByDept", "开发部门");
        employeesList.forEach(System.out::println);
    }

    //查询一个员工的详细信息
    @Test
    public void testFindEmpById() {
        Employee employee = session.selectOne("selectEmpById", 3);
        Dept dept = session.selectOne("selectDeptById", 1);
        System.out.println(dept);
        System.out.println(employee);
        //System.out.println(employee);
    }

    //查询所有部门的员工信息
    @Test
    public void testFindAllEmpByDept2() {
        List<Dept> list = session.selectList("selectDeptEmployees");
        for (Dept dept : list) {
            if (dept != null) {
                for (Employee employee : dept.getEmployees()) {
                    System.out.println(employee.getName()+":"+employee.getSalary()
                            +":"+dept.getName());
                }
            }
        }
    }
}
