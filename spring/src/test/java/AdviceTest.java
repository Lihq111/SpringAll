import advice.Test1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author LHQ
 * @description :
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-aop.xml"})
public class AdviceTest {
    @Autowired
    private ApplicationContext context;

    @Test
    public void testAdvice() throws Exception {
        //AdviceTarget adviceTarget = context.getBean(AdviceTarget.class);
        //adviceTarget.testAdvice("参数1", 2);
        //adviceTarget.testException();

        //测试自定义注解
        Test1 bean = context.getBean(Test1.class);
        bean.test();

    }
}
