package com.sunnyday;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 *
 */
public class CyclicBarrierTest {

    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, () -> {
            System.out.println("arrived");
        });


        for (int i = 0; i < 7; i++) {
            int a = i * 1000;
            new Thread(() -> {
                String name = Thread.currentThread().getName();
                System.out.println(name);

                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(a);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(name + "======");
            }).start();
        }
    }
}
