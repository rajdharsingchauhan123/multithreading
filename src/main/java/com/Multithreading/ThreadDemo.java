package com.Multithreading;

public class ThreadDemo extends Thread{

    @Override
    public void run() {
        for (int i=0;i<150009;i++){
        System.out.println("hello");}
    }
}

 class Threaddeomo1{
     public static void main(String[] args) {
         ThreadDemo threadDemo =new ThreadDemo();
         threadDemo.start();

         for (int i=0;i<139999;i++){

         System.out.println("hello rajdhar");}
     }
 }