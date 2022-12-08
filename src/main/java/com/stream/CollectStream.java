package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("rajdhar");
        list.add("singhraj");
        list.add("Monksy");
        list.add("ravikant");


      //  list.stream().sorted().map(s -> s.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
        List<String>newlist=   list.stream().sorted().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(newlist);
    }

}
