package com.leetcode;

public class MaximumSubArray {
    public static void main(String[] args) {
     int[] arr=new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
     int sum=findMaxSumofArray(arr);
     System.out.print(sum);
    }


    public static int findMaxSumofArray(int[] nums){
        int max=Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
        sum=Math.max(nums[i],sum+nums[i]);
        max=Math.max(sum,max);
        }
        return max;
    }
}
