package com.Multithreading;

public class ActiveThreadgrpex extends Thread {
    ActiveThreadgrpex(String tName, ThreadGroup tgrp) {
        super(tgrp, tName);

    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
