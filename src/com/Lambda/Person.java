package com.Lambda;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Person {
private String name;
private int age;
public String getName() {
	return name;
}

@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + "]";
}

public int getAge() {
	return age;
}



public Person(String name,int age){
	this.name=name;
	this.age=age;
}
public static void main(String[] args) {
	Person p1=new Person("bhupesh", 25);
	Person p2=new Person("binay", 23);
	Person p3=new Person("deb", 23);
	Person p4=new Person("deb", 40);
	Person p5=new Person("bhupesh", 35);
	Person p6=new Person("binay", 28);
	Person p7=new Person("deb", 63);


	List<Person> list=new ArrayList<Person>();
 	list.add(p1);
	list.add(p2);
	list.add(p3);
	list.add(p4);
	list.add(p5);
	list.add(p6);
	list.add(p7);
   
	
	List<Person> getlist=list.stream().filter(p->p.getAge()>24).collect(Collectors.toList());
	System.out.println("get peoplelist:"+getlist);
	
	//Map<Integer, List<Person>> listgroup=list.stream().collect(Collectors.groupingBy(Person::getAge));
	Map<Integer,Long> listgroup=list.stream().collect(Collectors.groupingBy(Person::getAge,Collectors.counting()));

	System.out.println("listgroup:"+listgroup);

Map<String,Integer> sumofage=list.stream().filter(p->p.getName().startsWith("b")).collect(Collectors.groupingBy(Person::getName,Collectors.summingInt(Person::getAge)));
System.out.println("sum of age:"+sumofage);

Map<String,Double> avgofage=list.stream().filter(p->p.getName().startsWith("b")).collect(Collectors.groupingBy(Person::getName,Collectors.averagingInt(Person::getAge)));
System.out.println("avg of age:"+avgofage);

String greater35=list.stream().filter(p->p.getAge()>24).map(Person::getName).collect(Collectors.joining(","));
System.out.println("grater than 35:"+greater35);

//Optional<Person>  oldest=list.stream().collect(Collectors.maxBy((p1,p2)-> p1.getAge()-p2.getAge()));
}

}
