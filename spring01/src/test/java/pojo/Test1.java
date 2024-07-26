package pojo;

public class Test1 implements Runnable {
    private static volatile boolean active;
    int a = 0;
    public void run() {
        active = true;
        while (active) // 第一行
        {
            System.out.println(a++);
            // 代码
        }
    }

    public void stop() {
        active = false; // 第二行
    }
}