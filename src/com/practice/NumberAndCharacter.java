package com.practice;

import java.util.stream.Collectors;

public class NumberAndCharacter {
    public static void main(String[] args) {
      filterLetter("1bh55upes88h");
      filterDigit("1bh55upes88h");
      String str="123abcABC";
        System.out.println(str.chars().mapToObj(n->String.valueOf(n)).collect(Collectors.joining(" , ")));

    }

    public static void filterLetter(String str){
        String letter = str.chars().filter(Character::isLetter).mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
       long count=str.chars().filter(Character::isLetter).count();
        System.out.println("letter: "+letter +" count: "+count);
    }

    public static void filterDigit(String str){
        String digit = str.chars().filter(Character::isDigit).mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
        long count=str.chars().filter(Character::isDigit).count();
        System.out.println("Digit: "+digit+"  count: "+count);
    }
    }
