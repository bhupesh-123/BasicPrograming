package com.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        List<Future<Boolean>> futuresList = new ArrayList<>();

        for (int i=0;i<5;i++){
            int taskId = i;
           Future<Boolean> result= executorService.submit(()->{

                    Thread.sleep(2000);
                    System.out.println("taskId:  "+ taskId +"  : "+Thread.currentThread().getName());
                    return taskId>2?true:false;

            });
            futuresList.add(result);

        }
        for (Future<Boolean> futureresult : futuresList) {
            System.out.println("Result : " + futureresult.get());
        }
        executorService.shutdown();
    }
}
