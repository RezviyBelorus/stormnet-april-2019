package lec_18.classwork.count_down_latch_example;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchMain {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(5);


        for (int i = 0; i < 3; i++) {
            new Thread(new Runner(latch, i+1)).start();
        }

        Thread.sleep(2000);
        System.out.println("На старт!");
        latch.countDown();

        Thread.sleep(2000);
        System.out.println("Внимание! Марш!");
        latch.countDown();
    }
}
