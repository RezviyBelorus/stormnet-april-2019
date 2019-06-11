package lec_15;

public class StringBenchmark {
    public static void main(String[] args) {
        String stringPool = "Hello";
        String objectString = new String("Hello");

        String toAddPool = "a";
        String toAddObject = new String("a");


        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            stringPool = stringPool.concat(toAddPool);
        }

        long finish = System.currentTimeMillis();

        System.out.println("String pool result: " + (finish - start));

        start = System.currentTimeMillis();

        stringPool = "Hello";

        for (int i = 0; i < 1_00_000; i++) {
            stringPool = stringPool.concat(new String("a"));
        }

        finish = System.currentTimeMillis();

        System.out.println("String object concat: " + (finish-start));


    }
}
