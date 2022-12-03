package com.consumer;

import java.util.function.Function;

public class Consumer_fuction {
    public static void main(String[] args) {
        Function<String,Integer>function=(t)->t.length();
        System.out.println(function.apply("tsjfhfgf"));
    }
}
