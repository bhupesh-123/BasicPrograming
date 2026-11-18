package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacters {
    public static void main(String[] args) {
        DuplicateCharacters.findDuplicateCharacters("Bhupeshu");

        String str1="bhupesh";
        findDuplicateCharactersUsingStream(str1);

    }
    public static void findDuplicateCharacters(String str){
        System.out.println("----------------findDuplicateCharacters----------------");
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> entrySet:map.entrySet()){
           if(entrySet.getValue()>1){
               System.out.println(entrySet.getKey()+":"+entrySet.getValue());
           }
        }
    }

    public static void findDuplicateCharactersUsingStream(String str) {
        System.out.println("-----------findDuplicateCharactersUsingStream--------------");
        Map<Character, Long> map = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.entrySet().stream().filter(val->val.getValue()>1).forEach(e->System.out.println(e.getKey()+":"+e.getValue()));
    }
    }
