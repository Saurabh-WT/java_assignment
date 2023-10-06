import java.util.ArrayList;
import java.util.Random;

public class ExerciseThree {
    //            3. Manipulating Lists:
//    Write a program that starts with an ArrayList of integers. Add 5 elements, update the value of the third element, and then remove the second element.
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Random rand=new Random();
        //Generating five random input
        for (int i=0;i<5;i++)  list.add(rand.nextInt(100));


        //printing the arraylist
        System.out.println("\nArraylist after adding 5 element: "+list);

        //Updating the value of the third element(index 2) to 10,  " \u001B[1m " it is used to make a bold text, just trying something
        list.set(2,10);
        System.out.println("\nArraylist after updating the value of the 3rd element(index 2) to "+"\u001B[1m 10"+" : "+list);

        //removing the second(index 1) element
        list.remove(1);
        System.out.println("\nArraylist after removing the value of the 2nd element(index 1) : "+list);


    }
}
