package com.program;

import java.util.Arrays;
import java.util.Comparator;

public class StringPrefix {
public static void main(String[] args) {
	String[] str=new String[]{"bhupesh","bhupendra","bhut"};
	System.out.println(getCommonPrifix(str));
}
public static String getCommonPrifix(String str[]){
	int lenght=0;
	String result="";
	String shortestWord = Arrays.asList(str).stream().min( Comparator.comparing(word -> word.length())).get();
	System.out.println("shortestWord: "+shortestWord);
	String shortest = Arrays.asList(str).stream().sorted((e2, e1) -> e1.length() > e2.length() ? -1 : 1).findFirst().get();
	System.out.println("shortest: "+shortest);
	lenght=shortest.length();
	String str1=str[0];
	String str2=str[1];
	String str3=str[2];
	for(int i=0;i<lenght;i++){
		if(str1.charAt(i)==str2.charAt(i) && str2.charAt(i)==str3.charAt(i) && str3.charAt(i)==str1.charAt(i)){
			result=result+str1.charAt(i);
		}
		else{
			return result;
		}
	}
	
	return result;
}
}
