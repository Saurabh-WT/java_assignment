public class ExerciseThree {
    //Exercise 3: Bank Account Inheritance
    //Extend the bank account example from Day 8 to include different types of accounts (e.g., savings, checking)
    // with specific behaviors. Use inheritance to model these account types.
    public static void main(String[] args) {

        System.out.println("Bank Account Behaviour");
        SavingAccount savAcc= new SavingAccount("Ayush",12436523,10000.0,3.5 );
        System.out.println("Saving Account");
        savAcc.accountDetails();
        savAcc.deposit(10000);
        savAcc.addInterest();
        savAcc.withdraw(20000);
        System.out.println();
        System.out.println("After Deposit and withdrawal of Saving Account");
        savAcc.accountDetails();


        System.out.println();
        CheckingAccount chkAcc= new CheckingAccount("Yogesh",12436523,50000.0,10000);
        System.out.println("Checking Account");
        chkAcc.accountDetails();
        chkAcc.deposit(2000);
        chkAcc.withdraw(50000);
        chkAcc.withdraw(300);
        System.out.println();
        System.out.println("After Deposit and withdrawal of Checking Account");
        chkAcc.accountDetails();

    }
}

class BankAccount1 {
    private String accHolderName;

    private long accountNo;
    private double balance;


    BankAccount1(String accHolderName,long accountNo, Double balance) {
        this.accHolderName=accHolderName;
        this.accountNo = accountNo;
        this.balance = balance;
    }



    void deposit(int depositedMoney) {
        this.balance += depositedMoney;
        System.out.println("Net Balance after deposit: " + this.balance);
    }

    void deposit(double depositedMoney) {
        this.balance += depositedMoney;

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

    void showBalance() {
        System.out.println("Remaining Balance: " + this.balance);
    }

    public double getBalance() {
        return balance;
    }

    void accountDetails() {

        System.out.print("Account Holder Name: " + this.accHolderName);
        System.out.print(" A/C no.: " + this.accountNo);
        System.out.println(" Balance: " + this.balance);
    }

}

class SavingAccount extends BankAccount1 {
    private double interestRate;

    SavingAccount(String accHolderName,long accountNo, Double balance, double interestRate) {
        super(accHolderName,accountNo, balance);
        this.interestRate = interestRate;
    }

    void addInterest(){
        double interestAmount=getBalance()*interestRate/100;
        deposit(interestAmount);
        System.out.println("Interest amount added  "+ interestAmount);
    }


}

class CheckingAccount extends BankAccount1 {
    private double minBalance;

    CheckingAccount(String accHolderName,long accountNo, Double balance, double minBalance) {
        super(accHolderName,accountNo, balance);
        this.minBalance = minBalance;
    }

    @Override
    void withdraw(int withdrewMoney) {
        if (minBalance <= getBalance()-withdrewMoney) {
            super.withdraw(withdrewMoney);
        }else {
            System.out.println("Amount exceeded minimum balance. can't Withdraw");
        }
    }
}