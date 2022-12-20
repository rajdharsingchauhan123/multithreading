package com.Multithreading;

public class Setprioritydemo extends Thread{
   public void run(){
        System.out.println("Priority of thread is " +Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {
        Setprioritydemo sp=new Setprioritydemo();
        //sp.setPriority(Thread.MAX_PRIORITY);
        sp.setPriority(Thread.MIN_PRIORITY);
        sp.start();
    }
}
