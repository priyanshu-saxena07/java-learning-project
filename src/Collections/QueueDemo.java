package Collections;

import java.util.LinkedList;
import java.util.Queue;


public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> line = new LinkedList<>();

        line.offer("Rohan");
        line.offer("Ankit");
        line.offer("Kiran");
        line.offer("Sneha");


        System.out.println(line.poll());
        System.out.println(line.poll());
        System.out.println(line);
        System.out.println(line.size());



    }
}