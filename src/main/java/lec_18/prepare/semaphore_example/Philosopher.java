package lec_18.prepare.semaphore_example;

import java.util.concurrent.Semaphore;

public class Philosopher implements Runnable {
    CommonResource commonResource;
    Semaphore semaphore;
    String threadName;

    public Philosopher(CommonResource commonResource, Semaphore semaphore, String threadName) {
        this.commonResource = commonResource;
        this.semaphore = semaphore;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            System.out.println(threadName + " waiting for access");
            semaphore.acquire();

            for (int i = 0; i < 5; i++) {
                int x = commonResource.getX();
                System.out.println(threadName + ": " + x);
                commonResource.setX(++x);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadName + " releasing resources");
        semaphore.release();
    }
}
