package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class SumofIntegers {
    public static void main(String[] args) {
        int sum1= IntStream.range(1,6).sum();
        System.out.println("sum1: "+sum1);

        // squre sum
        int squreSum=IntStream.range(1,6).boxed().map(x->x*x).reduce(0,Integer::sum);
        System.out.println("squre Sum: "+squreSum);

        int squreSum1=IntStream.range(1,6).boxed().map(x->x*x).mapToInt(Integer::intValue).sum();
        System.out.println("squre Sum1: "+squreSum1);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int squreSum2=list.stream().map(x -> x*x).mapToInt(Integer::intValue).sum();
        System.out.println("squre Sum2: "+squreSum2);

        Optional<Integer> result=list.stream().reduce((a, b)->a+b);
        result.ifPresent(System.out::println);

    }
}
