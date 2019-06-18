package lec_18.classwork.exchanger_example;

import java.util.concurrent.Exchanger;

public class ExchangerMain {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        String catMessage = "Cat";
        String dogMessage = "Dog";

        ExchangerExample cat = new ExchangerExample(exchanger, "Hello from Cat", "Thread-Cat");
        ExchangerExample dog = new ExchangerExample(exchanger, "Hello from Dog", "Thread-Dog");

        new Thread(cat).start();
        new Thread(dog).start();
    }
}
