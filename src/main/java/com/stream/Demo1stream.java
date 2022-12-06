package com.stream;

import java.util.stream.Stream;

public class Demo1stream {
    public static <T> void main(String[] args) {
        Stream<T>stream=Stream.empty();
        Stream<T>stream1=Stream.empty();

        System.out.println(stream.count());

    }
}
