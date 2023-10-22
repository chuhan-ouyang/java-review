import java.util.*;
import java.io.*;

/**
 * HashMap
 */
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> nameToOccur = new HashMap<String, Integer>();
        // put: add or replace
        nameToOccur.put("Chuhan", 1);
        // putIfAbsent
        System.out.println(nameToOccur.putIfAbsent("Chuhan", 2));
        printMap(nameToOccur);
        // putAll
        // remove(key)
        nameToOccur.remove("Chuhan");
        nameToOccur.remove("Howard");
        printMap(nameToOccur);
        // remove(key, value): only remove if match value
        nameToOccur.put("Chuhan", 3);
        nameToOccur.put("Howard", 5);
        nameToOccur.remove("Chuhan", 3);
        nameToOccur.remove("Howard", 1);
        printMap(nameToOccur);
        // replace(k, value): replace only if Chuhan is in map
        nameToOccur.replace("Chuhan", 6);
        nameToOccur.replace("Howard", 6);
        printMap(nameToOccur);
        // replace(k, oldvalue, newValue)
        nameToOccur.replace("Howard", 5, 7);
        nameToOccur.replace("Howard", 6, 8);
        printMap(nameToOccur);
        // replaceAll
        nameToOccur.replaceAll((k, v) -> Character.getNumericValue(k.charAt(0)) * v);
        printMap(nameToOccur);
        // containsKey
        System.out.println(nameToOccur.containsKey("Howard"));
        // containsValue
        System.out.println(nameToOccur.containsValue(136));
        System.out.println(nameToOccur.containsValue(140));
        // get
        System.out.println(nameToOccur.get("Howard"));
        System.out.println(nameToOccur.get("Chuhan"));
        // getOrDefault
        System.out.println(nameToOccur.getOrDefault("Chuhan", 0));
    }

    public static void printMap(HashMap<String, Integer> hs) {
        System.out.println();
        for (String k : hs.keySet()) {
            int val = hs.get(k);
            System.out.println(k + " : " + val);
        }
    }
}
