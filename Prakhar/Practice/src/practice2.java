import java.util.Random;
import java.util.Scanner;

public class practice2 {
    //    Develop a Java program for a number guessing game. Generate a random number between 1  and 100.
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner sc= new Scanner(System.in);
        int randNum= rand.nextInt(100);
        int guessNum;
        System.out.println("Random Number: "+randNum);
        do{
            System.out.println("Type your guess number: ");
            guessNum=sc.nextInt();

            if(guessNum>100 || guessNum<=0){
                System.out.println("Please Type number between 1 to 100");
            }else {
                if(guessNum>randNum){
                    System.out.println("Guess number is larger than the random number");
                }else if(guessNum<randNum){
                    System.out.println("Guess number is smaller than the random number");
                }
            }
        }while(randNum!=guessNum);
        System.out.println("Congratulation you guess the correct answer");

    }
}
