package com.Animal;

public abstract class Bufflow implements Animal {
    @Override
    public void eat() {
        System.out.println("the animal is eating");
    }

    @Override
    public void run() {
        System.out.println("animal is running");
    }

    public static void main(String[] args) {
        System.out.println("give the milk");
    }
}
