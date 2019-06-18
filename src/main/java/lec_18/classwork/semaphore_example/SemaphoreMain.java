package lec_18.classwork.semaphore_example;

import lec_18.prepare.semaphore_example.Philosopher;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        for (int i = 0; i < 7; i++) {
            new Thread(new Counter(semaphore, i)).start();
        }
    }
}
