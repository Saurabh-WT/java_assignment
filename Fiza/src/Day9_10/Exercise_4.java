package Day9_10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

//Exercise 4: Unique Numbers Set
//Design a Java program that accepts a list of numbers and uses a HashSet to remove duplicates, displaying the unique numbers.
public class Exercise_4 {
    public static void main(String[] args) {
        try {
            Integer[] array = {10, 10, 20, 30, 30};
            //passing array as a list in hashset
            HashSet<Integer> h1 = new HashSet<>(Arrays.asList(array));
            //Using iterator
            Iterator it = h1.iterator();

            while(it.hasNext()){

                System.out.print(it.next()+" ");

            }
            System.out.println();
            //Using streams
            HashSet<Integer> set = new HashSet<>(Arrays.stream(array).collect(Collectors.toSet()));

            HashSet<List<Integer>> h = new HashSet<>();

            System.out.println("Set: " + set);

        } catch (RuntimeException e) {

            System.out.println(e.getLocalizedMessage());

        }
    }
}

