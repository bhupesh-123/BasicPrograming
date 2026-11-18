package com.program;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacters {
    public static void main(String[] args) {
        findDuplicateCharacters("bhupesh");
        System.out.println("-------------------------------------------");
        String str="qwwettwqt";
        Map<Character,Long> map=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        for(Map.Entry<Character,Long> record: map.entrySet()){
            System.out.println(record.getKey()+" : "+record.getValue());
        }
    }
    public static void findDuplicateCharacters(String str){
        Map<Character,Integer> map=new HashMap<>();
        for(Character ch:str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> record: map.entrySet()){
            System.out.println(record.getKey()+" : "+record.getValue());
        }
    }
}
