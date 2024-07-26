package mapper;

import bean.Dept;

import java.util.List;

/**
 * @author LHQ
 * @description : DeptMapper
 */
public interface DeptMapper {
    List<Dept> selectAll();
}
