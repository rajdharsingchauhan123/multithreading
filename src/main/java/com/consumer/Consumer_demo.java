package com.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_demo {
    public static void main(String[] args) {
        Consumer<String> consumer = (t) -> System.out.println(t);
        consumer.accept("ramesh");

        Consumer<String>consumer1 =(s)-> System.out.println(s +"world");
        Consumer<String>consumer2=(s)-> System.out.println(s +"java");
        consumer2.andThen(consumer1).accept("rahul");

        List<Integer> integer= Arrays.asList(1,2,3,5,6);
//        Consumer<Integer> consumer3=(t)-> System.out.println(t);
        integer.forEach((t)-> System.out.println(t));
        Consumer<Integer>consumer3=(t)-> System.out.println(t);
        consumer3.accept(123);


    }
}
