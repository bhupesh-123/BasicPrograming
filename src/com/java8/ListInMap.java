package com.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListInMap {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));

        // empid : name
        Map<Integer,String> empIdAndName= employeeList.stream().collect(Collectors.toMap(Employee::getId,Employee::getName));
        System.out.println("empIdAndName: "+empIdAndName);

        //empIdAndEmployee
        Map<Integer,Employee> empIdAndEmployee =employeeList.stream().collect(Collectors.toMap(Employee::getId,employee->employee));
        System.out.println("empIdAndEmployee: "+empIdAndEmployee);

        // if duplicate exsist then override value
        Map<Integer,Employee> idDuplicateempIdAndEmployee=employeeList.stream().collect(Collectors.toMap(Employee::getId,employee->employee,(oldEmp,newEmp)->oldEmp));
        System.out.println("idDuplicateempIdAndEmployee: "+idDuplicateempIdAndEmployee);

        String name="Bhupesh";
        Optional.ofNullable(name).filter(s->s.startsWith("B")).ifPresent(e->{
            System.out.println("concat: "+e.concat(" Kumar"));
        });

        Employee emp=new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0);
        Optional<String> empCapName=Optional.ofNullable(emp).filter(e->e.getId()>100).map(e->e.getName().toUpperCase());
        empCapName.ifPresent(System.out::println);

        List<String> names = Arrays.asList("Bob", null, "Alice", "Arjun","Charlie", null);
        List<String> startWithA=names.stream().filter(Objects::nonNull).filter(na->na.startsWith("A")).map(String::toUpperCase).collect(Collectors.toList());
        startWithA.forEach(System.out::println);

        //find first
        String firstStartWithA=names.stream().filter(Objects::nonNull).filter(n->n.startsWith("A")).findFirst().map(String::toUpperCase).orElse("Not Avalible");
        System.out.println(firstStartWithA);

        List<String> words = Arrays.asList("hello", "worlds");
        List<Integer> countLength=words.stream().map(w -> w.length()).collect(Collectors.toList());
        System.out.println("word length: "+countLength);

        // flatMap()
        List<List<String>> list = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"));
        List<String> flatList=list.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println("In list: "+flatList);

        //remove duplicate number
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4);
        List<Integer> removeDuplicate=numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("remove duplicate number: "+removeDuplicate);

        //
        List<String> names1 = Arrays.asList("Zoe", "Anna", "Mike");
        List<String> sortName=names1.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted name: "+sortName);

       // count word
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange","banana");
        Map<String,Long> countWord=items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("count word: "+countWord);

        List<Integer> nums = Arrays.asList(4, 1, 9, 3);
        int max= nums.stream().max(Integer::compareTo).get();
        int min= nums.stream().min(Integer::compareTo).get();
        System.out.println("max: "+max +", min: "+min);

        // Max Min salary
        Optional<Employee> maxSalary=employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
        Optional<Employee> minSalary=employeeList.stream().min(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("max salary: "+maxSalary +", min salary: "+minSalary);

        // Find Duplicate Elements in a List
        Set<String> duplicateElements= items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(value -> value.getValue() > 1).map(key -> key.getKey()).collect(Collectors.toSet());
        System.out.println("Duplicate Elements: "+duplicateElements);

        // Reverse Each Word in a Sentence Using Lambda
        String sentence = "Hello World Java";
        String reverseEachWord =Arrays.stream(sentence.split(" ")).map(word->new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println("Reverse Each Word: "+reverseEachWord);

        // Find the Second Highest Number in List
        Integer secondHighest = nums.stream().sorted().distinct().skip(1).findFirst().orElse(-1);
        System.out.println("Second Highest: "+secondHighest);

        // Count Frequency of Characters in a String
        String input = "banana";
        Map<Character, Long> countChar = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Frequency of Characters: "+countChar);

    }
}
