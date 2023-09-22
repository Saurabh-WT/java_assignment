package DayFiveSix;

import java.util.Scanner;

class BankAccount{
    Scanner sc= new Scanner(System.in);
    String name;
    int account_num;
    double balance;
    BankAccount(String name, int account_num, int balance){
        this.name = name;
        this.account_num=account_num;
        this.balance=balance;
    }
    public void deposit(){
        System.out.println("Enter the amount to be deposited");
        double amt = sc.nextDouble();
        balance=balance+amt;
        System.out.println(name+" your updated balance of account number "+account_num+" is "+balance);
    }
    public void withdraw(){
        System.out.println("Enter amount to be withdrawn");
        double amt = sc.nextDouble();
        if(amt>0){
            if(balance>=amt) {

                balance = balance - amt;
                System.out.println("Dear " + name + " your current balance of account number " + account_num + " is = " + balance);
            }
            else if(balance<amt){
                System.out.println(name+" you have Insufficient balance of amount "+balance);
            }
        }
        else if(amt<0){
            System.out.println(name+" you cannot withdraw negative amount please choose positive amount ");
        }
        else{
            System.out.println(name+" zero is not a valid amount, it should be greater than zero");
        }
    }

}
public class Ex2 {
    public static void main(String[] args) {
        BankAccount b1= new BankAccount("Fiza",101, 20000);
        BankAccount b2 = new BankAccount("Isha", 102, 35000);
        BankAccount b3 = new BankAccount("Divyansh", 103, 200);
        //b3.withdraw(500);

        b1.deposit();
        //b1.withdraw();


    }
}
