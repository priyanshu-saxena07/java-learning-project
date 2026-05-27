package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println("Initial Queue: " + q);
        System.out.println("Removing element: " + q.poll());
        System.out.println("Queue after removal: " + q);

        if (!q.isEmpty()) {
            System.out.println("Front element is: " + q.peek());
        } else {
            System.out.println("Queue is empty!");
        }
    }
}