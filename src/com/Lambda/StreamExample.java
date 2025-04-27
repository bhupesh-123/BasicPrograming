package com.Lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
//ocjp book page no.897     topic 5.3,5.4
public class StreamExample {
	
	private int month;
	private int day;
	private double value;
	
	public StreamExample(int month,int day,double value){
		this.month=month;
		this.day=day;
		this.value=value;
	}
	
	
public static void main(String[] args) {
	Integer[] myNums={1,2,3,4,5};
	Stream<Integer> myStream=Arrays.stream(myNums);
	long count=myStream.count();
	System.out.println("count:"+count);
	long elements=Arrays.stream(myNums).filter((i)->i>3).count();
	System.out.println(elements);
	
	Map<String,Integer> map=new HashMap<String, Integer>();
	map.put("one", 1);
	map.put("two", 2);
	map.put("three", 3);
	map.put("four", 4);
	System.out.println("print value"+map.entrySet().stream().filter((i)->i.getValue()>2).count());
	Stream<Integer> myStream1=Stream.of(myNums);
	long count2=myStream1.count();
	System.out.println("count2:"+count2);
	
	List<String> namelist=Arrays.asList("bhupesh","kumar","vishwakarma","vinay");
namelist.stream().filter(s->s.startsWith("b")||s.startsWith("v")).filter(s->s.length()>6).forEach(System.out::println);	
System.out.println("1111");

//
List<Integer> nums=Arrays.asList(1,2,3,4,5,6);
long result=nums.stream().map(n->n*n).filter(n->n>24).peek(n->System.out.println("Square is:"+n)).count();
System.out.println("result:"+result);

//
List<StreamExample> streamexam=Arrays.asList(new StreamExample(2, 4, 450.6),new StreamExample(3, 4, 420.6),new StreamExample(4, 5, 440.6),new StreamExample(5, 6, 480.6));
Double sum=streamexam.stream().mapToDouble(r->r.value).filter(r->r>430.0).sum();
System.out.println("sum:"+sum);

System.out.println("sorting");
Stream.of("kumar","bhupesh","vishwakarma").sorted().forEach(System.out::println);;
List<Double> listdata=Arrays.asList(12.4,654.0,456.5,333.5);
System.out.println("listdata :"+listdata.stream().filter(i->i>400).count());

List<String> stringlist=Arrays.asList("bhupesh","kumar","vish","brijesh");
stringlist.stream().filter(s->s.startsWith("b") && s.endsWith("h")).filter(s->s.length()>5).forEach(System.out::println);

}
}