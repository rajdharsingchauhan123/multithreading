package com.Multithreading;

public class TestDemon extends Thread{
    public void run(){
        System.out.println("demon thread");
    }

    public static void main(String[] args) {
        System.out.println("main thread");
        TestDemon t =new TestDemon();
        t.setDaemon(true);
        t.start();
    }
}
