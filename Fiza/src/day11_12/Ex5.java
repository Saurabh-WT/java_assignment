package day11_12;

import java.util.*;

//5. Concurrent Modification:
//Investigate and explain what happens if you try to add or
// remove elements from a collection while iterating through it using an enhanced for loop.
public class Ex5 {
    public static void main(String[] args) {

            List<Integer> al = new ArrayList<>();
            al.add(10);
            al.add(20);
            al.add(30);
            al.add(40);
            al.add(10);
            al.add(20);
            al.add(30);
            al.add(40);

            try {
                for (Integer e : al) {
                    al.remove(3);
                }
                throw new ConcurrentModificationException("Concurrent modification exception");
            }
            catch (ConcurrentModificationException e){
                //System.out.println("ConcurrentModificationException is thrown");
                System.err.println(e.getLocalizedMessage()+" Concurrent modification exception");
            }
        //using the iterator method to remove or update element in any collection will not throw concurrent modification exception
        try {
            Iterator<Integer> it = al.iterator();
            while (it.hasNext()) {
                int x = (Integer) it.next();
                if (x == 20) {
                    it.remove();
                }
            }
            System.out.println(al);
        }
        catch (Exception e){
            System.err.println("Exception caught");
        }

    }

}

