package Com.DemoMultithreading;

import java.util.concurrent.TimeUnit;

public class DemoThread {
    public static void main(String[] args) {
        System.out.println("start method in main thread");
        new Firsttask();
        Thread t =new Firsttask();
        System.out.println("main Thread end");

    }
}
 class Firsttask extends Thread{
    private static  int count =0;
    private int id;

     @Override
     public void run() {
       for(int i=0 ;i<10; i++){
           System.out.println("hello thread "+id + "hello " +i);

       }
         try {
             TimeUnit.MILLISECONDS.sleep(1000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }

     }
    public Firsttask(){
         this.id = ++count;
         this.start();
    }
 }
