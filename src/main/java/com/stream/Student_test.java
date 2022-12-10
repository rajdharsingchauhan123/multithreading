package com.stream;

import com.consumer.Consumer1;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Student_test {
    public static void main(String[] args) {
        List<Student>students=Student_database.getallstudent();
      //  students.stream().sorted().forEach(System.out::println);
        //students.stream().filter(s->s.getName().startsWith("r")).forEach(System.out::println);

        // Filter with predicate uses
       // students.stream().filter(s->s.getAge()>22).collect(Collectors.toSet()).forEach(System.out::println);

        // Consumer usese
//        Consumer<Student> studentConsumer= student -> {
//            System.out.println("age:" +student.getAge());
//
//        };
//        studentConsumer.accept(students.get(2));

        // print all all student list in consumer
//        Consumer<Student>consumer= n->{
//            System.out.println(n);
//        };
//        students.forEach(consumer);


        students.stream().collect(Collectors.toSet()).forEach(System.out::println);





    }
}
