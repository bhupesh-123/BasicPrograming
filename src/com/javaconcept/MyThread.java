package com.javaconcept;

public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run(){
        System.out.println("Thread running");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread("MyThread");
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getName()+ " : "+ thread.getState());
        Thread.sleep(1000);
        System.out.println(thread.getName()+ " : "+ thread.getState());
        thread.join();
        System.out.println(thread.getName()+ " : "+ thread.getState());


    }
}
