import java.util.Random;
import java.util.Scanner;
// Wasted too much time on this question (!_!)
public class ExerTwo {
    //Q. Implement a Java class called "BankAccount" that represents a simple bank account.
    // Include attributes for the account holder's name, account number, and balance.
    // Write methods for deposit and withdrawal. Test the class with various transactions.
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();
            System.out.println("Please create an account");
            BankAccount account1 = new BankAccount();
            System.out.print("Type your name: ");
            String name = sc.nextLine();
            account1.setName(name);
            account1.setAccountNo(rand.nextInt(1000000));

            System.out.println("Do you want to deposit any money. Type y for Yes and type n for No ");
            System.out.print("Type your Choice: ");
            char choice;
            int amount;

            choice = sc.next().charAt(0);
            switch (choice) {
                case 'y':
                case 'Y':
                    System.out.println("How much money you want to deposit?");
                    amount = sc.nextInt();
                    account1.deposit(amount);
                    break;
                case 'n':
                case 'N':
                    System.out.println();
                    System.out.println("Your net balance will be zero.");
                    account1.deposit(0);
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid choice, Your net balance will be zero.");
                    account1.deposit(0);

            }
            account1.accountDetails();

            do {
                System.out.println("_________________________________");
                System.out.println("Choose A for Withdrawing Money, B for Depositing Money, C for Knowing Account Balance, D for Checking Account Details & E(Case Sensitive) for Exit");
                System.out.println();
                System.out.print("Type your Choice: ");

                choice=sc.next().charAt(0);
                switch (choice){
                    case 'a':
                    case 'A':
                        System.out.print("How much Money you want to Withdraw: ");
                        amount = sc.nextInt();
                        System.out.println();
                        account1.withdraw(amount);
                        break;
                    case 'b':
                    case 'B':
                        System.out.print("How much Money you want to Deposit: ");
                        amount = sc.nextInt();
                        System.out.println();
                        account1.deposit(amount);
                        break;
                    case 'c':
                    case 'C':
                        account1.showBalance();
                        break;
                    case 'd':
                    case 'D':
                        account1.accountDetails();
                        break;
                    case 'E':
                        break;
                    default:
                        System.out.println("Invalid Choice, Try Again");
                        break;

                }
                System.out.println("----------------------------------");
            } while (choice !='E');



        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

class BankAccount {
    String accHolderName;
    long accountNo;
    int balance;

    void setName(String name) {
        this.accHolderName = name;
    }

    void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    void deposit(int depositedMoney) {
        this.balance += depositedMoney;
        System.out.println();
        System.out.println("Net Balance after deposit: " + this.balance);
    }

    void withdraw(int withdrewMoney) {
        int net_bal=  this.balance-withdrewMoney;
        if(net_bal<0){
            System.out.println();
            System.out.println("You Don't have enough balance to withdrew that money");
        }else{
            this.balance =net_bal;
            System.out.println();
            System.out.println("Net Balance after withdrawing money: " + this.balance);
        }

    }

    void showBalance() {
        System.out.println();
        System.out.println("Remaining Balance: " + this.balance);

    }
    void accountDetails(){
        System.out.println();
        System.out.print("Account Holder Name: " + this.accHolderName);
        System.out.print(" A/C no.: "+this.accountNo);
        System.out.println(" Balance: "+this.balance);

    }

}