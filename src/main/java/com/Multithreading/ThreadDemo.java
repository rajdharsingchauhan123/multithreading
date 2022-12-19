package com.Multithreading;

public class ThreadDemo extends Thread{

    @Override
    public void run() {
        for (int i=0;i<150009;i++){
        System.out.println("hello");}
    }
}
class thread1 implements Runnable{
    @Override
    public void run() {

        for (int i=0;i<1400;i++){
            System.out.println("hello ravi how are yuo");
        }
    }
}
class Threaddeomo1 {
     public static void main(String[] args) {
         ThreadDemo threadDemo =new ThreadDemo();

         thread1 t =new thread1();
         Thread t1 =new Thread(t);
         t1.start();

         System.out.println("hii");
         threadDemo.start();

         for (int i=0;i<139999;i++){

         System.out.println("hello rajdhar");}
     }
 }