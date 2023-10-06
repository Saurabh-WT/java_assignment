import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class ExerciseFour {
    //            4. Updating Elements:
//    Create a LinkedList of characters. Use a ListIterator to iterate through the list and replace every vowel with
//    an asterisk '*'.
    public static void main(String[] args) {
        try {
            LinkedList<Character> charList = new LinkedList<>();

            //Adding elements int the list
            charList.add('g');
            charList.add('w');
            charList.add('r');
            charList.add('f');
            charList.add('F');
            charList.add('e');
            charList.add('x');
            charList.add('J');
            charList.add('g');
            charList.add('H');
            charList.add('A');
            System.out.println("\nLinkedList of characters(hard coded) after adding elements : " + charList);



            Character tempChar;
            ListIterator<Character> it = charList.listIterator();
            while (it.hasNext()) {
                tempChar = it.next();
                if (tempChar.equals('a')||tempChar.equals('A') || tempChar.equals('e')||tempChar.equals('E') || tempChar.equals('i') ||tempChar.equals('O')|| tempChar.equals('o') || tempChar.equals('u')||tempChar.equals('U')){
                    it.set('*');
                }
            }
            System.out.println("\nLinkedList of characters after updating vowels to '*' : " + charList);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
