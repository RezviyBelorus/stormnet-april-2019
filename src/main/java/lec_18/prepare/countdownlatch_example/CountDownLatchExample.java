package lec_18.prepare.countdownlatch_example;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);

        Runnable car = () -> {
            try {
                countDownLatch.countDown();

                countDownLatch.await();

                System.out.println("Moving!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        for (int i = 0; i < 4; i++) {
            new Thread(car).start();
        }

        System.out.println("Preparing for start");
        Thread.sleep(2000);

        countDownLatch.countDown();
        countDownLatch.countDown();
    }
}
