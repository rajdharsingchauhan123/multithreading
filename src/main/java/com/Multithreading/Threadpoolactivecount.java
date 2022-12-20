package com.Multithreading;

public class Threadpoolactivecount extends Thread{
    Threadpoolactivecount(String tName,ThreadGroup tgrp){
        super(tgrp,tName);
        start();
    }

    @Override
    public void run() {
//        for (int i=0;i<1000;i++){
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
//            }


        }
    }
}
