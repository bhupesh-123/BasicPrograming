package com.Lambda;

import java.time.LocalDate;
import java.util.function.Supplier;

//FunctionalInterface
interface DogQurier{
	public boolean test(Dog d);
	}

class Dog{
	private String name;
	private int weight;
	public String getName() {
		return this.name;
	}

	public int getWeight() {
		return this.weight;
	}

	public int getAge() {
		return this.age;
	}

	private int age;
	
	public Dog(String name,int weight,int age){
		this.name=name;
		this.weight=weight;
		this.age=age;
	}
	
}

public class TestDog {
	public static void main(String[] args) {
		Dog boi=new Dog("boi", 30, 6);
		Dog clover=new Dog("clover", 35, 12);
		DogQurier dq=new DogQurier() {
			@Override
			public boolean test(Dog d) {
				return d.getAge()>9;
			}
		};
		
		DogQurier dqr=(Dog dog)->dog.getAge()>9;
		System.out.println("is boi is older than ?:"+dqr.test(boi));
		System.out.println("is clover is older than ?:"+dqr.test(clover));
		//Supplier<Integer> supplier=()->42;
		//System.out.println("check supp"+supplier.get());
		
	}

}
