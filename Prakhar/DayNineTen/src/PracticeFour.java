import java.util.HashSet;
import java.util.TreeMap;

public class PracticeFour {
    //    Exercise 4: Set and Map Implementation
//    Create a Java program that uses HashSet to store a list of unique numbers and TreeMap to store key-value pairs
//    (e.g., country-capital pairs).
    public static void main(String[] args) {
        try {
            HashSet<Integer> numbers = new HashSet<Integer>();

            // Adding numbers to a HashSet
            System.out.println("Adding numbers to a HashSet");
            numbers.add(10);
            numbers.add(20);
            numbers.add(30);
            numbers.add(10);
            numbers.add(40);
            numbers.add(20);
            numbers.add(50);

            System.out.println(numbers);
            System.out.println();
            System.out.println("HashSet by default stores unique entities");

            TreeMap<String, String> countryCapitals = new TreeMap<String, String>();

            // Adding key/value pairs to TreeMap
            System.out.println();
            System.out.println("Adding key/value pairs to TreeMap");
            countryCapitals.put("India", "Delhi");
            countryCapitals.put("Australia", "Sydney");
            countryCapitals.put("Thailand", "Bangkok");
            countryCapitals.put("Nepal", "Kathmandu");

            System.out.println(countryCapitals);
            System.out.println();
            System.out.println("TreeMap by default stores the entities in alphabetical order");
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
