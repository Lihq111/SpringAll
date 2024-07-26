package advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnoTest {

    @Before("@annotation(Loggable)")
    public void beforeLoggable() {
        System.out.println("自定义注解要执行的逻辑");
    }

}
