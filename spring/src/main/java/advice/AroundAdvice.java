package advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author LHQ
 * @description :
 */
public class AroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation){
        System.out.println("环绕增强开始");
        Object target = methodInvocation.getThis();//目标方法所在的类
        Method method = methodInvocation.getMethod();//目标方法
        Object[] args = methodInvocation.getArguments(); //目标方法的参数
        System.out.println("before invoke "+target+" 方法: " + method.getName()+" args: " + Arrays.toString(args));
        try {
            System.out.println("环绕增强结束");
            return methodInvocation.proceed(); //调用执行目标方法
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
