package com.sunnyday.concurrent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.Executors.*;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2022/5/18
 */
public class CallableTest {

    private static Collection<Callable<Integer>> tasks = new ArrayList<Callable<Integer>>();

    static {
        tasks.add(new BaseCallable(1));
        tasks.add(new BaseCallable(2));
        tasks.add(new BaseCallable(3));
        tasks.add(new BaseCallable(4));
        tasks.add(new BaseCallable(5));
        tasks.add(new BaseCallable(6));
        tasks.add(new BaseCallable(7));
        tasks.add(new BaseCallable(8));
    }


    public static void main(String[] args) throws Exception {
        ExecutorService executorService = newFixedThreadPool(3);

        List<Future<Integer>> futures =
                executorService.invokeAll(tasks, 30L, TimeUnit.SECONDS);

        futures.forEach(it-> {
            try {
                System.out.println(it.get().toString());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });
        executorService.shutdown();
    }

    private static class BaseCallable implements Callable<Integer> {
        private Integer num;

        @Override
        public Integer call() throws Exception {
            Thread.sleep(3000L);
            System.out.println(Thread.currentThread().getName());
            return num;
        }

        public BaseCallable(Integer num) {
            this.num = num;
        }
    }


}
