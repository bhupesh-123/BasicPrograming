package com.practice;

import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
      boolean result=isPalindrome("abac");
        System.out.println(result);

        System.out.println(isPalindromeUsingStringBuilder("aba"));
        System.out.println(isPalindromeUsingStream("abbaa"));

    }

    public  static boolean isPalindrome(String str){
        int left=0,right=str.length()-1;
            while (left<right){
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
        }
            return true;
    }

    public  static boolean isPalindromeUsingStringBuilder(String str) {
        String reversed=new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
    public  static boolean isPalindromeUsingStream(String str) {
        return IntStream.range(0,str.length()/2).allMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));
    }

    }
