package Practice;

import java.util.*;

public class Iterators {
    public static void main(String[] args) {
        List<Integer> c = Arrays.asList(10,20,30,40,50);

        //Using enhanced for loop
        for(Integer x: c){
            System.out.print(x+" ");
        }

        //Using forEach method
        System.out.println();
        //al.forEach(x-> System.out.print(x+" "));
        c.forEach(System.out::println);

        //Using iterators
        Iterator<Integer> it = c.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }

        System.out.println("After updating elements");
        //updating the list elements using iterator
        ListIterator<Integer> li = c.listIterator();
        while (li.hasNext()){
            int x = li.next();
            li.set(x*2);
        }
        System.out.println(c);

        System.out.println("After removing elements");
        Iterator<Integer> r =c.iterator();
        while (r.hasNext()){
            int x = r.next();
            if(x<20){
                r.remove();
            }
            else {
                System.out.print(x+" ");
            }
        }

    }

}
