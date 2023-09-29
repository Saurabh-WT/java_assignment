package Day9_10;

import java.util.Map;
import java.util.TreeMap;

//Exercise 7: TreeMap Practice
//Develop a program that uses a TreeMap to maintain a list of
// books and their authors. Allow users to add books and authors and display the list in alphabetical order of book titles.
public class Exercise_7 {
    public static void main(String[] args) {
        try {

            TreeMap<String, String> t = new TreeMap<>();
            t.put("A Place Called Home", "Preeti Shenoy");
            t.put("Relentless", "Yashwant Sinha");
            t.put("Legacy of Learning", "Savita Chhabra");
            t.put("The Ickabog", "J.K Rowling");

            //Iterating over the list of treemap
            for (Map.Entry<String, String> i : t.entrySet()) {
                System.out.println(i.getKey() + " :  " + i.getValue());
            }
        }
        catch (NullPointerException e){
            System.out.println(e.getLocalizedMessage());
        }
        catch (RuntimeException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
