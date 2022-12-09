package com.stream;

import java.util.Arrays;
import java.util.List;

public class Student_database {
    public static List<Student>getallstudent(){
        Student s1 =new Student("rajdhar",22,1062,1235);
        Student s2 =new Student("shivaknat",26,10062,1234);
        Student s3 =new Student("promod",25,13062,1245);
        Student s4 =new Student("vinay",24,10622,2345);
        Student s5 =new Student("don",23,10621,145);

        List<Student>students = Arrays.asList(s1,s2,s3,s4,s5);
        return students;
    }
}
