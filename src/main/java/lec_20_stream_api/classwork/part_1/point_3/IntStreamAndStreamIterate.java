package lec_20_stream_api.classwork.part_1.point_3;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamAndStreamIterate {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4};
        IntStream intStream = IntStream.of(1, 2, 3, 4);
        IntStream arrayIntStream = IntStream.of(ints);

        int sum = 0;
        for (int anInt : ints) {
            sum += anInt;
        }
        System.out.println(sum);


        IntStream stream = Arrays.stream(ints);
        int sum1 = stream.sum();
        System.out.println(sum1);


        Stream<Integer> iterate = Stream.iterate(0, x -> +2);
        long count = iterate.limit(10).count();
        System.out.println("Count: " + count);
    }
}
