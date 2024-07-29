public class SavingsAccount extends BankAccount{
    private static final double RATE = 2.5;
    private static int savingsNumber = 0;
    private static String accountNumber;
    
    public SavingsAccount(String name, double balance ){
        super(name, balance); //Calls super constructor
        this.savingsNumber = savingsNumber++;
        this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
        
    }
    
    public SavingsAccount(SavingsAccount originalAccount, double initalBalance){
        super(originalAccount, initalBalance); //Calls super constructor
        this.savingsNumber = originalAccount.savingsNumber + 1;
        this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
    }
    
    public void postInterest(){
        double montlyInterestRate = RATE / 12 / 100;
        double interestAmount = getBalance() * montlyInterestRate;
        deposit(interestAmount);
    }
    
    public String getAccountNumber(){
        return accountNumber;
    }
    
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    
}
