package lec_18.prepare.semaphore_example;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        CommonResource commonResource = new CommonResource();

        new Thread(new Philosopher(commonResource, semaphore, "Thread1")).start();
        new Thread(new Philosopher(commonResource, semaphore,"Thread2")).start();
        new Thread(new Philosopher(commonResource, semaphore, "Thread3")).start();
    }
}
