import java.util.*;

public class ExerciseSix {
    //Exercise 6: Country-Capital Mapping
//    Create a Java program that uses a HashMap to map countries to their capitals. Implement functions to add new
//    mappings, retrieve capitals by specifying a country, and list all countries and capitals.
    public static void main(String[] args) {
        try {
            HashMap<String, String> countryCapitals = new HashMap<String, String>();

            // Adding key/value pairs to TreeMap
            countryCapitals.put("India", "Delhi");
            countryCapitals.put("Australia", "Sydney");
            countryCapitals.put("Thailand", "Bangkok");
            countryCapitals.put("Nepal", "Kathmandu");
            countryCapitals.put("USA","Washington DC");
            countryCapitals.put("United Kingdom","London");

            // Iterating over TreeMap
            System.out.println("Iteration of HashMap");
            for (Map.Entry<String, String> cc : countryCapitals.entrySet()) {
                System.out.println(cc.getKey() + ":  " + cc.getValue());
            }
            System.out.println();
            //retrieve capitals by specifying a country using get() method
            System.out.println("Capital of India using get() method : "+countryCapitals.get("India"));


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
