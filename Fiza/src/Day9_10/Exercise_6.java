package Day9_10;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

//Exercise 6: Country-Capital Mapping
//Create a Java program that uses a HashMap to map countries to their capitals.
// Implement functions to add new mappings, retrieve capitals by specifying a country, and list all countries and capitals.
public class Exercise_6 {
    public static void main(String[] args) {
        try {

            //Creating Hash Map
            HashMap<String, String> t = new HashMap<>();
            t.put("India", "Delhi");
            t.put("Turkey", "Istanbul");
            t.put("Canada", "Ottawa");
            t.put("Colombia", "Bogota");

            System.out.println(t);

            // Iterating over TreeMap
            for (Map.Entry<String, String> i : t.entrySet()) {
                System.out.println(i.getKey() + ":  " + i.getValue());
            }
            //retrieve capitals by specifying a country using get() method
            System.out.println(t.get("India"));
        }
        catch (NullPointerException e){
            System.out.println(e.getLocalizedMessage());
        }
        catch (RuntimeException e){
            System.out.println(e.getLocalizedMessage());
        }

    }
}
