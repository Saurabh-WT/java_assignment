import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciseSeven {
    //7. Multiple Exceptions:
    //Create a program that performs a mathematical operation based on user input. Handle both arithmetic exceptions
    // and input mismatch exceptions.

    public static void main(String[] args) {


        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an integer :");
            int n = sc.nextInt();
            System.out.println("You've entered " + n);

        }catch (InputMismatchException e) {
            System.err.println("Please enter an integer ");
        }

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first num");
            int a = sc.nextInt();
            System.out.println("Enter second num(enter zero for error)");
            int b = sc.nextInt();
            System.out.println("a/b = " + a / b);

        } catch (ArithmeticException e) {
            System.err.println("User is trying to go to infinity, hold your brakes and stay in limit with numbers or either you are making arithmetic error");
        }
    }
}
