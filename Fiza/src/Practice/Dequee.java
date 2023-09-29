package Practice;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Dequee {
        public static void main(String[] args) {
        Deque<Integer> d=new LinkedList<>();
//        d.offerFirst(10);
//        d.offerLast(20);
//        d.offerFirst(5);
//        d.offerLast(15);
                d.element();

                Iterator it = d.descendingIterator();
                while (it.hasNext()){
                        System.out.println(it.next());
                }
        }

}
