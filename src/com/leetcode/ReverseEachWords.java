package com.leetcode;

public class ReverseEachWords {
    public static void main(String[] args) {
        System.out.println(reverseEachWord("Mr. bhupesh kumar vishwakarma"));
    }
    public static String reverseEachWord(String  str){
        String[] strArray=str.split(" ");
        int left=0;
        int right=strArray.length-1;
        while (left<right){
            String temp=strArray[left];
            strArray[left]=strArray[right];
            strArray[right]=temp;
            left++;
            right--;

        }
        return String.join(" ", strArray);
    }
}
