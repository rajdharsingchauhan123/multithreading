package com.stream;

import java.util.ArrayList;
import java.util.List;

public class Stream_count {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("rajdhar");
        list.add("singhraj");
        list.add("Monksy");
        list.add("ravikant");
        long totalmatch=list.stream().filter(s -> s.startsWith("r")).count();
        System.out.println(totalmatch);
        String firstMatchedName = list.stream().filter((s) -> s.startsWith("M")).findFirst().get();




        System.out.println(firstMatchedName);
    }
}