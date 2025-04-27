package com.Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//page no 928 ocjp stream chapter
public class Duck implements Comparable<Duck>{
String name;
String color;
int age;
public String getName() {
	return name;
}
public String getColor() {
	return color;
}
public int getAge() {
	return age;
}
public Duck(String name, String color, int age) {
	super();
	this.name = name;
	this.color = color;
	this.age = age;
}
@Override
public String toString() {
	return "Duck [name=" + name + ", color=" + color + ", age=" + age + "]";
}
@Override
public int compareTo(Duck duck) {
	
	return this.getName().compareTo(duck.getName());
}
public static void main(String[] args) {
	
List<Duck> ducks=Arrays.asList(new Duck("abc","red",3),new Duck("xyz","blue",2),new Duck("mno","red",1));
ducks.stream().sorted().forEach(System.out::println);
Comparator<Duck> byAgeLambda=(d1,d2)->d1.getAge()-d2.getAge();
ducks.stream().sorted(byAgeLambda).forEach(System.out::println);

Comparator<Duck> byname=Comparator.comparing(Duck::getName);
ducks.stream().sorted(byname).forEach(System.out::println);

Comparator<Duck> byage=Comparator.comparing(Duck::getAge);
ducks.stream().sorted(byage).forEach(System.out::println);
ducks.stream().sorted(byname.thenComparing(byage)).forEach(System.out::println);


}
}
