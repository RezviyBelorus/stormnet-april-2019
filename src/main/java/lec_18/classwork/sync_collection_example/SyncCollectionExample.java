package lec_18.classwork.sync_collection_example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncCollectionExample {
    private List<Integer> integerList = new ArrayList<>(60_000_000);
    private CopyOnWriteArrayList<Integer> syncList = new CopyOnWriteArrayList<>();

    public synchronized void add() {
//        syncList.add(1);
        integerList.add(1);
    }

    public void addSync() {
        syncList.add(1);
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public CopyOnWriteArrayList<Integer> getSyncList() {
        return syncList;
    }
}
