package com.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamArray {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {1, 2, 3, 4, 5};

        Stream<Integer> stream = Arrays.stream(array);

        System.out.println("Size: " + stream.count());
    }
}

