package day11_12;
//Create a program that demonstrates iterating through a list using different methods and manipulates its
// elements by adding, updating, and removing items.
import java.util.*;

public class Practice_1 {
    public static void main(String[] args) {
        try {

            List<Integer> al = new ArrayList<>();
            Integer[] temp = {10, 20, 30, 40, 50, 60, 70, 80};
            al.addAll(Arrays.asList(temp));

            System.out.println("Printing elements using for each loop");
            //using for each loop
            for (int num : al) {
                System.out.print(num + " ");

            }
            System.out.println();
            System.out.println("Printing elements using iterator");
            //using iterator to print list
            ListIterator li = al.listIterator();

            while (li.hasNext()) {
                System.out.print(li.next() + " ");
            }
            System.out.println();

            //using for each method to iterate
            System.out.println("Printing elements using for each method");
            al.forEach(x -> System.out.print(x + " "));
            System.out.println();

            System.out.println("Updating the array list elements");
            //using list iterator to update the elements
            ListIterator lu = al.listIterator();
            while (lu.hasNext()) {
                int x = (Integer) lu.next();
                lu.set(x * 2);
            }
            System.out.print(al + " ");

            System.out.println();
            //using iterator to remove elements
            ListIterator lr = al.listIterator();
            while (lr.hasNext()) {
                Integer num = (Integer) lr.next();
                if (num < 80) {
                    lr.remove(); // Remove the element
                }
            }
            System.out.println("After removal of elements");
            System.out.print(al + " ");
        }
        catch (ConcurrentModificationException e){
            System.out.println(e.getLocalizedMessage());
        }
        catch (RuntimeException e){
            System.out.println(e.getLocalizedMessage());
        }

    }

}
