package lec_18.prepare.reentrantlock_example;

public class Consumer implements Runnable {
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            store.get();
            store.tryLockShow();
        }
    }
}
