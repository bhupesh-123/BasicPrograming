package com.program;

import java.util.ArrayList;

public class MaxSumLorR {
public static void main(String[] args) {
ArrayList<Integer> list= new ArrayList<Integer>();
list.add(12);
list.add(2);
list.add(6);
list.add(3);
list.add(15);
int result=MaxSumLorR.solve(list,2);
System.out.println(result);
}
/*public static int getMaxValue(int[] arr){
	int maxvalue=arr[0];
	for(int i=0;i<arr.length;i++){
		if(maxvalue>=arr[i]){
			maxvalue=arr[i];
		}
	}
	return maxvalue;
}*/

/*public static int getMinValue(int[] arr){
	int minvalue=arr[0];
	for(int i=0;i<arr.length;i++){
		if(minvalue<=arr[i]){
			minvalue=arr[i];
		}
	}
	return minvalue;
}*/

public static int solve(ArrayList<Integer> A, int B) {
    int sum=0;
    int left=0,right=A.size();
    
    for(int i=0;i<A.size();i++){
    	
    		while(A.get(left)>A.get(right-1)){
    			sum=sum+A.get(left);
    			left++;
    		}
    		while(A.get(left)<A.get(right-1)){
    			sum=sum+A.get(right-1);
    			right--;
    		}
    		
    	}
    
    
    return sum;
}
}
