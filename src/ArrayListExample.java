/**
 * ArrayLIst implements list
 * Dynamic array
 *
 */
import java.util.*;
import java.io.*;
public class ArrayListExample {
    public static void main(String[] args) {
        // Declaring
        int n = 5;
        ArrayList<Integer> arr1 = new ArrayList<Integer>(n);

        // Printing
        System.out.println("Array1: " + arr1);

        // Add (Append)
        for (int i = 0; i < n; i++) {
            arr1.add(i);
        }
        printArray(arr1);

        // Insert at index
        arr1.add(1, 10);
        printArray(arr1);

        // Add all at index
        ArrayList<Integer> arr2 = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            arr2.add(i * 10);
        }
        arr1.addAll(arr2);
        arr1.addAll(1, arr2);
        printArray(arr1);

        // Get
        System.out.println(arr1.get(arr1.size() - 1));

        // Set
        arr1.set(10, 100);
        printArray(arr1);

        // Contains
        boolean ans = arr1.contains(2);
        System.out.println(ans);

        // IndexOf
        System.out.println(arr1.indexOf(0));

        // LastIndexOf
        System.out.println(arr1.lastIndexOf(0));

        // Remove Index
        arr1.remove(arr1.size() - 2);
        printArray(arr1);

        // Remove Object: Remove the first instance of this object
        arr1.remove(Integer.valueOf(0));
        printArray(arr1);

        // Remove If
        arr1.removeIf(x -> (x % 2 == 1));
        printArray(arr1);

        // IsEmpty
        boolean empty = arr1.isEmpty();
        System.out.println(empty);

        // Size
        System.out.println(arr1.size());
    }

    public static void printArray(ArrayList<Integer> arr) {
        for (int x : arr) {
            System.out.println(x);
        }
        System.out.println();
    }
}
