package com.stream;

import java.util.Arrays;
import java.util.List;

public class Student_database {
    public static List<Student>getallstudent(){
        Student s1 =new Student("rajdhar",22,10621,1235);
        Student s2 =new Student("shivaknat",26,100262,1234);
        Student s3 =new Student("promod",25,130623,1245);
        Student s4 =new Student("vinay",24,106224,2345);
        Student s5 =new Student("Singh",23,106215,145);
        Student s6 =new Student("chauhan",26,106216,145);
        Student s7 =new Student("don",27,106217,145);
        Student s8 =new Student("raj",29,108621,145);
        Student s9 =new Student("dhar",30,106921,145);
        Student s10 =new Student("don singh",13,1061221,145);
        Student s11 =new Student("don",43,1062113,145);
        Student s12 =new Student("monkey",79,1062114,145);
        Student s14 =new Student("shiva",12,1062115,145);
        Student s15=new Student("doee",10,1062116,145);
        Student s16 =new Student("donsfe",223,1062117,145);
        Student s17 =new Student("dragn",231,10621811,145);
        Student s18=new Student("rajdhar",232,1062111,145);
        Student s19 =new Student("dorajd",233,1062112,145);
        Student s20=new Student("don",27,10621121,145);
        Student s21 =new Student("don",28,10621111,145);
        Student s22=new Student("don",29,1062132,145);
        Student s23=new Student("don",230,10621132,145);
        Student s524=new Student("don",111,10622331,145);
        Student s25=new Student("don",123,1062134,145);
        Student s26= new Student("don",321,1062155,145);
        Student s27=new Student("don",230,1062156,145);
        Student s28=new Student("don",2,1062143,145);
        Student s29=new Student("don",3,1062153,145);
        Student s30=new Student("don",923,1062341,145);


        List<Student>students = Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s15,s14,s16,s17,s18,s19,s20,
        s21,s22,s23,s26,s25,s27,s29,s28,s30);
        return students;
    }
}
