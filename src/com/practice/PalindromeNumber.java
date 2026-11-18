package com.practice;

import java.util.stream.IntStream;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(122231));
        System.out.println(isPalindromeNumberUsingWhile(123321));
        System.out.println(isPalindromeNumberUsingStream(12321));
        System.out.println(isPalindromeNumberUsingStreamNum(12321));
    }

    public static  boolean isPalindromeNumber(int number){
        int[] numbers=Integer.toString(number).chars().toArray();
        for(int i=0;i<=numbers.length/2;i++){
            if(numbers[i]!=numbers[numbers.length-1-i]){
                return  false;
            }
        }
        return  true;
    }
    public static  boolean isPalindromeNumberUsingWhile(int number) {
       int original=number;
       int reverse=0;
        while (0<number){
          reverse=reverse*10+number%10;
          number=number/10;
        }
        return original==reverse;
    }
    public static  boolean isPalindromeNumberUsingStream(int number) {
        String str=String.valueOf(number);
        return IntStream.range(0,str.length()).allMatch(i->str.charAt(i)==str.charAt(str.length()-1-i));

    }
    public static boolean isPalindromeNumberUsingStreamNum(int number) {
        int[] numbers=Integer.toString(number).chars().toArray();
        return IntStream.range(0,numbers.length/2).allMatch(num->numbers[num]==numbers[numbers.length-1-num]);
    }
    }
