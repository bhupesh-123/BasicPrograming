package com.program;

import java.util.HashSet;

public class LongestString{
public static void main(String[] args) {
int result=LongestString.LongSubString("bacfabda");
System.out.println(result);
}
public static int  LongSubString(String s){
int a_pointer=0;
int b_pointer=0;
int max=0;
HashSet<Character> hashset=new HashSet<Character>();
while(b_pointer<s.length()){
	if(!hashset.contains(s.charAt(b_pointer))){
		hashset.add(s.charAt(b_pointer));
		b_pointer++;
		max=Math.max(hashset.size(),max);
	}
	else{
		hashset.remove(s.charAt(a_pointer));
		a_pointer++;
	}
}
System.out.println(hashset);
return max;
}
}
