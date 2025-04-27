package com.program;

public class PerfectPeakofArray {
public static void main(String[] args) {
	 int[] arr = {5, 1, 4, 3, 6, 8, 10, 7, 9}; 
	int result=PerfectPeakofArray.perfectPeak(arr);
	System.out.println(result);
}
static int  perfectPeak(int arr[]){
	int size=arr.length;
	
	for(int i=0;i<size;i++){
		int flag=0;
		 for (int j = 0; j < i; j++) 
             if (arr[j] >= arr[i]) {  
                 flag = 1; 
                 break; 
             } 

         // check All the elements on  
         // its right are Greater 
         for (int j = i + 1; j < size; j++) 
             if (arr[j] <= arr[i]) { 
                 flag = 1; 
                 break; 
             } 
         if (flag == 0) 
             return arr[i]; 
     } 

	return -1;
}
}