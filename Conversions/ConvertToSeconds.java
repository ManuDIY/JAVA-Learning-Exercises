
/**
 * This will be used to convert units other than seconds into seconds.
 * 
 * @author TJ
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class ConvertToSeconds
{
    public static void main (String[] args)
    {
        int hours, minutes, seconds;
        int total_seconds;
        
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print ("Enter the number of hours: ");
        hours = scan.nextInt();
        System.out.print ("Enter the number of minutes: ");
        minutes = scan.nextInt();
        System.out.print ("Enter the number of seconds: ");
        seconds = scan.nextInt();
        
        hours = hours * 3600;
        minutes = minutes * 60;
                
        total_seconds = hours + minutes + seconds;
        
        System.out.println ("Total Seconds: " + total_seconds);
    }    
}  