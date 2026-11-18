package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 4, 45, 99);

        int[] arr = {10, 20, 4, 45, 99};
        int secondLargestNumber= list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("secondLargestNumber: "+secondLargestNumber);

        SecondLargestNumber.secondLargestNumber(arr);
    }
public static void secondLargestNumber(int[] arr){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        int result = 0;
 for (int num:arr){
     if(num>largest){
         secondLargest= largest;
         largest=num;
     }
   else if(num>secondLargest && num!=largest){
         secondLargest=num;
     }
 }
    System.out.println("second largest: "+secondLargest);
}
}
