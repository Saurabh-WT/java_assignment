package day11_12;

import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//4. Updating Elements:
//Create a LinkedList of characters. Use a ListIterator to iterate through the list and replace every vowel with an asterisk '*'.
public class Ex4 {

    public static void main(String[] args) {
        try {
            List<Character> ll = new LinkedList<>();
            ll.add('a');
            ll.add('b');
            ll.add('c');
            ll.add('d');
            ll.add('e');
            ll.add('f');
            ll.add('g');
            ll.add('h');
            ll.add('i');
            ll.add('k');
            ll.add('o');
            ll.add('u');


            ListIterator<Character> li = ll.listIterator();
            while (li.hasNext()) {
                char c = li.next();
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    li.set('*');
                }
            }
            System.out.println("Replaced all the vowels with an asterick * : " + ll);

        }
        catch (ConcurrentModificationException e){
            System.out.println(e.getLocalizedMessage());
        }
        catch (RuntimeException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
