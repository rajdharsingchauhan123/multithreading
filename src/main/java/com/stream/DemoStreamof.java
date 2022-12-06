package com.stream;

import java.util.stream.Stream;

public class DemoStreamof {
    public static void main(String[] args) {

        Stream<Integer> stream1 = Stream.of(1);
        System.out.println("Size of Stream1: " + stream1.count());

        Stream<Integer> stream2 = Stream.of(1, 2, 3);
        System.out.println("Size of Stream2: " + stream2.count());
    }
}
