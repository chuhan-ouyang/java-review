import java.util.*;
import java.io.*;

/**
 * Maintain doubly linked list to keep inserted element in order
 */
public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Add
        LinkedHashSet<String> ll = new LinkedHashSet<String>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        printList(ll);

        // Contains
        System.out.println(ll.contains("C"));

        // Remove
        ll.remove("C");

        // RemoveIf
        ll.removeIf(x -> x.compareTo("A") <= 0);

        printList(ll);
    }

    public static void printList(LinkedHashSet<String> ll) {
        for (String s : ll) {
            System.out.println(s);
        }
        System.out.println();
    }
}
