package com.Multithreading;

public class ThreadGroupActiveGroupExp {
    public static void main(String arg[]) {
        // creating the thread group
        ThreadGroup tg1 = new ThreadGroup("parent thread group");
        ThreadGroup tg2 = new ThreadGroup(tg1, "child threadGroup");
        ThreadGroup tg3 = new ThreadGroup(tg1, "child threadGroup");

        // creating the threads
        ActiveThreadgrpex t1 = new ActiveThreadgrpex("Thread-1", tg1);
        System.out.println(t1.getName() + " starts");
        // this will call the run() method
        t1.start();

        // checking the number of active thread
        System.out.println("Number of active thread group: "
                + tg1.activeGroupCount());
    }
}
