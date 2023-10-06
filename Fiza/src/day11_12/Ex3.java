package day11_12;

import java.util.ArrayList;
import java.util.ListIterator;

//3. Manipulating Lists:
//Write a program that starts with an ArrayList of integers.
// Add 5 elements, update the value of the third element, and then remove the second element.
public class Ex3 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};

        //adding the 5 elements in array list
        ArrayList<Integer> al = new ArrayList<>();
        for(int e : a){
            al.add(e);
        }

        //updating the 3rd element value
        al.set(2, 6);
        //removing the second element
        al.remove(1);
        System.out.println(al);
    }
}
