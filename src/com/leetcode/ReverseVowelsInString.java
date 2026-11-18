package com.leetcode;

import java.util.Locale;

public class ReverseVowelsInString {
    public static void main(String[] args) {
        System.out.println(reverseVowels("bhupesh"));
        System.out.println(reverseVowels("umbrella"));

    }

    public static String reverseVowels(String str){
        if( str==null || str.isEmpty()){
            return  str;
        }
        int left=0;
        int right=str.length()-1;
        char[] ch=str.toCharArray();
        while(left < right){
            while (left < right && !isVowel(ch[left])){
                left++;
            }
            while (left < right && !isVowel(ch[right])){
                right--;
            }
            if(isVowel(ch[right]) && isVowel(ch[left])){
                char temp =ch[right];
                ch[right]=ch[left];
                ch[left]=temp;
                left++;
                right--;
            }
        }
      return new String(ch);
    }

    public static boolean isVowel( char ch){
      return   "aeiou".contains(String.valueOf(ch).toLowerCase(Locale.ROOT));
    }

    public static boolean containsVowel(String str, char vowel) {
        return str.chars().map(Character::toLowerCase).anyMatch(ch -> ch==Character.toLowerCase(vowel));
    }
    }
