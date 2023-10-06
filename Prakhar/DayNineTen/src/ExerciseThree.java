import java.util.*;

public class ExerciseThree {
    //    Exercise 3: LinkedList Exploration
//    Create a Java program that explores LinkedList. Compare its performance with ArrayList for inserting and
//    deleting elements at various positions in the list.
    public static void main(String[] args) {
        try {
            LinkedList<String> linkedList = new LinkedList<>();

            // Adding elements
            linkedList.add("Yogesh"); // Adds to the end
            linkedList.addFirst("Prakhar"); // Adds to the beginning Time Complexity: O(1)
            linkedList.addLast("Ayush"); // Adds to the end Time Complexity: O(1)
            linkedList.add(1, "Vishwamitra"); // Inserts at index 1 Time Complexity: O(n)

            linkedList.add("Arif");
            linkedList.add("fiza");
            linkedList.add("Vishwajeet");
            linkedList.add("Zeeshan");



            // Display the LinkedList

            System.out.println("LinkedList after adding elements:");
            for (String elem : linkedList) {
                System.out.println(elem);
            }

            // Removing elements
            linkedList.remove(); // Removes and returns the first element Time Complexity: O(1)
            linkedList.removeFirst(); // Removes and returns the first element Time Complexity: O(1)
            linkedList.removeLast(); // Removes and returns the last element
//            linkedList.remove(0); // Removes the element at index 1 Time Complexity: O(n)

            // Display the LinkedList after removal
            System.out.println("\nLinkedList after removing elements:");
            for (String ele : linkedList) {
                System.out.println(ele);
            }


            System.out.println("\nDoes LinkedList contain 'Yogesh'? " + linkedList.contains("Yogesh"));// contains(element) Time Complexity: O(n)
            System.out.println("Index of 'Ayush': " + linkedList.indexOf("Ayush"));//Time Complexity: O(n) in the worst case
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
