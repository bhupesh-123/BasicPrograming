package com.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamInteger {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 18, 7, 10, 22,1,3,6,8,9};
        String str="wdggbbvbgfd";

        //sum of all even numbers greater than 10.
        int sumOfEvenGreaterThanTen= Arrays.stream(numbers).filter(n->n>10 && n%2==0).sum();
        System.out.println("sum of all even numbers greater than 10: "+sumOfEvenGreaterThanTen);

        int sumOfEvenGreaterThanTen2= IntStream.of(numbers).filter(n->n>10).filter(n->n%2==0).sum();
        System.out.println("sum of all even numbers greater than 10: "+sumOfEvenGreaterThanTen2);

       // filter the even no.
        List<Integer> intList=Arrays.asList(4,56,89,3,6,10,71,11);
        List<Integer> evenList=intList.stream().filter(n -> n%2==0).collect(Collectors.toList());
        System.out.println("Even list: "+evenList);


        //  fetching the unique characters in String.
        String  uniqueChar=str.chars().distinct().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining());
        System.out.println("unique characters in String: "+uniqueChar);


       // 2. Using a Set to Collect Unique Characters
        Set<Character> uniqueCharSet=str.chars().mapToObj(c -> (char)c).collect(Collectors.toSet());
        System.out.println("unique characters in String: "+uniqueCharSet);


        // Custom Logic: Only Non-Repeated Characters
        Map<Character,Long> countMapValue= str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        String uniqueCharMap=countMapValue.entrySet().stream().filter(val->val.getValue()==1).map(Map.Entry::getKey).map(String::valueOf).collect(Collectors.joining());
        System.out.println("unique characters in String: "+uniqueCharMap);

       List<Integer> numList=Arrays.asList(1,2,3,4,5,6,7,8,9);
        // find even odd number from list
        List<Integer> evenNumber= numList.stream().filter(n->n%2==0).collect(Collectors.toList());
        List<Integer> oddNumber= numList.stream().filter(n->n%2!=0).collect(Collectors.toList());
        System.out.println("even number: "+evenNumber);
        System.out.println("odd number: "+oddNumber);

       Map<Boolean,List<Integer>>  partitionedNumbers=numList.stream().collect(Collectors.partitioningBy(n-> n % 2==0));
       List<Integer> evenNumber1=partitionedNumbers.get(true);
        List<Integer> oddNumber1=partitionedNumbers.get(false);

        System.out.println("even number: "+evenNumber);
        System.out.println("odd number: "+oddNumber);

        //frequency of numbers in the list. Use stream API.
        Map<Character,Long> frequencyOfNumber=str.chars().mapToObj(n->(char)n).collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println("frequency of number: "+frequencyOfNumber);

       List<Integer> mixNumber=Arrays.asList(12,2,1,3,4,5,6,7,8,9,4,7,1,54,9,3,6,5,8,6);
        Map<Integer,Long> frequencyOfNumber1=mixNumber.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println("frequency of number1: "+frequencyOfNumber1);

        // Find the numbers which starts with 1
        List<Integer> startWithOne=intList.stream().filter(n->String.valueOf(n).startsWith("1")).collect(Collectors.toList());
        System.out.println("start with one: "+startWithOne);

        // sum of the digits of an Integer
        int num=12345;
        int sumOfDigit=String.valueOf(num).chars().map(Character::getNumericValue).sum();
        System.out.println("sum of the digits of an Integer: "+sumOfDigit);
    }
}