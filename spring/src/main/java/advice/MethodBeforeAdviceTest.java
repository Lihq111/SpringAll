package advice;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author LHQ
 * @description :
 */
public class MethodBeforeAdviceTest implements MethodBeforeAdvice {

    @Override
    public void before(Method method, @Nullable Object[] objects, Object o) throws Throwable {
        System.out.println("前置增强开始");
        System.out.println(o+"调用了"+method.getName()+"方法，参数是："+ Arrays.toString(objects));
        if (objects!= null && objects.length > 0){
            objects[0] = "参数1被修改了";
            if (objects.length > 1){
                objects[1] = 222;
            }
        }
        System.out.println("前置增强结束");
    }
}
