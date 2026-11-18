package com.practice;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {
        String str="Bhupesh";
        ReverseStringWithSwaping("hello");
        System.out.println(reverseUsingRecursion("hello"));
        //1
        for (int i=str.length();i>=1;i--){
            System.out.print(str.charAt(i-1));
        }
        //2
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
//3
        char[] ch= str.toCharArray();
        String  reverse="";
        for(int i=ch.length-1;i>=0;i--){
            reverse=reverse+ch[i];
        }
        System.out.println(reverse);

        //4
        String reversed = IntStream.range(0,str.length()).mapToObj(i ->str.charAt(str.length()-1-i)).map(String::valueOf).collect(Collectors.joining());
        System.out.println(reversed);
        }

        public static  void ReverseStringWithSwaping(String str){
        char[] chars=str.toCharArray();
        int left=0,right=chars.length-1;
    while (left<right){
        char temp=chars[left];
        chars[left]=chars[right];
        chars[right]=temp;
        left++;
        right--;

    }
            System.out.println(new String(chars));
        }
    public static String reverseUsingRecursion(String str) {
        if(str.isEmpty())
            return str;
        return reverseUsingRecursion(str.substring(1))+str.charAt(0);
        }


}
