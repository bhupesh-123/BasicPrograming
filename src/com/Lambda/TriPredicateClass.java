package com.Lambda;

public class TriPredicateClass {
    public static void triPredcate(){

        //ternary
        TriPredicate<String,Integer,Integer>  testTest1=(t,u,v)->
                (t.equals("dog") && u>5 && v<6)?true:false;


        TriPredicate<String,Integer,Integer>  testTest=(t,u,v)->{
            if(t.equals("dog") && u>5 && v<6){
            return  true;
            }
                else{
             return false;
            }
        };
        System.out.println("test in tripredicate: "+testTest.test("dog",7,4));
    }

    public static void main(String[] args) {
        triPredcate();
    }

    }
