package lec_18.classwork.dead_lock_example;

public class DeadLockMain {
    public static void main(String[] args) throws InterruptedException {
        Object object1 = new Object();
        Object object2 = new Object();

        Runnable runnable1 = () -> {
            synchronized (object1) {
                System.out.println("Thread 1: Object-1 was locked");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Trying to lock object-2");

                synchronized (object2) {
                    System.out.println("Thread 1: Object-2 was locked");
                }
            }
        };

        Runnable runnable2 = () -> {
            synchronized (object2) {
                System.out.println("Thread 2: Object-2 was locked");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Trying to lock object-1");

                synchronized (object1) {
                    System.out.println("Thread 2: Object-1 was locked");
                }
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Method main finished");
    }
}
