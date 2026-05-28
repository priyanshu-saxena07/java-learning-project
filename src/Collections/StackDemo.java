package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackDemo {
    public static void main(String[] args) {
         Deque<Integer> stack = new ArrayDeque<>();

        stack.push(25);
        stack.push(60);
        stack.push(40);
        System.out.println("Stack after push: " + stack);


        if (!stack.isEmpty()) {
            stack.pop();
        }
        System.out.println("Stack after pop: " + stack);


        if (!stack.isEmpty()) {
            System.out.println("Top element is: " + stack.peek());
        } else {
            System.out.println("Stack is empty!");
    }
}
}