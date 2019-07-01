package lec_20_stream_api.classwork.part_2.point_5;

import lec_20_stream_api.entity.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatStreamExample {
    public static void main(String[] args) {
        List<Phone> shop_1 = new ArrayList<>();
        shop_1.add(new Phone("iPhone 10", "Apple", 66666));
        shop_1.add(new Phone("iPhone 8", "Apple", 66666-666));


        List<Phone> shop_2 = new ArrayList<>();
        shop_2.add(new Phone("Samsung S10", "Samsung", 33333));
        shop_2.add(new Phone("Redmi 7", "Xiaomi", 115));

        Stream<Phone> shop_1_stream = shop_1.stream();
        Stream<Phone> shop_2_stream = shop_2.stream();

        Stream<Phone> concat = Stream.concat(shop_1_stream, shop_2_stream);

        Set<String> producers = concat.map(phone -> phone.getProducer()).collect(Collectors.toSet());
        System.out.println(producers);
    }
}
