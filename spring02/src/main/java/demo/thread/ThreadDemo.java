package demo.thread;

import java.util.Random;
import java.util.Scanner;

/**
 * @author LHQ
 * @description :线程测试类
 */
public class ThreadDemo {

    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1();
        MyThread2 m2 = new MyThread2(m1);
        m1.start();
        m2.start();
        System.out.println();
    }
}


class MyThread1 extends Thread {
    private boolean flag = true;

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {

        while (flag) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            int number = new Random().nextInt(100);
            System.out.println(number);
        }

    }
}

class MyThread2 extends Thread {
    private final MyThread1 m1;

    public MyThread2(MyThread1 m1) {
        this.m1 = m1;
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        while (true) {
            String next = scanner.next();
            //char c = scanner.next().toUpperCase().charAt(0);
            System.out.println("输出‘q’结束");
            //线程2结束条件输入Q或者q的时候结束线程1
            if (next.contains(Character.toString('Q')) ||
                    next.contains(Character.toString('q'))) {
                m1.setFlag(false);
                break;
            }
        }
    }
}


