package com.thread.selinium;

import java.util.concurrent.*;

public class FutureExampleSynchronous {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long startTime=System.currentTimeMillis();
        ExecutorService executorService= Executors.newFixedThreadPool(2);

        Callable<String> firstNameCallable= new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Selenium";
            }
        };

        Callable<String> lastNameCallable= new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Express";
            }
        };
        Future<String> firstNameFuture = executorService.submit(firstNameCallable);
        Future<String> lastNameFuture = executorService.submit(lastNameCallable);

        String firstName=firstNameFuture.get();
        String lastName=lastNameFuture.get();

        System.out.println(firstName+" "+lastName);
        System.out.println("Time taken: "+(System.currentTimeMillis() - startTime));
        executorService.shutdown();

    }
}
