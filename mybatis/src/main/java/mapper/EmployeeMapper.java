package mapper;

import bean.Dept;
import bean.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author LHQ
 * @description :
 */
public interface EmployeeMapper {
    List<Employee> selectAllEmpByDept(Dept dept);

    Employee selectEmpById(Integer id);

    //分页查询所以员工信息
    List<Employee> selectAllEmpByPage(int pageNum, int pageSize);

    List<Map<String, Object>> findAvgSalaryByDept();

    List<Employee> selectEmployeeById();
}
