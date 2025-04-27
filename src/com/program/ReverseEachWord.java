package com.program;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {
        reverseEachWordUsingStringBuilder("Hello World");
        reverseEachWordUsingCharArray("Hello World");
        reverseEachWordUsingStack("Hello World");
    }

    public static  void reverseEachWordUsingStringBuilder(String str){
        String[] words=str.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word: words){
            StringBuilder reverse=new StringBuilder(word);
            result.append(reverse.reverse().toString()).append(" ");
        }
        System.out.println("actual string: "+str);
        System.out.println("reverse string: "+result);
    }

    public static  void reverseEachWordUsingCharArray(String str){
        String[] words=str.split(" ");
        StringBuilder result=new StringBuilder();
        for (String word : words) {
            char[] chars=word.toCharArray();
            for(int i=chars.length-1;i>=0;i--){
                result.append(chars[i]);
            }
            result.append(" ");
        }
        System.out.println("actual string: "+str);
        System.out.println("reverse string: "+result);

    }
    public static  void reverseEachWordUsingStack(String str) {
        String[] words=str.split(" ");
        StringBuilder result=new StringBuilder();
        for (String word : words) {
            Stack<Character> stack=new Stack<>();
            for(char ch:word.toCharArray()){
                stack.push(ch);
            }
            while (!stack.isEmpty()){
                result.append(stack.pop());
            }
            result.append(" ");
        }
        System.out.println("actual string: "+str);
        System.out.println("reverse string: "+result);

    }
    public static  void reverseEachWordUsingStream(String str) {
        String result= Arrays.stream(str.split(" "))
                .map(word->new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }

    }
