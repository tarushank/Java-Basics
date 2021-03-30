package DataStructures_1;

import java.util.Stack;

public class Stack_DS {

    public static void main(String[] args) {

        System.out.println("Stack - Data Structure");
        Stack<Integer> plates = new Stack<>();
        plates.push(1);
        plates.push(2);
        plates.push(3);

        if (plates.isEmpty()) {
            System.out.println("STACK IS EMPTY.");
        }
        System.out.println(plates);

        System.out.println("HEAD VALUE: " +plates.peek());
        System.out.println("POPPED VALUE | LAST VALUE: " +plates.pop());
        System.out.println(plates);
    }

}
