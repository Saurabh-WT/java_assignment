package Day9_10;

import java.util.*;
import java.util.stream.Collectors;

//Exercise 4: Unique Numbers Set
//Design a Java program that accepts a list of numbers and uses a HashSet to remove duplicates, displaying the unique numbers.
public class Exercise_4 {
    public static void main(String[] args) {
        try {
            //Integer[] array = {10, 10, 20, 30, 30};
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements to be stored in a list");
            int n = sc.nextInt();
            Integer arr[] = new Integer[n];

                for(int i =0; i<n; i++){
                    System.out.println("Enter the "+i+" element: ");
                    arr[i] = sc.nextInt();
                }
           
            //passing array as a list in hashset
            HashSet<Integer> h1 = new HashSet<>(Arrays.asList(arr));
            //Using iterator
            Iterator it = h1.iterator();

            while(it.hasNext()){

                System.out.print(it.next()+" ");

            }
            System.out.println();
            //Using streams
            HashSet<Integer> set = new HashSet<>(Arrays.stream(arr).collect(Collectors.toSet()));

            System.out.println("Set: " + set);

        } catch (RuntimeException e) {

            System.out.println(e.getLocalizedMessage());

        }
    }
}

