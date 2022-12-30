package Com.DemoMultithreading;

public class Threadjava001 {
    public static void main(String[] args) {
        System.out.println("hello this is main thread"+Thread.currentThread().getName());
        Thread t =new Secondtask();
      new Secondtask().start();
//        Thread t1 =new Secondtask();
//        t1.start();

    }
}
class Secondtask extends Thread{
    private static String name ="raj";
    private   String na;

    @Override
    public void run() {
     for (int i=0;i<10;i++){
         System.out.println("hello " +i + "and "+ name);

     }
    }
    public Secondtask(){
        this.na =name;
       this.start();
       // new Thread(this).start(); // we are doing this they class will we runable and assign the task
    }
}
