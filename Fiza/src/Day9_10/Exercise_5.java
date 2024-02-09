package Day9_10;
//Exercise 5: Sorting TreeSet
//Write a Java program that uses a TreeSet to store a list of words and displays them in alphabetical order.
import java.util.*;
import java.util.stream.Stream;
public class Exercise_5 {
    public static void main(String[] args) {
        try {

            TreeSet<String> t = new TreeSet<>();

            t.add("Banana");
            t.add("Apple");
            t.add("Dog");
            t.add("Cat");
            t.add("Fox");

            //using iterator method to traverse through the treeset
            Iterator it = t.iterator();

            while (it.hasNext()){
                System.out.print(it.next()+" ");
            }
            System.out.println();

            //converting tree set to stream
            Stream<String> stream = t.stream();
            //method reference
            stream.forEach(System.out::println);
        }
        catch (NullPointerException e) {
            System.out.println(e.getLocalizedMessage());
            throw new RuntimeException(e);
        }
        catch (RuntimeException e){
            System.out.println(e.getLocalizedMessage());
        }

    }

}
