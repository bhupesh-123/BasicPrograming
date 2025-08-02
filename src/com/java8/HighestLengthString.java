package com.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HighestLengthString {
    public static void main(String[] args) {
        String str="Hi bhupesh how are you";
       String result= Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println("Max length word: "+result);

        List<String> names = Arrays.asList("Ram", "Shyam", "Mohan", "Sita");
        names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------");
        names.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------");

        // sort by length
        names.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

     System.out.println("-------------------------Sort by age------------------------------------");

        employeeList.stream().sorted(Comparator.comparingInt(emp->emp.getAge())).forEach(System.out::println);

        System.out.println("-------------------------Sort by age and salary------------------------------------");
        employeeList.stream().sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getSalary)).forEach(System.out::println);

        System.out.println("-------------------------Employee With Max salary------------------------------------");

        Employee max = employeeList.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);
        System.out.println("Max salary Employee: "+max);

        System.out.println("-------------------------Max salary------------------------------------");
        OptionalDouble maxSalary = employeeList.stream().mapToDouble(Employee::getSalary).max();
        System.out.println("Max salary of employee: "+maxSalary);

        System.out.println("-------------------------name start with M------------------------------------");
        employeeList.stream().filter(e->e.getName().startsWith("M")).forEach(System.out::println);

        System.out.println("-------------------------Remove null------------------------------------");

        List<String> words = Arrays.asList("hello", "", null, "world", "java");
        List<String> collectListOfString = words.stream().filter(w -> (w != null && !w.isEmpty())).collect(Collectors.toList());
        System.out.println(collectListOfString);

        System.out.println("-------------------------Female Employee------------------------------------");
        List<Employee> femaleEmployee = employeeList.stream().filter(emp -> emp.getGender().equalsIgnoreCase("Female")).collect(Collectors.toList());
        System.out.println(femaleEmployee);

        System.out.println("-------------------------FlatMap ------------------------------------");

        String[][] data = { {"A", "B"}, {"C", "D"} };
        List<String> flatMap = Arrays.stream(data).flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println(flatMap);

       List<String> nameInCaptail = names.stream().map(String::toUpperCase).collect(Collectors.toList());

     List<List<Integer>> numbers = List.of(
             List.of(1, 2),
             List.of(3, 4),
             List.of(5, 6)
     );

     List<Integer> listOfInt=numbers.stream().flatMap(List::stream).collect(Collectors.toList());
     System.out.println("listOfInt: "+listOfInt);
     System.out.println("-------------------------grouping by department ------------------------------------");
     Map<String, List<Employee>> employeesByDepartment = employeeList.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment()));
     employeesByDepartment.forEach((dept, employees) -> {
      System.out.println("Department: " + dept);
      employees.forEach(emp -> System.out.println("  - " + emp.toString()));
     });

     System.out.println("-------------------------grouping by gender ------------------------------------");
     Map<String, List<Employee>> employeesByGender = employeeList.stream().collect(Collectors.groupingBy(emp -> emp.getGender()));
     employeesByGender.forEach((gender, employees) -> {
      System.out.println("Gender: " + gender);
      employees.forEach(emp -> System.out.println("  - " + emp.toString()));
     });
     System.out.println("-------------------------Count Employee in each department ------------------------------------");
     Map<String, Long> empCountByDept = employeeList.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.counting()));
     empCountByDept.forEach((dept, count) ->
             System.out.println(dept + " -> " + count));

     System.out.println("------------------------- Avg salary of each department ------------------------------------");
     Map<String, Double> avgSalaryOfDept = employeeList.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.averagingDouble(sal -> sal.getSalary())));
     avgSalaryOfDept.forEach((dept,sal)->
                     System.out.println(dept+" have avg salary: "+sal)
             );
     System.out.println("------------------------- Sum of salary of each department ------------------------------------");
     Map<String, Double> sumSalaryOfDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
     sumSalaryOfDept.forEach((dept,sum)->
             System.out.println(dept+" sum salary: "+sum)
     );


     System.out.println("------------------------- Name of employee in each department ------------------------------------");
     Map<String, List<String>> namesByDept = employeeList.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.mapping(empName -> empName.getName(), Collectors.toList())));

     namesByDept.forEach((dept, empNames) ->
             System.out.println(dept + " -> " + empNames));

     System.out.println("------------------------- split in two group based on salary ------------------------------------");
     Map<Boolean, List<Employee>> partitioningByGender = employeeList.stream().collect(Collectors.partitioningBy(emp -> emp.getGender().equalsIgnoreCase("Male")));
     System.out.println("partitioningByGender: "+partitioningByGender);

        System.out.println("------------------------- Employee with second highest salary ------------------------------------");
       Optional<Employee> secondMaxSalaryEmployee=employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
        System.out.println("secondMaxSalaryEmployee: "+secondMaxSalaryEmployee);

        System.out.println("------------------------- Second highest salary ------------------------------------");

        Optional<Double> secondMaxSalary = employeeList.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println("secondMaxSalary: "+secondMaxSalary);

        System.out.println("-------------------------grouping by department and employee ------------------------------------");
        Map<String, List<String>> allEmployeeWithDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println("allEmployeeWithDept: "+allEmployeeWithDept);

        System.out.println("-------------------------grouping by Gender and employee ------------------------------------");
        Map<String, List<String>> groupingByGenderAndEmployeeName = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println("groupingByGenderAndEmployeeName: "+groupingByGenderAndEmployeeName);

        System.out.println("-------------------------Count employee in Each Department ------------------------------------");
        Map<String, Long> employeeInEachDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println("employeeInEachDepartment: "+employeeInEachDepartment);

        System.out.println("-------------------------max salary in each department ------------------------------------");
        Map<String, Optional<Employee>> maxSalaryInEachDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println("maxSalaryInEachDepartment: "+maxSalaryInEachDepartment);

        System.out.println("-------------------------duplicate element------------------------------------");

        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 1);
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicateElement = list.stream().filter(num -> !seen.add(num)).collect(Collectors.toSet());
        System.out.println("duplicateElement: "+duplicateElement);

        System.out.println("-------------------------partition element into even odd------------------------------------");
        Map<Boolean, Set<Integer>> partitionElementIntoEvenOdd = list.stream().collect(Collectors.groupingBy(num -> num % 2 == 0,Collectors.toSet()));
        System.out.println("partitionElementIntoEvenOdd: "+partitionElementIntoEvenOdd);

        Map<Boolean, List<Integer>> partitions = list.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("partitions: "+partitions);


        System.out.println("-------------------------Sort list of employees by salary (descending) then by name (ascending)------------------------------------");
        List<Employee> empSortBySalaryThenName = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed().thenComparing(Employee::getName)).collect(Collectors.toList());
        System.out.println("empSortBySalaryThenName: "+empSortBySalaryThenName);

        System.out.println("-------------------------Longest word in string------------------------------------");

        String  longestWord = Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println("longestWord: "+longestWord);

        System.out.println("-------------------------Longest employee name------------------------------------");
        String longestEmployeeName = employeeList.stream().map(Employee::getName).max(Comparator.comparing(String::length)).get();
        System.out.println("longestEmployeeName: "+longestEmployeeName);

        System.out.println("-------------------------Combine list and sort------------------------------------");

        List<Integer> numbers1=Arrays.asList(10,2,23,9,7);
        List<Integer> numbers2=Arrays.asList(8,3,6,11);
        List<Integer> numbers3=Arrays.asList(10,2,23,9,7);

        List<Integer> combineNumbersAndSort= Stream.concat(numbers1.stream(),numbers2.stream()).sorted( ).collect(Collectors.toList());
        System.out.println("combineNumbersAndSort: "+combineNumbersAndSort);

        List<Integer> combineNumbersAndSort1=Stream.of(numbers1,numbers2,numbers3).flatMap(List::stream).collect(Collectors.toList());
        System.out.println("combineNumbersAndSort1: "+combineNumbersAndSort1);



    }
}
