package com.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str="bhupeshb";
        findFirstNonRepeatedCharacter(str);
        findFirstNonRepeatedCharacterUsingLinkedHasMap(str);
        findFirstNonRepeatedCharacterUsingStream(str);
    }

    public static void findFirstNonRepeatedCharacter(String str){
        for(char ch1:str.toCharArray()){
            int count =0;
            for(char ch2:str.toCharArray()){
                if(ch1==ch2 ){
                    count++;
                }
            }
            if(count==1){
                System.out.println("First non-repeated character: " + ch1);
                return;
            }
        }
        System.out.println("No non-repeated character found.");
    }
    public static void findFirstNonRepeatedCharacterUsingLinkedHasMap(String str){
        Map<Character,Integer> map= new LinkedHashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> m:map.entrySet()){
            if(m.getValue()==1){
                System.out.println("First non-repeated character: " + m.getKey());
                return;
            }
        }
        System.out.println("No non-repeated character found.");

    }
    public static void findFirstNonRepeatedCharacterUsingStream(String str){
        Character character = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(c -> c.getValue() == 1).map(value -> value.getKey()).findFirst().orElse(null);

        if(character!=null){
            System.out.println("First non-repeated character: " + character);
        }
    }
}
