package lec_18.classwork.wait_notify_example;

public class CarStore {
    private int numberOfCars;

    private int totalProduced;
    private int totalConsumed;

    public synchronized void produce() {
        while (numberOfCars >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        totalProduced++;
        System.out.println("Car were produced: " + ++numberOfCars);

        notify();
    }

    public synchronized void buy() {
        while (numberOfCars < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        totalConsumed++;
        System.out.println("Bought 1 car: " + numberOfCars--);

        notify();
    }

    public int getTotalProduced() {
        return totalProduced;
    }

    public int getTotalConsumed() {
        return totalConsumed;
    }
}
