package lec_18.classwork.wait_notify_example;

public class CarConsumer implements Runnable {
    private CarStore carStore;

    public CarConsumer(CarStore carStore) {
        this.carStore = carStore;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            carStore.buy();
        }
    }
}
