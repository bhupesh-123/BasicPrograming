package com.thread.engDigest;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleExecutorServiceFixRate_16 {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        executorService.scheduleAtFixedRate(()-> System.out.println("schedule at fix rate !!"),
                5,
                5,
                TimeUnit.SECONDS);


        executorService.schedule(()-> { System.out.println("initiatial shutdown....");
        executorService.shutdown();
        },20,TimeUnit.SECONDS);
    }
}
