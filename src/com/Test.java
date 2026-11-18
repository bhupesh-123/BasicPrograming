package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String str="Bhupeshb";
        findDuplicate(str);
        Map<Character, Long> map = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for(Map.Entry<Character,Long> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
        System.out.println(map);

    }
    public static boolean angram(String s1,String s2) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {

        }
return true;
    }

    public static void findDuplicate(String str){
        Map<Character,Integer> map =new HashMap<>();
        for(char ch:str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        System.out.println(map);
    }

}



