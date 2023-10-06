import java.util.MissingFormatArgumentException;

public class ExerciseTen {
    //10. Exception Propagation:
    //Create a program with multiple methods. In each method, introduce a different type of exception. Observe how
    // exceptions propagate up the call stack and handle them at an appropriate level.
    public static void main(String[] args) {
        try {
            method_A();
        } catch (ArithmeticException e) {
            System.err.println(e.getLocalizedMessage() + " Arithmetic exception caught");
            e.printStackTrace();//printed this to find the stack trace(source of error)
        }
    }

    static void method_A() {
        try {
            System.out.println("Entered method A");
            method_B();
        } catch (MissingFormatArgumentException e) {
            System.out.println("Exception caught");
        }

    }

    static void method_B() {
        try {
            System.out.println("Entered method B");
            method_C();
        } catch (TypeNotPresentException e) {
            System.out.println("Exception caught");
        }
    }

    static void method_C() {
        System.out.println("Entered method C");
        int a = 4;
        int b = 0;
        int result = a / b;

    }
}
