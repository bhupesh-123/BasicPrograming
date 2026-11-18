package com.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInGivenSentence {
    public static void main(String[] args) {
    String str="abc mno xyz";
        String result= reverseWordsInGivenSentence(str);
        System.out.println(result);

        String result1= reverseWordsInGivenSentenceUsingBuilder(str);
        System.out.println(result1);
    }
    public static String reverseWordsInGivenSentence(String sentence){
        String[] strArray=sentence.split(" ");
        String reverseSentence="";
        for(String str:strArray){
            reverseSentence=reverseSentence + " "+new StringBuffer(str).reverse().toString();
        }
        return reverseSentence.toString().trim();
    }
    public static String reverseWordsInGivenSentenceUsingBuilder(String sentence){
        List< String> words = Arrays.asList(sentence.split("\\s"));
       // Collections.reverse(words);
        StringBuilder sb = new StringBuilder(sentence.length());

        for (int i = words.size() - 1; i >= 0; i--) {
            sb.append(words.get(i));
            sb.append(' ');
        }
        return sb.toString().trim();
    }


}
