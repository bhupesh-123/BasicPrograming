package com.practice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Questions {
    public static void main(String[] args) {
        List<String> list=List.of("Bhupesh","Kumar","Vishwakarma","Name");
        List<Integer> nums = List.of(1,2,2,3,3,4);

        // 1. Write a program to find the sum of all elements in a list using Java Stream API
        int sum = nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: "+sum);
       // 2. Given a list of integers, write a program to find and print the maximum element using Java Stream API
        Integer integer1 = nums.stream().max(Integer::compare).get();
        Integer integer2= nums.stream().max(Comparator.comparing(Integer::intValue)).get();
        int i = nums.stream().mapToInt(Integer::intValue).max().orElseThrow();

        // 3. Write a program to filter out all the even numbers from a list using Java Stream API
        List<Integer> evenNumbers= nums.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("evenNumbers: "+evenNumbers);

        //4. Given a list of strings, write a program to count the number of strings containing a specific character ‘a’ using Java Stream API.
       List<String> containSpecificChar=list.stream().filter(c->c.contains("a")).collect(Collectors.toList());
       long containSpecificCharCount=list.stream().filter(c->c.contains("a")).count();
        System.out.println("containSpecificChar: "+containSpecificChar +" containSpecificCharCount: "+containSpecificCharCount);

       // 6. Given a list of integers, write a program to calculate the average of all the numbers using Java Stream API.
        double average = nums.stream().mapToDouble(Integer::doubleValue).average().orElseThrow();
        System.out.println("average: "+average);

        // 7. Write a program to sort a list of strings in alphabetical order using Java Stream API.
        List<String> nameSorted=list.stream().sorted().collect(Collectors.toList());
        System.out.println("nameSorted: "+nameSorted);
        //8. Given a list of strings, write a program to concatenate all the strings using Java Stream API.
        String concatenate = list.stream().collect(Collectors.joining());
        System.out.println("concatenate: "+concatenate);

        //9. Write a program to find the longest string in a list of strings using Java Stream API.
        String maxLength = list.stream().max(Comparator.comparing(String::length)).get();
        System.out.println("maxLength: "+maxLength);

        //10. Given a list of integers, write a program to find and print the second largest number using Java Stream API.
        Integer secondLargest = nums.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("secondLargest: "+secondLargest);

       // 12. Given a list of strings, write a program to find and print the shortest string using Java Stream API.
        String minLength = list.stream().min(Comparator.comparing(String::length)).get();
        System.out.println("minLength: "+minLength);
        // 13. count character
        String str="vishwakarma";
        Map<Character, Long>  charCount = str.chars().mapToObj(n -> (char) n).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("charCount: "+charCount);

        List<String> sortedStringMinToHighLength = list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println("sortedStringMinToHighLength: "+sortedStringMinToHighLength);

        List<String> sortedStringHighToMinLength = list.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());
        System.out.println("sortedStringHighToMinLength: "+sortedStringHighToMinLength);


        // last element of array
        list.stream().skip(list.size()-1).findFirst().get();

    }
}
