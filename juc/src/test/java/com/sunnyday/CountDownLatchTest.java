package com.sunnyday;

import lombok.SneakyThrows;
import org.springframework.cglib.core.TinyBitSet;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 *
 */
public class CountDownLatchTest {

    private volatile int sum = 0;

    public static void main(String[] args) throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(5);

        for (int i = 1; i < 6; i++) {
            int a = i;
            new Thread(() -> {
                CustomCallable customCallable = new CustomCallable(a, countDownLatch);
                Integer integer = null;
                try {
                    integer = customCallable.call();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }

        countDownLatch.await();
        System.out.println("finish");

    }

    public static class CustomCallable implements Callable<Integer> {

        private int a;

        private CountDownLatch countDownLatch;

        @Override
        public Integer call() throws Exception {
            Thread.sleep(a * 1000);
            System.out.println(Thread.currentThread().getName() + " sleep -- " + a + "s");
            countDownLatch.countDown();
            return a * 10;
        }

        public CustomCallable(int a) {
            this.a = a;
        }

        public CustomCallable(int a, CountDownLatch countDownLatch) {
            this.a = a;
            this.countDownLatch = countDownLatch;
        }
    }

}
