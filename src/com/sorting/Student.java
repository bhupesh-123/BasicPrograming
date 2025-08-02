package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements  Comparable<Student>{
    public int rollNo;
    public String name;
    public String section;

    public Student(int rollNo, String name, String section) {
        this.rollNo = rollNo;
        this.name = name;
        this.section = section;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", section='" + section + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.rollNo-o.rollNo;
    }

    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        Student s1=new Student(1,"bhupesh","c");
        Student s2=new Student(3,"vishwakarma","a");
        Student s3=new Student(2,"kumar","b");
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        Collections.sort(studentList);
        for(Student s:studentList){
            System.out.println(s);
        }




    }
}
