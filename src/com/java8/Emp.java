package com.java8;

import java.util.List;

public class Emp {
    int id;
    String name;
    double salary;
    List<String> skills;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    Emp(int id, String name, double salary, List<String> skills) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.skills = skills;
    }
}
