import java.util.*;
import java.io.*;

/**
 * TreeSet
 * Sorted set that usesa a tree for storage
 * Self-balancing binary-search tree (red-black tree)
 * Excellelt for storing large amouns of sorted information needing fast access
 * Add, remove, search takes O(logN)
 */
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>((a, b) -> -1 * a.compareTo(b));
        // add
        ts.add("Chuhan");
        ts.add("Howard");
        ts.add("A");
        ts.add("Z");
        printTS(ts);

        // first
        System.out.println(ts.first());

        // last
        System.out.println(ts.last());

        // contains
        System.out.println(ts.contains("Chuhan"));

        // remove
        ts.remove("Chuhan");
        System.out.println(ts.remove("Chuhan"));
        printTS(ts);

        // pollFirst
        System.out.println(ts.pollFirst());

        // pollLast
        System.out.println(ts.pollLast());
        printTS(ts);

        // ceiling
        ts.add("Chuhan");
        ts.add("AB");
        ts.add("Z");
        // Return the least element in this set greater than or equal to the given element
        // Or null
        System.out.println(ts.ceiling("B")); // A
        System.out.println(ts.ceiling("Chuhan")); // Chuhan
        System.out.println(ts.ceiling("AA")); // null
        System.out.println(ts.ceiling("ZZ")); // Z

        // floor
        // Return the greatest element in this set less than or equal to the given element or null
        System.out.println(ts.floor("B")); // Chuhan
        System.out.println(ts.floor("Chuhan")); // Chuhan
        System.out.println(ts.floor("ZZ")); // null
        System.out.println(ts.floor("AA")); // AB

        // higher
        // ZZ Howard Chuhan AB
        // Return the least element strictly greater than current
        System.out.println(ts.higher("B")); // A
        System.out.println(ts.higher("Chuhan")); // AB
        System.out.println(ts.higher("AA")); // null
        System.out.println(ts.higher("ZZ")); // Z

        // lower
        // Return the greatest element strictly less than current
        System.out.println(ts.lower("B")); // Chuhan
        System.out.println(ts.lower("Chuhan")); // Howard
        System.out.println(ts.lower("ZZ")); // null
        System.out.println(ts.lower("AA")); // AB

        // headSet: include elements strictly less than target
        SortedSet<String> tsHead = ts.headSet("Chuhan");
        System.out.println();
        for (String s : tsHead) {
            System.out.println(s);
        }
        System.out.println();

        // subSet
        System.out.println(ts.subSet("Howard", "Chuhan"));

        // tailSet
        System.out.println(ts.tailSet("Howard"));
    }

    public static void printTS(TreeSet<String> ts) {
        System.out.println();
        for (String s : ts) {
            System.out.println(s);
        }
        System.out.println();
    }
}
