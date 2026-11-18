package com.functionalInterface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Calculation {

    public static void main(String[] args) {
        Calculator addition=(a,b)->a+b;
        Calculator multiply=(a,b)->a*b;

        int addResult=addition.caluclate(3,4);
        int multiplyResult=multiply.caluclate(3,3);
        System.out.println("addResult: "+addResult+"  multiplyResult: "+multiplyResult);

        System.out.println("---------------Predicate---------------------");
        Predicate<String> isEmplty=n->n.isEmpty();
        Predicate<Integer> inEven=n->n%2==0;
        System.out.println("isEmplty: "+isEmplty.test("")+ "  inEven: "+inEven.test(6));

        System.out.println("---------------Function---------------------");
        Function<String,Integer> StringLength=n->n.length();
        Function<String,String> stringInUpperCase=n->n.toUpperCase();
        System.out.println("StringLength: "+StringLength.apply("Bhupesh")+"  stringInUpperCase: "+stringInUpperCase.apply("bhupesh"));

        System.out.println("---------------Consumer---------------------");

        Consumer<String> printer = s -> System.out.println(s);
        Consumer<List<String>> listPrinter = list -> list.forEach(System.out::println);
    }
}
