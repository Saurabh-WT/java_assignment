package day11_12;

import java.util.Scanner;

//8. Custom Exception:
//Define a custom exception class called NegativeNumberException. Modify a program to throw this exception when it encounters a negative number.
public class Ex8 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any integer");
            int n = sc.nextInt();
            if (n < 0) {
                throw new NegativeNumberException("Negative number entered");
            }
            System.out.println("testing...");
        }
        catch (NegativeNumberException e){
            System.err.println(e.getMsg());
        }
}
static class NegativeNumberException extends Exception{
        String s;
        public NegativeNumberException(String s){
            this.s=s;

        }
        public String getMsg(){
            return s;
        }
    }
}
