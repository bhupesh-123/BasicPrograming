package com.thread.engDigest;

public class ThreadMethod extends  Thread{

public  ThreadMethod(String name){
    super(name);
}

    public static void main(String[] args) {
    ThreadMethod tm=new ThreadMethod("bhupesh");
        System.out.println(Thread.currentThread().getName());
        tm.start();

        //priority example
        ThreadMethod low=new ThreadMethod("low");
        ThreadMethod med=new ThreadMethod("midum");
        ThreadMethod high=new ThreadMethod("high");

        low.setPriority(Thread.MIN_PRIORITY);
        med.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);

        low.start();
        med.start();
        high.start();


    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(2000);
                System.out.println("Thread name: "+Thread.currentThread().getName()+" counter: "+i);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
