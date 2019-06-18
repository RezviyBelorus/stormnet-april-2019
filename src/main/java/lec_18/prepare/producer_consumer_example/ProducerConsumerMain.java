package lec_18.prepare.producer_consumer_example;

public class ProducerConsumerMain {
    public static void main(String[] args) {
        CarStore carStore = new CarStore();

        Runnable producer = () -> {
            for (int i = 0; i < 10; i++) {
                carStore.produce();
            }
        };

        Runnable consumer = () -> {
            for (int i = 0; i < 5; i++) {
                carStore.buyCar();
            }
        };

        new Thread(producer).start();
        new Thread(consumer, "consumer-1").start();
        new Thread(consumer, "consumer-2").start();

        Runnable atomicProducer = () -> {
            for (int i = 0; i < 100; i++) {
                carStore.inc();
            }
        };

        Runnable atomicConsumer = () -> {
            for (int i = 0; i < 100; i++) {
                carStore.decrement();
            }
        };

        new Thread(atomicProducer, "inc-1").start();
        new Thread(atomicConsumer, "dec-2").start();
    }
}
