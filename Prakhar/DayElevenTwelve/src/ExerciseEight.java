public class ExerciseEight {
    //8. Custom Exception:
    //Define a custom exception class called NegativeNumberException. Modify a program to throw this exception when
    // it encounters a negative number.
    public static void main(String[] args) {
        try {
            processPositiveNumber(5);
            processPositiveNumber(-2);
        } catch (NegativeNumberException e) {
            System.err.println("Negative Number Exception: " + e.getMessage());
        }
    }
    public static void processPositiveNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers not allowed.");
        }
        System.out.println("Processed positive number: " + number);
    }
}
