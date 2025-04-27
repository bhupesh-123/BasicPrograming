package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyofEachElement {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("bhupesh","kumar","vish","brijesh","kumar");
        Map<String,Long> frequencyofEachElement=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("frequencyofEachElement: "+frequencyofEachElement);


        List<Integer> intList = Arrays.asList(10,15,8,49,25,98,32);
        List<Integer> eventInt=intList.stream().filter(num -> num%2==0).collect(Collectors.toList());
        System.out.println("even number: "+eventInt);

        // starting with 1
        List<String>  statWithOnr=intList.stream().map(num->num.toString()).filter(s->String.valueOf(s).startsWith("1")).collect(Collectors.toList());

        System.out.println("start With One: "+statWithOnr);

        List<String> strList = Arrays.asList("apple","banana","apple","orange","banana","apple");
        Map<String, Integer> valueCount = strList.stream().collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y));
        System.out.println("valueCount: "+valueCount);

    }
    }
