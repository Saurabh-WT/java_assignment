import java.util.*;

public class ArrayListVsLinkedListPerformance {
    public static void main(String[] args) {
        int n = 100000; // Number of elements to work with

        // Create ArrayList and LinkedList
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Measure the time taken to add elements at the end
        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long arrayListAddTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        long linkedListAddTime = endTime - startTime;

        System.out.println("Time taken to add " + n + " elements at the end:");
        System.out.println("ArrayList: " + arrayListAddTime + " ns");
        System.out.println("LinkedList: " + linkedListAddTime + " ns");

        // Measure the time taken to remove elements from the beginning
        startTime = System.nanoTime();
        while (!arrayList.isEmpty()) {
            arrayList.remove(0);
        }
        endTime = System.nanoTime();
        long arrayListRemoveTime = endTime - startTime;

        startTime = System.nanoTime();
        while (!linkedList.isEmpty()) {
            linkedList.remove(0);
        }
        endTime = System.nanoTime();
        long linkedListRemoveTime = endTime - startTime;

        System.out.println("\nTime taken to remove " + n + " elements from the beginning:");
        System.out.println("ArrayList: " + arrayListRemoveTime + " ns");
        System.out.println("LinkedList: " + linkedListRemoveTime + " ns");

        // Measure the time taken to iterate through elements
        startTime = System.nanoTime();
        for (Integer num : arrayList) {
            // Iterating through the ArrayList without performing any operation
        }
        endTime = System.nanoTime();
        long arrayListIterateTime = endTime - startTime;

        startTime = System.nanoTime();
        for (Integer num : linkedList) {
            // Iterating through the LinkedList without performing any operation
        }
        endTime = System.nanoTime();
        long linkedListIterateTime = endTime - startTime;

        System.out.println("\nTime taken to iterate through " + n + " elements:");
        System.out.println("ArrayList: " + arrayListIterateTime + " ns");
        System.out.println("LinkedList: " + linkedListIterateTime + " ns");
    }
}
