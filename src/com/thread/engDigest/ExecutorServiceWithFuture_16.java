package com.thread.engDigest;

import java.util.concurrent.*;

public class ExecutorServiceWithFuture_16 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor= Executors.newSingleThreadExecutor();
        // for runnable return type void and for Callable should return any type
       // Runnable runnable=()->"Hello";//can not converted to void
        Callable<String> callable=()->"Hello callable"; // should return

        Future<?> future = executor.submit(callable);
        System.out.println(future.get());
        if(future.isDone()){
            System.out.println("future task is completed.");
        }
        executor.shutdown();
        Thread.sleep(1);
        System.out.println(executor.isShutdown());
        System.out.println(executor.isTerminated());

    }
}
