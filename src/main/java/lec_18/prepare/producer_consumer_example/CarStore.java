package lec_18.prepare.producer_consumer_example;

import java.util.concurrent.atomic.AtomicInteger;

public class CarStore {
    private int numberOfCars;
    private int totalProduced;
    private int totalConsumed;

    private AtomicInteger atomicInteger = new AtomicInteger(0);
    private AtomicInteger totalProducedAtomicInteger = new AtomicInteger(0);
    private AtomicInteger totalConsumedAtomicInteger = new AtomicInteger(0);

    private volatile int volatileNumberOfCars;

    public synchronized void produce() {
        while (numberOfCars >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        totalProduced++;
        System.out.println(Thread.currentThread().getName() + " produced cars: " + ++numberOfCars);
        System.out.println("Total produced " + totalProduced);

        notify();
    }

    public synchronized void buyCar() {
        while (numberOfCars < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        numberOfCars--;
        totalConsumed--;
        System.out.println(Thread.currentThread().getName() + " bought car: 1");
        System.out.println("Total consumed: " + totalConsumed);
        notify();
    }

    public void inc() {
        System.out.println("Produced: " + atomicInteger.incrementAndGet());
        System.out.println("Produced volatile: " + ++volatileNumberOfCars);
        System.out.println("Total produced: " + totalProducedAtomicInteger.incrementAndGet());
    }

    public void decrement() {
        System.out.println("Consumed: " + atomicInteger.decrementAndGet());
        System.out.println("Consumed volatile: " + volatileNumberOfCars--);
        System.out.println("Total consumed: " + totalConsumedAtomicInteger.decrementAndGet());
    }
}
