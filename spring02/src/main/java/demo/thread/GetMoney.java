package demo.thread;

/**
 * @author LHQ
 * @description :总共10000元，两人同时取钱，每次取1000，取完不允许超取
 */
public class GetMoney {
    public static void main(String[] args) {
        final int money = 10000;
        Person p = new Person(money);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        t1.setName("P1");
        t2.setName("P2");
        t1.start();
        t2.start();
    }
}

class Person implements Runnable {
    private int money;

    public Person(int money) {
        this.money = money;
    }
    @Override
    public void run() {
        // 取钱
            while (money > 0){
                synchronized (this){
                    if (money >= 1000){
                        System.out.println(Thread.currentThread().getName() + "取走了1000元"+"剩余"+(money-1000)+"元");
                        money -= 1000;
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