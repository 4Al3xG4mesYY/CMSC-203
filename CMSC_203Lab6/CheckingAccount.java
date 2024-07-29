public class CheckingAccount extends BankAccount{
    private static final double FEE = 0.15;
    
    public CheckingAccount(String name, double amount)
    {
        super(name, amount); //Calls super constructor
        String currentAccountNumber = getAccountNumber(); //Calls mutator methods to get account number
        String modifiedAccountNumber = currentAccountNumber + "-10"; //concatenates 
        setAccountNumber(modifiedAccountNumber);
    }
    
    public boolean withdraw(double amount){
        double totalAmount = amount + FEE;
        return super.withdraw(totalAmount);
    }
}