public class ExerciseNine {
    //    Exercise 9: Banking Interfaces
//    Design a Java program that models a banking system using interfaces. Create interfaces for "SavingsAccount" and
//    "CheckingAccount" with methods for deposit, withdrawal, and balance inquiry. Implement these interfaces in
//    concrete classes.
    public static void main(String[] args) {
        System.out.println("Bank Account Behaviour");
        ConcreteSavingAccount savAcc= new ConcreteSavingAccount("Ayush",12436523,10000.0,3.5 );
        System.out.println("Saving Account ");
        savAcc.accountDetails();
        savAcc.deposit(10000);
        savAcc.addInterest();
        savAcc.withdraw(20000);
        System.out.println();
        System.out.println("After Deposit and withdrawal of Saving Account");
        savAcc.accountDetails();


        System.out.println();
        ConcreteCheckingAccount chkAcc= new ConcreteCheckingAccount("Yogesh",12436523,50000.0,10000);
        System.out.println("Checking Account ");
        chkAcc.accountDetails();
        chkAcc.deposit(2000);
        chkAcc.withdraw(50000);
        chkAcc.withdraw(300);
        System.out.println();
        System.out.println("After Deposit and withdrawal of Checking Account");
        chkAcc.accountDetails();

    }

}

class BankAccount2 {
    private String accHolderName;
    private long accountNo;
    private double balance;

    BankAccount2(String accHolderName,long accountNo, Double balance) {
        this.accHolderName=accHolderName;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }



    void deposit(int depositedMoney) {
        this.balance += depositedMoney;
        System.out.println();
        System.out.println("Net Balance after deposit: " + this.balance);
    }
    void deposit(double depositedMoney) {
        this.balance += depositedMoney;
        System.out.println();
        System.out.println("Net Balance after deposit: " + this.balance);
    }

    void withdraw(int withdrewMoney) {
        double net_bal;
        net_bal = this.balance - withdrewMoney;
        if (net_bal < 0) {
            System.out.println("You Don't have enough balance to withdrew that money");
        } else {
            this.balance = net_bal;
            System.out.println("Net Balance after withdrawing money: " + this.balance);
        }

    }



    void accountDetails() {

        System.out.print("Account Holder Name: " + this.accHolderName);
        System.out.print(" A/C no.: " + this.accountNo);
        System.out.println(" Balance: " + this.balance);
    }

}

interface SavingAccount1 {
    void addInterest();
}

interface CheckingAccount1 {
    void withdraw(int amount);
}

class ConcreteSavingAccount extends BankAccount2 implements SavingAccount1 {
    private double interestRate;

    ConcreteSavingAccount(String accHolderName,long accountNo, Double balance, double interestRate) {
        super(accHolderName,accountNo, balance);
        this.interestRate = interestRate;
    }

    public void addInterest(){
        double interestAmount=getBalance()*interestRate/100;
        deposit(interestAmount);
        System.out.println("Interest amount added  "+ interestAmount);
    }


}

class ConcreteCheckingAccount extends BankAccount2 implements CheckingAccount1{
    private double minBalance;

    ConcreteCheckingAccount(String accHolderName,long accountNo, Double balance, double minBalance) {
        super(accHolderName,accountNo, balance);
        this.minBalance = minBalance;
    }

    @Override
    public void withdraw(int withdrewMoney) {
        if (minBalance <= getBalance()-withdrewMoney) {
            super.withdraw(withdrewMoney);
        }else {
            System.out.println("Amount exceeded minimum balance. can't Withdraw");
        }
    }
}