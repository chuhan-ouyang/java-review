import java.io.*;
import java.util.*;

import static java.lang.Character.isLowerCase;

/**
 * Constant time for inserting and removing elements at both ends of the queue
 * Internally a dynamic, resizable array
 */
public class ArrayDequeExample {
    public static void main(String[] args) {
        // As Deque/Queue
        // add
        ArrayDeque<String> ad = new ArrayDeque<String>();
        ad.add("a");
        ad.add("b");
        ad.add("c");

        // addAll
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ad.addAll(ll);
        printDeque(ad);

        // addFirst
        ad.addFirst("aa");

        // addLast (used for queue)
        ad.addLast("zz");

        // contains
        System.out.println(ad.contains("aa"));

        // getFirst
        System.out.println(ad.getFirst());

        // getLast
        System.out.println(ad.getLast());

        // removeFirst (used for queue, stack, dequeue)
        System.out.println(ad.removeFirst());

        // removeLast
        System.out.println(ad.removeLast());

        // remove(o)
        ad.remove("a");

        // removeFirstOccurrence
        ad.removeFirstOccurrence("b");

        // removeLastOccurrence
        ad.removeLastOccurrence("A");
        printDeque(ad);

        // removeIf
        ad.removeIf(x -> Character.isLowerCase(x.charAt(0)));
        printDeque(ad);

        // As Stack: LIFO
        // peek: top
        System.out.println(ad.peek());

        // push
        ad.push("A");
        ad.push("B");
        ad.push("C");
        ad.push("D");
        ad.push("E");

        // pop
        while (!ad.isEmpty()) {
            System.out.println(ad.pop());
        }
    }

    public static void printDeque(ArrayDeque<String> ad) {
        Iterator<String> itr = ad.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();
    }
}
