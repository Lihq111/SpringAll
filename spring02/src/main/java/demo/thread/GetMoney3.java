package demo.thread;

import java.lang.reflect.TypeVariable;

/**
 * @author LHQ
 * @description :
 */
public class GetMoney3 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);
        t1.setName("张1");
        t2.setName("李2");
        t1.start();
        t2.start();
    }
}

class BankAccount implements Runnable {
    private int balance = 10000;

    @Override
    public void run() {
        while (balance >= 1000) {
            synchronized (this){
                System.out.println(Thread.currentThread().getName() + "取钱1000元剩余金额：" + (balance - 1000));
                balance -= 1000;
                if (balance < 1000) {
                    break;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
