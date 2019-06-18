package lec_18.classwork.reentrantlock_example;

public class ReentrantLockMain {
    public static void main(String[] args) throws InterruptedException {
        IStore iStore = new IStore();

        Runnable producer = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    iStore.bring();
                }
            }
        };

        Runnable consumer = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    iStore.sell();
                }
            }
        };

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();


        thread1.join();
        thread2.join();


    }
}
