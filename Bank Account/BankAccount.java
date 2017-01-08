
/**
 * Write a description of class BankAccount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.text.NumberFormat;

public class BankAccount
{

   private int acctnum;
   private String owner;
   private double initial;
   

   public static void main(String args[])
    {
        BankAccount joe = new BankAccount ("Joe Smith", 5643, 1000.0);
        joe.makeDeposit(247.35);
        
        BankAccount mary = new BankAccount ("Mary Smith", 1946, 1000000);
        mary.makeDeposit(235.99);
        mary.makeWithdrawal(1.00);
        
        System.out.println(joe);
        System.out.println(mary);
        
    }
    
   public BankAccount (String name, int acct, double balance)
   {
       owner = name;
       acctnum = acct;
       initial = balance; 
       
       
    }
    
    public void makeDeposit(double amount)
    {
      initial = initial + amount;
      
      
        
    }
    
    public void makeWithdrawal(double amount)
    {
        initial = initial - amount;
       
        
    }
    
    public double getBalance()
    {
        return initial;
        
    }
    
    public String getName()
    {
        return owner;
    }
    
    public int getID()
    {
        return acctnum;
    }
    
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return owner + "   " + acctnum + "   " + fmt.format(initial);
    }
}
