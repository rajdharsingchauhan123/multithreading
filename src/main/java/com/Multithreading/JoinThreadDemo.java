package com.Multithreading;

public class JoinThreadDemo {
 private   int count=0;

    public static void main(String[] args) {
        JoinThreadDemo j =new JoinThreadDemo();
        j.dowork();

    }
    public void dowork(){
        Thread t1 =new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0; i<1000;i++){
                    count++;
                }
            }
        });
        Thread t2 =new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0; i<1000;i++){
                    count++;
                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("count is "+count);


    }
}
