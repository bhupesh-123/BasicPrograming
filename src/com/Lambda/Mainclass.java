package com.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

interface FunInterface{
	public void funAbstract(int a);
}
public class Mainclass {
public static void main(String[] args) {
	FunInterface fun=(int x)->System.out.println(x*2);
	fun.funAbstract(6);
	
	ArrayList<Integer> arrL = new ArrayList<Integer>(); 
    arrL.add(1); 
    arrL.add(2); 
    arrL.add(3); 
    arrL.add(4);
    System.out.println("list size"+arrL.size());
    arrL.forEach(n->{ if(n%2==0)  System.out.println(n);});
    arrL.forEach(System.out::print);
    List<Integer> list=Arrays.asList(1,2,3,4,5);
  List<Integer>  list2= list.stream().map(x->x*x).collect(Collectors.toList());
 // List<Integer> list3=list.stream().filter(predicate)
    System.out.println(list2);
    
    
    
    ArrayList<String> str = new ArrayList<String>(); 
    str.add("bhupesh"); 
    str.add("kumar"); 
    str.add("vishwakarma"); 
    System.out.println("getting value: "+str.get(0));
   }
}
