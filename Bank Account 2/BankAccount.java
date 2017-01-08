
import java.util.*;
import java.text.NumberFormat;

public class BankAccount
{
    public String customer = "TJ Zimmerman";
    public double balance;
    public final double rate = 0.05;
    NumberFormat fmt1 = NumberFormat.getCurrencyInstance();

    public BankAccount (String name)
    {
        //name = "Bob";
        balance = 50.00;
        System.out.println("Welcome to " + customer + "'s bank account. His current  balance is: " + fmt1.format(balance));
    }

    public BankAccount (String name, double amount)
    {
        name = "TJ Zimmerman";

        balance = amount;
        System.out.println("Welcome to " + customer + "'s bank account. His balance is: " + fmt1.format(balance));
    }

    public double getBalance ()
    {
        return balance;   
    }

    public void deposit (double amount)
    {
        balance += amount;
        System.out.println("You just made a deposit of " + amount);
    }

    public void withdraw (double amount)
    {
        if (amount > balance){
            System.out.println ("Not enough funds. Please try again later.");}
        else {
            balance -= amount;   
            System.out.println (amount + "has been subtracted from your account."); 
        }
    }

    public void printStatement()
    {
        System.out.println("Customer: " + customer);

        System.out.println("Balance: " + balance);
    }

    public void applyOneMonthInterest()
    {
        //System.out.println("Balance after one month's interest: ");

        balance += balance*(rate/12);
    }

    public static void main(String [] args)
    {   
        BankAccount b = new BankAccount("TJ Zimmerman", 100.00);
        b.deposit(20.0);
        b.getBalance();
        b.applyOneMonthInterest();
        b.printStatement();
    }
}

 