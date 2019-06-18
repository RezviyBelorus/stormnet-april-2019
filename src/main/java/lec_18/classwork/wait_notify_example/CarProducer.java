package lec_18.classwork.wait_notify_example;

public class CarProducer implements Runnable {
    private CarStore carStore;

    public CarProducer(CarStore carStore) {
        this.carStore = carStore;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            carStore.produce();
        }
    }
}
