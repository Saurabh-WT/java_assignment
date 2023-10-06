import java.util.*;

public class ExerciseTwo {
    //            2. Iterator Usage:
//    Create a HashSet of integers. Use an iterator to iterate through the set and remove any element greater than 10.
    public static void main(String[] args) {
        try {
            HashSet<Integer> list = new HashSet<>();

            Scanner sc = new Scanner(System.in);
            System.out.print("How many input you want to add to a hashset: ");
            int temp, choice = sc.nextInt();


            //Take input of elements
            System.out.println("Enter all " + choice + " Integer elements  : ");
            for (int i = 0; i < choice; i++) {
                temp = sc.nextInt();
                list.add(temp);
            }

            Iterator<Integer> it = list.iterator();
            System.out.print("All hashset elements(unique) using iterator: ");
            while (it.hasNext()) {
                System.out.print(" " + it.next() + " ");
            }

            //removing element greater than 10
            it = list.iterator();
            while (it.hasNext()) {
                if(it.next()>10) it.remove();
            }

            it = list.iterator();
            System.out.print("\n\nAll Elements after removing elements greater than 10 : ");
            while (it.hasNext()) {
                System.out.print(" " + it.next() + " ");
            }


        } catch (InputMismatchException e) {
            System.out.println();

            throw new InputMismatchException("Enter only Integer type");
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
