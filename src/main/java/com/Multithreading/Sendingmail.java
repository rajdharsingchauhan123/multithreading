package com.Multithreading;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Sendingmail implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class Executerservicesreallifeex{
    public static void main(String[] args) {
        DateFormat df =new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
        ExecutorService executorService= Executors.newFixedThreadPool(1);
        System.out.println(df.format(new Date()));

        for(int i=0;i<10;i++){
            executorService.submit(new Sendingmail());

        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(df.format(new Date()));
    }
}
