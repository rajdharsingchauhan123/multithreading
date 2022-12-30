package Com;


import Com.DemoMultithreading.Task1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executorservices2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Task1());


        }
        executorService.shutdown();
    }
}