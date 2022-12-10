package com.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Students {
    public int age;
    public String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Main{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
//        Consumer<Students> consumer=s1->s1.age= s1.age+1;
        Consumer<Students>consumer1=n->{
            System.out.println(n);
        };
        List<Students>studentsList= Arrays.asList(new Students(21,"Shiva"));
        studentsList.forEach(consumer1);
//        studentsList.forEach(consumer.andThen(consumer1));

    }
}