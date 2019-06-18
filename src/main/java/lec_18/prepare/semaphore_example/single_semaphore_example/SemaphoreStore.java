package lec_18.prepare.semaphore_example.single_semaphore_example;

public class SemaphoreStore {
    private int numberOfApples;

    public void inc() {
        System.out.println("Produced: " + ++numberOfApples);
    }

    public void dec() {
        System.out.println("Consumed: " + numberOfApples--);
    }

    public int getNumberOfApples() {
        return numberOfApples;
    }
}
