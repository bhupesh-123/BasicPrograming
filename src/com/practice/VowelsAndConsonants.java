package com.practice;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        String str="Bhupesh";
        countVowelsAndConsonants(str);
        Long vowelCount=str.chars().filter(Character::isLetter).filter(ch->"aeiou".indexOf(ch)!=-1).count();
        Long consonantsCount=str.chars().filter(Character::isLetter).filter(ch->"aeiou".indexOf(ch)==-1).count();
        System.out.println("vowelCount: "+vowelCount+ " consonantsCount: "+consonantsCount);

    }

    public static  void countVowelsAndConsonants(String  str){
        int vowelCount=0,consonantsCount=0;
        for(char ch:str.toLowerCase().toCharArray()){
            if(Character.isLetter(ch)){
                if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){// if ("aeiou".indexOf(ch) != -1)

                    vowelCount++;
                }
                else {
                    consonantsCount++;
                }
            }
        }
        System.out.println("vowelCount: "+vowelCount+ " consonantsCount: "+consonantsCount);
    }
}
