import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.Master;

import javax.annotation.Resource;

/**
 * @author LHQ
 * @description :
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class SpringTest {

    //@Autowired
    //private ApplicationContext applicationContext;

    @Resource(name = "master")
    private Master master;

    @Test
    public void test() {
        master.sayHello();
        //applicationContext.getBean(Master.class).sayHello();
    }
}