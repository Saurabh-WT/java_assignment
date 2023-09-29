public class ExerciseOne {
    //    Exercise 1: Array Manipulation
//    Write a Java program that finds the sum and average of elements in an integer array. Allow the user to input
//    the array's size and elements.
    public static void main(String[] args) {
        try {
            int[] arr = {108, 207, 304, 480, 660};
            System.out.print("Array elements: ");
            for (int num : arr) {
                System.out.print(" " + num + " ");
            }
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            double avg = (double) sum / arr.length;
            System.out.println();
            System.out.println("Sum: " + sum + " Average:" + avg);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
