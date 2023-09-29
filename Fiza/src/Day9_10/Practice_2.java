package Day9_10;

import java.util.ArrayList;

//Exercise 2: ArrayList Implementation
//Create a program that maintains a list of student names using ArrayList.
// Implement functions to add, remove, and display students.
public class Practice_2 {
    public static void main(String[] args) {
        try {
            ArrayList<String> student = new ArrayList<String>();
            student.add("student1");
            student.add("student2");
            student.add("student3");
            student.add("student4");

            //updating the arraylist
            student.set(0, "fiza");
            student.set(1, "Esha");
            student.set(2, "Divyansh");
            student.set(3, "Sorav");

            //deleting the array list elements
            student.remove(0);
            student.remove(2);

            //printing the array list
            System.out.println(student);
            System.out.println(student.contains("Esha"));
        }
        catch (IndexOutOfBoundsException e){

            System.out.println(e.getLocalizedMessage());
        }


    }
}
