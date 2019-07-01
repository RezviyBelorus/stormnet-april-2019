package lec_20_stream_api.classwork.part_2.point_7;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFinrstFindAnyExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList();

        Optional<Integer> findFirst = integers.stream()
                .filter(x -> x == 5)
                .findFirst();

        Optional<Integer> findAny = integers.stream()
                .filter(x -> x == 5)
                .findAny();


        if (findFirst.isPresent()) {
            System.out.println(findFirst.get());
        }

        System.out.println(findAny.get());
    }
}
