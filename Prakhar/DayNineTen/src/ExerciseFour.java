import java.util.*;

public class ExerciseFour {
    //    Exercise 4: Unique Numbers Set
//    Design a Java program that accepts a list of numbers and uses a HashSet to remove duplicates, displaying the
//    unique numbers.
    public static void main(String[] args) {
        try{
            HashSet<Integer> numbers = new HashSet<Integer>();


            // Adding numbers to a HashSet
            System.out.println("Adding numbers to a HashSet");
            numbers.add(10);
            numbers.add(20);
            numbers.add(30);
            numbers.add(10);//adding duplicate
            numbers.add(40);
            numbers.add(20);//adding duplicate
            numbers.add(50);

            System.out.println(numbers);
            System.out.println("HashSet by default stores unique entities");
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
