package lec_20_stream_api.classwork.part_2.point_1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "Worldddddddddd", "Misha");

        Predicate<String> filterByLength = x -> x.length() > 10;

        List<String> filteredList = strings.stream()
                .filter(filterByLength)
                .collect(Collectors.toList());

        System.out.println(filteredList);
        System.out.println("Unfiltered list: " + strings);
    }
}
