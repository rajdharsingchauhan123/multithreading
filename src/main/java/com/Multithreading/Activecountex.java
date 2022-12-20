package com.Multithreading;

public class Activecountex {
    public static void main(String[] args) {

        ThreadGroup tg =new ThreadGroup("parent");
        Threadpoolactivecount t1=new Threadpoolactivecount("first ",tg);
        System.out.println("starting thread");
        Threadpoolactivecount t2=new Threadpoolactivecount("second  ",tg);
        System.out.println("starting  sec thread");
        Threadpoolactivecount t3=new Threadpoolactivecount("three",tg);
        System.out.println("starting  third thread");
        Threadpoolactivecount t4=new Threadpoolactivecount("four",tg);
        System.out.println("starting four thread");
        System.out.println("Thread is active count is" +tg.activeCount());

    }
}
