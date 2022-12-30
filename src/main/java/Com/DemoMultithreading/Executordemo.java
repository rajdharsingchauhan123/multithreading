package Com.DemoMultithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executordemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(12);

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("executor service");
            }
        });
        executorService.shutdown();
    }

}
