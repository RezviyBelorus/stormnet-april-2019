package lec_18.prepare.sync_example;

import lec_18.prepare.Printer;

public class PrintMain {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Runnable syncPrint = () -> printer.syncPrint();

        Runnable print = () -> printer.print();

        Runnable syncBlockPrint = () -> printer.syncBlockPrint();

        Thread thread1 = new Thread(syncPrint);
        Thread thread2 = new Thread(print);
        Thread thread3 = new Thread(syncBlockPrint);

        thread3.start();
//        thread2.start();
        thread1.start();

//        System.out.println("Method main finished");
    }
}
