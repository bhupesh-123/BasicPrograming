package com.program;

import java.util.stream.Collectors;

public class RemoveSpecialCharacters {
    public static String removeSpecialChars(String str){
        return  str.replaceAll("[^a-zA-Z0-9]", "");
    }
    public static void main(String[] args) {
        String str = "Hello, World! @2021";
        System.out.println("String after removing special characters: " + removeSpecialChars(str));
        System.out.println("String after removing special characters: " + removeSpecialCharsUsingStream(str));

    }
    public static String removeSpecialCharsUsingLoop(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) { // Add only letters and digits
                result.append(c);
            }
        }

        return result.toString();
    }
    public static String removeSpecialCharsUsingStream(String str) {
        return str.chars().filter(c->Character.isLetterOrDigit(c)).mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
    }
}
