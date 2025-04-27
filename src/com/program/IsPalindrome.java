package com.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsPalindrome {
	public static void main(String[] args) {
	boolean result=	IsPalindrome.isPalindrome("race a car");	
	System.out.println(result);
	//String arr[] = { "cat", "dog", "tac", "god", "act" };
	//System.out.println(groupAnagrams(arr));
	}
	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<String,List<String>> map=new HashMap<String, List<String>>();
	    for(int i=0;i<strs.length;i++){
	    	char[] ch=strs[i].toCharArray();
	    	Arrays.sort(ch);
	    	String newString=new String(ch);
	    	if(map.containsKey(newString)){
	    		map.get(newString).add(strs[i]);
	    	}
	    	else{
	    		List<String> list=new ArrayList<String>();
	    		list.add(strs[i]);
	    		map.put(newString, list);
	    	}
	    }
		return new ArrayList<List<String>>(map.values());
	}


	public static boolean isPalindrome(String s) {
		s=s.toLowerCase();
		if(s==null){
			return false;
		}
		int i=0,j=s.length()-1;
		
		while(i<j){
			while(i<j && !((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='0' && s.charAt(i)<='9'))){
				System.out.println("aa"+!((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='0' && s.charAt(i)<='9')));
				System.out.println(s.charAt(i));
				
				i++;
			}
			while(i<j && !((s.charAt(j)>='a' && s.charAt(j)<='z')||(s.charAt(j)>='0' && s.charAt(j)<='9'))){
				System.out.println("bb"+!((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='0' && s.charAt(i)<='9')));
				System.out.println(s.charAt(j));
				j--;
			}
			System.out.println(s.charAt(i)+" : "+s.charAt(j));
			if(s.charAt(i)!=s.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		
		
		return true;
	}
	
	public static boolean isWordPalindrome(String str) {
		char[] ch=str.toCharArray();
		int start=0;
		int end=ch.length;
		while(start<end) {
			if(ch[start]!=ch[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
