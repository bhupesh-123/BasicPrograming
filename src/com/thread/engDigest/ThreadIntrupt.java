package com.thread.engDigest;

public class ThreadIntrupt  extends  Thread{
    public static void main(String[] args) {
        ThreadIntrupt ti=new ThreadIntrupt();
        ti.start();
        ti.interrupt();//this will intruppt the method if sleeping or running  due to messege is not printing


    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("some messege");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
