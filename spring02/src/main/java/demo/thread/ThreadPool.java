package demo.thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author LHQ
 * @description :使用线程池完成两个人同时取钱的场景，总钱数10000，每人每次取1000，不得超取
 */
public class ThreadPool {
    private static int money = 10000;

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 5, 0L, TimeUnit.MINUTES, new LinkedBlockingQueue<Runnable>(3));
        for (int i = 0; i < 2; i++) {
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    while (money >= 1000) {
                        synchronized (ThreadPool.class) {
                            System.out.println(Thread.currentThread().getName() + "取走了" + 1000 + "元剩余：" + (money - 1000));
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
        }
        threadPoolExecutor.shutdown();
    }
}
