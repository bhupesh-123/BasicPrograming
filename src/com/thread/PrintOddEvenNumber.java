package com.thread;

public class PrintOddEvenNumber {
    int count = 1;
    static int N;

    public static void main(String[] args) {
        N = 10;
        PrintOddEvenNumber number = new PrintOddEvenNumber();
        Thread odd = new Thread(() -> number.printOdd());
        Thread even = new Thread(() -> number.printEven());

        odd.start();
        even.start();

    }

    public synchronized void printEven() {
        while (count < N) {
            while (count % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("even: " + count);
            count++;
            notify();
        }
    }

    public synchronized void printOdd() {
        while (count < N) {
            while (count % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("odd: " + count);
            count++;
            notify();
        }
    }
}
