package lec_16.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("1");
        hashSet.add("1");
        hashSet.add("2");

        System.out.println(hashSet);

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("C");
        treeSet.add("C");

        System.out.println(treeSet);

        Set<String> set = new HashSet<>();
        set = new TreeSet<>();

    }
}
