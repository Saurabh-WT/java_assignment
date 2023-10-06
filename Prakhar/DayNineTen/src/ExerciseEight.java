import java.util.*;

public class ExerciseEight {
//    Exercise 8: ArrayList vs. LinkedList Performance
//    Write a Java program that measures and compares the time it takes to perform various operations (e.g., add,
//    remove, search) on ArrayList and LinkedList for a large dataset.

    public static void main(String[] args) {
        try {
            int num = 100000; // Number of elements to work with

            // Create ArrayList and LinkedList
            ArrayList<Integer> arrayList = new ArrayList<>();
            LinkedList<Integer> linkedList = new LinkedList<>();

            // Measure the time taken to add elements at the end
            long startTime = System.nanoTime();
            for (int i = 0; i < num; i++) {
                arrayList.add(i);
            }
            long endTime = System.nanoTime();
            long arrayListAddTime = endTime - startTime;

            startTime = System.nanoTime();
            for (int i = 0; i < num; i++) {
                linkedList.add(i);
            }
            endTime = System.nanoTime();
            long linkedListAddTime = endTime - startTime;

            System.out.println("Time taken to add " + num + " elements at the end:");
            System.out.println("ArrayList: " + arrayListAddTime + " ns");
            System.out.println("LinkedList: " + linkedListAddTime + " ns");

            // Measure the time taken to iterate through elements
            startTime = System.nanoTime();
            for (Integer nums : arrayList) {
                // Iterating through the ArrayList without performing any operation
            }
            endTime = System.nanoTime();
            long arrayListIterateTime = endTime - startTime;

            startTime = System.nanoTime();
            for (Integer nums : linkedList) {
                // Iterating through the LinkedList without performing any operation
            }
            endTime = System.nanoTime();
            long linkedListIterateTime = endTime - startTime;

            System.out.println("\nTime taken to iterate through " + num + " elements:");
            System.out.println("ArrayList: " + arrayListIterateTime + " ns");
            System.out.println("LinkedList: " + linkedListIterateTime + " ns");

            // Measure the time taken to remove elements from the beginning
            startTime = System.nanoTime();
            for (int i = 0; i < num; i++) {
                arrayList.remove(0);
            }
            endTime = System.nanoTime();
            long arrayListRemoveTime = endTime - startTime;

            startTime = System.nanoTime();
            for (int i = 0; i < num; i++) {
                linkedList.remove(0);
            }
            endTime = System.nanoTime();
            long linkedListRemoveTime = endTime - startTime;

            System.out.println("\nTime taken to remove " + num + " elements from the beginning:");
            System.out.println("ArrayList: " + arrayListRemoveTime + " ns");
            System.out.println("LinkedList: " + linkedListRemoveTime + " ns");


        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
