package com.Multithreading;

public class Rundemo implements Runnable{


    @Override
    public void run() {
        System.out.println("hello rha");
    }

    public static void main(String[] args) {
        Runnable r =()->{
            System.out.println("hello raj how are you");
        };
            Thread t =new Thread(r);
            t.start();
        String Thread1;
        Thread t1 =new Thread(r,"Thread1");
        System.out.println(t1.getName());
        Thread t2 =new Thread(r);
        t2.setName("Thread t2");
        System.out.println(t2.getName());
        System.out.println(t2.isAlive());
        


    }
}
