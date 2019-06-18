package lec_18.classwork.wait_notify_example;

public class CarStoreMain {
    public static void main(String[] args) throws InterruptedException {
        CarStore carStore = new CarStore();

        CarProducer carProducer = new CarProducer(carStore);
        CarConsumer carConsumer = new CarConsumer(carStore);

        Thread producerThread = new Thread(carProducer);
        Thread consumerThread = new Thread(carConsumer);

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();


        System.out.println("Total produced: " + carStore.getTotalProduced());
        System.out.println("Total consumed: " + carStore.getTotalConsumed());
        System.out.println("All cars were sold");
    }
}
