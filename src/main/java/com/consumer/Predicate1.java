package com.consumer;

import java.util.function.Predicate;

public class Predicate1 {

        public static void main(String[] args)
        {
            // Creating predicate
            Predicate<Integer> predicate = i -> (i < 18);

            // Calling Predicate method
            System.out.println(predicate.test(10));
        }

}
