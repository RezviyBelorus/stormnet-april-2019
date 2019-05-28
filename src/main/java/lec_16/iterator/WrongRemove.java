package lec_16.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WrongRemove {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        // как НЕЛЬЗЯ удалять элементы из коллекции
//        for (int i = 0; i < integers.size(); i++) {
//            integers.remove(i);
//        }

//        for (Integer integer : integers) {
//            if (integer % 2 == 0) {
//                integers.remove(integer);
//            }
//        }

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println(integers);

        List<Integer> test = new ArrayList<>();
        test.add(1);

        Iterator<Integer> iterator1 = test.iterator();

        while (iterator1.hasNext()) {
            iterator1.next();
            iterator1.remove();
            iterator1.next();
        }
    }
}
