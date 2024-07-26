package advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import java.util.Arrays;

/**
 * @author LHQ
 * @description :
 */
@Aspect
public class AspectJ {

    @Pointcut("execution(* advice.AdviceTarget.*(..))")
    public void myPoint() {}

    @Before("myPoint()")
    public void before(JoinPoint joinPoint) {
        System.out.println("前置增强开始");
        System.out.println("目标方法所在类(对象)：" + joinPoint.getThis().getClass().getName());
        System.out.println("目标方法名：" + joinPoint.getSignature().getName());
        System.out.println("目标方法参数：" + Arrays.toString(joinPoint.getArgs()));
        System.out.println("前置增强结束");
    }
    @AfterReturning(pointcut = "myPoint()",returning = "resultVal")
    public void afterReturning(Object resultVal) {
        System.out.println("后置增强开始");
        System.out.println("返回值：" + resultVal);
        System.out.println("后置增强结束");
    }
    @AfterThrowing(pointcut = "myPoint()",throwing = "exception")
    public void afterThrowing(Exception exception) {
        System.out.println("异常通知开始");
        System.out.println("异常信息：" + exception.getMessage());
        System.out.println("异常通知结束");
    }
    @After("myPoint()")
    public void after() {
        System.out.println("最终通知开始");
        System.out.println("最终通知结束");
    }

    @Around("myPoint()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知开始");
        Object result = joinPoint.proceed();
        System.out.println("环绕通知结束");
        return result;
    }

}
