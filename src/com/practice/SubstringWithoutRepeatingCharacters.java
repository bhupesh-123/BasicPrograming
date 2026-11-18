package com.practice;

public class SubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
 String result=findSubstringWithoutRepeatingCharacters("ababba");
        System.out.println(result);
    }

    public static String findSubstringWithoutRepeatingCharacters(String str){
        String subString="";
        for(int i=0;i<str.length();i++){
            String temp = "";
            for (int j=i;j<str.length();j++){
                char c = str.charAt(j);
                if(!temp.contains(String.valueOf(c))){
                    temp=temp+c;
                }
                else{
                    break;
                }
            }
            if(temp.length()>subString.length()){
                subString=temp;
            }
        }
        return subString;
    }
}
