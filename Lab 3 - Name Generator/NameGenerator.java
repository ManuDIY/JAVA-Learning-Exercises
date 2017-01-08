
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.util.Random;

public class NameGenerator
{
    public static void main (String[] args)
    {
        String first, last, login, last5, first1;
        int rnumber;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print ("Enter first name: ");
        first = scan.nextLine();
        System.out.print ("Enter last name: "); 
        last = scan.nextLine();
        
        last5 = last.substring(0,5);
        first1 = first.substring(0,1);
        
        Random generator = new Random();
        rnumber = generator.nextInt(90) + 10;
                
        login = last5 + first1 + rnumber;
        
        
        System.out.print ("Your username is: " +login); 
    }
}
