package lec_18.prepare.semaphore_example.single_semaphore_example;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(1);
        SemaphoreStore semaphoreStore = new SemaphoreStore();

        Runnable consumer = () -> {
            for (int i = 0; i < 10; i++) {
                semaphoreStore.dec();
            }
        };

        Runnable producer = () -> {
            for (int i = 0; i < 1000_00; i++) {
                semaphoreStore.inc();
            }
        };

        Thread thread = new Thread(producer);
        Thread thread2 = new Thread(producer);

        thread.start();
        thread2.start();

        System.out.println("hey = " + semaphore.getQueueLength());
        thread.join();
        thread2.join();

//        new Thread(consumer).start();

        System.out.println(semaphoreStore.getNumberOfApples());
    }
}
