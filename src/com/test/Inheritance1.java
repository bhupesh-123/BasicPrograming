package com.test;

class Animal1 {

    // field and method of the parent class
    String name;
    public void eat() {
        System.out.println("I can eat");
    }
}

// inherit from Animal
class Dog1 extends Animal1 {

    // new method in subclass
    public void display() {
        System.out.println("My name is " + name);
    }
}

public class Inheritance1 {
    public static void main(String[] args) {

        // create an object of the subclass
        Dog1 labrador = new Dog1();
        // access field of superclass
        labrador.name = "Rohu";
        labrador.display();
        // call method of superclass
        // using object of subclass
        labrador.eat();

        Animal1 obj=new Dog1();
        obj.name="elephant";
        obj.eat();
        //Animal1 does not know about Dog1 so need to cast
       ((Dog1) obj).display();
    }
}
