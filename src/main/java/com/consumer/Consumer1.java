package com.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer1 {


    public static class Java8Consumer3 {

        public static void main(String[] args) {

            List<String> list = Arrays.asList("a", "ab", "abchhhh");
            run(list, x -> System.out.println(x.length()));

        }

        static <T> void run(List<T> list, Consumer<T> consumer) {
            for (T t : list) {
                consumer.accept(t);
            }
        }

    }
}
