package lec_18.prepare.exchanger_example;

import java.util.concurrent.Exchanger;

public class ExchangerMain {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        new Thread(new PutThread(exchanger, "HelloJava")).start();
        new Thread(new GetThread(exchanger, "HelloWorld")).start();
        new Thread(new PutThread(exchanger, "HelloWorld")).start();
        new Thread(new GetThread(exchanger, "HelloWorld")).start();
    }
}
