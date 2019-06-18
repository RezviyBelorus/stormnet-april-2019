package lec_18.classwork.sync_collection_example;

import java.util.ArrayList;
import java.util.List;

public class SyncCollectionMain {
    public static void main(String[] args) throws InterruptedException {
        SyncCollectionExample collectionExample = new SyncCollectionExample();

        Runnable runnable = () -> {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 100_000; i++) {
//                collectionExample.add();
                collectionExample.addSync();

            }
            long end = System.currentTimeMillis();

            System.out.println("Wasted time: " + (end - start));
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Size: " + collectionExample.getIntegerList().size());
        System.out.println("Size sync: " + collectionExample.getSyncList().size());
    }
}
