package com.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// https://javatechonline.com/stream-api-in-java-8/
public class Java_8_Basices {
    public static void main(String[] args) {

        String[] arr= new String[] {"Sunday","Monday","Tuesday","Wednesday"};
        Stream<String> days=Stream.of(arr);
        days.forEach(System.out::println);

        Stream<Integer> numbers=Stream.of(1,2,3,4,5,6,7,8,9);
        numbers.forEach(System.out::println);

        List<Integer> num = new ArrayList<>(List.of(12,23,34,2,54));

       int maxValue= IntStream.of(3,65,7).max().getAsInt();
       int minValue= IntStream.of(3,65,7).min().getAsInt();
        System.out.println("maxValue: "+maxValue+ " minValue: "+minValue);

        Map<String, Integer> wordWithLength = Arrays.asList(arr).stream().collect(Collectors.toMap(s -> s, s -> s.length()));
        System.out.println("wordWithLength: "+wordWithLength);

        List<String> names = Arrays.asList("Ram", "Shyam", "Amit", "Ravi");
        Map<Integer, List<String>> lengthOfStrings = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("lengthOfStrings: "+lengthOfStrings);

        List<Integer> lengthOfString = names.stream().map(String::length).collect(Collectors.toList());
        System.out.println("lengthOfString: "+lengthOfString);

        List<Integer> lengths = names.stream().collect(Collectors.mapping(String::length, Collectors.toList()));
        System.out.println("lengths: "+lengths);

        int sumofNum = num.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sumofNum: "+sumofNum);

        Integer sumIntValue = num.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("sumIntValue: "+sumIntValue);

        Integer reduceSum = num.stream().reduce(0, (a, b) -> a + b);
        System.out.println("reduceSum: "+reduceSum);

        // sum of number 1-10
        int sumOfNumbers = IntStream.range(1, 11).sum();
        System.out.println("sumOfNumbers: "+sumOfNumbers);

        // Sum of even numbers
        int sumOfEvenNumbers = IntStream.range(1, 11).filter(n->n%2==0).sum();
        System.out.println("sumOfEvenNumbers: "+sumOfEvenNumbers);

        IntSummaryStatistics summarizingInt = num.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("avg: "+summarizingInt.getAverage()+" sum: "+summarizingInt.getSum()+" count: "+summarizingInt.getCount()+" Max: "+summarizingInt.getMax());


    }
}
