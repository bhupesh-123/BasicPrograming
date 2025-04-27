package com.thread.engDigest;

public class MyThread extends  Thread {


    //ctrl + J for main
    public static void main(String[] args) throws  InterruptedException{
        MyThread myThread=new MyThread();
        System.out.println(myThread.getState());
        myThread.start();
        System.out.println(myThread.getState());
        Thread.sleep(100);
        System.out.println(myThread.getState());
        myThread.join();// Main method will wait to complete myThread thread
        System.out.println(myThread.getState());

    }

    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {

        }
    }
}
