package lec_18.classwork.count_down_latch_example;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public class Runner implements Runnable {
    private CountDownLatch latch;
    private int id;

    public Runner(CountDownLatch latch, int id) {
        this.latch = latch;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            latch.countDown();

            latch.await();

            System.out.println("Побежал номер: " + id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
