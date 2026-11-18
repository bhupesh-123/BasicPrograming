package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacter {
    public static void main(String[] args) {
     countGivenCharacter("bhupesh",'h');
     countGivenCharacterUsingStream("bhupesh",'h');
     String str="bhupesh vishwakarma";
        Map<Character, Long> countingCharacter = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("counting Character: "+countingCharacter);

        List<String> list= Arrays.asList("ab","bc","ab","an","ab","an","yt");
        Map<String, Long> countEachWords = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("countEachWords: "+countEachWords);
    }

    public static void countGivenCharacter(String str,char findChar){
        int count=0;
        for(char ch:str.toCharArray()){
            if(ch==findChar){
              count++;
            }
        }
        System.out.println("Occurence of given Character: "+count);
    }

    public static void countGivenCharacterUsingStream(String str,char findChar) {
        str.chars().filter(ch->ch==findChar).count();
       Long count= str.chars().mapToObj(ch ->(char)ch).filter(c ->c.equals(findChar)).count();
        System.out.println("Occurence of given Character: "+count);

    }
    }
