package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByName implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }

    public static void main(String[] args) {
        List<Employee> empList=new ArrayList<>();
        Employee emp1=new Employee(2,"bhupesh","A");
        Employee emp2=new Employee(1,"Vishwakarna","B");
        Employee emp3=new Employee(3,"Kumar","c");

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        System.out.println("-------------------SortByName-----------------------------");
        empList.stream().sorted(Comparator.comparing(s->s.name)).forEach(System.out::println);

        System.out.println("-------------------SortByName-----------------------------");


        Collections.sort(empList,new SortByName());
        empList.forEach(System.out::println);
        System.out.println("--------------------SortById----------------------------");

        Collections.sort(empList,new SortById());
        empList.forEach(System.out::println);
        System.out.println("---------------------using java 8---------------------------");
        //using java 8
        List<Employee> empList1=new ArrayList<>();

        Employee emp4=new Employee(7,"Zam","A");
        Employee emp5=new Employee(4,"Atul","B");
        Employee emp6=new Employee(1,"Abhi","c");
        Employee emp7=new Employee(4,"Sohan","c");
        empList1.add(emp4);
        empList1.add(emp5);
        empList1.add(emp6);
        empList1.add(emp7);


        Comparator<Employee> sort=Comparator.comparing(Employee::getEmpId).reversed().thenComparing(Employee::getName);
        Collections.sort(empList1,sort);

        empList1.forEach(System.out::println);

        System.out.println("---------------------sort by id then name---------------------------");
        empList1.stream().sorted(Comparator.comparing(Employee::getEmpId).thenComparing(Employee::getName)).forEach(System.out::println);




    }
}
