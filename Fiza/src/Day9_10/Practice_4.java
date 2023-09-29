package Day9_10;

import java.util.*;

//Exercise 4: Set and Map Implementation
//Create a Java program that uses HashSet to store a list of unique numbers and TreeMap to store key-value pairs (e.g., country-capital pairs).
public class Practice_4 {
    public static void main(String[] args) {
        //Creating Hash Set
        HashSet<List> h = new HashSet<List>();
        List<Integer> l1 = Arrays.asList(10,20,30,40,50,60,60,70);
        List<Integer> l2 = Arrays.asList(80,90,10,20,30,100,70);
        h.add(l1);
        h.add(l2);
        System.out.println(h);

        //Creating Hash Map
        TreeMap<String, String> t = new TreeMap<>();
        t.put("India", "Delhi");
        t.put("Turkey", "Istanbul");
        t.put("Canada", "Ottawa");
        t.put("Colombia", "Bogota");

        System.out.println(t);

        // Iterating over TreeMap
        for(Map.Entry<String, String> i : t.entrySet()){
            System.out.println(i.getKey()+":  "+i.getValue());
        }

    }
}
