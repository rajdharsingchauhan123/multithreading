package com.Multithreading;


class Sender{
    public void send(String msg){
        System.out.println("sending\t"+msg);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\n"+msg+"send");

    }
}
public class SychronizedEx extends Thread {
    private String msg;
    Sender sender;

    SychronizedEx(String msg, Sender sender) {
        this.msg = msg;
        this.sender = sender;

    }

    @Override
    public void run() {
        synchronized (sender) {
            sender.send(msg);
        }
    }
}
class  sycdemo {
    public static void main(String[] args) {


        Sender s = new Sender();
        SychronizedEx t1 = new SychronizedEx("hii", s);
        SychronizedEx s2 = new SychronizedEx("byy", s);

        t1.start();
        s2.start();
        System.out.println("hello");

    }
}