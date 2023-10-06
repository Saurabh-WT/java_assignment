import java.util.*;

public class ExerciseOne {
//    1. Enhanced for Loop:
//    Write a program that uses an enhanced for loop to iterate through an ArrayList of strings and prints each element.

    public static void main(String[] args) throws Throwable {
        try {
            ArrayList<Integer> list = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            System.out.print("How many input you want to enter in an arraylist: ");
            int  oldNum, choice = sc.nextInt();
            Integer temp;
            System.out.println("Enter all " + choice + " Integer elements : ");
            for (int i = 0; i < choice; i++) {
                temp = sc.nextInt();
                list.add(temp);
            }
            ListIterator<Integer> it = list.listIterator();
            boolean flag=false;
            while (true) {
                System.out.println("\nEnter 1 for add\nEnter 2 for update \nEnter 3 for show the list \nEnter 4 for " +
                        "removing\nEnter 5 to exit()");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter the number to add: ");
                        temp = sc.nextInt();
                        list.add(temp);
                        System.out.println("Number added successfully");
                        break;
                    case 2:
//                        sc.nextLine();
                        it = list.listIterator();
                        flag=false;
                        System.out.print("Enter the number to update: ");
                        oldNum = sc.nextInt();
                        System.out.print("Enter the number to be updated: ");
                        temp = sc.nextInt();
                        while (it.hasNext()) {
                            if (it.next()==oldNum) {
                                it.set(temp);
                                flag=true;
                                break;
                            }
                        }
                        if(flag==false) System.out.println("Number not found");
                        else System.out.println("Number updated successfully");
                        break;
                    case 3:
                        it = list.listIterator();
                        System.out.print("All Elements using iterator: ");
                        while (it.hasNext()) {
                            System.out.print(" " + it.next() + " ");
                        }
                        break;
                    case 4:
//                        sc.nextLine();
                        it = list.listIterator();
                        flag=false;
                        System.out.print("Enter the number to Remove: ");
                        oldNum = sc.nextInt();
                        while (it.hasNext()) {
                            if (it.next()==oldNum) {
                                it.remove();
                                flag=true;
                                break;
                            }
                        }
                        if(flag==false) System.out.println("Number not found");
                        else System.out.println("Number removed succesfully");
                        break;
                    case 5:
                        System.out.println("\nExiting..........");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Enter only Integer type");
        } catch (Exception e) {
            throw new RuntimeException(e + " Exception Found");
        }
    }
}
