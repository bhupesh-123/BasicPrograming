package com.program;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        removeDuplicatesUsingSet("abcadrc");
        String result=removeDuplicatesStringBuilder("abcadrc");
        System.out.println(result);
        removeDuplicates("abcadrc");
    }

    //Example 1: Using a Set
    public static void removeDuplicatesUsingSet(String str){
        StringBuffer afterRemoved= new StringBuffer();
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for(char ch:str.toCharArray()){
                set.add(ch);
        }

        for(char ch:set){
            afterRemoved.append(ch);
        }
        System.out.println("actual String: "+str);
        System.out.println("after Removed String: "+afterRemoved);
    }

    //Example 2: Using StringBuilder
    //  The .indexOf() method returns the index of the first occurrence of a substring in a StringBuilder. If the substring is not found, -1 is returned.
    public static String removeDuplicatesStringBuilder(String input) {
        StringBuilder result=new StringBuilder();
        for(char ch:input.toCharArray()){
            if(result.indexOf(String.valueOf(ch)) ==-1){
                result.append(ch);
            }
        }
        return  result.toString();
    }
    //  Example 3: Using a Character Array
    public static String removeDuplicates(String input) {
        boolean[] seen = new boolean[256]; // Assuming ASCII characters
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                result.append(c);
            }
        }
        return result.toString();
    }

    //  Example 4: Using Java 8 Streams
    public static String removeDuplicatesUsingStream(String input) {
        input.chars().distinct().mapToObj(x->String.valueOf(x)).collect(Collectors.joining());
        return input.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }

    }
