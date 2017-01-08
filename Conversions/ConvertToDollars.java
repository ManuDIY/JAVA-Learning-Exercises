
/**
 * This will be used to convert units other than seconds into seconds.
 * 
 * @author TJ
 * @version (a version number or a date)
 */


import java.util.Scanner;

public class ConvertToDollars
{
    public static void main (String[] args)
    {
        double quarters, dimes, nickels, pennies;
        double total_amount;
        
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print ("Enter the number of quarters: ");
        quarters = scan.nextInt();
        System.out.print ("Enter the number of dimes: ");
        dimes = scan.nextInt();
        System.out.print ("Enter the number of nickels: ");
        nickels = scan.nextInt();
        System.out.print ("Enter the number of pennies: ");
        pennies = scan.nextInt();
        
        quarters = quarters * .25;
        dimes = dimes * .1;
        nickels = nickels * .05;
        pennies = pennies * .01;
                
        total_amount = quarters + dimes + nickels + pennies;
        
        System.out.println ("This is equivalent to: " + total_amount);
    }    
}  