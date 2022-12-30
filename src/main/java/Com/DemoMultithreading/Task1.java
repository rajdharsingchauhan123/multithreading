package Com.DemoMultithreading;

import java.util.concurrent.TimeUnit;

public class Task1 implements Runnable{
    private static int count =0;
    int id ;
    @Override
    public void run() {
        System.out.println("print "+id );
        for(int i =6;i>0;i--){

            try {
                TimeUnit.MILLISECONDS.sleep(600);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("complete"+id);

    }
    public Task1(){
        this.id=++count;
        new Thread(this).start();
    }
}
