import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.Cat;
import pojo.Master;
import pojo.Pet;

/**
 * @author LHQ
 * @description :
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class TsetPet {

    @Autowired
    private Cat cat;

    @Test
    public void test() {
        //System.out.println(cat.getName());
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Master master =(Master) context.getBean("master");
        master.getPet().show();
        //System.out.println(master.getPet().getName());
//        Pet pet =(Pet) context.getBean("petBean");
//        System.out.println(pet.getName()+" "+pet.getAge());
    }

}
