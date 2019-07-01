package lec_20_stream_api.classwork.part_2.point_6;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SkipAndLimitExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 99, 55, 44);

        Optional<Integer> reduce = integers.stream()
                .skip(3)
                .reduce((x, y) -> x + y);

        System.out.println(reduce.get());


        Optional<Integer> sumFirstX = integers.stream()
                .limit(3)
                .reduce((x, y) -> x + y);

        System.out.println(sumFirstX.get());
    }
}
