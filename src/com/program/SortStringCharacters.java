package com.program;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortStringCharacters {
    public static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static String sortStringUsingStream(String str){
        return str.chars().sorted().mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }

    public static String sortStringUsingStringBuilder(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        StringBuilder sortedStr = new StringBuilder(charArray.length);
        for (char c : charArray) {
            sortedStr.append(c);
        }
        return sortedStr.toString();
    }

    public static void main(String[] args) {
        String str = "dbaca";
        System.out.println("Sorted string: " + sortString(str));
    }
}
