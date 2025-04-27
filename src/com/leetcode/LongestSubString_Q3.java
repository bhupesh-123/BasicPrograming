package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString_Q3 {
	public static void main(String[] args) {
		System.out.println(longestSubStringwithoutRepeatingCaracter("aqeafbgga"));
	}
	
public static int longestSubStringwithoutRepeatingCaracter(String str){
	int leftPointer=0;
	int rightPointer=0;
	int max=0;
	Set<Character> set=new HashSet<>();
	while(rightPointer<str.length()){
		char c=str.charAt(rightPointer);
		if(!set.contains(c)){
			set.add(c);
			max=Math.max(max,set.size());
			rightPointer++;
		}
		else{
			set.remove(str.charAt(leftPointer));
			leftPointer++;
		}
	}
	return max;
}
}
