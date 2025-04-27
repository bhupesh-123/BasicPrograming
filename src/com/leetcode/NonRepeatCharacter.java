package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatCharacter {
    public static void main(String[] args) {
        char result=NonRepeatCharacter.firstNonRepeatCharacter("strintgs");
        System.out.println(result);
        char resultmap=firstNonRepeatCharacterUsingMap("qwertyuq");
        System.out.println(resultmap);

    }

    static char  firstNonRepeatCharacter(String str){
        char[] strChar=str.toCharArray();
        for(int i=0;i<strChar.length;i++){
            boolean seenDuplicate=false;
            for(int j=0;j<strChar.length;j++){
                if(str.charAt(i)==str.charAt(j) && i!=j){
                    seenDuplicate=true;
                    break;
                }
            }
            if(!seenDuplicate){
                return str.charAt(i);
            }
        }
        return '_';
    }

    static char  firstNonRepeatCharacterUsingMap(String str) {
        Map<Character,Integer>  char_count=new HashMap<>();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(char_count.containsKey(ch)){
                char_count.put(ch,char_count.get(ch)+1);
            }
            else{
                char_count.put(ch,1);
            }

        }
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(char_count.get(c)==1){
                return  c;
            }
        }
        return '_';

    }

    }
