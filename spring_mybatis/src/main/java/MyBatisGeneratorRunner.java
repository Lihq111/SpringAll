/**
 * @author LHQ
 * @description :
 */

import test.mybatis.bean.Dept;
import test.mybatis.bean.DeptExample;
import test.mybatis.mapper.DeptMapper;
import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MyBatisGeneratorRunner {

    public static void main(String[] args) {
        try {
            List<String> warnings = new ArrayList<>();
            boolean overwrite = true;
            File configFile = new File("D:\\IDEA\\springAll\\spring_mybatis\\src\\main\\mybatis-generator-config.xml");
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
            System.out.println("MyBatis Generator 运行成功!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        DeptMapper deptMapper =context.getBean(DeptMapper.class);
        DeptExample dept = new DeptExample();
        List<Dept> depts = deptMapper.selectByExample(dept);
        for (Dept dept1 : depts) {
            System.out.println(dept1.getId() + " " + dept1.getName());
        }

    }
}
