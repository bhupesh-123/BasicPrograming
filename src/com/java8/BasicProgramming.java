package com.java8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BasicProgramming {
    public static void main(String[] args) {
        System.out.println("-------------------------palindrome String------------------------------------");
        String str="madam".toLowerCase();
        boolean  isPalindrome= IntStream.range(0,str.length()/2).allMatch(n->str.charAt(n) == str.charAt(str.length()-n-1));
        System.out.println("isPalindrome: "+isPalindrome);

        System.out.println("-------------------------Remove All Spaces------------------------------------");
        String input = " Java  Stream  API ";
        String removeAllSpace=input.chars().filter(ch->ch !=' ').mapToObj(ch->String.valueOf((char) ch)).collect(Collectors.joining());

    }
}
