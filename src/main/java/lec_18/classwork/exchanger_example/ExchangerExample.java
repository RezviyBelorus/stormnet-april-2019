package lec_18.classwork.exchanger_example;

import java.util.concurrent.Exchanger;

public class ExchangerExample implements Runnable{
    private Exchanger<String> exchanger;
    private String message;

    private String threadName;

    public ExchangerExample(Exchanger<String> exchanger, String message, String threadName) {
        this.exchanger = exchanger;
        this.message = message;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            System.out.println(threadName + " Message before: " + message);
            message = exchanger.exchange(message);
            System.out.println(threadName + " Message received: " + message);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
