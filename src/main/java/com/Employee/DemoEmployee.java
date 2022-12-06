package com.Employee;

import java.util.List;
import java.util.stream.Stream;
interface Consumer<T>{
    void accept(T t);
}
public class DemoEmployee {
    public static void main(String[] args) {
        List<Empolyee>empolyees=EmployeeDatabase.getAllEmployee();
        Consumer<Empolyee>c=empolyee -> {
            System.out.println(empolyee.getFirstname());
        };
c.accept(empolyees.get(0));
    }
}
