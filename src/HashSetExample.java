import java.util.*;
import java.io.*;

public class HashSetExample {
    public static void main(String[] args) {
        // add
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(10);
        hs.add(1);
        hs.add(5);
        hs.add(6);

        // contains
        boolean ans = hs.contains(10);
        System.out.println(ans);

        // remove
        hs.remove(5);

        // iteration
        printHashSet(hs);
    }

    public static void printHashSet(HashSet<Integer> h) {
        for (Integer i : h) {
            System.out.println(i);
        }
        System.out.println();
    }
}
