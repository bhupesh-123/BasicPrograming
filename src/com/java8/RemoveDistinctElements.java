package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDistinctElements {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String>  listOfDistinctStrings=listOfStrings.stream().distinct().collect(Collectors.toList());

        String inputString = "Java Concept Of The Day";
        Map<Character,Long> countEachCharacter=inputString.chars().mapToObj(c->(char)c).filter(c->!c.equals(' ')).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("countEachCharacter: "+countEachCharacter);

        // 4) How do you find frequency of each element in an array or a list?
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String,Long> countEachWord = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("countEachWord: "+countEachWord);

        //  How do you sort the given list of decimals in reverse order?
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        List<Double> sorted=decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("sorted: "+sorted);


    }
}
