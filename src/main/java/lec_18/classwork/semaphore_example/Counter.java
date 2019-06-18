package lec_18.classwork.semaphore_example;

import java.util.concurrent.Semaphore;

public class Counter implements Runnable {
    private Semaphore semaphore;

    private int num;
    private int id;


    public Counter(Semaphore semaphore, int id) {
        this.semaphore = semaphore;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            while (num < 2) {
                semaphore.acquire();

                System.out.println("Философ + " + id + " садится за стол");

                Thread.sleep(5000);

                num++;

                System.out.println("Филосов + " + id + " выходит из-за столов");

                semaphore.release();

                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
