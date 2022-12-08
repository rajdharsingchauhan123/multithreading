package com.stream;

import java.util.ArrayList;
import java.util.List;

public class Stream_matches {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("rajdhar");
        list.add("singhraj");
        list.add("Monksy");
        list.add("ravikant");
        boolean matchedResult = list.stream().anyMatch((s) -> s.startsWith("A"));


        System.out.println(matchedResult);     //true

        matchedResult = list.stream().allMatch((s) -> s.startsWith("A"));


        System.out.println(matchedResult);     //false

        matchedResult = list.stream().noneMatch((s) -> s.startsWith("A"));


        System.out.println(matchedResult);     //false
    }
}
