package lec_20_stream_api.classwork.part_1.point_1_2;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4 ,5);

        Stream<Integer> integerStream = integers.stream()
                .filter(x -> x > 3);

        List<Integer> filteredList = integerStream.collect(Collectors.toList());

        System.out.println(filteredList);
        System.out.println(integers);

        Set<Integer> filteredSet = integerStream.collect(Collectors.toSet());


    }
}
