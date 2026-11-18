package com.practice;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings = {"flower", "flight", "flow"};
        //String[] strings = {"flower", "owfl", "yflig"};

        String result = findLongestCommonString(strings);

        System.out.println("Longest Common Prefix: " + result);

        String result1=findLongestCommonString1(strings);
        System.out.println("Longest Common Prefix: " + result1);


    }

    public static String findLongestCommonString(String[] array){
        if(array==null || array.length==0) {
            return "";
        }

        String firstElement=array[0];
        for(int i=1;i<array.length;i++){
            int j=0;
            while (j<firstElement.length() && j<array[i].length() && firstElement.charAt(j)==array[i].charAt(j)){
                j++;
            }
            firstElement=  firstElement.substring(0,j);
        }
        return firstElement;
    }

    public static String findLongestCommonString1(String[] array){
        if (array.length==0 || array==null){
            return "";
        }
        String prefix=array[0];
        for(int i=1;i<array.length;i++){
            while (!array[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);

                if (prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
