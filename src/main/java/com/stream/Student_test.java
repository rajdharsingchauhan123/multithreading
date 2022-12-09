package com.stream;

import java.util.List;

public class Student_test {
    public static void main(String[] args) {
        List<Student>students=Student_database.getallstudent();
      //  students.stream().sorted().forEach(System.out::println);
        students.stream().filter(s->s.getName().startsWith("r")).forEach(System.out::println);
    }
}
