package DaySevenEight;
//Exercise 3: Encapsulation Practice
//Design a Java class representing a bank account with private fields for balance and account number.
// Implement methods to deposit and withdraw money while ensuring encapsulation.
public class Practice3 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(4567, 25000);
        System.out.println(b.getAccountNum());
        b.info();
        b.withdraw(30000);
        b.deposit(600);

    }
}
class BankAccount{
    private double balance;
    private long accountNum;
    BankAccount(long accountNum, double balance){
        this.balance=balance;
        this.accountNum=accountNum;
    }
    public double getBalance(){
        return balance;
    }
    public long getAccountNum(){
        return accountNum;
    }
    void deposit(long amt){
        balance+=amt;
        System.out.println("Your updated balance is "+balance);
    }
    void withdraw(long amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Your updated balance is = " + balance);
        }
        else{
            System.out.println("You do not have insufficient balance, your current balance is = "+balance);
        }
    }
    void info(){
        System.out.println("Your balance is = "+balance+" of account number = "+accountNum);
    }
}
