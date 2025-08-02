package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortById implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if((o1.getEmpId()-o2.getEmpId())>0){
           return 1;
        }
        else  if((o1.getEmpId()-o2.getEmpId())<0){
            return  -1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        List<Employee> empList=new ArrayList<>();
        Employee emp1=new Employee(2,"bhupesh","A");
        Employee emp2=new Employee(1,"Vishwakarna","B");
        Employee emp3=new Employee(3,"Kumar","c");

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

        Collections.sort(empList,new SortById());
        empList.forEach(System.out::println);





    }
}
