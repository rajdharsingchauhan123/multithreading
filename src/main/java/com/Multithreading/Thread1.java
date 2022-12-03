package com.Multithreading;


import static java.lang.Thread.*;

class Runner extends Thread{
    public void run(){


        for(int i=0;i<1000;i++){
            System.out.println("hello " + i);

            try {
                sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Thread1 {
    public static void main(String[] args) {
        Runner runner=new Runner();
        runner.start();
    }
}