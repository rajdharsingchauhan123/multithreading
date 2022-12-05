package com.Multithreading;

public class Testpriority extends Thread{
    public void run(){
        System.out.println("child thread");
        System.out.println("child thread priority :" +Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {
        System.out.println("main thread old priority " +Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("main thread priority:"+Thread.currentThread().getPriority());

        Testpriority t =new Testpriority();
        t.start();
    }
}
