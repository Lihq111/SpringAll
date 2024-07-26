import java.util.Vector;

/**
 * @author LHQ
 * @description :测试单元
 */
public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Vector<String> v = new Vector<>();
        v.add("1");
        v.add("2");
        v.add("3");
        v.add(0,"4");
        v.set(1,"4") ;

        for (String s : v) {
            System.out.println(s);
        }
    }
}
