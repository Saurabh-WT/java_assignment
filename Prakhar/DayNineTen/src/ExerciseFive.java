import java.util.*;

public class ExerciseFive {
    //    Exercise 5: Sorting TreeSet
//    Write a Java program that uses a TreeSet to store a list of words and displays them in alphabetical order.
    public static void main(String[] args) {
        try {
            Set<String> tSet = new TreeSet<>();

            // Add words to the TreeSet
            tSet.add("apple");
            tSet.add("banana");
            tSet.add("cherry");
            tSet.add("avocado");
            tSet.add("australia");

            // Display words in alphabetical order
            System.out.println("Words in alphabetical order:");
            for (String word : tSet) {
                System.out.print(" " + word + " ");
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
