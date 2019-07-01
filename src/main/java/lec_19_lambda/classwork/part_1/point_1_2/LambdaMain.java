package lec_19_lambda.classwork.part_1.point_1_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LambdaMain {
    public static void main(String[] args) {
        Executor evenFilter = (x) -> x % 2 == 0;

        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integers.add((int) (Math.random()*100));
        }

        System.out.println(integers);

        integers = filter(integers, evenFilter);

        System.out.println(integers);

        filter(integers, (x) -> x % 2 == 0);
    }

    private static List<Integer> filter(List<Integer> list, Executor filter) {
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (filter.filter(next)) {
                iterator.remove();
            }
        }

        return list;
    }
}

interface Executor {
    boolean filter(int x);
}
