package lec_18.prepare.reentrantlock_example;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Store {
    private int goods;

    private ReentrantLock locker;
    private Condition condition;

    private AtomicInteger counter = new AtomicInteger(0);

    public Store() {
        this.locker = new ReentrantLock();
        this.condition = locker.newCondition();
    }

    public void get() {
        try {
            locker.lock();

            while (goods < 1) {
                condition.await();
            }

            goods--;

            System.out.println("Bought 1 good");
            System.out.println("Total get:" + goods);
            System.out.println("===");

            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
        }
    }

    public void put() {
        try {
            locker.lock();

            while (goods >= 3) {
                condition.await();
            }
            goods++;

            System.out.println("Produced 1");
            System.out.println("Total on store:" + goods);
            System.out.println("====");

            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
        }
    }

    public void tryLockShow() {
        if (locker.tryLock()) {
            System.out.println("Total locked: " + locker.getQueueLength());
            System.out.println(counter.incrementAndGet());
            locker.unlock();
        }
    }
}
