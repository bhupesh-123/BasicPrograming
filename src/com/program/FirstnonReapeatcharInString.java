package com.program;

import java.util.HashMap;

public class FirstnonReapeatcharInString {
public static void main(String[] args) {
	//System.out.println(firestNonReapeatChar("abbbaca"));
	System.out.println(firestNonReapeatCharInString("abbbaca"));
}
public static char firestNonReapeatChar(String str){
	for(int i=0;i<str.length();i++){
		boolean duplicate=false;
		for(int j=0;j<str.length();j++){
			if((i!=j) && str.charAt(i)==str.charAt(j)){
				duplicate=true;
				break;
			}
		}
		if(!duplicate)
		return str.charAt(i);
	}
	return '_';
}

public static char firestNonReapeatCharInString(String str){
	HashMap<Character,Integer> map=new HashMap<>();
	for(int i=0;i<str.length();i++){
		char c=str.charAt(i);
		if(map.containsKey(c)){
			map.put(c, map.get(c)+1);
		}
		else{
			map.put(c, 1);
		}
	}
	for(int i=0;i<str.length();i++){
		char c=str.charAt(i);
		if(map.get(c)==1){
			return c;
		}
		
	}
	return '_';
}

}
