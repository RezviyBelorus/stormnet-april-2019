package lec_16.map;

import lec_13.clone_example.SimpleBook;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Hello");
        map.put(1, "World");
        map.put(2, "Y");
        map.put(null, "uo");

        System.out.println(map);

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();


        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(2, "fg");
        treeMap.put(1, "fg");
        treeMap.put(3, "fg");

        System.out.println(treeMap);

        SimpleBook simpleBook = new SimpleBook("bookBame", 1988, "author");

        Map<SimpleBook, Integer> wrongMap = new HashMap<>();
        wrongMap.put(simpleBook, 2);
        simpleBook.setAuthor("Krendel");

        String s = map.get(1);
        System.out.println(s);

        SimpleBook simpleBook2 = new SimpleBook("bookBame", 1988, "Krendel");

        System.out.println(map.get(simpleBook2));

        System.out.println(wrongMap);

        Map<String, List<SimpleBook>> heavyMap = new HashMap<>();



    }
}
