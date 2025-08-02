package com.sorting;

public class Employee {
    public int empId;
    public String name;
    public String roll;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public Employee(int empId, String name, String roll) {
        this.empId = empId;
        this.name = name;
        this.roll = roll;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", roll='" + roll + '\'' +
                '}';
    }
}
