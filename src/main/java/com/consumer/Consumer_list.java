package com.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_list {
    public static <list> void main(String[] args) {
        List<String> list= Arrays.asList("a","b","c");

        //Consumer<String>consumer=(t)-> System.out.println(t);
        Consumer<List> l=(t)-> System.out.println(t);
        l.accept(list);
        //list.forEach(consumer);
//       list.forEach(l);
    }

}
