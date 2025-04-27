package com.program;

public class LengthofLastWord {
	public static void main(String[] args) {
		System.out.println("String length: "+findLengthofLastWord("bhup s"));
		System.out.println("String length: "+lengthOfLastWord("bhup vishwa"));
	}
public static String findLengthofLastWord(String str){
	if(str.trim().length()==0){
		return " ";
	}
	String[] strarr=str.split(" ");
	int strlength=strarr.length;
	String result=strarr[strlength-1];
	
	return result ;
}

public static int lengthOfLastWord(final String a) 
{ 
    int len = 0; 

    /* String a is 'final'-- can not be modified 
       So, create a copy and trim the spaces from 
       both sides */
    String x = a.trim(); 

    for (int i = 0; i < x.length(); i++) { 
        if (x.charAt(i) == ' ') 
            len = 0; 
        else
            len++; 
    } 

    return len; 
} 
}
