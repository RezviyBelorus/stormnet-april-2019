package lec_16.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(20);
        arrayList.add("First elem");
        arrayList.add("Second elem");


        ArrayList<String> embedded = new ArrayList<>();
        embedded.add("Embedded");

        arrayList.addAll(embedded);

        System.out.println(arrayList);

        arrayList.ensureCapacity(100);
        arrayList.trimToSize();

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("elem");

        List<String> list = new ArrayList<>();
        list = new LinkedList();

        list.addAll(arrayList);
        list.addAll(linkedList);

        System.out.println("remove" + list);
        linkedList.remove(0);
        System.out.println("after" + list);
    }
}
