package advice;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author LHQ
 * @description :
 */
public class AfterReturningAdviceTest implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnedValue, Method method, @Nullable Object[] objects, Object o) throws Throwable {
        System.out.println("后置增强开始");
        System.out.println(o+"调用了"+method.getName()+"方法，参数是："+ Arrays.toString(objects)+"，返回值是："+returnedValue);
        System.out.println("后置增强结束");
    }
}
