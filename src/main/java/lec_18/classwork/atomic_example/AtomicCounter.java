package lec_18.classwork.atomic_example;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
    private AtomicInteger atomicInteger = new AtomicInteger();

    public void inc() {
        atomicInteger.incrementAndGet();
    }

    public void dec() {
        atomicInteger.decrementAndGet();
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
}
