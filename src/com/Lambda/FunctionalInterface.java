package com.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FunctionalInterface {
public static void main(String[] args) {
	//function Interface
	Function<Integer, Integer> function=t->t*5;
	System.out.println("function"+function.apply(5));
	List<String> names = Arrays.asList("Smith", "Gourav", "Heather", "John", "Catania");
	Function<String, Integer> namemapping=String::length;

	List<Integer> namelength=names.stream().map(namemapping).collect(Collectors.toList());
	 System.out.println("namelength: "+namelength);
	//Predicate interface
	Predicate<String> predicte=(t)-> t.length() > 5;
	System.out.println("name: "+predicte.test("bhupesh"));
	System.out.println(""+predicte.test("kumar"));
	
	
	//consume interface
	List<String> listdata=Arrays.asList("bhupesh","kumar","vishwakarma","noida","Mau");
	listdata.replaceAll(t->t.toUpperCase());
	List<String> cities = Arrays.asList("Sydney", "Dhaka", "New York", "London");
List<String> filterd=listdata.stream().filter(s->s.length()>6).collect(Collectors.<String>toList());
    Consumer<List<String>> upperCaseConsumer = list -> {
        for(int i=0; i< list.size(); i++){
            list.set(i, list.get(i).toUpperCase());
        }
    };
    Consumer<List<String>> printConsumer = list -> list.stream().forEach(System.out::println);

    upperCaseConsumer.andThen(printConsumer).accept(cities);
    };
    //function interface
   
    
}

