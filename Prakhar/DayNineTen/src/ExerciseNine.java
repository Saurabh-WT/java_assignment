import java.util.*;

public class ExerciseNine {
    //    Exercise 9: Set Intersection
//    Design a Java program that finds the intersection of two sets of integers using HashSet. Allow users to input
//    the sets and display the common elements.
    public static void main(String[] args) {
        try {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the first 5 set of numbers: ");
            for (int i=0; i < 5; i++){
                int x = sc.nextInt();
                set1.add(x);
            }

            System.out.println("Enter the second 5 set of numbers: ");
            for (int i=0; i < 5; i++){
                int x = sc.nextInt();
                set2.add(x);
            }

            set1.retainAll(set2);
            System.out.print("Common Elements: ");
            for (Integer integer : set1) {
                System.out.print(integer + " ");
            }
        }catch (InputMismatchException e) {
            System.out.println("Invalid Input, Type integer type");
        } catch (Exception e) {
            System.out.println("Caught exception");
            System.out.println(e.getLocalizedMessage());
        }

    }
}
