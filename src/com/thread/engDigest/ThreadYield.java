package com.thread.engDigest;

public class ThreadYield extends Thread {
    public  ThreadYield(String name){
        super(name);
    }
    public static void main(String[] args) {
    ThreadYield ty1=new ThreadYield("ty1");
        ThreadYield ty2=new ThreadYield("ty2");

        ty1.start();
        ty2.start();

    }

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("thread: "+Thread.currentThread().getName());
            Thread.yield();
        }
    }
}
