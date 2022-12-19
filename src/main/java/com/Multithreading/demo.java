package com.Multithreading;

import java.util.concurrent.*;

class processor implements Runnable{
    private int id;
    processor(int id){
        this.id=id;
    }

    @Override
    public void run() {
        System.out.println("starting" +id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("staring"+id);



    }
}
public class demo{
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        for(int i=0;i<5;i++){
            executorService.submit(new processor(i));

        }
        executorService.shutdown();

        System.out.println("all taskeed sumbitted");

        executorService.awaitTermination(1, TimeUnit.DAYS);

        System.out.println("all taks compilited");

    }
}