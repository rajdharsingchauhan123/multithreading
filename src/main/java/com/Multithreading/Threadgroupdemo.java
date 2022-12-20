package com.Multithreading;

public class Threadgroupdemo implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        Threadgroupdemo runnable =new Threadgroupdemo();
        ThreadGroup tg1 =new ThreadGroup("parent Thread group");
        Thread t1 =new Thread(tg1,runnable,"one");
        t1.start();
        Thread t2 =new Thread(tg1,runnable,"two");
        t2.start();
        System.out.println("Thread group namen"+tg1.getName());
        tg1.list();
        System.out.println("active thread" +tg1.activeCount());
    }
}
