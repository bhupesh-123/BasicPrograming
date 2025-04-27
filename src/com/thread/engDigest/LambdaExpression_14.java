package com.thread.engDigest;

public class LambdaExpression_14 {
    public static void main(String[] args) {
        // 1st
       /* Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello thread");
            }
        };*/
        // 2nd
        Runnable runnable=() ->{

                System.out.println("Hello thread");

        };
        // 3rd
        Runnable runnable1=() -> System.out.println("Hello thread");

        Thread thread=new Thread(runnable);
        thread.start();

        Thread thread1= new Thread(()->{
            for (int i=0;i<5;i++){
                System.out.println("number: "+i);
            }
        });
        thread1.start();
    }
}
