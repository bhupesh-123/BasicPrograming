package com.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionInterface {
    public static void main(String[] args) {
        Predicate<Integer> isEven= num->num%2==0;
        System.out.println(isEven.test(10));

        Function<Integer,Integer> square=num->num*num;
        System.out.println(square.apply(4));

        Consumer<String> Consumer= s-> System.out.println(s);
        Consumer.accept("bhupesh");

        Supplier<String> supplier=()->"Bhupesh";
        System.out.println(supplier.get());
    }
}
