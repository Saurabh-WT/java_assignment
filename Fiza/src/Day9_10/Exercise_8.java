package Day9_10;

import java.util.ArrayList;
import java.util.LinkedList;

//Exercise 8: ArrayList vs. LinkedList Performance
//Write a Java program that measures and compares the time it takes to
// perform various operations (e.g., add, remove, search) on ArrayList and LinkedList for a large dataset.
public class Exercise_8 {
    public static void main(String[] args) {
        try {
            //create a linked list
            LinkedList<Integer> list = new LinkedList<Integer>();

            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            list.add(80);
            list.add(90);

            //create an array list
            ArrayList<Integer> al = new ArrayList<Integer>();
            al.add(10);
            al.add(20);
            al.add(30);
            al.add(40);
            al.add(50);
            al.add(70);
            al.add(90);

            //inserting an element in array list at beginning
            //TIME COMPLEXITY IS O(N)
            al.add(0, 15);

            //inserting an element in linked list at beginning
            //TIME COMPLEXITY IS O(1)
            list.addFirst(15);

            //inserting an element in array list in between
            //TIME COMPLEXITY IS O(N)
            al.add(1, 15);

            //inserting an element in linked list in between
            //TIME COMPLEXITY IS O(N)
            list.add(1, 15);

            //deleting an element from the array list in between
            //TIME COMPLEXITY IS O(N)
            al.remove(3);

            //deleting an element from the linked list in between
            //TIME COMPLEXITY IS O(N)
            list.remove(3);

            //inserting an element in array list at last
            //TIME COMPLEXITY IS O(1) WHICH IS AMORTIZED
            al.add(60);

            //inserting an element in array list at last
            //TIME COMPLEXITY IS O(1)
            list.addLast(60);

            //searching an element in array list
            //TIME COMPLEXITY IS O(N)
            System.out.println(al.contains(10));
            System.out.println(al.get(2));

            //searching an element in linked list
            //TIME COMPLEXITY IS O(N)
            System.out.println(list.contains(10));
            System.out.println(list.get(2));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e.getLocalizedMessage());
        }
        catch (NullPointerException e){
            System.out.println(e.getLocalizedMessage());
        }

    }
}
