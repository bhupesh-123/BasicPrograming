package com.program;

import java.util.HashMap;

public class FirstNonReapeatingCharater {
	public static void main(String[] args) {
		char res=nonReapeatingCharacter("aabaabcaa");
		//char res=nonReapeatingCharacterInString("aabaabcfghaa");
		System.out.println(res);
	}
	
	public static char nonReapeatingCharacter(String str){
		for(int i=0;i<str.length();i++){
			boolean seenDuplicate=false;
			for(int j=0;j<str.length();j++){
				if((i!=j) && str.charAt(i)==str.charAt(j)){
					seenDuplicate =true;
					break;
				}
			}
			if(!seenDuplicate)
				System.out.println("seenDuplicate"+seenDuplicate);
			return str.charAt(i);
			
		}
		return '-';
		
	}
	public static char nonReapeatingCharacterInString(String str){
		HashMap<Character, Integer> hashmap=new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(hashmap.containsKey(c)){
				hashmap.put(c, hashmap.get(c)+1);
			}
			else{
				hashmap.put(c, 1);
			}
		}
		// since HashMap doesn't maintain order, going through string again

		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(hashmap.get(c)==1){
				return c;
			}
			
		}
		return '-';
	}
}
