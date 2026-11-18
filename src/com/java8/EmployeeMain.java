package com.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//  https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/
public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        // How many male and female employees are there in the organization
        Map<String,Long> noOfMaleAndFemaleEmployees=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(noOfMaleAndFemaleEmployees);

        //Print the name of all departments in the organization?
        employeeList.stream().map(emp->emp.getDepartment()).distinct().forEach(System.out::println);

        //What is the average age of male and female employees?
        Map<String,Double> avgAgeOfMaleAndFemaleEmployees=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        System.out.println(avgAgeOfMaleAndFemaleEmployees);

        //Get the details of highest paid employee in the organization?
        Optional<Employee>  highestPaidEmployeeWrapper=employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println(highestPaidEmployeeWrapper);

        Optional<Employee>  maxSalaryEmployee=employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(maxSalaryEmployee);

        //Get the names of all employees who have joined after 2015?
        employeeList.stream().filter(employee -> employee.getYearOfJoining()>2015).map(e->e.getName()).forEach(System.out::println);

        // Count the number of employees in each department?
        Map<String,Long> employeeCountByDepartment=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(employeeCountByDepartment);

        // What is the average salary of each department?
        Map<String,Double>  avgSalaryOfDepartments= employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalaryOfDepartments);
        Set<Map.Entry<String,Double>>  entrySet=avgSalaryOfDepartments.entrySet();
        for (Map.Entry<String, Double> entry : entrySet)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        //Get the details of youngest male employee in the product development department?
        Optional<Employee>  youngestMaleEmployeeInProductDevelopment=employeeList.stream().filter(emp->emp.getGender().equalsIgnoreCase("male") && emp.getDepartment().equalsIgnoreCase("product development")).collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
        System.out.println(youngestMaleEmployeeInProductDevelopment);

        // Who has the most working experience in the organization?
        Optional<Employee> seniorMostEmployee=employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
        System.out.println(seniorMostEmployee);

        // 2nd Who has the most working experience in the organization?
        Optional<Employee> seniorMostEmployee2=employeeList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst();
        System.out.println(seniorMostEmployee2);

        //  Query 3.10 : How many male and female employees are there in the sales and marketing team?
        Map<String,Long>  countMaleFemaleEmployeesInSalesMarketing=employeeList.stream().filter(employee -> employee.getDepartment().equals("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(countMaleFemaleEmployeesInSalesMarketing);

        //Query 3.11 : What is the average salary of male and female employees?
        Map<String,Double>  avgSalaryOfMaleAndFemaleEmployees=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalaryOfMaleAndFemaleEmployees);

        //Query 3.12 : List down the names of all employees in each department?
        Map<String, List<Employee>> employeeListByDepartment= employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));


        //Query 3.13 : What is the average salary and total salary of the whole organization?
      //  Map<String,Double>   employeeSalaryStatistics=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
       // System.out.println(employeeSalaryStatistics);

        DoubleSummaryStatistics employeeSalaryStatistics=
                employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average Salary = "+employeeSalaryStatistics.getAverage());

        System.out.println("Total Salary = "+employeeSalaryStatistics.getSum());

      // Query 3.14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        Map<Boolean, List<Employee>> partitionEmployeesByAge=
                employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
        System.out.println(partitionEmployeesByAge);

        //Query 3.15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Optional<Employee>  oldestEmployee=employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
        System.out.println(oldestEmployee);

        List<Employee> sortByNameThenSalary = employeeList.stream().sorted(Comparator.comparing(Employee::getName)).sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println("sortByNameThenSalary"+sortByNameThenSalary);

        // find max salary
        Employee minSalaryEmp= employeeList.stream().min(Comparator.comparing(Employee::getSalary)).get();
        System.out.println("maxSalary: "+minSalaryEmp);

       Double  maxSal=employeeList.stream().mapToDouble(Employee::getSalary).max().orElseThrow();
        System.out.println("maxSal: "+maxSal);

        Double  minSal=employeeList.stream().mapToDouble(Employee::getSalary).min().orElseThrow();
        System.out.println("minSal: "+minSal);

        Map<String, Optional<Employee>>  optionalMaxSalaryBy = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println("optionalMaxSalaryBy: "+optionalMaxSalaryBy);

        // find greater and less than 15K
        Map<Boolean, List<Employee>> greaterThan15k = employeeList.stream().collect(Collectors.partitioningBy(sal -> sal.getSalary() > 15000));
        List<Employee> employeesGreaterThan15k = greaterThan15k.get(true);
        List<Employee> employeesLessThan15k = greaterThan15k.get(false);
        System.out.println("employeesGreaterThan15k: "+employeesGreaterThan15k+" employeesLessThan15k: "+employeesLessThan15k);

        // Convert List into using id is as key
        Map<Integer, Employee> employeeMap = employeeList.stream().collect(Collectors.toMap(Employee::getId, Function.identity(), (exsisting, replacement) -> replacement));
        System.out.println("employeeMap"+employeeMap);

        // Employee base on joining year
        Map<Integer, List<Employee>> joiningYear = employeeList.stream().collect(Collectors.groupingBy(Employee::getYearOfJoining));
        System.out.println("joiningYear: "+joiningYear);

        Map<Integer, List<String>> employeeNameWithJoiningYear = employeeList.stream().collect(Collectors.groupingBy(Employee::getYearOfJoining, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println("employeeNameWithJoiningYear: "+employeeNameWithJoiningYear);

        // https://chatgpt.com/c/69c6b431-3348-83a7-a2ed-5d46f5751344

        // Grouping + Summing
        // total Salary By Dept 
        Map<String, Double> totalSalaryByDept  = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
        System.out.println("totalSalaryByDept: "+totalSalaryByDept );

        // Partitioning + Summing
        Map<Boolean, Double> empsSalarygreaterThan2k = employeeList.stream()
                .collect(Collectors.partitioningBy(s -> s.getSalary() > 20000, Collectors.summingDouble(Employee::getSalary)));
        System.out.println("empsSalarygreaterThan2k: "+empsSalarygreaterThan2k);

        // employees name in each department
        Map<String, Set<String>> employeeInEachDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toSet())));
        System.out.println("employeeInEachDepartment: "+employeeInEachDepartment);

        // employee Joined From specific year
        Map<Boolean, List<String>> employeesJoinedFromSpecificYear = employeeList.stream().collect(Collectors.partitioningBy(e -> e.getYearOfJoining() >= 2013, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println("employeeJoinedFromSpecificYear: "+employeesJoinedFromSpecificYear);
        List<String> employeeJoinedFromSpecificYearTrue = employeesJoinedFromSpecificYear.get(true);
        System.out.println("employeeJoinedFromSpecificYearTrue: "+employeeJoinedFromSpecificYearTrue);

        //employee join after 2013
        List<String> empJoinedOn2013 = employeeList.stream().filter(e -> e.getYearOfJoining() >= 2013).collect(Collectors.mapping(Employee::getName, Collectors.toList()));
        System.out.println("empJoinedOn2013: "+empJoinedOn2013);

        // find duplicate name
        Set<String> duplicateName=employeeList.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting())).entrySet().stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toSet());
        System.out.println("duplicateName: "+duplicateName);

        // find nth highest salary
       Optional<Employee> maxSalaryOptional= employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("maxSalary: "+maxSalaryOptional);
        Employee maxSalary= employeeList.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);

        // find nth highest salary
        int n=3;
        Optional<Double> thirdHighestSalary = employeeList.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(n - 1).findFirst();
        System.out.println("thirdHighestSalary: "+thirdHighestSalary);

        Optional<Employee> thirdHighestSalaryEmployee = employeeList.stream().distinct().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(n - 1).findFirst();
        System.out.println("thirdHighestSalaryEmployee: "+thirdHighestSalaryEmployee);

        // find longest name employee
        Employee longestEmployeeName = employeeList.stream().max(Comparator.comparing(e -> e.getName().length())).get();
        System.out.println("longestEmployeeName: "+longestEmployeeName);

        // Sort by salary descending, then name ascending
        List<Employee> sortBySalDesendingAndNameAsending = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed().thenComparing(Employee::getName)).collect(Collectors.toList());
        System.out.println("sortBySalDesendingAndNameAsending: "+sortBySalDesendingAndNameAsending);

        // reduce
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum=numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println("sum of numbers: "+sum);

        //Max number
        int maxNumber=numbers.stream().reduce(Integer.MIN_VALUE,(a,b) -> a>b?a:b);
        System.out.println("maxNumber: "+maxNumber);
       // string cancanate
        List<String> names = Arrays.asList("Java", "Stream", "API");
        String concanateResult=names.stream().reduce("",(a,b) -> a+" "+b);
        System.out.println("concanateResult: "+concanateResult);

        //Longest String
        String longestString=names.stream().reduce("",(a,b) -> a.length()>b.length()?a:b);
        System.out.println("longestString: "+longestString);

        // Employee highest salary
        Optional<Employee> maxSalEmployee = employeeList.stream().reduce((e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2);
        System.out.println("maxSalEmployee: "+maxSalEmployee);

        // flatstream
        List<List<String>> list = List.of(List.of("Java", "Spring"), List.of("Kafka", "Docker"));
        List<String> words=list.stream().flatMap(Collection::stream).toList();
        System.out.println("words: "+words);

        }
}
