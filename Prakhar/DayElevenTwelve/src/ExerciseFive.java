import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.Scanner;

public class ExerciseFive {
    //            5. Concurrent Modification:
//    Investigate and explain what happens if you try to add or remove elements from a collection while iterating
//    through it using an enhanced for loop.
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(60);
        list.add(70);
        list.add(60);
        list.add(80);

        System.out.println("List after adding elements: "+list);
        try {
            ListIterator<Integer> it = list.listIterator();
            System.out.println("\n we can safely remove element using iterator  ");


                while (it.hasNext()) {
                    int x = (int) it.next();
                    if (x == 30) {
                        it.remove();
                    }
                }

            System.out.println("List after updating elements: "+list);

            System.out.println("testing");

            for (int num:list) {
                if(num==40) list.add(20);
            }

        } catch (ConcurrentModificationException e) {
            System.err.println("AS WE CAN SEE IF WE TRY TO ADD OR REMOVE ELEMENT IN ENHANCED FOR EACH LOOP IT THROW "+e);
//            throw new ConcurrentModificationException(e+"  ");
        }catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
