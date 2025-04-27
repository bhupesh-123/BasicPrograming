package com.thread.engDigest;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceInvokeAll_16 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor= Executors.newSingleThreadExecutor();
        Callable<Integer> callable1=()->11;
        Callable<Integer> callable2=()->12;
        Callable<Integer> callable3=()->13;

        List<Callable<Integer>> callableList= Arrays.asList(callable1,callable2,callable3);
        List<Future<Integer>> futuresList = executor.invokeAll(callableList);
        for(Future future:futuresList){
            System.out.println("future value: "+future.get());
        }
        executor.shutdown();

    }
}
