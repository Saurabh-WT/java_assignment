package DaySevenEight;

public class Exercise9 {
    public static void main(String[] args) {
        //Saving account information
        SavingsAccount s = new SavingBankAccounts(567890, 35000);
        s.balanceInquiry();
        s.withdraw(31000);
        s.deposit(5000);


        //Checking account information
        CheckingAccount c = new CheckingBankAccounts(678900, 45000);
        c.balanceInquiry();
        c.deposit(20000);
        c.withdraw(40000);
    }
}
interface SavingsAccount{
    void deposit(long amt);
    void withdraw(long amt);
    void balanceInquiry();


}
interface CheckingAccount{
    void deposit(long amt);
    void withdraw(long amt);
    void balanceInquiry();

}
class SavingBankAccounts implements SavingsAccount{
    long balance;
    long accountNum;
    SavingBankAccounts( long accountNum, long balance){
        this.balance=balance;
        this.accountNum=accountNum;
    }

    @Override
    public void deposit(long amt) {
        balance =  balance+ amt;
        System.out.println("Your updated balance is "+balance);
    }

    @Override
    public void withdraw(long amt) {
        if(amt<=30000) {
            balance = balance - amt;
            System.out.println("Your updated balance is " + balance);
        }
        else{
            System.out.println("Your saving account has restrictions, you can't withdraw more than 30000 ");
        }

    }

    @Override
    public void balanceInquiry() {
        System.out.println("Your balance of Account number "+accountNum+" is = "+balance);

    }
}
class CheckingBankAccounts implements CheckingAccount{
    long balance;
    long accountNum;
    CheckingBankAccounts( long accountNum, long balance){
        this.balance=balance;
        this.accountNum=accountNum;
    }

    @Override
    public void deposit(long amt) {
        balance =  balance+ amt;
        System.out.println("Your updated balance is "+balance);
    }

    @Override
    public void withdraw(long amt) {
        if(amt<balance) {
            balance = balance - amt;
            System.out.println("Your updated balance is " + balance);
        }
        else{
            System.out.println("Your balance is "+balance+" enter amount less than balance to continue the operation");
        }
    }

    @Override
    public void balanceInquiry() {
        System.out.println("Your balance of Account number "+accountNum+" is = "+balance);

    }
}