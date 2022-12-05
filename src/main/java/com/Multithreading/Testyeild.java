package com.Multithreading;

public class Testyeild extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" -"+i);

        }
    }

    public static void main(String[] args) {
        Testpriority t=new Testpriority();
        t.start();
        Thread.yield();
        for (int i=1;i<=5;i++){

            System.out.println(Thread.currentThread().getName()+" -"+i);
        }
    }
}

