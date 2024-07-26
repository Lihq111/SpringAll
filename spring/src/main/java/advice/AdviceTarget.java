package advice;

/**
 * @author LHQ
 * @description :
 */
public class AdviceTarget {
    public String testAdvice(String string , Integer integer) {
        System.out.println("我是测试类的方法，参数是："+string+"和"+integer);
        return "测试类返回";
    }
    public void testException() throws Exception {
        throw new Exception("测试类抛出的异常");
    }
}
