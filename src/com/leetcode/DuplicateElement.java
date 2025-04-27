package com.leetcode;


import java.util.Arrays;
import java.util.HashSet;


public class DuplicateElement{

    public static void main(String[] args) {
    int[] arr=new  int[]{2,6,4,1,3,1,5};
    int result=DuplicateElement.findDuplicateFloyd(arr);
        System.out.println(result);
    }

    public  boolean isDuplicateElement(int[] numbers){
        HashSet<Integer> hashset=new HashSet<>();
        for(int i=0;i<numbers.length;i++){
            if(hashset.contains(numbers[i]))
                return  true;
            hashset.add(numbers[i]);
        }
        return  false;
    }

    public  boolean isDuplicateElement1(int[] numbers){
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length-1;i++){
        if(numbers[i]==numbers[i+1])
            return  true;
        }
        return  false;
    }

    //leetcode 287 find duplicate number

    public int findDuplicate(int[] numbers){
        HashSet<Integer> hashset=new HashSet<>();
        for(int i=0;i<numbers.length;i++){
            if(hashset.contains(numbers[i]))
                return  numbers[i];
            hashset.add(numbers[i]);
        }
        return  -1;
    }
    //Hare & Tortoise Method  best solution
    public static int findDuplicateFloyd(int[] nums){
        int slow = nums[0];
        int fast = nums[0];
        do { // we are sure that at least one duplicate is there
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);
        // find the head of loop
        fast = nums[0];
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
}
