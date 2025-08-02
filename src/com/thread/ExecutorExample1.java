package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample1 {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newScheduledThreadPool(1);
        for(int i=0;i<5;i++){
            int taskId  = i;
            executorService.submit(()->System.out.println("Running task: "+ taskId +"  Thread name: "+Thread.currentThread().getName()));
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
          }
        }
        executorService.shutdown();
    }
}
