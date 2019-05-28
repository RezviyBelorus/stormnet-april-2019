package lec_16.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o, Integer t1) {
                if (o > t1) {
                    return -1;
                }

                if (o < t1) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        map.put(2, 33);
        map.put(1, 33);
        map.put(5, 33);

        System.out.println(map);
    }
}
