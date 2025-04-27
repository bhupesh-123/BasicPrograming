package com.program;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MonthAndIndex {
	public static void main(String[] args) {
		getMonthIndex(5);
	}
	
	public static void getMonthIndex( int index){
String[] months={"jan","feb","march","april","may","june","july","august,sept","oct","nov","dec"};
//int[] monthIndex={1,2,3,4,5,6,7,8,9,10,11,12};
int indexOf = Arrays.asList(months).indexOf("june");
System.out.println("index"+indexOf);

String x = (String) Array.get(months, index);
System.out.println("x"+x);
}}
