package com.practice;

public class ContainDigit {
    public static void main(String[] args) {

        String str="1234567";
        isContainDigit(str);

        boolean isDigit=str.matches("\\d+");
        System.out.println(isDigit);
        //using stream
        boolean onlyDigit = str.chars().allMatch(Character::isDigit);
        System.out.println("onlyDigit: "+onlyDigit);
    }
    public static  void isContainDigit(String str){
        boolean isContainDigits=true;
       for(char ch:str.toCharArray()){
           if(!Character.isDigit(ch)){
               isContainDigits=false;
               break;
           }
       }
        System.out.println(isContainDigits);
    }

}
