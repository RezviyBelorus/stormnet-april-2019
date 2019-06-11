package lec_15;

public class BuilderBufferExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hel");

        stringBuilder.append("lo");

        System.out.println(stringBuilder);

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000_000; i++) {
            stringBuilder.append("a");
        }
        long finish = System.currentTimeMillis();

        System.out.println("Result: " + (finish - start));

        StringBuffer stringBuffer = new StringBuffer();

        start = System.currentTimeMillis();

        for (int i = 0; i < 1000_000; i++) {
            stringBuffer.append("a");
        }

        finish = System.currentTimeMillis();

        System.out.println("StringBuffer result: " + (finish - start));
    }
}
