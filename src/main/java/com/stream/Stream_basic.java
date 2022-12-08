package com.stream;

import java.util.ArrayList;
import java.util.List;

public class Stream_basic {
    public static void main(String[] args) {
        List<String>list =new ArrayList<>();
        list.add("rajdhar");
        list.add("singhraj");
        list.add("Monksy");
        list.add("ravikant");
        list.stream().filter((s)->s.startsWith("r")).forEach(System.out::println);
        list.stream().filter((s) -> s.startsWith("r")).map(String::toUpperCase).forEach(System.out::println);
        list.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

    }

}
