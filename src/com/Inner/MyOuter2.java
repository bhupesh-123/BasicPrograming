package com.Inner;

public class MyOuter2 {
    private String x="outer2";
    public void doStuff(){
        //local variables referenced from an inner class must be final or effectively final
        String z="local variable";
        class MyInner2{

            public void seeOuter(){
                System.out.println("outer variable: "+x);
                System.out.println("local variable: "+z);
               // z="change local variable";
            }
        }
        x="changing outer variable.";
        MyInner2 inner=new MyInner2();
        inner.seeOuter();
    }
    public static void main(String[] args) {
        MyOuter2 outer=new MyOuter2();
        outer.doStuff();
    }

    }
