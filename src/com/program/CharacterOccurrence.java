package com.program;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurrence {
    public static void main(String[] args) {
        characterOccurrenceUsingHashmap("hello world");
       characterOccurrenceUsingArray("hello world");
        characterOccurrenceUsingStream("hello world");
    }
    public static void characterOccurrenceUsingHashmap(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(HashMap.Entry<Character,Integer>  entry : map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        //map.forEach((k, v) -> System.out.println(k + " : " + v));

    }

    public static void characterOccurrenceUsingArray(String str) {
        int[] countArray=new int[256];
        for(int i=0;i<str.length();i++){
            countArray[str.charAt(i)]++;
        }
        for(int i=0;i<countArray.length;i++){
            if(countArray[i]>0){
                System.out.println((char)i+":"+countArray[i]);
            }
        }
    }
    public static void characterOccurrenceUsingStream(String str) {
        Map<Character,Long> map = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((k, v) -> System.out.println(k + " : " + v));


    }

    }
