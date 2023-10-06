package Day9_10;

import java.util.*;

//Exercise 9: Set Intersection
//Design a Java program that finds the intersection of
// two sets of integers using HashSet. Allow users to input the sets and display the common elements.
public class Exercise_9 {
    public static void main(String[] args) {
        try {
            Set<Integer> s1 = new HashSet<>();
            Set<Integer> s2 = new HashSet<>();

            s1.add(10);
            s1.add(20);
            s1.add(30);
            s1.add(60);

            s2.add(10);
            s2.add(50);
            s2.add(20);
            s2.add(40);

            s1.retainAll(s2);

            Iterator<Integer> it = s1.iterator();
            while (it.hasNext()){
                System.out.print(it.next()+" ");
            }
        }
        catch (Exception e){
            System.out.println("Caught exception");
            System.out.println(e.getLocalizedMessage());
        }
    }
}
