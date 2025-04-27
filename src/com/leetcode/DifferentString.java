package com.leetcode;

public class DifferentString {
public static String showUniqueCharacter(String str1,String str2){
	String result1="";
	String result2="";
	char[] char1=str1.toCharArray();
	char[] char2=str2.toCharArray();
	int maximumLength=0;
	int strLength1=str1.length();
	int strLength2=str2.length();
	if(strLength1>=strLength2){
		maximumLength=strLength1;
	}
	if(strLength1<=strLength2){
		maximumLength=strLength2;
	}
	for(int i=0;i<maximumLength;){}
	return null;
	
	
}
}
