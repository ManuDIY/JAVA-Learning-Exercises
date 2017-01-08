import java.text.DecimalFormat;
// import java.util.*;
public class BankAcount
{

    public String customer;
    public double balance;
    public final double rate = 0.05 ;

    DecimalFormat fmt = new DecimalFormat("0.##");

    public BankAcount(String name)
    {
        customer = name;

        balance = 50.00 ;

        System.out.println("Welcome to the bank "+ customer +" your balance is: "+ balance);

    }

    public BankAcount( String name, double amount)
    {
        customer = name;

        balance = amount ;

        System.out.println("Welcome to the bank "+ customer +" your balance is: "+ balance);
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        System.out.println("After depositing: " + amount);

        if(amount < 0)
            System.out.println("You can only deposit a positive number.");
        else

            balance += amount;

        System.out.println("Your new balanace is:" + fmt.format( balance));
    }

    public void withdraw (double amount)
    {
        System.out.println("After withdrawing:" + amount);

        if(amount > balance )
        {
            System.out.println("Insufficient: You only have " + fmt.format( balance) + " in your account.");
        }
        else if(amount < 0)
        {
            System.out.println("You can only withdraw a positive amount!");
        }
        else
            balance -= amount;

        System.out.println("Your new balanace is: " + fmt.format( balance));
    }

    public void printStatement()
    {
        System.out.println("CIS 162 Bank Account Summary");
        System.out.println("**********************************");
        System.out.println("Balanace: " + fmt.format( balance));
        System.out.println("Customer: " + customer);

    }

    public void applyOneMonthInterest()
    {
        System.out.println("After applying interest for one month");

        balance += balance*(rate/12);

        System.out.println("Your new balanace is: " + fmt.format( balance));

    }

    public void applyInterest( int months )
    {

        for(int i = 0; i < months; i++)
        {
            balance = ( balance * ( 1.004167 ) );
        }

        System.out.println( "After applying interest for " + months + " months" );
        System.out.println("Your Current balance is : " + fmt.format( balance ) );
        System.out.println("");
    }

    public static void main(String [] args)
    {

        BankAcount b = new BankAcount( "Bob" , 100.00 );

        b.applyOneMonthInterest();

        System.out.println();
        System.out.println();

        b.withdraw(30.25);
        System.out.println();
        System.out.println();

        b.applyInterest(6);
        System.out.println();
        System.out.println();

        b.deposit(229.40);
        System.out.println();
        System.out.println();

        b.withdraw(10000.0);
        System.out.println();
        System.out.println();

        b.deposit(-10.25);
        System.out.println();
        System.out.println();

        b.withdraw(-10.25);
        System.out.println();
        System.out.println();
        
        b.printStatement();
    }
}