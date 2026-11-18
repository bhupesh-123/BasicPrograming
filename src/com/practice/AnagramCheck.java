package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramCheck{
    public static void main(String[] args) {
        String  word="abcd";
        String anagram="badc";
        System.out.println(isAnagram(word,anagram));
        System.out.println(isAnagramByStringBuilder(word,anagram));
        System.out.println(isAnagramUsingSorting(word,anagram));
        System.out.println(isAnagramUsingMap(word,anagram));
    }

    public  static  boolean isAnagram(String word,String anagram){
    if(word.length()!=anagram.length()){
        return  false;
    }
    for(char ch:word.toCharArray()){
        int index = anagram.indexOf(ch);
        if(index!=-1){
            anagram=anagram.substring(0,index)+anagram.substring(index+1);
        }
        else {
            return  false;
        }
    }
        return anagram.isEmpty();
    }
    public static boolean isAnagramByStringBuilder(String word,String anagram){
        StringBuilder sb=new StringBuilder(anagram);
        for (char ch:word.toCharArray()){
            int index=sb.indexOf(String.valueOf(ch));
            if(index!=-1){
                sb.deleteCharAt(index);
            }
            else{
                return false;
            }
        }
        return sb.isEmpty();
    }
    public static boolean isAnagramUsingSorting(String word,String anagram) {
        if(word.length()!=anagram.length()){
            return  false;
        }
        char[] wordChar=word.toCharArray();
        char[] anagramChar=anagram.toCharArray();

        Arrays.sort(wordChar);
        Arrays.sort(anagramChar);

       return Arrays.equals(wordChar,anagramChar);
    }
    public static boolean isAnagramUsingMap(String word,String anagram) {
        if(word.length()!=anagram.length())
            return  false;
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:word.toCharArray()){
           map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (char ch:anagram.toCharArray()){
            if(!map.containsKey(ch))
                return  false;
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0){
                map.remove(ch);
            }
        }
        return  map.isEmpty();
    }

    }
