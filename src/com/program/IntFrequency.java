package com.program;

import java.util.HashMap;
import java.util.Map;

public class IntFrequency {
	public static void main(String[] args) {
		 int arr[] = new int[]{ 10, 20, 20, 10, 10, 20, 5, 20 };
		countIntFrequency(arr);
	}
	public static void countIntFrequencyByMap(int[] arr){
	
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}
			else{
				map.put(arr[i],1);
			}
		}
		for(Map.Entry<Integer,Integer> m:map.entrySet()){
			System.out.println(m.getKey()+":"+m.getValue());
		}
		
	}
public static void countIntFrequency(int[] arr){
	int visited=-1;
	int count;
	int[] fr=new int[arr.length];
	for(int i=0;i<arr.length;i++){
		count=1;
		for(int j=i+1;j<arr.length;j++){
			
			if(arr[i]==arr[j]){
				count++;
				fr[j]=visited;
			}
		}
		if(fr[i]!=visited){
			fr[i]=count;
		}
	}
	for(int i=0;i<arr.length;i++){
		if(fr[i]!=visited){
			System.out.println(arr[i]+":"+fr[i]);
		}
	}
}
}