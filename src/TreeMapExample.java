import java.util.*;
import java.io.*;

/**
 * Red-black tree
 * Sorted based on keys
 * log(n) for put, get, remove, conainsKey
 */

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<String, Integer>((a, b) -> (-1) * a.compareTo(b));
        // put
        tm.put("Chuhan", 1);
        tm.put("Howard", 2);
        tm.putIfAbsent("Howard", 3);
        // replace (k, v)
        tm.replace("Chuhan", 3);
        // replace (k, oldv, newV)
        tm.replace("Howard", 2, 5);
        // get
        System.out.println(tm.get("Howard"));
        // remove
        // pollFirstEntry
        tm.put("A", 9);
        tm.put("Z", 10);
        // pollLastEntry
        tm.pollFirstEntry();
        tm.pollLastEntry();

        // containsKey
        System.out.println(tm.containsKey("A"));

        // containsValue
        System.out.println(tm.containsValue(10));
        // firstKey
        System.out.println(tm.firstKey());
        // lastKey
        System.out.println(tm.lastKey());
        // ceilingEntry: Howard, Chuhan
        printMap(tm);
        System.out.println(tm.ceilingEntry("D")); // Chuhan
        // floorEntry
        System.out.println(tm.floorEntry("D")); // Howard
        // higherEntry
        System.out.println(tm.higherEntry("D")); // Chuhan
        // lowerEntry
        System.out.println(tm.lowerEntry("D")); // Howard
    }

    public static void printMap(TreeMap<String, Integer> tm) {
        System.out.println();
        for (String k : tm.keySet()) {
            int val = tm.get(k);
            System.out.println(k + " : " + val);
        }
        System.out.println();
    }
}
