
/**
 * This will be used to convert units other than seconds into seconds.
 * 
 * @author TJ
 * @version (a version number or a date)
 */


import java.util.Scanner;

public class ConvertFromSeconds
{
    public static void main (String[] args)
    {
        int seconds, hours, minutes;
  
                
        Scanner scan = new Scanner (System.in);
        
        System.out.print ("Enter the number of seconds: ");
        seconds = scan.nextInt();
               
        hours = seconds / 3600;
        minutes = (seconds % 3600) / 60;
        seconds = (seconds % 60) % 60;
        
        
        System.out.println ("Total time: " + hours + " Hours, " + minutes + " Minutes and " + seconds + " Seconds " );
    }    
}  