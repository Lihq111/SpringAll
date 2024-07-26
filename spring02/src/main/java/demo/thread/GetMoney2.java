package demo.thread;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author LHQ
 * @description :
 */
public class GetMoney2 {
    private static int money = 10000;

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (money >= 1000) {
                        synchronized (GetMoney2.class) {
                            System.out.println(Thread.currentThread().getName() + "取走了1000元" + "剩余" + (money - 1000) + "元");
                            money = money - 1000;
                            if (money < 1000) {
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
            });
            t.start();
        }
    }
}
