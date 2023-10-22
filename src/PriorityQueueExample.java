import java.util.*;
import java.io.*;

/**
 * Priority queue implemented based on binary heap (balanced binary tree, but not BST)
 * With invariant of parent vs. child
 * Based on comparator
 * O(logn) for enqueing (push) and dequeing (pop)
 * O(n) for contains and remove (random)
 * O(1) for peek (finding min of max)
 */
public class PriorityQueueExample {
    public static void main(String[] args) {
        // default: min heap
        // Return a negative number if a should be arranged before b
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
        // add/push
        pq.add(2);
        pq.add(3);
        pq.add(1);
        pq.add(4);
        printPq(pq);
        // contains
        System.out.println(pq.contains(3));
        // peek
        System.out.println(pq.peek());
        // remove(o)
        pq.removeIf(x -> x % 2 == 0);
        printPq(pq);

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.sort((a, b) -> b - a);
        printArray(arr);
    }

    public static void printPq(PriorityQueue<Integer> pq) {
        PriorityQueue<Integer> pqCopy = new PriorityQueue<Integer>(pq);
        System.out.println();
        while (!pqCopy.isEmpty()) {
            int a = pqCopy.poll();
            System.out.println(a);
        }
        System.out.println();
    }

    public static void printArray(ArrayList<Integer> arr) {
        System.out.println();
        for (Integer x : arr) {
            System.out.println(x);
        }
        System.out.println();
    }
}
