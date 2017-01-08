
/**
 * Write a description of class BankAccount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.text.NumberFormat;

public class BankAccount
{
    public static void main (String[] args)
   {
      private final double Rate = 0.035; //This means the interest rate is 3.5%
      private long acctNumber;
      private double balance1, balance2;
      private String name;
       
      Account acct1 = new Account ("Joe Smith", 72354, 1000.00);
      Account acct2 = new Account ("Mary Smith", 69713, 1000000.00);
     
      acct1.deposit (247.35);
      acct2.deposit (234.99);

      System.out.println ("Joe Smith balance after deposit: " + acct1);
      System.out.println ("Mary Smith balance after withdrawal: " + acct2.withdraw (430.75, 1.50));
    }
    
    public BankAccount(String name, int acct, double balance)
    {
        personname = name
        acctnmbr = acct
        money = balance
        
    }
    
    public void makeDeposit(double amount)
    {
             
    }
    
    public void makeWithdrawal(double amount)
    {
    }
    
    public double getBalance()
    {
    }
    public String getName()
    {
    }
    public int getID()
    {
    }
    Public String toString()
    {
    }
    
}
