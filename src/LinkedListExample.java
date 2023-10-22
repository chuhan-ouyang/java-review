/**
 * Double linked list
 */
import java.util.*;
import java.io.*;

public class LinkedListExample {
    public static void main(String[] args) {
        // List Interface
        // Declaring
        LinkedList<String> ll = new LinkedList<>();

        // Add
        ll.add("Chuhan");

        // Add at index
        ll.add(1, "Howard");
        printList(ll);

        // Add all
        ArrayList<String> names = new ArrayList<String>();
        names.add("A");
        names.add("B");
        names.add("C");
        ll.addAll(names);
        ll.addAll(1, names);
        printList(ll);

        // Add first
        ll.addFirst("Alpha");

        // Add last
        ll.addLast("Last");

        // Contains
        System.out.println(ll.contains("Howard"));

        // Get
        System.out.println(ll.get(5));

        // Get First
        System.out.println(ll.getFirst());

        // Get Last
        System.out.println(ll.getLast());

        // Set at index
        ll.set(1, "New Chuhan");
        printList(ll);

        // Index Of
        System.out.println(ll.indexOf("A"));

        // Last Index Of
        System.out.println(ll.lastIndexOf("A"));

        // Remove at index
        ll.remove(1);

        // Remove First
        ll.removeFirst();

        // Remove Last
        ll.removeLast();

        ll.add(3, "Howard");

        // Remove: First instance of a specific element
        ll.remove("Howard");
        printList(ll);
        ll.addLast("Howard");

        // RemoveFirstOccurrence
        ll.removeFirstOccurrence("Howard");
        printList(ll);

        // RemoveLastOccurrence
        ll.removeLastOccurrence("Howard");
        printList(ll);
    }

    public static void printList(LinkedList<String> ll) {
        System.out.println();
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }
        System.out.println();
    }
}
