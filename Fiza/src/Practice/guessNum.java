package Practice;


import java.util.Random;
import java.util.Scanner;

public class guessNum {
    public static void main(String[] args) {
        int correct;
        Scanner sc = new Scanner(System.in);
        int guess;
        Random r= new Random();
        correct = r.nextInt(10);
        do{
            guess = sc.nextInt();
            if(guess<0 || guess>10){
                System.out.println("Invalid Input");
            } else if (guess<correct) {
                System.out.println("Guess a larger number");
            }
            else{
                System.out.println("Guess a smaller number");
            }
        }
        while (guess!=correct);
        System.out.println("correct");
    }
}
