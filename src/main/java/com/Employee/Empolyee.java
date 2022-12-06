package com.Employee;

import java.util.ArrayList;
import java.util.List;

public class Empolyee {
    private String firstname;
    private Integer id;
    private Integer monumber;
    private String gender;

   // List<String>activitees =new ArrayList<>();

    public Empolyee(String firstname, Integer id, Integer monumber, String gender) {
        this.firstname = firstname;
        this.id = id;
        this.monumber = monumber;
        this.gender = gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMonumber() {
        return monumber;
    }

    public void setMonumber(Integer monumber) {
        this.monumber = monumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Empolyee{" +
                "firstname='" + firstname + '\'' +
                ", id=" + id +
                ", monumber=" + monumber +
                ", gender='" + gender + '\'' +
                '}';
    }
}
