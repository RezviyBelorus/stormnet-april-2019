package lec_18.prepare.sync_example;

import lec_18.prepare.Printer;

public class RunnablePrinter implements Runnable {
    private Printer printer;

    public RunnablePrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {

    }
}
