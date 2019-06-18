package lec_18.prepare.reentrantlock_example;

public class Producer implements Runnable {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            store.put();
        }
    }
}
