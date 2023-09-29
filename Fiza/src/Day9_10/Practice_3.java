package Day9_10;

import java.util.ArrayList;
import java.util.LinkedList;

//Exercise 3: List Comparison
//Develop a Java program that demonstrates the differences
// between ArrayList and LinkedList in terms of performance for various operations (e.g., adding, removing).
public class Practice_3 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();

        //add function in ArrayList
        //This method is used to add an element at the end of the ArrayList.
        //TIME COMPLEXITY : O(1)
        al.add(100);
        al.add(200);
        System.out.println(al);

        //add function in LinkedList
        //This method Appends the specified element to the end of this list. Throws exception when element cannot be added to the list.
        //TIME COMPLEXITY : O(1)
        ll.add(10);
        ll.add(20);
        System.out.println(ll);

        //GET FUNCTION IN ARRAY LIST
        //TIME COMPLEXITY O(1)
        System.out.println(al.get(0));

        //GET FUNCTION IN LINKED LIST
        //TIME COMPLEXITY: O(N)
        System.out.println(ll.get(1));

        //SET FUNCTION IN ARRAY LIST
        //TIME COMPLEXITY: O(1)
        System.out.println(al.set(1, 300));

        //SET FUNCTION IN LINKED LIST
        //TIME COMPLEXITY: O(N) OTHER THAN HEAD ELEMENT
        System.out.println(ll.set(1,30));

        //REMOVE FUNCTION IN ARRAYLIST
        //TIME COMPLEXITY: O(1)
        System.out.println(al.remove(1));

        //REMOVE FUNCTION IN LINKED LIST
        //TIME COMPLEXITY: O(N)
        System.out.println(ll.remove(1));


    }
}
