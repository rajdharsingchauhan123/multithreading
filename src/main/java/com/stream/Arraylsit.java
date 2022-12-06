package com.stream;

import java.util.ArrayList;
import java.util.List;

public class Arraylsit {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("rajdhar");
        list.add("ravi");
        list.add("raj");
        list.add("rajdhar singh chauahn");
        list.add("promode sir ");
        list.add("ravikant");
      list.stream().distinct().forEach(System.out::println);
      list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));

    }
}
