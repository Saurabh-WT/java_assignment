package Day9_10;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;

//Exercise 3: LinkedList Exploration
//Create a Java program that explores LinkedList.
// Compare its performance with ArrayList for inserting and deleting elements at various positions in the list.
public class Exercise_3 {

    public static void main(String[] args) {
        try {

            //create a linked list
            LinkedList<Integer> list = new LinkedList<Integer>();

            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);

            //create an array list
            ArrayList<Integer> al = new ArrayList<Integer>();
            al.add(10);
            al.add(20);
            al.add(30);
            al.add(40);
            al.add(50);

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
            //TIME COMPLEXITY IS O(1)
            al.add(60);

            //inserting an element in array list at last
            //TIME COMPLEXITY IS O(1)
            list.addLast(60);

            //remove function in linked list without any parameters remove the first item
            //list.remove();

            //iterating over the list
            for(int i:list){
                System.out.print(i+" ");
            }

            System.out.println();

            //iterating over the array
            for(int i:al){
                System.out.print(i+" ");
            }
        }
        catch (ConcurrentModificationException e){
            System.out.println(e.getLocalizedMessage());
        }
        catch (NullPointerException e){
            System.out.println(e.getLocalizedMessage());
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bound Exception");
            System.out.println(e.getLocalizedMessage());
        }
    }
}
