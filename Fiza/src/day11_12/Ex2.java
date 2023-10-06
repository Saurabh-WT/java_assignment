package day11_12;

import java.util.*;

//2. Iterator Usage:
//Create a HashSet of integers. Use an iterator to iterate through the set and remove any element greater than 10.
public class Ex2 {
    public static void main(String[] args) {
        try {

            List<Integer> l = Arrays.asList(1, 2, 3, 4, 10, 11, 12, 8);
            HashSet<Integer> hs = new HashSet<>(l);
            Iterator it = hs.iterator();
            while (it.hasNext()) {
                int x = (Integer) it.next();
                //removing element greater than 10
                if (x > 10) {
                    it.remove();
                }
            }

            System.out.println(hs);
        }
        catch (ConcurrentModificationException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
