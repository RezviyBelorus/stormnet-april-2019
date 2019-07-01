package lec_20_stream_api.classwork.part_2.point_2;

import lec_20_stream_api.entity.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("iPhone 10", "Apple", 66666));
        phones.add(new Phone("iPhone 8", "Apple", 66666-666));
        phones.add(new Phone("Samsung S10", "Samsung", 33333));
        phones.add(new Phone("Redmi 7", "Xiaomi", 115));

        List<String> models = phones.stream()
                .map(phone -> phone.getModel())
                .collect(Collectors.toList());

        System.out.println(models);
    }
}
