package com.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 3};
        DuplicateNumbers.duplicateNumbers(arr);

        // For Integer
        List<Integer> list = Arrays.asList(1,2,3,4,2,5,3);
        Set<Integer> result = list.stream().filter(n -> Collections.frequency(list, n) > 1).collect(Collectors.toSet());
        System.out.println("Duplicate Numbers: "+result);

        // For String
        List<String> strings = Arrays.asList("a","b","c","d","b","e","c");
        Set<String> duplicateString = strings.stream().filter(n -> Collections.frequency(strings, n) > 1).collect(Collectors.toSet());
        System.out.println("Duplicate Numbers: "+duplicateString);

        Set<String> set = new HashSet<>();
        Set<String> duplicateStr= strings.stream().filter(n->!set.add(n)).collect(Collectors.toSet());
        System.out.println("duplicate String: "+duplicateStr);

        Map<String, Long>  duplicateResultInMap = strings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (Map.Entry<String, Long> entry : duplicateResultInMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate: " + entry.getKey());
            }
        }

        Map<String, Long> duplicateCounts = strings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("duplicateCounts: "+duplicateCounts);
    }
    public static void duplicateNumbers(int[] arr){
        Set<Integer> set= new HashSet<>();
        Set<Integer> duplicates= new HashSet<>();
        for (int num:arr) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Duplicate number: "+duplicates);
    }
}
