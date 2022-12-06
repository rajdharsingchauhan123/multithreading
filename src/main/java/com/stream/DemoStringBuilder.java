package com.stream;

import java.util.stream.Stream;

public class DemoStringBuilder {
    public static void main(String[] args) {
        Stream.Builder<String>builder=Stream.builder();
        builder.add("Tony Stark")
                .add("Steve Rogers")
                .add("Thor Odinson");

        Stream<String> stream = builder.build();

        //stream.forEach(System.out::println);
        stream.forEach(System.out::println);
    }
}
