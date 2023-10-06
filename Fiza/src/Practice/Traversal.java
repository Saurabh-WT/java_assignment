package Practice;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Traversal {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println(l.get(0));
        l.indexOf(30);
        Iterator it = l.iterator();
        while (it.hasNext()){
            System.out.println(it.next()+" ");
        }
        }
    }

