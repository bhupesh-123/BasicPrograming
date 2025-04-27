package com.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterface1 {
    public static void main(String[] args) {
        Consumer<String> consumer1=(pill)->{
            if(pill.equals("red")){
                System.out.println("Pill is red");

            }
            else if  (pill.equals("blue")){
                System.out.println("Pill is blue");
            }
            else{
                System.out.println("Pill is other colour ");
            }
        };
        consumer1.accept("red");

        //2 practice
        List<String> dogsName= Arrays.asList("abc","cbd","xyz");
        Consumer<String> printName=(name)->System.out.print(name);
        dogsName.stream().forEach(printName);


        //  3. Andthen example
        List<Duck> ducks=Arrays.asList(new Duck("abc","red",3),new Duck("xyz","blue",2),new Duck("mno","red",1));
        Consumer<Duck> duck=d->System.out.println(d.getName());
        ducks.stream().forEach(duck.andThen(age->System.out.print(age.getAge())));

        //method reference
        dogsName.stream().forEach(System.out::print);
        dogsName.stream().forEach(FunctionalInterface1::printDogName);



    }
    public static  void printDogName(String name){
      System.out.println("Dogs name : "+name);
    }

    }
