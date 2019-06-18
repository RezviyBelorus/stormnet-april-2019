package lec_18.prepare;

public class Printer {
    public synchronized void syncPrint() {
        while (true) {
            System.out.println("syncPrint");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void print() {
        while (true) {
            System.out.println("print");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void syncBlockPrint() {
        while (true) {
            synchronized (this) {
                System.out.println("syncBlockPrint");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
