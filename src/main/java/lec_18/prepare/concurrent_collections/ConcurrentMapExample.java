package lec_18.prepare.concurrent_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentMapExample {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();


        CopyOnWriteArrayList<Integer> integers = new CopyOnWriteArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        Runnable producer = () -> {
            for (int i = 0; i < 10000; i++) {
                integers.add(1);
                integerList.add(1);
            }
        };

        for (int i = 0; i < 4; i++) {
            new Thread(producer).start();
        }


        Thread.sleep(20000);

        System.out.println(integers.size());
        System.out.println(integerList.size());
    }
}
