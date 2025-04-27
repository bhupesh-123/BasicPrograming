package com.thread.engDigest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorFramework_16 {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(3);
        long startTime=System.currentTimeMillis();
       for(int i=1;i<=10;i++){
           int finalI = i;
           executor.submit(()->{
               long result=factorial(finalI);
               System.out.println(result);
           });
       }
        executor.shutdown();
        try {
            executor.awaitTermination(100, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("time consume: "+(System.currentTimeMillis()-startTime));

    }
    public static long factorial(int n) {
        int result=1;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i=1;i<=n;i++){
            result =result*i;
        }
        return  result;
    }
}
