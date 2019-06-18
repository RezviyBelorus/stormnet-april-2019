package lec_18.classwork.atomic_example;

public class AtomicMain {
    public static void main(String[] args) throws InterruptedException {
        AtomicCounter atomicCounter = new AtomicCounter();

        Runnable inc = () -> {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 100_000_000; i++) {
                atomicCounter.inc();
            }
            long end = System.currentTimeMillis();

            System.out.println("Wasted time: " + (end - start));
        };

        Thread thread1 = new Thread(inc);
        Thread thread2 = new Thread(inc);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Total atomic sum: " + atomicCounter.getAtomicInteger());

    }
}
