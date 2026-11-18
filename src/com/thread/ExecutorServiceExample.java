package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(6);
        for(int i=0;i<10;i++){
            int taskId=i;
            executorService.execute(()->{
                System.out.println("taskId: "+taskId+"  :  "+Thread.currentThread().getName());
        });
        }
        executorService.shutdown();

    }
}
