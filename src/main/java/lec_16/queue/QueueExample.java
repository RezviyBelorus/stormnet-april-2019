package lec_16.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        Integer poll = queue.poll();
        System.out.println(queue);

        Integer peek = queue.peek();
        System.out.println(queue);

        System.out.println("peek:" + peek);
    }
}
