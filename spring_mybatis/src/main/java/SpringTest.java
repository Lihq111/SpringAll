import bean.Dept;
import mapper.DeptMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author LHQ
 * @description :测试Spring整合Mybatis
 */
public class SpringTest {
    public static void main(String[] args) {
        // 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        DeptMapper deptMapper = context.getBean(DeptMapper.class);
        List<Dept> d = deptMapper.selectAll();
        for (Dept dept : d) {
            System.out.println(dept);
        }
    }
}
