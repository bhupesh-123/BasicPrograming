package com.thread.engDigest;

import java.util.concurrent.*;

public class CountDownLatch_17 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        Future<String> future1 = executorService.submit(new DependentService());
        Future<String> future2 = executorService.submit(new DependentService());
        Future<String> future3 = executorService.submit(new DependentService());

        future1.get();
        future2.get();
        future3.get();

        System.out.println("All dependent services finished. starting main service.");
        executorService.shutdown();

    }
}

class DependentService implements Callable<String>{
    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName()+"  Service started");
        Thread.sleep(2000);
        return "ok";
    }
}
