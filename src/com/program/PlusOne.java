package com.program;

import java.util.ArrayList;
import java.util.Vector;

public class PlusOne {
public static void main(String[] args) {
	
	ArrayList<Integer> vect=new ArrayList<Integer>(); 
    vect.add(1); 
    vect.add(7); 
    vect.add(8); 
    vect.add(9); 
      
    ArrayList<Integer> res= plusOne(vect); 
  //System.out.println(res.get(0)+":"+res.get(1)+":"+res.get(2)+":"+res.get(3));
    for (int i = 0; i < res.size(); i++) 
    System.out.print(res.get(i) + ""); 
    } 

  static ArrayList<Integer> plusOne(ArrayList<Integer> vec){
      int k = 0;
      //remove zeroes at the front
      while (k < vec.size() - 1 && vec.get(k) == 0) {
          vec.remove(k);
      }
      int size=vec.size();
  vec.set(size-1, vec.get(size-1)+1);
  int carry=vec.get(size-1)/10;
  vec.set(size-1, vec.get(size-1)%10);
  for( int i= size-2;i>=0;i--){
      if(carry==1){
      vec.set(i, vec.get(i)+1);
       carry=vec.get(i)/10;
      vec.set(i, vec.get(i)%10);
      }
  }
  if(carry==1){
      vec.add(0, 1);
          }
  return vec;
}
}
