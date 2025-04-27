package com.thread.engDigest;

public class Test {
    public static void main(String[] args) {
//life cycle of thread
        World world=new World(); //NEW
        world.start();  // RUNNABLE ready for run when upu avalible

        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName());
     }
    }
