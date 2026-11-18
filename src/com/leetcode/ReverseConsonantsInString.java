package com.leetcode;

public class ReverseConsonantsInString {
    public static void main(String[] args) {
        System.out.println(reverseConsonants("bhupesh"));
    }
    public static String reverseConsonants(String str) {
        int left=0;
        int right=str.length()-1;
        char[] chars=str.toCharArray();
        while(left<right){
            if(left < right && !isConsonant(chars[left])){
                left++;
            }
            if(left < right && !isConsonant(chars[right])){
                right--;
            }
            if(left < right && isConsonant(chars[right]) && isConsonant(chars[left]) ){
                char temp=chars[left];
                chars[left]=chars[right];
                chars[right]=temp;
                left++;
                right--;
            }
        }
        return String.valueOf(chars);
    }

    public static boolean isConsonant(char ch){
        return !"aeiou".contains(String.valueOf(ch));
    }
    }
