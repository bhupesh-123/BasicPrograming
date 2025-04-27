package com.test;

public class Animal {
    public void eat(){
        System.out.println("");
    }
}

class Horse extends Animal{
    public void buck(){
        System.out.println("");

    }
}
class Testing{
    public static void main(String[] args) {
        Animal h=new Horse();
      //  h.buck();
        h.eat();
    }
    }
