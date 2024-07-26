package mapper.impl;

import bean.Dept;
import mapper.DeptMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import java.util.List;

/**
 * @author LHQ
 * @description :
 */
public class DeptMapperImpl extends SqlSessionDaoSupport implements DeptMapper {
    @Override
    public List<Dept> selectAll() {
        System.out.println("----------------------------------------");
        return super.getSqlSession().selectList("mapper.DeptMapper.selectAll");
    }
}
