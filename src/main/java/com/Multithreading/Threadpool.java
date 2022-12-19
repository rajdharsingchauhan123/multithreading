package com.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Threadpool {
    public static void main(String[] args) {
        ExecutorService executorService =Executors.newFixedThreadPool(2);
        Runnable task1=new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("mytask1 is completed");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);

                }
                System.out.println("my task ended");


            }

        };
        executorService.submit(task1);

    }
}
