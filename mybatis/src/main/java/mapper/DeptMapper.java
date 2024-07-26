package mapper;

import bean.Dept;
import bean.Employee;

import java.util.List;

/**
 * @author LHQ
 * @description :部门信息Mapper接口
 */
public interface DeptMapper {
    List<Dept> selectAllDept();
    Dept selectDeptById(int id);
    List<Dept> selectDeptEmployees();
}
