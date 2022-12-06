package com.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {
 public static List<Empolyee>getAllEmployee(){
   Empolyee empolyees=  new Empolyee("rajhdar",12,12234,"male");

    List<Empolyee>empolyees1=Arrays.asList(empolyees);
    return empolyees1;
 }
}

