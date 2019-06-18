package lec_18.prepare.exchanger_example;

import java.util.concurrent.Exchanger;

public class GetThread implements Runnable {
    private Exchanger<String> exchanger;
    private String message;

    public GetThread(Exchanger<String> exchanger, String message) {
        this.exchanger = exchanger;
        this.message = message;
    }

    @Override
    public void run() {
        try {
            message = exchanger.exchange(message);
            System.out.println("GetThread got: " + message);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
