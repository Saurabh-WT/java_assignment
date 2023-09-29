package Day9_10;

import java.util.ArrayList;
import java.util.Iterator;

//Exercise 2: ArrayList Operations
//Develop a Java program that simulates a to-do list using an
// ArrayList. Implement functions to add, remove, and list tasks. Each task should have a name and a priority level.
public class Exercise_2 {
    public static void main(String[] args) {
        try {
            ArrayList<String> al = new ArrayList<>();

            //add the tasks
            al.add("go to school");
            al.add("reach home");
            al.add("complete the assignment");
            al.add("make your dinner");
            al.add("go for a night walk");

            //remove the task
            al.remove(4);
            //al.remove(5);

            //iterating over the array list using iterator()
            Iterator it = al.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e.getLocalizedMessage());
        }

    }
}
