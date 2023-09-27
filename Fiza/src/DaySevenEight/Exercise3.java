package DaySevenEight;

public class Exercise3 {
    public static void main(String[] args) {
        //Saving Account object
        Saving s = new Saving(567889, 45000);
        //get saving accounts information
        s.info();
        //get balance of savings account
        System.out.println(s.getBalance());
        //deposit in savings account
        s.deposit(5000);
        //withdraw in savings account
        s.withdraw(31000);

        //Checking account object
        Checking c = new Checking(786790, 130000);
        c.info();
        //get balance of savings account
        System.out.println(s.getBalance());
        //deposit in savings account
        c.deposit(10000);
        //withdraw in savings account
        c.withdraw(50000);

    }
}
class Saving extends BankAccount{

    Saving(long accountNum, double balance) {
        super(accountNum, balance);
    }
    void deposit(long amt){
        long balance = (long) (getBalance() + amt);
        System.out.println("Your updated balance is "+balance);
    }
    void withdraw(long amt){
        if(amt<=30000) {
            long balance = (long) (getBalance() - amt);
            System.out.println("Your updated balance is = " + balance);
        }
        else{
            System.out.println("You cannot withdraw more than 30000, your saving account has restrictions");
        }
    }
    @Override
    void info(){
        System.out.println("Your Saving account's balance is = "+getBalance()+" and your account number is = "+getAccountNum());
    }
}
class Checking extends BankAccount{

    Checking(long accountNum, double balance) {
        super(accountNum, balance);
    }
    void deposit(long amt){
        long balance = (long) (getBalance() + amt);
        System.out.println("Your updated balance is "+balance);
    }
    void withdraw(long amt){
        long balance= (long) (getBalance()-amt);
        System.out.println("Your updated balance is = "+balance);
    }
    @Override
    void info(){
        System.out.println("Your Checking account's balance is = "+getBalance()+" and your account number is = "+getAccountNum());
    }
}
