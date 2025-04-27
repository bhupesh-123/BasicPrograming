package com.Lambda;

public class Solution {
	
	public static void main(String[] args) {
		Solution sol= new Solution();
		int[] nums= {2,4,6,3,9};
	int result=	sol.searchInsert(nums, 2);
	System.out.println(result);
	}
	
	
	public int searchInsert(int[] nums, int target) {
		int n=nums.length;
		int r=0;
		 for(int i=0; i < n; i++){  
             for(int j=1; j < (n-i); j++){
            	 
            	 if(nums[j-1]==target){
    	        	 r=r+1;
    	          //System.out.println(r);
    	         } 
    	          else{
    	              if(target>nums[j-1] && target<nums[j]){
    	              // System.out.println(i); 
    	                 // return i;
    	                  r=r+1;
    	                  
    	              }
    	          }
}
            
             }
		// System.out.println(r);
		return r;
		 }
	}
