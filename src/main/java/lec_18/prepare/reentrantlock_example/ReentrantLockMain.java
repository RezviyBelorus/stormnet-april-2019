package lec_18.prepare.reentrantlock_example;

public class ReentrantLockMain {
    public static void main(String[] args) {
        Store store = new Store();

        Consumer consumer = new Consumer(store);
        Producer producer = new Producer(store);

        new Thread(consumer).start();
        new Thread(producer).start();
    }
}
