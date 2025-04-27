package com.thread.engDigest;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleExecutorService_16 {
    //with delay or periodically
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        System.out.println("started");
        executorService.schedule(()-> System.out.println("Scheduled Executor Service")
                ,5
                , TimeUnit.SECONDS);


        executorService.shutdown();
    }
}
