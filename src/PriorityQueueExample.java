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
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
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

}
