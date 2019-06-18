package lec_18.classwork.reentrantlock_example;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class IStore {
    private int numberOfIphones;

    private ReentrantLock lock;
    private Condition condition;

    public IStore() {
        this.lock = new ReentrantLock();
        this.condition = lock.newCondition();
    }

    public void bring() {
        try {
            lock.lock();

            while (numberOfIphones > 1) {
                condition.await();
            }

            System.out.println("New iPhone: " + ++numberOfIphones);

            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void sell() {
        try {
            lock.lock();

            while (numberOfIphones < 1) {
                condition.await();
            }

            System.out.println("iPhone sold: " + numberOfIphones--);

            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
