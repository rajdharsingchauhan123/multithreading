package com.Multithreading;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Worker {
  private static Random random =new Random();
  private static Object lock1 =new Object();
  private Object lock2 =new Object();
  private static List<Integer>list1=new ArrayList<>();
  private static List<Integer>list2 =new ArrayList<>();

  public static void stageone(){

      synchronized (lock1){
          try {
              Thread.sleep(1);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
      }

      list1.add(random.nextInt(100));
  }
    public synchronized static void stageone2(){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        list2.add(random.nextInt(100));
    }
    public synchronized static void process(){
      for(int i=0;i<1000;i++){

          stageone();
          stageone2();
      }

    }

    public static void main(String[] args) {
        System.out.println("starting ....");
        long start=System.currentTimeMillis();

        //process();
        Thread t1= new Thread(new Runnable(){
            @Override
            public void run() {

            }
        });
        Thread t2= new Thread(new Runnable(){
            @Override
            public void run() {

            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long end=System.currentTimeMillis();
        System.out.println("Time take "+(end-start));
        System.out.println("list1 "+ list1.size() +" " +"list2" +list2.size());
    }
}
