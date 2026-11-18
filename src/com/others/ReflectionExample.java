package com.others;

import java.lang.reflect.Field;

public class ReflectionExample {

    // getField() → Only finds public fields (including inherited).
    // getDeclaredField() → Finds any field declared in the class (private, protected, public).
    // Always call setAccessible(true) to access private fields.

    public static void main(String[] args) throws Exception {
        Person person=new Person();
        Class<?> clazz=person.getClass();

        Field ageField=clazz.getDeclaredField("age");
        System.out.println("Field Name: "+ageField.getName());
        System.out.println("Field Type: "+ageField.getType());
        System.out.println("Field Value: "+ageField.get(person));

        Field nameField=clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        System.out.println("Field Name: "+nameField.getName());
        System.out.println("Field Type: "+nameField.getType());
        System.out.println("Field Value: "+nameField.get(person));

        nameField.set(person,"bhupesh");
        System.out.println("Field Value: "+nameField.get(person));

    }
}
class Person {
    private String name = "John";
    public int age = 25;
}
