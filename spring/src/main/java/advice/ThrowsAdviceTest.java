package advice;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;

/**
 * @author LHQ
 * @description :
 */
public class ThrowsAdviceTest implements ThrowsAdvice {
    public void afterThrowing( Method method, @Nullable Object[] objects, Object o ,Exception e) {
        System.out.println("异常抛出增强开始");
        System.out.println(o+"调用了"+method.getName()+"方法发生了异常："+e.getMessage());
        System.out.println("异常抛出增强结束");
    }
}
